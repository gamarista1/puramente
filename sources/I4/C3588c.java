package i4;

import Gh.C5405f;
import Gh.C5406g;
import kotlin.Lazy;
import lf.C6531o;
import lf.C6534r;
import o4.l;
import rh.C6707d;
import rh.E;
import rh.u;
import rh.y;

/* renamed from: i4.c  reason: case insensitive filesystem */
public final class C3588c {

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f44175a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f44176b;

    /* renamed from: c  reason: collision with root package name */
    private final long f44177c;

    /* renamed from: d  reason: collision with root package name */
    private final long f44178d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f44179e;

    /* renamed from: f  reason: collision with root package name */
    private final u f44180f;

    public C3588c(C5406g gVar) {
        C6534r rVar = C6534r.NONE;
        this.f44175a = C6531o.a(rVar, new C3586a(this));
        this.f44176b = C6531o.a(rVar, new C3587b(this));
        this.f44177c = Long.parseLong(gVar.i0());
        this.f44178d = Long.parseLong(gVar.i0());
        this.f44179e = Integer.parseInt(gVar.i0()) > 0;
        int parseInt = Integer.parseInt(gVar.i0());
        u.a aVar = new u.a();
        for (int i10 = 0; i10 < parseInt; i10++) {
            l.b(aVar, gVar.i0());
        }
        this.f44180f = aVar.f();
    }

    /* access modifiers changed from: private */
    public static final C6707d c(C3588c cVar) {
        return C6707d.f73247n.b(cVar.f44180f);
    }

    /* access modifiers changed from: private */
    public static final y d(C3588c cVar) {
        String a10 = cVar.f44180f.a("Content-Type");
        if (a10 != null) {
            return y.f73499e.b(a10);
        }
        return null;
    }

    public final C6707d e() {
        return (C6707d) this.f44175a.getValue();
    }

    public final y f() {
        return (y) this.f44176b.getValue();
    }

    public final long g() {
        return this.f44178d;
    }

    public final u h() {
        return this.f44180f;
    }

    public final long i() {
        return this.f44177c;
    }

    public final boolean j() {
        return this.f44179e;
    }

    public final void k(C5405f fVar) {
        long j10;
        fVar.v0(this.f44177c).K0(10);
        fVar.v0(this.f44178d).K0(10);
        if (this.f44179e) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        fVar.v0(j10).K0(10);
        fVar.v0((long) this.f44180f.size()).K0(10);
        int size = this.f44180f.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.X(this.f44180f.g(i10)).X(": ").X(this.f44180f.x(i10)).K0(10);
        }
    }

    public C3588c(E e10) {
        C6534r rVar = C6534r.NONE;
        this.f44175a = C6531o.a(rVar, new C3586a(this));
        this.f44176b = C6531o.a(rVar, new C3587b(this));
        this.f44177c = e10.h0();
        this.f44178d = e10.f0();
        this.f44179e = e10.t() != null;
        this.f44180f = e10.F();
    }
}
