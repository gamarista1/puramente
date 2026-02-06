package s0;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import r0.C2550z0;
import yf.C6798l;

public final class x extends C2581c {

    /* renamed from: t  reason: collision with root package name */
    public static final a f25859t = new a((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    private static final C2588j f25860u = new q();

    /* renamed from: e  reason: collision with root package name */
    private final z f25861e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final float f25862f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final float f25863g;

    /* renamed from: h  reason: collision with root package name */
    private final y f25864h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f25865i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f25866j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f25867k;

    /* renamed from: l  reason: collision with root package name */
    private final C2588j f25868l;

    /* renamed from: m  reason: collision with root package name */
    private final C6798l f25869m;

    /* renamed from: n  reason: collision with root package name */
    private final C2588j f25870n;

    /* renamed from: o  reason: collision with root package name */
    private final C2588j f25871o;

    /* renamed from: p  reason: collision with root package name */
    private final C6798l f25872p;

    /* renamed from: q  reason: collision with root package name */
    private final C2588j f25873q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f25874r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f25875s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] fArr) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float f16 = ((((((f10 * f13) + (f11 * f14)) + (f12 * f15)) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
            if (f16 < 0.0f) {
                return -f16;
            }
            return f16;
        }

        private final boolean f(double d10, C2588j jVar, C2588j jVar2) {
            if (Math.abs(jVar.a(d10) - jVar2.a(d10)) <= 0.001d) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        public final float[] g(float[] fArr, z zVar) {
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            float a10 = zVar.a();
            float b10 = zVar.b();
            float f16 = (float) 1;
            float f17 = (f16 - f10) / f11;
            float f18 = f10 / f11;
            float f19 = (f12 / f13) - f18;
            float f20 = (a10 / b10) - f18;
            float f21 = ((f16 - f12) / f13) - f17;
            float f22 = (f14 / f15) - f18;
            float f23 = (((((f16 - a10) / b10) - f17) * f19) - (f20 * f21)) / (((((f16 - f14) / f15) - f17) * f19) - (f21 * f22));
            float f24 = (f20 - (f22 * f23)) / f19;
            float f25 = (1.0f - f24) - f23;
            float f26 = f25 / f11;
            float f27 = f24 / f13;
            float f28 = f23 / f15;
            return new float[]{f26 * f10, f25, f26 * ((1.0f - f10) - f11), f27 * f12, f24, f27 * ((1.0f - f12) - f13), f28 * f14, f23, f28 * ((1.0f - f14) - f15)};
        }

        private final boolean h(float[] fArr, float[] fArr2) {
            float f10 = fArr[0];
            float f11 = fArr2[0];
            float f12 = fArr[1];
            float f13 = fArr2[1];
            float f14 = fArr[4];
            float f15 = fArr2[4];
            float f16 = fArr[5];
            float f17 = fArr2[5];
            float[] fArr3 = {f10 - f11, f12 - f13, fArr[2] - fArr2[2], fArr[3] - fArr2[3], f14 - f15, f16 - f17};
            if (i(fArr3[0], fArr3[1], f11 - f15, f13 - f17) < 0.0f || i(fArr2[0] - fArr2[2], fArr2[1] - fArr2[3], fArr3[0], fArr3[1]) < 0.0f || i(fArr3[2], fArr3[3], fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]) < 0.0f || i(fArr2[2] - fArr2[4], fArr2[3] - fArr2[5], fArr3[2], fArr3[3]) < 0.0f || i(fArr3[4], fArr3[5], fArr2[4] - fArr2[2], fArr2[5] - fArr2[3]) < 0.0f || i(fArr2[4] - fArr2[0], fArr2[5] - fArr2[1], fArr3[4], fArr3[5]) < 0.0f) {
                return false;
            }
            return true;
        }

        private final float i(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        /* access modifiers changed from: private */
        public final boolean j(float[] fArr, z zVar, C2588j jVar, C2588j jVar2, float f10, float f11, int i10) {
            if (i10 == 0) {
                return true;
            }
            C2585g gVar = C2585g.f25794a;
            if (!C2582d.g(fArr, gVar.x()) || !C2582d.f(zVar, k.f25829a.e()) || f10 != 0.0f || f11 != 1.0f) {
                return false;
            }
            x w10 = gVar.w();
            for (double d10 = 0.0d; d10 <= 1.0d; d10 += 0.00392156862745098d) {
                if (!f(d10, jVar, w10.J()) || !f(d10, jVar2, w10.F())) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final boolean k(float[] fArr, float f10, float f11) {
            float e10 = e(fArr);
            C2585g gVar = C2585g.f25794a;
            if ((e10 / e(gVar.s()) <= 0.9f || !h(fArr, gVar.x())) && (f10 >= 0.0f || f11 <= 1.0f)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final float[] l(float[] fArr) {
            float[] fArr2 = new float[6];
            if (fArr.length == 9) {
                float f10 = fArr[0];
                float f11 = fArr[1];
                float f12 = f10 + f11 + fArr[2];
                fArr2[0] = f10 / f12;
                fArr2[1] = f11 / f12;
                float f13 = fArr[3];
                float f14 = fArr[4];
                float f15 = f13 + f14 + fArr[5];
                fArr2[2] = f13 / f15;
                fArr2[3] = f14 / f15;
                float f16 = fArr[6];
                float f17 = fArr[7];
                float f18 = f16 + f17 + fArr[8];
                fArr2[4] = f16 / f18;
                fArr2[5] = f17 / f18;
            } else {
                C6559l.o(fArr, fArr2, 0, 0, 6, 6, (Object) null);
            }
            return fArr2;
        }

        private a() {
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f25876a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(x xVar) {
            super(1);
            this.f25876a = xVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(this.f25876a.F().a(m.j(d10, (double) this.f25876a.f25862f, (double) this.f25876a.f25863g)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f25877a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(1);
            this.f25877a = xVar;
        }

        public final Double a(double d10) {
            return Double.valueOf(m.j(this.f25877a.J().a(d10), (double) this.f25877a.f25862f, (double) this.f25877a.f25863g));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).doubleValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(String str, float[] fArr, z zVar, float[] fArr2, C2588j jVar, C2588j jVar2, float f10, float f11, y yVar, int i10) {
        super(str, C2580b.f25785a.b(), i10, (DefaultConstructorMarker) null);
        float[] fArr3 = fArr;
        z zVar2 = zVar;
        float[] fArr4 = fArr2;
        float f12 = f10;
        float f13 = f11;
        this.f25861e = zVar2;
        this.f25862f = f12;
        this.f25863g = f13;
        this.f25864h = yVar;
        this.f25868l = jVar;
        this.f25869m = new c(this);
        this.f25870n = new o(this);
        this.f25871o = jVar2;
        this.f25872p = new b(this);
        this.f25873q = new p(this);
        if (fArr3.length != 6 && fArr3.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f12 < f13) {
            a aVar = f25859t;
            float[] d10 = aVar.l(fArr3);
            this.f25865i = d10;
            if (fArr4 == null) {
                this.f25866j = aVar.g(d10, zVar2);
            } else if (fArr4.length == 9) {
                this.f25866j = fArr4;
            } else {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr4.length);
            }
            this.f25867k = C2582d.k(this.f25866j);
            this.f25874r = aVar.k(d10, f12, f13);
            this.f25875s = aVar.j(d10, zVar, jVar, jVar2, f10, f11, i10);
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f12 + ", max=" + f13 + "; min must be strictly < max");
        }
    }

    /* access modifiers changed from: private */
    public static final double C(x xVar, double d10) {
        return xVar.f25871o.a(m.j(d10, (double) xVar.f25862f, (double) xVar.f25863g));
    }

    /* access modifiers changed from: private */
    public static final double O(x xVar, double d10) {
        return m.j(xVar.f25868l.a(d10), (double) xVar.f25862f, (double) xVar.f25863g);
    }

    /* access modifiers changed from: private */
    public static final double u(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, 1.0d / d10);
    }

    /* access modifiers changed from: private */
    public static final double v(double d10, double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        }
        return Math.pow(d11, d10);
    }

    /* access modifiers changed from: private */
    public static final double w(y yVar, double d10) {
        return C2582d.o(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double x(y yVar, double d10) {
        return C2582d.p(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double y(y yVar, double d10) {
        return C2582d.q(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.g());
    }

    /* access modifiers changed from: private */
    public static final double z(y yVar, double d10) {
        return C2582d.r(d10, yVar.a(), yVar.b(), yVar.c(), yVar.d(), yVar.e(), yVar.f(), yVar.g());
    }

    public final C6798l D() {
        return this.f25872p;
    }

    public final C2588j E() {
        return this.f25873q;
    }

    public final C2588j F() {
        return this.f25871o;
    }

    public final float[] G() {
        return this.f25867k;
    }

    public final C6798l H() {
        return this.f25869m;
    }

    public final C2588j I() {
        return this.f25870n;
    }

    public final C2588j J() {
        return this.f25868l;
    }

    public final float[] K() {
        return this.f25865i;
    }

    public final y L() {
        return this.f25864h;
    }

    public final float[] M() {
        return this.f25866j;
    }

    public final z N() {
        return this.f25861e;
    }

    public float c(int i10) {
        return this.f25863g;
    }

    public float d(int i10) {
        return this.f25862f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x xVar = (x) obj;
        if (Float.compare(xVar.f25862f, this.f25862f) != 0 || Float.compare(xVar.f25863g, this.f25863g) != 0 || !C6496s.c(this.f25861e, xVar.f25861e) || !Arrays.equals(this.f25865i, xVar.f25865i)) {
            return false;
        }
        y yVar = this.f25864h;
        if (yVar != null) {
            return C6496s.c(yVar, xVar.f25864h);
        }
        if (xVar.f25864h == null) {
            return true;
        }
        if (!C6496s.c(this.f25868l, xVar.f25868l)) {
            return false;
        }
        return C6496s.c(this.f25871o, xVar.f25871o);
    }

    public boolean g() {
        return this.f25875s;
    }

    public long h(float f10, float f11, float f12) {
        float a10 = (float) this.f25873q.a((double) f10);
        float a11 = (float) this.f25873q.a((double) f11);
        float a12 = (float) this.f25873q.a((double) f12);
        float[] fArr = this.f25866j;
        return (((long) Float.floatToRawIntBits(((fArr[0] * a10) + (fArr[3] * a11)) + (fArr[6] * a12))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * a10) + (fArr[4] * a11) + (fArr[7] * a12))) & 4294967295L);
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = ((((super.hashCode() * 31) + this.f25861e.hashCode()) * 31) + Arrays.hashCode(this.f25865i)) * 31;
        float f10 = this.f25862f;
        int i12 = 0;
        if (f10 == 0.0f) {
            i10 = 0;
        } else {
            i10 = Float.floatToIntBits(f10);
        }
        int i13 = (hashCode + i10) * 31;
        float f11 = this.f25863g;
        if (f11 == 0.0f) {
            i11 = 0;
        } else {
            i11 = Float.floatToIntBits(f11);
        }
        int i14 = (i13 + i11) * 31;
        y yVar = this.f25864h;
        if (yVar != null) {
            i12 = yVar.hashCode();
        }
        int i15 = i14 + i12;
        if (this.f25864h == null) {
            return (((i15 * 31) + this.f25868l.hashCode()) * 31) + this.f25871o.hashCode();
        }
        return i15;
    }

    public float i(float f10, float f11, float f12) {
        float a10 = (float) this.f25873q.a((double) f10);
        float a11 = (float) this.f25873q.a((double) f11);
        float a12 = (float) this.f25873q.a((double) f12);
        float[] fArr = this.f25866j;
        return (fArr[2] * a10) + (fArr[5] * a11) + (fArr[8] * a12);
    }

    public long j(float f10, float f11, float f12, float f13, C2581c cVar) {
        float[] fArr = this.f25867k;
        return C2550z0.a((float) this.f25870n.a((double) ((fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12))), (float) this.f25870n.a((double) ((fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12))), (float) this.f25870n.a((double) ((fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12))), f13, cVar);
    }

    /* access modifiers changed from: private */
    public static final double t(double d10) {
        return d10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(java.lang.String r12, float[] r13, s0.z r14, s0.y r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r15.e()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            double r0 = r15.f()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            s0.t r0 = new s0.t
            r0.<init>(r15)
        L_0x0018:
            r5 = r0
            goto L_0x0020
        L_0x001a:
            s0.u r0 = new s0.u
            r0.<init>(r15)
            goto L_0x0018
        L_0x0020:
            double r0 = r15.e()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            double r0 = r15.f()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            s0.v r0 = new s0.v
            r0.<init>(r15)
        L_0x0035:
            r6 = r0
            goto L_0x003d
        L_0x0037:
            s0.w r0 = new s0.w
            r0.<init>(r15)
            goto L_0x0035
        L_0x003d:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.x.<init>(java.lang.String, float[], s0.z, s0.y, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(java.lang.String r21, float[] r22, s0.z r23, double r24, float r26, float r27, int r28) {
        /*
            r20 = this;
            r1 = r24
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            s0.j r3 = f25860u
        L_0x000a:
            r17 = r3
            goto L_0x0013
        L_0x000d:
            s0.r r3 = new s0.r
            r3.<init>(r1)
            goto L_0x000a
        L_0x0013:
            if (r0 != 0) goto L_0x001a
            s0.j r0 = f25860u
        L_0x0017:
            r18 = r0
            goto L_0x0020
        L_0x001a:
            s0.s r0 = new s0.s
            r0.<init>(r1)
            goto L_0x0017
        L_0x0020:
            s0.y r19 = new s0.y
            r0 = r19
            r15 = 96
            r16 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r1 = r24
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r8 = 0
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r9 = r17
            r10 = r18
            r11 = r26
            r12 = r27
            r13 = r19
            r14 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.x.<init>(java.lang.String, float[], s0.z, double, float, float, int):void");
    }

    public x(x xVar, float[] fArr, z zVar) {
        this(xVar.f(), xVar.f25865i, zVar, fArr, xVar.f25868l, xVar.f25871o, xVar.f25862f, xVar.f25863g, xVar.f25864h, -1);
    }
}
