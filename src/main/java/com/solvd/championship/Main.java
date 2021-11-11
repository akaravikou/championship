package com.solvd.championship;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("----------------------------SAX----------------------------");

        MySaxParser parser = new MySaxParser();
        Root root = parser.parse();
        System.out.println("Root " + root.toString());

        System.out.println("----------------------------JAXB----------------------------");

        MyJaxb jaxb = new MyJaxb();
        Root root2 = jaxb.parse();

        System.out.println("---------------------------JackSON--------------------------");

        MyJsonJackson jackson = new MyJsonJackson();
        Root root3 = jackson.parse();
    }
}
