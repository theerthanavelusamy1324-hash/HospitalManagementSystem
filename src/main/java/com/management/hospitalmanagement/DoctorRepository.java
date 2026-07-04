package com.management.hospitalmanagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<doctor,Integer>{
    long countByStatus(String status);

    
} 
