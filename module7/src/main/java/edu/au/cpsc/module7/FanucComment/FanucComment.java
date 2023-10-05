package edu.au.cpsc.module7.FanucComment;

import java.io.*;

/**
 * Program creates a Fanuc .ls program with all non motion statements commented out.  This makes import into Delmia
 * simulation software easier.
 *
 * Module 07
 * @author Daniel Sample - CPSC 2710
 * @version 2023.10.04
 */
public class FanucComment {

    /**
     * FanucComment constructor.
     *
     */
    public FanucComment() {
    }

    /**
     * createFile method, reads in file and comments out all non motion statements.
     *
     * @param openFile path for the file to read in.
     * @param fileToCreate path for the file to create.
     */
    public void createFile(String openFile, String fileToCreate) {

        try {
            BufferedReader bfReader = new BufferedReader((new FileReader(openFile)));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileToCreate));

            // Process program header.
            //Change first line that contains program name.
            String line;
            line = bfReader.readLine();
            bfWriter.write(setPrgramName(fileToCreate));

            // Copy rest of program header over.
            boolean header = true;
            while (header) {
                line = bfReader.readLine();
                if (line.equals("/MN")) {  //The program section begins with /MN.
                    header = false;
                }
                bfWriter.write("\n" + line);
            }

            // Program section, Add comments to all non motion statements.
            //bfWriter.write("\nThis is the program section");
            boolean positionStart = false;  // Flag for end of program section.
            while ((positionStart == false)) {
                line = bfReader.readLine();

                if (line.equals("/POS")) {
                    positionStart = true;
                    bfWriter.write("\n" + line);
                }
                else {
                    // Motion statement if starts with a J (Joint) or L (Linear).
                    if ((line.length() > 6) & (line.charAt(5) == 'L') | (line.charAt(5) == 'J')) {
                        //System.out.println("\n position" + line);
                        bfWriter.write("\n" + line);
                    }
                    else {
                        // Line already commented if has an ! at position 7.
                        if ((line.length() > 8) & (line.charAt(7) == '!')) {
                            //System.out.println("\n comment" + line);
                            bfWriter.write("\n" + line);
                        }
                        else {
                            // Blank line if there is a ; at position 8.
                            if ((line.length() > 8) & (line.charAt(8) == ';')) {
                                //System.out.println("\n blank" + line);
                                bfWriter.write("\n" + line);
                            }
                            // Add a comment at position 7.
                            else {
                                line = line.substring(0, 7) + "!" + line.substring(7);
                                //System.out.println("\n" + line);
                                bfWriter.write("\n" + line);
                            }
                        }
                    }
                }
            }


            // Find position data section and copy lines to new file.
           //bfWriter.write("\nThis is the position section.");
            boolean programEnd = false;
            while (((line = bfReader.readLine()) != null) & (programEnd == false)) {
                if (line.equals("/END")) {
                    programEnd = true;
                }
                bfWriter.write("\n" + line);
            }
            bfWriter.close();
            bfReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * setProgramName method, creates the first line of the program containing the new program name.
     *
     * @param fileToCreate for the path and file name of the new file to create.
     * @return String firstLine
     */
    private String setPrgramName(String fileToCreate) {
        File newFile = new File(fileToCreate);
        String programName;

        // Set program name to uppercase.
        programName = newFile.getName().toUpperCase();

        // Remove file extension.  I am not checking for multiple '.' since a program name cannot contain '.'
        programName = programName.substring(0, programName.indexOf("."));
        String firstLine = "/PROG  " + programName;
        return firstLine;
    }
}




