/**
 * Created by Tyler on 1/13/17.
 */

import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class scrapper {

    private String url;
    private Document doc;

    public void Scapper(String scrapUrl) throws IOException {
        doc = Jsoup.connect(scrapUrl).get();
    }
}
