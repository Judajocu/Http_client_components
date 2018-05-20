import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;

public class Processes {

    public void NumberElements(Document doc)
    {
        System.out.println(doc.getAllElements().size());

    }

    public void NumberP(Document doc)
    {
        Elements all_p = doc.getElementsByTag("p");
        System.out.println(all_p.size());
    }

    public void Img2P(Document doc)
    {
        for (Element all_p : doc.getElementsByTag("p"))
        {
            Elements all_img = all_p.getElementsByTag("img");
            System.out.println(all_img);
        }
    }

}
