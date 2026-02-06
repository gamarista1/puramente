package com.google.firebase.perf.metrics;

import Ac.l;
import Bc.d;
import Bc.m;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1797u;
import androidx.lifecycle.F;
import androidx.lifecycle.J;
import com.revenuecat.purchases.common.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ub.C5230g;
import ub.r;
import vc.C5252e;
import yc.C5293a;
import zc.C5313k;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, C1797u {

    /* renamed from: A  reason: collision with root package name */
    private static volatile AppStartTrace f57674A;

    /* renamed from: B  reason: collision with root package name */
    private static ExecutorService f57675B;

    /* renamed from: y  reason: collision with root package name */
    private static final l f57676y = new Ac.a().a();

    /* renamed from: z  reason: collision with root package name */
    private static final long f57677z = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: a  reason: collision with root package name */
    private boolean f57678a = false;

    /* renamed from: b  reason: collision with root package name */
    private final C5313k f57679b;

    /* renamed from: c  reason: collision with root package name */
    private final Ac.a f57680c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.firebase.perf.config.a f57681d;

    /* renamed from: e  reason: collision with root package name */
    private final m.b f57682e;

    /* renamed from: f  reason: collision with root package name */
    private Context f57683f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference f57684g;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference f57685h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57686i = false;

    /* renamed from: j  reason: collision with root package name */
    private final l f57687j;

    /* renamed from: k  reason: collision with root package name */
    private final l f57688k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public l f57689l;

    /* renamed from: m  reason: collision with root package name */
    private l f57690m;

    /* renamed from: n  reason: collision with root package name */
    private l f57691n;

    /* renamed from: o  reason: collision with root package name */
    private l f57692o;

    /* renamed from: p  reason: collision with root package name */
    private l f57693p;

    /* renamed from: q  reason: collision with root package name */
    private l f57694q;

    /* renamed from: r  reason: collision with root package name */
    private l f57695r;

    /* renamed from: s  reason: collision with root package name */
    private l f57696s;

    /* renamed from: t  reason: collision with root package name */
    private C5293a f57697t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f57698u;

    /* renamed from: v  reason: collision with root package name */
    private int f57699v;

    /* renamed from: w  reason: collision with root package name */
    private final b f57700w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f57701x;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final AppStartTrace f57703a;

        public c(AppStartTrace appStartTrace) {
            this.f57703a = appStartTrace;
        }

        public void run() {
            if (this.f57703a.f57689l == null) {
                boolean unused = this.f57703a.f57698u = true;
            }
        }
    }

    AppStartTrace(C5313k kVar, Ac.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        l lVar = null;
        this.f57689l = null;
        this.f57690m = null;
        this.f57691n = null;
        this.f57692o = null;
        this.f57693p = null;
        this.f57694q = null;
        this.f57695r = null;
        this.f57696s = null;
        this.f57698u = false;
        this.f57699v = 0;
        this.f57700w = new b();
        this.f57701x = false;
        this.f57679b = kVar;
        this.f57680c = aVar;
        this.f57681d = aVar2;
        f57675B = executorService;
        this.f57682e = m.z0().J("_experiment_app_start_ttid");
        this.f57687j = l.f(Process.getStartElapsedRealtime());
        r rVar = (r) C5230g.o().k(r.class);
        this.f57688k = rVar != null ? l.f(rVar.b()) : lVar;
    }

    static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.f57699v;
        appStartTrace.f57699v = i10 + 1;
        return i10;
    }

    private l j() {
        l lVar = this.f57688k;
        if (lVar != null) {
            return lVar;
        }
        return f57676y;
    }

    public static AppStartTrace k() {
        if (f57674A != null) {
            return f57674A;
        }
        return l(C5313k.k(), new Ac.a());
    }

    static AppStartTrace l(C5313k kVar, Ac.a aVar) {
        if (f57674A == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f57674A == null) {
                        f57674A = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, f57677z + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f57674A;
    }

    private l m() {
        l lVar = this.f57687j;
        if (lVar != null) {
            return lVar;
        }
        return j();
    }

    public static boolean o(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(m.b bVar) {
        this.f57679b.C((m) bVar.q(), d.FOREGROUND_BACKGROUND);
    }

    /* access modifiers changed from: private */
    public void q() {
        m.b I10 = m.z0().J(Ac.c.APP_START_TRACE_NAME.toString()).H(j().e()).I(j().d(this.f57691n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((m) m.z0().J(Ac.c.ON_CREATE_TRACE_NAME.toString()).H(j().e()).I(j().d(this.f57689l)).q());
        if (this.f57690m != null) {
            m.b z02 = m.z0();
            z02.J(Ac.c.ON_START_TRACE_NAME.toString()).H(this.f57689l.e()).I(this.f57689l.d(this.f57690m));
            arrayList.add((m) z02.q());
            m.b z03 = m.z0();
            z03.J(Ac.c.ON_RESUME_TRACE_NAME.toString()).H(this.f57690m.e()).I(this.f57690m.d(this.f57691n));
            arrayList.add((m) z03.q());
        }
        I10.A(arrayList).B(this.f57697t.a());
        this.f57679b.C((m) I10.q(), d.FOREGROUND_BACKGROUND);
    }

    private void r(m.b bVar) {
        if (this.f57694q != null && this.f57695r != null && this.f57696s != null) {
            f57675B.execute(new C5252e(this, bVar));
            w();
        }
    }

    /* access modifiers changed from: private */
    public void s() {
        String str;
        if (this.f57696s == null) {
            this.f57696s = this.f57680c.a();
            this.f57682e.C((m) m.z0().J("_experiment_onDrawFoQ").H(m().e()).I(m().d(this.f57696s)).q());
            if (this.f57687j != null) {
                this.f57682e.C((m) m.z0().J("_experiment_procStart_to_classLoad").H(m().e()).I(m().d(j())).q());
            }
            m.b bVar = this.f57682e;
            if (this.f57701x) {
                str = com.amazon.a.a.o.b.f37475af;
            } else {
                str = com.amazon.a.a.o.b.f37476ag;
            }
            bVar.G("systemDeterminedForeground", str);
            this.f57682e.F("onDrawCount", (long) this.f57699v);
            this.f57682e.B(this.f57697t.a());
            r(this.f57682e);
        }
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* access modifiers changed from: private */
    public void t() {
        if (this.f57694q == null) {
            this.f57694q = this.f57680c.a();
            this.f57682e.H(m().e()).I(m().d(this.f57694q));
            r(this.f57682e);
        }
    }

    /* access modifiers changed from: private */
    public void u() {
        if (this.f57695r == null) {
            this.f57695r = this.f57680c.a();
            this.f57682e.C((m) m.z0().J("_experiment_preDrawFoQ").H(m().e()).I(m().d(this.f57695r)).q());
            r(this.f57682e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[Catch:{ all -> 0x001a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f57698u     // Catch:{ all -> 0x001a }
            if (r5 != 0) goto L_0x0042
            Ac.l r5 = r3.f57689l     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x000a
            goto L_0x0042
        L_0x000a:
            boolean r5 = r3.f57701x     // Catch:{ all -> 0x001a }
            r0 = 1
            if (r5 != 0) goto L_0x001c
            android.content.Context r5 = r3.f57683f     // Catch:{ all -> 0x001a }
            boolean r5 = o(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r5 = 0
            goto L_0x001d
        L_0x001a:
            r4 = move-exception
            goto L_0x0044
        L_0x001c:
            r5 = r0
        L_0x001d:
            r3.f57701x = r5     // Catch:{ all -> 0x001a }
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            r3.f57684g = r5     // Catch:{ all -> 0x001a }
            Ac.a r4 = r3.f57680c     // Catch:{ all -> 0x001a }
            Ac.l r4 = r4.a()     // Catch:{ all -> 0x001a }
            r3.f57689l = r4     // Catch:{ all -> 0x001a }
            Ac.l r4 = r3.m()     // Catch:{ all -> 0x001a }
            Ac.l r5 = r3.f57689l     // Catch:{ all -> 0x001a }
            long r4 = r4.d(r5)     // Catch:{ all -> 0x001a }
            long r1 = f57677z     // Catch:{ all -> 0x001a }
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0040
            r3.f57686i = r0     // Catch:{ all -> 0x001a }
        L_0x0040:
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.f57698u && !this.f57686i && this.f57681d.h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f57700w);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f57698u     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r5.f57686i     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x000b
            goto L_0x00a2
        L_0x000b:
            com.google.firebase.perf.config.a r0 = r5.f57681d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.h()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x003b
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x0039 }
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.metrics.AppStartTrace$b r3 = r5.f57700w     // Catch:{ all -> 0x0039 }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x0039 }
            vc.a r2 = new vc.a     // Catch:{ all -> 0x0039 }
            r2.<init>(r5)     // Catch:{ all -> 0x0039 }
            Ac.e.e(r1, r2)     // Catch:{ all -> 0x0039 }
            vc.b r2 = new vc.b     // Catch:{ all -> 0x0039 }
            r2.<init>(r5)     // Catch:{ all -> 0x0039 }
            vc.c r3 = new vc.c     // Catch:{ all -> 0x0039 }
            r3.<init>(r5)     // Catch:{ all -> 0x0039 }
            Ac.h.a(r1, r2, r3)     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r6 = move-exception
            goto L_0x00a4
        L_0x003b:
            Ac.l r1 = r5.f57691n     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0041
            monitor-exit(r5)
            return
        L_0x0041:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0039 }
            r1.<init>(r6)     // Catch:{ all -> 0x0039 }
            r5.f57685h = r1     // Catch:{ all -> 0x0039 }
            Ac.a r1 = r5.f57680c     // Catch:{ all -> 0x0039 }
            Ac.l r1 = r1.a()     // Catch:{ all -> 0x0039 }
            r5.f57691n = r1     // Catch:{ all -> 0x0039 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x0039 }
            yc.a r1 = r1.perfSession()     // Catch:{ all -> 0x0039 }
            r5.f57697t = r1     // Catch:{ all -> 0x0039 }
            uc.a r1 = uc.C5233a.e()     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r2.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0039 }
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            Ac.l r6 = r5.j()     // Catch:{ all -> 0x0039 }
            Ac.l r3 = r5.f57691n     // Catch:{ all -> 0x0039 }
            long r3 = r6.d(r3)     // Catch:{ all -> 0x0039 }
            r2.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x0039 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0039 }
            r1.a(r6)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.ExecutorService r6 = f57675B     // Catch:{ all -> 0x0039 }
            vc.d r1 = new vc.d     // Catch:{ all -> 0x0039 }
            r1.<init>(r5)     // Catch:{ all -> 0x0039 }
            r6.execute(r1)     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x00a0
            r5.w()     // Catch:{ all -> 0x0039 }
        L_0x00a0:
            monitor-exit(r5)
            return
        L_0x00a2:
            monitor-exit(r5)
            return
        L_0x00a4:
            monitor-exit(r5)     // Catch:{ all -> 0x0039 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f57698u     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            Ac.l r1 = r0.f57690m     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r0.f57686i     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            Ac.a r1 = r0.f57680c     // Catch:{ all -> 0x0018 }
            Ac.l r1 = r1.a()     // Catch:{ all -> 0x0018 }
            r0.f57690m = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return
        L_0x0018:
            r1 = move-exception
            goto L_0x001c
        L_0x001a:
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @F(C1790m.a.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f57698u && !this.f57686i && this.f57693p == null) {
            this.f57693p = this.f57680c.a();
            this.f57682e.C((m) m.z0().J("_experiment_firstBackgrounding").H(m().e()).I(m().d(this.f57693p)).q());
        }
    }

    @F(C1790m.a.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f57698u && !this.f57686i && this.f57692o == null) {
            this.f57692o = this.f57680c.a();
            this.f57682e.C((m) m.z0().J("_experiment_firstForegrounding").H(m().e()).I(m().d(this.f57692o)).q());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void v(android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f57678a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            androidx.lifecycle.v r0 = androidx.lifecycle.J.l()     // Catch:{ all -> 0x002e }
            androidx.lifecycle.m r0 = r0.getLifecycle()     // Catch:{ all -> 0x002e }
            r0.a(r2)     // Catch:{ all -> 0x002e }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x002e }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0037
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x002e }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x002e }
            boolean r0 = r2.f57701x     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 != 0) goto L_0x0030
            boolean r0 = o(r3)     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = 0
            goto L_0x0031
        L_0x002e:
            r3 = move-exception
            goto L_0x0039
        L_0x0030:
            r0 = r1
        L_0x0031:
            r2.f57701x = r0     // Catch:{ all -> 0x002e }
            r2.f57678a = r1     // Catch:{ all -> 0x002e }
            r2.f57683f = r3     // Catch:{ all -> 0x002e }
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.v(android.content.Context):void");
    }

    public synchronized void w() {
        if (this.f57678a) {
            J.l().getLifecycle().d(this);
            ((Application) this.f57683f).unregisterActivityLifecycleCallbacks(this);
            this.f57678a = false;
        }
    }
}
