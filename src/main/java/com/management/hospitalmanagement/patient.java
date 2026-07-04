package com.management.hospitalmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="patients")

public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientname;
    private int patientage;
    private String disease;
    private String roomtype;
    public patient(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getPatientname(){
        return patientname;
    }
    public void setPatientname(String patientname){
        this.patientname = patientname;
    }
    public int getPatientage(){
        return patientage;
    }
    public void setPatientage(int patientage){
        this.patientage = patientage;
    }
    public String getDisease(){
        return disease;
    }
    public void setDisease(String disease){
        this.disease = disease;
    }
    public String getRoomtype(){
        return roomtype;
    }
    public void setRoomtype(String roomtype){
        this.roomtype = roomtype;
    }

    
}
