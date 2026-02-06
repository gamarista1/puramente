package t2;

import f2.w;
import i2.C2076a;
import k2.x;
import t2.C2615C;
import w2.C2820b;
import w2.C2827i;

/* renamed from: t2.u  reason: case insensitive filesystem */
public final class C2655u extends C2635a {

    /* renamed from: h  reason: collision with root package name */
    private final long f26318h;

    /* renamed from: i  reason: collision with root package name */
    private w f26319i;

    public synchronized w a() {
        return this.f26319i;
    }

    public void j(C2614B b10) {
        ((C2654t) b10).m();
    }

    public synchronized void m(w wVar) {
        this.f26319i = wVar;
    }

    public C2614B o(C2615C.b bVar, C2820b bVar2, long j10) {
        w a10 = a();
        C2076a.e(a10.f20157b);
        C2076a.f(a10.f20157b.f20250b, "Externally loaded mediaItems require a MIME type.");
        w.h hVar = a10.f20157b;
        return new C2654t(hVar.f20249a, hVar.f20250b, (C2653s) null);
    }

    /* access modifiers changed from: protected */
    public void y(x xVar) {
        z(new c0(this.f26318h, true, false, false, (Object) null, a()));
    }

    private C2655u(w wVar, long j10, C2653s sVar) {
        this.f26319i = wVar;
        this.f26318h = j10;
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public void c() {
    }

    /* renamed from: t2.u$b */
    public static final class b implements C2615C.a {

        /* renamed from: c  reason: collision with root package name */
        private final long f26320c;

        public b(long j10, C2653s sVar) {
            this.f26320c = j10;
        }

        /* renamed from: a */
        public C2655u d(w wVar) {
            return new C2655u(wVar, this.f26320c, (C2653s) null);
        }

        public C2615C.a e(p2.w wVar) {
            return this;
        }

        public C2615C.a f(C2827i iVar) {
            return this;
        }
    }
}
