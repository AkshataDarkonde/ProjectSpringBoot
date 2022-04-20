package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sports")
public class Sports {
    @Id
    @GeneratedValue
    private String name;
    private int time;
    private int noOfPlayers;

    public Sports() {
    }

    public Sports(String name, int time, int noOfPlayers) {
        this.name = name;
        this.time = time;
        this.noOfPlayers = noOfPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", noOfPlayers=" + noOfPlayers +
                '}';
    }
}
