package com.solvd.championship;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class MyJsonJackson implements Parser {

    @Override
    public Root parse() throws IOException {

        File file = new File("src\\main\\resources\\championship.json");
        ObjectMapper mapper = new ObjectMapper();
        Root obj = mapper.readValue(file, Root.class);

        System.out.println(obj.getMotorTeam());
        System.out.println(obj.getChallenge());

        return null;
    }
}
