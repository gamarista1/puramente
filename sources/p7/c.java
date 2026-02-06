package P7;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import n7.C3863a;

public class c {

    /* renamed from: g  reason: collision with root package name */
    private static final WeakHashMap f33518g = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f33519a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Set f33520b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicInteger f33521c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private final Set f33522d = new CopyOnWriteArraySet();

    /* renamed from: e  reason: collision with root package name */
    private final Map f33523e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray f33524f = new SparseArray();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f33526b;

        a(a aVar, int i10) {
            this.f33525a = aVar;
            this.f33526b = i10;
        }

        public void run() {
            c.this.o(this.f33525a, this.f33526b);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f33528a;

        b(int i10) {
            this.f33528a = i10;
        }

        public void run() {
            for (d b10 : c.this.f33520b) {
                b10.b(this.f33528a);
            }
        }
    }

    private c(ReactContext reactContext) {
        this.f33519a = new WeakReference(reactContext);
    }

    public static c f(ReactContext reactContext) {
        WeakHashMap weakHashMap = f33518g;
        c cVar = (c) weakHashMap.get(reactContext);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(reactContext);
        weakHashMap.put(reactContext, cVar2);
        return cVar2;
    }

    private void k(int i10) {
        Runnable runnable = (Runnable) this.f33524f.get(i10);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.f33524f.remove(i10);
        }
    }

    private void m(int i10, long j10) {
        b bVar = new b(this, i10);
        this.f33524f.append(i10, bVar);
        UiThreadUtil.runOnUiThread(bVar, j10);
    }

    /* access modifiers changed from: private */
    public synchronized void o(a aVar, int i10) {
        try {
            UiThreadUtil.assertOnUiThread();
            ReactContext reactContext = (ReactContext) C3863a.d((ReactContext) this.f33519a.get(), "Tried to start a task on a react context that has already been destroyed");
            if (reactContext.getLifecycleState() == LifecycleState.RESUMED) {
                if (!aVar.e()) {
                    throw new IllegalStateException("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.");
                }
            }
            this.f33522d.add(Integer.valueOf(i10));
            this.f33523e.put(Integer.valueOf(i10), new a(aVar));
            if (reactContext.hasActiveReactInstance()) {
                ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i10, aVar.c(), aVar.a());
            } else {
                ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
            }
            if (aVar.d() > 0) {
                m(i10, aVar.d());
            }
            for (d a10 : this.f33520b) {
                a10.a(i10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void d(d dVar) {
        this.f33520b.add(dVar);
        for (Integer intValue : this.f33522d) {
            dVar.a(intValue.intValue());
        }
    }

    /* renamed from: e */
    public synchronized void i(int i10) {
        boolean remove = this.f33522d.remove(Integer.valueOf(i10));
        this.f33523e.remove(Integer.valueOf(i10));
        k(i10);
        if (remove) {
            UiThreadUtil.runOnUiThread(new b(i10));
        }
    }

    public boolean g() {
        if (this.f33522d.size() > 0) {
            return true;
        }
        return false;
    }

    public synchronized boolean h(int i10) {
        return this.f33522d.contains(Integer.valueOf(i10));
    }

    public void j(d dVar) {
        this.f33520b.remove(dVar);
    }

    public synchronized boolean l(int i10) {
        boolean z10;
        a aVar = (a) this.f33523e.get(Integer.valueOf(i10));
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3863a.b(z10, "Tried to retrieve non-existent task config with id " + i10 + ".");
        e b10 = aVar.b();
        if (!b10.a()) {
            return false;
        }
        k(i10);
        UiThreadUtil.runOnUiThread(new a(new a(aVar.c(), aVar.a(), aVar.d(), aVar.e(), b10.c()), i10), (long) b10.b());
        return true;
    }

    public synchronized int n(a aVar) {
        int incrementAndGet;
        incrementAndGet = this.f33521c.incrementAndGet();
        o(aVar, incrementAndGet);
        return incrementAndGet;
    }
}
