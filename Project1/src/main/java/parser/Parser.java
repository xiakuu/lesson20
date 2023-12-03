package parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import report.ReportCreator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void parse(String path, String fileName) throws IOException, SAXException, ParserConfigurationException{
            String cardSender = null;
            String cardReciever = null;
            String statusName = null;
            int money = 0;
            List<String> transactionInfo = new ArrayList<>();


        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(path));
        NodeList bilInfo = document.getElementsByTagName("Transactions");


            for(int i = 0; i < bilInfo.getLength(); i++) {
                Node node = bilInfo.item(i);

                if (node.getNodeType() == 1) {
                    Element element = (Element) node;


                        for (int x = 0; x < element.getElementsByTagName("CardNumberSender").getLength(); x++) {
                            cardSender = element.getElementsByTagName("CardNumberSender").item(x).getTextContent();
                            cardReciever = element.getElementsByTagName("CardNumberReceiver").item(x).getTextContent();
                            money = Integer.parseInt(element.getElementsByTagName("MoneySend").item(x).getTextContent());

                            if (cardSender.length() != 11 || cardReciever.length() != 11) {
                                statusName = "Неуспешно. Неверный формат карты";
                            } else if (!cardSender.equals(cardReciever) && money > 1) {
                                statusName = "Успешно";
                            } else if (cardSender.equals(cardReciever) && money > 1) {
                                statusName = "Неуспешно. Перевод на ту же карту";
                            } else if (!cardSender.equals(cardReciever) && money < 1) {
                                statusName = "Неуспешно. Недостаточно средств";
                            }

                            transactionInfo.add(String.valueOf(java.time.LocalDateTime.now()) + " | " + fileName + " | " + "перевод с " + cardSender + " на " + cardReciever + " " + money + " | " + statusName);
                        }
                    //     System.out.println(transactionInfo);
                    }
                }

            ReportCreator.createReport(fileName, transactionInfo);



    }

}
