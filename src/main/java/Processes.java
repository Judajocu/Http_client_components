import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.io.IOException;

public class Processes {

    //Punto A
    public void NumberElements(Document doc, String url) throws IOException
    {
        Connection.Response responseParagraph = Jsoup.connect(url).execute();
        System.out.println(responseParagraph.body().split("\n").length);
    }
    //Punto B
    public void NumberP(Document doc)
    {
        Elements all_p = doc.getElementsByTag("p");
        System.out.println(all_p.size());
    }
    //Punto C
    public void Img2P(Document doc)
    {
        Elements all_img = new Elements();
        int cant =1;
        for (Element all_p : doc.getElementsByTag("p"))
        {
            System.out.println("Cantidad de img dentro de P "+cant+" es:");
            all_img = all_p.getElementsByTag("img");
            System.out.print(all_img.size());
            cant++;
        }

    }
    //Punto D
    public void FormType(Document doc)
    {
        Elements type_form = doc.getElementsByTag("form");

        int cant_Post = 0;
        int cant_Get = 0;
        for (FormElement form : type_form.forms())
        {
            if (form.attr("method").equalsIgnoreCase("get"))
            {
                cant_Get++;
            }
            if (form.attr("method").equalsIgnoreCase("post"))
            {
                cant_Post++;
            }
        }
        System.out.println(cant_Get);
        System.out.println(cant_Post);
    }
    //Punto E
    public void FormInput(Document doc)
    {
        int cant_input = 0;
        Elements type_form = doc.getElementsByTag("form");
        for (FormElement form : type_form.forms())
        {
            for (Element Input_form : form.getElementsByTag("input"))
            {
                System.out.println("El tipo de input es "+Input_form.attr("type"));
                cant_input++;
            }
        }
        System.out.println("Cantidad de inputs que hay, son: "+cant_input);
    }
    //Punto F
    public void Form2Post(Document doc)
    {

    }
}
