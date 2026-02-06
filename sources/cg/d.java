package Cg;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C6496s;

public final class d {
    public final InputStream a(String str) {
        C6496s.h(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
    }
}
