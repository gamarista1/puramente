package a2;

import Y.C1500m;
import Y.C1506p;
import Y.C1521x;
import Y.I0;
import Y.J0;
import Y.o1;
import androidx.lifecycle.e0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

/* renamed from: a2.a  reason: case insensitive filesystem */
public final class C1542a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1542a f10582a = new C1542a();

    /* renamed from: b  reason: collision with root package name */
    private static final I0 f10583b = C1521x.d((o1) null, C0200a.f10585a, 1, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f10584c = 0;

    /* renamed from: a2.a$a  reason: collision with other inner class name */
    static final class C0200a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0200a f10585a = new C0200a();

        C0200a() {
            super(0);
        }

        /* renamed from: a */
        public final e0 invoke() {
            return null;
        }
    }

    private C1542a() {
    }

    public final e0 a(C1500m mVar, int i10) {
        mVar.z(-584162872);
        if (C1506p.H()) {
            C1506p.Q(-584162872, i10, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        e0 e0Var = (e0) mVar.m(f10583b);
        if (e0Var == null) {
            e0Var = C1543b.a(mVar, 0);
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.R();
        return e0Var;
    }

    public final J0 b(e0 e0Var) {
        C6496s.h(e0Var, "viewModelStoreOwner");
        return f10583b.d(e0Var);
    }
}
