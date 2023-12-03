package report;

import java.io.*;
import java.util.List;

public class ReportCreator {
    private static final String OUTPUTDIRECTORY = "src/main/java/files/archive/";


    public static void createReport(String fileName, List<String> transactionInfo) throws IOException {



        try(BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUTDIRECTORY + fileName))){
            File file = new File(OUTPUTDIRECTORY + fileName);

            for(String str : transactionInfo){
                bw.write(str);
                bw.newLine();
            }


        }

    }

}
