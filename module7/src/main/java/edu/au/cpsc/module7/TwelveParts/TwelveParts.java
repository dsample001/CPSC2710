package edu.au.cpsc.module7.TwelveParts;

import java.io.*;

/**
 * Program clones selected Fanuc .ls program to the othe 11 parts that are in this project.
 *
 * Module 07
 * @author Daniel Sample - CPSC 2710
 * @version 2023.10.05
 */
public class TwelveParts {

    public TwelveParts() {
    }


    public void createFiles(String openFile) {
        try {
            BufferedReader bfReader = new BufferedReader((new FileReader((openFile))));

            // Process program header.
            // Program name.
            String line;
            line = bfReader.readLine();
            String currProgram = getProgramName(openFile);
            String currPath = getProgramPath(openFile);
            System.out.println("Current program name. " + currProgram);
            System.out.println("Current program path. " + currPath);



            for (int i = 2; i <= 12; i++) {

                // Build path and program name.
                String tempPath = currPath + "\\" + currProgram.toLowerCase() + "_";
                tempPath += i + ".ls";

                // Create BufferedWriter.
                BufferedWriter bfWriter = new BufferedWriter((new FileWriter((tempPath))));

                // Generate and write line one with program name.
                String lineOne = "/PROG  " + getProgramName(tempPath);
                bfWriter.write(lineOne);

                // Transfer over rest of header.
                while ((line = bfReader.readLine()) != null) {
                    //if line.contains()
                bfWriter.write("\n");
                    bfWriter.write(line);
                }

                bfWriter.close();
            }

            bfReader.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * getProgramName method, returns the program name in uppercase without the extension.
     * @param program for the path and file naame of the file.
     * @return String programName
     */
    private String getProgramName(String program) {
        File programFile = new File(program);

        // Get program name.
        String programName = programFile.getName().toUpperCase();

        // Remove extension.  I am not checking for multiple '.' since a program name cannot contain '.'
        programName = programName.substring(0, programName.indexOf("."));
        return programName;
    }

    private String getProgramPath(String program) {
        File programFile = new File(program);

        // Get program path.
        String programPath = programFile.getParent();
        return programPath;
    }

}
