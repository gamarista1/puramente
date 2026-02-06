package O0;

import Ff.l;
import Q0.C1321d;
import Q0.Q;
import W0.r;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.z;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ l[] f4655a;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6787a f4656a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6787a aVar) {
            super(1);
            this.f4656a = aVar;
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            boolean z10;
            Float f10 = (Float) this.f4656a.invoke();
            if (f10 == null) {
                z10 = false;
            } else {
                list.add(f10);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        Class<t> cls = t.class;
        f4655a = new l[]{O.f(new z(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), O.f(new z(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), O.f(new z(cls, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(cls, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), O.f(new z(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.f(new z(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), O.f(new z(cls, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), O.f(new z(cls, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.f(new z(cls, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), O.f(new z(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), O.f(new z(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(cls, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), O.f(new z(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), O.f(new z(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), O.f(new z(cls, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), O.f(new z(cls, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), O.f(new z(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        q qVar = q.f4613a;
        qVar.B();
        qVar.x();
        qVar.v();
        qVar.t();
        qVar.i();
        qVar.s();
        qVar.s();
        qVar.e();
        qVar.c();
        qVar.H();
        qVar.k();
        qVar.I();
        qVar.y();
        qVar.C();
        qVar.F();
        qVar.r();
        qVar.g();
        qVar.E();
        qVar.l();
        qVar.A();
        qVar.a();
        qVar.b();
        qVar.G();
        qVar.p();
        qVar.u();
        i.f4556a.d();
    }

    public static /* synthetic */ void A(v vVar, int i10, String str, C6787a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        z(vVar, i10, str, aVar);
    }

    public static final void B(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.m(), new a(str, aVar));
    }

    public static /* synthetic */ void C(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        B(vVar, str, aVar);
    }

    public static final void D(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.n(), new a(str, aVar));
    }

    public static /* synthetic */ void E(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        D(vVar, str, aVar);
    }

    public static final void F(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.o(), new a(str, aVar));
    }

    public static /* synthetic */ void G(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        F(vVar, str, aVar);
    }

    public static final void H(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.p(), new a(str, aVar));
    }

    public static /* synthetic */ void I(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        H(vVar, str, aVar);
    }

    public static final void J(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.q(), new a(str, aVar));
    }

    public static /* synthetic */ void K(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        J(vVar, str, aVar);
    }

    public static final void L(v vVar) {
        vVar.a(q.f4613a.w(), C6514M.f71813a);
    }

    public static final void M(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.r(), new a(str, aVar));
    }

    public static /* synthetic */ void N(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        M(vVar, str, aVar);
    }

    public static final void O(v vVar) {
        vVar.a(q.f4613a.q(), C6514M.f71813a);
    }

    public static final void P(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.s(), new a(str, aVar));
    }

    public static /* synthetic */ void Q(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P(vVar, str, aVar);
    }

    public static final void R(v vVar, String str, p pVar) {
        vVar.a(i.f4556a.t(), new a(str, pVar));
    }

    public static /* synthetic */ void S(v vVar, String str, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        R(vVar, str, pVar);
    }

    public static final void T(v vVar, p pVar) {
        vVar.a(i.f4556a.u(), pVar);
    }

    public static final void U(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.v(), new a(str, lVar));
    }

    public static /* synthetic */ void V(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        U(vVar, str, lVar);
    }

    public static final void W(v vVar, b bVar) {
        q.f4613a.a().d(vVar, f4655a[20], bVar);
    }

    public static final void X(v vVar, boolean z10) {
        q.f4613a.s().d(vVar, f4655a[5], Boolean.valueOf(z10));
    }

    public static final void Y(v vVar, String str) {
        vVar.a(q.f4613a.d(), C6565s.e(str));
    }

    public static final void Z(v vVar, boolean z10) {
        q.f4613a.p().d(vVar, f4655a[23], Boolean.valueOf(z10));
    }

    public static final u a(String str) {
        return new u(str, true);
    }

    public static final void a0(v vVar, C1321d dVar) {
        q.f4613a.g().d(vVar, f4655a[16], dVar);
    }

    public static final u b(String str, p pVar) {
        return new u(str, true, pVar);
    }

    public static final void b0(v vVar, boolean z10) {
        q.f4613a.i().d(vVar, f4655a[4], Boolean.valueOf(z10));
    }

    public static final void c(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.a(), new a(str, aVar));
    }

    public static final void c0(v vVar, h hVar) {
        q.f4613a.k().d(vVar, f4655a[10], hVar);
    }

    public static /* synthetic */ void d(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(vVar, str, aVar);
    }

    public static final void d0(v vVar, int i10) {
        q.f4613a.t().d(vVar, f4655a[3], e.c(i10));
    }

    public static final void e(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.b(), new a(str, aVar));
    }

    public static final void e0(v vVar, String str) {
        q.f4613a.v().d(vVar, f4655a[2], str);
    }

    public static final void f(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.c(), new a(str, aVar));
    }

    public static final void f0(v vVar, f fVar) {
        q.f4613a.x().d(vVar, f4655a[1], fVar);
    }

    public static /* synthetic */ void g(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        f(vVar, str, aVar);
    }

    public static final void g0(v vVar, int i10) {
        q.f4613a.y().d(vVar, f4655a[12], g.h(i10));
    }

    public static final void h(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.e(), new a(str, aVar));
    }

    public static final void h0(v vVar, String str, q qVar) {
        vVar.a(i.f4556a.x(), new a(str, qVar));
    }

    public static /* synthetic */ void i(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        h(vVar, str, aVar);
    }

    public static /* synthetic */ void i0(v vVar, String str, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        h0(vVar, str, qVar);
    }

    public static final void j(v vVar) {
        vVar.a(q.f4613a.o(), C6514M.f71813a);
    }

    public static final void j0(v vVar, boolean z10) {
        q.f4613a.r().d(vVar, f4655a[15], Boolean.valueOf(z10));
    }

    public static final void k(v vVar) {
        vVar.a(q.f4613a.f(), C6514M.f71813a);
    }

    public static final void k0(v vVar, String str) {
        q.f4613a.B().d(vVar, f4655a[0], str);
    }

    public static final void l(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.f(), new a(str, aVar));
    }

    public static final void l0(v vVar, String str) {
        q.f4613a.C().d(vVar, f4655a[13], str);
    }

    public static /* synthetic */ void m(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        l(vVar, str, aVar);
    }

    public static final void m0(v vVar, C1321d dVar) {
        vVar.a(q.f4613a.D(), C6565s.e(dVar));
    }

    public static final void n(v vVar, String str) {
        vVar.a(q.f4613a.h(), str);
    }

    public static final void n0(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.y(), new a(str, lVar));
    }

    public static final void o(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.g(), new a(str, aVar));
    }

    public static /* synthetic */ void o0(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        n0(vVar, str, lVar);
    }

    public static final void p(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.h(), new a(str, new a(aVar)));
    }

    public static final void p0(v vVar, long j10) {
        q.f4613a.E().d(vVar, f4655a[17], Q.b(j10));
    }

    public static /* synthetic */ void q(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p(vVar, str, aVar);
    }

    public static final void q0(v vVar, C1321d dVar) {
        q.f4613a.F().d(vVar, f4655a[14], dVar);
    }

    public static final void r(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.i(), new a(str, lVar));
    }

    public static final void r0(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.z(), new a(str, lVar));
    }

    public static /* synthetic */ void s(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(vVar, str, lVar);
    }

    public static /* synthetic */ void s0(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r0(vVar, str, lVar);
    }

    public static final void t(v vVar, C6798l lVar) {
        vVar.a(q.f4613a.m(), lVar);
    }

    public static final void t0(v vVar, boolean z10) {
        q.f4613a.s().d(vVar, f4655a[6], Boolean.valueOf(z10));
    }

    public static final void u(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.j(), new a(str, lVar));
    }

    public static final void u0(v vVar, float f10) {
        q.f4613a.H().d(vVar, f4655a[9], Float.valueOf(f10));
    }

    public static /* synthetic */ void v(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        u(vVar, str, lVar);
    }

    public static final void v0(v vVar, h hVar) {
        q.f4613a.I().d(vVar, f4655a[11], hVar);
    }

    public static final void w(v vVar) {
        vVar.a(q.f4613a.n(), C6514M.f71813a);
    }

    public static final void w0(v vVar, String str, C6798l lVar) {
        vVar.a(i.f4556a.A(), new a(str, lVar));
    }

    public static final void x(v vVar, String str, C6787a aVar) {
        vVar.a(i.f4556a.k(), new a(str, aVar));
    }

    public static /* synthetic */ void x0(v vVar, String str, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        w0(vVar, str, lVar);
    }

    public static /* synthetic */ void y(v vVar, String str, C6787a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        x(vVar, str, aVar);
    }

    public static final void z(v vVar, int i10, String str, C6787a aVar) {
        vVar.a(q.f4613a.l(), r.j(i10));
        vVar.a(i.f4556a.l(), new a(str, aVar));
    }
}
