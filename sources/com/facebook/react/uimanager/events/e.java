package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import n7.C3863a;
import z8.C4236a;

public class e implements EventDispatcher, LifecycleEventListener {
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final Comparator f41578q = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f41579a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f41580b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ReactApplicationContext f41581c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final LongSparseArray f41582d = new LongSparseArray();

    /* renamed from: e  reason: collision with root package name */
    private final Map f41583e = C7.d.b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f41584f = new c();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f41585g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList f41586h = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f41587i = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final d f41588j = new d();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f41589k = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public d[] f41590l = new d[16];
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f41591m = 0;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public volatile ReactEventEmitter f41592n;

    /* renamed from: o  reason: collision with root package name */
    private short f41593o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f41594p = false;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            if (dVar == null && dVar2 == null) {
                return 0;
            }
            if (dVar == null) {
                return -1;
            }
            if (dVar2 == null) {
                return 1;
            }
            int i10 = ((dVar.getTimestampMs() - dVar2.getTimestampMs()) > 0 ? 1 : ((dVar.getTimestampMs() - dVar2.getTimestampMs()) == 0 ? 0 : -1));
            if (i10 == 0) {
                return 0;
            }
            if (i10 < 0) {
                return -1;
            }
            return 1;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            e.this.G();
        }
    }

    private class c implements Runnable {
        public void run() {
            C4236a.c(0, "DispatchEventsRunnable");
            try {
                C4236a.f(0, "ScheduleDispatchFrameCallback", e.this.f41589k.getAndIncrement());
                e.this.f41594p = false;
                C3863a.c(e.this.f41592n);
                synchronized (e.this.f41580b) {
                    if (e.this.f41591m > 0) {
                        if (e.this.f41591m > 1) {
                            Arrays.sort(e.this.f41590l, 0, e.this.f41591m, e.f41578q);
                        }
                        for (int i10 = 0; i10 < e.this.f41591m; i10++) {
                            d dVar = e.this.f41590l[i10];
                            if (dVar != null) {
                                C4236a.f(0, dVar.getEventName(), dVar.getUniqueID());
                                dVar.dispatchModern(e.this.f41592n);
                                dVar.dispose();
                            }
                        }
                        e.this.B();
                        e.this.f41582d.clear();
                    }
                }
                Iterator it = e.this.f41587i.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).onBatchEventDispatched();
                }
                C4236a.i(0);
            } catch (Throwable th2) {
                C4236a.i(0);
                throw th2;
            }
        }

        private c() {
        }
    }

    private class d implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f41597a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f41598b;

        class a implements Runnable {
            a() {
            }

            public void run() {
                d.this.a();
            }
        }

        private void c() {
            if (!M7.b.j()) {
                com.facebook.react.modules.core.b.h().k(b.a.TIMERS_EVENTS, e.this.f41588j);
            }
        }

        public void a() {
            if (!this.f41597a) {
                this.f41597a = true;
                c();
            }
        }

        public void b() {
            if (!this.f41597a) {
                if (e.this.f41581c.isOnUiQueueThread()) {
                    a();
                } else {
                    e.this.f41581c.runOnUiQueueThread(new a());
                }
            }
        }

        public void d() {
            this.f41598b = true;
        }

        public void doFrame(long j10) {
            UiThreadUtil.assertOnUiThread();
            if (this.f41598b) {
                this.f41597a = false;
            } else {
                c();
            }
            C4236a.c(0, "ScheduleDispatchFrameCallback");
            try {
                e.this.F();
                if (!e.this.f41594p) {
                    e.this.f41594p = true;
                    C4236a.l(0, "ScheduleDispatchFrameCallback", e.this.f41589k.get());
                    e.this.f41581c.runOnJSQueueThread(e.this.f41584f);
                }
            } finally {
                C4236a.i(0);
            }
        }

        private d() {
            this.f41597a = false;
            this.f41598b = false;
        }
    }

    public e(ReactApplicationContext reactApplicationContext) {
        this.f41581c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f41592n = new ReactEventEmitter(reactApplicationContext);
    }

    private void A(d dVar) {
        int i10 = this.f41591m;
        d[] dVarArr = this.f41590l;
        if (i10 == dVarArr.length) {
            this.f41590l = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        d[] dVarArr2 = this.f41590l;
        int i11 = this.f41591m;
        this.f41591m = i11 + 1;
        dVarArr2[i11] = dVar;
    }

    /* access modifiers changed from: private */
    public void B() {
        Arrays.fill(this.f41590l, 0, this.f41591m, (Object) null);
        this.f41591m = 0;
    }

    private long C(int i10, String str, short s10) {
        short s11;
        Short sh2 = (Short) this.f41583e.get(str);
        if (sh2 != null) {
            s11 = sh2.shortValue();
        } else {
            short s12 = this.f41593o;
            this.f41593o = (short) (s12 + 1);
            this.f41583e.put(str, Short.valueOf(s12));
            s11 = s12;
        }
        return D(i10, s11, s10);
    }

    private static long D(int i10, short s10, short s11) {
        return ((((long) s10) & 65535) << 32) | ((long) i10) | ((((long) s11) & 65535) << 48);
    }

    private void E() {
        if (this.f41592n != null) {
            this.f41588j.b();
        }
    }

    /* access modifiers changed from: private */
    public void F() {
        synchronized (this.f41579a) {
            synchronized (this.f41580b) {
                int i10 = 0;
                while (i10 < this.f41585g.size()) {
                    try {
                        d dVar = (d) this.f41585g.get(i10);
                        if (!dVar.canCoalesce()) {
                            A(dVar);
                        } else {
                            long C10 = C(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = (Integer) this.f41582d.get(C10);
                            d dVar2 = null;
                            if (num == null) {
                                this.f41582d.put(C10, Integer.valueOf(this.f41591m));
                            } else {
                                d dVar3 = this.f41590l[num.intValue()];
                                d coalesce = dVar.coalesce(dVar3);
                                if (coalesce != dVar3) {
                                    this.f41582d.put(C10, Integer.valueOf(this.f41591m));
                                    this.f41590l[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = coalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                A(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        }
                        i10++;
                    } finally {
                        while (true) {
                        }
                    }
                }
            }
            this.f41585g.clear();
        }
    }

    /* access modifiers changed from: private */
    public void G() {
        UiThreadUtil.assertOnUiThread();
        this.f41588j.d();
    }

    public void a(int i10, RCTEventEmitter rCTEventEmitter) {
        this.f41592n.register(i10, rCTEventEmitter);
    }

    public void b() {
        E();
    }

    public void c(a aVar) {
        this.f41587i.add(aVar);
    }

    public void d() {
        UiThreadUtil.runOnUiThread(new b());
    }

    public void e(int i10) {
        this.f41592n.unregister(i10);
    }

    public void f(g gVar) {
        this.f41586h.remove(gVar);
    }

    public void g(g gVar) {
        this.f41586h.add(gVar);
    }

    public void h(d dVar) {
        C3863a.b(dVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator it = this.f41586h.iterator();
        while (it.hasNext()) {
            ((g) it.next()).onEventDispatch(dVar);
        }
        synchronized (this.f41579a) {
            this.f41585g.add(dVar);
            C4236a.l(0, dVar.getEventName(), dVar.getUniqueID());
        }
        E();
    }

    public void i(a aVar) {
        this.f41587i.remove(aVar);
    }

    public void j(int i10, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f41592n.register(i10, rCTModernEventEmitter);
    }

    public void onHostDestroy() {
        G();
    }

    public void onHostPause() {
        G();
    }

    public void onHostResume() {
        E();
    }
}
