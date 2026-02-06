package D;

import E.C1146o;
import E.J;
import Y.C1500m;
import Y.C1506p;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.q;
import yf.r;

public final class j extends C1146o implements x {

    /* renamed from: a  reason: collision with root package name */
    private final J f1238a = new J();

    /* renamed from: b  reason: collision with root package name */
    private List f1239b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f1240a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f1240a = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.f1240a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f1241a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f1241a = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i10) {
            return this.f1241a;
        }
    }

    static final class c extends C6498u implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f1242a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q qVar) {
            super(4);
            this.f1242a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
            return C6514M.f71813a;
        }

        public final void invoke(c cVar, int i10, C1500m mVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= mVar.S(cVar) ? 4 : 2;
            }
            if ((i11 & 131) != 130 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                this.f1242a.invoke(cVar, mVar, Integer.valueOf(i11 & 14));
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }
    }

    public j(C6798l lVar) {
        lVar.invoke(this);
    }

    public void a(int i10, C6798l lVar, C6798l lVar2, r rVar) {
        g().b(i10, new i(lVar, lVar2, rVar));
    }

    public void d(Object obj, Object obj2, q qVar) {
        a aVar;
        J k10 = g();
        if (obj != null) {
            aVar = new a(obj);
        } else {
            aVar = null;
        }
        k10.b(1, new i(aVar, new b(obj2), g0.c.c(-1010194746, true, new c(qVar))));
    }

    public final List j() {
        List list = this.f1239b;
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    /* renamed from: k */
    public J g() {
        return this.f1238a;
    }
}
