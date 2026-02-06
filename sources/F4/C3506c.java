package f4;

import android.net.Uri;
import j4.C3627n;
import kotlin.jvm.internal.C6496s;
import o4.l;

/* renamed from: f4.c  reason: case insensitive filesystem */
public final class C3506c implements C3505b {
    /* renamed from: b */
    public String a(Uri uri, C3627n nVar) {
        if (!C6496s.c(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        sb2.append(l.k(nVar.g().getResources().getConfiguration()));
        return sb2.toString();
    }
}
