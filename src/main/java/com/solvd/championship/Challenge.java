package com.solvd.championship;

import java.util.List;

public class Challenge {

    private List<Track> tracks;

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Challenge{" +
                "tracks=" + tracks +
                '}';
    }
}
