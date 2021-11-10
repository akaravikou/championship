package com.solvd.championship;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

    private List<Track> tracks;
    private MotorTeam motorTeam;
    private Motorcycle motorcycle;
    private Rider rider;
    private Challenge challenge;

    public Root() {
    }

    public Root(List<Track> tracks, MotorTeam motorTeam, Motorcycle motorcycle, Rider rider, Challenge challenge) {
        this.tracks = tracks;
        this.motorTeam = motorTeam;
        this.motorcycle = motorcycle;
        this.rider = rider;
        this.challenge = challenge;
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
                ", motorTeam=" + motorTeam +
                ", motorcycle=" + motorcycle +
                ", rider=" + rider +
                ", challenge=" + challenge +
                '}';
    }
}
