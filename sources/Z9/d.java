package z9;

import ja.B;
import ja.C3645a;
import k9.L0;
import q9.C3962B;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;

public class d implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final p f50116d = new c();

    /* renamed from: a  reason: collision with root package name */
    private m f50117a;

    /* renamed from: b  reason: collision with root package name */
    private i f50118b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50119c;

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] c() {
        return new k[]{new d()};
    }

    private static B d(B b10) {
        b10.P(0);
        return b10;
    }

    private boolean e(l lVar) {
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f50126b & 2) == 2) {
            int min = Math.min(fVar.f50133i, 8);
            B b10 = new B(min);
            lVar.l(b10.d(), 0, min);
            if (C4240b.p(d(b10))) {
                this.f50118b = new C4240b();
            } else if (j.r(d(b10))) {
                this.f50118b = new j();
            } else if (h.p(d(b10))) {
                this.f50118b = new h();
            }
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        i iVar = this.f50118b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    public void f(m mVar) {
        this.f50117a = mVar;
    }

    public boolean h(l lVar) {
        try {
            return e(lVar);
        } catch (L0 unused) {
            return false;
        }
    }

    public int i(l lVar, y yVar) {
        C3645a.h(this.f50117a);
        if (this.f50118b == null) {
            if (e(lVar)) {
                lVar.e();
            } else {
                throw L0.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f50119c) {
            C3962B d10 = this.f50117a.d(0, 1);
            this.f50117a.k();
            this.f50118b.d(this.f50117a, d10);
            this.f50119c = true;
        }
        return this.f50118b.g(lVar, yVar);
    }

    public void release() {
    }
}
