package a5;

import T4.i;
import U4.b;
import U4.c;
import Z4.n;
import Z4.o;
import Z4.r;
import android.content.Context;
import android.net.Uri;
import c5.H;
import n5.C3861d;

/* renamed from: a5.c  reason: case insensitive filesystem */
public class C3134c implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f36102a;

    public C3134c(Context context) {
        this.f36102a = context.getApplicationContext();
    }

    private boolean e(i iVar) {
        Long l10 = (Long) iVar.c(H.f36440d);
        if (l10 == null || l10.longValue() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        if (!b.e(i10, i11) || !e(iVar)) {
            return null;
        }
        return new n.a(new C3861d(uri), c.f(this.f36102a, uri));
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return b.d(uri);
    }

    /* renamed from: a5.c$a */
    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36103a;

        public a(Context context) {
            this.f36103a = context;
        }

        public n c(r rVar) {
            return new C3134c(this.f36103a);
        }

        public void teardown() {
        }
    }
}
