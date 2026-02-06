package Fg;

import Jg.d;
import Jg.i;
import Jg.j;
import Jg.o;
import Pg.l;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sf.C6714a;
import yf.C6787a;
import yf.C6798l;

public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63054a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f63055b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63056c;

    /* renamed from: d  reason: collision with root package name */
    private final o f63057d;

    /* renamed from: e  reason: collision with root package name */
    private final C5390q f63058e;

    /* renamed from: f  reason: collision with root package name */
    private final r f63059f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f63060g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f63061h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayDeque f63062i;

    /* renamed from: j  reason: collision with root package name */
    private Set f63063j;

    public interface a {

        /* renamed from: Fg.u0$a$a  reason: collision with other inner class name */
        public static final class C0932a implements a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f63064a;

            public void a(C6787a aVar) {
                C6496s.h(aVar, "block");
                if (!this.f63064a) {
                    this.f63064a = ((Boolean) aVar.invoke()).booleanValue();
                }
            }

            public final boolean b() {
                return this.f63064a;
            }
        }

        void a(C6787a aVar);
    }

    public enum b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER;

        static {
            b[] a10;
            f63069e = C6714a.a(a10);
        }
    }

    public static abstract class c {

        public static abstract class a extends c {
            public a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f63070a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public j a(u0 u0Var, i iVar) {
                C6496s.h(u0Var, "state");
                C6496s.h(iVar, "type");
                return u0Var.j().v0(iVar);
            }
        }

        /* renamed from: Fg.u0$c$c  reason: collision with other inner class name */
        public static final class C0933c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0933c f63071a = new C0933c();

            private C0933c() {
                super((DefaultConstructorMarker) null);
            }

            public /* bridge */ /* synthetic */ j a(u0 u0Var, i iVar) {
                return (j) b(u0Var, iVar);
            }

            public Void b(u0 u0Var, i iVar) {
                C6496s.h(u0Var, "state");
                C6496s.h(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f63072a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public j a(u0 u0Var, i iVar) {
                C6496s.h(u0Var, "state");
                C6496s.h(iVar, "type");
                return u0Var.j().k(iVar);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract j a(u0 u0Var, i iVar);

        private c() {
        }
    }

    public u0(boolean z10, boolean z11, boolean z12, o oVar, C5390q qVar, r rVar) {
        C6496s.h(oVar, "typeSystemContext");
        C6496s.h(qVar, "kotlinTypePreparator");
        C6496s.h(rVar, "kotlinTypeRefiner");
        this.f63054a = z10;
        this.f63055b = z11;
        this.f63056c = z12;
        this.f63057d = oVar;
        this.f63058e = qVar;
        this.f63059f = rVar;
    }

    public static /* synthetic */ Boolean d(u0 u0Var, i iVar, i iVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return u0Var.c(iVar, iVar2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    public Boolean c(i iVar, i iVar2, boolean z10) {
        C6496s.h(iVar, "subType");
        C6496s.h(iVar2, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f63062i;
        C6496s.e(arrayDeque);
        arrayDeque.clear();
        Set set = this.f63063j;
        C6496s.e(set);
        set.clear();
        this.f63061h = false;
    }

    public boolean f(i iVar, i iVar2) {
        C6496s.h(iVar, "subType");
        C6496s.h(iVar2, "superType");
        return true;
    }

    public b g(j jVar, d dVar) {
        C6496s.h(jVar, "subType");
        C6496s.h(dVar, "superType");
        return b.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque h() {
        return this.f63062i;
    }

    public final Set i() {
        return this.f63063j;
    }

    public final o j() {
        return this.f63057d;
    }

    public final void k() {
        this.f63061h = true;
        if (this.f63062i == null) {
            this.f63062i = new ArrayDeque(4);
        }
        if (this.f63063j == null) {
            this.f63063j = l.f64708c.a();
        }
    }

    public final boolean l(i iVar) {
        C6496s.h(iVar, "type");
        if (!this.f63056c || !this.f63057d.h(iVar)) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        return this.f63054a;
    }

    public final boolean n() {
        return this.f63055b;
    }

    public final i o(i iVar) {
        C6496s.h(iVar, "type");
        return this.f63058e.a(iVar);
    }

    public final i p(i iVar) {
        C6496s.h(iVar, "type");
        return this.f63059f.a(iVar);
    }

    public boolean q(C6798l lVar) {
        C6496s.h(lVar, "block");
        a.C0932a aVar = new a.C0932a();
        lVar.invoke(aVar);
        return aVar.b();
    }
}
