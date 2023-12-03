package fileSearcher;

import org.xml.sax.SAXException;
import parser.Parser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesSearcher {
    private static final String INPUTDIRECTORY = "src/main/java/files/input";

    public static void getFiles() throws IOException, ParserConfigurationException, SAXException {
        File[] files = new File(INPUTDIRECTORY).listFiles((((dir, name) -> name.endsWith(".txt"))));
        boolean checkSender = false;
        boolean checkReciever = false;
        boolean checkMoney = false;
        String line;

        if(files.length == 0){
            System.out.println("Нет файлов в директории input");
        }else {

        for (int i = 0; i < files.length; i++) {

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(files[i]));) {

                while ((line = bufferedReader.readLine()) != null) {

                    if (line.contains("<CardNumberSender>")) {
                        checkSender = true;
                    }

                    if (line.contains("<CardNumberReceiver>")) {
                        checkReciever = true;
                    }

                    if (line.contains("<MoneySend>")) {
                        checkMoney = true;
                    }


                }

                System.out.println("Sender: " + checkSender + "\nReciever: " + checkReciever + "\nMoney: " + checkMoney);


                if (checkSender && checkReciever && checkMoney) {
                    Parser.parse(files[i].getAbsolutePath(), files[i].getName());
                    checkSender = false;
                    checkReciever = false;
                    checkMoney = false;
                } else {
                    System.out.println("skipping file " + files[i].getName());
                }


            } catch (IOException e) {
                System.out.println(e);
            }
        }

        }
    }
}
