import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{


        Document doc;
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        Processes processes = new Processes();
        System.out.println("Digite una URL");
        String input = br.readLine();
        br.close();
        doc = Jsoup.connect(input).get();
        System.out.println("Se muestran a continacion la cantidad de recursos");
        processes.NumberElements(input);
        System.out.println("Se muestran a continacion la cantidad de parrafos que tiene el archivo");
        processes.NumberP(doc);
        System.out.println("Se muestran a continacion la cantidad de imagenes dentro de cada parrafo");
        processes.Img2P(doc);
        System.out.println("Se muestran a continacion la cantidad de metodos post y get que tienen los forms del archivo");
        processes.FormType(doc);
        System.out.println("Se muestran a continacion el tipo de input y la cantidad");
        processes.FormInput(doc);
        System.out.println("Se usa el metodo post de un forma para mandar una respuesta");
        processes.Form2Post(doc);
    }
}


