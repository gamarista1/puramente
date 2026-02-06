package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.n0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import z8.C4236a;

public class i implements EventDispatcher, LifecycleEventListener {

    /* renamed from: h  reason: collision with root package name */
    private static final Handler f41601h = UiThreadUtil.getUiThreadHandler();

    /* renamed from: a  reason: collision with root package name */
    private final ReactEventEmitter f41602a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ReactApplicationContext f41603b;

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArrayList f41604c = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList f41605d = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final c f41606e = new c();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f41607f = false;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f41608g = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.f41607f = false;
            C4236a.c(0, "BatchEventDispatchedListeners");
            try {
                Iterator it = i.this.f41605d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).onBatchEventDispatched();
                }
            } finally {
                C4236a.i(0);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            i.this.p();
        }
    }

    private class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f41611a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f41612b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                c.this.b();
            }
        }

        private void a() {
            com.facebook.react.modules.core.b.h().k(b.a.TIMERS_EVENTS, i.this.f41606e);
        }

        public void b() {
            if (!this.f41611a) {
                this.f41611a = true;
                a();
            }
        }

        public void c() {
            if (!this.f41611a) {
                if (i.this.f41603b.isOnUiQueueThread()) {
                    b();
                } else {
                    i.this.f41603b.runOnUiQueueThread(new a());
                }
            }
        }

        public void d() {
            this.f41612b = false;
        }

        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f41612b) {
                this.f41611a = false;
            } else {
                a();
            }
            C4236a.c(0, "BatchEventDispatchedListeners");
            try {
                Iterator it = i.this.f41605d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).onBatchEventDispatched();
                }
            } finally {
                C4236a.i(0);
            }
        }

        public void e() {
            this.f41612b = true;
        }

        private c() {
            this.f41611a = false;
            this.f41612b = false;
        }
    }

    public i(ReactApplicationContext reactApplicationContext) {
        this.f41603b = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f41602a = new ReactEventEmitter(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public void p() {
        UiThreadUtil.assertOnUiThread();
        if (M7.b.v()) {
            this.f41607f = false;
            f41601h.removeCallbacks(this.f41608g);
            return;
        }
        this.f41606e.e();
    }

    private void q(d dVar) {
        C4236a.c(0, "FabricEventDispatcher.dispatchSynchronous('" + dVar.getEventName() + "')");
        try {
            UIManager g10 = n0.g(this.f41603b, 2);
            if (g10 instanceof n) {
                ((n) g10).receiveEvent(dVar.getSurfaceId(), dVar.getViewTag(), dVar.getEventName(), dVar.canCoalesce(), dVar.getEventData(), dVar.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
        } finally {
            C4236a.i(0);
        }
    }

    private void r() {
        if (!M7.b.v()) {
            this.f41606e.c();
        } else if (!this.f41607f) {
            this.f41607f = true;
            f41601h.postAtFrontOfQueue(this.f41608g);
        }
    }

    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f41602a.register(i10, rCTEventEmitter);
    }

    public void b() {
        r();
    }

    public void c(a aVar) {
        this.f41605d.add(aVar);
    }

    public void d() {
        UiThreadUtil.runOnUiThread(new b());
    }

    public void e(int i10) {
        this.f41602a.unregister(i10);
    }

    public void f(g gVar) {
        this.f41604c.remove(gVar);
    }

    public void g(g gVar) {
        this.f41604c.add(gVar);
    }

    public void h(d dVar) {
        Iterator it = this.f41604c.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onEventDispatch(dVar);
        }
        if (dVar.experimental_isSynchronous()) {
            q(dVar);
        } else {
            dVar.dispatchModern(this.f41602a);
        }
        dVar.dispose();
        r();
    }

    public void i(a aVar) {
        this.f41605d.remove(aVar);
    }

    public void j(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f41602a.register(i10, rCTModernEventEmitter);
    }

    public void onHostDestroy() {
        p();
    }

    public void onHostPause() {
        p();
    }

    public void onHostResume() {
        r();
        if (!M7.b.v()) {
            this.f41606e.d();
        }
    }
}
