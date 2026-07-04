package com.management.hospitalmanagement;
import jakarta.persistence.*;
@Entity
@Table(name="chat")

public class chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String usermessage;
    private String botmessage;
    public chat(){}
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getUsermessage(){
        return usermessage;
    }
    public void setUsermessage(String usermessage){
        this.usermessage = usermessage;
    }
    public String getBotmessage(){
        return botmessage;
    }
    public void setBotmessage(String botmessage){
        this.botmessage = botmessage;
    }
    
}
