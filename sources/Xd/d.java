package xd;

import Ef.m;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.D0;
import androidx.core.view.I;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.J;
import androidx.fragment.app.T;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.B;
import com.swmansion.rnscreens.C4925i;
import com.swmansion.rnscreens.C4926j;
import com.swmansion.rnscreens.C4927k;
import com.swmansion.rnscreens.C4928l;
import com.swmansion.rnscreens.C4929m;
import com.swmansion.rnscreens.C4930n;
import com.swmansion.rnscreens.C4931o;
import com.swmansion.rnscreens.C4935t;
import com.swmansion.rnscreens.C4940y;
import com.swmansion.rnscreens.E;
import com.swmansion.rnscreens.F;
import com.swmansion.rnscreens.r;
import com.swmansion.rnscreens.z;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.t;
import p1.C2388d;
import yd.g;

public final class d extends C1769q implements C1795s, F, Animation.AnimationListener, I, C4930n {

    /* renamed from: j  reason: collision with root package name */
    public static final b f62235j = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final z f62236a;

    /* renamed from: b  reason: collision with root package name */
    private e f62237b;

    /* renamed from: c  reason: collision with root package name */
    private f f62238c;

    /* renamed from: d  reason: collision with root package name */
    private final float f62239d = 0.15f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f62240e;

    /* renamed from: f  reason: collision with root package name */
    private C4928l f62241f = C4927k.f59804a;

    /* renamed from: g  reason: collision with root package name */
    private BottomSheetBehavior.f f62242g;

    /* renamed from: h  reason: collision with root package name */
    private final C4925i f62243h = C4925i.f59797a;

    /* renamed from: i  reason: collision with root package name */
    private final List f62244i;

    private static final class a extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        private final r f62245a;

        /* renamed from: b  reason: collision with root package name */
        private final View f62246b;

        /* renamed from: c  reason: collision with root package name */
        private final float f62247c;

        /* renamed from: d  reason: collision with root package name */
        private float f62248d;

        /* renamed from: e  reason: collision with root package name */
        private float f62249e;

        /* renamed from: f  reason: collision with root package name */
        private float f62250f;

        /* renamed from: g  reason: collision with root package name */
        private final ValueAnimator f62251g;

