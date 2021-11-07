package com.solvd.championship;

public class Main {

    public static void main(String[] args) {

        MySaxParser parser = new MySaxParser();
        Root root = parser.parse();

        System.out.println(root);
    }
}
