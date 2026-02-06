package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import androidx.fragment.app.T;
import com.facebook.react.Z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.swmansion.rnscreens.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yd.g;

/* renamed from: com.swmansion.rnscreens.t  reason: case insensitive filesystem */
public class C4935t extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final ArrayList f59905a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected J f59906b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f59907c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59908d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f59909e;

    /* renamed from: f  reason: collision with root package name */
    private final U7.a f59910f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    private z f59911g;

    /* renamed from: com.swmansion.rnscreens.t$a */
    public static final class a extends U7.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4935t f59912a;

        a(C4935t tVar) {
            this.f59912a = tVar;
        }

        public void doFrame(long j10) {
            this.f59912a.f59909e = false;
            C4935t tVar = this.f59912a;
            tVar.measure(View.MeasureSpec.makeMeasureSpec(tVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f59912a.getHeight(), 1073741824));
            C4935t tVar2 = this.f59912a;
            tVar2.layout(tVar2.getLeft(), this.f59912a.getTop(), this.f59912a.getRight(), this.f59912a.getBottom());
        }
    }

    public C4935t(Context context) {
        super(context);
    }

    private final void f(T t10, C1769q qVar) {
        t10.b(getId(), qVar);
    }

    private final void i(T t10, C1769q qVar) {
        t10.o(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.fragment.app.J j(com.facebook.react.Z r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof androidx.fragment.app.C1773v
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x003b
            androidx.fragment.app.v r0 = (androidx.fragment.app.C1773v) r0
            androidx.fragment.app.J r1 = r0.getSupportFragmentManager()
            java.util.List r1 = r1.x0()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002d
            androidx.fragment.app.J r4 = r0.getSupportFragmentManager()
            kotlin.jvm.internal.C6496s.e(r4)
            goto L_0x003a
        L_0x002d:
            androidx.fragment.app.q r4 = androidx.fragment.app.J.j0(r4)     // Catch:{ IllegalStateException -> 0x0036 }
            androidx.fragment.app.J r4 = r4.getChildFragmentManager()     // Catch:{ IllegalStateException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            androidx.fragment.app.J r4 = r0.getSupportFragmentManager()
        L_0x003a:
            return r4
        L_0x003b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "In order to use RNScreens components your app's activity need to extend ReactActivity"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C4935t.j(com.facebook.react.Z):androidx.fragment.app.J");
    }

    private final r.a k(z zVar) {
        return zVar.g().getActivityState();
    }

    private final void r() {
        this.f59908d = true;
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C3415h0) context).b().runOnUiQueueThread(new C4934s(this));
    }

    /* access modifiers changed from: private */
    public static final void s(C4935t tVar) {
        tVar.u();
    }

    private final void setFragmentManager(J j10) {
        this.f59906b = j10;
        v();
    }

    private final void x(J j10) {
        T p10 = j10.p();
        C6496s.g(p10, "beginTransaction(...)");
        boolean z10 = false;
        for (C1769q qVar : j10.x0()) {
            if ((qVar instanceof C4940y) && ((C4940y) qVar).g().getContainer() == this) {
                p10.o(qVar);
                z10 = true;
            }
        }
        if (z10) {
            p10.k();
        }
    }

    private final void z() {
        boolean z10;
        C6514M m10;
        ViewParent viewParent = this;
        while (true) {
            z10 = viewParent instanceof Z;
            if (!z10 && !(viewParent instanceof r) && viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
            }
        }
        if (viewParent instanceof r) {
            z fragmentWrapper = ((r) viewParent).getFragmentWrapper();
            if (fragmentWrapper != null) {
                this.f59911g = fragmentWrapper;
                fragmentWrapper.k(this);
                J childFragmentManager = fragmentWrapper.c().getChildFragmentManager();
                C6496s.g(childFragmentManager, "getChildFragmentManager(...)");
                setFragmentManager(childFragmentManager);
                m10 = C6514M.f71813a;
            } else {
                m10 = null;
            }
            if (m10 == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached");
            }
        } else if (z10) {
            setFragmentManager(j((Z) viewParent));
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView");
        }
    }

    /* access modifiers changed from: protected */
    public z c(r rVar) {
        C6496s.h(rVar, "screen");
        return new C4940y(rVar);
    }

    public final void d(r rVar, int i10) {
        C6496s.h(rVar, "screen");
        z c10 = c(rVar);
        rVar.setFragmentWrapper(c10);
        this.f59905a.add(i10, c10);
        rVar.setContainer(this);
        r();
    }

    public final void e() {
        if (this.f59905a.size() >= 2) {
            T g10 = g();
            r topScreen = getTopScreen();
            C6496s.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
            C1769q fragment = topScreen.getFragment();
            C6496s.f(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            i(g10, fragment);
            ArrayList arrayList = this.f59905a;
            f(g10, ((z) arrayList.get(arrayList.size() - 2)).c());
            C1769q fragment2 = topScreen.getFragment();
            C6496s.f(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            f(g10, fragment2);
            g10.k();
            return;
        }
        throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
    }

    /* access modifiers changed from: protected */
    public final T g() {
        J j10 = this.f59906b;
        if (j10 != null) {
            T w10 = j10.p().w(true);
            C6496s.g(w10, "setReorderingAllowed(...)");
            return w10;
        }
        throw new IllegalArgumentException("fragment manager is null when creating transaction");
    }

    public final int getScreenCount() {
        return this.f59905a.size();
    }

    public r getTopScreen() {
        Object obj;
        Iterator it = this.f59905a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k((z) obj) == r.a.ON_TOP) {
                break;
            }
        }
        z zVar = (z) obj;
        if (zVar != null) {
            return zVar.g();
        }
        return null;
    }

    public final void h() {
        if (this.f59905a.size() >= 2) {
            T g10 = g();
            ArrayList arrayList = this.f59905a;
            i(g10, ((z) arrayList.get(arrayList.size() - 2)).c());
            g10.k();
            return;
        }
        throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
    }

    public final r l(int i10) {
        return ((z) this.f59905a.get(i10)).g();
    }

    public final z m(int i10) {
        Object obj = this.f59905a.get(i10);
        C6496s.g(obj, "get(...)");
        return (z) obj;
    }

    public boolean n(z zVar) {
        return C6565s.e0(this.f59905a, zVar);
    }

    public final void o() {
        v();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59907c = true;
        z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        J j10 = this.f59906b;
        if (j10 != null && !j10.K0()) {
            x(j10);
            j10.g0();
        }
        z zVar = this.f59911g;
        if (zVar != null) {
            zVar.m(this);
        }
        this.f59911g = null;
        super.onDetachedFromWindow();
        this.f59907c = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(childCount);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14).layout(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(i10, i11);
        }
    }

    /* access modifiers changed from: protected */
    public void p() {
        z fragmentWrapper;
        r topScreen = getTopScreen();
        if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
            fragmentWrapper.l();
        }
    }

    public final void q() {
        r topScreen = getTopScreen();
        C6496s.f(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int e10 = n0.e(getContext());
            Context context = getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher c10 = n0.c((ReactContext) context, topScreen.getId());
            if (c10 != null) {
                c10.h(new g(e10, topScreen.getId()));
            }
        }
    }

    public void removeView(View view) {
        C6496s.h(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            C6496s.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        if (!this.f59909e && this.f59910f != null) {
            this.f59909e = true;
            b.f40995f.a().k(b.a.NATIVE_ANIMATED_MODULE, this.f59910f);
        }
    }

    public void t() {
        boolean z10;
        T g10 = g();
        J j10 = this.f59906b;
        if (j10 != null) {
            HashSet hashSet = new HashSet(j10.x0());
            Iterator it = this.f59905a.iterator();
            C6496s.g(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                C6496s.g(next, "next(...)");
                z zVar = (z) next;
                if (k(zVar) == r.a.INACTIVE && zVar.c().isAdded()) {
                    i(g10, zVar.c());
                }
                hashSet.remove(zVar.c());
            }
            boolean z11 = false;
            if (!hashSet.isEmpty()) {
                for (C1769q qVar : (C1769q[]) hashSet.toArray(new C1769q[0])) {
                    if ((qVar instanceof C4940y) && ((C4940y) qVar).g().getContainer() == null) {
                        i(g10, qVar);
                    }
                }
            }
            if (getTopScreen() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f59905a.iterator();
            C6496s.g(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C6496s.g(next2, "next(...)");
                z zVar2 = (z) next2;
                r.a k10 = k(zVar2);
                r.a aVar = r.a.INACTIVE;
                if (k10 != aVar && !zVar2.c().isAdded()) {
                    f(g10, zVar2.c());
                    z11 = true;
                } else if (k10 != aVar && z11) {
                    i(g10, zVar2.c());
                    arrayList.add(zVar2);
                }
                zVar2.g().setTransitioning(z10);
            }
            Iterator it3 = arrayList.iterator();
            C6496s.g(it3, "iterator(...)");
            while (it3.hasNext()) {
                Object next3 = it3.next();
                C6496s.g(next3, "next(...)");
                f(g10, ((z) next3).c());
            }
            g10.k();
            return;
        }
        throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer");
    }

    public final void u() {
        J j10;
        if (this.f59908d && this.f59907c && (j10 = this.f59906b) != null) {
            if (j10 == null || !j10.K0()) {
                this.f59908d = false;
                t();
                p();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void v() {
        this.f59908d = true;
        u();
    }

    public void w() {
        Iterator it = this.f59905a.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C6496s.g(next, "next(...)");
            ((z) next).g().setContainer((C4935t) null);
        }
        this.f59905a.clear();
        r();
    }

    public void y(int i10) {
        ((z) this.f59905a.get(i10)).g().setContainer((C4935t) null);
        this.f59905a.remove(i10);
        r();
    }
}
