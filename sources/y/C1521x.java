package Y;

import java.util.Arrays;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: Y.x  reason: case insensitive filesystem */
public abstract class C1521x {

    /* renamed from: Y.x$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J0[] f10194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f10195b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10196c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(J0[] j0Arr, p pVar, int i10) {
            super(2);
            this.f10194a = j0Arr;
            this.f10195b = pVar;
            this.f10196c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            J0[] j0Arr = this.f10194a;
            C1521x.b((J0[]) Arrays.copyOf(j0Arr, j0Arr.length), this.f10195b, mVar, M0.a(this.f10196c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: Y.x$b */
    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J0 f10197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f10198b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10199c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(J0 j02, p pVar, int i10) {
            super(2);
            this.f10197a = j02;
            this.f10198b = pVar;
            this.f10199c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            C1521x.a(this.f10197a, this.f10198b, mVar, M0.a(this.f10199c | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public static final void a(J0 j02, p pVar, C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1350970552);
        if (C1506p.H()) {
            C1506p.Q(-1350970552, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:398)");
        }
        h10.N(j02);
        pVar.invoke(h10, Integer.valueOf((i10 >> 3) & 14));
        h10.t();
        if (C1506p.H()) {
            C1506p.P();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new b(j02, pVar, i10));
        }
    }

    public static final void b(J0[] j0Arr, p pVar, C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1390796515);
        if (C1506p.H()) {
            C1506p.Q(-1390796515, i10, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:377)");
        }
        h10.J(j0Arr);
        pVar.invoke(h10, Integer.valueOf((i10 >> 3) & 14));
        h10.K();
        if (C1506p.H()) {
            C1506p.P();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(j0Arr, pVar, i10));
        }
    }

    public static final I0 c(o1 o1Var, C6787a aVar) {
        return new N(o1Var, aVar);
    }

    public static /* synthetic */ I0 d(o1 o1Var, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o1Var = p1.q();
        }
        return c(o1Var, aVar);
    }

    public static final I0 e(C6798l lVar) {
        return new D(lVar);
    }

    public static final I0 f(C6787a aVar) {
        return new B1(aVar);
    }
}
