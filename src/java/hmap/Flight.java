package hmap;
// Generated Sep 26, 2016 6:20:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Flight generated by hbm2java
 */
public class Flight  implements java.io.Serializable {


     private FlightId id;
     private int totalPassengers;
     private int totalCrew;
     private String arrivalPort;
     private String departurePort;
     private Date dtFlightArrDate;
     private Date dtFlightDepDate;
     private String flightDirection;
     private String messageType;
     private Set passengers = new HashSet(0);
     private Set crews = new HashSet(0);

    public Flight() {
    }

	
    public Flight(FlightId id, int totalPassengers, int totalCrew, String arrivalPort, String departurePort, Date dtFlightArrDate, Date dtFlightDepDate, String flightDirection, String messageType) {
        this.id = id;
        this.totalPassengers = totalPassengers;
        this.totalCrew = totalCrew;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;
        this.dtFlightArrDate = dtFlightArrDate;
        this.dtFlightDepDate = dtFlightDepDate;
        this.flightDirection = flightDirection;
        this.messageType = messageType;
    }
    public Flight(FlightId id, int totalPassengers, int totalCrew, String arrivalPort, String departurePort, Date dtFlightArrDate, Date dtFlightDepDate, String flightDirection, String messageType, Set passengers, Set crews) {
       this.id = id;
       this.totalPassengers = totalPassengers;
       this.totalCrew = totalCrew;
       this.arrivalPort = arrivalPort;
       this.departurePort = departurePort;
       this.dtFlightArrDate = dtFlightArrDate;
       this.dtFlightDepDate = dtFlightDepDate;
       this.flightDirection = flightDirection;
       this.messageType = messageType;
       this.passengers = passengers;
       this.crews = crews;
    }
   
    public FlightId getId() {
        return this.id;
    }
    
    public void setId(FlightId id) {
        this.id = id;
    }
    public int getTotalPassengers() {
        return this.totalPassengers;
    }
    
    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }
    public int getTotalCrew() {
        return this.totalCrew;
    }
    
    public void setTotalCrew(int totalCrew) {
        this.totalCrew = totalCrew;
    }
    public String getArrivalPort() {
        return this.arrivalPort;
    }
    
    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }
    public String getDeparturePort() {
        return this.departurePort;
    }
    
    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }
    public Date getDtFlightArrDate() {
        return this.dtFlightArrDate;
    }
    
    public void setDtFlightArrDate(Date dtFlightArrDate) {
        this.dtFlightArrDate = dtFlightArrDate;
    }
    public Date getDtFlightDepDate() {
        return this.dtFlightDepDate;
    }
    
    public void setDtFlightDepDate(Date dtFlightDepDate) {
        this.dtFlightDepDate = dtFlightDepDate;
    }
    public String getFlightDirection() {
        return this.flightDirection;
    }
    
    public void setFlightDirection(String flightDirection) {
        this.flightDirection = flightDirection;
    }
    public String getMessageType() {
        return this.messageType;
    }
    
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    public Set getPassengers() {
        return this.passengers;
    }
    
    public void setPassengers(Set passengers) {
        this.passengers = passengers;
    }
    public Set getCrews() {
        return this.crews;
    }
    
    public void setCrews(Set crews) {
        this.crews = crews;
    }




}

