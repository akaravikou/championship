package com.solvd.championship;

import java.util.List;

public class Root {

    private List<Track> tracks;
    private MotorTeam motorTeam;
    private Motorcycle motorcycle;
    private Rider rider;
    private Challenge challenge;

    public Root() {
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public MotorTeam getMotorTeam() {
        return motorTeam;
    }

    public void setMotorTeam(MotorTeam motorTeam) {
        this.motorTeam = motorTeam;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    @Override
    public String toString() {
        return "Root{" +
                ", tracks=" +tracks+
                ", motorTeam=" + motorTeam +
                ", motorcycle=" + motorcycle +
                ", rider=" + rider +
                ", challenge=" + challenge +
                '}';
    }
}
