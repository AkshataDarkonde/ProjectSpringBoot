package com.example.demo.Bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Sports Details")
public class SportsDetails {
    private int playerBookingId;
    private int Sportsid;
    private String status;

    public SportsDetails() {
    }

    public SportsDetails(int playerBookingId, int Sportsid, String status) {
        this.playerBookingId = playerBookingId;
        this.Sportsid = Sportsid;
        this.status = status;
    }

    public int getPlayerBookingId() {
        return playerBookingId;
    }

    public void setPlayerBookingId(int playerBookingId) {
        this.playerBookingId = playerBookingId;
    }

    public int getSportsid() {
        return Sportsid;
    }

    public void setSportsid(int sportsid) {
        this.Sportsid = sportsid;
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
                ", Sportsid=" + Sportsid +
                ", status='" + status + '\'' +
                '}';
    }
}
