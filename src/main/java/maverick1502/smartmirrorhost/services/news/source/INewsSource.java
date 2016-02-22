package maverick1502.smartmirrorhost.services.news.source;

import maverick1502.smartmirrorhost.services.news.NewsModel;
import java.util.List;

public interface INewsSource {
    List<NewsModel> getNews();
    List<NewsModel> getNews(int count);
    void updateNews();
}
