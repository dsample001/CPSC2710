package edu.au.cpsc.module7.TwelveParts;

import java.io.*;

/**
 * Program clones selected Fanuc .ls program to the othe 11 parts that are in this project.
 * <p>
 * Module 07
 *
 * @author Daniel Sample - CPSC 2710
 * @version 2023.10.05
 */
public class TwelveParts {

    /**
     * TwelveParts constructor.
     *
     */
    public TwelveParts() {
    }

    /**
     * createFiles method, reads in file and creates 11 other part programs.
     *
     * @param openFile path for the file to read in.
     */
    public void createFiles(String openFile) {
        try {
            for (int i = 2; i <= 12; i++) {
                BufferedReader bfReader = new BufferedReader((new FileReader((openFile))));

                // Process program header.
                // Program name.
                String line;
                line = bfReader.readLine();
                String currProgram = getProgramName(openFile);
                String currPath = getProgramPath(openFile);

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

                    // Handle LOAD_USER_FRAME(#) statement.
                    if (line.contains("CALL LOAD_USER_FRAME(")) {
                        line = line.substring(0, line.indexOf("(") + 1);
                        line = line + i + ") ;";
                    }

                    // Handle CALL_MOVE_CART#PART# statement.
                    if (line.contains("CALL MOVE_CART")) {
                        line = line.substring(0, line.indexOf("T") + 1);
                        if (i < 7) {  // Part 2-6 on Cart 1.
                            line = line + 1 + "PART" + i + "    ;";
                        } else {  //Part 1 - 6 on Cart 2.
                            line = line + 2 + "PART" + (i - 6) + "    ;";
                        }
                    }

                    // Handle FLOW_CHECK(#) statement.
                    if (line.contains("CALL FLOW_CHECK(")) {
                        line = line.substring(0, line.indexOf("(") + 1);
                        line = line + (12 + i) + ") ;";
                    }

                    // Handle ERROR_CHECK(#) statement.
                    if (line.contains("CALL ERROR_CHECK(")) {
                        line = line.substring(0, line.indexOf("(") + 1);
                        line = line + (12 + i) + ") ;";
                    }

                    // Handle move PR[##] statement.  Also removing the PR[] comment from statement.
                    if (line.contains("J PR[")) {
                        line = line.substring(0, line.indexOf("[") + 1);
                        line = line + (92 + i) + "] 10% FINE    ;";
                    }

                    // Write line to new program.
                    bfWriter.write("\n");
                    bfWriter.write(line);

                }
                // Close buffered reader and writer.
                bfWriter.close();
                bfReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * getProgramName method, returns the program name in uppercase without the extension.
     *
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

    /**
     * getProgramPath method, returns the program directory path.
     *
     * @param program for the path and file naame of the file.
     * @return String program path.
     */
    private String getProgramPath(String program) {
        File programFile = new File(program);

        // Return program path.
        return programFile.getParent();
    }

}
