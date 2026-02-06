package g4;

import Sg.p;
import android.net.Uri;
import j4.C3627n;
import java.io.File;
import kotlin.jvm.internal.C6496s;
import o4.l;

/* renamed from: g4.b  reason: case insensitive filesystem */
public final class C3524b implements C3526d {
    private final boolean b(Uri uri) {
        if (l.q(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null && !C6496s.c(scheme, "file")) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (!p.M0(path, '/', false, 2, (Object) null) || l.h(uri) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public File a(Uri uri, C3627n nVar) {
        if (!b(uri)) {
            return null;
        }
        if (!C6496s.c(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
