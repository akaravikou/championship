package com.solvd.championship;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Track {

    private String name;

    public Track() {
    }

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                '}';
    }
}
