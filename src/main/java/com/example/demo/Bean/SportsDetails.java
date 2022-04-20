package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Sports Details")
public class SportsDetails {
    private int playerBookingId;
    private int id;
    private String status;

    public SportsDetails() {
    }

    public SportsDetails(int playerBookingId, int id, String status) {
        this.playerBookingId = playerBookingId;
        this.id = id;
        this.status = status;
    }

    public int getPlayerBookingId() {
        return playerBookingId;
    }

    public void setPlayerBookingId(int playerBookingId) {
        this.playerBookingId = playerBookingId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SprotsDetails{" +
                "playerBookingId=" + playerBookingId +
                ", id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
