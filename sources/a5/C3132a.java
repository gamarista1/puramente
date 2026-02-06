package a5;

import T4.h;
import T4.i;
import Z4.m;
import Z4.n;
import Z4.o;
import Z4.r;
import com.bumptech.glide.load.data.j;

/* renamed from: a5.a  reason: case insensitive filesystem */
public class C3132a implements n {

    /* renamed from: b  reason: collision with root package name */
    public static final h f36097b = h.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final m f36098a;

    public C3132a(m mVar) {
        this.f36098a = mVar;
    }

    /* renamed from: c */
    public n.a a(Z4.h hVar, int i10, int i11, i iVar) {
        m mVar = this.f36098a;
        if (mVar != null) {
            Z4.h hVar2 = (Z4.h) mVar.a(hVar, 0, 0);
            if (hVar2 == null) {
                this.f36098a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) iVar.c(f36097b)).intValue()));
    }

    /* renamed from: d */
    public boolean b(Z4.h hVar) {
        return true;
    }

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    public static class C0589a implements o {

        /* renamed from: a  reason: collision with root package name */
        private final m f36099a = new m(500);

        public n c(r rVar) {
            return new C3132a(this.f36099a);
        }

        public void teardown() {
        }
    }
}
