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
        //System.out.println(doc);
        processes.Img2P(doc);

    }
}


