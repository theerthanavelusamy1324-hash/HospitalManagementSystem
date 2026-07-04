package com.management.hospitalmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="appointments")

public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String doctor;
    public appointment(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDoctor(){
        return doctor;
    }
    public void setDoctor(String doctor){
        this.doctor = doctor;
    }
}
