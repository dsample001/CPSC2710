package edu.au.cpsc.module2;

public class SeatReservation {

    private String flightDesignator;
    private java.time.LocalDate flightDate;
    private String firstName;
    private String lastName;
    private int numberOfBags;
    private boolean flyingWithInfant;
    
public String getFlightDesignator() {
return flightDesignator;
}

public void setFlightDesignator(String fd) {
    if (fd == null) {
        throw new IllegalArgumentException("Flight designator cannot be null");
    }
    if ((fd.length() < 4) || (fd.length() > 6)) {
        throw new IllegalArgumentException("Invalid flight designator length");
    }

    this.flightDesignator = fd;
}

public java.time.LocalDate getFlightDate() {
return flightDate;
}

public void setFlightDate(java.time.LocalDate Date) {
    flightDate = Date;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String fn) {
    firstName = fn;
}

public String getLastName() {
return lastName;
}

public void setLastName(String ln) {
    lastName = ln;
}

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numBags) {
    numberOfBags = numBags;
    }
    public boolean isFlyingWithInfant() {
    return flyingWithInfant;
}

public void makeFlyingWithInfant() {
    flyingWithInfant = true;
}

public void makeNotFlyingWithInfant() {
    flyingWithInfant = false;
}

// Not sure if this is correct as I may have taken the instructions too literal.
public String toString() {
    String output = "SeatReservation{flightDesignator=" + flightDesignator;
    output += ",flightDate=" + flightDate;
    
    output += ",firstName=";

    if (firstName == null) {
        output += "null";
    } 
    else {
        output += getFirstName();
    }

    output += ",lastName=";

    if (lastName == null) {
        output += "null";
    } 
    else {
        output += getLastName();
    }

    output += ",numberOfBags=" + getNumberOfBags();

    output += ",flyingWithInfant=" + isFlyingWithInfant();

    output += "}";
    return output;
}
}
