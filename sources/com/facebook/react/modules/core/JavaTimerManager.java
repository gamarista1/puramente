package com.facebook.react.modules.core;

import C7.k;
import U7.f;
import android.util.SparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.modules.core.b;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

public class JavaTimerManager implements LifecycleEventListener, P7.d {

    /* renamed from: q  reason: collision with root package name */
    private static final a f40968q = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ReactApplicationContext f40969a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final U7.d f40970b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f40971c;

    /* renamed from: d  reason: collision with root package name */
    private final I7.e f40972d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f40973e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final Object f40974f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SparseArray f40975g = new SparseArray();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f40976h = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f40977i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final e f40978j = new e();

    /* renamed from: k  reason: collision with root package name */
    private final c f40979k = new c();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public b f40980l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f40981m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f40982n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f40983o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final PriorityQueue f40984p = new PriorityQueue(11, new U7.e(new a()));

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(d dVar, long j10) {
            if (dVar.b() || ((long) dVar.a()) >= j10) {
                return false;
            }
            return true;
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f40985a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f40986b;

        public b(long j10) {
            this.f40985a = j10;
        }

        public final void a() {
            this.f40986b = true;
        }

        public void run() {
            boolean k10;
            if (!this.f40986b) {
                long c10 = k.c() - (this.f40985a / ((long) UtilsKt.MICROS_MULTIPLIER));
                long a10 = k.a() - c10;
                if (16.666666f - ((float) c10) >= 1.0f) {
                    Object g10 = JavaTimerManager.this.f40974f;
                    JavaTimerManager javaTimerManager = JavaTimerManager.this;
                    synchronized (g10) {
                        k10 = javaTimerManager.f40983o;
                        C6514M m10 = C6514M.f71813a;
                    }
                    if (k10) {
                        JavaTimerManager.this.f40970b.callIdleCallbacks((double) a10);
                    }
                    JavaTimerManager.this.f40980l = null;
                }
            }
        }
    }

    private final class c implements Choreographer.FrameCallback {
        public c() {
        }

        public void doFrame(long j10) {
            if (!JavaTimerManager.this.f40976h.get() || JavaTimerManager.this.f40977i.get()) {
                b f10 = JavaTimerManager.this.f40980l;
                if (f10 != null) {
                    f10.a();
                }
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                javaTimerManager.f40980l = new b(j10);
                JavaTimerManager.this.f40969a.runOnJSQueueThread(JavaTimerManager.this.f40980l);
                JavaTimerManager.this.f40971c.k(b.a.IDLE_EVENT, this);
            }
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f40989a;

        /* renamed from: b  reason: collision with root package name */
        private long f40990b;

        /* renamed from: c  reason: collision with root package name */
        private final int f40991c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f40992d;

        public d(int i10, long j10, int i11, boolean z10) {
            this.f40989a = i10;
            this.f40990b = j10;
            this.f40991c = i11;
            this.f40992d = z10;
        }

        public final int a() {
            return this.f40991c;
        }

        public final boolean b() {
            return this.f40992d;
        }

        public final long c() {
            return this.f40990b;
        }

        public final int d() {
            return this.f40989a;
        }

        public final void e(long j10) {
            this.f40990b = j10;
        }
    }

    private final class e implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        private WritableArray f40993a;

        public e() {
        }

