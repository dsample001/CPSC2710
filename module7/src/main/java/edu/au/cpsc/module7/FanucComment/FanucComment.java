package edu.au.cpsc.module7.FanucComment;

import javafx.stage.FileChooser;

import java.io.*;

public class FanucComment {



    public FanucComment() {

    }

    public void createFile(String openFile, String fileToCreate) {

        System.out.println("Printed from sub program!");
        System.out.println("File to open: " + openFile);
        System.out.println("File to create: " + fileToCreate);

        try {

            BufferedReader bfReader = new BufferedReader((new FileReader(openFile)));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileToCreate));

            // Process program header.
            //Change first line that contains program name.


            // Find program start section and add comments to all non motion statements.


            // Find position data section and copy lines to new file.
            String line;
            while((line = bfReader.readLine()) != null) {



            }
            bfWriter.write("Test!");
            bfWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }





    }




