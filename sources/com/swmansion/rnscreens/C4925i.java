package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.core.view.I;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;

/* renamed from: com.swmansion.rnscreens.i  reason: case insensitive filesystem */
public final class C4925i implements I, LifecycleEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static final C4925i f59797a = new C4925i();

    /* renamed from: b  reason: collision with root package name */
    private static final ArrayList f59798b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference f59799c = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private static boolean f59800d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f59801e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f59802f = true;

    private C4925i() {
    }

    private final boolean b() {
        if (!f59800d || f59799c.get() == null) {
            return true;
        }
        return false;
    }

    private final View c() {
        return (View) f59799c.get();
    }

    public final void a(I i10) {
        C6496s.h(i10, "listener");
        f59798b.add(i10);
    }

    public final boolean d(View view) {
        C6496s.h(view, "view");
        if (!b()) {
            return false;
        }
        C1680b0.C0(view, this);
        f59799c = new WeakReference(view);
        f59800d = true;
        return true;
    }

    public final void e(ReactApplicationContext reactApplicationContext) {
        C6496s.h(reactApplicationContext, "context");
        if (f59801e) {
            Log.w("[RNScreens]", "InsetObserverProxy registers on new context while it has not been invalidated on the old one. Please report this as issue at https://github.com/software-mansion/react-native-screens/issues");
        }
        f59801e = true;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public final void f(I i10) {
        C6496s.h(i10, "listener");
        f59798b.remove(i10);
    }

    public D0 i(View view, D0 d02) {
        D0 d03;
        C6496s.h(view, "v");
        C6496s.h(d02, "insets");
        if (f59802f) {
            d03 = C1680b0.a0(view, d02);
        } else {
            d03 = d02;
        }
        C6496s.e(d03);
        for (I i10 : f59798b) {
            d03 = i10.i(view, d02);
        }
        return d03;
    }

    public void onHostDestroy() {
        View c10 = c();
        if (f59800d && c10 != null) {
            C1680b0.C0(c10, (I) null);
            f59800d = false;
            f59799c.clear();
        }
        f59801e = false;
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }
}
