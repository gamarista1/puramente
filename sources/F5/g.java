package F5;

import D5.s;
import J5.e;
import Sg.p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.I;
import com.facebook.V;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import o7.C3884A;
import o7.C3902s;
import o7.C3906w;
import o7.J;
import o7.W;
import t5.C4039p;
import u5.C4087b;
import w5.C4133e;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f30749a = new g();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f30750b;

    /* renamed from: c  reason: collision with root package name */
    private static final ScheduledExecutorService f30751c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d  reason: collision with root package name */
    private static final ScheduledExecutorService f30752d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e  reason: collision with root package name */
    private static volatile ScheduledFuture f30753e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f30754f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicInteger f30755g = new AtomicInteger(0);

    /* renamed from: h  reason: collision with root package name */
    private static volatile n f30756h;

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicBoolean f30757i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private static String f30758j;

    /* renamed from: k  reason: collision with root package name */
    private static long f30759k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static int f30760l;

    /* renamed from: m  reason: collision with root package name */
    private static WeakReference f30761m;

    /* renamed from: n  reason: collision with root package name */
    private static String f30762n;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityCreated");
            h.a();
            g.q(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C6496s.h(activity, "activity");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityDestroyed");
            g.f30749a.s(activity);
        }

        public void onActivityPaused(Activity activity) {
            C6496s.h(activity, "activity");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityPaused");
            h.a();
            g.f30749a.t(activity);
        }

        public void onActivityResumed(Activity activity) {
            C6496s.h(activity, "activity");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityResumed");
            h.a();
            g.w(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            C6496s.h(bundle, "outState");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C6496s.h(activity, "activity");
            g.f30760l = g.f30760l + 1;
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C6496s.h(activity, "activity");
            J.f47112e.b(V.APP_EVENTS, g.f30750b, "onActivityStopped");
            C4039p.f48255b.h();
            g.f30760l = g.f30760l - 1;
        }
    }

    static {
        String canonicalName = g.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f30750b = canonicalName;
    }

    private g() {
    }

    /* access modifiers changed from: private */
    public static final void A(boolean z10) {
        if (z10) {
            C4133e.f();
        } else {
            C4133e.e();
        }
    }

    private final void l() {
        ScheduledFuture scheduledFuture;
        synchronized (f30754f) {
            try {
                if (!(f30753e == null || (scheduledFuture = f30753e) == null)) {
                    scheduledFuture.cancel(false);
                }
                f30753e = null;
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final Activity m() {
        WeakReference weakReference = f30761m;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public static final UUID n() {
        n nVar;
        if (f30756h == null || (nVar = f30756h) == null) {
            return null;
        }
        return nVar.d();
    }

    private final int o() {
        C3906w f10 = C3884A.f(I.m());
        if (f10 == null) {
            return l.a();
        }
        return f10.w();
    }

    public static final boolean p() {
        if (f30760l == 0) {
            return true;
        }
        return false;
    }

    public static final void q(Activity activity) {
        f30751c.execute(new e());
    }

    /* access modifiers changed from: private */
    public static final void r() {
        if (f30756h == null) {
            f30756h = n.f30784g.b();
        }
    }

    /* access modifiers changed from: private */
    public final void s(Activity activity) {
        C4133e.j(activity);
    }

    /* access modifiers changed from: private */
    public final void t(Activity activity) {
        AtomicInteger atomicInteger = f30755g;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f30750b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        l();
        long currentTimeMillis = System.currentTimeMillis();
        String u10 = W.u(activity);
        C4133e.k(activity);
        f30751c.execute(new d(currentTimeMillis, u10));
    }

    /* access modifiers changed from: private */
    public static final void u(long j10, String str) {
        C6496s.h(str, "$activityName");
        if (f30756h == null) {
            f30756h = new n(Long.valueOf(j10), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
        }
        n nVar = f30756h;
        if (nVar != null) {
            nVar.k(Long.valueOf(j10));
        }
        if (f30755g.get() <= 0) {
            f fVar = new f(j10, str);
            synchronized (f30754f) {
                f30753e = f30751c.schedule(fVar, (long) f30749a.o(), TimeUnit.SECONDS);
                C6514M m10 = C6514M.f71813a;
            }
        }
        long j11 = f30759k;
        long j12 = 0;
        if (j11 > 0) {
            j12 = (j10 - j11) / ((long) 1000);
        }
        k.i(str, j12);
        n nVar2 = f30756h;
        if (nVar2 != null) {
            nVar2.m();
        }
    }

    /* access modifiers changed from: private */
    public static final void v(long j10, String str) {
        C6496s.h(str, "$activityName");
        if (f30756h == null) {
            f30756h = new n(Long.valueOf(j10), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
        }
        if (f30755g.get() <= 0) {
            o.d(str, f30756h, f30758j);
            n.f30784g.a();
            f30756h = null;
        }
        synchronized (f30754f) {
            f30753e = null;
            C6514M m10 = C6514M.f71813a;
        }
    }

    public static final void w(Activity activity) {
        C6496s.h(activity, "activity");
        f30761m = new WeakReference(activity);
        f30755g.incrementAndGet();
        f30749a.l();
        long currentTimeMillis = System.currentTimeMillis();
        f30759k = currentTimeMillis;
        String u10 = W.u(activity);
        C4133e.l(activity);
        C4087b.d(activity);
        e.h(activity);
        String str = f30762n;
        if (str != null && p.O(str, "ProxyBillingActivity", false, 2, (Object) null) && !C6496s.c(u10, "ProxyBillingActivity")) {
            f30752d.execute(new b());
        }
        f30751c.execute(new c(currentTimeMillis, u10, activity.getApplicationContext()));
        f30762n = u10;
    }

    /* access modifiers changed from: private */
    public static final void x() {
        s.h();
    }

    /* access modifiers changed from: private */
    public static final void y(long j10, String str, Context context) {
        Long l10;
        n nVar;
        C6496s.h(str, "$activityName");
        n nVar2 = f30756h;
        if (nVar2 != null) {
            l10 = nVar2.e();
        } else {
            l10 = null;
        }
        if (f30756h == null) {
            f30756h = new n(Long.valueOf(j10), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
            String str2 = f30758j;
            C6496s.g(context, "appContext");
            o.b(str, (p) null, str2, context);
        } else if (l10 != null) {
            long longValue = j10 - l10.longValue();
            if (longValue > ((long) (f30749a.o() * 1000))) {
                o.d(str, f30756h, f30758j);
                String str3 = f30758j;
                C6496s.g(context, "appContext");
                o.b(str, (p) null, str3, context);
                f30756h = new n(Long.valueOf(j10), (Long) null, (UUID) null, 4, (DefaultConstructorMarker) null);
            } else if (longValue > 1000 && (nVar = f30756h) != null) {
                nVar.h();
            }
        }
        n nVar3 = f30756h;
        if (nVar3 != null) {
            nVar3.k(Long.valueOf(j10));
        }
        n nVar4 = f30756h;
        if (nVar4 != null) {
            nVar4.m();
        }
    }

    public static final void z(Application application, String str) {
        C6496s.h(application, "application");
        if (f30757i.compareAndSet(false, true)) {
            C3902s.a(C3902s.b.CodelessEvents, new a());
            f30758j = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
