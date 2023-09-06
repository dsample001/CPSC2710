package edu.au.cpsc.module3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String ident;
    private String type;
    private String name;
    private Integer elevationFeet;
    private String continent;
    private String isoCountry;
    private String isoRegion;
    private String municipality;
    private String gpsCode;
    private String iataCode;
    private String localCode;
    private double coordinatesLongitude;
    private double coordinatesLatitude;
    //private static List<Airport> airportList = new ArrayList<>();

    public Airport(String ident, String type, String name, Integer elevationFeet, String continent,
                   String isoCountry, String isoRegion, String municipality, String gpsCode, String iataCode,
                   String localCode,double coordinatesLongitude, double coordinatesLatitude) {

        setIdent(ident);
        setType(type);
        setName(name);
        setElevationFeet(elevationFeet);
        setContinent(continent);
        setIsoCountry(isoCountry);
        setIsoRegion(isoRegion);
        setMunicipality(municipality);
        setGpsCode(gpsCode);
        setIataCode(iataCode);
        setLocalCode(localCode);
        setCoordinatesLongitude(coordinatesLongitude);
        setCoordinatesLatitude(coordinatesLatitude);

    }

    public static List<Airport> readAll() throws IOException {

    String fileName = "C:\\Users\\Dad\\Documents\\My Classes\\Auburn\\CPSC 2710 Software Construction\\CPSC2710\\module3\\src\\main\\resources\\edu\\au\\cpsc\\module3/airport-codes_csv.csv";
    BufferedReader fileInput = new BufferedReader(new FileReader(fileName));

    String line;

    List<Airport> tempAirportList = new ArrayList<>();

    boolean firstLine = true;

    while ((line = fileInput.readLine()) != null) {

        // If true then skip first line of column headers.
        if (firstLine) {
            firstLine = false;
                    }
        else {
            String[] lineArray;
            lineArray = line.split(",");

            String tempIdent = lineArray[0];
            String tempType = lineArray[1];
            String tempName = lineArray[2];

            // parse elevation to handle null value in file.
            int tempElevationFeet = 0;
            if (!lineArray[3].isEmpty()) {
                tempElevationFeet = Integer.parseInt(lineArray[3]);
            }

            String tempContinent = lineArray[4];
            String tempIsoCountry = lineArray[5];
            String tempIsoRegion = lineArray[6];
            String tempMunicipality = lineArray[7];
            String tempGpsCode = lineArray[8];
            String tempIataCode = lineArray[9];
            String tempLocalCode = lineArray[10];

            //parse coordinates.
            String temp = lineArray[11].substring(1);
            double tempCoordinatesLongitude = Double.parseDouble(temp);

            temp = lineArray[12].substring(0, lineArray[12].length()-1);
            double tempCoordinatesLatitude = Double.parseDouble(temp);

            Airport apt = new Airport(tempIdent, tempType, tempName, tempElevationFeet, tempContinent,
                    tempIsoCountry, tempIsoRegion, tempMunicipality, tempGpsCode, tempIataCode, tempLocalCode,
                    tempCoordinatesLongitude, tempCoordinatesLatitude);

            tempAirportList.add(apt);
        }

    }
        return tempAirportList;
    }


    /**
     * findAirportIdent method, finds airport in airportList based on indent.
     * @param identIn for ident
     * @return Airport
     */
    public static Airport findAirportIdent(List<Airport> airportList, String identIn) {
        String identCurrent;
        int index = 0;

        // Check id ArrayList is empty.
        if (airportList.size() == 0) {
            return null;
        }

        // Check for Airport ident in Airport ArrayList.
        while (index <= (airportList.size() - 1)) {
            identCurrent = airportList.get(index).getIdent();

            if (identIn.equals(identCurrent)) {
                return airportList.get(index);
            }
            index++;
        }
        return null;
}

    public static Airport findAirportIata(List<Airport> airportList, String iataIn) {
        String iataCurrent;
        int index = 0;

        // Check id ArrayList is empty.
        if (airportList.size() == 0) {
            return null;
        }

        // Check for Airport ident in Airport ArrayList.
        while (index <= (airportList.size() - 1)) {
            iataCurrent = airportList.get(index).getIataCode();

            if (iataIn.equals(iataCurrent)) {
                return airportList.get(index);
            }
            index++;
        }
        return null;
    }

    public static Airport findAirportLocalCode(List<Airport> airportList, String localCodeIn) {
        String localCodeCurrent;
        int index = 0;

        // Check id ArrayList is empty.
        if (airportList.size() == 0) {
            return null;
        }

        // Check for Airport ident in Airport ArrayList.
        while (index <= (airportList.size() - 1)) {
            localCodeCurrent = airportList.get(index).getLocalCode();

            if (localCodeIn.equals(localCodeCurrent)) {
                return airportList.get(index);
            }
            index++;
        }
        return null;
    }


    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

          public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getElevationFeet() {
        return elevationFeet;
    }

    public void setElevationFeet(Integer elevationFeet) {
        this.elevationFeet = elevationFeet;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public String getIsoRegion() {
        return isoRegion;
    }

    public void setIsoRegion(String isoRegion) {
        this.isoRegion = isoRegion;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getGpsCode() {
        return gpsCode;
    }

    public void setGpsCode(String gpsCode) {
        this.gpsCode = gpsCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode(String localCode) {
        this.localCode = localCode;
    }

    public double getCoordinatesLongitude() {
        return coordinatesLongitude;
    }

    public void setCoordinatesLongitude(double coordinatesLongitude) {
        this.coordinatesLongitude = coordinatesLongitude;
    }

    public double getCoordinatesLatitude() {
        return coordinatesLatitude;
    }

    public void setCoordinatesLatitude(double coordinatesLatitude) {
        this.coordinatesLatitude = coordinatesLatitude;
    }
}
