package U;

import B.n;
import Ug.K;
import Y.A1;
import Y.C1510r0;
import Y.T0;
import Y.o1;
import android.view.ViewGroup;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2427m;
import r0.C2448H;
import r0.C2520p0;
import r0.C2544x0;
import t0.C2602c;
import yf.C6787a;

public final class a extends o implements T0, k {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6193c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6194d;

    /* renamed from: e  reason: collision with root package name */
    private final A1 f6195e;

    /* renamed from: f  reason: collision with root package name */
    private final A1 f6196f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f6197g;

    /* renamed from: h  reason: collision with root package name */
    private j f6198h;

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f6199i;

    /* renamed from: j  reason: collision with root package name */
    private final C1510r0 f6200j;

    /* renamed from: k  reason: collision with root package name */
    private long f6201k;

    /* renamed from: l  reason: collision with root package name */
    private int f6202l;

    /* renamed from: m  reason: collision with root package name */
    private final C6787a f6203m;

    /* renamed from: U.a$a  reason: collision with other inner class name */
    static final class C0144a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f6204a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0144a(a aVar) {
            super(0);
            this.f6204a = aVar;
        }

        public final void invoke() {
            a aVar = this.f6204a;
            aVar.o(!aVar.l());
        }
    }

    public /* synthetic */ a(boolean z10, float f10, A1 a12, A1 a13, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, a12, a13, viewGroup);
    }

    private final void k() {
        j jVar = this.f6198h;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    /* access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.f6200j.getValue()).booleanValue();
    }

    private final j m() {
        j jVar = this.f6198h;
        if (jVar != null) {
            C6496s.e(jVar);
            return jVar;
        }
        j a10 = t.c(this.f6197g);
        this.f6198h = a10;
        C6496s.e(a10);
        return a10;
    }

    private final n n() {
        return (n) this.f6199i.getValue();
    }

    /* access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f6200j.setValue(Boolean.valueOf(z10));
    }

    private final void p(n nVar) {
        this.f6199i.setValue(nVar);
    }

    public void a(C2602c cVar) {
        int i10;
        this.f6201k = cVar.d();
        if (Float.isNaN(this.f6194d)) {
            i10 = Af.a.d(i.a(cVar, this.f6193c, cVar.d()));
        } else {
            i10 = cVar.E0(this.f6194d);
        }
        this.f6202l = i10;
        long y10 = ((C2544x0) this.f6195e.getValue()).y();
        float d10 = ((g) this.f6196f.getValue()).d();
        cVar.H1();
        f(cVar, this.f6194d, y10);
        C2520p0 f10 = cVar.w1().f();
        l();
        n n10 = n();
        if (n10 != null) {
            n10.f(cVar.d(), y10, d10);
            n10.draw(C2448H.d(f10));
        }
    }

    public void c() {
        k();
    }

    public void d() {
        k();
    }

    public void e(n.b bVar, K k10) {
        n b10 = m().b(this);
        b10.b(bVar, this.f6193c, this.f6201k, this.f6202l, ((C2544x0) this.f6195e.getValue()).y(), ((g) this.f6196f.getValue()).d(), this.f6203m);
        p(b10);
    }

    public void g(n.b bVar) {
        n n10 = n();
        if (n10 != null) {
            n10.e();
        }
    }

    public void k1() {
        p((n) null);
    }

    private a(boolean z10, float f10, A1 a12, A1 a13, ViewGroup viewGroup) {
        super(z10, a13);
        this.f6193c = z10;
        this.f6194d = f10;
        this.f6195e = a12;
        this.f6196f = a13;
        this.f6197g = viewGroup;
        this.f6199i = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f6200j = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);
        this.f6201k = C2427m.f25341b.b();
        this.f6202l = -1;
        this.f6203m = new C0144a(this);
    }

    public void b() {
    }
}
