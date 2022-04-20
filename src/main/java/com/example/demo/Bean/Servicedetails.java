package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "Service details")

public class Servicedetails {
    @Id
    @GeneratedValue
    private int serviceId;
    private int StartTime;
    private int endTime;
    private int fees;
    private int totalPlayers;

    public Servicedetails() {
    }

    public Servicedetails(int serviceId, int startTime, int endTime, int fees, int totalPlayers) {
        this.serviceId = serviceId;
        StartTime = startTime;
        this.endTime = endTime;
        this.fees = fees;
        this.totalPlayers = totalPlayers;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int startTime) {
        StartTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(int totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    @Override
    public String toString() {
        return "Servicedetails{" +
                "serviceId=" + serviceId +
                ", StartTime=" + StartTime +
                ", endTime=" + endTime +
                ", fees=" + fees +
                ", totalPlayers=" + totalPlayers +
                '}';
    }
}