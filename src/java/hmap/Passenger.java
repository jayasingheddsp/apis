package hmap;
// Generated Sep 26, 2016 6:20:53 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Passenger generated by hbm2java
 */
public class Passenger  implements java.io.Serializable {


     private PassengerId id;
     private Flight flight;
     private String paxType;
     private String firstName;
     private String middleName;
     private String surname;
     private String gender;
     private String nationality;
     private String travelDocType;
     private Date dtTdExpiryDate;
     private String placeTdIssue;
     private Date dateOfBirth;
     private String portClearance;
     private String embPort;
     private String disEmbPort;
     private String resRef;

    public Passenger() {
    }

	
    public Passenger(PassengerId id, Flight flight, String paxType, String firstName, String surname, String gender, String nationality, String travelDocType, Date dtTdExpiryDate, String placeTdIssue, Date dateOfBirth, String embPort, String disEmbPort, String resRef) {
        this.id = id;
        this.flight = flight;
        this.paxType = paxType;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.nationality = nationality;
        this.travelDocType = travelDocType;
        this.dtTdExpiryDate = dtTdExpiryDate;
        this.placeTdIssue = placeTdIssue;
        this.dateOfBirth = dateOfBirth;
        this.embPort = embPort;
        this.disEmbPort = disEmbPort;
        this.resRef = resRef;
    }
    public Passenger(PassengerId id, Flight flight, String paxType, String firstName, String middleName, String surname, String gender, String nationality, String travelDocType, Date dtTdExpiryDate, String placeTdIssue, Date dateOfBirth, String portClearance, String embPort, String disEmbPort, String resRef) {
       this.id = id;
       this.flight = flight;
       this.paxType = paxType;
       this.firstName = firstName;
       this.middleName = middleName;
       this.surname = surname;
       this.gender = gender;
       this.nationality = nationality;
       this.travelDocType = travelDocType;
       this.dtTdExpiryDate = dtTdExpiryDate;
       this.placeTdIssue = placeTdIssue;
       this.dateOfBirth = dateOfBirth;
       this.portClearance = portClearance;
       this.embPort = embPort;
       this.disEmbPort = disEmbPort;
       this.resRef = resRef;
    }
   
    public PassengerId getId() {
        return this.id;
    }
    
    public void setId(PassengerId id) {
        this.id = id;
    }
    public Flight getFlight() {
        return this.flight;
    }
    
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public String getPaxType() {
        return this.paxType;
    }
    
    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNationality() {
        return this.nationality;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getTravelDocType() {
        return this.travelDocType;
    }
    
    public void setTravelDocType(String travelDocType) {
        this.travelDocType = travelDocType;
    }
    public Date getDtTdExpiryDate() {
        return this.dtTdExpiryDate;
    }
    
    public void setDtTdExpiryDate(Date dtTdExpiryDate) {
        this.dtTdExpiryDate = dtTdExpiryDate;
    }
    public String getPlaceTdIssue() {
        return this.placeTdIssue;
    }
    
    public void setPlaceTdIssue(String placeTdIssue) {
        this.placeTdIssue = placeTdIssue;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getPortClearance() {
        return this.portClearance;
    }
    
    public void setPortClearance(String portClearance) {
        this.portClearance = portClearance;
    }
    public String getEmbPort() {
        return this.embPort;
    }
    
    public void setEmbPort(String embPort) {
        this.embPort = embPort;
    }
    public String getDisEmbPort() {
        return this.disEmbPort;
    }
    
    public void setDisEmbPort(String disEmbPort) {
        this.disEmbPort = disEmbPort;
    }
    public String getResRef() {
        return this.resRef;
    }
    
    public void setResRef(String resRef) {
        this.resRef = resRef;
    }




}


