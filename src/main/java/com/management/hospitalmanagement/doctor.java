package com.management.hospitalmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="doctors")

public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
    private String doctorname;
    private String status;
    public doctor(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDoctorname(){
        return doctorname;
    }
    public void setDoctorname(String doctorname){
        this.doctorname = doctorname;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
}
