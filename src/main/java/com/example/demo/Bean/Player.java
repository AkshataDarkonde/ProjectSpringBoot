package com.example.demo.Bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Player")

public class Player {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private String sports;
    long contactnumber;

    public Player(){
    }

    public Player(int id, String firstname, String lastname, String sports, long contactnumber){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.sports=sports;
        this.contactnumber=contactnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sports='" + sports + '\'' +
                ", contactnumber=" + contactnumber +
                '}';
    }
}