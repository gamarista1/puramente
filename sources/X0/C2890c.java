package x0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2472Y;
import r0.C2514n0;
import r0.C2544x0;
import r0.M1;
import r0.S1;
import r0.h2;
import t0.C2603d;
import t0.C2605f;
import t0.C2607h;
import yf.C6798l;

/* renamed from: x0.c  reason: case insensitive filesystem */
public final class C2890c extends l {

    /* renamed from: b  reason: collision with root package name */
    private float[] f28017b;

    /* renamed from: c  reason: collision with root package name */
    private final List f28018c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f28019d = true;

    /* renamed from: e  reason: collision with root package name */
    private long f28020e = C2544x0.f25560b.h();

    /* renamed from: f  reason: collision with root package name */
    private List f28021f = o.d();

    /* renamed from: g  reason: collision with root package name */
    private boolean f28022g = true;

    /* renamed from: h  reason: collision with root package name */
    private S1 f28023h;

    /* renamed from: i  reason: collision with root package name */
    private C6798l f28024i;

    /* renamed from: j  reason: collision with root package name */
    private final C6798l f28025j = new a(this);

    /* renamed from: k  reason: collision with root package name */
    private String f28026k = "";

    /* renamed from: l  reason: collision with root package name */
    private float f28027l;

    /* renamed from: m  reason: collision with root package name */
    private float f28028m;

    /* renamed from: n  reason: collision with root package name */
    private float f28029n;

    /* renamed from: o  reason: collision with root package name */
    private float f28030o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    private float f28031p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    private float f28032q;

    /* renamed from: r  reason: collision with root package name */
    private float f28033r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f28034s = true;

    /* renamed from: x0.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2890c f28035a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2890c cVar) {
            super(1);
            this.f28035a = cVar;
        }

        public final void a(l lVar) {
            this.f28035a.n(lVar);
            C6798l b10 = this.f28035a.b();
            if (b10 != null) {
                b10.invoke(lVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return C6514M.f71813a;
        }
    }

    public C2890c() {
        super((DefaultConstructorMarker) null);
    }

    private final boolean h() {
        return !this.f28021f.isEmpty();
    }

    private final void k() {
        this.f28019d = false;
        this.f28020e = C2544x0.f25560b.h();
    }

    private final void l(C2514n0 n0Var) {
        if (!this.f28019d || n0Var == null) {
            return;
        }
        if (n0Var instanceof h2) {
            m(((h2) n0Var).b());
        } else {
            k();
        }
    }

    private final void m(long j10) {
        if (this.f28019d && j10 != 16) {
            long j11 = this.f28020e;
            if (j11 == 16) {
                this.f28020e = j10;
            } else if (!o.e(j11, j10)) {
                k();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void n(l lVar) {
        if (lVar instanceof C2894g) {
            C2894g gVar = (C2894g) lVar;
            l(gVar.e());
            l(gVar.g());
        } else if (lVar instanceof C2890c) {
            C2890c cVar = (C2890c) lVar;
            if (!cVar.f28019d || !this.f28019d) {
                k();
            } else {
                m(cVar.f28020e);
            }
        }
    }

    private final void x() {
        if (h()) {
            S1 s12 = this.f28023h;
            if (s12 == null) {
                s12 = C2472Y.a();
                this.f28023h = s12;
            }
            k.c(this.f28021f, s12);
        }
    }

    private final void y() {
        float[] fArr = this.f28017b;
        if (fArr == null) {
            fArr = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f28017b = fArr;
        } else {
            M1.h(fArr);
        }
        M1.q(fArr, this.f28028m + this.f28032q, this.f28029n + this.f28033r, 0.0f, 4, (Object) null);
        M1.k(fArr, this.f28027l);
        M1.l(fArr, this.f28030o, this.f28031p, 1.0f);
        M1.q(fArr, -this.f28028m, -this.f28029n, 0.0f, 4, (Object) null);
    }

    public void a(C2605f fVar) {
        if (this.f28034s) {
            y();
            this.f28034s = false;
        }
        if (this.f28022g) {
            x();
            this.f28022g = false;
        }
        C2603d w12 = fVar.w1();
        long d10 = w12.d();
        w12.f().q();
        try {
            C2607h e10 = w12.e();
            float[] fArr = this.f28017b;
            if (fArr != null) {
                e10.a(M1.a(fArr).r());
            }
            S1 s12 = this.f28023h;
            if (h() && s12 != null) {
                C2607h.g(e10, s12, 0, 2, (Object) null);
            }
            List list = this.f28018c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l) list.get(i10)).a(fVar);
            }
            w12.f().h();
            w12.h(d10);
        } catch (Throwable th2) {
            w12.f().h();
            w12.h(d10);
            throw th2;
        }
    }

    public C6798l b() {
        return this.f28024i;
    }

    public void d(C6798l lVar) {
        this.f28024i = lVar;
    }

    public final int f() {
        return this.f28018c.size();
    }

    public final long g() {
        return this.f28020e;
    }

    public final void i(int i10, l lVar) {
        if (i10 < f()) {
            this.f28018c.set(i10, lVar);
        } else {
            this.f28018c.add(lVar);
        }
        n(lVar);
        lVar.d(this.f28025j);
        c();
    }

    public final boolean j() {
        return this.f28019d;
    }

    public final void o(List list) {
        this.f28021f = list;
        this.f28022g = true;
        c();
    }

    public final void p(String str) {
        this.f28026k = str;
        c();
    }

    public final void q(float f10) {
        this.f28028m = f10;
        this.f28034s = true;
        c();
    }

    public final void r(float f10) {
        this.f28029n = f10;
        this.f28034s = true;
        c();
    }

    public final void s(float f10) {
        this.f28027l = f10;
        this.f28034s = true;
        c();
    }

    public final void t(float f10) {
        this.f28030o = f10;
        this.f28034s = true;
        c();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.f28026k);
        List list = this.f28018c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("\t");
            sb2.append(((l) list.get(i10)).toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final void u(float f10) {
        this.f28031p = f10;
        this.f28034s = true;
        c();
    }

    public final void v(float f10) {
        this.f28032q = f10;
        this.f28034s = true;
        c();
    }

    public final void w(float f10) {
        this.f28033r = f10;
        this.f28034s = true;
        c();
    }
}
