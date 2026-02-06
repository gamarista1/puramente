package Fd;

import Pd.c;
import Pd.d;
import Pd.e;
import android.app.Activity;
import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class b implements Pd.a, c, d, Qd.c {

    /* renamed from: a  reason: collision with root package name */
    private ReactContext f50803a;

    /* renamed from: b  reason: collision with root package name */
    private Map f50804b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map f50805c = new WeakHashMap();

    class a implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f50806a;

        a(WeakReference weakReference) {
            this.f50806a = weakReference;
        }

        public void onHostDestroy() {
            e eVar = (e) this.f50806a.get();
            if (eVar != null) {
                eVar.onHostDestroy();
            }
        }

        public void onHostPause() {
            e eVar = (e) this.f50806a.get();
            if (eVar != null) {
                eVar.onHostPause();
            }
        }

        public void onHostResume() {
            e eVar = (e) this.f50806a.get();
            if (eVar != null) {
                eVar.onHostResume();
            }
        }
    }

    public b(ReactContext reactContext) {
        this.f50803a = reactContext;
    }

    public Activity a() {
        return g().getCurrentActivity();
    }

    public void b(e eVar) {
        g().removeLifecycleEventListener((LifecycleEventListener) this.f50804b.get(eVar));
        this.f50804b.remove(eVar);
    }

    public void c(e eVar) {
        this.f50804b.put(eVar, new a(new WeakReference(eVar)));
        this.f50803a.addLifecycleEventListener((LifecycleEventListener) this.f50804b.get(eVar));
    }

    public void d(Runnable runnable) {
        if (g().isOnJSQueueThread()) {
            runnable.run();
        } else {
            g().runOnJSQueueThread(runnable);
        }
    }

    public void e(Runnable runnable) {
        if (g().isOnUiQueueThread()) {
            runnable.run();
        } else {
            g().runOnUiQueueThread(runnable);
        }
    }

    public long f() {
        return this.f50803a.getJavaScriptContextHolder().get();
    }

    /* access modifiers changed from: protected */
    public ReactContext g() {
        return this.f50803a;
    }

    public CallInvokerHolderImpl getJSCallInvokerHolder() {
        return (CallInvokerHolderImpl) this.f50803a.getCatalystInstance().getJSCallInvokerHolder();
    }

    public List o() {
        return Arrays.asList(new Class[]{Pd.a.class, d.class, Qd.c.class});
    }

    public void onDestroy() {
        Iterator it = new ArrayList(this.f50804b.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        for (LifecycleEventListener removeLifecycleEventListener : this.f50804b.values()) {
            this.f50803a.removeLifecycleEventListener(removeLifecycleEventListener);
        }
        this.f50804b.clear();
    }

    public View resolveView(int i10) {
        UIManager i11 = n0.i(g(), i10);
        if (i11 == null) {
            return null;
        }
        return i11.resolveView(i10);
    }
}
