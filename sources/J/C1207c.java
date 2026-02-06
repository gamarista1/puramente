package J;

import B.l;
import Q0.L;
import Q0.T;
import W0.Q;
import W0.c0;
import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2514n0;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: J.c  reason: case insensitive filesystem */
public abstract class C1207c {

    /* renamed from: a  reason: collision with root package name */
    private static final L.b f3024a = h.f3073a;

    /* renamed from: b  reason: collision with root package name */
    private static final long f3025b;

    /* renamed from: J.c$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f3027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f3028b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Q q10, C6798l lVar) {
            super(1);
            this.f3027a = q10;
            this.f3028b = lVar;
        }

        public final void a(Q q10) {
            if (!C6496s.c(this.f3027a, q10)) {
                this.f3028b.invoke(q10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.c$c  reason: collision with other inner class name */
    static final class C0069c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f3029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f3030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f3031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3033e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f3034f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1227x f3035g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C1226w f3036h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f3037i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f3038j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f3039k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c0 f3040l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C6798l f3041m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f3042n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C2514n0 f3043o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ q f3044p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f3045q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f3046r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f3047s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0069c(Q q10, C6798l lVar, i iVar, boolean z10, boolean z11, T t10, C1227x xVar, C1226w wVar, boolean z12, int i10, int i11, c0 c0Var, C6798l lVar2, l lVar3, C2514n0 n0Var, q qVar, int i12, int i13, int i14) {
            super(2);
            this.f3029a = q10;
            this.f3030b = lVar;
            this.f3031c = iVar;
            this.f3032d = z10;
            this.f3033e = z11;
            this.f3034f = t10;
            this.f3035g = xVar;
            this.f3036h = wVar;
            this.f3037i = z12;
            this.f3038j = i10;
            this.f3039k = i11;
            this.f3040l = c0Var;
            this.f3041m = lVar2;
            this.f3042n = lVar3;
            this.f3043o = n0Var;
            this.f3044p = qVar;
            this.f3045q = i12;
            this.f3046r = i13;
            this.f3047s = i14;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            Q q10 = this.f3029a;
            Q q11 = q10;
            C1207c.a(q11, this.f3030b, this.f3031c, this.f3032d, this.f3033e, this.f3034f, this.f3035g, this.f3036h, this.f3037i, this.f3038j, this.f3039k, this.f3040l, this.f3041m, this.f3042n, this.f3043o, this.f3044p, mVar2, M0.a(this.f3045q | 1), M0.a(this.f3046r), this.f3047s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.c$e */
    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f3049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1510r0 f3050b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Q q10, C1510r0 r0Var) {
            super(0);
            this.f3049a = q10;
            this.f3050b = r0Var;
        }

        public final void invoke() {
            if (!Q0.Q.g(this.f3049a.g(), C1207c.c(this.f3050b).g()) || !C6496s.c(this.f3049a.f(), C1207c.c(this.f3050b).f())) {
                C1207c.d(this.f3050b, this.f3049a);
            }
        }
    }

