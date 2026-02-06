package H0;

import J0.C1241g;
import Y.C1470a1;
import Y.C1494j;
import Y.C1500m;
import Y.C1506p;
import Y.F1;
import g0.c;
import java.util.List;
import k0.h;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

/* renamed from: H0.x  reason: case insensitive filesystem */
public abstract class C1202x {

    /* renamed from: H0.x$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f2635a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list) {
            super(2);
            this.f2635a = list;
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:182)");
                }
                List list = this.f2635a;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    p pVar = (p) list.get(i11);
                    int a10 = C1494j.a(mVar, 0);
                    C1241g.a aVar = C1241g.f3853J;
                    C6787a f10 = aVar.f();
                    if (mVar.j() == null) {
                        C1494j.c();
                    }
                    mVar.F();
                    if (mVar.f()) {
                        mVar.U(f10);
                    } else {
                        mVar.q();
                    }
                    C1500m a11 = F1.a(mVar);
                    p b10 = aVar.b();
                    if (a11.f() || !C6496s.c(a11.A(), Integer.valueOf(a10))) {
                        a11.r(Integer.valueOf(a10));
                        a11.V(Integer.valueOf(a10), b10);
                    }
                    pVar.invoke(mVar, 0);
                    mVar.u();
                }
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

    /* renamed from: H0.x$b */
    static final class b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f2636a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(3);
            this.f2636a = iVar;
        }

        public final void a(C1500m mVar, C1500m mVar2, int i10) {
            if (C1506p.H()) {
                C1506p.Q(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:205)");
            }
            int a10 = C1494j.a(mVar2, 0);
            i e10 = h.e(mVar2, this.f2636a);
            mVar.z(509942095);
            C1500m a11 = F1.a(mVar);
            C1241g.a aVar = C1241g.f3853J;
            F1.b(a11, e10, aVar.d());
            p b10 = aVar.b();
            if (a11.f() || !C6496s.c(a11.A(), Integer.valueOf(a10))) {
                a11.r(Integer.valueOf(a10));
                a11.V(Integer.valueOf(a10), b10);
            }
            mVar.R();
            if (C1506p.H()) {
                C1506p.P();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((C1470a1) obj).f(), (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public static final p a(List list) {
        return c.c(-1953651383, true, new a(list));
    }

    public static final q b(i iVar) {
        return c.c(-1586257396, true, new b(iVar));
    }
}
