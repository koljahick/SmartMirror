package maverick1502.smartmirrorhost.services.news.source;

import maverick1502.smartmirrorhost.services.news.NewsModel;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseNewsSource implements INewsSource {

    protected List<NewsModel> _newsList;

    @Override
    public List<NewsModel> getNews() {
        return _newsList;
    }

    @Override
    public List<NewsModel> getNews(int count) {
        List<NewsModel> tmpList = new ArrayList<NewsModel>();

        int i = 0;

        for( NewsModel n : _newsList )
        {
            if(i >= count)
                break;

            tmpList.add(n);

            i++;
        }

        return tmpList;
    }
}
