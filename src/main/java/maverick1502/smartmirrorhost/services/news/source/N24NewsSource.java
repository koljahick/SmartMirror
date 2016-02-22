package maverick1502.smartmirrorhost.services.news.source;

import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import maverick1502.smartmirrorhost.services.news.NewsModel;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

public class N24NewsSource extends BaseNewsSource {

    public N24NewsSource()
    {
        _newsList = new LinkedList<NewsModel>();
        updateNews();
    }

    @Override
    public void updateNews() {

        try {

            URL feedSource = new URL("http://feeds.n24.de/n24/homepage?format=xml");
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));

            for(SyndEntry e : feed.getEntries())
            {
                NewsModel news = new NewsModel();

                news.setHeadline(e.getTitle());
                news.setDateTime(e.getPublishedDate());
                news.setText(e.getDescription().getValue());
                _newsList.add(news);
            }


            System.out.println(feed);
        } catch (FeedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
