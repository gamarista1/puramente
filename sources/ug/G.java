package Ug;

import Zg.C5722k;
import Zg.C5725n;
import Zg.C5726o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6655a;
import qf.C6656b;
import qf.C6658d;
import qf.e;
import qf.g;
import yf.C6798l;

public abstract class G extends C6655a implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65311b = new a((DefaultConstructorMarker) null);

    public static final class a extends C6656b {

        /* renamed from: Ug.G$a$a  reason: collision with other inner class name */
        static final class C0958a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0958a f65312a = new C0958a();

            C0958a() {
                super(1);
            }

            /* renamed from: a */
            public final G invoke(g.b bVar) {
                if (bVar instanceof G) {
                    return (G) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(e.f72642c0, C0958a.f65312a);
        }
    }

    public G() {
        super(e.f72642c0);
    }

    public void A1(g gVar, Runnable runnable) {
        z1(gVar, runnable);
    }

    public boolean B1(g gVar) {
        return true;
    }

    public G C1(int i10) {
        C5726o.a(i10);
        return new C5725n(this, i10);
    }

    public final void Q(C6658d dVar) {
        C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C5722k) dVar).q();
    }

    public g R0(g.c cVar) {
        return e.a.b(this, cVar);
    }

    public final C6658d V(C6658d dVar) {
        return new C5722k(this, dVar);
    }

    public g.b b(g.c cVar) {
        return e.a.a(this, cVar);
    }

    public String toString() {
        return O.a(this) + '@' + O.b(this);
    }

    public abstract void z1(g gVar, Runnable runnable);
}
