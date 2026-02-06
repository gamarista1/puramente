package com.google.firebase.iid;

import Fa.C4287b;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.u;
import com.revenuecat.purchases.common.Constants;
import hc.C5010a;
import ic.C5027b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import jc.C5046e;
import ub.C5230g;

@Deprecated
public class FirebaseInstanceId {

    /* renamed from: i  reason: collision with root package name */
    private static final long f57278i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    private static u f57279j;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f57280k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: l  reason: collision with root package name */
    static ScheduledExecutorService f57281l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f57282m = 0;

    /* renamed from: a  reason: collision with root package name */
    final Executor f57283a;

    /* renamed from: b  reason: collision with root package name */
    private final C5230g f57284b;

    /* renamed from: c  reason: collision with root package name */
    private final n f57285c;

    /* renamed from: d  reason: collision with root package name */
    private final k f57286d;

    /* renamed from: e  reason: collision with root package name */
    private final s f57287e;

    /* renamed from: f  reason: collision with root package name */
    private final C5046e f57288f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57289g;

    /* renamed from: h  reason: collision with root package name */
    private final List f57290h;

    FirebaseInstanceId(C5230g gVar, n nVar, Executor executor, Executor executor2, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this.f57289g = false;
        this.f57290h = new ArrayList();
        if (n.c(gVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f57279j == null) {
                        f57279j = new u(gVar.m());
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
            this.f57284b = gVar;
            this.f57285c = nVar;
            this.f57286d = new k(gVar, nVar, bVar, bVar2, eVar);
            this.f57283a = executor2;
            this.f57287e = new s(executor);
            this.f57288f = eVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private static String A(String str) {
        if (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) {
            return "*";
        }
        return str;
    }

    private Object b(Task task) {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    B();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static Object c(Task task) {
        C4536s.m(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(d.f57297a, new e(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return l(task);
    }

    private static void e(C5230g gVar) {
        C4536s.g(gVar.r().g(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C4536s.g(gVar.r().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C4536s.g(gVar.r().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C4536s.b(u(gVar.r().c()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C4536s.b(t(gVar.r().b()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(C5230g gVar) {
        e(gVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) gVar.k(FirebaseInstanceId.class);
        C4536s.m(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    private Task k(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.f57283a, new c(this, str, A(str2)));
    }

    private static Object l(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    private String m() {
        if ("[DEFAULT]".equals(this.f57284b.q())) {
            return "";
        }
        return this.f57284b.s();
    }

    static boolean r() {
        return Log.isLoggable("FirebaseInstanceId", 3);
    }

    static boolean t(String str) {
        return f57280k.matcher(str).matches();
    }

    static boolean u(String str) {
        return str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
    }

    /* access modifiers changed from: package-private */
    public synchronized void B() {
        f57279j.d();
    }

    /* access modifiers changed from: package-private */
    public synchronized void C(boolean z10) {
        this.f57289g = z10;
    }

    /* access modifiers changed from: package-private */
    public synchronized void D() {
        if (!this.f57289g) {
            E(0);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void E(long j10) {
        g(new v(this, Math.min(Math.max(30, j10 + j10), f57278i)), j10);
        this.f57289g = true;
    }

    /* access modifiers changed from: package-private */
    public boolean F(u.a aVar) {
        if (aVar == null || aVar.c(this.f57285c.a())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(C5010a.C0892a aVar) {
        this.f57290h.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return o(n.c(this.f57284b), "*");
    }

    public void f(String str, String str2) {
        e(this.f57284b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String A10 = A(str2);
            b(this.f57286d.b(i(), str, A10));
            f57279j.e(m(), str, A10);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void g(Runnable runnable, long j10) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f57281l == null) {
                    f57281l = new ScheduledThreadPoolExecutor(1, new C4287b("FirebaseInstanceId"));
                }
                f57281l.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5230g h() {
        return this.f57284b;
    }

    /* access modifiers changed from: package-private */
    public String i() {
        try {
            f57279j.j(this.f57284b.s());
            return (String) c(this.f57288f.getId());
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public Task j() {
        e(this.f57284b);
        return k(n.c(this.f57284b), "*");
    }

    public String n() {
        e(this.f57284b);
        u.a p10 = p();
        if (F(p10)) {
            D();
        }
        return u.a.b(p10);
    }

    public String o(String str, String str2) {
        e(this.f57284b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((l) b(k(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public u.a p() {
        return q(n.c(this.f57284b), "*");
    }

    /* access modifiers changed from: package-private */
    public u.a q(String str, String str2) {
        return f57279j.g(m(), str, str2);
    }

    public boolean s() {
        return this.f57285c.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task w(String str, String str2, String str3, String str4) {
        f57279j.i(m(), str, str2, str4, this.f57285c.a());
        return Tasks.forResult(new m(str3, str4));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x(u.a aVar, l lVar) {
        String a10 = lVar.a();
        if (aVar == null || !a10.equals(aVar.f57339a)) {
            for (C5010a.C0892a a11 : this.f57290h) {
                a11.a(a10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task y(String str, String str2, String str3, u.a aVar) {
        return this.f57286d.e(str, str2, str3).onSuccessTask(this.f57283a, new g(this, str2, str3, str)).addOnSuccessListener(h.f57308a, new i(this, aVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task z(String str, String str2, Task task) {
        String i10 = i();
        u.a q10 = q(str, str2);
        if (!F(q10)) {
            return Tasks.forResult(new m(i10, q10.f57339a));
        }
        return this.f57287e.a(str, str2, new f(this, i10, str, str2, q10));
    }

    FirebaseInstanceId(C5230g gVar, C5027b bVar, C5027b bVar2, C5046e eVar) {
        this(gVar, new n(gVar.m()), b.b(), b.b(), bVar, bVar2, eVar);
    }
}
