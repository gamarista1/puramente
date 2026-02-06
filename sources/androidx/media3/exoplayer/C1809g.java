package androidx.media3.exoplayer;

import f2.C1963D;
import i2.C2076a;
import i2.C2078c;
import m2.C2191C;
import m2.y;

/* renamed from: androidx.media3.exoplayer.g  reason: case insensitive filesystem */
final class C1809g implements y {

    /* renamed from: a  reason: collision with root package name */
    private final C2191C f17685a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17686b;

    /* renamed from: c  reason: collision with root package name */
    private q0 f17687c;

    /* renamed from: d  reason: collision with root package name */
    private y f17688d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17689e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f17690f;

    /* renamed from: androidx.media3.exoplayer.g$a */
    public interface a {
        void B(C1963D d10);
    }

    public C1809g(a aVar, C2078c cVar) {
        this.f17686b = aVar;
        this.f17685a = new C2191C(cVar);
    }

    private boolean e(boolean z10) {
        q0 q0Var = this.f17687c;
        if (q0Var == null || q0Var.b() || ((z10 && this.f17687c.getState() != 2) || (!this.f17687c.d() && (z10 || this.f17687c.h())))) {
            return true;
        }
        return false;
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f17689e = true;
            if (this.f17690f) {
                this.f17685a.b();
                return;
            }
            return;
        }
        y yVar = (y) C2076a.e(this.f17688d);
        long u10 = yVar.u();
        if (this.f17689e) {
            if (u10 < this.f17685a.u()) {
                this.f17685a.d();
                return;
            }
            this.f17689e = false;
            if (this.f17690f) {
                this.f17685a.b();
            }
        }
        this.f17685a.a(u10);
        C1963D c10 = yVar.c();
        if (!c10.equals(this.f17685a.c())) {
            this.f17685a.f(c10);
            this.f17686b.B(c10);
        }
    }

    public boolean H() {
        if (this.f17689e) {
            return this.f17685a.H();
        }
        return ((y) C2076a.e(this.f17688d)).H();
    }

    public void a(q0 q0Var) {
        if (q0Var == this.f17687c) {
            this.f17688d = null;
            this.f17687c = null;
            this.f17689e = true;
        }
    }

    public void b(q0 q0Var) {
        y yVar;
        y A10 = q0Var.A();
        if (A10 != null && A10 != (yVar = this.f17688d)) {
            if (yVar == null) {
                this.f17688d = A10;
                this.f17687c = q0Var;
                A10.f(this.f17685a.c());
                return;
            }
            throw C1810h.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public C1963D c() {
        y yVar = this.f17688d;
        if (yVar != null) {
            return yVar.c();
        }
        return this.f17685a.c();
    }

    public void d(long j10) {
        this.f17685a.a(j10);
    }

    public void f(C1963D d10) {
        y yVar = this.f17688d;
        if (yVar != null) {
            yVar.f(d10);
            d10 = this.f17688d.c();
        }
        this.f17685a.f(d10);
    }

    public void g() {
        this.f17690f = true;
        this.f17685a.b();
    }

    public void h() {
        this.f17690f = false;
        this.f17685a.d();
    }

    public long i(boolean z10) {
        j(z10);
        return u();
    }

    public long u() {
        if (this.f17689e) {
            return this.f17685a.u();
        }
        return ((y) C2076a.e(this.f17688d)).u();
    }
}
