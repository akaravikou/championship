package com.solvd.championship;

public class Track {

    private String name;
    private Integer lapRecordMinutes;

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLapRecordMinutes() {
        return lapRecordMinutes;
    }

    public void setLapRecordMinutes(Integer lapRecordMinutes) {
        this.lapRecordMinutes = lapRecordMinutes;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", lapRecordMinutes=" + lapRecordMinutes +
                '}';
    }
}
