package Mc;

import java.net.HttpURLConnection;
import java.net.URL;

public class b implements a {
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }
}
