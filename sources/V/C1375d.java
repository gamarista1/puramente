package V;

import B.l;
import C.N;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.M0;
import androidx.compose.foundation.o;
import androidx.compose.ui.graphics.f;
import androidx.compose.ui.window.s;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.g2;
import w.C2777V;
import x.C2868g;
import yf.C6787a;
import yf.p;
import yf.q;

/* renamed from: V.d  reason: case insensitive filesystem */
public abstract class C1375d {

    /* renamed from: a  reason: collision with root package name */
    private static final s f7348a = new s(true, false, false, false, 14, (DefaultConstructorMarker) null);

    /* renamed from: V.d$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2777V f7350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f7351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f7352d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g2 f7353e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f7354f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f7355g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f7356h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C2868g f7357i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ q f7358j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C2777V v10, C1510r0 r0Var, o oVar, g2 g2Var, long j10, float f10, float f11, C2868g gVar, q qVar) {
            super(2);
            this.f7349a = iVar;
            this.f7350b = v10;
            this.f7351c = r0Var;
            this.f7352d = oVar;
            this.f7353e = g2Var;
            this.f7354f = j10;
            this.f7355g = f10;
            this.f7356h = f11;
            this.f7357i = gVar;
            this.f7358j = qVar;
        }

        public final void a(C1500m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(2126968933, i11, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                }
                C1374c0.a(this.f7349a, this.f7350b, this.f7351c, this.f7352d, this.f7353e, this.f7354f, this.f7355g, this.f7356h, this.f7357i, this.f7358j, mVar, (C2777V.f27247d << 3) | 384);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.d$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f7359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7360b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7361c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f7362d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ o f7363e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f7364f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g2 f7365g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f7366h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ float f7367i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7368j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C2868g f7369k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ q f7370l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f7371m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7372n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7373o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, C6787a aVar, i iVar, long j10, o oVar, s sVar, g2 g2Var, long j11, float f10, float f11, C2868g gVar, q qVar, int i10, int i11, int i12) {
            super(2);
            this.f7359a = z10;
            this.f7360b = aVar;
            this.f7361c = iVar;
            this.f7362d = j10;
            this.f7363e = oVar;
            this.f7364f = sVar;
            this.f7365g = g2Var;
            this.f7366h = j11;
            this.f7367i = f10;
            this.f7368j = f11;
            this.f7369k = gVar;
            this.f7370l = qVar;
            this.f7371m = i10;
            this.f7372n = i11;
            this.f7373o = i12;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            boolean z10 = this.f7359a;
            boolean z11 = z10;
            C1375d.a(z11, this.f7360b, this.f7361c, this.f7362d, this.f7363e, this.f7364f, this.f7365g, this.f7366h, this.f7367i, this.f7368j, this.f7369k, this.f7370l, mVar2, M0.a(this.f7371m | 1), M0.a(this.f7372n), this.f7373o);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.d$c */
    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1510r0 f7374a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C1510r0 r0Var) {
            super(2);
            this.f7374a = r0Var;
        }

        public final void a(c1.p pVar, c1.p pVar2) {
            this.f7374a.setValue(f.b(C1374c0.h(pVar, pVar2)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((c1.p) obj, (c1.p) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: V.d$d  reason: collision with other inner class name */
    static final class C0164d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f7375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f7376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f7377c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f7378d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7379e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f7380f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C1372b0 f7381g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ N f7382h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f7383i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f7384j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f7385k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0164d(p pVar, C6787a aVar, i iVar, p pVar2, p pVar3, boolean z10, C1372b0 b0Var, N n10, l lVar, int i10, int i11) {
            super(2);
            this.f7375a = pVar;
            this.f7376b = aVar;
            this.f7377c = iVar;
            this.f7378d = pVar2;
            this.f7379e = pVar3;
            this.f7380f = z10;
            this.f7381g = b0Var;
            this.f7382h = n10;
            this.f7383i = lVar;
            this.f7384j = i10;
            this.f7385k = i11;
        }

        public final void a(C1500m mVar, int i10) {
            C1375d.b(this.f7375a, this.f7376b, this.f7377c, this.f7378d, this.f7379e, this.f7380f, this.f7381g, this.f7382h, this.f7383i, mVar, M0.a(this.f7384j | 1), this.f7385k);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: W.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: W.j} */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02d5, code lost:
        if (r15 == r7.a()) goto L_0x02d7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r38, yf.C6787a r39, k0.i r40, long r41, androidx.compose.foundation.o r43, androidx.compose.ui.window.s r44, r0.g2 r45, long r46, float r48, float r49, x.C2868g r50, yf.q r51, Y.C1500m r52, int r53, int r54, int r55) {
        /*
            r15 = r53
            r14 = r55
            r0 = 1431928300(0x55597dec, float:1.49459283E13)
            r1 = r52
            Y.m r1 = r1.h(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r15 | 6
            r5 = r2
            r2 = r38
            goto L_0x002b
        L_0x0017:
            r2 = r15 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r38
            boolean r5 = r1.b(r2)
            if (r5 == 0) goto L_0x0025
            r5 = 4
            goto L_0x0026
        L_0x0025:
            r5 = 2
        L_0x0026:
            r5 = r5 | r15
            goto L_0x002b
        L_0x0028:
            r2 = r38
            r5 = r15
        L_0x002b:
            r6 = r14 & 2
            if (r6 == 0) goto L_0x0034
            r5 = r5 | 48
        L_0x0031:
            r6 = r39
            goto L_0x0046
        L_0x0034:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r39
            boolean r9 = r1.C(r6)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r5 = r5 | r9
        L_0x0046:
            r9 = r14 & 4
            if (r9 == 0) goto L_0x004f
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r40
            goto L_0x0061
        L_0x004f:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r40
            boolean r11 = r1.S(r10)
            if (r11 == 0) goto L_0x005e
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r5 = r5 | r11
        L_0x0061:
            r11 = r14 & 8
            if (r11 == 0) goto L_0x006a
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r7 = r41
            goto L_0x007d
        L_0x006a:
            r13 = r15 & 3072(0xc00, float:4.305E-42)
            r7 = r41
            if (r13 != 0) goto L_0x007d
            boolean r16 = r1.e(r7)
            if (r16 == 0) goto L_0x0079
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r5 = r5 | r16
        L_0x007d:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0097
            r3 = r14 & 16
            if (r3 != 0) goto L_0x0090
            r3 = r43
            boolean r17 = r1.S(r3)
            if (r17 == 0) goto L_0x0092
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0090:
            r3 = r43
        L_0x0092:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r17
            goto L_0x0099
        L_0x0097:
            r3 = r43
        L_0x0099:
            r17 = r14 & 32
            r18 = 196608(0x30000, float:2.75506E-40)
            if (r17 == 0) goto L_0x00a4
            r5 = r5 | r18
            r13 = r44
            goto L_0x00b7
        L_0x00a4:
            r18 = r15 & r18
            r13 = r44
            if (r18 != 0) goto L_0x00b7
            boolean r19 = r1.S(r13)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r5 = r5 | r19
        L_0x00b7:
            r19 = 1572864(0x180000, float:2.204052E-39)
            r19 = r15 & r19
            if (r19 != 0) goto L_0x00d1
            r19 = r14 & 64
            r12 = r45
            if (r19 != 0) goto L_0x00cc
            boolean r20 = r1.S(r12)
            if (r20 == 0) goto L_0x00cc
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r5 = r5 | r20
            goto L_0x00d3
        L_0x00d1:
            r12 = r45
        L_0x00d3:
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r15 & r20
            if (r20 != 0) goto L_0x00ec
            r4 = r14 & 128(0x80, float:1.794E-43)
            r2 = r46
            if (r4 != 0) goto L_0x00e8
            boolean r4 = r1.e(r2)
            if (r4 == 0) goto L_0x00e8
            r4 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r4 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r5 = r5 | r4
            goto L_0x00ee
        L_0x00ec:
            r2 = r46
        L_0x00ee:
            r4 = r14 & 256(0x100, float:3.59E-43)
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 == 0) goto L_0x00f9
            r5 = r5 | r21
            r0 = r48
            goto L_0x010c
        L_0x00f9:
            r21 = r15 & r21
            r0 = r48
            if (r21 != 0) goto L_0x010c
            boolean r22 = r1.c(r0)
            if (r22 == 0) goto L_0x0108
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010a
        L_0x0108:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010a:
            r5 = r5 | r22
        L_0x010c:
            r0 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0117
            r5 = r5 | r22
            r2 = r49
            goto L_0x0129
        L_0x0117:
            r22 = r15 & r22
            r2 = r49
            if (r22 != 0) goto L_0x0129
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L_0x0126
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0128
        L_0x0126:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0128:
            r5 = r5 | r3
        L_0x0129:
            r3 = r14 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0132
            r16 = r54 | 6
            r2 = r50
            goto L_0x0148
        L_0x0132:
            r22 = r54 & 6
            r2 = r50
            if (r22 != 0) goto L_0x0146
            boolean r22 = r1.S(r2)
            if (r22 == 0) goto L_0x0141
            r16 = 4
            goto L_0x0143
        L_0x0141:
            r16 = 2
        L_0x0143:
            r16 = r54 | r16
            goto L_0x0148
        L_0x0146:
            r16 = r54
        L_0x0148:
            r2 = r14 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0151
            r16 = r16 | 48
        L_0x014e:
            r2 = r16
            goto L_0x0168
        L_0x0151:
            r2 = r54 & 48
            if (r2 != 0) goto L_0x0165
            r2 = r51
            boolean r22 = r1.C(r2)
            if (r22 == 0) goto L_0x0160
            r18 = 32
            goto L_0x0162
        L_0x0160:
            r18 = 16
        L_0x0162:
            r16 = r16 | r18
            goto L_0x014e
        L_0x0165:
            r2 = r51
            goto L_0x014e
        L_0x0168:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r5 & r16
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x0193
            r6 = r2 & 19
            r7 = 18
            if (r6 != r7) goto L_0x0193
            boolean r6 = r1.i()
            if (r6 != 0) goto L_0x017f
            goto L_0x0193
        L_0x017f:
            r1.I()
            r4 = r41
            r6 = r43
            r11 = r48
            r3 = r10
            r8 = r12
            r7 = r13
            r9 = r46
            r12 = r49
            r13 = r50
            goto L_0x0351
        L_0x0193:
            r1.D()
            r6 = r15 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = 1
            if (r6 == 0) goto L_0x01ce
            boolean r6 = r1.L()
            if (r6 == 0) goto L_0x01a5
            goto L_0x01ce
        L_0x01a5:
            r1.I()
            r0 = r14 & 16
            if (r0 == 0) goto L_0x01ad
            r5 = r5 & r8
        L_0x01ad:
            r0 = r14 & 64
            if (r0 == 0) goto L_0x01b5
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r0
        L_0x01b5:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01bd
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = r5 & r0
        L_0x01bd:
            r18 = r43
            r3 = r46
            r0 = r48
            r9 = r50
            r6 = r10
            r8 = r13
            r10 = r41
            r13 = r5
            r5 = r49
            goto L_0x023c
        L_0x01ce:
            if (r9 == 0) goto L_0x01d3
            k0.i$a r6 = k0.i.f23074a
            goto L_0x01d4
        L_0x01d3:
            r6 = r10
        L_0x01d4:
            r9 = 0
            if (r11 == 0) goto L_0x01e5
            float r10 = (float) r9
            float r11 = c1.h.j(r10)
            float r10 = c1.h.j(r10)
            long r10 = c1.i.a(r11, r10)
            goto L_0x01e7
        L_0x01e5:
            r10 = r41
        L_0x01e7:
            r18 = r14 & 16
            if (r18 == 0) goto L_0x01f1
            androidx.compose.foundation.o r18 = androidx.compose.foundation.m.a(r9, r1, r9, r7)
            r5 = r5 & r8
            goto L_0x01f3
        L_0x01f1:
            r18 = r43
        L_0x01f3:
            if (r17 == 0) goto L_0x01f8
            androidx.compose.ui.window.s r8 = f7348a
            goto L_0x01f9
        L_0x01f8:
            r8 = r13
        L_0x01f9:
            r13 = r14 & 64
            r9 = 6
            if (r13 == 0) goto L_0x0208
            V.a0 r12 = V.C1370a0.f7183a
            r0.g2 r12 = r12.e(r1, r9)
            r13 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r13
        L_0x0208:
            r13 = r14 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0217
            V.a0 r13 = V.C1370a0.f7183a
            long r22 = r13.a(r1, r9)
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r5 = r5 & r9
            goto L_0x0219
        L_0x0217:
            r22 = r46
        L_0x0219:
            if (r4 == 0) goto L_0x0222
            V.a0 r4 = V.C1370a0.f7183a
            float r4 = r4.f()
            goto L_0x0224
        L_0x0222:
            r4 = r48
        L_0x0224:
            if (r0 == 0) goto L_0x022d
            V.a0 r0 = V.C1370a0.f7183a
            float r0 = r0.d()
            goto L_0x022f
        L_0x022d:
            r0 = r49
        L_0x022f:
            if (r3 == 0) goto L_0x0238
            r13 = r5
            r9 = 0
        L_0x0233:
            r5 = r0
            r0 = r4
            r3 = r22
            goto L_0x023c
        L_0x0238:
            r9 = r50
            r13 = r5
            goto L_0x0233
        L_0x023c:
            r1.v()
            boolean r22 = Y.C1506p.H()
            if (r22 == 0) goto L_0x024d
            java.lang.String r7 = "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)"
            r14 = 1431928300(0x55597dec, float:1.49459283E13)
            Y.C1506p.Q(r14, r13, r2, r7)
        L_0x024d:
            java.lang.Object r2 = r1.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r14 = r7.a()
            if (r2 != r14) goto L_0x0263
            w.V r2 = new w.V
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r2.<init>(r14)
            r1.r(r2)
        L_0x0263:
            w.V r2 = (w.C2777V) r2
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r38)
            r2.h(r14)
            java.lang.Object r14 = r2.a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0289
            java.lang.Object r14 = r2.b()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0285
            goto L_0x0289
        L_0x0285:
            r48 = r8
            goto L_0x033a
        L_0x0289:
            java.lang.Object r14 = r1.A()
            java.lang.Object r15 = r7.a()
            if (r14 != r15) goto L_0x02a9
            androidx.compose.ui.graphics.f$a r14 = androidx.compose.ui.graphics.f.f13431b
            long r14 = r14.a()
            androidx.compose.ui.graphics.f r14 = androidx.compose.ui.graphics.f.b(r14)
            r48 = r8
            r8 = 0
            r15 = 2
            Y.r0 r14 = Y.u1.d(r14, r8, r15, r8)
            r1.r(r14)
            goto L_0x02ab
        L_0x02a9:
            r48 = r8
        L_0x02ab:
            r8 = r14
            Y.r0 r8 = (Y.C1510r0) r8
            Y.I0 r14 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r14 = r1.m(r14)
            c1.d r14 = (c1.d) r14
            r15 = r13 & 7168(0x1c00, float:1.0045E-41)
            r16 = r13
            r13 = 2048(0x800, float:2.87E-42)
            if (r15 != r13) goto L_0x02c3
            r17 = 1
            goto L_0x02c5
        L_0x02c3:
            r17 = 0
        L_0x02c5:
            boolean r13 = r1.S(r14)
            r13 = r17 | r13
            java.lang.Object r15 = r1.A()
            if (r13 != 0) goto L_0x02d7
            java.lang.Object r7 = r7.a()
            if (r15 != r7) goto L_0x02f7
        L_0x02d7:
            W.j r15 = new W.j
            V.d$c r7 = new V.d$c
            r7.<init>(r8)
            r13 = 4
            r17 = 0
            r19 = 0
            r40 = r15
            r41 = r10
            r43 = r14
            r44 = r19
            r45 = r7
            r46 = r13
            r47 = r17
            r40.<init>(r41, r43, r44, r45, r46, r47)
            r1.r(r15)
        L_0x02f7:
            r7 = r15
            W.j r7 = (W.j) r7
            V.d$a r13 = new V.d$a
            r22 = r13
            r23 = r6
            r24 = r2
            r25 = r8
            r26 = r18
            r27 = r12
            r28 = r3
            r30 = r0
            r31 = r5
            r32 = r9
            r33 = r51
            r22.<init>(r23, r24, r25, r26, r27, r28, r30, r31, r32, r33)
            r2 = 54
            r8 = 2126968933(0x7ec6f865, float:1.3223844E38)
            r14 = 1
            g0.a r2 = g0.c.e(r8, r14, r13, r1, r2)
            r8 = r16 & 112(0x70, float:1.57E-43)
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            int r13 = r16 >> 9
            r13 = r13 & 896(0x380, float:1.256E-42)
            r8 = r8 | r13
            r13 = 0
            r40 = r7
            r41 = r39
            r42 = r48
            r43 = r2
            r44 = r1
            r45 = r8
            r46 = r13
            androidx.compose.ui.window.b.a(r40, r41, r42, r43, r44, r45, r46)
        L_0x033a:
            boolean r2 = Y.C1506p.H()
            if (r2 == 0) goto L_0x0343
            Y.C1506p.P()
        L_0x0343:
            r7 = r48
            r13 = r9
            r8 = r12
            r12 = r5
            r36 = r10
            r11 = r0
            r9 = r3
            r3 = r6
            r4 = r36
            r6 = r18
        L_0x0351:
            Y.Y0 r15 = r1.k()
            if (r15 == 0) goto L_0x0374
            V.d$b r14 = new V.d$b
            r0 = r14
            r1 = r38
            r2 = r39
            r34 = r14
            r14 = r51
            r35 = r15
            r15 = r53
            r16 = r54
            r17 = r55
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            r1 = r34
            r0 = r35
            r0.a(r1)
        L_0x0374:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1375d.a(boolean, yf.a, k0.i, long, androidx.compose.foundation.o, androidx.compose.ui.window.s, r0.g2, long, float, float, x.g, yf.q, Y.m, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(yf.p r23, yf.C6787a r24, k0.i r25, yf.p r26, yf.p r27, boolean r28, V.C1372b0 r29, C.N r30, B.l r31, Y.C1500m r32, int r33, int r34) {
        /*
            r10 = r33
            r11 = r34
            r0 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            r1 = r32
            Y.m r1 = r1.h(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r10 | 6
            r3 = r2
            r2 = r23
            goto L_0x002b
        L_0x0017:
            r2 = r10 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r23
            boolean r3 = r1.C(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r10
            goto L_0x002b
        L_0x0028:
            r2 = r23
            r3 = r10
        L_0x002b:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r4 = r24
            goto L_0x0046
        L_0x0034:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0031
            r4 = r24
            boolean r5 = r1.C(r4)
            if (r5 == 0) goto L_0x0043
            r5 = 32
            goto L_0x0045
        L_0x0043:
            r5 = 16
        L_0x0045:
            r3 = r3 | r5
        L_0x0046:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r6 = r25
            goto L_0x0061
        L_0x004f:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r25
            boolean r7 = r1.S(r6)
            if (r7 == 0) goto L_0x005e
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r7
        L_0x0061:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r26
            goto L_0x007c
        L_0x006a:
            r8 = r10 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r26
            boolean r9 = r1.C(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r12 = r27
            goto L_0x0097
        L_0x0085:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0082
            r12 = r27
            boolean r13 = r1.C(r12)
            if (r13 == 0) goto L_0x0094
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r13
        L_0x0097:
            r13 = r11 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r13 == 0) goto L_0x00a1
            r3 = r3 | r14
        L_0x009e:
            r14 = r28
            goto L_0x00b2
        L_0x00a1:
            r14 = r14 & r10
            if (r14 != 0) goto L_0x009e
            r14 = r28
            boolean r15 = r1.b(r14)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r15
        L_0x00b2:
            r15 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00cd
            r15 = r11 & 64
            if (r15 != 0) goto L_0x00c6
            r15 = r29
            boolean r16 = r1.S(r15)
            if (r16 == 0) goto L_0x00c8
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c6:
            r15 = r29
        L_0x00c8:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r3 = r3 | r16
            goto L_0x00cf
        L_0x00cd:
            r15 = r29
        L_0x00cf:
            r0 = r11 & 128(0x80, float:1.794E-43)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            if (r0 == 0) goto L_0x00da
            r3 = r3 | r17
            r2 = r30
            goto L_0x00ed
        L_0x00da:
            r17 = r10 & r17
            r2 = r30
            if (r17 != 0) goto L_0x00ed
            boolean r17 = r1.S(r2)
            if (r17 == 0) goto L_0x00e9
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00eb
        L_0x00e9:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00eb:
            r3 = r3 | r17
        L_0x00ed:
            r2 = r11 & 256(0x100, float:3.59E-43)
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00f8
            r3 = r3 | r17
            r4 = r31
            goto L_0x010b
        L_0x00f8:
            r17 = r10 & r17
            r4 = r31
            if (r17 != 0) goto L_0x010b
            boolean r17 = r1.S(r4)
            if (r17 == 0) goto L_0x0107
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r3 = r3 | r17
        L_0x010b:
            r17 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r3 & r17
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r6) goto L_0x012b
            boolean r4 = r1.i()
            if (r4 != 0) goto L_0x011c
            goto L_0x012b
        L_0x011c:
            r1.I()
            r3 = r25
            r9 = r31
            r4 = r8
            r5 = r12
            r6 = r14
            r7 = r15
            r8 = r30
            goto L_0x01be
        L_0x012b:
            r1.D()
            r4 = r10 & 1
            r6 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r4 == 0) goto L_0x014e
            boolean r4 = r1.L()
            if (r4 == 0) goto L_0x013c
            goto L_0x014e
        L_0x013c:
            r1.I()
            r0 = r11 & 64
            if (r0 == 0) goto L_0x0144
            r3 = r3 & r6
        L_0x0144:
            r4 = r25
            r2 = r30
            r5 = r31
            r0 = r12
            r7 = r14
            r9 = r15
            goto L_0x0182
        L_0x014e:
            if (r5 == 0) goto L_0x0153
            k0.i$a r4 = k0.i.f23074a
            goto L_0x0155
        L_0x0153:
            r4 = r25
        L_0x0155:
            r5 = 0
            if (r7 == 0) goto L_0x0159
            r8 = r5
        L_0x0159:
            if (r9 == 0) goto L_0x015c
            r12 = r5
        L_0x015c:
            if (r13 == 0) goto L_0x0160
            r7 = 1
            goto L_0x0161
        L_0x0160:
            r7 = r14
        L_0x0161:
            r9 = r11 & 64
            if (r9 == 0) goto L_0x016e
            V.a0 r9 = V.C1370a0.f7183a
            r13 = 6
            V.b0 r9 = r9.g(r1, r13)
            r3 = r3 & r6
            goto L_0x016f
        L_0x016e:
            r9 = r15
        L_0x016f:
            if (r0 == 0) goto L_0x0178
            V.a0 r0 = V.C1370a0.f7183a
            C.N r0 = r0.c()
            goto L_0x017a
        L_0x0178:
            r0 = r30
        L_0x017a:
            if (r2 == 0) goto L_0x017f
        L_0x017c:
            r2 = r0
            r0 = r12
            goto L_0x0182
        L_0x017f:
            r5 = r31
            goto L_0x017c
        L_0x0182:
            r1.v()
            boolean r6 = Y.C1506p.H()
            if (r6 == 0) goto L_0x0194
            r6 = -1
            java.lang.String r12 = "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)"
            r13 = 1826340448(0x6cdbbe60, float:2.1252302E27)
            Y.C1506p.Q(r13, r3, r6, r12)
        L_0x0194:
            r6 = 268435454(0xffffffe, float:2.5243546E-29)
            r22 = r3 & r6
            r12 = r23
            r13 = r24
            r14 = r4
            r15 = r8
            r16 = r0
            r17 = r7
            r18 = r9
            r19 = r2
            r20 = r5
            r21 = r1
            V.C1374c0.d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r3 = Y.C1506p.H()
            if (r3 == 0) goto L_0x01b7
            Y.C1506p.P()
        L_0x01b7:
            r3 = r4
            r6 = r7
            r4 = r8
            r7 = r9
            r8 = r2
            r9 = r5
            r5 = r0
        L_0x01be:
            Y.Y0 r12 = r1.k()
            if (r12 == 0) goto L_0x01d5
            V.d$d r13 = new V.d$d
            r0 = r13
            r1 = r23
            r2 = r24
            r10 = r33
            r11 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.C1375d.b(yf.p, yf.a, k0.i, yf.p, yf.p, boolean, V.b0, C.N, B.l, Y.m, int, int):void");
    }
}