    /* renamed from: J.c$f */
    static final class f extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f3051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1510r0 f3052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f3053c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C6798l lVar, C1510r0 r0Var, C1510r0 r0Var2) {
            super(1);
            this.f3051a = lVar;
            this.f3052b = r0Var;
            this.f3053c = r0Var2;
        }

        public final void a(Q q10) {
            C1207c.d(this.f3052b, q10);
            boolean c10 = C6496s.c(C1207c.e(this.f3053c), q10.h());
            C1207c.f(this.f3053c, q10.h());
            if (!c10) {
                this.f3051a.invoke(q10.h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.c$g */
    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f3055b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f3056c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f3057d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f3058e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f3059f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1227x f3060g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C1226w f3061h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f3062i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f3063j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f3064k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c0 f3065l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C6798l f3066m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f3067n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C2514n0 f3068o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ q f3069p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f3070q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f3071r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f3072s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, C6798l lVar, i iVar, boolean z10, boolean z11, T t10, C1227x xVar, C1226w wVar, boolean z12, int i10, int i11, c0 c0Var, C6798l lVar2, l lVar3, C2514n0 n0Var, q qVar, int i12, int i13, int i14) {
            super(2);
            this.f3054a = str;
            this.f3055b = lVar;
            this.f3056c = iVar;
            this.f3057d = z10;
            this.f3058e = z11;
            this.f3059f = t10;
            this.f3060g = xVar;
            this.f3061h = wVar;
            this.f3062i = z12;
            this.f3063j = i10;
            this.f3064k = i11;
            this.f3065l = c0Var;
            this.f3066m = lVar2;
            this.f3067n = lVar3;
            this.f3068o = n0Var;
            this.f3069p = qVar;
            this.f3070q = i12;
            this.f3071r = i13;
            this.f3072s = i14;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            String str = this.f3054a;
            String str2 = str;
            C1207c.b(str2, this.f3055b, this.f3056c, this.f3057d, this.f3058e, this.f3059f, this.f3060g, this.f3061h, this.f3062i, this.f3063j, this.f3064k, this.f3065l, this.f3066m, this.f3067n, this.f3068o, this.f3069p, mVar2, M0.a(this.f3070q | 1), M0.a(this.f3071r), this.f3072s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: J.c$h */
    static final class h implements L.b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f3073a = new h();

        h() {
        }
    }

    static {
        float f10 = (float) 40;
        f3025b = c1.i.b(c1.h.j(f10), c1.h.j(f10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(W0.Q r37, yf.C6798l r38, k0.i r39, boolean r40, boolean r41, Q0.T r42, J.C1227x r43, J.C1226w r44, boolean r45, int r46, int r47, W0.c0 r48, yf.C6798l r49, B.l r50, r0.C2514n0 r51, yf.q r52, Y.C1500m r53, int r54, int r55, int r56) {
        /*
            r15 = r37
            r14 = r38
            r13 = r54
            r12 = r55
            r11 = r56
            r0 = 1804514146(0x6b8eb362, float:3.4502916E26)
            r1 = r53
            Y.m r10 = r1.h(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r13 | 6
            goto L_0x002a
        L_0x001a:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0029
            boolean r1 = r10.S(r15)
            if (r1 == 0) goto L_0x0026
            r1 = 4
            goto L_0x0027
        L_0x0026:
            r1 = 2
        L_0x0027:
            r1 = r1 | r13
            goto L_0x002a
        L_0x0029:
            r1 = r13
        L_0x002a:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0031
            r1 = r1 | 48
            goto L_0x0041
        L_0x0031:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x0041
            boolean r4 = r10.C(r14)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r9 = r39
            goto L_0x005d
        L_0x004a:
            r9 = r13 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0047
            r9 = r39
            boolean r16 = r10.S(r9)
            if (r16 == 0) goto L_0x0059
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r16
        L_0x005d:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r2 = r40
            goto L_0x007d
        L_0x006a:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0067
            r2 = r40
            boolean r19 = r10.b(r2)
            if (r19 == 0) goto L_0x0079
            r19 = r18
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r1 = r1 | r19
        L_0x007d:
            r19 = r11 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r5 = r41
            goto L_0x009d
        L_0x008a:
            r5 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0087
            r5 = r41
            boolean r23 = r10.b(r5)
            if (r23 == 0) goto L_0x0099
            r23 = r21
            goto L_0x009b
        L_0x0099:
            r23 = r20
        L_0x009b:
            r1 = r1 | r23
        L_0x009d:
            r23 = r11 & 32
            r24 = 65536(0x10000, float:9.18355E-41)
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00ac
            r1 = r1 | r26
            r7 = r42
            goto L_0x00bf
        L_0x00ac:
            r27 = r13 & r26
            r7 = r42
            if (r27 != 0) goto L_0x00bf
            boolean r28 = r10.S(r7)
            if (r28 == 0) goto L_0x00bb
            r28 = r25
            goto L_0x00bd
        L_0x00bb:
            r28 = r24
        L_0x00bd:
            r1 = r1 | r28
        L_0x00bf:
            r28 = r11 & 64
            r29 = 1572864(0x180000, float:2.204052E-39)
            if (r28 == 0) goto L_0x00ca
            r1 = r1 | r29
            r8 = r43
            goto L_0x00dd
        L_0x00ca:
            r29 = r13 & r29
            r8 = r43
            if (r29 != 0) goto L_0x00dd
            boolean r30 = r10.S(r8)
            if (r30 == 0) goto L_0x00d9
            r30 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00db
        L_0x00d9:
            r30 = 524288(0x80000, float:7.34684E-40)
        L_0x00db:
            r1 = r1 | r30
        L_0x00dd:
            r6 = r11 & 128(0x80, float:1.794E-43)
            r31 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00e8
            r1 = r1 | r31
            r3 = r44
            goto L_0x00fb
        L_0x00e8:
            r31 = r13 & r31
            r3 = r44
            if (r31 != 0) goto L_0x00fb
            boolean r32 = r10.S(r3)
            if (r32 == 0) goto L_0x00f7
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r1 = r1 | r32
        L_0x00fb:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r33 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0106
            r1 = r1 | r33
            r2 = r45
            goto L_0x0119
        L_0x0106:
            r33 = r13 & r33
            r2 = r45
            if (r33 != 0) goto L_0x0119
            boolean r33 = r10.b(r2)
            if (r33 == 0) goto L_0x0115
            r33 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0115:
            r33 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r1 = r1 | r33
        L_0x0119:
            r33 = 805306368(0x30000000, float:4.656613E-10)
            r33 = r13 & r33
            if (r33 != 0) goto L_0x0135
            r2 = r11 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x012e
            r2 = r46
            boolean r33 = r10.d(r2)
            if (r33 == 0) goto L_0x0130
            r33 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x012e:
            r2 = r46
        L_0x0130:
            r33 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0132:
            r1 = r1 | r33
            goto L_0x0137
        L_0x0135:
            r2 = r46
        L_0x0137:
            r2 = r11 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0140
            r33 = r12 | 6
            r3 = r47
            goto L_0x0156
        L_0x0140:
            r33 = r12 & 6
            r3 = r47
            if (r33 != 0) goto L_0x0154
            boolean r33 = r10.d(r3)
            if (r33 == 0) goto L_0x014f
            r33 = 4
            goto L_0x0151
        L_0x014f:
            r33 = 2
        L_0x0151:
            r33 = r12 | r33
            goto L_0x0156
        L_0x0154:
            r33 = r12
        L_0x0156:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x015f
            r33 = r33 | 48
        L_0x015c:
            r5 = r33
            goto L_0x0173
        L_0x015f:
            r34 = r12 & 48
            r5 = r48
            if (r34 != 0) goto L_0x015c
            boolean r34 = r10.S(r5)
            if (r34 == 0) goto L_0x016e
            r22 = 32
            goto L_0x0170
        L_0x016e:
            r22 = 16
        L_0x0170:
            r33 = r33 | r22
            goto L_0x015c
        L_0x0173:
            r7 = r11 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x017c
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0179:
            r8 = r49
            goto L_0x018f
        L_0x017c:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0179
            r8 = r49
            boolean r22 = r10.C(r8)
            if (r22 == 0) goto L_0x018b
            r29 = 256(0x100, float:3.59E-43)
            goto L_0x018d
        L_0x018b:
            r29 = 128(0x80, float:1.794E-43)
        L_0x018d:
            r5 = r5 | r29
        L_0x018f:
            r8 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x0198
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0195:
            r9 = r50
            goto L_0x01a8
        L_0x0198:
            r9 = r12 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0195
            r9 = r50
            boolean r22 = r10.S(r9)
            if (r22 == 0) goto L_0x01a6
            r17 = r18
        L_0x01a6:
            r5 = r5 | r17
        L_0x01a8:
            r9 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01b1
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x01ae:
            r14 = r51
            goto L_0x01c1
        L_0x01b1:
            r14 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x01ae
            r14 = r51
            boolean r17 = r10.S(r14)
            if (r17 == 0) goto L_0x01bf
            r20 = r21
        L_0x01bf:
            r5 = r5 | r20
        L_0x01c1:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r11 & r17
            if (r17 == 0) goto L_0x01cd
            r5 = r5 | r26
            r12 = r52
            goto L_0x01dd
        L_0x01cd:
            r18 = r12 & r26
            r12 = r52
            if (r18 != 0) goto L_0x01dd
            boolean r18 = r10.C(r12)
            if (r18 == 0) goto L_0x01db
            r24 = r25
        L_0x01db:
            r5 = r5 | r24
        L_0x01dd:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r1 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r14) goto L_0x021a
            r12 = 74899(0x12493, float:1.04956E-40)
            r12 = r12 & r5
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r14) goto L_0x021a
            boolean r12 = r10.i()
            if (r12 != 0) goto L_0x01f7
            goto L_0x021a
        L_0x01f7:
            r10.I()
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r44
            r9 = r45
            r11 = r47
            r12 = r48
            r13 = r49
            r14 = r50
            r15 = r51
            r16 = r52
            r30 = r10
            r10 = r46
            goto L_0x03f4
        L_0x021a:
            r10.D()
            r12 = r13 & 1
            r18 = 1
            if (r12 == 0) goto L_0x0254
            boolean r12 = r10.L()
            if (r12 == 0) goto L_0x022a
            goto L_0x0254
        L_0x022a:
            r10.I()
            r0 = r11 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0235
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r0
        L_0x0235:
            r20 = r39
            r21 = r40
            r22 = r41
            r23 = r42
            r14 = r43
            r24 = r44
            r12 = r45
            r25 = r46
            r26 = r47
            r27 = r48
            r28 = r49
            r29 = r50
            r33 = r51
            r34 = r52
            r0 = r1
            goto L_0x0324
        L_0x0254:
            if (r4 == 0) goto L_0x0259
            k0.i$a r4 = k0.i.f23074a
            goto L_0x025b
        L_0x0259:
            r4 = r39
        L_0x025b:
            if (r16 == 0) goto L_0x0260
            r12 = r18
            goto L_0x0262
        L_0x0260:
            r12 = r40
        L_0x0262:
            if (r19 == 0) goto L_0x0267
            r16 = 0
            goto L_0x0269
        L_0x0267:
            r16 = r41
        L_0x0269:
            if (r23 == 0) goto L_0x0272
            Q0.T$a r19 = Q0.T.f5294d
            Q0.T r19 = r19.a()
            goto L_0x0274
        L_0x0272:
            r19 = r42
        L_0x0274:
            if (r28 == 0) goto L_0x027d
            J.x$a r20 = J.C1227x.f3486g
            J.x r20 = r20.a()
            goto L_0x027f
        L_0x027d:
            r20 = r43
        L_0x027f:
            if (r6 == 0) goto L_0x0288
            J.w$a r6 = J.C1226w.f3478g
            J.w r6 = r6.a()
            goto L_0x028a
        L_0x0288:
            r6 = r44
        L_0x028a:
            if (r0 == 0) goto L_0x028e
            r0 = 0
            goto L_0x0290
        L_0x028e:
            r0 = r45
        L_0x0290:
            r14 = r11 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02a2
            if (r0 == 0) goto L_0x0299
            r14 = r18
            goto L_0x029c
        L_0x0299:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x029c:
            r21 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r21
            goto L_0x02a4
        L_0x02a2:
            r14 = r46
        L_0x02a4:
            if (r2 == 0) goto L_0x02a9
            r2 = r18
            goto L_0x02ab
        L_0x02a9:
            r2 = r47
        L_0x02ab:
            if (r3 == 0) goto L_0x02b4
            W0.c0$a r3 = W0.c0.f8551a
            W0.c0 r3 = r3.c()
            goto L_0x02b6
        L_0x02b4:
            r3 = r48
        L_0x02b6:
            if (r7 == 0) goto L_0x02bb
            J.c$a r7 = J.C1207c.a.f3026a
            goto L_0x02bd
        L_0x02bb:
            r7 = r49
        L_0x02bd:
            if (r8 == 0) goto L_0x02c1
            r8 = 0
            goto L_0x02c3
        L_0x02c1:
            r8 = r50
        L_0x02c3:
            if (r9 == 0) goto L_0x02d8
            r0.h2 r9 = new r0.h2
            r0.x0$a r21 = r0.C2544x0.f25560b
            r39 = r0
            r40 = r1
            long r0 = r21.a()
            r41 = r2
            r2 = 0
            r9.<init>(r0, r2)
            goto L_0x02e0
        L_0x02d8:
            r39 = r0
            r40 = r1
            r41 = r2
            r9 = r51
        L_0x02e0:
            if (r17 == 0) goto L_0x0307
            J.e r0 = J.C1209e.f3157a
            yf.q r0 = r0.b()
            r26 = r41
            r34 = r0
            r27 = r3
            r24 = r6
            r28 = r7
            r29 = r8
            r33 = r9
            r21 = r12
            r25 = r14
            r22 = r16
            r23 = r19
            r14 = r20
            r12 = r39
            r0 = r40
        L_0x0304:
            r20 = r4
            goto L_0x0324
        L_0x0307:
            r0 = r40
            r26 = r41
            r34 = r52
            r27 = r3
            r24 = r6
            r28 = r7
            r29 = r8
            r33 = r9
            r21 = r12
            r25 = r14
            r22 = r16
            r23 = r19
            r14 = r20
            r12 = r39
            goto L_0x0304
        L_0x0324:
            r10.v()
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0335
            java.lang.String r1 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)"
            r2 = 1804514146(0x6b8eb362, float:3.4502916E26)
            Y.C1506p.Q(r2, r0, r5, r1)
        L_0x0335:
            W0.s r16 = r14.i(r12)
            r8 = r12 ^ 1
            if (r12 == 0) goto L_0x0340
            r32 = r18
            goto L_0x0342
        L_0x0340:
            r32 = r26
        L_0x0342:
            if (r12 == 0) goto L_0x0347
            r9 = r18
            goto L_0x0349
        L_0x0347:
            r9 = r25
        L_0x0349:
            r1 = r0 & 14
            r2 = 4
            if (r1 != r2) goto L_0x0351
            r1 = r18
            goto L_0x0352
        L_0x0351:
            r1 = 0
        L_0x0352:
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != r3) goto L_0x0359
            goto L_0x035b
        L_0x0359:
            r18 = 0
        L_0x035b:
            r1 = r1 | r18
            java.lang.Object r2 = r10.A()
            if (r1 != 0) goto L_0x036f
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x036c
            goto L_0x036f
        L_0x036c:
            r7 = r38
            goto L_0x0379
        L_0x036f:
            J.c$b r2 = new J.c$b
            r7 = r38
            r2.<init>(r15, r7)
            r10.r(r2)
        L_0x0379:
            r1 = r2
            yf.l r1 = (yf.C6798l) r1
            r2 = r0 & 910(0x38e, float:1.275E-42)
            int r3 = r0 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r5 << 9
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r3
            r2 = r2 | r4
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r17 = r2 | r3
            int r2 = r0 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r5
            r18 = r0 | r2
            r19 = 0
            r0 = r37
            r2 = r20
            r3 = r23
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r33
            r30 = r10
            r10 = r32
            r11 = r16
            r31 = r12
            r12 = r24
            r13 = r21
            r32 = r14
            r14 = r22
            r15 = r34
            r16 = r30
            J.C1213i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x03d8
            Y.C1506p.P()
        L_0x03d8:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r8 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r9 = r31
            r7 = r32
            r15 = r33
            r16 = r34
        L_0x03f4:
            Y.Y0 r2 = r30.k()
            if (r2 == 0) goto L_0x0415
            J.c$c r1 = new J.c$c
            r0 = r1
            r35 = r1
            r1 = r37
            r36 = r2
            r2 = r38
            r17 = r54
            r18 = r55
            r19 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r35
            r0 = r36
            r0.a(r1)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1207c.a(W0.Q, yf.l, k0.i, boolean, boolean, Q0.T, J.x, J.w, boolean, int, int, W0.c0, yf.l, B.l, r0.n0, yf.q, Y.m, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r41, yf.C6798l r42, k0.i r43, boolean r44, boolean r45, Q0.T r46, J.C1227x r47, J.C1226w r48, boolean r49, int r50, int r51, W0.c0 r52, yf.C6798l r53, B.l r54, r0.C2514n0 r55, yf.q r56, Y.C1500m r57, int r58, int r59, int r60) {
        /*
            r1 = r41
            r2 = r42
            r15 = r58
            r14 = r59
            r13 = r60
            r0 = 945255183(0x3857730f, float:5.136715E-5)
            r3 = r57
            Y.m r3 = r3.h(r0)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x001a
            r4 = r15 | 6
            goto L_0x002a
        L_0x001a:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x0029
            boolean r4 = r3.S(r1)
            if (r4 == 0) goto L_0x0026
            r4 = 4
            goto L_0x0027
        L_0x0026:
            r4 = 2
        L_0x0027:
            r4 = r4 | r15
            goto L_0x002a
        L_0x0029:
            r4 = r15
        L_0x002a:
            r7 = r13 & 2
            if (r7 == 0) goto L_0x0031
            r4 = r4 | 48
            goto L_0x0041
        L_0x0031:
            r7 = r15 & 48
            if (r7 != 0) goto L_0x0041
            boolean r7 = r3.C(r2)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x004a
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r12 = r43
            goto L_0x005d
        L_0x004a:
            r12 = r15 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0047
            r12 = r43
            boolean r16 = r3.S(r12)
            if (r16 == 0) goto L_0x0059
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r4 = r4 | r16
        L_0x005d:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r44
            goto L_0x007d
        L_0x006a:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r44
            boolean r19 = r3.b(r8)
            if (r19 == 0) goto L_0x0079
            r19 = r18
            goto L_0x007b
        L_0x0079:
            r19 = r17
        L_0x007b:
            r4 = r4 | r19
        L_0x007d:
            r19 = r13 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x008a
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r10 = r45
            goto L_0x009d
        L_0x008a:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0087
            r10 = r45
            boolean r23 = r3.b(r10)
            if (r23 == 0) goto L_0x0099
            r23 = r21
            goto L_0x009b
        L_0x0099:
            r23 = r20
        L_0x009b:
            r4 = r4 | r23
        L_0x009d:
            r23 = r13 & 32
            r24 = 131072(0x20000, float:1.83671E-40)
            r25 = 196608(0x30000, float:2.75506E-40)
            if (r23 == 0) goto L_0x00aa
            r4 = r4 | r25
            r11 = r46
            goto L_0x00bd
        L_0x00aa:
            r26 = r15 & r25
            r11 = r46
            if (r26 != 0) goto L_0x00bd
            boolean r27 = r3.S(r11)
            if (r27 == 0) goto L_0x00b9
            r27 = r24
            goto L_0x00bb
        L_0x00b9:
            r27 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r4 = r4 | r27
        L_0x00bd:
            r27 = r13 & 64
            r28 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x00c8
            r4 = r4 | r28
            r9 = r47
            goto L_0x00db
        L_0x00c8:
            r28 = r15 & r28
            r9 = r47
            if (r28 != 0) goto L_0x00db
            boolean r29 = r3.S(r9)
            if (r29 == 0) goto L_0x00d7
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r4 = r4 | r29
        L_0x00db:
            r5 = r13 & 128(0x80, float:1.794E-43)
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 == 0) goto L_0x00e6
            r4 = r4 | r30
            r6 = r48
            goto L_0x00f9
        L_0x00e6:
            r30 = r15 & r30
            r6 = r48
            if (r30 != 0) goto L_0x00f9
            boolean r31 = r3.S(r6)
            if (r31 == 0) goto L_0x00f5
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f7
        L_0x00f5:
            r31 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f7:
            r4 = r4 | r31
        L_0x00f9:
            r0 = r13 & 256(0x100, float:3.59E-43)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0104
            r4 = r4 | r32
            r6 = r49
            goto L_0x0117
        L_0x0104:
            r32 = r15 & r32
            r6 = r49
            if (r32 != 0) goto L_0x0117
            boolean r32 = r3.b(r6)
            if (r32 == 0) goto L_0x0113
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r32 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r4 = r4 | r32
        L_0x0117:
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r32 = r15 & r32
            if (r32 != 0) goto L_0x0133
            r6 = r13 & 512(0x200, float:7.175E-43)
            if (r6 != 0) goto L_0x012c
            r6 = r50
            boolean r32 = r3.d(r6)
            if (r32 == 0) goto L_0x012e
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012c:
            r6 = r50
        L_0x012e:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r4 = r4 | r32
            goto L_0x0135
        L_0x0133:
            r6 = r50
        L_0x0135:
            r6 = r13 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x013e
            r32 = r14 | 6
            r8 = r51
            goto L_0x0154
        L_0x013e:
            r32 = r14 & 6
            r8 = r51
            if (r32 != 0) goto L_0x0152
            boolean r32 = r3.d(r8)
            if (r32 == 0) goto L_0x014d
            r32 = 4
            goto L_0x014f
        L_0x014d:
            r32 = 2
        L_0x014f:
            r32 = r14 | r32
            goto L_0x0154
        L_0x0152:
            r32 = r14
        L_0x0154:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x015d
            r32 = r32 | 48
        L_0x015a:
            r9 = r32
            goto L_0x0171
        L_0x015d:
            r33 = r14 & 48
            r9 = r52
            if (r33 != 0) goto L_0x015a
            boolean r33 = r3.S(r9)
            if (r33 == 0) goto L_0x016c
            r33 = 32
            goto L_0x016e
        L_0x016c:
            r33 = 16
        L_0x016e:
            r32 = r32 | r33
            goto L_0x015a
        L_0x0171:
            r10 = r13 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x017a
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0177:
            r11 = r53
            goto L_0x018d
        L_0x017a:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0177
            r11 = r53
            boolean r32 = r3.C(r11)
            if (r32 == 0) goto L_0x0189
            r22 = 256(0x100, float:3.59E-43)
            goto L_0x018b
        L_0x0189:
            r22 = 128(0x80, float:1.794E-43)
        L_0x018b:
            r9 = r9 | r22
        L_0x018d:
            r11 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0196
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0193:
            r12 = r54
            goto L_0x01a6
        L_0x0196:
            r12 = r14 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0193
            r12 = r54
            boolean r22 = r3.S(r12)
            if (r22 == 0) goto L_0x01a4
            r17 = r18
        L_0x01a4:
            r9 = r9 | r17
        L_0x01a6:
            r12 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x01af
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x01ac:
            r2 = r55
            goto L_0x01bf
        L_0x01af:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x01ac
            r2 = r55
            boolean r17 = r3.S(r2)
            if (r17 == 0) goto L_0x01bd
            r20 = r21
        L_0x01bd:
            r9 = r9 | r20
        L_0x01bf:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r13 & r17
            if (r17 == 0) goto L_0x01cb
            r9 = r9 | r25
            r2 = r56
            goto L_0x01dc
        L_0x01cb:
            r18 = r14 & r25
            r2 = r56
            if (r18 != 0) goto L_0x01dc
            boolean r18 = r3.C(r2)
            if (r18 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x01da:
            r9 = r9 | r24
        L_0x01dc:
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r4 & r18
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r14) goto L_0x0219
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r9
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r14) goto L_0x0219
            boolean r2 = r3.i()
            if (r2 != 0) goto L_0x01f6
            goto L_0x0219
        L_0x01f6:
            r3.I()
            r7 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r8 = r46
            r9 = r47
            r10 = r48
            r11 = r49
            r12 = r50
            r13 = r51
            r14 = r52
            r15 = r53
            r36 = r54
            r37 = r55
            r16 = r56
            goto L_0x044d
        L_0x0219:
            r3.D()
            r2 = r15 & 1
            r18 = 1
            if (r2 == 0) goto L_0x0253
            boolean r2 = r3.L()
            if (r2 == 0) goto L_0x0229
            goto L_0x0253
        L_0x0229:
            r3.I()
            r0 = r13 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0234
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r0
        L_0x0234:
            r2 = r43
            r7 = r44
            r0 = r45
            r5 = r47
            r6 = r48
            r8 = r49
            r14 = r50
            r50 = r51
            r11 = r52
            r12 = r53
            r36 = r54
            r37 = r55
            r38 = r56
            r10 = r4
            r4 = r46
            goto L_0x0301
        L_0x0253:
            if (r7 == 0) goto L_0x0258
            k0.i$a r2 = k0.i.f23074a
            goto L_0x025a
        L_0x0258:
            r2 = r43
        L_0x025a:
            if (r16 == 0) goto L_0x025f
            r7 = r18
            goto L_0x0261
        L_0x025f:
            r7 = r44
        L_0x0261:
            if (r19 == 0) goto L_0x0266
            r16 = 0
            goto L_0x0268
        L_0x0266:
            r16 = r45
        L_0x0268:
            if (r23 == 0) goto L_0x0271
            Q0.T$a r19 = Q0.T.f5294d
            Q0.T r19 = r19.a()
            goto L_0x0273
        L_0x0271:
            r19 = r46
        L_0x0273:
            if (r27 == 0) goto L_0x027c
            J.x$a r20 = J.C1227x.f3486g
            J.x r20 = r20.a()
            goto L_0x027e
        L_0x027c:
            r20 = r47
        L_0x027e:
            if (r5 == 0) goto L_0x0287
            J.w$a r5 = J.C1226w.f3478g
            J.w r5 = r5.a()
            goto L_0x0289
        L_0x0287:
            r5 = r48
        L_0x0289:
            if (r0 == 0) goto L_0x028d
            r0 = 0
            goto L_0x028f
        L_0x028d:
            r0 = r49
        L_0x028f:
            r14 = r13 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x02a1
            if (r0 == 0) goto L_0x0298
            r14 = r18
            goto L_0x029b
        L_0x0298:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L_0x029b:
            r22 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r4 = r4 & r22
            goto L_0x02a3
        L_0x02a1:
            r14 = r50
        L_0x02a3:
            if (r6 == 0) goto L_0x02a8
            r6 = r18
            goto L_0x02aa
        L_0x02a8:
            r6 = r51
        L_0x02aa:
            if (r8 == 0) goto L_0x02b3
            W0.c0$a r8 = W0.c0.f8551a
            W0.c0 r8 = r8.c()
            goto L_0x02b5
        L_0x02b3:
            r8 = r52
        L_0x02b5:
            if (r10 == 0) goto L_0x02ba
            J.c$d r10 = J.C1207c.d.f3048a
            goto L_0x02bc
        L_0x02ba:
            r10 = r53
        L_0x02bc:
            if (r11 == 0) goto L_0x02c0
            r11 = 0
            goto L_0x02c2
        L_0x02c0:
            r11 = r54
        L_0x02c2:
            if (r12 == 0) goto L_0x02d7
            r0.h2 r12 = new r0.h2
            r0.x0$a r22 = r0.C2544x0.f25560b
            r44 = r4
            r43 = r5
            long r4 = r22.a()
            r45 = r0
            r0 = 0
            r12.<init>(r4, r0)
            goto L_0x02df
        L_0x02d7:
            r45 = r0
            r44 = r4
            r43 = r5
            r12 = r55
        L_0x02df:
            if (r17 == 0) goto L_0x02fe
            J.e r0 = J.C1209e.f3157a
            yf.q r0 = r0.a()
            r38 = r0
        L_0x02e9:
            r50 = r6
            r36 = r11
            r37 = r12
            r0 = r16
            r4 = r19
            r5 = r20
            r6 = r43
            r11 = r8
            r12 = r10
            r10 = r44
            r8 = r45
            goto L_0x0301
        L_0x02fe:
            r38 = r56
            goto L_0x02e9
        L_0x0301:
            r3.v()
            boolean r16 = Y.C1506p.H()
            if (r16 == 0) goto L_0x0315
            java.lang.String r13 = "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)"
            r51 = r14
            r14 = 945255183(0x3857730f, float:5.136715E-5)
            Y.C1506p.Q(r14, r10, r9, r13)
            goto L_0x0317
        L_0x0315:
            r51 = r14
        L_0x0317:
            java.lang.Object r13 = r3.A()
            Y.m$a r14 = Y.C1500m.f10026a
            java.lang.Object r15 = r14.a()
            if (r13 != r15) goto L_0x0347
            W0.Q r13 = new W0.Q
            r15 = 6
            r16 = 0
            r19 = 0
            r17 = 0
            r43 = r13
            r44 = r41
            r45 = r19
            r47 = r17
            r48 = r15
            r49 = r16
            r43.<init>((java.lang.String) r44, (long) r45, (Q0.Q) r47, (int) r48, (kotlin.jvm.internal.DefaultConstructorMarker) r49)
            r52 = r0
            r0 = 0
            r15 = 2
            Y.r0 r13 = Y.u1.d(r13, r0, r15, r0)
            r3.r(r13)
            goto L_0x0349
        L_0x0347:
            r52 = r0
        L_0x0349:
            Y.r0 r13 = (Y.C1510r0) r13
            W0.Q r0 = c(r13)
            r15 = 6
            r16 = 0
            r19 = 0
            r17 = 0
            r43 = r0
            r44 = r41
            r45 = r19
            r47 = r17
            r48 = r15
            r49 = r16
            W0.Q r0 = W0.Q.d(r43, r44, r45, r47, r48, r49)
            boolean r15 = r3.S(r0)
            r43 = r7
            java.lang.Object r7 = r3.A()
            if (r15 != 0) goto L_0x0378
            java.lang.Object r15 = r14.a()
            if (r7 != r15) goto L_0x0380
        L_0x0378:
            J.c$e r7 = new J.c$e
            r7.<init>(r0, r13)
            r3.r(r7)
        L_0x0380:
            yf.a r7 = (yf.C6787a) r7
            r15 = 0
            Y.P.h(r7, r3, r15)
            r7 = r10 & 14
            r15 = 4
            if (r7 != r15) goto L_0x038e
            r7 = r18
            goto L_0x038f
        L_0x038e:
            r7 = 0
        L_0x038f:
            java.lang.Object r15 = r3.A()
            if (r7 != 0) goto L_0x039b
            java.lang.Object r7 = r14.a()
            if (r15 != r7) goto L_0x03a4
        L_0x039b:
            r7 = 2
            r15 = 0
            Y.r0 r15 = Y.u1.d(r1, r15, r7, r15)
            r3.r(r15)
        L_0x03a4:
            Y.r0 r15 = (Y.C1510r0) r15
            W0.s r27 = r5.i(r8)
            r24 = r8 ^ 1
            if (r8 == 0) goto L_0x03b1
            r26 = r18
            goto L_0x03b3
        L_0x03b1:
            r26 = r50
        L_0x03b3:
            if (r8 == 0) goto L_0x03b8
            r25 = r18
            goto L_0x03ba
        L_0x03b8:
            r25 = r51
        L_0x03ba:
            boolean r7 = r3.S(r15)
            r1 = r10 & 112(0x70, float:1.57E-43)
            r44 = r5
            r5 = 32
            if (r1 != r5) goto L_0x03c7
            goto L_0x03c9
        L_0x03c7:
            r18 = 0
        L_0x03c9:
            r1 = r7 | r18
            java.lang.Object r5 = r3.A()
            if (r1 != 0) goto L_0x03db
            java.lang.Object r1 = r14.a()
            if (r5 != r1) goto L_0x03d8
            goto L_0x03db
        L_0x03d8:
            r7 = r42
            goto L_0x03e5
        L_0x03db:
            J.c$f r5 = new J.c$f
            r7 = r42
            r5.<init>(r7, r13, r15)
            r3.r(r5)
        L_0x03e5:
            r17 = r5
            yf.l r17 = (yf.C6798l) r17
            r1 = r10 & 896(0x380, float:1.256E-42)
            int r5 = r10 >> 6
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            int r5 = r9 << 9
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r5
            r1 = r1 | r13
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r13
            r33 = r1 | r5
            int r1 = r10 >> 15
            r1 = r1 & 896(0x380, float:1.256E-42)
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r10
            r1 = r1 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r9
            r34 = r1 | r5
            r35 = 0
            r16 = r0
            r18 = r2
            r19 = r4
            r20 = r11
            r21 = r12
            r22 = r36
            r23 = r37
            r28 = r6
            r29 = r43
            r30 = r52
            r31 = r38
            r32 = r3
            J.C1213i.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x043b
            Y.C1506p.P()
        L_0x043b:
            r5 = r43
            r9 = r44
            r13 = r50
            r10 = r6
            r14 = r11
            r15 = r12
            r16 = r38
            r12 = r51
            r6 = r52
            r11 = r8
            r8 = r4
            r4 = r2
        L_0x044d:
            Y.Y0 r3 = r3.k()
            if (r3 == 0) goto L_0x0486
            J.c$g r2 = new J.c$g
            r0 = r2
            r1 = r41
            r39 = r2
            r2 = r42
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r11
            r11 = r13
            r13 = r12
            r12 = r14
            r14 = r13
            r13 = r15
            r15 = r14
            r14 = r36
            r40 = r15
            r15 = r37
            r17 = r58
            r18 = r59
            r19 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r39
            r0 = r40
            r0.a(r1)
        L_0x0486:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C1207c.b(java.lang.String, yf.l, k0.i, boolean, boolean, Q0.T, J.x, J.w, boolean, int, int, W0.c0, yf.l, B.l, r0.n0, yf.q, Y.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final Q c(C1510r0 r0Var) {
        return (Q) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void d(C1510r0 r0Var, Q q10) {
        r0Var.setValue(q10);
    }

    /* access modifiers changed from: private */
    public static final String e(C1510r0 r0Var) {
        return (String) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void f(C1510r0 r0Var, String str) {
        r0Var.setValue(str);
    }

    /* renamed from: J.c$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3026a = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L) obj);
            return C6514M.f71813a;
        }

        public final void a(L l10) {
        }
    }

    /* renamed from: J.c$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3048a = new d();

        d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((L) obj);
            return C6514M.f71813a;
        }

        public final void a(L l10) {
        }
    }
}
