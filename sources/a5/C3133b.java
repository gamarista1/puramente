package a5;

import T4.i;
import U4.b;
import U4.c;
import Z4.n;
import Z4.o;
import Z4.r;
import android.content.Context;
import android.net.Uri;
import n5.C3861d;

/* renamed from: a5.b  reason: case insensitive filesystem */
public class C3133b implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Context f36100a;

    public C3133b(Context context) {
        this.f36100a = context.getApplicationContext();
    }

    /* renamed from: c */
    public n.a a(Uri uri, int i10, int i11, i iVar) {
        if (b.e(i10, i11)) {
            return new n.a(new C3861d(uri), c.e(this.f36100a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean b(Uri uri) {
        return b.b(uri);
    }

    /* renamed from: a5.b$a */
    public static class a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final Context f36101a;

        public a(Context context) {
            this.f36101a = context;
        }

        public n c(r rVar) {
            return new C3133b(this.f36101a);
        }

        public void teardown() {
        }
    }
}
