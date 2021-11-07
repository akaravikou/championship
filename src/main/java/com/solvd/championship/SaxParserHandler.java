package com.solvd.championship;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.time.LocalDateTime;
import java.util.*;

public class SaxParserHandler extends DefaultHandler {

    private static final String TAG_MOTORTEAM = "motorTeam";
    private static final String TAG_MOTORCYCLE = "motorcycle";
    private static final String TAG_MODEL = "model";
    private static final String TAG_ENGINE = "engineCapacity";
    private static final String TAG_RIDER = "rider";
    private static final String TAG_NAME = "name";
    private static final String TAG_BIRTH = "dateOfBirth";
    private static final String TAG_NATIONALITY = "nationality";
    private static final String TAG_CHALLENGE = "challenge";
    private static final String TAG_TRACKS = "tracks";
    private static final String TAG_TRACK = "track";

    private MotorTeam motorTeam;
    private Motorcycle motorcycle;
    private Rider rider;
    private Challenge challenge;
    private String track1;
    private Track track;
    List<Track> tracks = new ArrayList<>();

    private String currentTagName;

    Root root = new Root();

    public Root getRoot() {
        return root;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Ok, let's go!");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Operation complete");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;

        switch (currentTagName) {
            case TAG_MOTORTEAM -> {
                motorTeam = new MotorTeam();
                break;
            }
            case TAG_MOTORCYCLE -> {
                motorcycle = new Motorcycle("new one");
                break;
            }
            case TAG_RIDER -> {
                rider = new Rider("Guy Martin");
                break;
            }
            case TAG_CHALLENGE -> {
                challenge = new Challenge();
                break;
            }
            case TAG_TRACKS -> {
            }
            case TAG_TRACK -> {
                track = new Track(attributes.getValue(localName));
                tracks.add(track);
                break;
            }
            default -> {
                break;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case TAG_ENGINE -> {
                root.setMotorcycle(motorcycle);
                break;
            }
            case TAG_NATIONALITY -> {
                root.setRider(rider);
                break;
            }
            case TAG_TRACKS-> {
                challenge.setTracks(tracks);
                root.setTracks(tracks);
            }
            default -> {
                break;
            }
        }
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String text = new String(ch, start, length);

        if (text.contains("<") || currentTagName == null) {
            return;
        }

        switch (currentTagName) {
            case TAG_MODEL -> {
                motorcycle.setModel(text);
                break;
            }
            case TAG_ENGINE -> {
                motorcycle.setEngineCapacity(Integer.valueOf(text));
                break;
            }
            case TAG_NAME -> {
                rider.setName(text);
                break;
            }
            case TAG_BIRTH -> {
                rider.setDateOfBirth(LocalDateTime.parse(text));
                break;
            }
            case TAG_NATIONALITY -> {
                rider.setNationality(text);
                break;
            }
            case TAG_TRACK -> {
                track1 = String.valueOf(text);
                track.setName(track1);
            }
        }
    }
}