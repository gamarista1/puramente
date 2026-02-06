package com.facebook.react.views.scroll;

import Sg.p;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import f8.C3519a;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f42037a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final String f42038b = f.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f42039c = false;

    /* renamed from: d  reason: collision with root package name */
    private static final CopyOnWriteArrayList f42040d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static final CopyOnWriteArrayList f42041e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private static int f42042f = 250;

    /* renamed from: g  reason: collision with root package name */
    private static boolean f42043g;

    public interface a {
        void c(int i10, int i11);

        ValueAnimator getFlingAnimator();
    }

    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j10);
    }

    public interface c {
        g getReactScrollViewScrollState();
    }

    public interface d {
        void a(int i10, int i11);

        void b(int i10, int i11);
    }

    public interface e {
        C3413g0 getStateWrapper();
    }

    private static final class f extends OverScroller {

        /* renamed from: a  reason: collision with root package name */
        private int f42044a = 250;

        public f(Context context) {
            super(context);
        }

        public final int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f42044a;
        }

        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            this.f42044a = i14;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final Point f42045a = new Point();

        /* renamed from: b  reason: collision with root package name */
        private int f42046b;

        /* renamed from: c  reason: collision with root package name */
        private final Point f42047c = new Point(-1, -1);

        /* renamed from: d  reason: collision with root package name */
        private boolean f42048d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f42049e = true;

        /* renamed from: f  reason: collision with root package name */
        private float f42050f = 0.985f;

        public final float a() {
            return this.f42050f;
        }

        public final Point b() {
            return this.f42045a;
        }

        public final Point c() {
            return this.f42047c;
        }

        public final int d() {
            return this.f42046b;
        }

        public final boolean e() {
            return this.f42048d;
        }

        public final boolean f() {
            return this.f42049e;
        }

        public final void g(boolean z10) {
            this.f42048d = z10;
        }

        public final void h(float f10) {
            this.f42050f = f10;
        }

        public final g i(int i10, int i11) {
            this.f42045a.set(i10, i11);
            return this;
        }

        public final void j(boolean z10) {
            this.f42049e = z10;
        }

        public final g k(int i10, int i11) {
            this.f42047c.set(i10, i11);
            return this;
        }

        public final void l(int i10) {
            this.f42046b = i10;
        }
    }

    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f42051a;

        h(ViewGroup viewGroup) {
            this.f42051a = viewGroup;
        }

        public void onAnimationCancel(Animator animator) {
            C6496s.h(animator, "animator");
            i.j(this.f42051a);
            animator.removeListener(this);
        }

        public void onAnimationEnd(Animator animator) {
            C6496s.h(animator, "animator");
            i.j(this.f42051a);
            animator.removeListener(this);
        }

        public void onAnimationRepeat(Animator animator) {
            C6496s.h(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C6496s.h(animator, "animator");
        }
    }

    /* renamed from: com.facebook.react.views.scroll.i$i  reason: collision with other inner class name */
    public static final class C0650i implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f42052a;

        C0650i(ViewGroup viewGroup) {
            this.f42052a = viewGroup;
        }

        public void onAnimationCancel(Animator animator) {
            C6496s.h(animator, "animator");
            ((c) this.f42052a).getReactScrollViewScrollState().g(true);
        }

        public void onAnimationEnd(Animator animator) {
            C6496s.h(animator, "animator");
            ((c) this.f42052a).getReactScrollViewScrollState().j(true);
            i.s(this.f42052a);
        }

        public void onAnimationRepeat(Animator animator) {
            C6496s.h(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C6496s.h(animator, "animator");
            g reactScrollViewScrollState = ((c) this.f42052a).getReactScrollViewScrollState();
            reactScrollViewScrollState.g(false);
            reactScrollViewScrollState.j(false);
        }
    }

    private i() {
    }

    public static final void a(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new h(viewGroup));
    }

    public static final void b(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "scrollView");
        Iterator it = f42041e.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            android.support.v4.media.session.c.a(((WeakReference) it.next()).get());
        }
    }

    public static final void c(ViewGroup viewGroup) {
        C6496s.h(viewGroup, "scrollView");
        Iterator it = f42040d.iterator();
        C6496s.g(it, "iterator(...)");
        while (it.hasNext()) {
            android.support.v4.media.session.c.a(((WeakReference) it.next()).get());
        }
    }

    public static final void d(ViewGroup viewGroup) {
        f42037a.g(viewGroup, k.BEGIN_DRAG);
    }

    public static final void e(ViewGroup viewGroup, float f10, float f11) {
        f42037a.h(viewGroup, k.END_DRAG, f10, f11);
    }

    public static final void f(ViewGroup viewGroup, float f10, float f11) {
        f42037a.h(viewGroup, k.SCROLL, f10, f11);
    }

    private final void g(ViewGroup viewGroup, k kVar) {
        h(viewGroup, kVar, 0.0f, 0.0f);
    }

    private final void h(ViewGroup viewGroup, k kVar, float f10, float f11) {
        View childAt;
        ViewGroup viewGroup2 = viewGroup;
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = (b) viewGroup2;
        if (((long) bVar.getScrollEventThrottle()) < Math.max(17, currentTimeMillis - bVar.getLastScrollDispatchTime()) && (childAt = viewGroup2.getChildAt(0)) != null) {
            Iterator it = f42040d.iterator();
            C6496s.g(it, "iterator(...)");
            while (it.hasNext()) {
                android.support.v4.media.session.c.a(((WeakReference) it.next()).get());
            }
            Context context = viewGroup.getContext();
            C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int e10 = n0.e(reactContext);
            EventDispatcher c10 = n0.c(reactContext, viewGroup.getId());
            if (c10 != null) {
                c10.h(j.f42053k.a(e10, viewGroup.getId(), kVar, (float) viewGroup.getScrollX(), (float) viewGroup.getScrollY(), f10, f11, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
                ((b) viewGroup2).setLastScrollDispatchTime(currentTimeMillis);
            }
        }
    }

    public static final void i(ViewGroup viewGroup, int i10, int i11) {
        f42037a.h(viewGroup, k.MOMENTUM_BEGIN, (float) i10, (float) i11);
    }

    public static final void j(ViewGroup viewGroup) {
        f42037a.g(viewGroup, k.MOMENTUM_END);
    }

    public static final void k(ViewGroup viewGroup) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        int d10 = reactScrollViewScrollState.d();
        Point c10 = reactScrollViewScrollState.c();
        int i10 = c10.x;
        int i11 = c10.y;
        if (f42039c) {
            U5.a.u(f42038b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        C3413g0 stateWrapper = ((e) viewGroup).getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", (double) G.f((float) i10));
            writableNativeMap.putDouble("contentOffsetTop", (double) G.f((float) i11));
            writableNativeMap.putDouble("scrollAwayPaddingTop", (double) G.f((float) d10));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int l(Context context) {
        if (!f42043g) {
            f42043g = true;
            try {
                f42042f = new f(context).a();
            } catch (Throwable unused) {
            }
        }
        return f42042f;
    }

    public static final int m(ViewGroup viewGroup, int i10, int i11, int i12) {
        int i13;
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        boolean z10 = false;
        if (i12 != 0) {
            i13 = i12 / Math.abs(i12);
        } else {
            i13 = 0;
        }
        if (i13 * (i11 - i10) > 0) {
            z10 = true;
        }
        if (!reactScrollViewScrollState.f() || (reactScrollViewScrollState.e() && z10)) {
            return i11;
        }
        return i10;
    }

    public static final int n(String str) {
        if (str == null) {
            return 1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 3005871) {
                if (hashCode == 104712844 && str.equals("never")) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals("always")) {
            return 0;
        }
        U5.a.I("ReactNative", "wrong overScrollMode: " + str);
        return 1;
    }

    public static final int o(String str) {
        if (str == null) {
            return 0;
        }
        if (p.v(OpsMetricTracker.START, str, true)) {
            return 1;
        }
        if (p.v("center", str, true)) {
            return 2;
        }
        if (C6496s.c("end", str)) {
            return 3;
        }
        U5.a.I("ReactNative", "wrong snap alignment value: " + str);
        return 0;
    }

    public static final Point p(ViewGroup viewGroup, int i10, int i11, int i12, int i13) {
        g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(viewGroup.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        int height = (viewGroup.getHeight() - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop();
        Point b10 = reactScrollViewScrollState.b();
        int i14 = i10;
        overScroller.fling(m(viewGroup, viewGroup.getScrollX(), b10.x, i10), m(viewGroup, viewGroup.getScrollY(), b10.y, i11), i10, i11, 0, i12, 0, i13, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static final void r(ViewGroup viewGroup, int i10, int i11) {
        if (f42039c) {
            U5.a.u(f42038b, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        a aVar = (a) viewGroup;
        ValueAnimator flingAnimator = aVar.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            f42037a.q(viewGroup);
        }
        ((c) viewGroup).getReactScrollViewScrollState().i(i10, i11);
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        if (scrollX != i10) {
            aVar.c(scrollX, i10);
        }
        if (scrollY != i11) {
            aVar.c(scrollY, i11);
        }
    }

    public static final void s(ViewGroup viewGroup) {
        f42037a.t(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
    }

    public static final void u(ViewGroup viewGroup, float f10, float f11) {
        f42037a.t(viewGroup, viewGroup.getScrollX(), viewGroup.getScrollY());
        f(viewGroup, f10, f11);
    }

    public final void q(ViewGroup viewGroup) {
        ((a) viewGroup).getFlingAnimator().addListener(new C0650i(viewGroup));
    }

    public final void t(ViewGroup viewGroup, int i10, int i11) {
        if (f42039c) {
            U5.a.u(f42038b, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(viewGroup.getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (C3519a.a(viewGroup.getId()) != 1) {
            g reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
            if (!reactScrollViewScrollState.c().equals(i10, i11)) {
                reactScrollViewScrollState.k(i10, i11);
                k(viewGroup);
            }
        }
    }
}
