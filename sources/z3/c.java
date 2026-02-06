package Z3;

import H0.C1187h;
import H0.F;
import H0.G;
import H0.H;
import H0.U;
import J0.C1241g;
import X3.g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import coil.compose.ContentPainterElement;
import j4.C3622i;
import java.util.List;
import java.util.Map;
import k0.h;
import k0.i;
import k4.C3668j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import o0.C2342e;
import r0.C2547y0;
import t0.C2605f;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public abstract class c {

    public static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f10427a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6787a aVar) {
            super(0);
            this.f10427a = aVar;
        }

        public final Object invoke() {
            return this.f10427a.invoke();
        }
    }

    static final class b implements F {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10428a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C6514M d(U.a aVar) {
            return C6514M.f71813a;
        }

        public final G j(H h10, List list, long j10) {
            return H.N(h10, c1.b.n(j10), c1.b.m(j10), (Map) null, new d(), 4, (Object) null);
        }
    }

    private static final void c(i iVar, String str, i iVar2, C6798l lVar, C6798l lVar2, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, int i10, boolean z10, C1500m mVar, int i11, int i12) {
        int i13;
        int i14;
        i iVar3 = iVar2;
        C1187h hVar2 = hVar;
        int i15 = i11;
        C1500m h10 = mVar.h(-421592773);
        int i16 = 4;
        if ((i15 & 14) == 0) {
            i13 = (h10.S(iVar) ? 4 : 2) | i15;
        } else {
            i iVar4 = iVar;
            i13 = i15;
        }
        String str2 = str;
        if ((i15 & 112) == 0) {
            i13 |= h10.S(str2) ? 32 : 16;
        }
        if ((i15 & 896) == 0) {
            i13 |= h10.S(iVar3) ? 256 : 128;
        }
        C6798l lVar3 = lVar;
        if ((i15 & 7168) == 0) {
            i13 |= h10.C(lVar3) ? 2048 : 1024;
        }
        C6798l lVar4 = lVar2;
        if ((i15 & 57344) == 0) {
            i13 |= h10.C(lVar4) ? 16384 : 8192;
        }
        k0.c cVar2 = cVar;
        if ((i15 & 458752) == 0) {
            i13 |= h10.S(cVar2) ? 131072 : 65536;
        }
        if ((i15 & 3670016) == 0) {
            i13 |= h10.S(hVar2) ? 1048576 : 524288;
        }
        float f11 = f10;
        if ((i15 & 29360128) == 0) {
            i13 |= h10.c(f11) ? 8388608 : 4194304;
        }
        C2547y0 y0Var2 = y0Var;
        if ((234881024 & i15) == 0) {
            i13 |= h10.S(y0Var2) ? 67108864 : 33554432;
        }
        if ((1879048192 & i15) == 0) {
            i13 |= h10.d(i10) ? 536870912 : 268435456;
        } else {
            int i17 = i10;
        }
        int i18 = i13;
        if ((i12 & 14) == 0) {
            if (!h10.b(z10)) {
                i16 = 2;
            }
            i14 = i12 | i16;
        } else {
            boolean z11 = z10;
            i14 = i12;
        }
        if ((i18 & 1533916891) == 306783378 && (i14 & 11) == 2 && h10.i()) {
            h10.I();
        } else {
            C3622i l10 = z.l(iVar.b(), hVar2, h10, ((i18 >> 15) & 112) | 8);
            int i19 = i18 >> 3;
            int i20 = (i19 & 896) | 72 | (i19 & 7168);
            int i21 = i18 >> 6;
            int i22 = i21 & 57344;
            int i23 = i21;
            f c10 = h.c(l10, iVar.a(), lVar, lVar2, hVar, i10, iVar.c(), h10, i20 | i22 | ((i18 >> 12) & 458752), 0);
            C3668j K10 = l10.K();
            int i24 = i23;
            f(K10 instanceof l ? iVar3.h((i) K10) : iVar3, c10, str, cVar, hVar, f10, y0Var, z10, h10, ((i18 << 3) & 896) | (i24 & 7168) | i22 | (i24 & 458752) | (i24 & 3670016) | ((i14 << 21) & 29360128));
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            a aVar = r0;
            a aVar2 = new a(iVar, str, iVar2, lVar, lVar2, cVar, hVar, f10, y0Var, i10, z10, i11, i12);
            k10.a(aVar);
        }
    }

    public static final void d(Object obj, String str, g gVar, i iVar, C6798l lVar, C6798l lVar2, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, int i10, boolean z10, p pVar, C1500m mVar, int i11, int i12, int i13) {
        i.a aVar;
        C6798l lVar3;
        C6798l lVar4;
        k0.c cVar2;
        C1187h hVar2;
        float f11;
        C2547y0 y0Var2;
        int i14;
        boolean z11;
        p pVar2;
        int i15 = i13;
        mVar.z(2032051394);
        if ((i15 & 8) != 0) {
            aVar = i.f23074a;
        } else {
            aVar = iVar;
        }
        if ((i15 & 16) != 0) {
            lVar3 = f.f10429v.a();
        } else {
            lVar3 = lVar;
        }
        if ((i15 & 32) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        if ((i15 & 64) != 0) {
            cVar2 = k0.c.f23044a.e();
        } else {
            cVar2 = cVar;
        }
        if ((i15 & 128) != 0) {
            hVar2 = C1187h.f2609a.d();
        } else {
            hVar2 = hVar;
        }
        if ((i15 & 256) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i15 & 512) != 0) {
            y0Var2 = null;
        } else {
            y0Var2 = y0Var;
        }
        if ((i15 & 1024) != 0) {
            i14 = C2605f.f25940d0.b();
        } else {
            i14 = i10;
        }
        if ((i15 & 2048) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i15 & 4096) != 0) {
            pVar2 = q.a();
        } else {
            pVar2 = pVar;
        }
        int i16 = i11 >> 3;
        c(new i(obj, pVar2, gVar), str, aVar, lVar3, lVar4, cVar2, hVar2, f11, y0Var2, i14, z11, mVar, (i11 & 112) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 14);
        mVar.R();
    }

    /* access modifiers changed from: private */
    public static final C6514M e(i iVar, String str, i iVar2, C6798l lVar, C6798l lVar2, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, int i10, boolean z10, int i11, int i12, C1500m mVar, int i13) {
        c(iVar, str, iVar2, lVar, lVar2, cVar, hVar, f10, y0Var, i10, z10, mVar, M0.a(i11 | 1), M0.a(i12));
        return C6514M.f71813a;
    }

    private static final void f(i iVar, f fVar, String str, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, boolean z10, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        i iVar2 = iVar;
        String str2 = str;
        boolean z11 = z10;
        int i20 = i10;
        C1500m h10 = mVar.h(777774312);
        if ((i20 & 14) == 0) {
            if (h10.S(iVar2)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i11 = i19 | i20;
        } else {
            i11 = i20;
        }
        if ((i20 & 112) == 0) {
            if (h10.S(fVar)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i11 |= i18;
        } else {
            f fVar2 = fVar;
        }
        if ((i20 & 896) == 0) {
            if (h10.S(str2)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        }
        if ((i20 & 7168) == 0) {
            if (h10.S(cVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i11 |= i16;
        } else {
            k0.c cVar2 = cVar;
        }
        if ((57344 & i20) == 0) {
            if (h10.S(hVar)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i11 |= i15;
        } else {
            C1187h hVar2 = hVar;
        }
        if ((458752 & i20) == 0) {
            if (h10.c(f10)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i11 |= i14;
        } else {
            float f11 = f10;
        }
        C2547y0 y0Var2 = y0Var;
        if ((3670016 & i20) == 0) {
            if (h10.S(y0Var2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i11 |= i13;
        }
        if ((29360128 & i20) == 0) {
            if (h10.b(z11)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i11 |= i12;
        }
        if ((i11 & 23967451) != 4793490 || !h10.i()) {
            i e10 = z.e(iVar2, str2);
            if (z11) {
                e10 = C2342e.b(e10);
            }
            ContentPainterElement contentPainterElement = r10;
            ContentPainterElement contentPainterElement2 = new ContentPainterElement(fVar, cVar, hVar, f10, y0Var);
            i h11 = e10.h(contentPainterElement);
            b bVar = b.f10428a;
            h10.z(544976794);
            int a10 = C1494j.a(h10, 0);
            i e11 = h.e(h10, h11);
            C1523y p10 = h10.p();
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            h10.z(1405779621);
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(new a(a11));
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, bVar, aVar.c());
            F1.b(a12, p10, aVar.e());
            F1.b(a12, e11, aVar.d());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            h10.u();
            h10.R();
            h10.R();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(iVar, fVar, str, cVar, hVar, f10, y0Var, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M g(i iVar, f fVar, String str, k0.c cVar, C1187h hVar, float f10, C2547y0 y0Var, boolean z10, int i10, C1500m mVar, int i11) {
        f(iVar, fVar, str, cVar, hVar, f10, y0Var, z10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
