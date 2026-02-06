package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.view.k;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import lf.C6502A;
import mf.O;

@Q7.a(name = "StatusBarManager")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/modules/statusbar/StatusBarModule;", "Lcom/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "colorDouble", "", "animated", "Llf/M;", "setColor", "(DZ)V", "translucent", "setTranslucent", "(Z)V", "hidden", "setHidden", "style", "setStyle", "(Ljava/lang/String;)V", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f41114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f41115b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41116c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Activity activity, boolean z10, int i10, ReactApplicationContext reactApplicationContext) {
            super((ReactContext) reactApplicationContext);
            this.f41114a = activity;
            this.f41115b = z10;
            this.f41116c = i10;
        }

        /* access modifiers changed from: private */
        public static final void b(Activity activity, ValueAnimator valueAnimator) {
            C6496s.h(valueAnimator, "animator");
            Window window = activity.getWindow();
            if (window != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C6496s.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                window.setStatusBarColor(((Integer) animatedValue).intValue());
            }
        }

        public void runGuarded() {
            Window window = this.f41114a.getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                if (this.f41115b) {
                    ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(window.getStatusBarColor()), Integer.valueOf(this.f41116c)});
                    ofObject.addUpdateListener(new c(this.f41114a));
                    ofObject.setDuration(300).setStartDelay(0);
                    ofObject.start();
                    return;
                }
                window.setStatusBarColor(this.f41116c);
            }
        }
    }

    public static final class c extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f41117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f41118b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z10, ReactApplicationContext reactApplicationContext) {
            super((ReactContext) reactApplicationContext);
            this.f41117a = activity;
            this.f41118b = z10;
        }

        public void runGuarded() {
            Window window = this.f41117a.getWindow();
            if (window != null) {
                k.b(window, this.f41118b);
            }
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public static final void setHidden$lambda$1(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        if (window != null) {
            k.d(window, z10);
        }
    }

    /* access modifiers changed from: private */
    public static final void setStyle$lambda$2(Activity activity, String str) {
        int i10;
        Window window = activity.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT > 30) {
                WindowInsetsController a10 = window.getInsetsController();
                if (a10 != null) {
                    if (C6496s.c("dark-content", str)) {
                        a10.setSystemBarsAppearance(8, 8);
                    } else {
                        a10.setSystemBarsAppearance(0, 8);
                    }
                }
            } else {
                View decorView = window.getDecorView();
                C6496s.g(decorView, "getDecorView(...)");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                if (C6496s.c("dark-content", str)) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & -8193;
                }
                decorView.setSystemUiVisibility(i10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> getTypedExportedConstants() {
        String str;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            str = "black";
        } else {
            int statusBarColor = window.getStatusBarColor();
            U u10 = U.f71764a;
            str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(statusBarColor & 16777215)}, 1));
            C6496s.g(str, "format(...)");
        }
        return O.l(C6502A.a(HEIGHT_KEY, Float.valueOf(G.f((float) C3408e.f41567a.d(currentActivity)))), C6502A.a(DEFAULT_BACKGROUND_COLOR_KEY, str));
    }

    public void setColor(double d10, boolean z10) {
        int i10 = (int) d10;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            U5.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, z10, i10, getReactApplicationContext()));
        }
    }

    public void setHidden(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            U5.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new a(currentActivity, z10));
        }
    }

    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            U5.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(currentActivity, str));
        }
    }

    public void setTranslucent(boolean z10) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            U5.a.I("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(currentActivity, z10, getReactApplicationContext()));
        }
    }
}
