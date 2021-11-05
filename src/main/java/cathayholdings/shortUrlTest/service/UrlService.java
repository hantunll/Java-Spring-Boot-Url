package cathayholdings.shortUrlTest.service;

import cathayholdings.shortUrlTest.model.Url;
import cathayholdings.shortUrlTest.model.UrlDto;
import org.springframework.stereotype.Service;


@Service
public interface UrlService {
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);
}