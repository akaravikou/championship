package com.solvd.championship;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface Parser {

    Root parse() throws ParserConfigurationException, SAXException, IOException;

}
