package com.solvd.championship;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motorcycle", propOrder = {
        "model",
        "engineCapacity"
})
public class Motorcycle {

    private String model;
    private Integer engineCapacity;

    public Motorcycle() {
    }

    public Motorcycle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
