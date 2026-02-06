package ia;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: ia.j  reason: case insensitive filesystem */
public interface C3612j extends C3610h {

    /* renamed from: ia.j$a */
    public interface a {
        C3612j a();
    }

    void close();

    Map d() {
        return Collections.emptyMap();
    }

    Uri getUri();

    long m(n nVar);

    void n(J j10);
}
