package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.react.uimanager.e  reason: case insensitive filesystem */
public final class C3408e {

    /* renamed from: a  reason: collision with root package name */
    public static final C3408e f41567a = new C3408e();

    /* renamed from: b  reason: collision with root package name */
    private static DisplayMetrics f41568b;

    /* renamed from: c  reason: collision with root package name */
    private static DisplayMetrics f41569c;

    private C3408e() {
    }

    public static final WritableMap a(double d10) {
        if (f41568b == null) {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        } else if (f41569c != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            C3408e eVar = f41567a;
            DisplayMetrics displayMetrics = f41568b;
            C6496s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
            writableNativeMap.putMap("windowPhysicalPixels", eVar.b(displayMetrics, d10));
            DisplayMetrics displayMetrics2 = f41569c;
            C6496s.f(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
            writableNativeMap.putMap("screenPhysicalPixels", eVar.b(displayMetrics2, d10));
            return writableNativeMap;
        } else {
            throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
    }

    private final WritableMap b(DisplayMetrics displayMetrics, double d10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(Snapshot.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", (double) displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d10);
        writableNativeMap.putDouble("densityDpi", (double) displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics c() {
        DisplayMetrics displayMetrics = f41569c;
        if (displayMetrics != null) {
            C6496s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final DisplayMetrics e() {
        DisplayMetrics displayMetrics = f41568b;
        if (displayMetrics != null) {
            C6496s.f(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
            return displayMetrics;
        }
        throw new IllegalStateException("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final void f(Context context) {
        C6496s.h(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f41568b = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        C6496s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        f41569c = displayMetrics2;
    }

    public static final void g(Context context) {
        C6496s.h(context, "context");
        if (f41569c == null) {
            f(context);
        }
    }

    public final int d(Activity activity) {
        Window window;
        View decorView;
        D0 H10;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (H10 = C1680b0.H(decorView)) == null) {
            return 0;
        }
        return H10.f(D0.n.g() | D0.n.f() | D0.n.b()).f25151b;
    }
}
