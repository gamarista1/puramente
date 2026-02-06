package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import sf.C6714a;
import yd.C5295b;
import yd.e;
import yd.f;
import yd.g;
import yd.h;
import yd.i;
import yd.j;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0011\b\u0016\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0003\u0015F:B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0004J\u001f\u0010)\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u0017\u00108\u001a\u00020\b2\u0006\u00107\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u00109R(\u0010@\u001a\u00020\u00058\u0016@\u0016X.¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b?\u0010\u0004\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u0007R \u0010E\u001a\b\u0012\u0004\u0012\u00020+0A8\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bI\u0010\"R\u0016\u0010L\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010GR\u0016\u0010N\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010GR\u0016\u0010O\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010GR\u0014\u0010Q\u001a\u00020\u00018VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010P¨\u0006R"}, d2 = {"Lcom/swmansion/rnscreens/y;", "Landroidx/fragment/app/q;", "Lcom/swmansion/rnscreens/z;", "<init>", "()V", "Lcom/swmansion/rnscreens/r;", "screenView", "(Lcom/swmansion/rnscreens/r;)V", "Llf/M;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "l", "Landroid/app/Activity;", "b", "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "q", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/y$b;", "event", "", "D", "(Lcom/swmansion/rnscreens/y$b;)Z", "o", "(Lcom/swmansion/rnscreens/y$b;)V", "fragmentWrapper", "F", "(Lcom/swmansion/rnscreens/y$b;Lcom/swmansion/rnscreens/z;)V", "h", "E", "", "alpha", "closing", "K", "(FZ)V", "Lcom/swmansion/rnscreens/t;", "k", "(Lcom/swmansion/rnscreens/t;)V", "m", "O", "N", "onDestroy", "Q", "I", "G", "J", "H", "animationEnd", "L", "(Z)V", "a", "Lcom/swmansion/rnscreens/r;", "g", "()Lcom/swmansion/rnscreens/r;", "P", "getScreen$annotations", "screen", "", "Ljava/util/List;", "j", "()Ljava/util/List;", "childScreenContainers", "c", "Z", "shouldUpdateOnResume", "d", "transitionProgress", "e", "canDispatchWillAppear", "f", "canDispatchAppear", "isTransitioning", "()Landroidx/fragment/app/q;", "fragment", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.swmansion.rnscreens.y  reason: case insensitive filesystem */
public class C4940y extends C1769q implements z {

    /* renamed from: h  reason: collision with root package name */
    public static final a f59945h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public r f59946a;

    /* renamed from: b  reason: collision with root package name */
    private final List f59947b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f59948c;

    /* renamed from: d  reason: collision with root package name */
    private float f59949d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59950e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f59951f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f59952g;

    /* renamed from: com.swmansion.rnscreens.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            return (short) (f10 == 0.0f ? 1 : f10 == 1.0f ? 2 : 3);
        }

        private a() {
        }
    }

    /* renamed from: com.swmansion.rnscreens.y$b */
    public enum b {
        DID_APPEAR,
        WILL_APPEAR,
        DID_DISAPPEAR,
        WILL_DISAPPEAR;

        static {
            b[] a10;
            f59958f = C6714a.a(a10);
        }
    }

    /* renamed from: com.swmansion.rnscreens.y$c */
    private static final class c extends FrameLayout {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            C6496s.h(context, "context");
        }

        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    /* renamed from: com.swmansion.rnscreens.y$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59959a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.swmansion.rnscreens.y$b[] r0 = com.swmansion.rnscreens.C4940y.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.swmansion.rnscreens.y$b r1 = com.swmansion.rnscreens.C4940y.b.WILL_APPEAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.swmansion.rnscreens.y$b r1 = com.swmansion.rnscreens.C4940y.b.DID_APPEAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.swmansion.rnscreens.y$b r1 = com.swmansion.rnscreens.C4940y.b.WILL_DISAPPEAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.swmansion.rnscreens.y$b r1 = com.swmansion.rnscreens.C4940y.b.DID_DISAPPEAR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f59959a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C4940y.d.<clinit>():void");
        }
    }

    public C4940y() {
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void G() {
        F(b.DID_APPEAR, this);
        K(1.0f, false);
    }

    private final void H() {
        F(b.DID_DISAPPEAR, this);
        K(1.0f, true);
    }

    private final void I() {
        F(b.WILL_APPEAR, this);
        K(0.0f, false);
    }

    private final void J() {
        F(b.WILL_DISAPPEAR, this);
        K(0.0f, true);
    }

    private final void L(boolean z10) {
        C1769q qVar;
        this.f59952g = !z10;
        if (getParentFragment() instanceof xd.d) {
            C1769q parentFragment = getParentFragment();
            if (parentFragment != null) {
                qVar = parentFragment.getParentFragment();
            } else {
                qVar = null;
            }
        } else {
            qVar = getParentFragment();
        }
        if (qVar != null && (!(qVar instanceof C4940y) || ((C4940y) qVar).f59952g)) {
            return;
        }
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new C4939x(z10, this));
        } else if (z10) {
            H();
        } else {
            J();
        }
    }

    /* access modifiers changed from: private */
    public static final void M(boolean z10, C4940y yVar) {
        if (z10) {
            yVar.G();
        } else {
            yVar.I();
        }
    }

    private final void Q() {
        C1773v activity = getActivity();
        if (activity == null) {
            this.f59948c = true;
        } else {
            O.f59726a.x(g(), activity, q());
        }
    }

    public boolean D(b bVar) {
        C6496s.h(bVar, "event");
        int i10 = d.f59959a[bVar.ordinal()];
        if (i10 == 1) {
            return this.f59950e;
        }
        if (i10 == 2) {
            return this.f59951f;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                throw new C6535s();
            } else if (!this.f59951f) {
                return true;
            }
        } else if (!this.f59950e) {
            return true;
        }
        return false;
    }

    public void E() {
        Context context = g().getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int e10 = n0.e(reactContext);
        EventDispatcher c10 = n0.c(reactContext, g().getId());
        if (c10 != null) {
            c10.h(new C5295b(e10, g().getId()));
        }
    }

    public void F(b bVar, z zVar) {
        com.facebook.react.uimanager.events.d dVar;
        C6496s.h(bVar, "event");
        C6496s.h(zVar, "fragmentWrapper");
        C1769q c10 = zVar.c();
        if (c10 instanceof E) {
            E e10 = (E) c10;
            if (e10.D(bVar)) {
                r g10 = e10.g();
                zVar.o(bVar);
                int f10 = n0.f(g10);
                int i10 = d.f59959a[bVar.ordinal()];
                if (i10 == 1) {
                    dVar = new i(f10, g10.getId());
                } else if (i10 == 2) {
                    dVar = new e(f10, g10.getId());
                } else if (i10 == 3) {
                    dVar = new j(f10, g10.getId());
                } else if (i10 == 4) {
                    dVar = new f(f10, g10.getId());
                } else {
                    throw new C6535s();
                }
                Context context = g().getContext();
                C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher c11 = n0.c((ReactContext) context, g().getId());
                if (c11 != null) {
                    c11.h(dVar);
                }
                zVar.h(bVar);
            }
        }
    }

    public void K(float f10, boolean z10) {
        boolean z11;
        if ((this instanceof E) && this.f59949d != f10) {
            float max = Math.max(0.0f, Math.min(1.0f, f10));
            this.f59949d = max;
            short a10 = f59945h.a(max);
            E e10 = (E) this;
            C4935t container = e10.g().getContainer();
            if (container instanceof B) {
                z11 = ((B) container).getGoingForward();
            } else {
                z11 = false;
            }
            boolean z12 = z11;
            Context context = e10.g().getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            EventDispatcher c10 = n0.c(reactContext, e10.g().getId());
            if (c10 != null) {
                c10.h(new h(n0.e(reactContext), e10.g().getId(), this.f59949d, z10, z12, a10));
            }
        }
    }

    public void N() {
        L(true);
    }

    public void O() {
        L(false);
    }

    public void P(r rVar) {
        C6496s.h(rVar, "<set-?>");
        this.f59946a = rVar;
    }

    public Activity b() {
        C1769q fragment;
        C1773v activity;
        C1773v activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = g().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = g().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof r) && (fragment = ((r) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    public C1769q c() {
        return this;
    }

    public r g() {
        r rVar = this.f59946a;
        if (rVar != null) {
            return rVar;
        }
        C6496s.v("screen");
        return null;
    }

    public void h(b bVar) {
        z fragmentWrapper;
        C6496s.h(bVar, "event");
        ArrayList<C4935t> arrayList = new ArrayList<>();
        for (Object next : j()) {
            if (((C4935t) next).getScreenCount() > 0) {
                arrayList.add(next);
            }
        }
        for (C4935t topScreen : arrayList) {
            r topScreen2 = topScreen.getTopScreen();
            if (!(topScreen2 == null || (fragmentWrapper = topScreen2.getFragmentWrapper()) == null)) {
                F(bVar, fragmentWrapper);
            }
        }
    }

    public List j() {
        return this.f59947b;
    }

    public void k(C4935t tVar) {
        C6496s.h(tVar, "container");
        j().add(tVar);
    }

    public void l() {
        Q();
    }

    public void m(C4935t tVar) {
        C6496s.h(tVar, "container");
        j().remove(tVar);
    }

    public void o(b bVar) {
        C6496s.h(bVar, "event");
        int i10 = d.f59959a[bVar.ordinal()];
        if (i10 == 1) {
            this.f59950e = false;
        } else if (i10 == 2) {
            this.f59951f = false;
        } else if (i10 == 3) {
            this.f59950e = true;
        } else if (i10 == 4) {
            this.f59951f = true;
        } else {
            throw new C6535s();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6496s.h(layoutInflater, "inflater");
        g().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(zd.b.b(g()));
        return cVar;
    }

    public void onDestroy() {
        super.onDestroy();
        C4935t container = g().getContainer();
        if (container == null || !container.n(g().getFragmentWrapper())) {
            Context context = g().getContext();
            if (context instanceof ReactContext) {
                int e10 = n0.e(context);
                EventDispatcher c10 = n0.c((ReactContext) context, g().getId());
                if (c10 != null) {
                    c10.h(new g(e10, g().getId()));
                }
            }
        }
        j().clear();
    }

    public void onResume() {
        super.onResume();
        if (this.f59948c) {
            this.f59948c = false;
            O.f59726a.x(g(), b(), q());
        }
    }

    public ReactContext q() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else if (g().getContext() instanceof ReactContext) {
            Context context2 = g().getContext();
            C6496s.f(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        } else {
            for (ViewParent container = g().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof r) {
                    r rVar = (r) container;
                    if (rVar.getContext() instanceof ReactContext) {
                        Context context3 = rVar.getContext();
                        C6496s.f(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context3;
                    }
                }
            }
            return null;
        }
    }

    public C4940y(r rVar) {
        C6496s.h(rVar, "screenView");
        P(rVar);
    }
}
