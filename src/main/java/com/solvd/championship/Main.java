package com.solvd.championship;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------------SAX----------------------------");

        MySaxParser parser = new MySaxParser();
        Root root = parser.parse();
        System.out.println("Root " + root.toString());

        System.out.println("----------------------------JAXB----------------------------");

        MyJaxb jaxb = new MyJaxb();
        Root root2 = jaxb.parse();
    }
}
