package V;

import Ef.m;
import H0.E;
import H0.G;
import H0.H;
import H0.U;
import O0.t;
import O0.v;
import Y.A1;
import Y.C1500m;
import Y.M0;
import androidx.compose.foundation.layout.n;
import java.util.Map;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;
import r0.C2547y0;
import r0.T1;
import r0.i2;
import t0.C2605f;
import t0.C2610k;
import w.C2774S;
import w.C2812x;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: V.p0  reason: case insensitive filesystem */
public abstract class C1400p0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final float f7881a;

    /* renamed from: b  reason: collision with root package name */
    private static final k0.i f7882b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f7883c = c1.h.j((float) 240);

    /* renamed from: d  reason: collision with root package name */
    private static final float f7884d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f7885e;

    /* renamed from: f  reason: collision with root package name */
    private static final C2812x f7886f = new C2812x(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final C2812x f7887g = new C2812x(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: h  reason: collision with root package name */
    private static final C2812x f7888h = new C2812x(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: i  reason: collision with root package name */
    private static final C2812x f7889i = new C2812x(0.1f, 0.0f, 0.45f, 1.0f);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C2812x f7890j = new C2812x(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: V.p0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2610k f7892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1 f7893c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1 f7894d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1 f7895e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A1 f7896f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7897g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7898h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, C2610k kVar, A1 a12, A1 a13, A1 a14, A1 a15, float f10, long j11) {
            super(1);
            this.f7891a = j10;
            this.f7892b = kVar;
            this.f7893c = a12;
            this.f7894d = a13;
            this.f7895e = a14;
            this.f7896f = a15;
            this.f7897g = f10;
            this.f7898h = j11;
        }

        public final void a(C2605f fVar) {
            C1400p0.i(fVar, this.f7891a, this.f7892b);
            C2605f fVar2 = fVar;
            C1400p0.j(fVar2, ((Number) this.f7895e.getValue()).floatValue() + (((((Number) this.f7893c.getValue()).floatValue() * 216.0f) % 360.0f) - 0.049804688f) + ((Number) this.f7896f.getValue()).floatValue(), this.f7897g, Math.abs(((Number) this.f7894d.getValue()).floatValue() - ((Number) this.f7895e.getValue()).floatValue()), this.f7898h, this.f7892b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0.i f7899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f7900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f7901c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7902d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7903e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f7904f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7905g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k0.i iVar, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f7899a = iVar;
            this.f7900b = j10;
            this.f7901c = f10;
            this.f7902d = j11;
            this.f7903e = i10;
            this.f7904f = i11;
            this.f7905g = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1400p0.a(this.f7899a, this.f7900b, this.f7901c, this.f7902d, this.f7903e, mVar, M0.a(this.f7904f | 1), this.f7905g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7906a = new c();

        c() {
            super(1);
        }

        public final void a(C2774S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), C1400p0.f7890j);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2774S.b) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7907a = new d();

        d() {
            super(1);
        }

        public final void a(C2774S.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), C1400p0.f7890j);
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2774S.b) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$e */
    static final class e extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7908a = new e();

        /* renamed from: V.p0$e$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ U f7909a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f7910b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(U u10, int i10) {
                super(1);
                this.f7909a = u10;
                this.f7910b = i10;
            }

            public final void a(U.a aVar) {
                U.a.h(aVar, this.f7909a, 0, -this.f7910b, 0.0f, 4, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((U.a) obj);
                return C6514M.f71813a;
            }
        }

        e() {
            super(3);
        }

        public final G a(H h10, E e10, long j10) {
            int E02 = h10.E0(C1400p0.f7881a);
            int i10 = E02 * 2;
            U v02 = e10.v0(c1.c.n(j10, 0, i10));
            return H.N(h10, v02.X0(), v02.R0() - i10, (Map) null, new a(v02, E02), 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((H) obj, (E) obj2, ((c1.b) obj3).r());
        }
    }

    /* renamed from: V.p0$g */
    static final class g extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f7912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f7913b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(long j10, int i10) {
            super(1);
            this.f7912a = j10;
            this.f7913b = i10;
        }

        public final void a(C2605f fVar) {
            C1398o0 o0Var = C1398o0.f7856a;
            o0Var.a(fVar, o0Var.j(), this.f7912a, this.f7913b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$h */
    static final class h extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7914a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C6787a aVar) {
            super(1);
            this.f7914a = aVar;
        }

        public final void a(v vVar) {
            t.f0(vVar, new O0.f(((Number) this.f7914a.invoke()).floatValue(), m.b(0.0f, 1.0f), 0, 4, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$i */
    static final class i extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f7916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f7917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7918d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f7919e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6798l f7920f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(int i10, float f10, C6787a aVar, long j10, long j11, C6798l lVar) {
            super(1);
            this.f7915a = i10;
            this.f7916b = f10;
            this.f7917c = aVar;
            this.f7918d = j10;
            this.f7919e = j11;
            this.f7920f = lVar;
        }

        public final void a(C2605f fVar) {
            float f10;
            float i10 = C2427m.i(fVar.d());
            if (i2.e(this.f7915a, i2.f25529a.a()) || C2427m.i(fVar.d()) > C2427m.k(fVar.d())) {
                f10 = this.f7916b;
            } else {
                f10 = c1.h.j(this.f7916b + fVar.m1(i10));
            }
            float m12 = f10 / fVar.m1(C2427m.k(fVar.d()));
            float floatValue = ((Number) this.f7917c.invoke()).floatValue();
            float min = floatValue + Math.min(floatValue, m12);
            if (min <= 1.0f) {
                C1400p0.k(fVar, min, 1.0f, this.f7918d, i10, this.f7915a);
            }
            C1400p0.k(fVar, 0.0f, floatValue, this.f7919e, i10, this.f7915a);
            this.f7920f.invoke(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$j */
    static final class j extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.i f7922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7923c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7924d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7925e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f7926f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C6798l f7927g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7928h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f7929i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C6787a aVar, k0.i iVar, long j10, long j11, int i10, float f10, C6798l lVar, int i11, int i12) {
            super(2);
            this.f7921a = aVar;
            this.f7922b = iVar;
            this.f7923c = j10;
            this.f7924d = j11;
            this.f7925e = i10;
            this.f7926f = f10;
            this.f7927g = lVar;
            this.f7928h = i11;
            this.f7929i = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1400p0.b(this.f7921a, this.f7922b, this.f7923c, this.f7924d, this.f7925e, this.f7926f, this.f7927g, mVar, M0.a(this.f7928h | 1), this.f7929i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.p0$k */
    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f7930a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C6787a aVar) {
            super(0);
            this.f7930a = aVar;
        }

        /* renamed from: a */
        public final Float invoke() {
            return Float.valueOf(m.k(((Number) this.f7930a.invoke()).floatValue(), 0.0f, 1.0f));
        }
    }

    static {
        float j10 = c1.h.j((float) 10);
        f7881a = j10;
        f7882b = n.k(O0.m.c(androidx.compose.ui.layout.b.a(k0.i.f23074a, e.f7908a), true, f.f7911a), 0.0f, j10, 1, (Object) null);
        X.v vVar = X.v.f9514a;
        f7884d = vVar.f();
        f7885e = c1.h.j(vVar.c() - c1.h.j(vVar.f() * ((float) 2)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: V.p0$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: V.p0$a} */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02d2, code lost:
        if (r7 == Y.C1500m.f10026a.a()) goto L_0x02d4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0274  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(k0.i r36, long r37, float r39, long r40, int r42, Y.C1500m r43, int r44, int r45) {
        /*
            r8 = r44
            r0 = -115871647(0xfffffffff917f061, float:-4.930702E34)
            r1 = r43
            Y.m r1 = r1.h(r0)
            r2 = r45 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r8 | 6
            r5 = r4
            r4 = r36
            goto L_0x002a
        L_0x0016:
            r4 = r8 & 6
            if (r4 != 0) goto L_0x0027
            r4 = r36
            boolean r5 = r1.S(r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r8
            goto L_0x002a
        L_0x0027:
            r4 = r36
            r5 = r8
        L_0x002a:
            r6 = r8 & 48
            if (r6 != 0) goto L_0x0041
            r6 = r45 & 2
            r9 = r37
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.e(r9)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r9 = r37
        L_0x0043:
            r6 = r45 & 4
            if (r6 == 0) goto L_0x004c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r11 = r39
            goto L_0x005e
        L_0x004c:
            r11 = r8 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0049
            r11 = r39
            boolean r12 = r1.c(r11)
            if (r12 == 0) goto L_0x005b
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r12 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r5 = r5 | r12
        L_0x005e:
            r12 = r8 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0078
            r12 = r45 & 8
            if (r12 != 0) goto L_0x0071
            r12 = r40
            boolean r16 = r1.e(r12)
            if (r16 == 0) goto L_0x0073
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0071:
            r12 = r40
        L_0x0073:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r5 = r5 | r16
            goto L_0x007a
        L_0x0078:
            r12 = r40
        L_0x007a:
            r16 = r45 & 16
            if (r16 == 0) goto L_0x0083
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r14 = r42
            goto L_0x0096
        L_0x0083:
            r14 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0080
            r14 = r42
            boolean r17 = r1.d(r14)
            if (r17 == 0) goto L_0x0092
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r17
        L_0x0096:
            r15 = r5 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r15 != r7) goto L_0x00ab
            boolean r7 = r1.i()
            if (r7 != 0) goto L_0x00a3
            goto L_0x00ab
        L_0x00a3:
            r1.I()
            r2 = r9
            r6 = r11
            r7 = r14
            goto L_0x0302
        L_0x00ab:
            r1.D()
            r7 = r8 & 1
            if (r7 == 0) goto L_0x00cf
            boolean r7 = r1.L()
            if (r7 == 0) goto L_0x00b9
            goto L_0x00cf
        L_0x00b9:
            r1.I()
            r2 = r45 & 2
            if (r2 == 0) goto L_0x00c2
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00c2:
            r2 = r45 & 8
            if (r2 == 0) goto L_0x00c8
            r5 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c8:
            r2 = r4
            r6 = r11
            r7 = r14
            r14 = r12
            r13 = r5
        L_0x00cd:
            r4 = r9
            goto L_0x010f
        L_0x00cf:
            if (r2 == 0) goto L_0x00d4
            k0.i$a r2 = k0.i.f23074a
            goto L_0x00d5
        L_0x00d4:
            r2 = r4
        L_0x00d5:
            r4 = r45 & 2
            r7 = 6
            if (r4 == 0) goto L_0x00e2
            V.o0 r4 = V.C1398o0.f7856a
            long r9 = r4.b(r1, r7)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00e2:
            if (r6 == 0) goto L_0x00eb
            V.o0 r4 = V.C1398o0.f7856a
            float r4 = r4.e()
            r11 = r4
        L_0x00eb:
            r4 = r45 & 8
            if (r4 == 0) goto L_0x00f9
            V.o0 r4 = V.C1398o0.f7856a
            long r6 = r4.d(r1, r7)
            r4 = r5 & -7169(0xffffffffffffe3ff, float:NaN)
            r5 = r4
            goto L_0x00fa
        L_0x00f9:
            r6 = r12
        L_0x00fa:
            if (r16 == 0) goto L_0x0107
            V.o0 r4 = V.C1398o0.f7856a
            int r4 = r4.c()
            r13 = r5
            r14 = r6
            r6 = r11
            r7 = r4
            goto L_0x00cd
        L_0x0107:
            r13 = r5
            r4 = r9
            r34 = r6
            r6 = r11
            r7 = r14
            r14 = r34
        L_0x010f:
            r1.v()
            boolean r9 = Y.C1506p.H()
            if (r9 == 0) goto L_0x011e
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)"
            Y.C1506p.Q(r0, r13, r9, r10)
        L_0x011e:
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r1.m(r0)
            c1.d r0 = (c1.d) r0
            t0.k r12 = new t0.k
            float r19 = r0.t1(r6)
            r24 = 26
            r25 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r18 = r12
            r21 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r0 = 0
            r11 = 0
            r10 = 1
            w.N r18 = w.C2771O.c(r0, r1, r11, r10)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r9 = 5
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)
            kotlin.jvm.internal.r r9 = kotlin.jvm.internal.r.f71790a
            w.r0 r20 = w.t0.g(r9)
            r9 = 6660(0x1a04, float:9.333E-42)
            w.D r10 = w.C2762F.e()
            w.q0 r9 = w.C2798j.j(r9, r11, r10, r3, r0)
            r10 = 6
            r21 = 0
            r22 = 0
            r23 = 0
            r37 = r9
            r38 = r22
            r39 = r23
            r41 = r10
            r42 = r21
            w.M r21 = w.C2798j.e(r37, r38, r39, r41, r42)
            int r10 = w.C2770N.f27201f
            r9 = r10 | 432(0x1b0, float:6.05E-43)
            int r22 = w.C2769M.f27197d
            int r23 = r22 << 12
            r23 = r9 | r23
            r24 = 16
            r9 = r18
            r29 = r10
            r26 = 1
            r10 = r16
            r11 = r19
            r30 = r12
            r12 = r20
            r31 = r13
            r13 = r21
            r32 = r14
            r15 = 2048(0x800, float:2.87E-42)
            r14 = r25
            r15 = r1
            r16 = r23
            r17 = r24
            Y.A1 r9 = w.C2771O.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r10 = 1332(0x534, float:1.867E-42)
            w.D r11 = w.C2762F.e()
            r12 = 0
            w.q0 r0 = w.C2798j.j(r10, r12, r11, r3, r0)
            r3 = 6
            r10 = 0
            r11 = 0
            r13 = 0
            r36 = r0
            r37 = r11
            r38 = r13
            r40 = r3
            r41 = r10
            w.M r0 = w.C2798j.e(r36, r37, r38, r40, r41)
            r3 = r29
            r10 = r3 | 432(0x1b0, float:6.05E-43)
            int r11 = r22 << 9
            r10 = r10 | r11
            r11 = 8
            r13 = 0
            r14 = 1133445120(0x438f0000, float:286.0)
            r15 = 0
            r36 = r18
            r37 = r13
            r38 = r14
            r39 = r0
            r40 = r15
            r41 = r1
            r42 = r10
            r43 = r11
            Y.A1 r0 = w.C2771O.a(r36, r37, r38, r39, r40, r41, r42, r43)
            V.p0$c r10 = V.C1400p0.c.f7906a
            w.S r10 = w.C2798j.f(r10)
            r11 = 6
            r13 = 0
            r14 = 0
            r15 = 0
            r36 = r10
            r37 = r14
            r38 = r15
            r40 = r11
            r41 = r13
            w.M r10 = w.C2798j.e(r36, r37, r38, r40, r41)
            r11 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r22 << 9
            r11 = r11 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r36 = r18
            r37 = r14
            r38 = r15
            r39 = r10
            r40 = r16
            r41 = r1
            r42 = r11
            r43 = r13
            Y.A1 r10 = w.C2771O.a(r36, r37, r38, r39, r40, r41, r42, r43)
            V.p0$d r11 = V.C1400p0.d.f7907a
            w.S r11 = w.C2798j.f(r11)
            r13 = 6
            r14 = 0
            r15 = 0
            r16 = 0
            r36 = r11
            r37 = r15
            r38 = r16
            r40 = r13
            r41 = r14
            w.M r11 = w.C2798j.e(r36, r37, r38, r40, r41)
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            int r13 = r22 << 9
            r3 = r3 | r13
            r13 = 8
            r14 = 0
            r15 = 1133576192(0x43910000, float:290.0)
            r16 = 0
            r36 = r18
            r37 = r14
            r38 = r15
            r39 = r11
            r40 = r16
            r41 = r1
            r42 = r3
            r43 = r13
            Y.A1 r3 = w.C2771O.a(r36, r37, r38, r39, r40, r41, r42, r43)
            k0.i r11 = x.C2861Z.a(r2)
            float r13 = f7885e
            k0.i r11 = androidx.compose.foundation.layout.q.n(r11, r13)
            r13 = r31
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            r14 = r14 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            r12 = r32
            if (r14 <= r15) goto L_0x0274
            boolean r14 = r1.e(r12)
            if (r14 != 0) goto L_0x026f
            goto L_0x0274
        L_0x026f:
            r36 = r2
            r14 = r31
            goto L_0x027c
        L_0x0274:
            r36 = r2
            r14 = r31
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != r15) goto L_0x0281
        L_0x027c:
            r2 = r26
            r15 = r30
            goto L_0x0284
        L_0x0281:
            r15 = r30
            r2 = 0
        L_0x0284:
            boolean r16 = r1.C(r15)
            r2 = r2 | r16
            boolean r16 = r1.S(r9)
            r2 = r2 | r16
            boolean r16 = r1.S(r10)
            r2 = r2 | r16
            boolean r16 = r1.S(r3)
            r2 = r2 | r16
            boolean r16 = r1.S(r0)
            r2 = r2 | r16
            r37 = r7
            r7 = r14 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != r8) goto L_0x02ad
            r7 = r26
            goto L_0x02ae
        L_0x02ad:
            r7 = 0
        L_0x02ae:
            r2 = r2 | r7
            r7 = r14 & 112(0x70, float:1.57E-43)
            r7 = r7 ^ 48
            r8 = 32
            if (r7 <= r8) goto L_0x02bd
            boolean r7 = r1.e(r4)
            if (r7 != 0) goto L_0x02c4
        L_0x02bd:
            r7 = r14 & 48
            if (r7 != r8) goto L_0x02c2
            goto L_0x02c4
        L_0x02c2:
            r26 = 0
        L_0x02c4:
            r2 = r2 | r26
            java.lang.Object r7 = r1.A()
            if (r2 != 0) goto L_0x02d4
            Y.m$a r2 = Y.C1500m.f10026a
            java.lang.Object r2 = r2.a()
            if (r7 != r2) goto L_0x02ee
        L_0x02d4:
            V.p0$a r7 = new V.p0$a
            r18 = r7
            r19 = r12
            r21 = r15
            r22 = r9
            r23 = r10
            r24 = r3
            r25 = r0
            r26 = r6
            r27 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27)
            r1.r(r7)
        L_0x02ee:
            yf.l r7 = (yf.C6798l) r7
            r0 = 0
            x.C2870i.a(r11, r7, r1, r0)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x02fd
            Y.C1506p.P()
        L_0x02fd:
            r7 = r37
            r2 = r4
            r4 = r36
        L_0x0302:
            Y.Y0 r10 = r1.k()
            if (r10 == 0) goto L_0x0318
            V.p0$b r11 = new V.p0$b
            r0 = r11
            r1 = r4
            r4 = r6
            r5 = r12
            r8 = r44
            r9 = r45
            r0.<init>(r1, r2, r4, r5, r7, r8, r9)
            r10.a(r11)
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1400p0.a(k0.i, long, float, long, int, Y.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: yf.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: V.p0$i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: V.p0$i} */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x024a, code lost:
        if (r3 == Y.C1500m.f10026a.a()) goto L_0x024c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(yf.C6787a r30, k0.i r31, long r32, long r34, int r36, float r37, yf.C6798l r38, Y.C1500m r39, int r40, int r41) {
        /*
            r1 = r30
            r10 = r40
            r0 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            r2 = r39
            Y.m r2 = r2.h(r0)
            r3 = r41 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.C(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r10
            goto L_0x0024
        L_0x0023:
            r3 = r10
        L_0x0024:
            r5 = r41 & 2
            if (r5 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r6 = r31
            goto L_0x003f
        L_0x002d:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x002a
            r6 = r31
            boolean r7 = r2.S(r6)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r10 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0056
            r7 = r41 & 4
            r11 = r32
            if (r7 != 0) goto L_0x0052
            boolean r7 = r2.e(r11)
            if (r7 == 0) goto L_0x0052
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0054
        L_0x0052:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0054:
            r3 = r3 | r7
            goto L_0x0058
        L_0x0056:
            r11 = r32
        L_0x0058:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006f
            r7 = r41 & 8
            r13 = r34
            if (r7 != 0) goto L_0x006b
            boolean r7 = r2.e(r13)
            if (r7 == 0) goto L_0x006b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r3 = r3 | r7
            goto L_0x0071
        L_0x006f:
            r13 = r34
        L_0x0071:
            r7 = r41 & 16
            if (r7 == 0) goto L_0x007a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0077:
            r9 = r36
            goto L_0x008d
        L_0x007a:
            r9 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0077
            r9 = r36
            boolean r16 = r2.d(r9)
            if (r16 == 0) goto L_0x0089
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r3 = r3 | r16
        L_0x008d:
            r16 = r41 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x0098
            r3 = r3 | r17
            r4 = r37
            goto L_0x00ab
        L_0x0098:
            r17 = r10 & r17
            r4 = r37
            if (r17 != 0) goto L_0x00ab
            boolean r18 = r2.c(r4)
            if (r18 == 0) goto L_0x00a7
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a9
        L_0x00a7:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00a9:
            r3 = r3 | r18
        L_0x00ab:
            r18 = 1572864(0x180000, float:2.204052E-39)
            r19 = r10 & r18
            if (r19 != 0) goto L_0x00c5
            r19 = r41 & 64
            r0 = r38
            if (r19 != 0) goto L_0x00c0
            boolean r20 = r2.C(r0)
            if (r20 == 0) goto L_0x00c0
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c2
        L_0x00c0:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00c2:
            r3 = r3 | r20
            goto L_0x00c7
        L_0x00c5:
            r0 = r38
        L_0x00c7:
            r20 = 599187(0x92493, float:8.3964E-40)
            r15 = r3 & r20
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r15 != r8) goto L_0x00e2
            boolean r8 = r2.i()
            if (r8 != 0) goto L_0x00d8
            goto L_0x00e2
        L_0x00d8:
            r2.I()
            r8 = r4
            r5 = r6
            r7 = r9
            r3 = r11
            r9 = r0
            goto L_0x0275
        L_0x00e2:
            r2.D()
            r8 = r10 & 1
            if (r8 == 0) goto L_0x010b
            boolean r8 = r2.L()
            if (r8 == 0) goto L_0x00f0
            goto L_0x010b
        L_0x00f0:
            r2.I()
            r5 = r41 & 4
            if (r5 == 0) goto L_0x00f9
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f9:
            r5 = r41 & 8
            if (r5 == 0) goto L_0x00ff
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00ff:
            r5 = r41 & 64
            if (r5 == 0) goto L_0x0107
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r5
        L_0x0107:
            r5 = r6
            r6 = r9
            goto L_0x017e
        L_0x010b:
            if (r5 == 0) goto L_0x0110
            k0.i$a r5 = k0.i.f23074a
            goto L_0x0111
        L_0x0110:
            r5 = r6
        L_0x0111:
            r6 = r41 & 4
            r8 = 6
            if (r6 == 0) goto L_0x011e
            V.o0 r6 = V.C1398o0.f7856a
            long r11 = r6.f(r2, r8)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x011e:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x012a
            V.o0 r6 = V.C1398o0.f7856a
            long r13 = r6.i(r2, r8)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x012a:
            if (r7 == 0) goto L_0x0133
            V.o0 r6 = V.C1398o0.f7856a
            int r6 = r6.h()
            goto L_0x0134
        L_0x0133:
            r6 = r9
        L_0x0134:
            if (r16 == 0) goto L_0x013c
            V.o0 r4 = V.C1398o0.f7856a
            float r4 = r4.g()
        L_0x013c:
            r7 = r41 & 64
            if (r7 == 0) goto L_0x017e
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r0 <= r7) goto L_0x014e
            boolean r0 = r2.e(r11)
            if (r0 != 0) goto L_0x0152
        L_0x014e:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != r7) goto L_0x0154
        L_0x0152:
            r0 = 1
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r3
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r8) goto L_0x015f
            r7 = 1
            goto L_0x0160
        L_0x015f:
            r7 = 0
        L_0x0160:
            r0 = r0 | r7
            java.lang.Object r7 = r2.A()
            if (r0 != 0) goto L_0x016f
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x0177
        L_0x016f:
            V.p0$g r7 = new V.p0$g
            r7.<init>(r11, r6)
            r2.r(r7)
        L_0x0177:
            r0 = r7
            yf.l r0 = (yf.C6798l) r0
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r7
        L_0x017e:
            r2.v()
            boolean r7 = Y.C1506p.H()
            if (r7 == 0) goto L_0x0190
            r7 = -1
            java.lang.String r8 = "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:152)"
            r9 = -339970038(0xffffffffebbc780a, float:-4.5568985E26)
            Y.C1506p.Q(r9, r3, r7, r8)
        L_0x0190:
            r7 = r3 & 14
            r8 = 4
            if (r7 != r8) goto L_0x0197
            r7 = 1
            goto L_0x0198
        L_0x0197:
            r7 = 0
        L_0x0198:
            java.lang.Object r8 = r2.A()
            if (r7 != 0) goto L_0x01a6
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x01ae
        L_0x01a6:
            V.p0$k r8 = new V.p0$k
            r8.<init>(r1)
            r2.r(r8)
        L_0x01ae:
            r7 = r8
            yf.a r7 = (yf.C6787a) r7
            k0.i r8 = f7882b
            k0.i r8 = r5.h(r8)
            boolean r9 = r2.S(r7)
            java.lang.Object r15 = r2.A()
            if (r9 != 0) goto L_0x01c9
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r15 != r9) goto L_0x01d1
        L_0x01c9:
            V.p0$h r15 = new V.p0$h
            r15.<init>(r7)
            r2.r(r15)
        L_0x01d1:
            yf.l r15 = (yf.C6798l) r15
            r9 = 1
            k0.i r8 = O0.m.c(r8, r9, r15)
            float r15 = f7883c
            float r9 = f7884d
            k0.i r8 = androidx.compose.foundation.layout.q.o(r8, r15, r9)
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r3
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r9 != r15) goto L_0x01ea
            r9 = 1
            goto L_0x01eb
        L_0x01ea:
            r9 = 0
        L_0x01eb:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r3
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r15 != r1) goto L_0x01f4
            r1 = 1
            goto L_0x01f5
        L_0x01f4:
            r1 = 0
        L_0x01f5:
            r1 = r1 | r9
            boolean r9 = r2.S(r7)
            r1 = r1 | r9
            r9 = r3 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 ^ 3072(0xc00, float:4.305E-42)
            r15 = 2048(0x800, float:2.87E-42)
            if (r9 <= r15) goto L_0x0209
            boolean r9 = r2.e(r13)
            if (r9 != 0) goto L_0x020d
        L_0x0209:
            r9 = r3 & 3072(0xc00, float:4.305E-42)
            if (r9 != r15) goto L_0x020f
        L_0x020d:
            r9 = 1
            goto L_0x0210
        L_0x020f:
            r9 = 0
        L_0x0210:
            r1 = r1 | r9
            r9 = r3 & 896(0x380, float:1.256E-42)
            r9 = r9 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r9 <= r15) goto L_0x021f
            boolean r9 = r2.e(r11)
            if (r9 != 0) goto L_0x0223
        L_0x021f:
            r9 = r3 & 384(0x180, float:5.38E-43)
            if (r9 != r15) goto L_0x0225
        L_0x0223:
            r9 = 1
            goto L_0x0226
        L_0x0225:
            r9 = 0
        L_0x0226:
            r1 = r1 | r9
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r3
            r9 = r9 ^ r18
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r9 <= r15) goto L_0x0236
            boolean r9 = r2.S(r0)
            if (r9 != 0) goto L_0x023a
        L_0x0236:
            r3 = r3 & r18
            if (r3 != r15) goto L_0x023c
        L_0x023a:
            r15 = 1
            goto L_0x023d
        L_0x023c:
            r15 = 0
        L_0x023d:
            r1 = r1 | r15
            java.lang.Object r3 = r2.A()
            if (r1 != 0) goto L_0x024c
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x0262
        L_0x024c:
            V.p0$i r3 = new V.p0$i
            r21 = r3
            r22 = r6
            r23 = r4
            r24 = r7
            r25 = r13
            r27 = r11
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r27, r29)
            r2.r(r3)
        L_0x0262:
            yf.l r3 = (yf.C6798l) r3
            r1 = 0
            x.C2870i.a(r8, r3, r2, r1)
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0271
            Y.C1506p.P()
        L_0x0271:
            r9 = r0
            r8 = r4
            r7 = r6
            r3 = r11
        L_0x0275:
            Y.Y0 r12 = r2.k()
            if (r12 == 0) goto L_0x028c
            V.p0$j r15 = new V.p0$j
            r0 = r15
            r1 = r30
            r2 = r5
            r5 = r13
            r10 = r40
            r11 = r41
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.a(r15)
        L_0x028c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1400p0.b(yf.a, k0.i, long, long, int, float, yf.l, Y.m, int, int):void");
    }

    private static final void h(C2605f fVar, float f10, float f11, long j10, C2610k kVar) {
        float f12 = (float) 2;
        float f13 = kVar.f() / f12;
        float k10 = C2427m.k(fVar.d()) - (f12 * f13);
        C2605f.Y(fVar, j10, f10, f11, false, C2422h.a(f13, f13), C2428n.a(k10, k10), 0.0f, kVar, (C2547y0) null, 0, 832, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void i(C2605f fVar, long j10, C2610k kVar) {
        h(fVar, 0.0f, 360.0f, j10, kVar);
    }

    /* access modifiers changed from: private */
    public static final void j(C2605f fVar, float f10, float f11, float f12, long j10, C2610k kVar) {
        float f13;
        if (i2.e(kVar.b(), i2.f25529a.a())) {
            f13 = 0.0f;
        } else {
            f13 = ((f11 / c1.h.j(f7885e / ((float) 2))) * 57.29578f) / 2.0f;
        }
        h(fVar, f10 + f13, Math.max(f12, 0.1f), j10, kVar);
    }

    /* access modifiers changed from: private */
    public static final void k(C2605f fVar, float f10, float f11, long j10, float f12, int i10) {
        boolean z10;
        float f13;
        float f14;
        float k10 = C2427m.k(fVar.d());
        float i11 = C2427m.i(fVar.d());
        float f15 = (float) 2;
        float f16 = i11 / f15;
        if (fVar.getLayoutDirection() == c1.t.Ltr) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f13 = f10;
        } else {
            f13 = 1.0f - f11;
        }
        float f17 = f13 * k10;
        if (z10) {
            f14 = f11;
        } else {
            f14 = 1.0f - f10;
        }
        float f18 = f14 * k10;
        if (i2.e(i10, i2.f25529a.a()) || i11 > k10) {
            C2605f.M(fVar, j10, C2422h.a(f17, f16), C2422h.a(f18, f16), f12, 0, (T1) null, 0.0f, (C2547y0) null, 0, 496, (Object) null);
            return;
        }
        float f19 = f12 / f15;
        Ef.e b10 = m.b(f19, k10 - f19);
        float floatValue = ((Number) m.o(Float.valueOf(f17), b10)).floatValue();
        float floatValue2 = ((Number) m.o(Float.valueOf(f18), b10)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            C2605f.M(fVar, j10, C2422h.a(floatValue, f16), C2422h.a(floatValue2, f16), f12, i10, (T1) null, 0.0f, (C2547y0) null, 0, 480, (Object) null);
        }
    }

    /* renamed from: V.p0$f */
    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final f f7911a = new f();

        f() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }

        public final void a(v vVar) {
        }
    }
}