        public a(r rVar, View view, float f10) {
            C6496s.h(rVar, "screen");
            C6496s.h(view, "viewToAnimate");
            this.f62245a = rVar;
            this.f62246b = view;
            this.f62247c = f10;
            this.f62248d = f(rVar.getSheetLargestUndimmedDetentIndex());
            float f11 = f(m.l(rVar.getSheetLargestUndimmedDetentIndex() + 1, 0, rVar.getSheetDetents().size() - 1));
            this.f62249e = f11;
            this.f62250f = f11 - this.f62248d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, f10});
            ofFloat.setDuration(1);
            ofFloat.addUpdateListener(new C5282c(this));
            this.f62251g = ofFloat;
        }

        /* access modifiers changed from: private */
        public static final void e(a aVar, ValueAnimator valueAnimator) {
            C6496s.h(valueAnimator, "it");
            View view = aVar.f62246b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C6496s.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        private final float f(int i10) {
            int size = this.f62245a.getSheetDetents().size();
            if (size != 1) {
                if (size != 2) {
                    if (size == 3 && i10 != -1) {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                BottomSheetBehavior<r> sheetBehavior = this.f62245a.getSheetBehavior();
                                C6496s.e(sheetBehavior);
                                return sheetBehavior.h0();
                            } else if (i10 == 2) {
                                return 1.0f;
                            }
                        }
                    }
                } else if (i10 != -1) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            return 1.0f;
                        }
                    }
                }
                return 0.0f;
            } else if (i10 != -1 && i10 == 0) {
                return 1.0f;
            }
            return -1.0f;
        }

        public void b(View view, float f10) {
            C6496s.h(view, "bottomSheet");
            float f11 = this.f62248d;
            if (f11 < f10 && f10 < this.f62249e) {
                this.f62251g.setCurrentFraction((f10 - f11) / this.f62250f);
            }
        }

        public void c(View view, int i10) {
            C6496s.h(view, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f62248d = f(this.f62245a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(m.l(this.f62245a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f62245a.getSheetDetents().size() - 1));
                this.f62249e = f10;
                this.f62250f = f10 - this.f62248d;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62252a;

        static {
            int[] iArr = new int[C1790m.a.values().length];
            try {
                iArr[C1790m.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f62252a = iArr;
        }
    }

    public d(z zVar) {
        C6496s.h(zVar, "nestedFragment");
        this.f62236a = zVar;
        boolean z10 = zVar.c() instanceof E;
        C1769q c10 = zVar.c();
        C6496s.f(c10, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
        E e10 = (E) c10;
        e10.getLifecycle().a(this);
        e10.d0(this);
        this.f62244i = zVar.j();
    }

    private final void D() {
        BottomSheetBehavior<r> sheetBehavior;
        BottomSheetBehavior.f fVar = this.f62242g;
        if (!(fVar == null || (sheetBehavior = this.f62236a.g().getSheetBehavior()) == null)) {
            sheetBehavior.q0(fVar);
        }
        e eVar = this.f62237b;
        if (eVar == null) {
            C6496s.v("dimmingView");
            eVar = null;
        }
        eVar.setOnClickListener((View.OnClickListener) null);
        this.f62236a.c().getLifecycle().d(this);
        this.f62243h.f(this);
    }

    private final void F(boolean z10) {
        if (!isRemoving()) {
            if (z10) {
                ReactContext reactContext = this.f62236a.g().getReactContext();
                int e10 = n0.e(reactContext);
                EventDispatcher c10 = n0.c(reactContext, g().getId());
                if (c10 != null) {
                    c10.h(new g(e10, g().getId()));
                }
            }
            D();
            E();
        }
    }

    private final B G() {
        C4935t container = g().getContainer();
        if (container instanceof B) {
            return (B) container;
        }
        return null;
    }

    private final void H() {
        Context requireContext = requireContext();
        C6496s.g(requireContext, "requireContext(...)");
        f fVar = new f(requireContext);
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fVar.setBackgroundColor(0);
        fVar.setId(View.generateViewId());
        this.f62238c = fVar;
    }

    private final void I() {
        Context requireContext = requireContext();
        C6496s.g(requireContext, "requireContext(...)");
        e eVar = new e(requireContext, this.f62239d);
        eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        eVar.setOnClickListener(new C5281b(this));
        this.f62237b = eVar;
    }

    /* access modifiers changed from: private */
    public static final void J(d dVar, View view) {
        if (dVar.g().getSheetClosesOnTouchOutside()) {
            dVar.F(true);
        }
    }

    private final void K() {
        H();
        I();
        f fVar = this.f62238c;
        e eVar = null;
        if (fVar == null) {
            C6496s.v("containerView");
            fVar = null;
        }
        e eVar2 = this.f62237b;
        if (eVar2 == null) {
            C6496s.v("dimmingView");
        } else {
            eVar = eVar2;
        }
        fVar.addView(eVar);
    }

    private final void L() {
        J childFragmentManager = getChildFragmentManager();
        C6496s.g(childFragmentManager, "getChildFragmentManager(...)");
        T p10 = childFragmentManager.p();
        C6496s.g(p10, "beginTransaction()");
        p10.w(true);
        p10.c(requireView().getId(), this.f62236a.c(), (String) null);
        p10.i();
    }

    private final View M() {
        Activity currentActivity = g().getReactContext().getCurrentActivity();
        if (currentActivity != null) {
            View decorView = currentActivity.getWindow().getDecorView();
            C6496s.g(decorView, "getDecorView(...)");
            return decorView;
        }
        throw new IllegalStateException("[RNScreens] Attempt to access activity on detached context");
    }

    public void E() {
        B G10 = G();
        if (G10 != null) {
            G10.D(this);
        }
    }

    public Activity b() {
        return getActivity();
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        BottomSheetBehavior<r> sheetBehavior;
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        if (c.f62252a[aVar.ordinal()] == 1 && (sheetBehavior = this.f62236a.g().getSheetBehavior()) != null) {
            r g10 = this.f62236a.g();
            e eVar = this.f62237b;
            if (eVar == null) {
                C6496s.v("dimmingView");
                eVar = null;
            }
            a aVar2 = new a(g10, eVar, this.f62239d);
            this.f62242g = aVar2;
            C6496s.e(aVar2);
            sheetBehavior.W(aVar2);
        }
    }

    public r g() {
        return this.f62236a.g();
    }

    public void h(C4940y.b bVar) {
        C6496s.h(bVar, "event");
        throw new t("An operation is not implemented: " + "Not yet implemented");
    }

    public D0 i(View view, D0 d02) {
        C6496s.h(view, "v");
        C6496s.h(d02, "insets");
        boolean q10 = d02.q(D0.n.c());
        C2388d f10 = d02.f(D0.n.c());
        C6496s.g(f10, "getInsets(...)");
        if (q10) {
            this.f62240e = true;
            this.f62241f = new C4929m(f10.f25153d);
            BottomSheetBehavior<r> sheetBehavior = g().getSheetBehavior();
            if (sheetBehavior != null) {
                z zVar = this.f62236a;
                C6496s.f(zVar, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                ((E) zVar).T(sheetBehavior, new C4929m(f10.f25153d));
            }
            if (isRemoving()) {
                return d02;
            }
            C2388d f11 = d02.f(D0.n.f());
            C6496s.g(f11, "getInsets(...)");
            D0 a10 = new D0.a(d02).b(D0.n.f(), C2388d.b(f11.f25150a, f11.f25151b, f11.f25152c, 0)).a();
            C6496s.g(a10, "build(...)");
            return a10;
        } else if (isRemoving()) {
            C2388d f12 = d02.f(D0.n.f());
            C6496s.g(f12, "getInsets(...)");
            D0 a11 = new D0.a(d02).b(D0.n.f(), C2388d.b(f12.f25150a, f12.f25151b, f12.f25152c, 0)).a();
            C6496s.g(a11, "build(...)");
            return a11;
        } else {
            BottomSheetBehavior<r> sheetBehavior2 = g().getSheetBehavior();
            if (sheetBehavior2 != null) {
                if (this.f62240e) {
                    z zVar2 = this.f62236a;
                    C6496s.f(zVar2, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                    ((E) zVar2).T(sheetBehavior2, C4926j.f59803a);
                } else {
                    C4928l lVar = this.f62241f;
                    C4927k kVar = C4927k.f59804a;
                    if (!C6496s.c(lVar, kVar)) {
                        z zVar3 = this.f62236a;
                        C6496s.f(zVar3, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                        ((E) zVar3).T(sheetBehavior2, kVar);
                    }
                }
            }
            this.f62241f = C4927k.f59804a;
            this.f62240e = false;
            C2388d f13 = d02.f(D0.n.f());
            C6496s.g(f13, "getInsets(...)");
            D0 a12 = new D0.a(d02).b(D0.n.f(), C2388d.b(f13.f25150a, f13.f25151b, f13.f25152c, 0)).a();
            C6496s.g(a12, "build(...)");
            return a12;
        }
    }

    public List j() {
        return this.f62244i;
    }

    public void k(C4935t tVar) {
        C6496s.h(tVar, "container");
        this.f62236a.k(tVar);
    }

    public void l() {
        this.f62236a.l();
    }

    public void m(C4935t tVar) {
        C6496s.h(tVar, "container");
        this.f62236a.m(tVar);
    }

    public void o(C4940y.b bVar) {
        C6496s.h(bVar, "event");
        throw new t("An operation is not implemented: " + "Not yet implemented");
    }

    public void onAnimationEnd(Animation animation) {
        E();
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        int i12;
        Context context = getContext();
        if (z10) {
            i12 = C4931o.f59811f;
        } else {
            i12 = C4931o.f59812g;
        }
        return AnimationUtils.loadAnimation(context, i12);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6496s.h(layoutInflater, "inflater");
        K();
        f fVar = this.f62238c;
        if (fVar != null) {
            return fVar;
        }
        C6496s.v("containerView");
        return null;
    }

    public void onPause() {
        super.onPause();
        this.f62243h.f(this);
    }

    public void onResume() {
        this.f62243h.a(this);
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        this.f62243h.d(M());
        L();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C6496s.h(view, "view");
        e eVar = null;
        if (g().getSheetInitialDetentIndex() <= g().getSheetLargestUndimmedDetentIndex()) {
            e eVar2 = this.f62237b;
            if (eVar2 == null) {
                C6496s.v("dimmingView");
            } else {
                eVar = eVar2;
            }
            eVar.setAlpha(0.0f);
            return;
        }
        e eVar3 = this.f62237b;
        if (eVar3 == null) {
            C6496s.v("dimmingView");
        } else {
            eVar = eVar3;
        }
        eVar.setAlpha(this.f62239d);
    }

    public ReactContext q() {
        Context context = getContext();
        if (context instanceof ReactContext) {
            return (ReactContext) context;
        }
        return null;
    }

    public void r(F f10) {
        C6496s.h(f10, MetricTracker.Action.DISMISSED);
        F(true);
    }

    public C1769q c() {
        return this;
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
