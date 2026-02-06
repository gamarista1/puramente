package com.swmansion.rnscreens;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C1680b0;
import androidx.core.view.C1710q0;
import androidx.core.view.D0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import db.C4941a;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xd.g;

/* renamed from: com.swmansion.rnscreens.w  reason: case insensitive filesystem */
public final class C4938w extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final a f59931j = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ReactContext f59932a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f59933b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f59934c = 5;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f59935d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public float f59936e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f59937f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f59938g;

    /* renamed from: h  reason: collision with root package name */
    private final c f59939h;

    /* renamed from: i  reason: collision with root package name */
    private b f59940i;

    /* renamed from: com.swmansion.rnscreens.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.swmansion.rnscreens.w$b */
    public static final class b extends BottomSheetBehavior.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4938w f59941a;

        b(C4938w wVar) {
            this.f59941a = wVar;
        }

        public void b(View view, float f10) {
            C6496s.h(view, "bottomSheet");
            this.f59941a.f59936e = Math.max(f10, 0.0f);
            if (!this.f59941a.f59935d) {
                C4938w wVar = this.f59941a;
                int m10 = wVar.f59933b;
                int o10 = this.f59941a.getReactHeight();
                C4938w wVar2 = this.f59941a;
                wVar.w(m10, o10, wVar2.D(wVar2.f59936e), this.f59941a.f59937f);
            }
        }

        public void c(View view, int i10) {
            C6496s.h(view, "bottomSheet");
            if (g.f62255a.b(i10)) {
                if (i10 == 3 || i10 == 4 || i10 == 6) {
                    C4938w wVar = this.f59941a;
                    wVar.w(wVar.f59933b, this.f59941a.getReactHeight(), this.f59941a.C(i10), this.f59941a.f59937f);
                }
                this.f59941a.f59934c = i10;
            }
        }
    }

    /* renamed from: com.swmansion.rnscreens.w$c */
    public static final class c extends C1710q0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4938w f59942a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4938w wVar) {
            super(0);
            this.f59942a = wVar;
        }

        public void onEnd(C1710q0 q0Var) {
            C6496s.h(q0Var, "animation");
            this.f59942a.f59935d = false;
        }

        public D0 onProgress(D0 d02, List list) {
            C6496s.h(d02, "insets");
            C6496s.h(list, "runningAnimations");
            this.f59942a.f59937f = d02.f(D0.n.c()).f25153d - d02.f(D0.n.f()).f25153d;
            C4938w wVar = this.f59942a;
            int m10 = wVar.f59933b;
            int o10 = this.f59942a.getReactHeight();
            C4938w wVar2 = this.f59942a;
            wVar.w(m10, o10, wVar2.D(wVar2.f59936e), this.f59942a.f59937f);
            return d02;
        }

        public C1710q0.a onStart(C1710q0 q0Var, C1710q0.a aVar) {
            C6496s.h(q0Var, "animation");
            C6496s.h(aVar, "bounds");
            this.f59942a.f59935d = true;
            C1710q0.a onStart = super.onStart(q0Var, aVar);
            C6496s.g(onStart, "onStart(...)");
            return onStart;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4938w(ReactContext reactContext) {
        super(reactContext);
        C6496s.h(reactContext, "reactContext");
        this.f59932a = reactContext;
        c cVar = new c(this);
        this.f59939h = cVar;
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity != null) {
            View decorView = currentActivity.getWindow().getDecorView();
            C6496s.g(decorView, "getDecorView(...)");
            C1680b0.I0(decorView, cVar);
            this.f59940i = new b(this);
            return;
        }
        throw new IllegalStateException("[RNScreens] Context detached from activity while creating ScreenFooter");
    }

    private final r A() {
        r screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final BottomSheetBehavior B() {
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            return sheetBehavior;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final int C(int i10) {
        BottomSheetBehavior B10 = B();
        if (i10 == 3) {
            return B10.g0();
        }
        if (i10 == 4) {
            return this.f59933b - B10.j0();
        }
        if (i10 == 5) {
            return this.f59933b;
        }
        if (i10 == 6) {
            return (int) (((float) this.f59933b) * (((float) 1) - B10.h0()));
        }
        throw new IllegalArgumentException("[RNScreens] use of stable-state method for unstable state");
    }

    /* access modifiers changed from: private */
    public final int D(float f10) {
        r screenParent = getScreenParent();
        if (screenParent != null) {
            return screenParent.getTop();
        }
        return (int) C4941a.a((float) C(4), (float) C(3), f10);
    }

    private final boolean getHasReceivedInitialLayoutFromParent() {
        if (this.f59933b > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final int getReactHeight() {
        return getMeasuredHeight();
    }

    private final int getReactWidth() {
        return getMeasuredWidth();
    }

    private final r getScreenParent() {
        ViewParent parent = getParent();
        if (parent instanceof r) {
            return (r) parent;
        }
        return null;
    }

    private final BottomSheetBehavior<r> getSheetBehavior() {
        return A().getSheetBehavior();
    }

    public static /* synthetic */ void x(C4938w wVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        wVar.w(i10, i11, i12, i13);
    }

    public final void E(BottomSheetBehavior bottomSheetBehavior) {
        C6496s.h(bottomSheetBehavior, "behavior");
        if (this.f59938g) {
            bottomSheetBehavior.q0(this.f59940i);
            this.f59938g = false;
        }
    }

    public final ReactContext getReactContext() {
        return this.f59932a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            z(sheetBehavior);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BottomSheetBehavior<r> sheetBehavior = getSheetBehavior();
        if (sheetBehavior != null) {
            E(sheetBehavior);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHasReceivedInitialLayoutFromParent()) {
            w(this.f59933b, i13 - i11, C(B().k0()), this.f59937f);
        }
    }

    public final void w(int i10, int i11, int i12, int i13) {
        int max = ((i10 - i11) - i12) - Math.max(i13, 0);
        int reactHeight = getReactHeight();
        setTop(Math.max(max, 0));
        setBottom(getTop() + reactHeight);
    }

    public final void y(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this.f59933b = i14;
        x(this, i14, getReactHeight(), C(B().k0()), 0, 8, (Object) null);
    }

    public final void z(BottomSheetBehavior bottomSheetBehavior) {
        C6496s.h(bottomSheetBehavior, "behavior");
        if (!this.f59938g) {
            bottomSheetBehavior.W(this.f59940i);
            this.f59938g = true;
        }
    }
}
