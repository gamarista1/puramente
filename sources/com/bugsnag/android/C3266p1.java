package com.bugsnag.android;

import K4.g;
import K4.j;
import K4.k;
import K4.t;
import android.app.Activity;
import com.bugsnag.android.v1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.UUID;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.bugsnag.android.p1  reason: case insensitive filesystem */
class C3266p1 extends C3261o implements j.a {

    /* renamed from: a  reason: collision with root package name */
    private final Deque f38808a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38809b;

    /* renamed from: c  reason: collision with root package name */
    private final k f38810c;

    /* renamed from: d  reason: collision with root package name */
    private final C3284z f38811d;

    /* renamed from: e  reason: collision with root package name */
    private final A f38812e;

    /* renamed from: f  reason: collision with root package name */
    final C3263o1 f38813f;

    /* renamed from: g  reason: collision with root package name */
    private volatile C3254l1 f38814g;

    /* renamed from: h  reason: collision with root package name */
    final K4.b f38815h;

    /* renamed from: i  reason: collision with root package name */
    final S0 f38816i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f38817j;

    /* renamed from: com.bugsnag.android.p1$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C3266p1.this.g();
        }
    }

    /* renamed from: com.bugsnag.android.p1$b */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3254l1 f38819a;

        b(C3254l1 l1Var) {
            this.f38819a = l1Var;
        }

