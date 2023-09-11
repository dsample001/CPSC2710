package edu.au.cpsc.module4;

import java.io.*;

public class Db {

    public static final File DEFAULT_FILE = new File("scheduledflights.dat");

    private static AirlineDatabase airlineDatabase = null;

    public static AirlineDatabase getAirlineDatabase() {
        // lazy initialization
        if (airlineDatabase == null) {
            airlineDatabase = loadDatabase();
        }
            return airlineDatabase;
        }

        private static AirlineDatabase loadDatabase() {
            try (InputStream is = new FileInputStream(DEFAULT_FILE)) {
                return AirlineDatabaseIO.load(is);
            } catch (IOException | ClassNotFoundException ex) {
                return new AirlineDatabase();
            }
        }

        public static void saveDatabase() {
            try (OutputStream os = new FileOutputStream(DEFAULT_FILE)) {
                AirlineDatabaseIO.save(getAirlineDatabase(), os);
            } catch (IOException ex) {
                System.err.println("Error saving database: " + DEFAULT_FILE);
                ex.printStackTrace();
                System.exit(-1);
            }
        }
    }

