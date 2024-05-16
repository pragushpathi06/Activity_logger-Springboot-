package com.student.dashboard.controller;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student_activity_log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Activity_title;
    private String Activtiy_Id;
    private String Discription;

    private String Event_catetory;

    public Student_activity_log(){

    }
    public int getId(){
        return id;
    }

    public String getActivity_title() {
        return Activity_title;
    }

    public void setActivity_title(String activity_title) {
        Activity_title = activity_title;
    }

    public String getDiscription() {
        return Discription;
    }

    public void setDiscription(String discription) {
        Discription = discription;
    }

    public String getEvent_catetory() {
        return Event_catetory;
    }

    public void setEvent_catetory(String event_catetory) {
        Event_catetory = event_catetory;
    }

    public void setId(int id){
        this.id=id;
    }

}