        public void run() {
            C3266p1.this.b(this.f38819a);
        }
    }

    /* renamed from: com.bugsnag.android.p1$c */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38821a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bugsnag.android.V[] r0 = com.bugsnag.android.V.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38821a = r0
                com.bugsnag.android.V r1 = com.bugsnag.android.V.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38821a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bugsnag.android.V r1 = com.bugsnag.android.V.UNDELIVERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38821a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bugsnag.android.V r1 = com.bugsnag.android.V.FAILURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C3266p1.c.<clinit>():void");
        }
    }

    C3266p1(k kVar, C3284z zVar, A a10, C3263o1 o1Var, S0 s02, K4.b bVar) {
        this(kVar, zVar, a10, 30000, o1Var, s02, bVar);
    }

    private void e(C3254l1 l1Var) {
        try {
            this.f38815h.d(t.SESSION_REQUEST, new b(l1Var));
        } catch (RejectedExecutionException unused) {
            this.f38813f.k(l1Var);
        }
    }

    private void l(C3254l1 l1Var) {
        updateState(new v1.m(l1Var.e(), g.c(l1Var.g()), l1Var.d(), l1Var.h()));
    }

    private boolean p(boolean z10) {
        if (this.f38812e.m().P(z10)) {
            return true;
        }
        C3254l1 l1Var = this.f38814g;
        if (!z10 || l1Var == null || l1Var.k() || !this.f38817j) {
            if (z10) {
                this.f38817j = false;
            }
            return false;
        }
        this.f38817j = false;
        return true;
    }

    private boolean s(C3254l1 l1Var) {
        this.f38816i.g("SessionTracker#trackSessionIfNeeded() - session captured by Client");
        l1Var.u(this.f38812e.k().d());
        l1Var.v(this.f38812e.p().i());
        if (!this.f38811d.k(l1Var, this.f38816i) || !l1Var.q()) {
            return false;
        }
        this.f38814g = l1Var;
        l(l1Var);
        e(l1Var);
        d();
        return true;
    }

    public void a(boolean z10, long j10) {
        if (z10 && j10 - j.b() >= this.f38809b && this.f38810c.g()) {
            q(new Date(), this.f38812e.z(), true);
        }
        updateState(new v1.o(z10, h()));
    }

    /* access modifiers changed from: package-private */
    public void b(C3254l1 l1Var) {
        try {
            this.f38816i.g("SessionTracker#trackSessionIfNeeded() - attempting initial delivery");
            int i10 = c.f38821a[c(l1Var).ordinal()];
            if (i10 == 1) {
                this.f38816i.g("Sent 1 new session to Bugsnag");
            } else if (i10 == 2) {
                this.f38816i.e("Storing session payload for future delivery");
                this.f38813f.k(l1Var);
            } else if (i10 == 3) {
                this.f38816i.e("Dropping invalid session tracking payload");
            }
        } catch (Exception e10) {
            this.f38816i.b("Session tracking payload failed", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public V c(C3254l1 l1Var) {
        return this.f38810c.i().a(l1Var, this.f38810c.F(l1Var));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        try {
            this.f38815h.d(t.SESSION_REQUEST, new a());
        } catch (RejectedExecutionException e10) {
            this.f38816i.b("Failed to flush session reports", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(File file) {
        this.f38816i.g("SessionTracker#flushStoredSession() - attempting delivery");
        C3254l1 l1Var = new C3254l1(file, this.f38812e.w(), this.f38816i, this.f38810c.a());
        if (l1Var.l()) {
            l1Var.u(this.f38812e.k().d());
            l1Var.v(this.f38812e.p().i());
        }
        int i10 = c.f38821a[c(l1Var).ordinal()];
        if (i10 == 1) {
            this.f38813f.b(Collections.singletonList(file));
            this.f38816i.g("Sent 1 new session to Bugsnag");
        } else if (i10 != 2) {
            if (i10 == 3) {
                this.f38816i.e("Deleting invalid session tracking payload");
                this.f38813f.b(Collections.singletonList(file));
            }
        } else if (this.f38813f.o(file)) {
            S0 s02 = this.f38816i;
            s02.e("Discarding historical session (from {" + this.f38813f.n(file) + "}) after failed delivery");
            this.f38813f.b(Collections.singletonList(file));
        } else {
            this.f38813f.a(Collections.singletonList(file));
            this.f38816i.e("Leaving session payload for future delivery");
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        for (File f10 : this.f38813f.e()) {
            f(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public String h() {
        String str;
        synchronized (this.f38808a) {
            str = (String) this.f38808a.peekLast();
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public C3254l1 i() {
        C3254l1 l1Var = this.f38814g;
        if (l1Var == null || l1Var.m()) {
            return null;
        }
        return l1Var;
    }

    /* access modifiers changed from: package-private */
    public long j() {
        return j.a();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return j.e();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        C3254l1 l1Var = this.f38814g;
        if (l1Var != null) {
            l1Var.o();
            updateState(v1.l.f38930a);
        }
    }

    /* access modifiers changed from: package-private */
    public C3254l1 n(Date date, String str, L1 l12, int i10, int i11) {
        C3254l1 l1Var = null;
        if (this.f38812e.m().P(false)) {
            return null;
        }
        if (date == null || str == null) {
            updateState(v1.l.f38930a);
        } else {
            l1Var = new C3254l1(str, date, l12, i10, i11, this.f38812e.w(), this.f38816i, this.f38810c.a());
            l(l1Var);
        }
        this.f38814g = l1Var;
        return l1Var;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        boolean z10;
        C3254l1 l1Var = this.f38814g;
        if (l1Var == null) {
            z10 = false;
            l1Var = r(false);
        } else {
            z10 = l1Var.p();
        }
        if (l1Var != null) {
            l(l1Var);
        }
        return z10;
    }

    public void onActivityStarted(Activity activity) {
        t(activity.getClass().getSimpleName(), true);
    }

    public void onActivityStopped(Activity activity) {
        t(activity.getClass().getSimpleName(), false);
    }

    /* access modifiers changed from: package-private */
    public C3254l1 q(Date date, L1 l12, boolean z10) {
        if (p(z10)) {
            return null;
        }
        C3254l1 l1Var = new C3254l1(UUID.randomUUID().toString(), date, l12, z10, this.f38812e.w(), this.f38816i, this.f38810c.a());
        if (s(l1Var)) {
            return l1Var;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C3254l1 r(boolean z10) {
        if (p(z10)) {
            return null;
        }
        return q(new Date(), this.f38812e.z(), z10);
    }

    /* access modifiers changed from: package-private */
    public void t(String str, boolean z10) {
        if (z10) {
            synchronized (this.f38808a) {
                this.f38808a.add(str);
            }
        } else {
            synchronized (this.f38808a) {
                this.f38808a.removeLastOccurrence(str);
            }
        }
        this.f38812e.o().d(h());
    }

    C3266p1(k kVar, C3284z zVar, A a10, long j10, C3263o1 o1Var, S0 s02, K4.b bVar) {
        this.f38808a = new ArrayDeque();
        this.f38814g = null;
        this.f38817j = true;
        this.f38810c = kVar;
        this.f38811d = zVar;
        this.f38812e = a10;
        this.f38809b = j10;
        this.f38813f = o1Var;
        this.f38815h = bVar;
        this.f38816i = s02;
    }
}
