package J0;

import H0.C1180a;
import H0.C1181b;
import H0.C1192m;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.O;
import q0.C2421g;
import q0.C2422h;
import yf.C6798l;

/* renamed from: J0.a  reason: case insensitive filesystem */
public abstract class C1230a {

    /* renamed from: a  reason: collision with root package name */
    private final C1232b f3751a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3752b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3753c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3754d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3755e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3756f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3757g;

    /* renamed from: h  reason: collision with root package name */
    private C1232b f3758h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map f3759i;

    /* renamed from: J0.a$a  reason: collision with other inner class name */
    static final class C0084a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1230a f3760a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0084a(C1230a aVar) {
            super(1);
            this.f3760a = aVar;
        }

        public final void a(C1232b bVar) {
            if (bVar.e()) {
                if (bVar.p().g()) {
                    bVar.T();
                }
                Map b10 = bVar.p().f3759i;
                C1230a aVar = this.f3760a;
                for (Map.Entry entry : b10.entrySet()) {
                    aVar.c((C1180a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.o0());
                }
                C1235c0 F22 = bVar.o0().F2();
                C6496s.e(F22);
                while (!C6496s.c(F22, this.f3760a.f().o0())) {
                    C1230a aVar2 = this.f3760a;
                    for (C1180a aVar3 : this.f3760a.e(F22).keySet()) {
                        aVar2.c(aVar3, aVar2.i(F22, aVar3), F22);
                    }
                    F22 = F22.F2();
                    C6496s.e(F22);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1232b) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ C1230a(C1232b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* access modifiers changed from: private */
    public final void c(C1180a aVar, int i10, C1235c0 c0Var) {
        float f10;
        float f11 = (float) i10;
        long a10 = C2422h.a(f11, f11);
        while (true) {
            a10 = d(c0Var, a10);
            c0Var = c0Var.F2();
            C6496s.e(c0Var);
            if (C6496s.c(c0Var, this.f3751a.o0())) {
                break;
            } else if (e(c0Var).containsKey(aVar)) {
                float i11 = (float) i(c0Var, aVar);
                a10 = C2422h.a(i11, i11);
            }
        }
        if (aVar instanceof C1192m) {
            f10 = C2421g.n(a10);
        } else {
            f10 = C2421g.m(a10);
        }
        int round = Math.round(f10);
        Map map = this.f3759i;
        if (map.containsKey(aVar)) {
            round = C1181b.c(aVar, ((Number) O.j(this.f3759i, aVar)).intValue(), round);
        }
        map.put(aVar, Integer.valueOf(round));
    }

    /* access modifiers changed from: protected */
    public abstract long d(C1235c0 c0Var, long j10);

    /* access modifiers changed from: protected */
    public abstract Map e(C1235c0 c0Var);

    public final C1232b f() {
        return this.f3751a;
    }

    public final boolean g() {
        return this.f3752b;
    }

    public final Map h() {
        return this.f3759i;
    }

    /* access modifiers changed from: protected */
    public abstract int i(C1235c0 c0Var, C1180a aVar);

    public final boolean j() {
        if (this.f3753c || this.f3755e || this.f3756f || this.f3757g) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        o();
        if (this.f3758h != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return this.f3754d;
    }

    public final void m() {
        this.f3752b = true;
        C1232b D10 = this.f3751a.D();
        if (D10 != null) {
            if (this.f3753c) {
                D10.J0();
            } else if (this.f3755e || this.f3754d) {
                D10.requestLayout();
            }
            if (this.f3756f) {
                this.f3751a.J0();
            }
            if (this.f3757g) {
                this.f3751a.requestLayout();
            }
            D10.p().m();
        }
    }

    public final void n() {
        this.f3759i.clear();
        this.f3751a.u(new C0084a(this));
        this.f3759i.putAll(e(this.f3751a.o0()));
        this.f3752b = false;
    }

    public final void o() {
        C1232b bVar;
        C1230a p10;
        C1230a p11;
        if (j()) {
            bVar = this.f3751a;
        } else {
            C1232b D10 = this.f3751a.D();
            if (D10 != null) {
                bVar = D10.p().f3758h;
                if (bVar == null || !bVar.p().j()) {
                    C1232b bVar2 = this.f3758h;
                    if (bVar2 != null && !bVar2.p().j()) {
                        C1232b D11 = bVar2.D();
                        if (!(D11 == null || (p11 = D11.p()) == null)) {
                            p11.o();
                        }
                        C1232b D12 = bVar2.D();
                        if (D12 == null || (p10 = D12.p()) == null) {
                            bVar = null;
                        } else {
                            bVar = p10.f3758h;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.f3758h = bVar;
    }

    public final void p() {
        this.f3752b = true;
        this.f3753c = false;
        this.f3755e = false;
        this.f3754d = false;
        this.f3756f = false;
        this.f3757g = false;
        this.f3758h = null;
    }

    public final void q(boolean z10) {
        this.f3755e = z10;
    }

    public final void r(boolean z10) {
        this.f3757g = z10;
    }

    public final void s(boolean z10) {
        this.f3756f = z10;
    }

    public final void t(boolean z10) {
        this.f3754d = z10;
    }

    public final void u(boolean z10) {
        this.f3753c = z10;
    }

    private C1230a(C1232b bVar) {
        this.f3751a = bVar;
        this.f3752b = true;
        this.f3759i = new HashMap();
    }
}
