package V;

import B.l;
import C.N;
import Ef.m;
import H0.F;
import H0.U;
import J.C1207c;
import J.C1226w;
import J.C1227x;
import J0.C1241g;
import Q0.T;
import W.v;
import W.w;
import W.y;
import W0.c0;
import Y.A1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.platform.C1644k0;
import c1.h;
import c1.t;
import e1.C1943b;
import k0.c;
import k0.i;
import k0.n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import pf.C6632a;
import q0.C2422h;
import q0.C2427m;
import r0.C2547y0;
import r0.T1;
import r0.g2;
import r0.h2;
import t0.C2602c;
import t0.C2605f;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class R0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f6941a = h.j((float) 8);

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f6942a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f6943b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ P0 f6944c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f6945d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6798l f6946e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f6947f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f6948g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ T f6949h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C1227x f6950i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C1226w f6951j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f6952k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f6953l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f6954m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0 f6955n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l f6956o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p f6957p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p f6958q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ p f6959r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ p f6960s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ p f6961t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ p f6962u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ p f6963v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ g2 f6964w;

        /* renamed from: V.R0$a$a  reason: collision with other inner class name */
        static final class C0159a extends C6498u implements q {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f6965a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f6966b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f6967c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ c0 f6968d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ l f6969e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f6970f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ p f6971g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ p f6972h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ p f6973i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ p f6974j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ p f6975k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ p f6976l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ p f6977m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ g2 f6978n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ P0 f6979o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0159a(String str, boolean z10, boolean z11, c0 c0Var, l lVar, boolean z12, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, g2 g2Var, P0 p02) {
                super(3);
                this.f6965a = str;
                this.f6966b = z10;
                this.f6967c = z11;
                this.f6968d = c0Var;
                this.f6969e = lVar;
                this.f6970f = z12;
                this.f6971g = pVar;
                this.f6972h = pVar2;
                this.f6973i = pVar3;
                this.f6974j = pVar4;
                this.f6975k = pVar5;
                this.f6976l = pVar6;
                this.f6977m = pVar7;
                this.f6978n = g2Var;
                this.f6979o = p02;
            }

            public final void a(p pVar, C1500m mVar, int i10) {
                int i11;
                int i12;
                if ((i10 & 6) == 0) {
                    if (mVar.C(pVar)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i10 | i12;
                } else {
                    p pVar2 = pVar;
                    C1500m mVar2 = mVar;
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !mVar.i()) {
                    if (C1506p.H()) {
                        C1506p.Q(-288211827, i11, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                    }
                    p pVar3 = pVar;
                    C1500m mVar3 = mVar;
                    Q0.f6883a.b(this.f6965a, pVar3, this.f6966b, this.f6967c, this.f6968d, this.f6969e, this.f6970f, this.f6971g, this.f6972h, this.f6973i, this.f6974j, this.f6975k, this.f6976l, this.f6977m, this.f6978n, this.f6979o, (N) null, (p) null, mVar3, (i11 << 3) & 112, 100663296, 196608);
                    if (C1506p.H()) {
                        C1506p.P();
                        return;
                    }
                    return;
                }
                mVar.I();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, boolean z10, P0 p02, String str, C6798l lVar, boolean z11, boolean z12, T t10, C1227x xVar, C1226w wVar, boolean z13, int i10, int i11, c0 c0Var, l lVar2, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, g2 g2Var) {
            super(2);
            this.f6942a = iVar;
            this.f6943b = z10;
            this.f6944c = p02;
            this.f6945d = str;
            this.f6946e = lVar;
            this.f6947f = z11;
            this.f6948g = z12;
            this.f6949h = t10;
            this.f6950i = xVar;
            this.f6951j = wVar;
            this.f6952k = z13;
            this.f6953l = i10;
            this.f6954m = i11;
            this.f6955n = c0Var;
            this.f6956o = lVar2;
            this.f6957p = pVar;
            this.f6958q = pVar2;
            this.f6959r = pVar3;
            this.f6960s = pVar4;
            this.f6961t = pVar5;
            this.f6962u = pVar6;
            this.f6963v = pVar7;
            this.f6964w = g2Var;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(1859145987, i11, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                }
                i iVar = this.f6942a;
                boolean z10 = this.f6943b;
                v.a aVar = v.f8397a;
                i i12 = y.i(iVar, z10, w.a(v.a(n.f23131b), mVar2, 0));
                Q0 q02 = Q0.f6883a;
                i a10 = androidx.compose.foundation.layout.q.a(i12, q02.l(), q02.k());
                h2 h2Var = r1;
                h2 h2Var2 = new h2(this.f6944c.d(this.f6943b), (DefaultConstructorMarker) null);
                String str = this.f6945d;
                C6798l lVar = this.f6946e;
                boolean z11 = this.f6947f;
                boolean z12 = this.f6948g;
                T t10 = this.f6949h;
                C1227x xVar = this.f6950i;
                C1226w wVar = this.f6951j;
                boolean z13 = this.f6952k;
                boolean z14 = z13;
                int i13 = this.f6953l;
                boolean z15 = z13;
                int i14 = this.f6954m;
                c0 c0Var = this.f6955n;
                C6798l lVar2 = lVar;
                l lVar3 = this.f6956o;
                String str2 = str;
                boolean z16 = z11;
                boolean z17 = z12;
                T t11 = t10;
                C1227x xVar2 = xVar;
                C1226w wVar2 = wVar;
                boolean z18 = z14;
                int i15 = i13;
                int i16 = i14;
                c0 c0Var2 = c0Var;
                l lVar4 = lVar3;
                String str3 = str;
                C6798l lVar5 = lVar2;
                i iVar2 = a10;
                boolean z19 = z16;
                boolean z20 = z17;
                T t12 = t11;
                C1227x xVar3 = xVar2;
                C1226w wVar3 = wVar2;
                boolean z21 = z18;
                int i17 = i15;
                int i18 = i16;
                c0 c0Var3 = c0Var2;
                l lVar6 = lVar4;
                C1207c.b(str3, lVar5, iVar2, z19, z20, t12, xVar3, wVar3, z21, i17, i18, c0Var3, (C6798l) null, lVar6, h2Var, g0.c.e(-288211827, true, new C0159a(str2, z11, z15, c0Var, lVar3, this.f6943b, this.f6957p, this.f6958q, this.f6959r, this.f6960s, this.f6961t, this.f6962u, this.f6963v, this.f6964w, this.f6944c), mVar2, 54), mVar, 0, 196608, 4096);
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

    static final class b extends C6498u implements p {

        /* renamed from: A  reason: collision with root package name */
        final /* synthetic */ int f6980A;

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f6981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f6982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i f6983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f6984d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f6985e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f6986f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f6987g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f6988h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p f6989i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f6990j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f6991k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p f6992l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f6993m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f6994n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ c0 f6995o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C1227x f6996p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C1226w f6997q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f6998r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f6999s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f7000t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ l f7001u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ g2 f7002v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ P0 f7003w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f7004x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f7005y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f7006z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, C6798l lVar, i iVar, boolean z10, boolean z11, T t10, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, p pVar6, p pVar7, boolean z12, c0 c0Var, C1227x xVar, C1226w wVar, boolean z13, int i10, int i11, l lVar2, g2 g2Var, P0 p02, int i12, int i13, int i14, int i15) {
            super(2);
            this.f6981a = str;
            this.f6982b = lVar;
            this.f6983c = iVar;
            this.f6984d = z10;
            this.f6985e = z11;
            this.f6986f = t10;
            this.f6987g = pVar;
            this.f6988h = pVar2;
            this.f6989i = pVar3;
            this.f6990j = pVar4;
            this.f6991k = pVar5;
            this.f6992l = pVar6;
            this.f6993m = pVar7;
            this.f6994n = z12;
            this.f6995o = c0Var;
            this.f6996p = xVar;
            this.f6997q = wVar;
            this.f6998r = z13;
            this.f6999s = i10;
            this.f7000t = i11;
            this.f7001u = lVar2;
            this.f7002v = g2Var;
            this.f7003w = p02;
            this.f7004x = i12;
            this.f7005y = i13;
            this.f7006z = i14;
            this.f6980A = i15;
        }

        public final void a(C1500m mVar, int i10) {
            C1500m mVar2 = mVar;
            String str = this.f6981a;
            String str2 = str;
            R0.a(str2, this.f6982b, this.f6983c, this.f6984d, this.f6985e, this.f6986f, this.f6987g, this.f6988h, this.f6989i, this.f6990j, this.f6991k, this.f6992l, this.f6993m, this.f6994n, this.f6995o, this.f6996p, this.f6997q, this.f6998r, this.f6999s, this.f7000t, this.f7001u, this.f7002v, this.f7003w, mVar2, M0.a(this.f7004x | 1), M0.a(this.f7005y), M0.a(this.f7006z), this.f6980A);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f7007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f7008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f7009c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f7010d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f7011e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f7012f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p f7013g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ p f7014h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f7015i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f7016j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p f7017k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ p f7018l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ N f7019m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f7020n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f7021o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, p pVar, p pVar2, q qVar, p pVar3, p pVar4, p pVar5, p pVar6, boolean z10, float f10, p pVar7, p pVar8, N n10, int i10, int i11) {
            super(2);
            this.f7007a = iVar;
            this.f7008b = pVar;
            this.f7009c = pVar2;
            this.f7010d = qVar;
            this.f7011e = pVar3;
            this.f7012f = pVar4;
            this.f7013g = pVar5;
            this.f7014h = pVar6;
            this.f7015i = z10;
            this.f7016j = f10;
            this.f7017k = pVar7;
            this.f7018l = pVar8;
            this.f7019m = n10;
            this.f7020n = i10;
            this.f7021o = i11;
        }

        public final void a(C1500m mVar, int i10) {
            R0.b(this.f7007a, this.f7008b, this.f7009c, this.f7010d, this.f7011e, this.f7012f, this.f7013g, this.f7014h, this.f7015i, this.f7016j, this.f7017k, this.f7018l, this.f7019m, mVar, M0.a(this.f7020n | 1), M0.a(this.f7021o));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f7022a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(A1 a12) {
            super(1);
            this.f7022a = a12;
        }

        public final void a(C2602c cVar) {
            cVar.H1();
            C2602c cVar2 = cVar;
            float t12 = cVar2.t1(((C2868g) this.f7022a.getValue()).b());
            float i10 = C2427m.i(cVar.d()) - (t12 / ((float) 2));
            C2605f.R(cVar2, ((C2868g) this.f7022a.getValue()).a(), C2422h.a(0.0f, i10), C2422h.a(C2427m.k(cVar.d()), i10), t12, 0, (T1) null, 0.0f, (C2547y0) null, 0, 496, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2602c) obj);
            return C6514M.f71813a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.lang.String r82, yf.C6798l r83, k0.i r84, boolean r85, boolean r86, Q0.T r87, yf.p r88, yf.p r89, yf.p r90, yf.p r91, yf.p r92, yf.p r93, yf.p r94, boolean r95, W0.c0 r96, J.C1227x r97, J.C1226w r98, boolean r99, int r100, int r101, B.l r102, r0.g2 r103, V.P0 r104, Y.C1500m r105, int r106, int r107, int r108, int r109) {
        /*
            r15 = r106
            r14 = r107
            r13 = r108
            r12 = r109
            r0 = -676242365(0xffffffffd7b15c43, float:-3.90019638E14)
            r1 = r105
            Y.m r0 = r1.h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x001b
            r1 = r15 | 6
            r4 = r1
            r1 = r82
            goto L_0x002f
        L_0x001b:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r82
            boolean r4 = r0.S(r1)
            if (r4 == 0) goto L_0x0029
            r4 = 4
            goto L_0x002a
        L_0x0029:
            r4 = 2
        L_0x002a:
            r4 = r4 | r15
            goto L_0x002f
        L_0x002c:
            r1 = r82
            r4 = r15
        L_0x002f:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r5 = r83
            goto L_0x004a
        L_0x0038:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x0035
            r5 = r83
            boolean r8 = r0.C(r5)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r4 = r4 | r8
        L_0x004a:
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0053
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r11 = r84
            goto L_0x0066
        L_0x0053:
            r11 = r15 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x0050
            r11 = r84
            boolean r16 = r0.S(r11)
            if (r16 == 0) goto L_0x0062
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r4 = r4 | r16
        L_0x0066:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0073
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0070:
            r2 = r85
            goto L_0x0086
        L_0x0073:
            r2 = r15 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0070
            r2 = r85
            boolean r19 = r0.b(r2)
            if (r19 == 0) goto L_0x0082
            r19 = r18
            goto L_0x0084
        L_0x0082:
            r19 = r17
        L_0x0084:
            r4 = r4 | r19
        L_0x0086:
            r19 = r12 & 16
            r20 = 8192(0x2000, float:1.14794E-41)
            r21 = 16384(0x4000, float:2.2959E-41)
            if (r19 == 0) goto L_0x0093
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0090:
            r3 = r86
            goto L_0x00a6
        L_0x0093:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0090
            r3 = r86
            boolean r23 = r0.b(r3)
            if (r23 == 0) goto L_0x00a2
            r23 = r21
            goto L_0x00a4
        L_0x00a2:
            r23 = r20
        L_0x00a4:
            r4 = r4 | r23
        L_0x00a6:
            r23 = 196608(0x30000, float:2.75506E-40)
            r23 = r15 & r23
            if (r23 != 0) goto L_0x00c0
            r23 = r12 & 32
            r6 = r87
            if (r23 != 0) goto L_0x00bb
            boolean r24 = r0.S(r6)
            if (r24 == 0) goto L_0x00bb
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r4 = r4 | r24
            goto L_0x00c2
        L_0x00c0:
            r6 = r87
        L_0x00c2:
            r24 = r12 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00cd
            r4 = r4 | r25
            r7 = r88
            goto L_0x00e0
        L_0x00cd:
            r26 = r15 & r25
            r7 = r88
            if (r26 != 0) goto L_0x00e0
            boolean r27 = r0.C(r7)
            if (r27 == 0) goto L_0x00dc
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r27
        L_0x00e0:
            r9 = r12 & 128(0x80, float:1.794E-43)
            r28 = 4194304(0x400000, float:5.877472E-39)
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            if (r9 == 0) goto L_0x00ed
            r4 = r4 | r29
            r10 = r89
            goto L_0x0100
        L_0x00ed:
            r30 = r15 & r29
            r10 = r89
            if (r30 != 0) goto L_0x0100
            boolean r31 = r0.C(r10)
            if (r31 == 0) goto L_0x00fc
            r31 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r31 = r28
        L_0x00fe:
            r4 = r4 | r31
        L_0x0100:
            r1 = r12 & 256(0x100, float:3.59E-43)
            r31 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x010b
            r4 = r4 | r31
            r2 = r90
            goto L_0x011e
        L_0x010b:
            r31 = r15 & r31
            r2 = r90
            if (r31 != 0) goto L_0x011e
            boolean r31 = r0.C(r2)
            if (r31 == 0) goto L_0x011a
            r31 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011c
        L_0x011a:
            r31 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011c:
            r4 = r4 | r31
        L_0x011e:
            r2 = r12 & 512(0x200, float:7.175E-43)
            r31 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x0129
            r4 = r4 | r31
            r3 = r91
            goto L_0x013c
        L_0x0129:
            r32 = r15 & r31
            r3 = r91
            if (r32 != 0) goto L_0x013c
            boolean r32 = r0.C(r3)
            if (r32 == 0) goto L_0x0138
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r4 = r4 | r32
        L_0x013c:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0145
            r32 = r14 | 6
            r5 = r92
            goto L_0x015b
        L_0x0145:
            r32 = r14 & 6
            r5 = r92
            if (r32 != 0) goto L_0x0159
            boolean r32 = r0.C(r5)
            if (r32 == 0) goto L_0x0154
            r32 = 4
            goto L_0x0156
        L_0x0154:
            r32 = 2
        L_0x0156:
            r32 = r14 | r32
            goto L_0x015b
        L_0x0159:
            r32 = r14
        L_0x015b:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0164
            r32 = r32 | 48
        L_0x0161:
            r6 = r32
            goto L_0x0178
        L_0x0164:
            r33 = r14 & 48
            r6 = r93
            if (r33 != 0) goto L_0x0161
            boolean r33 = r0.C(r6)
            if (r33 == 0) goto L_0x0173
            r33 = 32
            goto L_0x0175
        L_0x0173:
            r33 = 16
        L_0x0175:
            r32 = r32 | r33
            goto L_0x0161
        L_0x0178:
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0181
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x017e:
            r10 = r94
            goto L_0x0194
        L_0x0181:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x017e
            r10 = r94
            boolean r32 = r0.C(r10)
            if (r32 == 0) goto L_0x0190
            r32 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r32 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r6 = r6 | r32
        L_0x0194:
            r10 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x019d
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x019a:
            r11 = r95
            goto L_0x01ad
        L_0x019d:
            r11 = r14 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x019a
            r11 = r95
            boolean r32 = r0.b(r11)
            if (r32 == 0) goto L_0x01ab
            r17 = r18
        L_0x01ab:
            r6 = r6 | r17
        L_0x01ad:
            r11 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01b8
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            r17 = r11
        L_0x01b5:
            r11 = r96
            goto L_0x01ca
        L_0x01b8:
            r17 = r11
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x01b5
            r11 = r96
            boolean r18 = r0.S(r11)
            if (r18 == 0) goto L_0x01c8
            r20 = r21
        L_0x01c8:
            r6 = r6 | r20
        L_0x01ca:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r12 & r18
            r20 = 196608(0x30000, float:2.75506E-40)
            if (r18 == 0) goto L_0x01d8
            r6 = r6 | r20
            r11 = r97
            goto L_0x01eb
        L_0x01d8:
            r20 = r14 & r20
            r11 = r97
            if (r20 != 0) goto L_0x01eb
            boolean r20 = r0.S(r11)
            if (r20 == 0) goto L_0x01e7
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01e9
        L_0x01e7:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x01e9:
            r6 = r6 | r20
        L_0x01eb:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r12 & r20
            if (r20 == 0) goto L_0x01f6
            r6 = r6 | r25
            r11 = r98
            goto L_0x0209
        L_0x01f6:
            r21 = r14 & r25
            r11 = r98
            if (r21 != 0) goto L_0x0209
            boolean r21 = r0.S(r11)
            if (r21 == 0) goto L_0x0205
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0207
        L_0x0205:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x0207:
            r6 = r6 | r21
        L_0x0209:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r12 & r21
            if (r21 == 0) goto L_0x0214
            r6 = r6 | r29
            r11 = r99
            goto L_0x0227
        L_0x0214:
            r25 = r14 & r29
            r11 = r99
            if (r25 != 0) goto L_0x0227
            boolean r25 = r0.b(r11)
            if (r25 == 0) goto L_0x0223
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0225
        L_0x0223:
            r25 = r28
        L_0x0225:
            r6 = r6 | r25
        L_0x0227:
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r14 & r25
            if (r25 != 0) goto L_0x0243
            r25 = 262144(0x40000, float:3.67342E-40)
            r25 = r12 & r25
            r11 = r100
            if (r25 != 0) goto L_0x023e
            boolean r25 = r0.d(r11)
            if (r25 == 0) goto L_0x023e
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0240
        L_0x023e:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0240:
            r6 = r6 | r25
            goto L_0x0245
        L_0x0243:
            r11 = r100
        L_0x0245:
            r25 = 524288(0x80000, float:7.34684E-40)
            r25 = r12 & r25
            if (r25 == 0) goto L_0x0250
            r6 = r6 | r31
            r11 = r101
            goto L_0x0263
        L_0x0250:
            r29 = r14 & r31
            r11 = r101
            if (r29 != 0) goto L_0x0263
            boolean r29 = r0.d(r11)
            if (r29 == 0) goto L_0x025f
            r29 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0261
        L_0x025f:
            r29 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0261:
            r6 = r6 | r29
        L_0x0263:
            r29 = 1048576(0x100000, float:1.469368E-39)
            r29 = r12 & r29
            if (r29 == 0) goto L_0x026e
            r22 = r13 | 6
            r11 = r102
            goto L_0x0284
        L_0x026e:
            r31 = r13 & 6
            r11 = r102
            if (r31 != 0) goto L_0x0282
            boolean r31 = r0.S(r11)
            if (r31 == 0) goto L_0x027d
            r22 = 4
            goto L_0x027f
        L_0x027d:
            r22 = 2
        L_0x027f:
            r22 = r13 | r22
            goto L_0x0284
        L_0x0282:
            r22 = r13
        L_0x0284:
            r31 = r13 & 48
            if (r31 != 0) goto L_0x029e
            r31 = 2097152(0x200000, float:2.938736E-39)
            r31 = r12 & r31
            r11 = r103
            if (r31 != 0) goto L_0x0299
            boolean r31 = r0.S(r11)
            if (r31 == 0) goto L_0x0299
            r23 = 32
            goto L_0x029b
        L_0x0299:
            r23 = 16
        L_0x029b:
            r22 = r22 | r23
            goto L_0x02a0
        L_0x029e:
            r11 = r103
        L_0x02a0:
            r11 = r13 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x02bc
            r11 = r12 & r28
            if (r11 != 0) goto L_0x02b3
            r11 = r104
            boolean r23 = r0.S(r11)
            if (r23 == 0) goto L_0x02b5
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x02b7
        L_0x02b3:
            r11 = r104
        L_0x02b5:
            r27 = 128(0x80, float:1.794E-43)
        L_0x02b7:
            r22 = r22 | r27
        L_0x02b9:
            r11 = r22
            goto L_0x02bf
        L_0x02bc:
            r11 = r104
            goto L_0x02b9
        L_0x02bf:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r4 & r22
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x030e
            r13 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r13 & r6
            r14 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r14) goto L_0x030e
            r11 = r11 & 147(0x93, float:2.06E-43)
            r13 = 146(0x92, float:2.05E-43)
            if (r11 != r13) goto L_0x030e
            boolean r11 = r0.i()
            if (r11 != 0) goto L_0x02df
            goto L_0x030e
        L_0x02df:
            r0.I()
            r3 = r84
            r4 = r85
            r5 = r86
            r6 = r87
            r7 = r88
            r8 = r89
            r9 = r90
            r10 = r91
            r11 = r92
            r12 = r93
            r13 = r94
            r14 = r95
            r15 = r96
            r16 = r97
            r17 = r98
            r18 = r99
            r19 = r100
            r20 = r101
            r21 = r102
            r22 = r103
            r23 = r104
            goto L_0x0574
        L_0x030e:
            r0.D()
            r11 = r15 & 1
            if (r11 == 0) goto L_0x035e
            boolean r11 = r0.L()
            if (r11 == 0) goto L_0x031c
            goto L_0x035e
        L_0x031c:
            r0.I()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0327
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r1
        L_0x0327:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r12
            if (r1 == 0) goto L_0x0330
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r1
        L_0x0330:
            r8 = r84
            r11 = r85
            r1 = r86
            r14 = r87
            r2 = r88
            r9 = r89
            r3 = r90
            r5 = r92
            r84 = r94
            r10 = r95
            r13 = r96
            r40 = r97
            r41 = r98
            r42 = r99
            r43 = r100
            r44 = r101
            r45 = r102
            r46 = r103
            r12 = r104
            r15 = r4
            r7 = r6
            r4 = r91
            r6 = r93
            goto L_0x0450
        L_0x035e:
            if (r8 == 0) goto L_0x0363
            k0.i$a r8 = k0.i.f23074a
            goto L_0x0365
        L_0x0363:
            r8 = r84
        L_0x0365:
            if (r16 == 0) goto L_0x0369
            r11 = 1
            goto L_0x036b
        L_0x0369:
            r11 = r85
        L_0x036b:
            if (r19 == 0) goto L_0x0370
            r16 = 0
            goto L_0x0372
        L_0x0370:
            r16 = r86
        L_0x0372:
            r19 = r12 & 32
            if (r19 == 0) goto L_0x0386
            Y.I0 r14 = V.T0.d()
            java.lang.Object r14 = r0.m(r14)
            Q0.T r14 = (Q0.T) r14
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            r4 = r4 & r19
            goto L_0x0388
        L_0x0386:
            r14 = r87
        L_0x0388:
            r19 = 0
            if (r24 == 0) goto L_0x038f
            r22 = r19
            goto L_0x0391
        L_0x038f:
            r22 = r88
        L_0x0391:
            if (r9 == 0) goto L_0x0396
            r9 = r19
            goto L_0x0398
        L_0x0396:
            r9 = r89
        L_0x0398:
            if (r1 == 0) goto L_0x039d
            r1 = r19
            goto L_0x039f
        L_0x039d:
            r1 = r90
        L_0x039f:
            if (r2 == 0) goto L_0x03a4
            r2 = r19
            goto L_0x03a6
        L_0x03a4:
            r2 = r91
        L_0x03a6:
            if (r3 == 0) goto L_0x03ab
            r3 = r19
            goto L_0x03ad
        L_0x03ab:
            r3 = r92
        L_0x03ad:
            if (r5 == 0) goto L_0x03b2
            r5 = r19
            goto L_0x03b4
        L_0x03b2:
            r5 = r93
        L_0x03b4:
            if (r7 == 0) goto L_0x03b9
            r7 = r19
            goto L_0x03bb
        L_0x03b9:
            r7 = r94
        L_0x03bb:
            if (r10 == 0) goto L_0x03bf
            r10 = 0
            goto L_0x03c1
        L_0x03bf:
            r10 = r95
        L_0x03c1:
            if (r17 == 0) goto L_0x03ca
            W0.c0$a r17 = W0.c0.f8551a
            W0.c0 r17 = r17.c()
            goto L_0x03cc
        L_0x03ca:
            r17 = r96
        L_0x03cc:
            if (r18 == 0) goto L_0x03d5
            J.x$a r18 = J.C1227x.f3486g
            J.x r18 = r18.a()
            goto L_0x03d7
        L_0x03d5:
            r18 = r97
        L_0x03d7:
            if (r20 == 0) goto L_0x03e0
            J.w$a r20 = J.C1226w.f3478g
            J.w r20 = r20.a()
            goto L_0x03e2
        L_0x03e0:
            r20 = r98
        L_0x03e2:
            if (r21 == 0) goto L_0x03e7
            r21 = 0
            goto L_0x03e9
        L_0x03e7:
            r21 = r99
        L_0x03e9:
            r23 = 262144(0x40000, float:3.67342E-40)
            r23 = r12 & r23
            if (r23 == 0) goto L_0x03fd
            if (r21 == 0) goto L_0x03f4
            r23 = 1
            goto L_0x03f7
        L_0x03f4:
            r23 = 2147483647(0x7fffffff, float:NaN)
        L_0x03f7:
            r24 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r24
            goto L_0x03ff
        L_0x03fd:
            r23 = r100
        L_0x03ff:
            if (r25 == 0) goto L_0x0404
            r24 = 1
            goto L_0x0406
        L_0x0404:
            r24 = r101
        L_0x0406:
            if (r29 == 0) goto L_0x0409
            goto L_0x040b
        L_0x0409:
            r19 = r102
        L_0x040b:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r25 = r12 & r25
            r13 = 6
            r84 = r1
            if (r25 == 0) goto L_0x041b
            V.Q0 r1 = V.Q0.f6883a
            r0.g2 r1 = r1.m(r0, r13)
            goto L_0x041d
        L_0x041b:
            r1 = r103
        L_0x041d:
            r25 = r12 & r28
            r85 = r1
            if (r25 == 0) goto L_0x044b
            V.Q0 r1 = V.Q0.f6883a
            V.P0 r1 = r1.c(r0, r13)
            r46 = r85
            r12 = r1
        L_0x042c:
            r15 = r4
            r1 = r16
            r13 = r17
            r40 = r18
            r45 = r19
            r41 = r20
            r42 = r21
            r43 = r23
            r44 = r24
            r4 = r2
            r2 = r22
            r81 = r3
            r3 = r84
            r84 = r7
            r7 = r6
            r6 = r5
            r5 = r81
            goto L_0x0450
        L_0x044b:
            r46 = r85
            r12 = r104
            goto L_0x042c
        L_0x0450:
            r0.v()
            boolean r16 = Y.C1506p.H()
            if (r16 == 0) goto L_0x0466
            r85 = r6
            r6 = -676242365(0xffffffffd7b15c43, float:-3.90019638E14)
            r86 = r5
            java.lang.String r5 = "androidx.compose.material3.TextField (TextField.kt:219)"
            Y.C1506p.Q(r6, r15, r7, r5)
            goto L_0x046a
        L_0x0466:
            r86 = r5
            r85 = r6
        L_0x046a:
            r5 = -508515290(0xffffffffe1b0ac26, float:-4.0737894E20)
            r0.T(r5)
            if (r45 != 0) goto L_0x0488
            java.lang.Object r5 = r0.A()
            Y.m$a r6 = Y.C1500m.f10026a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0485
            B.l r5 = B.k.a()
            r0.r(r5)
        L_0x0485:
            B.l r5 = (B.l) r5
            goto L_0x048a
        L_0x0488:
            r5 = r45
        L_0x048a:
            r0.M()
            r6 = -508509180(0xffffffffe1b0c404, float:-4.0759392E20)
            r0.T(r6)
            long r6 = r14.h()
            r15 = 16
            int r15 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x04a0
        L_0x049d:
            r48 = r6
            goto L_0x04b4
        L_0x04a0:
            r6 = 0
            Y.A1 r6 = B.f.a(r5, r0, r6)
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            long r6 = r12.t(r11, r10, r6)
            goto L_0x049d
        L_0x04b4:
            r0.M()
            Q0.T r6 = new Q0.T
            r47 = r6
            r77 = 16777214(0xfffffe, float:2.3509884E-38)
            r78 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r47.<init>(r48, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r64, r65, r66, r67, r68, r69, r71, r72, r73, r74, r75, r76, r77, r78)
            Q0.T r24 = r14.J(r6)
            Y.I0 r6 = P.L.b()
            P.K r7 = r12.i()
            Y.J0 r6 = r6.d(r7)
            V.R0$a r7 = new V.R0$a
            r16 = r7
            r17 = r8
            r18 = r10
            r19 = r12
            r20 = r82
            r21 = r83
            r22 = r11
            r23 = r1
            r25 = r40
            r26 = r41
            r27 = r42
            r28 = r43
            r29 = r44
            r30 = r13
            r31 = r5
            r32 = r2
            r33 = r9
            r34 = r3
            r35 = r4
            r36 = r86
            r37 = r85
            r38 = r84
            r39 = r46
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r5 = 54
            r15 = 1859145987(0x6ed05103, float:3.223541E28)
            r87 = r1
            r1 = 1
            g0.a r1 = g0.c.e(r15, r1, r7, r0, r5)
            int r5 = Y.J0.f9784i
            r5 = r5 | 48
            Y.C1521x.a(r6, r1, r0, r5)
            boolean r1 = Y.C1506p.H()
            if (r1 == 0) goto L_0x0550
            Y.C1506p.P()
        L_0x0550:
            r5 = r87
            r7 = r2
            r23 = r12
            r15 = r13
            r6 = r14
            r16 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r22 = r46
            r13 = r84
            r12 = r85
            r14 = r10
            r10 = r4
            r4 = r11
            r11 = r86
            r81 = r9
            r9 = r3
            r3 = r8
            r8 = r81
        L_0x0574:
            Y.Y0 r2 = r0.k()
            if (r2 == 0) goto L_0x0597
            V.R0$b r1 = new V.R0$b
            r0 = r1
            r79 = r1
            r1 = r82
            r80 = r2
            r2 = r83
            r24 = r106
            r25 = r107
            r26 = r108
            r27 = r109
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1 = r79
            r0 = r80
            r0.a(r1)
        L_0x0597:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V.R0.a(java.lang.String, yf.l, k0.i, boolean, boolean, Q0.T, yf.p, yf.p, yf.p, yf.p, yf.p, yf.p, yf.p, boolean, W0.c0, J.x, J.w, boolean, int, int, B.l, r0.g2, V.P0, Y.m, int, int, int, int):void");
    }

    public static final void b(i iVar, p pVar, p pVar2, q qVar, p pVar3, p pVar4, p pVar5, p pVar6, boolean z10, float f10, p pVar7, p pVar8, N n10, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        N n11;
        int i14;
        float f11;
        float f12;
        i iVar2 = iVar;
        p pVar9 = pVar;
        p pVar10 = pVar2;
        q qVar2 = qVar;
        p pVar11 = pVar3;
        p pVar12 = pVar4;
        p pVar13 = pVar5;
        p pVar14 = pVar6;
        boolean z11 = z10;
        float f13 = f10;
        p pVar15 = pVar7;
        p pVar16 = pVar8;
        N n12 = n10;
        int i15 = i10;
        int i16 = i11;
        C1500m h10 = mVar.h(-1830307184);
        int i17 = 4;
        if ((i15 & 6) == 0) {
            i12 = i15 | (h10.S(iVar2) ? 4 : 2);
        } else {
            i12 = i15;
        }
        int i18 = 16;
        if ((i15 & 48) == 0) {
            i12 |= h10.C(pVar9) ? 32 : 16;
        }
        int i19 = 128;
        if ((i15 & 384) == 0) {
            i12 |= h10.C(pVar10) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i12 |= h10.C(qVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i12 |= h10.C(pVar11) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i12 |= h10.C(pVar12) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i12 |= h10.C(pVar13) ? 1048576 : 524288;
        }
        if ((12582912 & i15) == 0) {
            i12 |= h10.C(pVar14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i12 |= h10.b(z11) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i12 |= h10.c(f13) ? 536870912 : 268435456;
        }
        int i20 = i12;
        if ((i16 & 6) == 0) {
            if (!h10.C(pVar15)) {
                i17 = 2;
            }
            i13 = i16 | i17;
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            if (h10.C(pVar16)) {
                i18 = 32;
            }
            i13 |= i18;
        }
        if ((i16 & 384) == 0) {
            n11 = n10;
            if (h10.S(n11)) {
                i19 = 256;
            }
            i13 |= i19;
        } else {
            n11 = n10;
        }
        int i21 = i13;
        if ((i20 & 306783379) == 306783378 && (i21 & 147) == 146 && h10.i()) {
            h10.I();
            p pVar17 = pVar;
            p pVar18 = pVar8;
            float f14 = f13;
        } else {
            if (C1506p.H()) {
                C1506p.Q(-1830307184, i20, i21, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z12 = ((1879048192 & i20) == 536870912) | ((234881024 & i20) == 67108864) | ((i21 & 896) == 256);
            Object A10 = h10.A();
            if (z12 || A10 == C1500m.f10026a.a()) {
                A10 = new S0(z11, f13, n11);
                h10.r(A10);
            }
            S0 s02 = (S0) A10;
            t tVar = (t) h10.m(C1644k0.k());
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, iVar2);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, s02, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            pVar15.invoke(h10, Integer.valueOf(i21 & 14));
            h10.T(1341517187);
            if (pVar11 != null) {
                i h11 = androidx.compose.ui.layout.a.b(i.f23074a, "Leading").h(y.k());
                F h12 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.e(), false);
                int a13 = C1494j.a(h10, 0);
                C1523y p11 = h10.p();
                i e11 = k0.h.e(h10, h11);
                C6787a a14 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a14);
                } else {
                    h10.q();
                }
                C1500m a15 = F1.a(h10);
                F1.b(a15, h12, aVar.c());
                F1.b(a15, p11, aVar.e());
                p b11 = aVar.b();
                if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
                    a15.r(Integer.valueOf(a13));
                    a15.V(Integer.valueOf(a13), b11);
                }
                F1.b(a15, e11, aVar.d());
                f fVar = f.f12848a;
                pVar11.invoke(h10, Integer.valueOf((i20 >> 12) & 14));
                h10.u();
            }
            h10.M();
            h10.T(1341526310);
            if (pVar12 != null) {
                i h13 = androidx.compose.ui.layout.a.b(i.f23074a, "Trailing").h(y.k());
                F h14 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.e(), false);
                int a16 = C1494j.a(h10, 0);
                C1523y p12 = h10.p();
                i e12 = k0.h.e(h10, h13);
                C6787a a17 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a17);
                } else {
                    h10.q();
                }
                C1500m a18 = F1.a(h10);
                F1.b(a18, h14, aVar.c());
                F1.b(a18, p12, aVar.e());
                p b12 = aVar.b();
                if (a18.f() || !C6496s.c(a18.A(), Integer.valueOf(a16))) {
                    a18.r(Integer.valueOf(a16));
                    a18.V(Integer.valueOf(a16), b12);
                }
                F1.b(a18, e12, aVar.d());
                f fVar2 = f.f12848a;
                pVar12.invoke(h10, Integer.valueOf((i20 >> 15) & 14));
                h10.u();
            }
            h10.M();
            float g10 = androidx.compose.foundation.layout.n.g(n11, tVar);
            float f15 = androidx.compose.foundation.layout.n.f(n11, tVar);
            if (pVar11 != null) {
                i14 = 0;
                g10 = h.j(m.c(h.j(g10 - y.j()), h.j((float) 0)));
            } else {
                i14 = 0;
            }
            if (pVar12 != null) {
                f15 = h.j(m.c(h.j(f15 - y.j()), h.j((float) i14)));
            }
            h10.T(1341556924);
            if (pVar13 != null) {
                i m10 = androidx.compose.foundation.layout.n.m(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(i.f23074a, "Prefix"), y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), g10, 0.0f, y.p(), 0.0f, 10, (Object) null);
                F h15 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a19 = C1494j.a(h10, 0);
                C1523y p13 = h10.p();
                i e13 = k0.h.e(h10, m10);
                C6787a a20 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a20);
                } else {
                    h10.q();
                }
                C1500m a21 = F1.a(h10);
                F1.b(a21, h15, aVar.c());
                F1.b(a21, p13, aVar.e());
                p b13 = aVar.b();
                if (a21.f() || !C6496s.c(a21.A(), Integer.valueOf(a19))) {
                    a21.r(Integer.valueOf(a19));
                    a21.V(Integer.valueOf(a19), b13);
                }
                F1.b(a21, e13, aVar.d());
                f fVar3 = f.f12848a;
                pVar13.invoke(h10, Integer.valueOf((i20 >> 18) & 14));
                h10.u();
            }
            h10.M();
            h10.T(1341568890);
            if (pVar14 != null) {
                i m11 = androidx.compose.foundation.layout.n.m(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(i.f23074a, "Suffix"), y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), y.p(), 0.0f, f15, 0.0f, 10, (Object) null);
                F h16 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a22 = C1494j.a(h10, 0);
                C1523y p14 = h10.p();
                i e14 = k0.h.e(h10, m11);
                C6787a a23 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a23);
                } else {
                    h10.q();
                }
                C1500m a24 = F1.a(h10);
                F1.b(a24, h16, aVar.c());
                F1.b(a24, p14, aVar.e());
                p b14 = aVar.b();
                if (a24.f() || !C6496s.c(a24.A(), Integer.valueOf(a22))) {
                    a24.r(Integer.valueOf(a22));
                    a24.V(Integer.valueOf(a22), b14);
                }
                F1.b(a24, e14, aVar.d());
                f fVar4 = f.f12848a;
                pVar14.invoke(h10, Integer.valueOf((i20 >> 21) & 14));
                h10.u();
            }
            h10.M();
            h10.T(1341581092);
            if (pVar10 != null) {
                i m12 = androidx.compose.foundation.layout.n.m(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(i.f23074a, "Label"), c1.i.c(y.o(), y.m(), f10), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), g10, 0.0f, f15, 0.0f, 10, (Object) null);
                F h17 = androidx.compose.foundation.layout.d.h(k0.c.f23044a.o(), false);
                int a25 = C1494j.a(h10, 0);
                C1523y p15 = h10.p();
                i e15 = k0.h.e(h10, m12);
                C6787a a26 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a26);
                } else {
                    h10.q();
                }
                C1500m a27 = F1.a(h10);
                f11 = g10;
                F1.b(a27, h17, aVar.c());
                F1.b(a27, p15, aVar.e());
                p b15 = aVar.b();
                if (a27.f() || !C6496s.c(a27.A(), Integer.valueOf(a25))) {
                    a27.r(Integer.valueOf(a25));
                    a27.V(Integer.valueOf(a25), b15);
                }
                F1.b(a27, e15, aVar.d());
                f fVar5 = f.f12848a;
                pVar10.invoke(h10, Integer.valueOf((i20 >> 6) & 14));
                h10.u();
            } else {
                float f16 = f10;
                f11 = g10;
            }
            h10.M();
            i.a aVar2 = i.f23074a;
            i v10 = androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(aVar2, y.o(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null);
            if (pVar13 == null) {
                f12 = f11;
            } else {
                f12 = h.j((float) 0);
            }
            if (pVar14 != null) {
                f15 = h.j((float) 0);
            }
            i m13 = androidx.compose.foundation.layout.n.m(v10, f12, 0.0f, f15, 0.0f, 10, (Object) null);
            h10.T(1341611627);
            q qVar3 = qVar;
            if (qVar3 != null) {
                qVar3.invoke(androidx.compose.ui.layout.a.b(aVar2, "Hint").h(m13), h10, Integer.valueOf((i20 >> 6) & 112));
            }
            h10.M();
            i h18 = androidx.compose.ui.layout.a.b(aVar2, "TextField").h(m13);
            c.a aVar3 = k0.c.f23044a;
            F h19 = androidx.compose.foundation.layout.d.h(aVar3.o(), true);
            int a28 = C1494j.a(h10, 0);
            C1523y p16 = h10.p();
            i e16 = k0.h.e(h10, h18);
            C6787a a29 = aVar.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a29);
            } else {
                h10.q();
            }
            C1500m a30 = F1.a(h10);
            F1.b(a30, h19, aVar.c());
            F1.b(a30, p16, aVar.e());
            p b16 = aVar.b();
            if (a30.f() || !C6496s.c(a30.A(), Integer.valueOf(a28))) {
                a30.r(Integer.valueOf(a28));
                a30.V(Integer.valueOf(a28), b16);
            }
            F1.b(a30, e16, aVar.d());
            f fVar6 = f.f12848a;
            pVar.invoke(h10, Integer.valueOf((i20 >> 3) & 14));
            h10.u();
            h10.T(1341622624);
            p pVar19 = pVar8;
            if (pVar19 != null) {
                i h20 = androidx.compose.foundation.layout.n.h(androidx.compose.foundation.layout.q.v(androidx.compose.foundation.layout.q.k(androidx.compose.ui.layout.a.b(aVar2, "Supporting"), y.n(), 0.0f, 2, (Object) null), (c.C0368c) null, false, 3, (Object) null), Q0.q(Q0.f6883a, 0.0f, 0.0f, 0.0f, 0.0f, 15, (Object) null));
                F h21 = androidx.compose.foundation.layout.d.h(aVar3.o(), false);
                int a31 = C1494j.a(h10, 0);
                C1523y p17 = h10.p();
                i e17 = k0.h.e(h10, h20);
                C6787a a32 = aVar.a();
                if (h10.j() == null) {
                    C1494j.c();
                }
                h10.F();
                if (h10.f()) {
                    h10.U(a32);
                } else {
                    h10.q();
                }
                C1500m a33 = F1.a(h10);
                F1.b(a33, h21, aVar.c());
                F1.b(a33, p17, aVar.e());
                p b17 = aVar.b();
                if (a33.f() || !C6496s.c(a33.A(), Integer.valueOf(a31))) {
                    a33.r(Integer.valueOf(a31));
                    a33.V(Integer.valueOf(a31), b17);
                }
                F1.b(a33, e17, aVar.d());
                pVar19.invoke(h10, Integer.valueOf((i21 >> 3) & 14));
                h10.u();
            }
            h10.M();
            h10.u();
            if (C1506p.H()) {
                C1506p.P();
            }
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            c cVar = r0;
            c cVar2 = new c(iVar, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z10, f10, pVar7, pVar8, n10, i10, i11);
            k10.a(cVar);
        }
    }

    /* access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j10, float f11, N n10) {
        boolean z10;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float j11 = h.j(n10.d() + n10.a()) * f11;
        if (z10) {
            j11 = C1943b.b(h.j(y.r() * ((float) 2)) * f11, j11, f10);
        }
        return Math.max(c1.b.m(j10), Math.max(i12, Math.max(i13, Af.a.d(j11 + ((float) C1943b.c(0, i11, f10)) + ((float) C6632a.h(i10, i16, i14, i15, C1943b.c(i11, 0, f10)))))) + i17);
    }

    /* access modifiers changed from: private */
    public static final int i(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        int i17 = i12 + i13;
        return Math.max(i10 + Math.max(i14 + i17, Math.max(i16 + i17, i15)) + i11, c1.b.n(j10));
    }

    public static final i j(i iVar, A1 a12) {
        return androidx.compose.ui.draw.b.d(iVar, new d(a12));
    }

    public static final float k() {
        return f6941a;
    }

    /* access modifiers changed from: private */
    public static final void l(U.a aVar, int i10, int i11, U u10, U u11, U u12, U u13, U u14, U u15, U u16, U u17, U u18, boolean z10, int i12, int i13, float f10, float f11) {
        int i14;
        U.a.j(aVar, u17, c1.n.f19226b.a(), 0.0f, 2, (Object) null);
        int t10 = i11 - y.t(u18);
        if (u13 != null) {
            U.a.l(aVar, u13, 0, k0.c.f23044a.i().a(u13.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u11 != null) {
            if (z10) {
                i14 = k0.c.f23044a.i().a(u11.R0(), t10);
            } else {
                i14 = Af.a.d(y.r() * f11);
            }
            U.a aVar2 = aVar;
            U u19 = u11;
            U.a.l(aVar2, u19, y.v(u13), i14 - Af.a.d(((float) (i14 - i12)) * f10), 0.0f, 4, (Object) null);
        }
        if (u15 != null) {
            U.a.l(aVar, u15, y.v(u13), i13, 0.0f, 4, (Object) null);
        }
        int v10 = y.v(u13) + y.v(u15);
        U.a.l(aVar, u10, v10, i13, 0.0f, 4, (Object) null);
        if (u12 != null) {
            U.a.l(aVar, u12, v10, i13, 0.0f, 4, (Object) null);
        }
        if (u16 != null) {
            U.a.l(aVar, u16, (i10 - y.v(u14)) - u16.X0(), i13, 0.0f, 4, (Object) null);
        }
        if (u14 != null) {
            U.a.l(aVar, u14, i10 - u14.X0(), k0.c.f23044a.i().a(u14.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u18 != null) {
            U.a.l(aVar, u18, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void m(U.a aVar, int i10, int i11, U u10, U u11, U u12, U u13, U u14, U u15, U u16, U u17, boolean z10, float f10, N n10) {
        U u18 = u11;
        U u19 = u14;
        U u20 = u15;
        boolean z11 = z10;
        U.a.j(aVar, u16, c1.n.f19226b.a(), 0.0f, 2, (Object) null);
        int t10 = i11 - y.t(u17);
        int d10 = Af.a.d(n10.d() * f10);
        if (u12 != null) {
            U.a.l(aVar, u12, 0, k0.c.f23044a.i().a(u12.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u19 != null) {
            U.a.l(aVar, u14, y.v(u12), n(z11, t10, d10, u19), 0.0f, 4, (Object) null);
        }
        int v10 = y.v(u12) + y.v(u14);
        U.a.l(aVar, u10, v10, n(z11, t10, d10, u10), 0.0f, 4, (Object) null);
        if (u18 != null) {
            U.a.l(aVar, u11, v10, n(z11, t10, d10, u18), 0.0f, 4, (Object) null);
        }
        if (u20 != null) {
            U.a.l(aVar, u15, (i10 - y.v(u13)) - u15.X0(), n(z11, t10, d10, u20), 0.0f, 4, (Object) null);
        }
        if (u13 != null) {
            U.a.l(aVar, u13, i10 - u13.X0(), k0.c.f23044a.i().a(u13.R0(), t10), 0.0f, 4, (Object) null);
        }
        if (u17 != null) {
            U.a.l(aVar, u17, 0, t10, 0.0f, 4, (Object) null);
        }
    }

    private static final int n(boolean z10, int i10, int i11, U u10) {
        if (z10) {
            return k0.c.f23044a.i().a(u10.R0(), i10);
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static final int o(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        return i10 - i11;
    }
}
