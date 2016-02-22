package maverick1502.smartmirrorhost.services.news;

import maverick1502.smartmirrorhost.services.news.source.INewsSource;
import maverick1502.smartmirrorhost.services.news.source.MockupNewsSource;
import maverick1502.smartmirrorhost.services.news.source.N24NewsSource;
import maverick1502.smartmirrorhost.services.news.source.TagesschauNewsSource;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path( "news" )
public class NewsService {

    private final INewsSource _source;

    public NewsService()
    {
        _source = new TagesschauNewsSource();
    }

    @GET
    @Produces( MediaType.APPLICATION_JSON )

    public Response getNews()
    {
        ResponseBuilder builder = Response.ok(_source.getNews());
        builder.header("Access-Control-Allow-Origin", "*");
        builder.header("Access-Control-Max-Age", "3600");
        builder.header("Access-Control-Allow-Methods", "*");
        builder.header(
                "Access-Control-Allow-Headers",
                "X-Requested-With,Host,User-Agent,Accept,Accept-Language,Accept-Encoding,Accept-Charset,Keep-Alive,Connection,Referer,Origin");

        return builder.build();
    }

    @GET
    @Path("/{count}")
    @Produces( MediaType.APPLICATION_JSON )
    public Response getNews( @PathParam("count") int count )
    {
        ResponseBuilder builder = Response.ok(_source.getNews( count ));
        builder.header("Access-Control-Allow-Origin", "*");
        builder.header("Access-Control-Max-Age", "3600");
        builder.header("Access-Control-Allow-Methods", "*");
        builder.header(
                "Access-Control-Allow-Headers",
                "X-Requested-With,Host,User-Agent,Accept,Accept-Language,Accept-Encoding,Accept-Charset,Keep-Alive,Connection,Referer,Origin");

        return builder.build();
    }

    public void updateNews()
    {
        _source.updateNews();
    }

}
