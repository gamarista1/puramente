package w;

import Ef.i;
import Ef.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.L;

public abstract class v0 {

    public static final class a implements C2807s {

        /* renamed from: a  reason: collision with root package name */
        private final List f27633a;

        a(C2805q qVar, float f10, float f11) {
            i u10 = m.u(0, qVar.b());
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                arrayList.add(new C2766J(f10, f11, qVar.a(((L) it).a())));
            }
            this.f27633a = arrayList;
        }

        /* renamed from: a */
        public C2766J get(int i10) {
            return (C2766J) this.f27633a.get(i10);
        }
    }

    public static final class b implements C2807s {

        /* renamed from: a  reason: collision with root package name */
        private final C2766J f27634a;

        b(float f10, float f11) {
            this.f27634a = new C2766J(f10, f11, 0.0f, 4, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C2766J get(int i10) {
            return this.f27634a;
        }
    }

    public static final long b(x0 x0Var, long j10) {
        return m.m(j10 - ((long) x0Var.e()), 0, (long) x0Var.f());
    }

    /* access modifiers changed from: private */
    public static final C2807s c(C2805q qVar, float f10, float f11) {
        if (qVar != null) {
            return new a(qVar, f10, f11);
        }
        return new b(f10, f11);
    }

    public static final C2805q d(u0 u0Var, long j10, C2805q qVar, C2805q qVar2, C2805q qVar3) {
        return u0Var.c(j10 * 1000000, qVar, qVar2, qVar3);
    }
}
