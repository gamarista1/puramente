package com.airbnb.android.react.lottie;

import C7.d;
import Sg.p;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.C1680b0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import io.branch.rnbranch.RNBranchModule;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import u4.C4070j;
import u4.C4071k;
import u4.a0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f37011a = new g();

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f37012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4070j f37013b;

        a(boolean z10, C4070j jVar) {
            this.f37012a = z10;
            this.f37013b = jVar;
        }

        public void onViewAttachedToWindow(View view) {
            C6496s.h(view, "v");
            C4070j jVar = (C4070j) view;
            if (this.f37012a) {
                this.f37013b.x();
            } else {
                this.f37013b.y();
            }
            jVar.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
            C6496s.h(view, "v");
            ((C4070j) view).removeOnAttachStateChangeListener(this);
        }
    }

    private g() {
    }

    public static final void A(float f10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.m(Float.valueOf(f10));
    }

    public static final void B(String str, h hVar) {
        a0 a0Var;
        C6496s.h(hVar, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 165298699) {
                if (hashCode != 899536360) {
                    if (hashCode == 2101957031 && str.equals("SOFTWARE")) {
                        a0Var = a0.SOFTWARE;
                        hVar.n(a0Var);
                    }
                } else if (str.equals("HARDWARE")) {
                    a0Var = a0.HARDWARE;
                    hVar.n(a0Var);
                }
            } else if (str.equals("AUTOMATIC")) {
                a0Var = a0.AUTOMATIC;
                hVar.n(a0Var);
            }
        }
        a0Var = null;
        hVar.n(a0Var);
    }

    public static final void C(String str, h hVar) {
        ImageView.ScaleType scaleType;
        C6496s.h(hVar, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        hVar.o(scaleType);
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                    hVar.o(scaleType);
                }
            } else if (str.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
                hVar.o(scaleType);
            }
        }
        scaleType = null;
        hVar.o(scaleType);
    }

    public static final void D(String str, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.p(str);
        hVar.a();
    }

    public static final void E(String str, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.c(str);
        hVar.a();
    }

    public static final void F(String str, h hVar) {
        C6496s.h(hVar, "viewManager");
        if (str != null && !p.O(str, ".", false, 2, (Object) null)) {
            str = str + ".json";
        }
        hVar.d(str);
        hVar.a();
    }

    public static final void G(String str, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.e(str);
        hVar.a();
    }

    public static final void H(double d10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.q(Float.valueOf((float) d10));
    }

    public static final void I(ReadableArray readableArray, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.r(readableArray);
    }

    public static final C4070j e(C3415h0 h0Var) {
        C6496s.h(h0Var, "context");
        C4070j jVar = new C4070j(h0Var);
        jVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return jVar;
    }

    public static final Map f() {
        Map f10 = d.f("topAnimationFinish", d.d("registrationName", "onAnimationFinish"), "topAnimationFailure", d.d("registrationName", "onAnimationFailure"), "topAnimationLoaded", d.d("registrationName", "onAnimationLoaded"));
        C6496s.g(f10, "of(...)");
        return f10;
    }

    public static final Map g() {
        Map a10 = d.a().b("VERSION", 1).a();
        C6496s.g(a10, "build(...)");
        return a10;
    }

    public static final void h(C4070j jVar) {
        C6496s.h(jVar, "view");
        new Handler(Looper.getMainLooper()).post(new f(jVar));
    }

    /* access modifiers changed from: private */
    public static final void i(C4070j jVar) {
        if (C1680b0.R(jVar)) {
            jVar.w();
        }
    }

    public static final void j(C4070j jVar, int i10, int i11) {
        boolean z10;
        C6496s.h(jVar, "view");
        if (i10 == -1 || i11 == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        new Handler(Looper.getMainLooper()).post(new e(z10, i10, i11, jVar));
    }

    /* access modifiers changed from: private */
    public static final void k(boolean z10, int i10, int i11, C4070j jVar) {
        Integer num;
        if (!z10) {
            C4071k composition = jVar.getComposition();
            Integer num2 = null;
            if (composition != null) {
                num = Integer.valueOf((int) composition.p());
            } else {
                num = null;
            }
            C4071k composition2 = jVar.getComposition();
            if (composition2 != null) {
                num2 = Integer.valueOf((int) composition2.f());
            }
            int minFrame = (int) jVar.getMinFrame();
            int maxFrame = (int) jVar.getMaxFrame();
            if (!(num == null || num2 == null || (minFrame == num.intValue() && maxFrame == num2.intValue()))) {
                jVar.F(num.intValue(), num2.intValue());
            }
        } else if (i10 > i11) {
            jVar.F(i11, i10);
            if (jVar.getSpeed() > 0.0f) {
                jVar.z();
            }
        } else {
            jVar.F(i10, i11);
            if (jVar.getSpeed() < 0.0f) {
                jVar.z();
            }
        }
        if (!C1680b0.R(jVar)) {
            jVar.addOnAttachStateChangeListener(new a(z10, jVar));
        } else if (z10) {
            jVar.x();
        } else {
            jVar.y();
        }
    }

    public static final void l(C4070j jVar) {
        C6496s.h(jVar, "view");
        new Handler(Looper.getMainLooper()).post(new c(jVar));
    }

    /* access modifiers changed from: private */
    public static final void m(C4070j jVar) {
        if (C1680b0.R(jVar)) {
            jVar.l();
            jVar.setProgress(0.0f);
        }
    }

    public static final void n(C4070j jVar) {
        C6496s.h(jVar, "view");
        new Handler(Looper.getMainLooper()).post(new d(jVar));
    }

    /* access modifiers changed from: private */
    public static final void o(C4070j jVar) {
        if (C1680b0.R(jVar)) {
            jVar.y();
        }
    }

    public static final void p(C4070j jVar, Throwable th2) {
        C6496s.h(jVar, "view");
        C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        Context context = jVar.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C3415h0 h0Var = (C3415h0) context;
        EventDispatcher c10 = n0.c(h0Var, jVar.getId());
        if (c10 != null) {
            c10.h(new j(h0Var.c(), jVar.getId(), th2));
        }
    }

    public static final void q(C4070j jVar) {
        C6496s.h(jVar, "view");
        Context context = jVar.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C3415h0 h0Var = (C3415h0) context;
        EventDispatcher c10 = n0.c(h0Var, jVar.getId());
        if (c10 != null) {
            c10.h(new l(h0Var.c(), jVar.getId()));
        }
    }

    public static final void r(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        Context context = jVar.getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        C3415h0 h0Var = (C3415h0) context;
        EventDispatcher c10 = n0.c(h0Var, jVar.getId());
        if (c10 != null) {
            c10.h(new k(h0Var.c(), jVar.getId(), z10));
        }
    }

    public static final void s(boolean z10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.f(Boolean.valueOf(z10));
    }

    public static final void t(C4070j jVar, boolean z10) {
        C6496s.h(jVar, "view");
        jVar.setCacheComposition(z10);
    }

    public static final void u(ReadableArray readableArray, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.g(readableArray);
    }

    public static final void v(boolean z10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.h(Boolean.valueOf(z10));
    }

    public static final void w(boolean z10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.i(Boolean.valueOf(z10));
    }

    public static final void x(boolean z10, h hVar) {
        C6496s.h(hVar, "viewManager");
        int i10 = 1;
        if (z10) {
            i10 = 2;
        }
        hVar.k(i10);
    }

    public static final void y(String str, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.j(str);
    }

    public static final void z(boolean z10, h hVar) {
        C6496s.h(hVar, "viewManager");
        hVar.l(Boolean.valueOf(z10));
    }
}
