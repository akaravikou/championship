package com.solvd.championship;

public class MotorTeam {

    private Motorcycle motorcycle;
    private Rider rider;

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    @Override
    public String toString() {
        return "MotorTeam{" +
                "motorcycle=" + motorcycle +
                ", rider=" + rider +
                '}';
    }
}
