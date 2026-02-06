package Z3;

import C.C1088f;
import H0.C1187h;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import X3.g;
import Y.C1500m;
import Y.M0;
import java.util.List;
import java.util.Map;
import k0.i;
import k4.C3668j;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.C2547y0;
import t0.C2605f;
import w0.C2817c;
import yf.C6787a;
import yf.C6798l;
import yf.q;
import yf.r;

public abstract class u {

    static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3668j f10532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f10533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f10534c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f10535d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k0.c f10536e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C1187h f10537f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f10538g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C2547y0 f10539h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f10540i;

        a(C3668j jVar, q qVar, f fVar, String str, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, boolean z10) {
            this.f10532a = jVar;
            this.f10533b = qVar;
            this.f10534c = fVar;
            this.f10535d = str;
            this.f10536e = cVar;
            this.f10537f = hVar;
            this.f10538g = f10;
            this.f10539h = y0Var;
            this.f10540i = z10;
        }

        public final void a(C1088f fVar, C1500m mVar, int i10) {
            int i11;
            if ((i10 & 14) == 0) {
                if (mVar.S(fVar)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if ((i10 & 91) != 18 || !mVar.i()) {
                ((l) this.f10532a).y(fVar.c());
                this.f10533b.invoke(new r(fVar, this.f10534c, this.f10535d, this.f10536e, this.f10537f, this.f10538g, this.f10539h, this.f10540i), mVar, 0);
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f10541a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6787a aVar) {
            super(0);
            this.f10541a = aVar;
        }

        public final Object invoke() {
            return this.f10541a.invoke();
        }
    }

    static final class c implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10542a = new c();

        c() {
        }

        /* access modifiers changed from: private */
        public static final C6514M d(U.a aVar) {
            return C6514M.f71813a;
        }

        public final G j(H h10, List list, long j10) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, new v(), 4, (Object) null);
        }
    }

    static final class d implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f10543a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f10544b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f10545c;

        d(r rVar, r rVar2, r rVar3) {
            this.f10543a = rVar;
            this.f10544b = rVar2;
            this.f10545c = rVar3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(Z3.w r14, Y.C1500m r15, int r16) {
            /*
                r13 = this;
                r0 = r13
                r1 = r14
                r10 = r15
                r2 = r16 & 14
                if (r2 != 0) goto L_0x0013
                boolean r2 = r15.S(r14)
                if (r2 == 0) goto L_0x000f
                r2 = 4
                goto L_0x0010
            L_0x000f:
                r2 = 2
            L_0x0010:
                r2 = r16 | r2
                goto L_0x0015
            L_0x0013:
                r2 = r16
            L_0x0015:
                r3 = r2 & 91
                r4 = 18
                if (r3 != r4) goto L_0x0027
                boolean r3 = r15.i()
                if (r3 != 0) goto L_0x0022
                goto L_0x0027
            L_0x0022:
                r15.I()
                goto L_0x00b5
            L_0x0027:
                Z3.f r3 = r14.u()
                Z3.f$b r3 = r3.B()
                boolean r4 = r3 instanceof Z3.f.b.c
                r5 = 0
                r6 = 1
                if (r4 == 0) goto L_0x0053
                r4 = 1739512213(0x67aed995, float:1.6514109E24)
                r15.z(r4)
                yf.r r4 = r0.f10543a
                if (r4 == 0) goto L_0x004d
                r6 = r2 & 14
                r6 = r6 | 64
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r4.invoke(r14, r3, r15, r6)
                lf.M r3 = lf.C6514M.f71813a
                goto L_0x004e
            L_0x004d:
                r5 = r6
            L_0x004e:
                r15.R()
            L_0x0051:
                r6 = r5
                goto L_0x00a2
            L_0x0053:
                boolean r4 = r3 instanceof Z3.f.b.d
                if (r4 == 0) goto L_0x0074
                r4 = 1739605461(0x67b045d5, float:1.6648493E24)
                r15.z(r4)
                yf.r r4 = r0.f10544b
                if (r4 == 0) goto L_0x006f
                r6 = r2 & 14
                r6 = r6 | 64
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r4.invoke(r14, r3, r15, r6)
                lf.M r3 = lf.C6514M.f71813a
                goto L_0x0070
            L_0x006f:
                r5 = r6
            L_0x0070:
                r15.R()
                goto L_0x0051
            L_0x0074:
                boolean r4 = r3 instanceof Z3.f.b.C0194b
                if (r4 == 0) goto L_0x0095
                r4 = 1739696601(0x67b1a9d9, float:1.677984E24)
                r15.z(r4)
                yf.r r4 = r0.f10545c
                if (r4 == 0) goto L_0x0090
                r6 = r2 & 14
                r6 = r6 | 64
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r4.invoke(r14, r3, r15, r6)
                lf.M r3 = lf.C6514M.f71813a
                goto L_0x0091
            L_0x0090:
                r5 = r6
            L_0x0091:
                r15.R()
                goto L_0x0051
            L_0x0095:
                boolean r3 = r3 instanceof Z3.f.b.a
                if (r3 == 0) goto L_0x00b6
                r3 = 1739782316(0x67b2f8ac, float:1.6903368E24)
                r15.z(r3)
                r15.R()
            L_0x00a2:
                if (r6 == 0) goto L_0x00b5
                r11 = r2 & 14
                r12 = 255(0xff, float:3.57E-43)
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r1 = r14
                r10 = r15
                Z3.u.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            L_0x00b5:
                return
            L_0x00b6:
                r1 = -82435959(0xfffffffffb162089, float:-7.795044E35)
                r15.z(r1)
                r15.R()
                lf.s r1 = new lf.s
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Z3.u.d.a(Z3.w, Y.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((w) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void c(Object obj, String str, g gVar, i iVar, C6798l lVar, r rVar, r rVar2, r rVar3, C6798l lVar2, C6798l lVar3, C6798l lVar4, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, int i10, boolean z10, p pVar, C1500m mVar, int i11, int i12, int i13) {
        int i14 = i13;
        mVar.z(-1545157471);
        i iVar2 = (i14 & 8) != 0 ? i.f23074a : iVar;
        C6798l a10 = (i14 & 16) != 0 ? f.f10429v.a() : lVar;
        C2547y0 y0Var2 = null;
        r rVar4 = (i14 & 32) != 0 ? null : rVar;
        r rVar5 = (i14 & 64) != 0 ? null : rVar2;
        r rVar6 = (i14 & 128) != 0 ? null : rVar3;
        C6798l lVar5 = (i14 & 256) != 0 ? null : lVar2;
        C6798l lVar6 = (i14 & 512) != 0 ? null : lVar3;
        C6798l lVar7 = (i14 & 1024) != 0 ? null : lVar4;
        k0.c e10 = (i14 & 2048) != 0 ? k0.c.f23044a.e() : cVar;
        C1187h d10 = (i14 & 4096) != 0 ? C1187h.f2609a.d() : hVar;
        float f11 = (i14 & 8192) != 0 ? 1.0f : f10;
        if ((i14 & 16384) == 0) {
            y0Var2 = y0Var;
        }
        int b10 = (32768 & i14) != 0 ? C2605f.f25940d0.b() : i10;
        boolean z11 = (65536 & i14) != 0 ? true : z10;
        i iVar3 = new i(obj, (i14 & 131072) != 0 ? q.a() : pVar, gVar);
        C6798l i15 = z.i(lVar5, lVar6, lVar7);
        q h10 = h(rVar4, rVar5, rVar6);
        int i16 = i11 >> 3;
        int i17 = (i11 & 112) | (i16 & 896) | (i16 & 7168);
        int i18 = i12 << 12;
        d(iVar3, str, iVar2, a10, i15, e10, d10, f11, y0Var2, b10, z11, h10, mVar, i17 | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), (i12 >> 18) & 14, 0);
        mVar.R();
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d(Z3.i r25, java.lang.String r26, k0.i r27, yf.C6798l r28, yf.C6798l r29, k0.c r30, H0.C1187h r31, float r32, r0.C2547y0 r33, int r34, boolean r35, yf.q r36, Y.C1500m r37, int r38, int r39, int r40) {
        /*
            r10 = r30
            r11 = r31
            r12 = r36
            r13 = r38
            r15 = r40
            r0 = -605638725(0xffffffffdbe6afbb, float:-1.29864925E17)
            r1 = r37
            Y.m r14 = r1.h(r0)
            r0 = r15 & 1
            if (r0 == 0) goto L_0x001c
            r0 = r13 | 6
            r9 = r25
            goto L_0x002e
        L_0x001c:
            r0 = r13 & 14
            r9 = r25
            if (r0 != 0) goto L_0x002d
            boolean r0 = r14.S(r9)
            if (r0 == 0) goto L_0x002a
            r0 = 4
            goto L_0x002b
        L_0x002a:
            r0 = 2
        L_0x002b:
            r0 = r0 | r13
            goto L_0x002e
        L_0x002d:
            r0 = r13
        L_0x002e:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x0037
            r0 = r0 | 48
            r8 = r26
            goto L_0x0049
        L_0x0037:
            r3 = r13 & 112(0x70, float:1.57E-43)
            r8 = r26
            if (r3 != 0) goto L_0x0049
            boolean r3 = r14.S(r8)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r0 = r0 | r3
        L_0x0049:
            r3 = r15 & 4
            if (r3 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r6 = r27
            goto L_0x0064
        L_0x0052:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x004f
            r6 = r27
            boolean r7 = r14.S(r6)
            if (r7 == 0) goto L_0x0061
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r7
        L_0x0064:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x006d
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r7 = r28
            goto L_0x0080
        L_0x006d:
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x006a
            r7 = r28
            boolean r16 = r14.C(r7)
            if (r16 == 0) goto L_0x007c
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r0 = r0 | r16
        L_0x0080:
            r16 = r15 & 16
            r17 = 57344(0xe000, float:8.0356E-41)
            if (r16 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r9 = r29
            goto L_0x009f
        L_0x008c:
            r16 = r13 & r17
            r9 = r29
            if (r16 != 0) goto L_0x009f
            boolean r16 = r14.C(r9)
            if (r16 == 0) goto L_0x009b
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r0 = r0 | r16
        L_0x009f:
            r16 = r15 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00aa
            r16 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r0 = r0 | r16
            goto L_0x00ba
        L_0x00aa:
            r16 = r13 & r18
            if (r16 != 0) goto L_0x00ba
            boolean r16 = r14.S(r10)
            if (r16 == 0) goto L_0x00b7
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r16 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r16 = r15 & 64
            if (r16 == 0) goto L_0x00c3
            r16 = 1572864(0x180000, float:2.204052E-39)
        L_0x00c0:
            r0 = r0 | r16
            goto L_0x00d5
        L_0x00c3:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r14.S(r11)
            if (r16 == 0) goto L_0x00d2
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c0
        L_0x00d2:
            r16 = 524288(0x80000, float:7.34684E-40)
            goto L_0x00c0
        L_0x00d5:
            r1 = r15 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00df
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r1
        L_0x00dc:
            r1 = r32
            goto L_0x00f3
        L_0x00df:
            r1 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r13
            if (r1 != 0) goto L_0x00dc
            r1 = r32
            boolean r16 = r14.c(r1)
            if (r16 == 0) goto L_0x00ef
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ef:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r0 = r0 | r16
        L_0x00f3:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x00fd
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r2
        L_0x00fa:
            r2 = r33
            goto L_0x0111
        L_0x00fd:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x00fa
            r2 = r33
            boolean r19 = r14.S(r2)
            if (r19 == 0) goto L_0x010d
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010d:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r0 = r0 | r19
        L_0x0111:
            r4 = r15 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x011b
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r4
        L_0x0118:
            r4 = r34
            goto L_0x012f
        L_0x011b:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x0118
            r4 = r34
            boolean r20 = r14.d(r4)
            if (r20 == 0) goto L_0x012b
            r20 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x012d
        L_0x012b:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x012d:
            r0 = r0 | r20
        L_0x012f:
            r5 = r15 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x013a
            r5 = r39 | 6
            r16 = r5
            r5 = r35
            goto L_0x0152
        L_0x013a:
            r5 = r39 & 14
            if (r5 != 0) goto L_0x014e
            r5 = r35
            boolean r21 = r14.b(r5)
            if (r21 == 0) goto L_0x0149
            r16 = 4
            goto L_0x014b
        L_0x0149:
            r16 = 2
        L_0x014b:
            r16 = r39 | r16
            goto L_0x0152
        L_0x014e:
            r5 = r35
            r16 = r39
        L_0x0152:
            r1 = r15 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0159
            r16 = r16 | 48
            goto L_0x016a
        L_0x0159:
            r1 = r39 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x016a
            boolean r1 = r14.C(r12)
            if (r1 == 0) goto L_0x0166
            r19 = 32
            goto L_0x0168
        L_0x0166:
            r19 = 16
        L_0x0168:
            r16 = r16 | r19
        L_0x016a:
            r1 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r1 = r1 & r0
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L_0x0186
            r1 = r16 & 91
            r2 = 18
            if (r1 != r2) goto L_0x0186
            boolean r1 = r14.i()
            if (r1 != 0) goto L_0x0180
            goto L_0x0186
        L_0x0180:
            r14.I()
            r3 = r6
            goto L_0x02d8
        L_0x0186:
            if (r3 == 0) goto L_0x018d
            k0.i$a r1 = k0.i.f23074a
            r19 = r1
            goto L_0x018f
        L_0x018d:
            r19 = r6
        L_0x018f:
            java.lang.Object r1 = r25.b()
            int r2 = r0 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 8
            j4.i r20 = Z3.z.l(r1, r11, r14, r2)
            X3.g r1 = r25.a()
            int r2 = r0 >> 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r3 = r3 | 72
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            int r21 = r0 >> 6
            r3 = r21 & r17
            r2 = r2 | r3
            int r17 = r0 >> 12
            r0 = r17 & r18
            r18 = r2 | r0
            r22 = 64
            r6 = 0
            r0 = r20
            r2 = r28
            r3 = r29
            r4 = r31
            r5 = r34
            r7 = r14
            r8 = r18
            r9 = r22
            Z3.f r3 = Z3.h.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            k4.j r1 = r20.K()
            boolean r0 = r1 instanceof Z3.l
            r9 = 1
            if (r0 != 0) goto L_0x029e
            r0 = -2080018031(0xffffffff84057191, float:-1.5686222E-36)
            r14.z(r0)
            r0 = r21 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r1 = r17 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.z(r1)
            int r0 = r0 >> 3
            r0 = r0 & 14
            r0 = r0 | 48
            H0.F r0 = androidx.compose.foundation.layout.d.j(r10, r9, r14, r0)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.z(r1)
            r1 = 0
            int r2 = Y.C1494j.a(r14, r1)
            Y.y r4 = r14.p()
            J0.g$a r5 = J0.C1241g.f3853J
            yf.a r6 = r5.a()
            yf.q r7 = H0.C1202x.b(r19)
            Y.f r8 = r14.j()
            if (r8 != 0) goto L_0x0213
            Y.C1494j.c()
        L_0x0213:
            r14.F()
            boolean r8 = r14.f()
            if (r8 == 0) goto L_0x0220
            r14.U(r6)
            goto L_0x0223
        L_0x0220:
            r14.q()
        L_0x0223:
            Y.m r6 = Y.F1.a(r14)
            yf.p r8 = r5.c()
            Y.F1.b(r6, r0, r8)
            yf.p r0 = r5.e()
            Y.F1.b(r6, r4, r0)
            yf.p r0 = r5.b()
            boolean r4 = r6.f()
            if (r4 != 0) goto L_0x024d
            java.lang.Object r4 = r6.A()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
            if (r4 != 0) goto L_0x025b
        L_0x024d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6.r(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.V(r2, r0)
        L_0x025b:
            Y.m r0 = Y.C1470a1.b(r14)
            Y.a1 r0 = Y.C1470a1.a(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7.invoke(r0, r14, r1)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.z(r0)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            Z3.r r9 = new Z3.r
            r0 = r9
            r2 = r3
            r3 = r26
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.invoke(r9, r14, r0)
            r14.R()
            r14.u()
            r14.R()
            r14.R()
            r14.R()
            goto L_0x02d6
        L_0x029e:
            r0 = -2079329304(0xffffffff840ff3e8, float:-1.6921565E-36)
            r14.z(r0)
            Z3.u$a r8 = new Z3.u$a
            r0 = r8
            r2 = r36
            r4 = r26
            r5 = r30
            r6 = r31
            r7 = r32
            r10 = r8
            r8 = r33
            r11 = r9
            r9 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -888190719(0xffffffffcb0f4901, float:-9390337.0)
            g0.a r3 = g0.c.b(r14, r0, r11, r10)
            r0 = r21 & 14
            r0 = r0 | 3456(0xd80, float:4.843E-42)
            r1 = r17 & 112(0x70, float:1.57E-43)
            r5 = r0 | r1
            r6 = 0
            r2 = 1
            r0 = r19
            r1 = r30
            r4 = r14
            C.C1087e.a(r0, r1, r2, r3, r4, r5, r6)
            r14.R()
        L_0x02d6:
            r3 = r19
        L_0x02d8:
            Y.Y0 r14 = r14.k()
            if (r14 == 0) goto L_0x030b
            Z3.t r11 = new Z3.t
            r0 = r11
            r1 = r25
            r2 = r26
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r23 = r11
            r11 = r35
            r12 = r36
            r13 = r38
            r24 = r14
            r14 = r39
            r15 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r23
            r0 = r24
            r0.a(r1)
        L_0x030b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.u.d(Z3.i, java.lang.String, k0.i, yf.l, yf.l, k0.c, H0.h, float, r0.y0, int, boolean, yf.q, Y.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Z3.w r17, k0.i r18, w0.C2817c r19, java.lang.String r20, k0.c r21, H0.C1187h r22, float r23, r0.C2547y0 r24, boolean r25, Y.C1500m r26, int r27, int r28) {
        /*
            r10 = r27
            r11 = r28
            r0 = 880638523(0x347d7a3b, float:2.3606928E-7)
            r1 = r26
            Y.m r0 = r1.h(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r11
            r2 = 2
            if (r1 == 0) goto L_0x0019
            r1 = r10 | 6
            r3 = r1
            r1 = r17
            goto L_0x002d
        L_0x0019:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x002a
            r1 = r17
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002d
        L_0x002a:
            r1 = r17
            r3 = r10
        L_0x002d:
            r4 = r11 & 1
            if (r4 == 0) goto L_0x0036
            r3 = r3 | 48
        L_0x0033:
            r5 = r18
            goto L_0x0048
        L_0x0036:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0033
            r5 = r18
            boolean r6 = r0.S(r5)
            if (r6 == 0) goto L_0x0045
            r6 = 32
            goto L_0x0047
        L_0x0045:
            r6 = 16
        L_0x0047:
            r3 = r3 | r6
        L_0x0048:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x004e
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x004e:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0067
            r7 = r11 & 4
            if (r7 != 0) goto L_0x0061
            r7 = r20
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0063
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0065
        L_0x0061:
            r7 = r20
        L_0x0063:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0065:
            r3 = r3 | r8
            goto L_0x0069
        L_0x0067:
            r7 = r20
        L_0x0069:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r10
            if (r8 != 0) goto L_0x0084
            r8 = r11 & 8
            if (r8 != 0) goto L_0x007e
            r8 = r21
            boolean r9 = r0.S(r8)
            if (r9 == 0) goto L_0x0080
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0082
        L_0x007e:
            r8 = r21
        L_0x0080:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0082:
            r3 = r3 | r9
            goto L_0x0086
        L_0x0084:
            r8 = r21
        L_0x0086:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x00a0
            r9 = r11 & 16
            if (r9 != 0) goto L_0x009a
            r9 = r22
            boolean r12 = r0.S(r9)
            if (r12 == 0) goto L_0x009c
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009e
        L_0x009a:
            r9 = r22
        L_0x009c:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x009e:
            r3 = r3 | r12
            goto L_0x00a2
        L_0x00a0:
            r9 = r22
        L_0x00a2:
            r12 = 3670016(0x380000, float:5.142788E-39)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00bc
            r12 = r11 & 32
            if (r12 != 0) goto L_0x00b6
            r12 = r23
            boolean r13 = r0.c(r12)
            if (r13 == 0) goto L_0x00b8
            r13 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ba
        L_0x00b6:
            r12 = r23
        L_0x00b8:
            r13 = 524288(0x80000, float:7.34684E-40)
        L_0x00ba:
            r3 = r3 | r13
            goto L_0x00be
        L_0x00bc:
            r12 = r23
        L_0x00be:
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00d8
            r13 = r11 & 64
            if (r13 != 0) goto L_0x00d2
            r13 = r24
            boolean r14 = r0.S(r13)
            if (r14 == 0) goto L_0x00d4
            r14 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d6
        L_0x00d2:
            r13 = r24
        L_0x00d4:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L_0x00d6:
            r3 = r3 | r14
            goto L_0x00da
        L_0x00d8:
            r13 = r24
        L_0x00da:
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00f4
            r14 = r11 & 128(0x80, float:1.794E-43)
            if (r14 != 0) goto L_0x00ee
            r14 = r25
            boolean r15 = r0.b(r14)
            if (r15 == 0) goto L_0x00f0
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00f2
        L_0x00ee:
            r14 = r25
        L_0x00f0:
            r15 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00f2:
            r3 = r3 | r15
            goto L_0x00f6
        L_0x00f4:
            r14 = r25
        L_0x00f6:
            if (r6 != r2) goto L_0x0116
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r2 & r3
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r3) goto L_0x0116
            boolean r2 = r0.i()
            if (r2 != 0) goto L_0x0108
            goto L_0x0116
        L_0x0108:
            r0.I()
            r3 = r19
        L_0x010d:
            r2 = r5
            r4 = r7
            r5 = r8
            r6 = r9
            r7 = r12
            r8 = r13
            r9 = r14
            goto L_0x021d
        L_0x0116:
            r0.D()
            r2 = r10 & 1
            if (r2 == 0) goto L_0x012a
            boolean r2 = r0.L()
            if (r2 == 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            r0.I()
            r2 = r19
            goto L_0x016e
        L_0x012a:
            if (r4 == 0) goto L_0x012f
            k0.i$a r2 = k0.i.f23074a
            r5 = r2
        L_0x012f:
            if (r6 == 0) goto L_0x0136
            Z3.f r2 = r17.u()
            goto L_0x0138
        L_0x0136:
            r2 = r19
        L_0x0138:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0141
            java.lang.String r3 = r17.getContentDescription()
            r7 = r3
        L_0x0141:
            r3 = r11 & 8
            if (r3 == 0) goto L_0x014a
            k0.c r3 = r17.t()
            r8 = r3
        L_0x014a:
            r3 = r11 & 16
            if (r3 == 0) goto L_0x0153
            H0.h r3 = r17.s()
            r9 = r3
        L_0x0153:
            r3 = r11 & 32
            if (r3 == 0) goto L_0x015c
            float r3 = r17.a()
            r12 = r3
        L_0x015c:
            r3 = r11 & 64
            if (r3 == 0) goto L_0x0165
            r0.y0 r3 = r17.b()
            r13 = r3
        L_0x0165:
            r3 = r11 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x016e
            boolean r3 = r17.r()
            r14 = r3
        L_0x016e:
            r0.v()
            k0.i r3 = Z3.z.e(r5, r7)
            if (r14 == 0) goto L_0x017b
            k0.i r3 = o0.C2342e.b(r3)
        L_0x017b:
            coil.compose.ContentPainterElement r4 = new coil.compose.ContentPainterElement
            r18 = r4
            r19 = r2
            r20 = r8
            r21 = r9
            r22 = r12
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23)
            k0.i r3 = r3.h(r4)
            Z3.u$c r4 = Z3.u.c.f10542a
            r6 = 544976794(0x207baf9a, float:2.1318629E-19)
            r0.z(r6)
            r6 = 0
            int r6 = Y.C1494j.a(r0, r6)
            k0.i r3 = k0.h.e(r0, r3)
            Y.y r15 = r0.p()
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r1 = r16.a()
            r18 = r2
            r2 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r0.z(r2)
            Y.f r2 = r0.j()
            if (r2 != 0) goto L_0x01bc
            Y.C1494j.c()
        L_0x01bc:
            r0.F()
            boolean r2 = r0.f()
            if (r2 == 0) goto L_0x01ce
            Z3.u$b r2 = new Z3.u$b
            r2.<init>(r1)
            r0.U(r2)
            goto L_0x01d1
        L_0x01ce:
            r0.q()
        L_0x01d1:
            Y.m r1 = Y.F1.a(r0)
            yf.p r2 = r16.c()
            Y.F1.b(r1, r4, r2)
            yf.p r2 = r16.e()
            Y.F1.b(r1, r15, r2)
            yf.p r2 = r16.d()
            Y.F1.b(r1, r3, r2)
            yf.p r2 = r16.b()
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x0202
            java.lang.Object r3 = r1.A()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r3 != 0) goto L_0x0210
        L_0x0202:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.r(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.V(r3, r2)
        L_0x0210:
            r0.u()
            r0.R()
            r0.R()
            r3 = r18
            goto L_0x010d
        L_0x021d:
            Y.Y0 r12 = r0.k()
            if (r12 == 0) goto L_0x0232
            Z3.s r13 = new Z3.s
            r0 = r13
            r1 = r17
            r10 = r27
            r11 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.u.e(Z3.w, k0.i, w0.c, java.lang.String, k0.c, H0.h, float, r0.y0, boolean, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M f(w wVar, i iVar, C2817c cVar, String str, k0.c cVar2, C1187h hVar, float f10, C2547y0 y0Var, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        e(wVar, iVar, cVar, str, cVar2, hVar, f10, y0Var, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M g(i iVar, String str, i iVar2, C6798l lVar, C6798l lVar2, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, int i10, boolean z10, q qVar, int i11, int i12, int i13, C1500m mVar, int i14) {
        d(iVar, str, iVar2, lVar, lVar2, cVar, hVar, f10, y0Var, i10, z10, qVar, mVar, M0.a(i11 | 1), M0.a(i12), i13);
        return C6514M.f71813a;
    }

    private static final q h(r rVar, r rVar2, r rVar3) {
        if (rVar == null && rVar2 == null && rVar3 == null) {
            return j.f10470a.a();
        }
        return g0.c.c(750771424, true, new d(rVar, rVar2, rVar3));
    }
}
