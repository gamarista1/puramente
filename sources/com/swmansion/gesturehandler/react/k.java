package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.uimanager.C3415h0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import vd.i;

public final class k {

    /* renamed from: g  reason: collision with root package name */
    public static final a f59594g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ReactContext f59595a;

    /* renamed from: b  reason: collision with root package name */
    private final i f59596b;

    /* renamed from: c  reason: collision with root package name */
    private final C5260d f59597c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f59598d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f59599e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f59600f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final ViewGroup b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            ViewParent viewParent = viewGroup;
            while (viewParent != null && !(viewParent instanceof C3405c0)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != null) {
                return (ViewGroup) viewParent;
            }
            throw new IllegalStateException(("View " + viewGroup + " has not been mounted under ReactRootView").toString());
        }

        private a() {
        }
    }

    public final class b extends C5260d {
        public b(int i10) {
            I0(i10);
        }

        private final void U0(MotionEvent motionEvent) {
            i P10;
            if (S() == 0 && (!k.this.f59599e || (P10 = P()) == null || !P10.v())) {
                p();
                k.this.f59599e = false;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 10) {
                B();
            }
        }

        /* access modifiers changed from: protected */
        public void j0() {
            k.this.f59599e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (k.this.f() instanceof C3405c0) {
                ((C3405c0) k.this.f()).onChildStartedNativeGesture(k.this.f(), obtain);
            }
            obtain.recycle();
        }

        /* access modifiers changed from: protected */
        public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
            C6496s.h(motionEvent, "event");
            C6496s.h(motionEvent2, "sourceEvent");
            U0(motionEvent);
        }

        /* access modifiers changed from: protected */
        public void m0(MotionEvent motionEvent, MotionEvent motionEvent2) {
            C6496s.h(motionEvent, "event");
            C6496s.h(motionEvent2, "sourceEvent");
            U0(motionEvent);
        }
    }

    public k(ReactContext reactContext, ViewGroup viewGroup) {
        C6496s.h(reactContext, "context");
        C6496s.h(viewGroup, "wrappedView");
        this.f59595a = reactContext;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        NativeModule nativeModule = reactContext.getNativeModule(RNGestureHandlerModule.class);
        C6496s.e(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        ViewGroup a10 = f59594g.b(viewGroup);
        this.f59598d = a10;
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + a10);
        i iVar = new i(viewGroup, registry, new o());
        iVar.F(0.1f);
        this.f59596b = iVar;
        b bVar = new b(-id2);
        this.f59597c = bVar;
        registry.j(bVar);
        registry.c(bVar.T(), id2, 3);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* access modifiers changed from: private */
    public static final void h(k kVar) {
        kVar.k();
    }

    private final void k() {
        C5260d dVar = this.f59597c;
        if (dVar != null && dVar.S() == 2) {
            dVar.k();
            dVar.B();
        }
    }

    public final void d(View view) {
        C6496s.h(view, "view");
        i iVar = this.f59596b;
        if (iVar != null) {
            iVar.f(view);
        }
    }

    public final boolean e(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "ev");
        this.f59600f = true;
        i iVar = this.f59596b;
        C6496s.e(iVar);
        iVar.B(motionEvent);
        this.f59600f = false;
        return this.f59599e;
    }

    public final ViewGroup f() {
        return this.f59598d;
    }

    public final void g(int i10, boolean z10) {
        if (z10) {
            UiThreadUtil.runOnUiThread(new j(this));
        }
    }

    public final void i() {
        if (this.f59596b != null && !this.f59600f) {
            k();
        }
    }

    public final void j() {
        ViewGroup viewGroup = this.f59598d;
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + viewGroup);
        ReactContext reactContext = this.f59595a;
        C6496s.f(reactContext, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        NativeModule nativeModule = ((C3415h0) reactContext).b().getNativeModule(RNGestureHandlerModule.class);
        C6496s.e(nativeModule);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) nativeModule;
        i registry = rNGestureHandlerModule.getRegistry();
        C5260d dVar = this.f59597c;
        C6496s.e(dVar);
        registry.g(dVar.T());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
