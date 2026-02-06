package com.facebook.react.uimanager;

import C7.d;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class B0 implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f41374a;

    /* renamed from: b  reason: collision with root package name */
    private final C0 f41375b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f41376a;

        a(List list) {
            this.f41376a = list;
        }

        public void run() {
            for (ViewManager trimMemory : this.f41376a) {
                trimMemory.trimMemory();
            }
        }
    }

    public B0(C0 c02) {
        this.f41374a = d.b();
        this.f41375b = c02;
    }

    private ViewManager d(String str) {
        ViewManager b10 = this.f41375b.b(str);
        if (b10 != null) {
            this.f41374a.put(str, b10);
        }
        return b10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i10);
        }
    }

    public synchronized ViewManager c(String str) {
        try {
            ViewManager viewManager = (ViewManager) this.f41374a.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String str2 = "RCT" + str;
            ViewManager viewManager2 = (ViewManager) this.f41374a.get(str2);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f41375b != null) {
                ViewManager d10 = d(str);
                if (d10 != null) {
                    return d10;
                }
                ViewManager d11 = d(str2);
                if (d11 != null) {
                    return d11;
                }
                throw new r("ViewManagerResolver returned null for either " + str + " or " + str2 + ", existing names are: " + this.f41375b.a());
            }
            throw new r("No ViewManager found for class " + str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized ViewManager e(String str) {
        ViewManager viewManager = (ViewManager) this.f41374a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f41375b == null) {
            return null;
        }
        return d(str);
    }

    public void f() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f41374a.values());
        }
        z0 z0Var = new z0(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            z0Var.run();
        } else {
            UiThreadUtil.runOnUiThread(z0Var);
        }
    }

    public void i(int i10) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f41374a.values());
        }
        A0 a02 = new A0(arrayList, i10);
        if (UiThreadUtil.isOnUiThread()) {
            a02.run();
        } else {
            UiThreadUtil.runOnUiThread(a02);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(0);
    }

    public void onTrimMemory(int i10) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f41374a.values());
        }
        a aVar = new a(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    public B0(List list) {
        HashMap b10 = d.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            b10.put(viewManager.getName(), viewManager);
        }
        this.f41374a = b10;
        this.f41375b = null;
    }
}
