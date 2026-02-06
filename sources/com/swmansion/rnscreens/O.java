package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.C1680b0;
import androidx.core.view.C1708p0;
import androidx.core.view.D0;
import androidx.core.view.I;
import androidx.core.view.f1;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.r;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import p1.C2388d;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public static final O f59726a = new O();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f59727b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f59728c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f59729d;

    /* renamed from: e  reason: collision with root package name */
    private static Integer f59730e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static d f59731f = new d();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.swmansion.rnscreens.r$g[] r0 = com.swmansion.rnscreens.r.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.ORIENTATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.COLOR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.STYLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.TRANSLUCENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.ANIMATED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.NAVIGATION_BAR_COLOR     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.NAVIGATION_BAR_TRANSLUCENT     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.swmansion.rnscreens.r$g r1 = com.swmansion.rnscreens.r.g.NAVIGATION_BAR_HIDDEN     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f59732a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.O.a.<clinit>():void");
        }
    }

    public static final class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f59734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f59735c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity, Integer num, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f59733a = activity;
            this.f59734b = num;
            this.f59735c = z10;
        }

        /* access modifiers changed from: private */
        public static final void b(Window window, ValueAnimator valueAnimator) {
            C6496s.h(valueAnimator, "animator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            C6496s.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        public void runGuarded() {
            Window window = this.f59733a.getWindow();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(window.getStatusBarColor()), this.f59734b});
            ofObject.addUpdateListener(new P(window));
            if (this.f59735c) {
                ofObject.setDuration(300).setStartDelay(0);
            } else {
                ofObject.setDuration(0).setStartDelay(300);
            }
            ofObject.start();
        }
    }

    public static final class c extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f59736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f59737b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f59736a = activity;
            this.f59737b = z10;
        }

        public void runGuarded() {
            View decorView = this.f59736a.getWindow().getDecorView();
            C6496s.g(decorView, "getDecorView(...)");
            if (this.f59737b) {
                C4925i iVar = C4925i.f59797a;
                iVar.d(decorView);
                iVar.a(O.f59731f);
            } else {
                C4925i.f59797a.f(O.f59731f);
            }
            C1680b0.l0(decorView);
        }
    }

    public static final class d implements I {
        d() {
        }

        public D0 i(View view, D0 d02) {
            C6496s.h(view, "v");
            C6496s.h(d02, "insets");
            D0 a02 = C1680b0.a0(view, d02);
            C6496s.g(a02, "onApplyWindowInsets(...)");
            if (Build.VERSION.SDK_INT >= 30) {
                C2388d f10 = a02.f(D0.n.g());
                C6496s.g(f10, "getInsets(...)");
                D0 a10 = new D0.a().b(D0.n.g(), C2388d.b(f10.f25150a, 0, f10.f25152c, f10.f25153d)).a();
                C6496s.g(a10, "build(...)");
                return a10;
            }
            D0 r10 = a02.r(a02.k(), 0, a02.l(), a02.j());
            C6496s.g(r10, "replaceSystemWindowInsets(...)");
            return r10;
        }
    }

    private O() {
    }

    private final boolean h(r rVar, r.g gVar) {
        switch (a.f59732a[gVar.ordinal()]) {
            case 1:
                if (rVar.getScreenOrientation() == null) {
                    return false;
                }
                break;
            case 2:
                if (rVar.getStatusBarColor() == null) {
                    return false;
                }
                break;
            case 3:
                if (rVar.getStatusBarStyle() == null) {
                    return false;
                }
                break;
            case 4:
                if (rVar.k() == null) {
                    return false;
                }
                break;
            case 5:
                if (rVar.j() == null) {
                    return false;
                }
                break;
            case 6:
                if (rVar.i() == null) {
                    return false;
                }
                break;
            case 7:
                if (rVar.getNavigationBarColor() == null) {
                    return false;
                }
                break;
            case 8:
                if (rVar.h() == null) {
                    return false;
                }
                break;
            case 9:
                if (rVar.g() == null) {
                    return false;
                }
                break;
            default:
                throw new C6535s();
        }
        return true;
    }

    private final r i(r rVar, r.g gVar) {
        z fragmentWrapper;
        if (rVar == null || (fragmentWrapper = rVar.getFragmentWrapper()) == null) {
            return null;
        }
        for (C4935t topScreen : fragmentWrapper.j()) {
            r topScreen2 = topScreen.getTopScreen();
            O o10 = f59726a;
            r i10 = o10.i(topScreen2, gVar);
            if (i10 != null) {
                return i10;
            }
            if (topScreen2 != null && o10.h(topScreen2, gVar)) {
                return topScreen2;
            }
        }
        return null;
    }

    private final r j(r rVar, r.g gVar) {
        for (ViewParent container = rVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof r) {
                r rVar2 = (r) container;
                if (h(rVar2, gVar)) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    private final r k(r rVar, r.g gVar) {
        r i10 = i(rVar, gVar);
        if (i10 != null) {
            return i10;
        }
        if (h(rVar, gVar)) {
            return rVar;
        }
        return j(rVar, gVar);
    }

    private final boolean l(int i10) {
        if (((double) 1) - ((((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d)) / ((double) 255)) < 0.5d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void n(boolean z10, f1 f1Var) {
        if (z10) {
            f1Var.a(D0.n.g());
        } else {
            f1Var.f(D0.n.g());
        }
    }

    /* access modifiers changed from: private */
    public static final void p(Window window, int i10) {
        new f1(window, window.getDecorView()).c(f59726a.l(i10));
    }

    /* access modifiers changed from: private */
    public static final void u(Activity activity, String str) {
        View decorView = activity.getWindow().getDecorView();
        C6496s.g(decorView, "getDecorView(...)");
        new f1(activity.getWindow(), decorView).d(C6496s.c(str, "dark"));
    }

    public final void e() {
        f59729d = true;
    }

    public final void f() {
        f59727b = true;
    }

    public final void g() {
        f59728c = true;
    }

    public final void m(r rVar, Activity activity, ReactContext reactContext) {
        Integer num;
        boolean z10;
        Boolean i10;
        C6496s.h(rVar, "screen");
        if (activity != null && reactContext != null) {
            if (f59730e == null) {
                f59730e = Integer.valueOf(activity.getWindow().getStatusBarColor());
            }
            r k10 = k(rVar, r.g.COLOR);
            r k11 = k(rVar, r.g.ANIMATED);
            if (k10 == null || (num = k10.getStatusBarColor()) == null) {
                num = f59730e;
            }
            if (k11 == null || (i10 = k11.i()) == null) {
                z10 = false;
            } else {
                z10 = i10.booleanValue();
            }
            UiThreadUtil.runOnUiThread(new b(activity, num, z10, reactContext.getExceptionHandler()));
        }
    }

    public final void o(r rVar, Activity activity) {
        boolean z10;
        Boolean j10;
        C6496s.h(rVar, "screen");
        if (activity != null) {
            r k10 = k(rVar, r.g.HIDDEN);
            if (k10 == null || (j10 = k10.j()) == null) {
                z10 = false;
            } else {
                z10 = j10.booleanValue();
            }
            Window window = activity.getWindow();
            UiThreadUtil.runOnUiThread(new L(z10, new f1(window, window.getDecorView())));
        }
    }

    public final void q(r rVar, Activity activity) {
        int i10;
        Integer navigationBarColor;
        C6496s.h(rVar, "screen");
        if (activity != null) {
            Window window = activity.getWindow();
            r k10 = k(rVar, r.g.NAVIGATION_BAR_COLOR);
            if (k10 == null || (navigationBarColor = k10.getNavigationBarColor()) == null) {
                i10 = window.getNavigationBarColor();
            } else {
                i10 = navigationBarColor.intValue();
            }
            UiThreadUtil.runOnUiThread(new N(window, i10));
            window.setNavigationBarColor(i10);
        }
    }

    public final void r(r rVar, Activity activity) {
        boolean z10;
        Boolean g10;
        C6496s.h(rVar, "screen");
        if (activity != null) {
            Window window = activity.getWindow();
            r k10 = k(rVar, r.g.NAVIGATION_BAR_HIDDEN);
            if (k10 == null || (g10 = k10.g()) == null) {
                z10 = false;
            } else {
                z10 = g10.booleanValue();
            }
            if (z10) {
                f1 f1Var = new f1(window, window.getDecorView());
                f1Var.a(D0.n.f());
                f1Var.e(2);
                return;
            }
            new f1(window, window.getDecorView()).f(D0.n.f());
        }
    }

    public final void s(r rVar, Activity activity) {
        Boolean h10;
        C6496s.h(rVar, "screen");
        if (activity != null) {
            Window window = activity.getWindow();
            r k10 = k(rVar, r.g.NAVIGATION_BAR_TRANSLUCENT);
            if (k10 != null && (h10 = k10.h()) != null) {
                C1708p0.b(window, !h10.booleanValue());
            }
        }
    }

    public final void t(r rVar, Activity activity) {
        int i10;
        Integer screenOrientation;
        C6496s.h(rVar, "screen");
        if (activity != null) {
            r k10 = k(rVar, r.g.ORIENTATION);
            if (k10 == null || (screenOrientation = k10.getScreenOrientation()) == null) {
                i10 = -1;
            } else {
                i10 = screenOrientation.intValue();
            }
            activity.setRequestedOrientation(i10);
        }
    }

    public final void v(r rVar, Activity activity, ReactContext reactContext) {
        String str;
        C6496s.h(rVar, "screen");
        if (activity != null && reactContext != null) {
            r k10 = k(rVar, r.g.STYLE);
            if (k10 == null || (str = k10.getStatusBarStyle()) == null) {
                str = "light";
            }
            UiThreadUtil.runOnUiThread(new M(activity, str));
        }
    }

    public final void w(r rVar, Activity activity, ReactContext reactContext) {
        boolean z10;
        Boolean k10;
        C6496s.h(rVar, "screen");
        if (activity != null && reactContext != null) {
            r k11 = k(rVar, r.g.TRANSLUCENT);
            if (k11 == null || (k10 = k11.k()) == null) {
                z10 = false;
            } else {
                z10 = k10.booleanValue();
            }
            UiThreadUtil.runOnUiThread(new c(activity, z10, reactContext.getExceptionHandler()));
        }
    }

    public final void x(r rVar, Activity activity, ReactContext reactContext) {
        C6496s.h(rVar, "screen");
        if (f59727b) {
            t(rVar, activity);
        }
        if (f59728c) {
            m(rVar, activity, reactContext);
            v(rVar, activity, reactContext);
            w(rVar, activity, reactContext);
            o(rVar, activity);
        }
        if (f59729d) {
            q(rVar, activity);
            s(rVar, activity);
            r(rVar, activity);
        }
    }
}
