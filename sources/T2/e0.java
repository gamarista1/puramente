package t2;

import android.net.Uri;
import com.google.common.collect.C4770v;
import f2.H;
import f2.s;
import f2.w;
import i2.C2076a;
import k2.f;
import k2.j;
import k2.x;
import nb.C5114i;
import t2.C2615C;
import w2.C2820b;
import w2.C2826h;
import w2.C2827i;

public final class e0 extends C2635a {

    /* renamed from: h  reason: collision with root package name */
    private final j f26230h;

    /* renamed from: i  reason: collision with root package name */
    private final f.a f26231i;

    /* renamed from: j  reason: collision with root package name */
    private final s f26232j;

    /* renamed from: k  reason: collision with root package name */
    private final long f26233k;

    /* renamed from: l  reason: collision with root package name */
    private final C2827i f26234l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f26235m;

    /* renamed from: n  reason: collision with root package name */
    private final H f26236n;

    /* renamed from: o  reason: collision with root package name */
    private final w f26237o;

    /* renamed from: p  reason: collision with root package name */
    private x f26238p;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f.a f26239a;

        /* renamed from: b  reason: collision with root package name */
        private C2827i f26240b = new C2826h();

        /* renamed from: c  reason: collision with root package name */
        private boolean f26241c = true;

        /* renamed from: d  reason: collision with root package name */
        private Object f26242d;

        /* renamed from: e  reason: collision with root package name */
        private String f26243e;

        public b(f.a aVar) {
            this.f26239a = (f.a) C2076a.e(aVar);
        }

        public e0 a(w.k kVar, long j10) {
            return new e0(this.f26243e, kVar, this.f26239a, j10, this.f26240b, this.f26241c, this.f26242d);
        }

        public b b(C2827i iVar) {
            if (iVar == null) {
                iVar = new C2826h();
            }
            this.f26240b = iVar;
            return this;
        }
    }

    public w a() {
        return this.f26237o;
    }

    public void j(C2614B b10) {
        ((d0) b10).u();
    }

    public C2614B o(C2615C.b bVar, C2820b bVar2, long j10) {
        return new d0(this.f26230h, this.f26231i, this.f26238p, this.f26232j, this.f26233k, this.f26234l, t(bVar), this.f26235m);
    }

    /* access modifiers changed from: protected */
    public void y(x xVar) {
        this.f26238p = xVar;
        z(this.f26236n);
    }

    private e0(String str, w.k kVar, f.a aVar, long j10, C2827i iVar, boolean z10, Object obj) {
        w.k kVar2 = kVar;
        this.f26231i = aVar;
        this.f26233k = j10;
        this.f26234l = iVar;
        this.f26235m = z10;
        w a10 = new w.c().f(Uri.EMPTY).c(kVar2.f20275a.toString()).d(C4770v.H(kVar)).e(obj).a();
        this.f26237o = a10;
        s.b c02 = new s.b().o0((String) C5114i.a(kVar2.f20276b, "text/x-unknown")).e0(kVar2.f20277c).q0(kVar2.f20278d).m0(kVar2.f20279e).c0(kVar2.f20280f);
        String str2 = kVar2.f20281g;
        this.f26232j = c02.a0(str2 == null ? str : str2).K();
        this.f26230h = new j.b().h(kVar2.f20275a).b(1).a();
        this.f26236n = new c0(j10, true, false, false, (Object) null, a10);
    }

    /* access modifiers changed from: protected */
    public void A() {
    }

    public void c() {
    }
}
