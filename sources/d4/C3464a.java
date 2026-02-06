package d4;

import Gh.H;
import X3.g;
import a4.C3108a;
import a4.C3114g;
import a4.V;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import d4.C3472i;
import j4.C3627n;
import mf.C6565s;
import o4.l;
import qf.C6658d;
import yf.C6798l;

/* renamed from: d4.a  reason: case insensitive filesystem */
public final class C3464a implements C3472i {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f43096a;

    /* renamed from: b  reason: collision with root package name */
    private final C3627n f43097b;

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    public static final class C0663a implements C3472i.a {
        /* renamed from: b */
        public C3472i a(Uri uri, C3627n nVar, g gVar) {
            if (!l.q(uri)) {
                return null;
            }
            return new C3464a(uri, nVar);
        }
    }

    public C3464a(Uri uri, C3627n nVar) {
        this.f43096a = uri;
        this.f43097b = nVar;
    }

    public Object a(C6658d dVar) {
        String x02 = C6565s.x0(C6565s.g0(this.f43096a.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        return new m(V.f(H.d(H.l(this.f43097b.g().getAssets().open(x02))), this.f43097b.g(), new C3108a(x02)), l.j(MimeTypeMap.getSingleton(), x02), C3114g.DISK);
    }
}
