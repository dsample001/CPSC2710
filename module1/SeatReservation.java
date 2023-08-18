public class SeatReservation {

    private String flightDesignator;
    private java.time.LocalDate flightDate;
    private String firstName;
    private String lastName;
    
public String getFlightDesignator() {
return "";
}

public void setFlightDesignator(String fd) {
}

public java.time.LocalDate getFlightDate() {
return flightDate;
}

public void setFlightDate(java.time.LocalDate Date) {
}

public String getFristName() {
return "";
}

public void setFirstName(String fn) {
}

public String getLastName() {
return "";
}

public void setLastName(String ln) {
}

public String toString() {
    String output = "SeatReservation{flightDesignator=" + flightDesignator;
    output += ", flightDate=" + flightDate;
    output += ", ";

    if (firstName.equals(null)) {
        output += "null";
    } 
    else {
        output += firstName;
    }

    if (lastName.equals(null)) {
        output += "null";
    } 
    else {
        output += lastName;
    }

    output += "}";
    return output;
}
}