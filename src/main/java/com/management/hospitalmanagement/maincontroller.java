package com.management.hospitalmanagement;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
















@RestController
@CrossOrigin("*")

public class maincontroller {
    @Autowired
    UserRepository repo;
    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
       user existing = repo.findByEmail(email);
       if(existing != null){
        return "Already mail exist";
       }
       user u = new user();
       u.setUsername(username);
       u.setEmail(email);
       u.setPassword(password);
       repo.save(u);
       return "Signup success";
    }
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        user user = repo.findByEmail(email);
        if(user == null){
            return "User not found";
        }
        if(user.getPassword().equals(password)){
            return "success";
        }
        return "Invalid password";
    }
  @Autowired
   PatientRepository patientrepo;
   @GetMapping("/addpatient")
   public patient addPatient(@RequestParam String patientname, @RequestParam int patientage, @RequestParam String disease, @RequestParam String roomtype) {
     patient p = new patient();
     p.setPatientname(patientname);
     p.setPatientage(patientage);
     p.setDisease(disease);
     p.setRoomtype(roomtype);
     return patientrepo.save(p);
   }
   @GetMapping("/patientdetails")
   public List<patient> getPatient() {
       return patientrepo.findAll();
   }
   @GetMapping("/patientcount")
   public long patientcount() {
       return patientrepo.count();
   }
   @DeleteMapping("/deletepatient")
   public String deletepatient(@RequestParam int id){
    if(patientrepo.existsById(id)){
        patientrepo.deleteById(id);
        return "Deleted successfully";
    }
    return "Patients not found";
   }
   @Autowired
   DoctorRepository doctorrepo;
   @GetMapping("/adddoctor")
   public doctor adddoctor(@RequestParam String doctorname, @RequestParam String status) {
       doctor d = new doctor();
       d.setDoctorname(doctorname);
       d.setStatus(status);
       return doctorrepo.save(d);
   }
   @GetMapping("/doctordetails")
   public List<doctor> getDoctor() {
       return doctorrepo.findAll();
   }
   @GetMapping("/doctorcount")
   public long doctorcount() {
       return doctorrepo.count();
   }
    @GetMapping("/availabledoctor")
   public long getavailablecount(){
    return doctorrepo.countByStatus("onduty");
   }
   @DeleteMapping("/deletedoctor")
   public String deletedoctor(@RequestParam int id){
    if(doctorrepo.existsById(id)){
        doctorrepo.deleteById(id);
        return "Deleted successfully";
    }
    return "Doctor not found";
   }
  
   
   @Autowired
   AppointmentRepository appointmentrepo;
   @GetMapping("/book")
   public appointment book(@RequestParam String name, @RequestParam String doctor) {
       appointment a = new appointment();
       a.setName(name);
       a.setDoctor(doctor);
       return appointmentrepo.save(a);
   }
   @GetMapping("/appointmentdetails")
   public List getAppointments() {
       return appointmentrepo.findAll();
   }
   
   @GetMapping("/appointmentcount")
   public long appointmentcount() {
       return appointmentrepo.count();
   }
   
   @GetMapping("/send")
   public String send(@RequestParam String text) {
    switch (text) {
        case "hii":
            return "Hello how are you?";
            case "how many patients?":
            return "Total patients" + patientcount();
        default:
            return "Invalid choice";
     
    }
    
    
   }
   
   
   
   
   
   
   
   
   
   
   
     
      
       
    
    
    
    
    
    
}
