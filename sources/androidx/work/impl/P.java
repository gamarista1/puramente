package androidx.work.impl;

import O3.n;
import P3.m;
import Q3.C1342b;
import Q3.q;
import Q3.u;
import R3.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.C1836c;
import androidx.work.E;
import androidx.work.impl.background.systemjob.g;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.s;
import androidx.work.w;
import java.util.List;
import java.util.UUID;

public class P extends E {

    /* renamed from: k  reason: collision with root package name */
    private static final String f18769k = s.i("WorkManagerImpl");

    /* renamed from: l  reason: collision with root package name */
    private static P f18770l = null;

    /* renamed from: m  reason: collision with root package name */
    private static P f18771m = null;

    /* renamed from: n  reason: collision with root package name */
    private static final Object f18772n = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f18773a;

    /* renamed from: b  reason: collision with root package name */
    private C1836c f18774b;

    /* renamed from: c  reason: collision with root package name */
    private WorkDatabase f18775c;

    /* renamed from: d  reason: collision with root package name */
    private b f18776d;

    /* renamed from: e  reason: collision with root package name */
    private List f18777e;

    /* renamed from: f  reason: collision with root package name */
    private C1860u f18778f;

    /* renamed from: g  reason: collision with root package name */
    private q f18779g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18780h = false;

    /* renamed from: i  reason: collision with root package name */
    private BroadcastReceiver.PendingResult f18781i;

    /* renamed from: j  reason: collision with root package name */
    private final n f18782j;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public P(Context context, C1836c cVar, b bVar, WorkDatabase workDatabase, List list, C1860u uVar, n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (!a.a(applicationContext)) {
            s.h(new s.a(cVar.j()));
            this.f18773a = applicationContext;
            this.f18776d = bVar;
            this.f18775c = workDatabase;
            this.f18778f = uVar;
            this.f18782j = nVar;
            this.f18774b = cVar;
            this.f18777e = list;
            this.f18779g = new q(workDatabase);
            z.g(list, this.f18778f, bVar.c(), this.f18775c, cVar);
            this.f18776d.d(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static void d(Context context, C1836c cVar) {
        synchronized (f18772n) {
            try {
                P p10 = f18770l;
                if (p10 != null) {
                    if (f18771m != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                }
                if (p10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f18771m == null) {
                        f18771m = Q.c(applicationContext, cVar);
                    }
                    f18770l = f18771m;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static P h() {
        synchronized (f18772n) {
            try {
                P p10 = f18770l;
                if (p10 != null) {
                    return p10;
                }
                P p11 = f18771m;
                return p11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static P i(Context context) {
        P h10;
        synchronized (f18772n) {
            try {
                h10 = h();
                if (h10 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h10;
    }

    public w b(List list) {
        if (!list.isEmpty()) {
            return new C(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public w e(UUID uuid) {
        C1342b b10 = C1342b.b(uuid, this);
        this.f18776d.d(b10);
        return b10.d();
    }

    public Context f() {
        return this.f18773a;
    }

    public C1836c g() {
        return this.f18774b;
    }

    public q j() {
        return this.f18779g;
    }

    public C1860u k() {
        return this.f18778f;
    }

    public List l() {
        return this.f18777e;
    }

    public n m() {
        return this.f18782j;
    }

    public WorkDatabase n() {
        return this.f18775c;
    }

    public b o() {
        return this.f18776d;
    }

    public void p() {
        synchronized (f18772n) {
            try {
                this.f18780h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f18781i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f18781i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q() {
        g.b(f());
        n().H().l();
        z.h(g(), n(), l());
    }

    public void r(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f18772n) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f18781i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f18781i = pendingResult;
                if (this.f18780h) {
                    pendingResult.finish();
                    this.f18781i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(m mVar) {
        this.f18776d.d(new u(this.f18778f, new A(mVar), true));
    }
}
