import org.xml.sax.SAXException;
import parser.Parser;
import select.Select;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        Select select = new Select();
        select.selection();


    }
}
