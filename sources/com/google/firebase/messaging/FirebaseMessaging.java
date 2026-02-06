package com.google.firebase.messaging;

import Fa.C4287b;
import W8.i;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.e0;
import dc.C4942a;
import dc.C4943b;
import dc.C4945d;
import hc.C5010a;
import ic.C5027b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jc.C5046e;
import ub.C5225b;
import ub.C5230g;
import xa.C5268a;
import xb.C5276a;

public class FirebaseMessaging {

    /* renamed from: m  reason: collision with root package name */
    private static final long f57394m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: n  reason: collision with root package name */
    private static e0 f57395n;

    /* renamed from: o  reason: collision with root package name */
    static C5027b f57396o = new C4840v();

    /* renamed from: p  reason: collision with root package name */
    static ScheduledExecutorService f57397p;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5230g f57398a;

    /* renamed from: b  reason: collision with root package name */
    private final C5010a f57399b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f57400c;

    /* renamed from: d  reason: collision with root package name */
    private final H f57401d;

    /* renamed from: e  reason: collision with root package name */
    private final Z f57402e;

    /* renamed from: f  reason: collision with root package name */
    private final a f57403f;

    /* renamed from: g  reason: collision with root package name */
    private final Executor f57404g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f57405h;

    /* renamed from: i  reason: collision with root package name */
    private final Task f57406i;

    /* renamed from: j  reason: collision with root package name */
    private final M f57407j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57408k;

    /* renamed from: l  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f57409l;

    private class a {

        /* renamed from: a  reason: collision with root package name */
        private final C4945d f57410a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f57411b;

        /* renamed from: c  reason: collision with root package name */
        private C4943b f57412c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f57413d;

