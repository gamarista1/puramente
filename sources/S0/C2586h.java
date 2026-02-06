package s0;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;
import s0.C2580b;

/* renamed from: s0.h  reason: case insensitive filesystem */
public class C2586h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f25818g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C2581c f25819a;

    /* renamed from: b  reason: collision with root package name */
    private final C2581c f25820b;

    /* renamed from: c  reason: collision with root package name */
    private final C2581c f25821c;

    /* renamed from: d  reason: collision with root package name */
    private final C2581c f25822d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25823e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f25824f;

    /* renamed from: s0.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float[] b(C2581c cVar, C2581c cVar2, int i10) {
            float[] fArr;
            float[] fArr2;
            if (!n.e(i10, n.f25846a.a())) {
                return null;
            }
            long e10 = cVar.e();
            C2580b.a aVar = C2580b.f25785a;
            boolean e11 = C2580b.e(e10, aVar.b());
            boolean e12 = C2580b.e(cVar2.e(), aVar.b());
            if (e11 && e12) {
                return null;
            }
            if (!e11 && !e12) {
                return null;
            }
            if (!e11) {
                cVar = cVar2;
            }
            C6496s.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) cVar;
            if (e11) {
                fArr = xVar.N().c();
            } else {
                fArr = k.f25829a.c();
            }
            if (e12) {
                fArr2 = xVar.N().c();
            } else {
                fArr2 = k.f25829a.c();
            }
            return new float[]{fArr[0] / fArr2[0], fArr[1] / fArr2[1], fArr[2] / fArr2[2]};
        }

        public final C2586h c(C2581c cVar) {
            return new C0433a(cVar, n.f25846a.c());
        }

        private a() {
        }

        /* renamed from: s0.h$a$a  reason: collision with other inner class name */
        public static final class C0433a extends C2586h {
            C0433a(C2581c cVar, int i10) {
                super(cVar, cVar, i10, (DefaultConstructorMarker) null);
            }

            public long a(long j10) {
                return j10;
            }
        }
    }

    /* renamed from: s0.h$b */
    public static final class b extends C2586h {

        /* renamed from: h  reason: collision with root package name */
        private final x f25825h;

        /* renamed from: i  reason: collision with root package name */
        private final x f25826i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f25827j;

        public /* synthetic */ b(x xVar, x xVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(xVar, xVar2, i10);
        }

        private final float[] b(x xVar, x xVar2, int i10) {
            if (C2582d.f(xVar.N(), xVar2.N())) {
                return C2582d.l(xVar2.G(), xVar.M());
            }
            float[] M10 = xVar.M();
            float[] G10 = xVar2.G();
            float[] c10 = xVar.N().c();
            float[] c11 = xVar2.N().c();
            z N10 = xVar.N();
            k kVar = k.f25829a;
            if (!C2582d.f(N10, kVar.b())) {
                float[] b10 = C2579a.f25780b.a().b();
                float[] c12 = kVar.c();
                float[] copyOf = Arrays.copyOf(c12, c12.length);
                C6496s.g(copyOf, "copyOf(this, size)");
                M10 = C2582d.l(C2582d.e(b10, c10, copyOf), xVar.M());
            }
            if (!C2582d.f(xVar2.N(), kVar.b())) {
                float[] b11 = C2579a.f25780b.a().b();
                float[] c13 = kVar.c();
                float[] copyOf2 = Arrays.copyOf(c13, c13.length);
                C6496s.g(copyOf2, "copyOf(this, size)");
                G10 = C2582d.k(C2582d.l(C2582d.e(b11, c11, copyOf2), xVar2.M()));
            }
            if (n.e(i10, n.f25846a.a())) {
                M10 = C2582d.m(new float[]{c10[0] / c11[0], c10[1] / c11[1], c10[2] / c11[2]}, M10);
            }
            return C2582d.l(G10, M10);
        }

        public long a(long j10) {
            float v10 = C2544x0.v(j10);
            float u10 = C2544x0.u(j10);
            float s10 = C2544x0.s(j10);
            float r10 = C2544x0.r(j10);
            float a10 = (float) this.f25825h.E().a((double) v10);
            float a11 = (float) this.f25825h.E().a((double) u10);
            float a12 = (float) this.f25825h.E().a((double) s10);
            float[] fArr = this.f25827j;
            return C2550z0.a((float) this.f25826i.I().a((double) ((fArr[0] * a10) + (fArr[3] * a11) + (fArr[6] * a12))), (float) this.f25826i.I().a((double) ((fArr[1] * a10) + (fArr[4] * a11) + (fArr[7] * a12))), (float) this.f25826i.I().a((double) ((fArr[2] * a10) + (fArr[5] * a11) + (fArr[8] * a12))), r10, this.f25826i);
        }

        private b(x xVar, x xVar2, int i10) {
            super(xVar, xVar2, xVar, xVar2, i10, (float[]) null, (DefaultConstructorMarker) null);
            this.f25825h = xVar;
            this.f25826i = xVar2;
            this.f25827j = b(xVar, xVar2, i10);
        }
    }

    public /* synthetic */ C2586h(C2581c cVar, C2581c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, i10);
    }

    public long a(long j10) {
        float v10 = C2544x0.v(j10);
        float u10 = C2544x0.u(j10);
        float s10 = C2544x0.s(j10);
        float r10 = C2544x0.r(j10);
        long h10 = this.f25821c.h(v10, u10, s10);
        float intBitsToFloat = Float.intBitsToFloat((int) (h10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h10 & 4294967295L));
        float i10 = this.f25821c.i(v10, u10, s10);
        float[] fArr = this.f25824f;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            i10 *= fArr[2];
        }
        float f10 = intBitsToFloat;
        return this.f25822d.j(f10, intBitsToFloat2, i10, r10, this.f25820b);
    }

    public /* synthetic */ C2586h(C2581c cVar, C2581c cVar2, C2581c cVar3, C2581c cVar4, int i10, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    private C2586h(C2581c cVar, C2581c cVar2, C2581c cVar3, C2581c cVar4, int i10, float[] fArr) {
        this.f25819a = cVar;
        this.f25820b = cVar2;
        this.f25821c = cVar3;
        this.f25822d = cVar4;
        this.f25823e = i10;
        this.f25824f = fArr;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C2586h(s0.C2581c r13, s0.C2581c r14, int r15) {
        /*
            r12 = this;
            long r0 = r13.e()
            s0.b$a r2 = s0.C2580b.f25785a
            long r3 = r2.b()
            boolean r0 = s0.C2580b.e(r0, r3)
            r1 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            s0.k r0 = s0.k.f25829a
            s0.z r0 = r0.b()
            s0.c r0 = s0.C2582d.d(r13, r0, r3, r1, r3)
            r7 = r0
            goto L_0x001f
        L_0x001e:
            r7 = r13
        L_0x001f:
            long r4 = r14.e()
            long r8 = r2.b()
            boolean r0 = s0.C2580b.e(r4, r8)
            if (r0 == 0) goto L_0x0039
            s0.k r0 = s0.k.f25829a
            s0.z r0 = r0.b()
            s0.c r0 = s0.C2582d.d(r14, r0, r3, r1, r3)
            r8 = r0
            goto L_0x003a
        L_0x0039:
            r8 = r14
        L_0x003a:
            s0.h$a r0 = f25818g
            float[] r10 = r0.b(r13, r14, r15)
            r11 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C2586h.<init>(s0.c, s0.c, int):void");
    }
}
