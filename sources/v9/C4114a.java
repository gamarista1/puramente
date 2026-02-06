package v9;

import D9.a;
import J9.b;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ja.B;
import ja.C3645a;
import k9.C3717q0;
import q9.k;
import q9.l;
import q9.m;
import q9.y;
import q9.z;

/* renamed from: v9.a  reason: case insensitive filesystem */
public final class C4114a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final B f48967a = new B(6);

    /* renamed from: b  reason: collision with root package name */
    private m f48968b;

    /* renamed from: c  reason: collision with root package name */
    private int f48969c;

    /* renamed from: d  reason: collision with root package name */
    private int f48970d;

    /* renamed from: e  reason: collision with root package name */
    private int f48971e;

    /* renamed from: f  reason: collision with root package name */
    private long f48972f = -1;

    /* renamed from: g  reason: collision with root package name */
    private b f48973g;

    /* renamed from: h  reason: collision with root package name */
    private l f48974h;

    /* renamed from: i  reason: collision with root package name */
    private c f48975i;

    /* renamed from: j  reason: collision with root package name */
    private y9.k f48976j;

    private void b(l lVar) {
        this.f48967a.L(2);
        lVar.l(this.f48967a.d(), 0, 2);
        lVar.h(this.f48967a.J() - 2);
    }

    private void c() {
        e(new a.b[0]);
        ((m) C3645a.e(this.f48968b)).k();
        this.f48968b.q(new z.b(-9223372036854775807L));
        this.f48969c = 6;
    }

    private static b d(String str, long j10) {
        C4115b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void e(a.b... bVarArr) {
        ((m) C3645a.e(this.f48968b)).d(1024, 4).c(new C3717q0.b().K(ClipboardModule.MIMETYPE_JPEG).X(new a(bVarArr)).E());
    }

    private int g(l lVar) {
        this.f48967a.L(2);
        lVar.l(this.f48967a.d(), 0, 2);
        return this.f48967a.J();
    }

    private void j(l lVar) {
        this.f48967a.L(2);
        lVar.readFully(this.f48967a.d(), 0, 2);
        int J10 = this.f48967a.J();
        this.f48970d = J10;
        if (J10 == 65498) {
            if (this.f48972f != -1) {
                this.f48969c = 4;
            } else {
                c();
            }
        } else if ((J10 < 65488 || J10 > 65497) && J10 != 65281) {
            this.f48969c = 1;
        }
    }

    private void k(l lVar) {
        String x10;
        if (this.f48970d == 65505) {
            B b10 = new B(this.f48971e);
            lVar.readFully(b10.d(), 0, this.f48971e);
            if (this.f48973g == null && "http://ns.adobe.com/xap/1.0/".equals(b10.x()) && (x10 = b10.x()) != null) {
                b d10 = d(x10, lVar.a());
                this.f48973g = d10;
                if (d10 != null) {
                    this.f48972f = d10.f32219d;
                }
            }
        } else {
            lVar.j(this.f48971e);
        }
        this.f48969c = 0;
    }

    private void l(l lVar) {
        this.f48967a.L(2);
        lVar.readFully(this.f48967a.d(), 0, 2);
        this.f48971e = this.f48967a.J() - 2;
        this.f48969c = 2;
    }

    private void m(l lVar) {
        if (!lVar.c(this.f48967a.d(), 0, 1, true)) {
            c();
            return;
        }
        lVar.e();
        if (this.f48976j == null) {
            this.f48976j = new y9.k();
        }
        c cVar = new c(lVar, this.f48972f);
        this.f48975i = cVar;
        if (this.f48976j.h(cVar)) {
            this.f48976j.f(new d(this.f48972f, (m) C3645a.e(this.f48968b)));
            n();
            return;
        }
        c();
    }

    private void n() {
        e((a.b) C3645a.e(this.f48973g));
        this.f48969c = 5;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f48969c = 0;
            this.f48976j = null;
        } else if (this.f48969c == 5) {
            ((y9.k) C3645a.e(this.f48976j)).a(j10, j11);
        }
    }

    public void f(m mVar) {
        this.f48968b = mVar;
    }

    public boolean h(l lVar) {
        if (g(lVar) != 65496) {
            return false;
        }
        int g10 = g(lVar);
        this.f48970d = g10;
        if (g10 == 65504) {
            b(lVar);
            this.f48970d = g(lVar);
        }
        if (this.f48970d != 65505) {
            return false;
        }
        lVar.h(2);
        this.f48967a.L(6);
        lVar.l(this.f48967a.d(), 0, 6);
        if (this.f48967a.F() == 1165519206 && this.f48967a.J() == 0) {
            return true;
        }
        return false;
    }

    public int i(l lVar, y yVar) {
        int i10 = this.f48969c;
        if (i10 == 0) {
            j(lVar);
            return 0;
        } else if (i10 == 1) {
            l(lVar);
            return 0;
        } else if (i10 == 2) {
            k(lVar);
            return 0;
        } else if (i10 == 4) {
            long position = lVar.getPosition();
            long j10 = this.f48972f;
            if (position != j10) {
                yVar.f47919a = j10;
                return 1;
            }
            m(lVar);
            return 0;
        } else if (i10 == 5) {
            if (this.f48975i == null || lVar != this.f48974h) {
                this.f48974h = lVar;
                this.f48975i = new c(lVar, this.f48972f);
            }
            int i11 = ((y9.k) C3645a.e(this.f48976j)).i(this.f48975i, yVar);
            if (i11 == 1) {
                yVar.f47919a += this.f48972f;
            }
            return i11;
        } else if (i10 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
        y9.k kVar = this.f48976j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
