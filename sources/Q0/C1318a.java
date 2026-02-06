package Q0;

import R0.M;
import R0.l0;
import S0.h;
import Y0.c;
import Y0.d;
import Y0.g;
import a1.C1541b;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import b1.i;
import b1.k;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2423i;
import q0.C2428n;
import r0.C2448H;
import r0.C2472Y;
import r0.C2514n0;
import r0.C2520p0;
import r0.S1;
import r0.Z1;
import r0.e2;
import t0.C2606g;
import yf.p;

/* renamed from: Q0.a  reason: case insensitive filesystem */
public final class C1318a implements C1333p {

    /* renamed from: a  reason: collision with root package name */
    private final d f5302a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5303b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5304c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5305d;

    /* renamed from: e  reason: collision with root package name */
    private final l0 f5306e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f5307f;

    /* renamed from: g  reason: collision with root package name */
    private final List f5308g;

    /* renamed from: Q0.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0132a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5309a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                b1.i[] r0 = b1.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b1.i r1 = b1.i.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                b1.i r1 = b1.i.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f5309a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Q0.C1318a.C0132a.<clinit>():void");
        }
    }

    /* renamed from: Q0.a$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ I f5310a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(I i10) {
            super(2);
            this.f5310a = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f5310a.a(Z1.f(rectF), Z1.f(rectF2)));
        }
    }

    public /* synthetic */ C1318a(d dVar, int i10, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, j10);
    }

    private final l0 F(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i17 = i12;
        int i18 = i13;
        int i19 = i14;
        int i20 = i15;
        int i21 = i16;
        CharSequence charSequence = this.f5307f;
        float e10 = e();
        g I10 = I();
        int j10 = this.f5302a.j();
        M h10 = this.f5302a.h();
        return new l0(charSequence, e10, I10, i10, truncateAt2, j10, 1.0f, 0.0f, c.b(this.f5302a.i()), true, i17, i19, i20, i21, i18, i11, (int[]) null, (int[]) null, h10, 196736, (DefaultConstructorMarker) null);
    }

    private final C1541b[] H(l0 l0Var) {
        if (!(l0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G10 = l0Var.G();
        C6496s.f(G10, "null cannot be cast to non-null type android.text.Spanned");
        Class<C1541b> cls = C1541b.class;
        if (!J((Spanned) G10, cls)) {
            return null;
        }
        CharSequence G11 = l0Var.G();
        C6496s.f(G11, "null cannot be cast to non-null type android.text.Spanned");
        return (C1541b[]) ((Spanned) G11).getSpans(0, l0Var.G().length(), cls);
    }

    private final boolean J(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    private final void K(C2520p0 p0Var) {
        Canvas d10 = C2448H.d(p0Var);
        if (q()) {
            d10.save();
            d10.clipRect(0.0f, 0.0f, e(), d());
        }
        this.f5306e.L(d10);
        if (q()) {
            d10.restore();
        }
    }

    public float A(int i10) {
        return this.f5306e.l(i10);
    }

    public C2423i D(int i10) {
        if (i10 < 0 || i10 >= this.f5307f.length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f5307f.length() + ')').toString());
        }
        RectF c10 = this.f5306e.c(i10);
        return new C2423i(c10.left, c10.top, c10.right, c10.bottom);
    }

    public List E() {
        return this.f5308g;
    }

    public float G(int i10) {
        return this.f5306e.k(i10);
    }

    public final g I() {
        return this.f5302a.k();
    }

    public float a() {
        return this.f5302a.a();
    }

    public float b() {
        return this.f5302a.b();
    }

    public void c(C2520p0 p0Var, long j10, e2 e2Var, k kVar, C2606g gVar, int i10) {
        int b10 = I().b();
        g I10 = I();
        I10.f(j10);
        I10.h(e2Var);
        I10.i(kVar);
        I10.g(gVar);
        I10.d(i10);
        K(p0Var);
        I().d(b10);
    }

    public float d() {
        return (float) this.f5306e.f();
    }

    public float e() {
        return (float) c1.b.l(this.f5305d);
    }

    public i f(int i10) {
        if (this.f5306e.z(this.f5306e.q(i10)) == 1) {
            return i.Ltr;
        }
        return i.Rtl;
    }

    public float g(int i10) {
        return this.f5306e.w(i10);
    }

    public C2423i h(int i10) {
        if (i10 < 0 || i10 > this.f5307f.length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0," + this.f5307f.length() + ']').toString());
        }
        float B10 = l0.B(this.f5306e, i10, false, 2, (Object) null);
        int q10 = this.f5306e.q(i10);
        return new C2423i(B10, this.f5306e.w(q10), B10, this.f5306e.l(q10));
    }

    public long i(int i10) {
        S0.i I10 = this.f5306e.I();
        return S.b(h.b(I10, i10), h.a(I10, i10));
    }

    public float j() {
        return G(0);
    }

    public int k(long j10) {
        return this.f5306e.y(this.f5306e.r((int) C2421g.n(j10)), C2421g.m(j10));
    }

    public int l(int i10) {
        return this.f5306e.v(i10);
    }

    public int m(int i10, boolean z10) {
        if (z10) {
            return this.f5306e.x(i10);
        }
        return this.f5306e.p(i10);
    }

    public int n() {
        return this.f5306e.m();
    }

    public float o(int i10) {
        return this.f5306e.u(i10);
    }

    public void p(C2520p0 p0Var, C2514n0 n0Var, float f10, e2 e2Var, k kVar, C2606g gVar, int i10) {
        int b10 = I().b();
        g I10 = I();
        I10.e(n0Var, C2428n.a(e(), d()), f10);
        I10.h(e2Var);
        I10.i(kVar);
        I10.g(gVar);
        I10.d(i10);
        K(p0Var);
        I().d(b10);
    }

    public boolean q() {
        return this.f5306e.d();
    }

    public int r(float f10) {
        return this.f5306e.r((int) f10);
    }

    public S1 s(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > this.f5307f.length()) {
            throw new IllegalArgumentException(("start(" + i10 + ") or end(" + i11 + ") is out of range [0.." + this.f5307f.length() + "], or start > end!").toString());
        }
        Path path = new Path();
        this.f5306e.F(i10, i11, path);
        return C2472Y.c(path);
    }

    public float t(int i10, boolean z10) {
        if (z10) {
            return l0.B(this.f5306e, i10, false, 2, (Object) null);
        }
        return l0.E(this.f5306e, i10, false, 2, (Object) null);
    }

    public long u(C2423i iVar, int i10, I i11) {
        int[] C10 = this.f5306e.C(Z1.c(iVar), C1319b.r(i10), new b(i11));
        if (C10 == null) {
            return Q.f5291b.a();
        }
        return S.b(C10[0], C10[1]);
    }

    public float v(int i10) {
        return this.f5306e.t(i10);
    }

    public void w(long j10, float[] fArr, int i10) {
        this.f5306e.a(Q.l(j10), Q.k(j10), fArr, i10);
    }

    public float x() {
        return G(n() - 1);
    }

    public int y(int i10) {
        return this.f5306e.q(i10);
    }

    public i z(int i10) {
        if (this.f5306e.K(i10)) {
            return i.Rtl;
        }
        return i.Ltr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d2, code lost:
        r11 = r11 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x020e, code lost:
        r11 = r10 - ((float) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0220, code lost:
        r10 = new q0.C2423i(r7, r11, r8, ((float) r6.b()) + r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1318a(Y0.d r25, int r26, boolean r27, long r28) {
        /*
            r24 = this;
            r9 = r24
            r10 = r26
            r11 = r27
            r24.<init>()
            r0 = r25
            r9.f5302a = r0
            r9.f5303b = r10
            r9.f5304c = r11
            r12 = r28
            r9.f5305d = r12
            int r1 = c1.b.m(r28)
            if (r1 != 0) goto L_0x0241
            int r1 = c1.b.n(r28)
            if (r1 != 0) goto L_0x0241
            r14 = 1
            if (r10 < r14) goto L_0x0239
            Q0.T r15 = r25.i()
            boolean r1 = Q0.C1319b.l(r15, r11)
            if (r1 == 0) goto L_0x0037
            java.lang.CharSequence r0 = r25.f()
            java.lang.CharSequence r0 = Q0.C1319b.j(r0)
            goto L_0x003b
        L_0x0037:
            java.lang.CharSequence r0 = r25.f()
        L_0x003b:
            r9.f5307f = r0
            int r0 = r15.z()
            int r16 = Q0.C1319b.m(r0)
            int r0 = r15.z()
            b1.j$a r1 = b1.j.f19110b
            int r1 = r1.c()
            boolean r17 = b1.j.k(r0, r1)
            Q0.v r0 = r15.v()
            int r0 = r0.c()
            int r18 = Q0.C1319b.o(r0)
            int r0 = r15.r()
            int r0 = b1.C1874f.g(r0)
            int r19 = Q0.C1319b.n(r0)
            int r0 = r15.r()
            int r0 = b1.C1874f.h(r0)
            int r20 = Q0.C1319b.p(r0)
            int r0 = r15.r()
            int r0 = b1.C1874f.i(r0)
            int r21 = Q0.C1319b.q(r0)
            r22 = 0
            if (r11 == 0) goto L_0x008c
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r23 = r0
            goto L_0x008e
        L_0x008c:
            r23 = r22
        L_0x008e:
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r26
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            R0.l0 r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L_0x00d9
            int r1 = r0.f()
            int r2 = c1.b.k(r28)
            if (r1 <= r2) goto L_0x00d9
            if (r10 <= r14) goto L_0x00d9
            int r1 = c1.b.k(r28)
            int r1 = Q0.C1319b.k(r0, r1)
            if (r1 < 0) goto L_0x00d6
            if (r1 == r10) goto L_0x00d6
            int r4 = Ef.m.d(r1, r14)
            r0 = r24
            r1 = r16
            r2 = r17
            r3 = r23
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            R0.l0 r0 = r0.F(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00d6:
            r9.f5306e = r0
            goto L_0x00db
        L_0x00d9:
            r9.f5306e = r0
        L_0x00db:
            Y0.g r0 = r24.I()
            r0.n0 r1 = r15.g()
            float r2 = r24.e()
            float r3 = r24.d()
            long r2 = q0.C2428n.a(r2, r3)
            float r4 = r15.d()
            r0.e(r1, r2, r4)
            R0.l0 r0 = r9.f5306e
            a1.b[] r0 = r9.H(r0)
            if (r0 == 0) goto L_0x011e
            java.util.Iterator r0 = kotlin.jvm.internal.C6481c.a(r0)
        L_0x0102:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x011e
            java.lang.Object r1 = r0.next()
            a1.b r1 = (a1.C1541b) r1
            float r2 = r24.e()
            float r3 = r24.d()
            long r2 = q0.C2428n.a(r2, r3)
            r1.c(r2)
            goto L_0x0102
        L_0x011e:
            java.lang.CharSequence r0 = r9.f5307f
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x012a
            java.util.List r0 = mf.C6565s.n()
            goto L_0x0236
        L_0x012a:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r0 = r0.length()
            java.lang.Class<T0.j> r2 = T0.j.class
            r3 = 0
            java.lang.Object[] r0 = r1.getSpans(r3, r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r0.length
            r2.<init>(r4)
            int r4 = r0.length
            r5 = r3
        L_0x0140:
            if (r5 >= r4) goto L_0x0235
            r6 = r0[r5]
            T0.j r6 = (T0.j) r6
            int r7 = r1.getSpanStart(r6)
            int r8 = r1.getSpanEnd(r6)
            R0.l0 r10 = r9.f5306e
            int r10 = r10.q(r7)
            int r11 = r9.f5303b
            if (r10 < r11) goto L_0x015a
            r11 = r14
            goto L_0x015b
        L_0x015a:
            r11 = r3
        L_0x015b:
            R0.l0 r12 = r9.f5306e
            int r12 = r12.n(r10)
            if (r12 <= 0) goto L_0x016d
            R0.l0 r12 = r9.f5306e
            int r12 = r12.o(r10)
            if (r8 <= r12) goto L_0x016d
            r12 = r14
            goto L_0x016e
        L_0x016d:
            r12 = r3
        L_0x016e:
            R0.l0 r13 = r9.f5306e
            int r13 = r13.p(r10)
            if (r8 <= r13) goto L_0x0178
            r8 = r14
            goto L_0x0179
        L_0x0178:
            r8 = r3
        L_0x0179:
            if (r12 != 0) goto L_0x022c
            if (r8 != 0) goto L_0x022c
            if (r11 == 0) goto L_0x0181
            goto L_0x022c
        L_0x0181:
            b1.i r8 = r9.z(r7)
            int[] r11 = Q0.C1318a.C0132a.f5309a
            int r8 = r8.ordinal()
            r8 = r11[r8]
            r11 = 2
            if (r8 == r14) goto L_0x01a3
            if (r8 != r11) goto L_0x019d
            float r7 = r9.t(r7, r14)
            int r8 = r6.d()
            float r8 = (float) r8
            float r7 = r7 - r8
            goto L_0x01a7
        L_0x019d:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x01a3:
            float r7 = r9.t(r7, r14)
        L_0x01a7:
            int r8 = r6.d()
            float r8 = (float) r8
            float r8 = r8 + r7
            R0.l0 r12 = r9.f5306e
            int r13 = r6.c()
            switch(r13) {
                case 0: goto L_0x0217;
                case 1: goto L_0x0212;
                case 2: goto L_0x0206;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01e7;
                case 5: goto L_0x01d4;
                case 6: goto L_0x01be;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x01be:
            android.graphics.Paint$FontMetricsInt r13 = r6.a()
            int r15 = r13.ascent
            int r13 = r13.descent
            int r15 = r15 + r13
            int r13 = r6.b()
            int r15 = r15 - r13
            int r15 = r15 / r11
            float r11 = (float) r15
            float r10 = r12.k(r10)
        L_0x01d2:
            float r11 = r11 + r10
            goto L_0x0220
        L_0x01d4:
            android.graphics.Paint$FontMetricsInt r11 = r6.a()
            int r11 = r11.descent
            float r11 = (float) r11
            float r10 = r12.k(r10)
            float r11 = r11 + r10
            int r10 = r6.b()
            float r10 = (float) r10
            float r11 = r11 - r10
            goto L_0x0220
        L_0x01e7:
            android.graphics.Paint$FontMetricsInt r11 = r6.a()
            int r11 = r11.ascent
            float r11 = (float) r11
            float r10 = r12.k(r10)
            goto L_0x01d2
        L_0x01f3:
            float r13 = r12.w(r10)
            float r10 = r12.l(r10)
            float r13 = r13 + r10
            int r10 = r6.b()
            float r10 = (float) r10
            float r13 = r13 - r10
            float r10 = (float) r11
            float r11 = r13 / r10
            goto L_0x0220
        L_0x0206:
            float r10 = r12.l(r10)
            int r11 = r6.b()
        L_0x020e:
            float r11 = (float) r11
            float r11 = r10 - r11
            goto L_0x0220
        L_0x0212:
            float r11 = r12.w(r10)
            goto L_0x0220
        L_0x0217:
            float r10 = r12.k(r10)
            int r11 = r6.b()
            goto L_0x020e
        L_0x0220:
            int r6 = r6.b()
            float r6 = (float) r6
            float r6 = r6 + r11
            q0.i r10 = new q0.i
            r10.<init>(r7, r11, r8, r6)
            goto L_0x022e
        L_0x022c:
            r10 = r22
        L_0x022e:
            r2.add(r10)
            int r5 = r5 + 1
            goto L_0x0140
        L_0x0235:
            r0 = r2
        L_0x0236:
            r9.f5308g = r0
            return
        L_0x0239:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            r0.<init>(r1)
            throw r0
        L_0x0241:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.C1318a.<init>(Y0.d, int, boolean, long):void");
    }
}
