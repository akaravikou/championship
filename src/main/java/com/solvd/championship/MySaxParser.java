package com.solvd.championship;

import org.xml.sax.SAXException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class MySaxParser implements Parserable {

    @Override
    public Root parse() {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("Open Sax parser error" + e.toString());
            return null;
        }

        File file = new File("championship");
        try {
            parser.parse(file, handler);
        } catch (SAXException e) {
            System.out.println("Parsing error" + e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("IO error" + e.toString());
            return null;
        }
        return handler.getRoot();
    }
}
