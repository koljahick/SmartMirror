package maverick1502.smartmirrorhost.services.news.source;

import maverick1502.smartmirrorhost.services.news.NewsModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MockupNewsSource extends BaseNewsSource {

    public MockupNewsSource()
    {
        updateNews();
    }



    @Override
    public void updateNews() {
        _newsList = generateMockupdata();
    }

    private List<NewsModel> generateMockupdata()
    {
        List<NewsModel> newsList = new ArrayList<NewsModel>();

        NewsModel n = new NewsModel();
        n.setHeadline("Bad Aibling - \"Furchtbares Einzelversagen\" führte zum Zugunglück");
        n.setImgUrl("http://localhost/smartmirror/news/images/bad-aibling_400x300.jpg");
        n.setText("Lange wurde spekuliert, nun steht die Ursache für das Zugunglück von Bad Aibling fest. Menschliches Versagen führte zu der Tragödie. Gegen den verantwortlichen Fahrdienstleiter wird ermittelt.");
        n.setDateTime( new Date(1455633960000L) );

        newsList.add( n );

        n = new NewsModel();
        n.setHeadline("Live-Ticker - aktuelle Nachrichten zu Syrien - Türkei für Einsatz von Bodentruppen im Syrien-Konflikt");
        n.setImgUrl("http://localhost/smartmirror/news/images/syrien_400x300.jpg");
        n.setText("Türkei setzt Artilleriebeschuss von Kurden-Stellungen fort  +++ Israelischer Botschafter warnt vor Eskalation in Nahost +++ Amnesty: Türkei ist für Flüchtlinge nicht pauschal sicher +++ Mehr im...");
        n.setDateTime( new Date(1455626940000L) );

        newsList.add( n );

        n = new NewsModel();
        n.setHeadline("Schweden und die Flüchtlingskrise - \"Mit dieser Lage sind wir nicht mehr klargekommen\"");
        n.setImgUrl("http://localhost/smartmirror/news/images/schweden-fluechtlinge_400x300.jpg");
        n.setText("Schweden galt lange als das Land mit der größten Willkommenskultur. Dann kam die Flüchtlingskrise. Im Interview erklärt der Integrationsminister warum Schweden langsam seine Grenzen schließt.");
        n.setDateTime( new Date(1455626340000L) );

        newsList.add( n );

        return newsList;
    }

}