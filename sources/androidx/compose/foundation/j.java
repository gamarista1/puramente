package androidx.compose.foundation;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import androidx.compose.ui.platform.B0;
import androidx.compose.ui.platform.C1676z0;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import x.C2843G;
import x.C2844H;
import x.C2845I;
import yf.C6787a;
import yf.C6798l;
import yf.q;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private static final I0 f12752a = C1521x.f(a.f12753a);

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12753a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final C2843G invoke() {
            return g.f12562a;
        }
    }

    public static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B.j f12754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2843G f12755b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(B.j jVar, C2843G g10) {
            super(1);
            this.f12754a = jVar;
            this.f12755b = g10;
        }

        public final void a(B0 b02) {
            throw null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.c.a(obj);
            a((B0) null);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2843G f12756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ B.j f12757b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2843G g10, B.j jVar) {
            super(3);
            this.f12756a = g10;
            this.f12757b = jVar;
        }

        public final i a(i iVar, C1500m mVar, int i10) {
            mVar.T(-353972293);
            if (C1506p.H()) {
                C1506p.Q(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            C2844H b10 = this.f12756a.b(this.f12757b, mVar, 0);
            boolean S10 = mVar.S(b10);
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new k(b10);
                mVar.r(A10);
            }
            k kVar = (k) A10;
            if (C1506p.H()) {
                C1506p.P();
            }
            mVar.M();
            return kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((i) obj, (C1500m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final I0 a() {
        return f12752a;
    }

    public static final i b(i iVar, B.j jVar, C2843G g10) {
        C6798l lVar;
        if (g10 == null) {
            return iVar;
        }
        if (g10 instanceof C2845I) {
            return iVar.h(new IndicationModifierElement(jVar, (C2845I) g10));
        }
        if (C1676z0.b()) {
            lVar = new b(jVar, g10);
        } else {
            lVar = C1676z0.a();
        }
        return h.b(iVar, lVar, new c(g10, jVar));
    }
}