        a(C4945d dVar) {
            this.f57410a = dVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(C4942a aVar) {
            if (c()) {
                FirebaseMessaging.this.Y();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m10 = FirebaseMessaging.this.f57398a.m();
            SharedPreferences sharedPreferences = m10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void b() {
            try {
                if (!this.f57411b) {
                    Boolean e10 = e();
                    this.f57413d = e10;
                    if (e10 == null) {
                        E e11 = new E(this);
                        this.f57412c = e11;
                        this.f57410a.a(C5225b.class, e11);
                    }
                    this.f57411b = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            boolean z10;
            try {
                b();
                Boolean bool = this.f57413d;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = FirebaseMessaging.this.f57398a.x();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public synchronized void f(boolean z10) {
            try {
                b();
                C4943b bVar = this.f57412c;
                if (bVar != null) {
                    this.f57410a.b(C5225b.class, bVar);
                    this.f57412c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f57398a.m().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z10);
                edit.apply();
                if (z10) {
                    FirebaseMessaging.this.Y();
                }
                this.f57413d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    FirebaseMessaging(C5230g gVar, C5010a aVar, C5027b bVar, C5027b bVar2, C5046e eVar, C5027b bVar3, C4945d dVar) {
        this(gVar, aVar, bVar, bVar2, eVar, bVar3, dVar, new M(gVar.m()));
    }

    private void A() {
        this.f57401d.f().addOnSuccessListener(this.f57404g, new C4837s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void O() {
        T.c(this.f57400c);
        V.g(this.f57400c, this.f57401d, W());
        if (W()) {
            A();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void L(String str) {
        if ("[DEFAULT]".equals(this.f57398a.q())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f57398a.q());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C4833n(this.f57400c).k(intent);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task F(String str, e0.a aVar, String str2) {
        v(this.f57400c).g(w(), str, str2, this.f57407j.a());
        if (aVar == null || !str2.equals(aVar.f57517a)) {
            L(str2);
        }
        return Tasks.forResult(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Task G(String str, e0.a aVar) {
        return this.f57401d.g().onSuccessTask(this.f57405h, new C4839u(this, str, aVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(TaskCompletionSource taskCompletionSource) {
        try {
            this.f57399b.c(M.c(this.f57398a), "FCM");
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f57401d.c());
            v(this.f57400c).d(w(), M.c(this.f57398a));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(p());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(C5268a aVar) {
        if (aVar != null) {
            L.y(aVar.o0());
            A();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M() {
        if (D()) {
            Y();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(j0 j0Var) {
        if (D()) {
            j0Var.q();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i P() {
        return null;
    }

    private boolean W() {
        T.c(this.f57400c);
        if (!T.d(this.f57400c)) {
            return false;
        }
        if (this.f57398a.k(C5276a.class) != null) {
            return true;
        }
        if (!L.a() || f57396o == null) {
            return false;
        }
        return true;
    }

    private synchronized void X() {
        if (!this.f57408k) {
            a0(0);
        }
    }

    /* access modifiers changed from: private */
    public void Y() {
        C5010a aVar = this.f57399b;
        if (aVar != null) {
            aVar.a();
        } else if (b0(y())) {
            X();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C5230g gVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) gVar.k(FirebaseMessaging.class);
            C4536s.m(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging u() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C5230g.o());
        }
        return instance;
    }

    private static synchronized e0 v(Context context) {
        e0 e0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f57395n == null) {
                    f57395n = new e0(context);
                }
                e0Var = f57395n;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return e0Var;
    }

    private String w() {
        if ("[DEFAULT]".equals(this.f57398a.q())) {
            return "";
        }
        return this.f57398a.s();
    }

    public static i z() {
        return (i) f57396o.get();
    }

    public boolean D() {
        return this.f57403f.c();
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return this.f57407j.g();
    }

    public void S(W w10) {
        if (!TextUtils.isEmpty(w10.v0())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f57400c, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            w10.x0(intent);
            this.f57400c.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void T(boolean z10) {
        this.f57403f.f(z10);
    }

    public void U(boolean z10) {
        L.B(z10);
        V.g(this.f57400c, this.f57401d, W());
    }

    /* access modifiers changed from: package-private */
    public synchronized void V(boolean z10) {
        this.f57408k = z10;
    }

    public Task Z(String str) {
        return this.f57406i.onSuccessTask(new r(str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a0(long j10) {
        s(new f0(this, Math.min(Math.max(30, 2 * j10), f57394m)), j10);
        this.f57408k = true;
    }

    /* access modifiers changed from: package-private */
    public boolean b0(e0.a aVar) {
        if (aVar == null || aVar.b(this.f57407j.a())) {
            return true;
        }
        return false;
    }

    public Task c0(String str) {
        return this.f57406i.onSuccessTask(new C4842x(str));
    }

    /* access modifiers changed from: package-private */
    public String p() {
        C5010a aVar = this.f57399b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.d());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            e0.a y10 = y();
            if (!b0(y10)) {
                return y10.f57517a;
            }
            String c10 = M.c(this.f57398a);
            try {
                return (String) Tasks.await(this.f57402e.b(c10, new C4838t(this, c10, y10)));
            } catch (InterruptedException | ExecutionException e11) {
                throw new IOException(e11);
            }
        }
    }

    public Task q() {
        if (this.f57399b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f57404g.execute(new C4843y(this, taskCompletionSource));
            return taskCompletionSource.getTask();
        } else if (y() == null) {
            return Tasks.forResult(null);
        } else {
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            C4834o.e().execute(new C4844z(this, taskCompletionSource2));
            return taskCompletionSource2.getTask();
        }
    }

    public boolean r() {
        return L.a();
    }

    /* access modifiers changed from: package-private */
    public void s(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f57397p == null) {
                    f57397p = new ScheduledThreadPoolExecutor(1, new C4287b("TAG"));
                }
                f57397p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Context t() {
        return this.f57400c;
    }

    public Task x() {
        C5010a aVar = this.f57399b;
        if (aVar != null) {
            return aVar.d();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f57404g.execute(new C4841w(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public e0.a y() {
        return v(this.f57400c).e(w(), M.c(this.f57398a));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(ub.C5230g r11, hc.C5010a r12, ic.C5027b r13, ic.C5027b r14, jc.C5046e r15, ic.C5027b r16, dc.C4945d r17, com.google.firebase.messaging.M r18) {
        /*
            r10 = this;
            com.google.firebase.messaging.H r6 = new com.google.firebase.messaging.H
            r0 = r6
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r7 = com.google.firebase.messaging.C4834o.f()
            java.util.concurrent.ScheduledExecutorService r8 = com.google.firebase.messaging.C4834o.c()
            java.util.concurrent.Executor r9 = com.google.firebase.messaging.C4834o.b()
            r0 = r10
            r2 = r12
            r3 = r16
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(ub.g, hc.a, ic.b, ic.b, jc.e, ic.b, dc.d, com.google.firebase.messaging.M):void");
    }

    FirebaseMessaging(C5230g gVar, C5010a aVar, C5027b bVar, C4945d dVar, M m10, H h10, Executor executor, Executor executor2, Executor executor3) {
        this.f57408k = false;
        f57396o = bVar;
        this.f57398a = gVar;
        this.f57399b = aVar;
        this.f57403f = new a(dVar);
        Context m11 = gVar.m();
        this.f57400c = m11;
        C4836q qVar = new C4836q();
        this.f57409l = qVar;
        this.f57407j = m10;
        this.f57401d = h10;
        this.f57402e = new Z(executor);
        this.f57404g = executor2;
        this.f57405h = executor3;
        Context m12 = gVar.m();
        if (m12 instanceof Application) {
            ((Application) m12).registerActivityLifecycleCallbacks(qVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + m12 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new A(this));
        }
        executor2.execute(new B(this));
        Task f10 = j0.f(this, m10, h10, m11, C4834o.g());
        this.f57406i = f10;
        f10.addOnSuccessListener(executor2, new C(this));
        executor2.execute(new D(this));
    }
}
