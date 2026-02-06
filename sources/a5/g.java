package a5;

import T4.i;
import Z4.h;
import Z4.n;
import Z4.o;
import Z4.r;
import java.io.InputStream;
import java.net.URL;

public class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final n f36121a;

    public g(n nVar) {
        this.f36121a = nVar;
    }

    /* renamed from: c */
    public n.a a(URL url, int i10, int i11, i iVar) {
        return this.f36121a.a(new h(url), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(URL url) {
        return true;
    }

    public static class a implements o {
        public n c(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }

        public void teardown() {
        }
    }
}
