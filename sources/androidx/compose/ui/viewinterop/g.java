package androidx.compose.ui.viewinterop;

import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.m0;
import a0.C1538b;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.focus.s;
import k0.i;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import p0.h;
import p0.q;
import yf.C6798l;

final class g extends i.c implements h, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: n  reason: collision with root package name */
    private View f14194n;

    /* synthetic */ class a extends C6494p implements C6798l {
        a(Object obj) {
            super(1, obj, g.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o i(int i10) {
            return ((g) this.receiver).m2(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return i(((d) obj).o());
        }
    }

    /* synthetic */ class b extends C6494p implements C6798l {
        b(Object obj) {
            super(1, obj, g.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final o i(int i10) {
            return ((g) this.receiver).n2(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return i(((d) obj).o());
        }
    }

    private final FocusTargetNode l2() {
        int a10 = C1239e0.a(1024);
        if (!v0().S1()) {
            G0.a.b("visitLocalDescendants called on an unattached node");
        }
        i.c v02 = v0();
        if ((v02.I1() & a10) != 0) {
            boolean z10 = false;
            for (i.c J12 = v02.J1(); J12 != null; J12 = J12.J1()) {
                if ((J12.N1() & a10) != 0) {
                    i.c cVar = J12;
                    C1538b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                            int i10 = 0;
                            for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                if ((m22.N1() & a10) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVar = m22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new C1538b(new i.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(m22);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVar = C1245k.g(bVar);
                    }
                    continue;
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    public void V1() {
        super.V1();
        f.g(this).addOnAttachStateChangeListener(this);
    }

    public void W1() {
        f.g(this).removeOnAttachStateChangeListener(this);
        this.f14194n = null;
        super.W1();
    }

    public void b1(k kVar) {
        kVar.h(false);
        kVar.m(new a(this));
        kVar.f(new b(this));
    }

    public final o m2(int i10) {
        View c10 = f.g(this);
        if (c10.isFocused() || c10.hasFocus()) {
            return o.f13345b.b();
        }
        p0.g focusOwner = C1245k.n(this).getFocusOwner();
        m0 n10 = C1245k.n(this);
        C6496s.f(n10, "null cannot be cast to non-null type android.view.View");
        if (androidx.compose.ui.focus.h.b(c10, androidx.compose.ui.focus.h.c(i10), f.f(focusOwner, (View) n10, c10))) {
            return o.f13345b.b();
        }
        return o.f13345b.a();
    }

    public final o n2(int i10) {
        int i11;
        View view;
        View c10 = f.g(this);
        if (!c10.hasFocus()) {
            return o.f13345b.b();
        }
        p0.g focusOwner = C1245k.n(this).getFocusOwner();
        m0 n10 = C1245k.n(this);
        C6496s.f(n10, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) n10;
        if (c10 instanceof ViewGroup) {
            Rect b10 = f.f(focusOwner, view2, c10);
            Integer c11 = androidx.compose.ui.focus.h.c(i10);
            if (c11 != null) {
                i11 = c11.intValue();
            } else {
                i11 = 130;
            }
            FocusFinder instance = FocusFinder.getInstance();
            View view3 = this.f14194n;
            if (view3 != null) {
                view = instance.findNextFocus((ViewGroup) view2, view3, i11);
            } else {
                view = instance.findNextFocusFromRect((ViewGroup) view2, b10, i11);
            }
            if (view != null && f.d(c10, view)) {
                view.requestFocus(i11, b10);
                return o.f13345b.a();
            } else if (view2.requestFocus()) {
                return o.f13345b.b();
            } else {
                throw new IllegalStateException("host view did not take focus");
            }
        } else if (view2.requestFocus()) {
            return o.f13345b.b();
        } else {
            throw new IllegalStateException("host view did not take focus");
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        boolean z11;
        if (C1245k.m(this).m0() != null) {
            View c10 = f.g(this);
            p0.g focusOwner = C1245k.n(this).getFocusOwner();
            m0 n10 = C1245k.n(this);
            if (view == null || C6496s.c(view, n10) || !f.d(c10, view)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (view2 == null || C6496s.c(view2, n10) || !f.d(c10, view2)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z10 && z11) {
                this.f14194n = view2;
            } else if (z11) {
                this.f14194n = view2;
                FocusTargetNode l22 = l2();
                if (!l22.s2().b()) {
                    q d10 = focusOwner.d();
                    try {
                        if (d10.f25116c) {
                            d10.g();
                        }
                        d10.f();
                        s.i(l22);
                        d10.h();
                    } catch (Throwable th2) {
                        d10.h();
                        throw th2;
                    }
                }
            } else if (z10) {
                this.f14194n = null;
                if (l2().s2().a()) {
                    focusOwner.l(false, true, false, d.f13315b.c());
                }
            } else {
                this.f14194n = null;
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
