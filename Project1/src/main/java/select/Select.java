package select;

import fileReader.FileReader;
import fileSearcher.FilesSearcher;
import org.xml.sax.SAXException;
import parser.Parser;
import report.ReportCreator;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Select {
    private static final boolean check = true;

    public static void selection() throws IOException, ParserConfigurationException, SAXException {


        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. вызов операции парсинга файлов перевода из input
                2. вызов операции вывода списка всех переводов из файла-отчета
                0. Выход
                """);
            try{
            int input = sc.nextInt();


                switch (input) {
                    case 1 -> FilesSearcher.getFiles();
                    case 2 -> FileReader.readFiles();

                    case 0 -> System.exit(0);
                    default -> System.out.println("Вы ввели неверное число, попробуйте снова");
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
                System.exit(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }

}
