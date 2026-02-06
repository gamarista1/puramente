package G;

import A.j;
import C.N;
import O0.t;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1500m;
import Y.M0;
import k0.c;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.r;
import z.C2939C;

public abstract class m {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f2321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f2322b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f2323c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f2324d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f2325e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f2326f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c.C0368c f2327g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C2939C f2328h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f2329i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f2330j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C6798l f2331k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C0.a f2332l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j f2333m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ r f2334n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f2335o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f2336p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f2337q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C c10, i iVar, N n10, g gVar, int i10, float f10, c.C0368c cVar, C2939C c11, boolean z10, boolean z11, C6798l lVar, C0.a aVar, j jVar, r rVar, int i11, int i12, int i13) {
            super(2);
            this.f2321a = c10;
            this.f2322b = iVar;
            this.f2323c = n10;
            this.f2324d = gVar;
            this.f2325e = i10;
            this.f2326f = f10;
            this.f2327g = cVar;
            this.f2328h = c11;
            this.f2329i = z10;
            this.f2330j = z11;
            this.f2331k = lVar;
            this.f2332l = aVar;
            this.f2333m = jVar;
            this.f2334n = rVar;
            this.f2335o = i11;
            this.f2336p = i12;
            this.f2337q = i13;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            C c10 = this.f2321a;
            C c11 = c10;
            m.a(c11, this.f2322b, this.f2323c, this.f2324d, this.f2325e, this.f2326f, this.f2327g, this.f2328h, this.f2329i, this.f2330j, this.f2331k, this.f2332l, this.f2333m, this.f2334n, mVar2, M0.a(this.f2335o | 1), M0.a(this.f2336p), this.f2337q);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f2338a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f2339b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f2340c;

        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C f2341a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f2342b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C c10, K k10) {
                super(0);
                this.f2341a = c10;
                this.f2342b = k10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(m.f(this.f2341a, this.f2342b));
            }
        }

        /* renamed from: G.m$b$b  reason: collision with other inner class name */
        static final class C0037b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C f2343a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f2344b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0037b(C c10, K k10) {
                super(0);
                this.f2343a = c10;
                this.f2344b = k10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(m.g(this.f2343a, this.f2344b));
            }
        }

        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C f2345a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f2346b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C c10, K k10) {
                super(0);
                this.f2345a = c10;
                this.f2346b = k10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(m.f(this.f2345a, this.f2346b));
            }
        }

        static final class d extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C f2347a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f2348b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(C c10, K k10) {
                super(0);
                this.f2347a = c10;
                this.f2348b = k10;
            }

            /* renamed from: a */
            public final Boolean invoke() {
                return Boolean.valueOf(m.g(this.f2347a, this.f2348b));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C c10, K k10) {
            super(1);
            this.f2338a = z10;
            this.f2339b = c10;
            this.f2340c = k10;
        }

        public final void a(v vVar) {
            if (this.f2338a) {
                t.K(vVar, (String) null, new a(this.f2339b, this.f2340c), 1, (Object) null);
                t.E(vVar, (String) null, new C0037b(this.f2339b, this.f2340c), 1, (Object) null);
                return;
            }
            t.G(vVar, (String) null, new c(this.f2339b, this.f2340c), 1, (Object) null);
            t.I(vVar, (String) null, new d(this.f2339b, this.f2340c), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((v) obj);
            return C6514M.f71813a;
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f2349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f2350b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C c10, C6658d dVar) {
            super(2, dVar);
            this.f2350b = c10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new c(this.f2350b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f2349a;
            if (i10 == 0) {
                w.b(obj);
                C c10 = this.f2350b;
                this.f2349a = 1;
                if (D.f(c10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f2351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C f2352b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C c10, C6658d dVar) {
            super(2, dVar);
            this.f2352b = c10;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f2352b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f2351a;
            if (i10 == 0) {
                w.b(obj);
                C c10 = this.f2352b;
                this.f2351a = 1;
                if (D.e(c10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(G.C r35, k0.i r36, C.N r37, G.g r38, int r39, float r40, k0.c.C0368c r41, z.C2939C r42, boolean r43, boolean r44, yf.C6798l r45, C0.a r46, A.j r47, yf.r r48, Y.C1500m r49, int r50, int r51, int r52) {
        /*
            r15 = r35
            r14 = r50
            r13 = r51
            r11 = r52
            r9 = 1870896258(0x6f839c82, float:8.1463485E28)
            r0 = r49
            Y.m r10 = r0.h(r9)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0018
            r0 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r0 = r14 & 6
            if (r0 != 0) goto L_0x0027
            boolean r0 = r10.S(r15)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r14
            goto L_0x0028
        L_0x0027:
            r0 = r14
        L_0x0028:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0031
            r0 = r0 | 48
        L_0x002e:
            r6 = r36
            goto L_0x0043
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r36
            boolean r7 = r10.S(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r0 = r0 | r7
        L_0x0043:
            r7 = r11 & 4
            if (r7 == 0) goto L_0x004c
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r37
            goto L_0x005f
        L_0x004c:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r37
            boolean r16 = r10.S(r1)
            if (r16 == 0) goto L_0x005b
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r0 = r0 | r16
        L_0x005f:
            r16 = r11 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r2 = r38
            goto L_0x007f
        L_0x006c:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0069
            r2 = r38
            boolean r20 = r10.S(r2)
            if (r20 == 0) goto L_0x007b
            r20 = r18
            goto L_0x007d
        L_0x007b:
            r20 = r17
        L_0x007d:
            r0 = r0 | r20
        L_0x007f:
            r20 = r11 & 16
            if (r20 == 0) goto L_0x0088
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r4 = r39
            goto L_0x009b
        L_0x0088:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0085
            r4 = r39
            boolean r22 = r10.d(r4)
            if (r22 == 0) goto L_0x0097
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r22
        L_0x009b:
            r22 = r11 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00a6
            r0 = r0 | r23
            r5 = r40
            goto L_0x00b9
        L_0x00a6:
            r24 = r14 & r23
            r5 = r40
            if (r24 != 0) goto L_0x00b9
            boolean r25 = r10.c(r5)
            if (r25 == 0) goto L_0x00b5
            r25 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r25 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r0 = r0 | r25
        L_0x00b9:
            r25 = r11 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r25 == 0) goto L_0x00c4
            r0 = r0 | r26
            r8 = r41
            goto L_0x00d7
        L_0x00c4:
            r26 = r14 & r26
            r8 = r41
            if (r26 != 0) goto L_0x00d7
            boolean r27 = r10.S(r8)
            if (r27 == 0) goto L_0x00d3
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r0 = r0 | r27
        L_0x00d7:
            r27 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x00f3
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 != 0) goto L_0x00ec
            r12 = r42
            boolean r28 = r10.S(r12)
            if (r28 == 0) goto L_0x00ee
            r28 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r12 = r42
        L_0x00ee:
            r28 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r0 = r0 | r28
            goto L_0x00f5
        L_0x00f3:
            r12 = r42
        L_0x00f5:
            r9 = r11 & 256(0x100, float:3.59E-43)
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 == 0) goto L_0x0100
            r0 = r0 | r29
            r8 = r43
            goto L_0x0113
        L_0x0100:
            r29 = r14 & r29
            r8 = r43
            if (r29 != 0) goto L_0x0113
            boolean r29 = r10.b(r8)
            if (r29 == 0) goto L_0x010f
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0111
        L_0x010f:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0111:
            r0 = r0 | r29
        L_0x0113:
            r8 = r11 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 == 0) goto L_0x0122
            r0 = r0 | r29
            r30 = r0
            r29 = r8
            r8 = r44
            goto L_0x013f
        L_0x0122:
            r29 = r14 & r29
            if (r29 != 0) goto L_0x013a
            r29 = r8
            r8 = r44
            boolean r30 = r10.b(r8)
            if (r30 == 0) goto L_0x0133
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r0 = r0 | r30
        L_0x0137:
            r30 = r0
            goto L_0x013f
        L_0x013a:
            r29 = r8
            r8 = r44
            goto L_0x0137
        L_0x013f:
            r0 = r11 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0148
            r19 = r13 | 6
            r8 = r45
            goto L_0x015e
        L_0x0148:
            r31 = r13 & 6
            r8 = r45
            if (r31 != 0) goto L_0x015c
            boolean r31 = r10.C(r8)
            if (r31 == 0) goto L_0x0157
            r19 = 4
            goto L_0x0159
        L_0x0157:
            r19 = 2
        L_0x0159:
            r19 = r13 | r19
            goto L_0x015e
        L_0x015c:
            r19 = r13
        L_0x015e:
            r31 = r13 & 48
            if (r31 != 0) goto L_0x017c
            r31 = r0
            r0 = r11 & 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0173
            r0 = r46
            boolean r32 = r10.C(r0)
            if (r32 == 0) goto L_0x0175
            r21 = 32
            goto L_0x0177
        L_0x0173:
            r0 = r46
        L_0x0175:
            r21 = 16
        L_0x0177:
            r19 = r19 | r21
        L_0x0179:
            r0 = r19
            goto L_0x0181
        L_0x017c:
            r31 = r0
            r0 = r46
            goto L_0x0179
        L_0x0181:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x018a
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0187:
            r1 = r47
            goto L_0x019d
        L_0x018a:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0187
            r1 = r47
            boolean r19 = r10.S(r1)
            if (r19 == 0) goto L_0x0199
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x019b
        L_0x0199:
            r26 = 128(0x80, float:1.794E-43)
        L_0x019b:
            r0 = r0 | r26
        L_0x019d:
            r1 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x01a6
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x01a3:
            r1 = r48
            goto L_0x01b6
        L_0x01a6:
            r1 = r13 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x01a3
            r1 = r48
            boolean r19 = r10.C(r1)
            if (r19 == 0) goto L_0x01b4
            r17 = r18
        L_0x01b4:
            r0 = r0 | r17
        L_0x01b6:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r30 & r17
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L_0x01e8
            r1 = r0 & 1171(0x493, float:1.641E-42)
            r2 = 1170(0x492, float:1.64E-42)
            if (r1 != r2) goto L_0x01e8
            boolean r1 = r10.i()
            if (r1 != 0) goto L_0x01cd
            goto L_0x01e8
        L_0x01cd:
            r10.I()
            r3 = r37
            r7 = r41
            r9 = r43
            r11 = r45
            r13 = r47
            r2 = r6
            r28 = r10
            r8 = r12
            r10 = r44
            r12 = r46
            r6 = r5
            r5 = r4
            r4 = r38
            goto L_0x0396
        L_0x01e8:
            r10.D()
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0224
            boolean r1 = r10.L()
            if (r1 == 0) goto L_0x01f6
            goto L_0x0224
        L_0x01f6:
            r10.I()
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0202
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r30 = r30 & r1
        L_0x0202:
            r1 = r11 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0208
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0208:
            r21 = r37
            r22 = r38
            r25 = r41
            r27 = r43
            r29 = r44
            r31 = r46
            r32 = r47
            r23 = r4
            r24 = r5
            r20 = r6
            r26 = r12
            r1 = r30
            r30 = r45
            goto L_0x02ed
        L_0x0224:
            if (r3 == 0) goto L_0x022b
            k0.i$a r1 = k0.i.f23074a
            r17 = r1
            goto L_0x022d
        L_0x022b:
            r17 = r6
        L_0x022d:
            r6 = 0
            if (r7 == 0) goto L_0x023c
            float r1 = (float) r6
            float r1 = c1.h.j(r1)
            C.N r1 = androidx.compose.foundation.layout.n.a(r1)
            r18 = r1
            goto L_0x023e
        L_0x023c:
            r18 = r37
        L_0x023e:
            if (r16 == 0) goto L_0x0245
            G.g$a r1 = G.g.a.f2309a
            r16 = r1
            goto L_0x0247
        L_0x0245:
            r16 = r38
        L_0x0247:
            if (r20 == 0) goto L_0x024c
            r19 = r6
            goto L_0x024e
        L_0x024c:
            r19 = r4
        L_0x024e:
            if (r22 == 0) goto L_0x0258
            float r1 = (float) r6
            float r1 = c1.h.j(r1)
            r20 = r1
            goto L_0x025a
        L_0x0258:
            r20 = r5
        L_0x025a:
            if (r25 == 0) goto L_0x0265
            k0.c$a r1 = k0.c.f23044a
            k0.c$c r1 = r1.i()
            r21 = r1
            goto L_0x0267
        L_0x0265:
            r21 = r41
        L_0x0267:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0290
            G.k r1 = G.k.f2315a
            r2 = r30 & 14
            r7 = r2 | r23
            r12 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r22 = r0
            r23 = r31
            r0 = r1
            r1 = r35
            r24 = r6
            r6 = r10
            r26 = r8
            r25 = r29
            r8 = r12
            z.C r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r30 = r30 & r1
            goto L_0x029b
        L_0x0290:
            r22 = r0
            r24 = r6
            r26 = r8
            r25 = r29
            r23 = r31
            r0 = r12
        L_0x029b:
            if (r9 == 0) goto L_0x029f
            r1 = 1
            goto L_0x02a1
        L_0x029f:
            r1 = r43
        L_0x02a1:
            if (r25 == 0) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            r24 = r44
        L_0x02a6:
            if (r23 == 0) goto L_0x02aa
            r2 = 0
            goto L_0x02ac
        L_0x02aa:
            r2 = r45
        L_0x02ac:
            r3 = r11 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x02bf
            G.k r3 = G.k.f2315a
            z.q r4 = z.q.Horizontal
            r5 = r30 & 14
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            C0.a r3 = r3.b(r15, r4, r10, r5)
            r4 = r22 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02c3
        L_0x02bf:
            r3 = r46
            r4 = r22
        L_0x02c3:
            if (r26 == 0) goto L_0x02e3
            A.j$a r5 = A.j.a.f418a
            r26 = r0
            r27 = r1
            r31 = r3
            r0 = r4
            r32 = r5
        L_0x02d0:
            r22 = r16
            r23 = r19
            r25 = r21
            r29 = r24
            r1 = r30
            r30 = r2
            r21 = r18
            r24 = r20
            r20 = r17
            goto L_0x02ed
        L_0x02e3:
            r32 = r47
            r26 = r0
            r27 = r1
            r31 = r3
            r0 = r4
            goto L_0x02d0
        L_0x02ed:
            r10.v()
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x02fe
            java.lang.String r2 = "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)"
            r3 = 1870896258(0x6f839c82, float:8.1463485E28)
            Y.C1506p.Q(r3, r1, r0, r2)
        L_0x02fe:
            z.q r4 = z.q.Horizontal
            k0.c$a r2 = k0.c.f23044a
            k0.c$b r12 = r2.g()
            int r2 = r1 >> 3
            r2 = r2 & 14
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            int r3 = r1 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            int r3 = r1 >> 18
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r3 = r1 >> 6
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r3
            r2 = r2 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r5
            r2 = r2 | r3
            int r3 = r1 << 9
            r5 = 29360128(0x1c00000, float:7.052966E-38)
            r5 = r5 & r3
            r2 = r2 | r5
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r2 = r2 | r3
            int r3 = r1 << 18
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r5
            r17 = r2 | r3
            int r2 = r0 >> 3
            r2 = r2 & 14
            r2 = r2 | 384(0x180, float:5.38E-43)
            int r3 = r0 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            int r1 = r1 >> 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            int r0 = r0 << 6
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r18 = r1 | r0
            r19 = 0
            r0 = r20
            r1 = r35
            r2 = r21
            r3 = r29
            r5 = r26
            r6 = r27
            r7 = r23
            r8 = r24
            r9 = r22
            r28 = r10
            r10 = r31
            r11 = r30
            r13 = r25
            r14 = r32
            r15 = r48
            r16 = r28
            G.C1177c.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = Y.C1506p.H()
            if (r0 == 0) goto L_0x037e
            Y.C1506p.P()
        L_0x037e:
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
        L_0x0396:
            Y.Y0 r15 = r28.k()
            if (r15 == 0) goto L_0x03b7
            G.m$a r14 = new G.m$a
            r0 = r14
            r1 = r35
            r33 = r14
            r14 = r48
            r34 = r15
            r15 = r50
            r16 = r51
            r17 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r33
            r0 = r34
            r0.a(r1)
        L_0x03b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G.m.a(G.C, k0.i, C.N, G.g, int, float, k0.c$c, z.C, boolean, boolean, yf.l, C0.a, A.j, yf.r, Y.m, int, int, int):void");
    }

    public static final int d(j jVar, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16) {
        return Af.a.d(((float) jVar.a(i10, i11, i13, i14, i15, i16)) - (f10 * ((float) (i11 + i12))));
    }

    public static final i e(i iVar, C c10, boolean z10, K k10, boolean z11) {
        if (z11) {
            return iVar.h(O0.m.d(i.f23074a, false, new b(z10, c10, k10), 1, (Object) null));
        }
        return iVar.h(i.f23074a);
    }

    /* access modifiers changed from: private */
    public static final boolean f(C c10, K k10) {
        if (!c10.c()) {
            return false;
        }
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new c(c10, (C6658d) null), 3, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean g(C c10, K k10) {
        if (!c10.d()) {
            return false;
        }
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new d(c10, (C6658d) null), 3, (Object) null);
        return true;
    }
}
