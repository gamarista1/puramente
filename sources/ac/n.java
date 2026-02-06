package Ac;

import java.net.URL;
import java.net.URLConnection;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final URL f50260a;

    public n(URL url) {
        this.f50260a = url;
    }

    public URLConnection a() {
        return this.f50260a.openConnection();
    }

    public String toString() {
        return this.f50260a.toString();
    }
}