        public void doFrame(long j10) {
            if (!JavaTimerManager.this.f40976h.get() || JavaTimerManager.this.f40977i.get()) {
                long j11 = j10 / ((long) UtilsKt.MICROS_MULTIPLIER);
                Object l10 = JavaTimerManager.this.f40973e;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (l10) {
                    while (true) {
                        try {
                            if (javaTimerManager.f40984p.isEmpty()) {
                                break;
                            }
                            Object peek = javaTimerManager.f40984p.peek();
                            C6496s.e(peek);
                            if (((d) peek).c() >= j11) {
                                break;
                            }
                            d dVar = (d) javaTimerManager.f40984p.poll();
                            if (dVar == null) {
                                break;
                            }
                            if (this.f40993a == null) {
                                this.f40993a = Arguments.createArray();
                            }
                            WritableArray writableArray = this.f40993a;
                            if (writableArray != null) {
                                writableArray.pushInt(dVar.d());
                            }
                            if (dVar.b()) {
                                dVar.e(((long) dVar.a()) + j11);
                                javaTimerManager.f40984p.add(dVar);
                            } else {
                                javaTimerManager.f40975g.remove(dVar.d());
                            }
                        } finally {
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                }
                WritableArray writableArray2 = this.f40993a;
                if (writableArray2 != null) {
                    JavaTimerManager.this.f40970b.callTimers(writableArray2);
                    this.f40993a = null;
                }
                JavaTimerManager.this.f40971c.k(b.a.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(ReactApplicationContext reactApplicationContext, U7.d dVar, b bVar, I7.e eVar) {
        C6496s.h(reactApplicationContext, "reactApplicationContext");
        C6496s.h(dVar, "javaScriptTimerExecutor");
        C6496s.h(bVar, "reactChoreographer");
        C6496s.h(eVar, "devSupportManager");
        this.f40969a = reactApplicationContext;
        this.f40970b = dVar;
        this.f40971c = bVar;
        this.f40972d = eVar;
        reactApplicationContext.addLifecycleEventListener(this);
        P7.c.f(reactApplicationContext).d(this);
    }

    /* access modifiers changed from: private */
    public static final void A(JavaTimerManager javaTimerManager, boolean z10) {
        synchronized (javaTimerManager.f40974f) {
            if (z10) {
                try {
                    javaTimerManager.z();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                javaTimerManager.r();
            }
            C6514M m10 = C6514M.f71813a;
        }
    }

    /* access modifiers changed from: private */
    public static final int B(d dVar, d dVar2) {
        return Af.a.b(dVar.c() - dVar2.c());
    }

    /* access modifiers changed from: private */
    public static final int C(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final void r() {
        if (this.f40982n) {
            this.f40971c.n(b.a.IDLE_EVENT, this.f40979k);
            this.f40982n = false;
        }
    }

    private final void s() {
        P7.c f10 = P7.c.f(this.f40969a);
        if (this.f40981m && this.f40976h.get() && !f10.g()) {
            this.f40971c.n(b.a.TIMERS_EVENTS, this.f40978j);
            this.f40981m = false;
        }
    }

    private final void v() {
        if (this.f40976h.get() && !this.f40977i.get()) {
            s();
        }
    }

    private final void w() {
        synchronized (this.f40974f) {
            try {
                if (this.f40983o) {
                    z();
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void y() {
        if (!this.f40981m) {
            this.f40971c.k(b.a.TIMERS_EVENTS, this.f40978j);
            this.f40981m = true;
        }
    }

    private final void z() {
        if (!this.f40982n) {
            this.f40971c.k(b.a.IDLE_EVENT, this.f40979k);
            this.f40982n = true;
        }
    }

    public void a(int i10) {
        if (!this.f40977i.getAndSet(true)) {
            y();
            w();
        }
    }

    public void b(int i10) {
        if (!P7.c.f(this.f40969a).g()) {
            this.f40977i.set(false);
            s();
            v();
        }
    }

    @B7.a
    public void createTimer(int i10, long j10, boolean z10) {
        d dVar = new d(i10, (k.b() / ((long) UtilsKt.MICROS_MULTIPLIER)) + j10, (int) j10, z10);
        synchronized (this.f40973e) {
            this.f40984p.add(dVar);
            this.f40975g.put(i10, dVar);
            C6514M m10 = C6514M.f71813a;
        }
    }

    @B7.a
    public void deleteTimer(int i10) {
        synchronized (this.f40973e) {
            d dVar = (d) this.f40975g.get(i10);
            if (dVar != null) {
                this.f40975g.remove(i10);
                this.f40984p.remove(dVar);
            }
        }
    }

    public void onHostDestroy() {
        s();
        v();
    }

    public void onHostPause() {
        this.f40976h.set(true);
        s();
        v();
    }

    public void onHostResume() {
        this.f40976h.set(false);
        y();
        w();
    }

    @B7.a
    public void setSendIdleEvents(boolean z10) {
        synchronized (this.f40974f) {
            this.f40983o = z10;
            C6514M m10 = C6514M.f71813a;
        }
        UiThreadUtil.runOnUiThread(new f(this, z10));
    }

    public void t(int i10, int i11, double d10, boolean z10) {
        long a10 = k.a();
        long j10 = (long) d10;
        if (this.f40972d.o() && Math.abs(j10 - a10) > 60000) {
            this.f40970b.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0, (j10 - a10) + ((long) i11));
        if (i11 != 0 || z10) {
            createTimer(i10, max, z10);
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i10);
        U7.d dVar = this.f40970b;
        C6496s.e(createArray);
        dVar.callTimers(createArray);
    }

    public final boolean u(long j10) {
        synchronized (this.f40973e) {
            d dVar = (d) this.f40984p.peek();
            if (dVar == null) {
                return false;
            }
            if (f40968q.b(dVar, j10)) {
                return true;
            }
            Iterator it = this.f40984p.iterator();
            C6496s.g(it, "iterator(...)");
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                a aVar = f40968q;
                C6496s.e(dVar2);
                if (aVar.b(dVar2, j10)) {
                    return true;
                }
            }
            C6514M m10 = C6514M.f71813a;
            return false;
        }
    }

    public void x() {
        P7.c.f(this.f40969a).j(this);
        this.f40969a.removeLifecycleEventListener(this);
        s();
        r();
    }
}
