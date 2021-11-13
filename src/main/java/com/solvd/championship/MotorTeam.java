package com.solvd.championship;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motorTeam", propOrder = {
        "motorcycle",
        "rider"
})
public class MotorTeam {

    private Motorcycle motorcycle;
    private Rider rider;

    public MotorTeam() {
    }

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
