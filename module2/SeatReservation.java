public class SeatReservation {

    private String flightDesignator;
    private java.time.LocalDate flightDate;
    private String firstName;
    private String lastName;
    
public String getFlightDesignator() {
return flightDesignator;
}

public void setFlightDesignator(String fd) {
    if (fd == null) {
        throw new IllegalArgumentException("flight designator cannot be null");
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

    output += "}";
    return output;
}
}
