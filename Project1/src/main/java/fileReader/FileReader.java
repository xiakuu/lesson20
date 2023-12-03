package fileReader;

import fileSearcher.FilesSearcher;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    private static final String READERDIRECTORY = "src/main/java/files/archive/";

    public static void readFiles() throws InterruptedException, IOException, ParserConfigurationException, SAXException {
        File[] files = new File(READERDIRECTORY).listFiles((((dir, name) -> name.endsWith(".txt"))));
        String line;

        if (files.length == 0) {
            System.out.println("Не был произведен парсинг файлов, автоматический запуск");
            Thread.sleep(1500);
            FilesSearcher.getFiles();
        } else {

            for (int i = 0; i < files.length; i++) {

                try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(files[i]));) {

                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);

                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
