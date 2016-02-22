package maverick1502.smartmirrorhost.services.news;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class NewsModel {
    private String _headline;
    private String _imgUrl;
    private String _text;
    private Date _dateTime;

    public NewsModel() {}

    public NewsModel(String headline, String imgUrl, String text, Date date)
    {
        setHeadline( headline );
        setImgUrl( imgUrl );
        setText( text );
        setDateTime( date );
    }

    /**
     * @return the _headline
     */
    public String getHeadline() {
        return _headline;
    }

    /**
     * @param _headline the _headline to set
     */
    public void setHeadline(String _headline) {
        this._headline = _headline;
    }

    /**
     * @return the _imgUrl
     */
    public String getImgUrl() {
        return _imgUrl;
    }

    /**
     * @param _imgUrl the _imgUrl to set
     */
    public void setImgUrl(String _imgUrl) {
        this._imgUrl = _imgUrl;
    }

    /**
     * @return the _text
     */
    public String getText() {
        return _text;
    }

    /**
     * @param _text the _text to set
     */
    public void setText(String _text) {
        this._text = _text;
    }

    /**
     * @return the _dateTime
     */
    public Date getDateTime() {
        return _dateTime;
    }

    /**
     * @param _dateTime the _dateTime to set
     */
    public void setDateTime(Date _dateTime) {
        this._dateTime = _dateTime;
    }

}