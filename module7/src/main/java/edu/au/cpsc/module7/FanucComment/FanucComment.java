package edu.au.cpsc.module7.FanucComment;

import javafx.stage.FileChooser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FanucComment {



    public FanucComment() {

    }

    public void createFile(String opentFile, String fileToCreate) {

        System.out.println("Printed from sub program!");
        System.out.println("File to open: " + opentFile);
        System.out.println("File to create: " + fileToCreate);

        try {
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileToCreate));
            bfWriter.write("Test!");
            bfWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





    }




