package com.google.firebase.perf.application;

import Ac.c;
import Ac.g;
import Ac.j;
import Ac.l;
import Bc.d;
import Bc.m;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.C1773v;
import androidx.fragment.app.J;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import uc.C5233a;
import vc.C5253f;
import zc.C5313k;

public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r  reason: collision with root package name */
    private static final C5233a f57610r = C5233a.e();

    /* renamed from: s  reason: collision with root package name */
    private static volatile a f57611s;

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap f57612a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakHashMap f57613b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap f57614c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap f57615d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f57616e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f57617f;

    /* renamed from: g  reason: collision with root package name */
    private Set f57618g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f57619h;

    /* renamed from: i  reason: collision with root package name */
    private final C5313k f57620i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f57621j;

    /* renamed from: k  reason: collision with root package name */
    private final Ac.a f57622k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f57623l;

    /* renamed from: m  reason: collision with root package name */
    private l f57624m;

    /* renamed from: n  reason: collision with root package name */
    private l f57625n;

    /* renamed from: o  reason: collision with root package name */
    private d f57626o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f57627p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f57628q;

    /* renamed from: com.google.firebase.perf.application.a$a  reason: collision with other inner class name */
    public interface C0859a {
        void a();
    }

    public interface b {
        void onUpdateAppState(d dVar);
    }

    a(C5313k kVar, Ac.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.g(), g());
    }

    public static a b() {
        if (f57611s == null) {
            synchronized (a.class) {
                try {
                    if (f57611s == null) {
                        f57611s = new a(C5313k.k(), new Ac.a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f57611s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private static boolean g() {
        return d.a();
    }

    private void l() {
        synchronized (this.f57618g) {
            try {
                for (C0859a aVar : this.f57618g) {
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } finally {
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = (Trace) this.f57615d.get(activity);
        if (trace != null) {
            this.f57615d.remove(activity);
            g e10 = ((d) this.f57613b.get(activity)).e();
            if (!e10.d()) {
                f57610r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            j.a(trace, (C5253f.a) e10.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f57621j.K()) {
            m.b B10 = m.z0().J(str).H(lVar.e()).I(lVar.d(lVar2)).B(SessionManager.getInstance().perfSession().a());
            int andSet = this.f57619h.getAndSet(0);
            synchronized (this.f57616e) {
                try {
                    B10.D(this.f57616e);
                    if (andSet != 0) {
                        B10.F(Ac.b.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                    }
                    this.f57616e.clear();
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            this.f57620i.C((m) B10.q(), d.FOREGROUND_BACKGROUND);
        }
    }

    private void o(Activity activity) {
        if (h() && this.f57621j.K()) {
            d dVar = new d(activity);
            this.f57613b.put(activity, dVar);
            if (activity instanceof C1773v) {
                c cVar = new c(this.f57622k, this.f57620i, this, dVar);
                this.f57614c.put(activity, cVar);
                ((C1773v) activity).getSupportFragmentManager().n1(cVar, true);
            }
        }
    }

    private void q(d dVar) {
        this.f57626o = dVar;
        synchronized (this.f57617f) {
            try {
                Iterator it = this.f57617f.iterator();
                while (it.hasNext()) {
                    b bVar = (b) ((WeakReference) it.next()).get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f57626o);
                    } else {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public d a() {
        return this.f57626o;
    }

    public void d(String str, long j10) {
        synchronized (this.f57616e) {
            try {
                Long l10 = (Long) this.f57616e.get(str);
                if (l10 == null) {
                    this.f57616e.put(str, Long.valueOf(j10));
                } else {
                    this.f57616e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        this.f57619h.addAndGet(i10);
    }

    public boolean f() {
        return this.f57628q;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.f57623l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f57627p     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0018 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x001a
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0018 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0018 }
            r2 = 1
            r1.f57627p = r2     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r2 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.application.a.i(android.content.Context):void");
    }

    public void j(C0859a aVar) {
        synchronized (this.f57618g) {
            this.f57618g.add(aVar);
        }
    }

    public void k(WeakReference weakReference) {
        synchronized (this.f57617f) {
            this.f57617f.add(weakReference);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f57613b.remove(activity);
        if (this.f57614c.containsKey(activity)) {
            ((C1773v) activity).getSupportFragmentManager().D1((J.k) this.f57614c.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f57612a.isEmpty()) {
                this.f57624m = this.f57622k.a();
                this.f57612a.put(activity, Boolean.TRUE);
                if (this.f57628q) {
                    q(d.FOREGROUND);
                    l();
                    this.f57628q = false;
                } else {
                    n(c.BACKGROUND_TRACE_NAME.toString(), this.f57625n, this.f57624m);
                    q(d.FOREGROUND);
                }
            } else {
                this.f57612a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f57621j.K()) {
                if (!this.f57613b.containsKey(activity)) {
                    o(activity);
                }
                ((d) this.f57613b.get(activity)).c();
                Trace trace = new Trace(c(activity), this.f57620i, this.f57622k, this);
                trace.start();
                this.f57615d.put(activity, trace);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f57612a.containsKey(activity)) {
                this.f57612a.remove(activity);
                if (this.f57612a.isEmpty()) {
                    this.f57625n = this.f57622k.a();
                    n(c.FOREGROUND_TRACE_NAME.toString(), this.f57624m, this.f57625n);
                    q(d.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void p(WeakReference weakReference) {
        synchronized (this.f57617f) {
            this.f57617f.remove(weakReference);
        }
    }

    a(C5313k kVar, Ac.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f57612a = new WeakHashMap();
        this.f57613b = new WeakHashMap();
        this.f57614c = new WeakHashMap();
        this.f57615d = new WeakHashMap();
        this.f57616e = new HashMap();
        this.f57617f = new HashSet();
        this.f57618g = new HashSet();
        this.f57619h = new AtomicInteger(0);
        this.f57626o = d.BACKGROUND;
        this.f57627p = false;
        this.f57628q = true;
        this.f57620i = kVar;
        this.f57622k = aVar;
        this.f57621j = aVar2;
        this.f57623l = z10;
    }
}
