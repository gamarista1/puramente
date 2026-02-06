package Z3;

import Af.a;
import Ef.m;
import H0.C1187h;
import O0.g;
import O0.t;
import O0.v;
import Y.C1500m;
import Z3.f;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.b;
import c1.s;
import j4.C3622i;
import k0.i;
import k4.C3659a;
import k4.C3661c;
import k4.C3666h;
import k4.C3667i;
import k4.C3668j;
import k4.C3669k;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import q0.C2427m;
import yf.C6798l;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private static final long f10550a = b.f19206b.c(0, 0);

    /* renamed from: b  reason: collision with root package name */
    private static final C3668j f10551b = C3669k.a(C3667i.f45119d);

    public static final float c(long j10, float f10) {
        return m.k(f10, (float) b.m(j10), (float) b.k(j10));
    }

    public static final float d(long j10, float f10) {
        return m.k(f10, (float) b.n(j10), (float) b.l(j10));
    }

    public static final i e(i iVar, String str) {
        if (str != null) {
            return O0.m.d(iVar, false, new y(str), 1, (Object) null);
        }
        return iVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M f(String str, v vVar) {
        t.Y(vVar, str);
        t.g0(vVar, g.f4539b.d());
        return C6514M.f71813a;
    }

    public static final long g() {
        return f10550a;
    }

    public static final boolean h(long j10) {
        if (((double) C2427m.k(j10)) < 0.5d || ((double) C2427m.i(j10)) < 0.5d) {
            return false;
        }
        return true;
    }

    public static final C6798l i(C6798l lVar, C6798l lVar2, C6798l lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new x(lVar, lVar2, lVar3);
    }

    /* access modifiers changed from: private */
    public static final C6514M j(C6798l lVar, C6798l lVar2, C6798l lVar3, f.b bVar) {
        if (bVar instanceof f.b.c) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
        } else if (bVar instanceof f.b.d) {
            if (lVar2 != null) {
                lVar2.invoke(bVar);
            }
        } else if (bVar instanceof f.b.C0194b) {
            if (lVar3 != null) {
                lVar3.invoke(bVar);
            }
        } else if (!(bVar instanceof f.b.a)) {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }

    public static final C3622i k(Object obj, C1500m mVar, int i10) {
        mVar.z(1087186730);
        if (obj instanceof C3622i) {
            C3622i iVar = (C3622i) obj;
            mVar.R();
            return iVar;
        }
        Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
        mVar.z(-1245195153);
        boolean S10 = mVar.S(context) | mVar.S(obj);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C3622i.a(context).d(obj).a();
            mVar.r(A10);
        }
        C3622i iVar2 = (C3622i) A10;
        mVar.R();
        mVar.R();
        return iVar2;
    }

    public static final C3622i l(Object obj, C1187h hVar, C1500m mVar, int i10) {
        C3668j jVar;
        mVar.z(1677680258);
        boolean z10 = obj instanceof C3622i;
        if (z10) {
            C3622i iVar = (C3622i) obj;
            if (iVar.q().m() != null) {
                mVar.R();
                return iVar;
            }
        }
        mVar.z(408306591);
        if (C6496s.c(hVar, C1187h.f2609a.f())) {
            jVar = f10551b;
        } else {
            mVar.z(408309406);
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = new l();
                mVar.r(A10);
            }
            jVar = (l) A10;
            mVar.R();
        }
        mVar.R();
        if (z10) {
            mVar.z(-227230258);
            C3622i iVar2 = (C3622i) obj;
            mVar.z(408312509);
            boolean S10 = mVar.S(iVar2) | mVar.S(jVar);
            Object A11 = mVar.A();
            if (S10 || A11 == C1500m.f10026a.a()) {
                A11 = C3622i.R(iVar2, (Context) null, 1, (Object) null).A(jVar).a();
                mVar.r(A11);
            }
            C3622i iVar3 = (C3622i) A11;
            mVar.R();
            mVar.R();
            mVar.R();
            return iVar3;
        }
        mVar.z(-227066702);
        Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
        mVar.z(408319118);
        boolean S11 = mVar.S(context) | mVar.S(obj) | mVar.S(jVar);
        Object A12 = mVar.A();
        if (S11 || A12 == C1500m.f10026a.a()) {
            A12 = new C3622i.a(context).d(obj).A(jVar).a();
            mVar.r(A12);
        }
        C3622i iVar4 = (C3622i) A12;
        mVar.R();
        mVar.R();
        mVar.R();
        return iVar4;
    }

    public static final long m(long j10) {
        return s.a(a.d(C2427m.k(j10)), a.d(C2427m.i(j10)));
    }

    public static final C3666h n(C1187h hVar) {
        C1187h.a aVar = C1187h.f2609a;
        if (C6496s.c(hVar, aVar.d()) || C6496s.c(hVar, aVar.e())) {
            return C3666h.FIT;
        }
        return C3666h.FILL;
    }

    public static final C3667i o(long j10) {
        C3661c cVar;
        C3661c cVar2;
        if (b.p(j10)) {
            return null;
        }
        if (b.h(j10)) {
            cVar = C3659a.a(b.l(j10));
        } else {
            cVar = C3661c.b.f45104a;
        }
        if (b.g(j10)) {
            cVar2 = C3659a.a(b.k(j10));
        } else {
            cVar2 = C3661c.b.f45104a;
        }
        return new C3667i(cVar, cVar2);
    }
}
