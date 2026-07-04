package com.management.hospitalmanagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Integer>{
    user findByEmail(String email);

    
}
    

