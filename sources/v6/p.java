package V6;

import M5.d;
import M5.i;
import android.net.Uri;
import i7.C3593b;
import i7.C3595d;

public class p implements k {

    /* renamed from: a  reason: collision with root package name */
    private static p f34725a;

    protected p() {
    }

    public static synchronized p f() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f34725a == null) {
                    f34725a = new p();
                }
                pVar = f34725a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return pVar;
    }

    public d a(C3593b bVar, Object obj) {
        C3075b bVar2 = new C3075b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), (d) null, (String) null);
        bVar2.d(obj);
        return bVar2;
    }

    public d b(C3593b bVar, Object obj) {
        String str;
        d dVar;
        C3595d l10 = bVar.l();
        if (l10 != null) {
            d a10 = l10.a();
            str = l10.getClass().getName();
            dVar = a10;
        } else {
            dVar = null;
            str = null;
        }
        C3075b bVar2 = new C3075b(e(bVar.v()).toString(), bVar.r(), bVar.t(), bVar.h(), dVar, str);
        bVar2.d(obj);
        return bVar2;
    }

    public d c(C3593b bVar, Uri uri, Object obj) {
        return new i(e(uri).toString());
    }

    public d d(C3593b bVar, Object obj) {
        return c(bVar, bVar.v(), obj);
    }

    /* access modifiers changed from: protected */
    public Uri e(Uri uri) {
        return uri;
    }
}
