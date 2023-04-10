package rough;

import utilities.XMLReader;

public class TestXML {
    public static void main(String[] args) {
        XMLReader xml = new XMLReader("./src/test/resources/locators/OR.xml");
        System.out.println( xml.getLocator("homepage.header.username.xpath"));
   //driver.findelements(by.xpath(xml.getlocator("homepage.header.username.xpath)).sendkeys("");

    }

}
