package com.solvd.championship;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MyJaxb implements Parser{

    @Override
    public Root parse() {

        File file = new File("src\\main\\resources\\championship.xml");

        try{
            JAXBContext context = JAXBContext.newInstance(Root.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Root rootJaxb = (Root) unmarshaller.unmarshal(file);

            System.out.println(rootJaxb.getMotorTeam());
            System.out.println(rootJaxb.getChallenge());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
