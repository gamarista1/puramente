package Y0;

import Y.A1;
import Z0.d;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import b1.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import q0.C2421g;
import q0.C2427m;
import r0.C2468U;
import r0.C2490f0;
import r0.C2514n0;
import r0.C2550z0;
import r0.Q1;
import r0.R1;
import r0.T1;
import r0.c2;
import r0.e2;
import t0.C2605f;
import t0.C2606g;
import t0.C2609j;
import t0.C2610k;
import yf.C6787a;

public final class g extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    private Q1 f10233a;

    /* renamed from: b  reason: collision with root package name */
    private k f10234b = k.f19119b.c();

    /* renamed from: c  reason: collision with root package name */
    private int f10235c = C2605f.f25940d0.a();

    /* renamed from: d  reason: collision with root package name */
    private e2 f10236d = e2.f25491d.a();

    /* renamed from: e  reason: collision with root package name */
    private C2514n0 f10237e;

    /* renamed from: f  reason: collision with root package name */
    private A1 f10238f;

    /* renamed from: g  reason: collision with root package name */
    private C2427m f10239g;

    /* renamed from: h  reason: collision with root package name */
    private C2606g f10240h;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2514n0 f10241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f10242b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2514n0 n0Var, long j10) {
            super(0);
            this.f10241a = n0Var;
            this.f10242b = j10;
        }

        /* renamed from: a */
        public final Shader invoke() {
            return ((c2) this.f10241a).b(this.f10242b);
        }
    }

    public g(int i10, float f10) {
        super(i10);
        this.density = f10;
    }

    private final void a() {
        this.f10238f = null;
        this.f10237e = null;
        this.f10239g = null;
        setShader((Shader) null);
    }

    private final Q1 c() {
        Q1 q12 = this.f10233a;
        if (q12 != null) {
            return q12;
        }
        Q1 b10 = C2468U.b(this);
        this.f10233a = b10;
        return b10;
    }

    public final int b() {
        return this.f10235c;
    }

    public final void d(int i10) {
        if (!C2490f0.E(i10, this.f10235c)) {
            c().h(i10);
            this.f10235c = i10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(r0.C2514n0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0006
            r4.a()
            goto L_0x006a
        L_0x0006:
            boolean r0 = r5 instanceof r0.h2
            if (r0 == 0) goto L_0x0018
            r0.h2 r5 = (r0.h2) r5
            long r5 = r5.b()
            long r5 = b1.m.c(r5, r8)
            r4.f(r5)
            goto L_0x006a
        L_0x0018:
            boolean r0 = r5 instanceof r0.c2
            if (r0 == 0) goto L_0x006a
            r0.n0 r0 = r4.f10237e
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r5)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            q0.m r0 = r4.f10239g
            if (r0 != 0) goto L_0x002b
            r0 = r1
            goto L_0x0033
        L_0x002b:
            long r2 = r0.o()
            boolean r0 = q0.C2427m.h(r2, r6)
        L_0x0033:
            if (r0 != 0) goto L_0x0054
        L_0x0035:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            r1 = 1
        L_0x003f:
            if (r1 == 0) goto L_0x0054
            r4.f10237e = r5
            q0.m r0 = q0.C2427m.c(r6)
            r4.f10239g = r0
            Y0.g$a r0 = new Y0.g$a
            r0.<init>(r5, r6)
            Y.A1 r5 = Y.p1.e(r0)
            r4.f10238f = r5
        L_0x0054:
            r0.Q1 r5 = r4.c()
            Y.A1 r6 = r4.f10238f
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            r5.r(r6)
            Y0.h.a(r4, r8)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.g.e(r0.n0, long, float):void");
    }

    public final void f(long j10) {
        if (j10 != 16) {
            setColor(C2550z0.k(j10));
            a();
        }
    }

    public final void g(C2606g gVar) {
        if (gVar != null && !C6496s.c(this.f10240h, gVar)) {
            this.f10240h = gVar;
            if (C6496s.c(gVar, C2609j.f25944a)) {
                setStyle(Paint.Style.FILL);
            } else if (gVar instanceof C2610k) {
                c().v(R1.f25451a.b());
                C2610k kVar = (C2610k) gVar;
                c().w(kVar.f());
                c().t(kVar.d());
                c().l(kVar.c());
                c().g(kVar.b());
                Q1 c10 = c();
                kVar.e();
                c10.j((T1) null);
            }
        }
    }

    public final void h(e2 e2Var) {
        if (e2Var != null && !C6496s.c(this.f10236d, e2Var)) {
            this.f10236d = e2Var;
            if (C6496s.c(e2Var, e2.f25491d.a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(d.b(this.f10236d.b()), C2421g.m(this.f10236d.d()), C2421g.n(this.f10236d.d()), C2550z0.k(this.f10236d.c()));
            }
        }
    }

    public final void i(k kVar) {
        if (kVar != null && !C6496s.c(this.f10234b, kVar)) {
            this.f10234b = kVar;
            k.a aVar = k.f19119b;
            setUnderlineText(kVar.d(aVar.d()));
            setStrikeThruText(this.f10234b.d(aVar.b()));
        }
    }
}
