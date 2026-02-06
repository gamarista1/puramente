package androidx.work.impl.background.systemalarm;

import P3.m;
import Q3.C;
import Q3.w;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.B;
import androidx.work.impl.C1846f;
import androidx.work.impl.C1860u;
import androidx.work.impl.N;
import androidx.work.impl.O;
import androidx.work.impl.P;
import androidx.work.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class g implements C1846f {

    /* renamed from: l  reason: collision with root package name */
    static final String f18869l = s.i("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    final Context f18870a;

    /* renamed from: b  reason: collision with root package name */
    final R3.b f18871b;

    /* renamed from: c  reason: collision with root package name */
    private final C f18872c;

    /* renamed from: d  reason: collision with root package name */
    private final C1860u f18873d;

    /* renamed from: e  reason: collision with root package name */
    private final P f18874e;

    /* renamed from: f  reason: collision with root package name */
    final b f18875f;

    /* renamed from: g  reason: collision with root package name */
    final List f18876g;

    /* renamed from: h  reason: collision with root package name */
    Intent f18877h;

    /* renamed from: i  reason: collision with root package name */
    private c f18878i;

    /* renamed from: j  reason: collision with root package name */
    private B f18879j;

    /* renamed from: k  reason: collision with root package name */
    private final N f18880k;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Executor a10;
            d dVar;
            synchronized (g.this.f18876g) {
                g gVar = g.this;
                gVar.f18877h = (Intent) gVar.f18876g.get(0);
            }
            Intent intent = g.this.f18877h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = g.this.f18877h.getIntExtra("KEY_START_ID", 0);
                s e10 = s.e();
                String str = g.f18869l;
                e10.a(str, "Processing command " + g.this.f18877h + ", " + intExtra);
                Context context = g.this.f18870a;
                PowerManager.WakeLock b10 = w.b(context, action + " (" + intExtra + ")");
                try {
                    s e11 = s.e();
                    e11.a(str, "Acquiring operation wake lock (" + action + ") " + b10);
                    b10.acquire();
                    g gVar2 = g.this;
                    gVar2.f18875f.o(gVar2.f18877h, intExtra, gVar2);
                    s e12 = s.e();
                    e12.a(str, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    a10 = g.this.f18871b.a();
                    dVar = new d(g.this);
                } catch (Throwable th2) {
                    s e13 = s.e();
                    String str2 = g.f18869l;
                    e13.a(str2, "Releasing operation wake lock (" + action + ") " + b10);
                    b10.release();
                    g.this.f18871b.a().execute(new d(g.this));
                    throw th2;
                }
                a10.execute(dVar);
            }
        }
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f18882a;

        /* renamed from: b  reason: collision with root package name */
        private final Intent f18883b;

        /* renamed from: c  reason: collision with root package name */
        private final int f18884c;

        b(g gVar, Intent intent, int i10) {
            this.f18882a = gVar;
            this.f18883b = intent;
            this.f18884c = i10;
        }

        public void run() {
            this.f18882a.a(this.f18883b, this.f18884c);
        }
    }

    interface c {
        void b();
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final g f18885a;

        d(g gVar) {
            this.f18885a = gVar;
        }

        public void run() {
            this.f18885a.d();
        }
    }

    g(Context context) {
        this(context, (C1860u) null, (P) null, (N) null);
    }

    private void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean j(String str) {
        c();
        synchronized (this.f18876g) {
            try {
                for (Intent action : this.f18876g) {
                    if (str.equals(action.getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        c();
        PowerManager.WakeLock b10 = w.b(this.f18870a, "ProcessCommand");
        try {
            b10.acquire();
            this.f18874e.o().d(new a());
        } finally {
            b10.release();
        }
    }

    public boolean a(Intent intent, int i10) {
        s e10 = s.e();
        String str = f18869l;
        e10.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.e().k(str, "Unknown command. Ignoring");
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i10);
            synchronized (this.f18876g) {
                try {
                    boolean isEmpty = this.f18876g.isEmpty();
                    this.f18876g.add(intent);
                    if (isEmpty) {
                        l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    public void b(m mVar, boolean z10) {
        this.f18871b.a().execute(new b(this, b.d(this.f18870a, mVar, z10), 0));
    }

    /* access modifiers changed from: package-private */
    public void d() {
        s e10 = s.e();
        String str = f18869l;
        e10.a(str, "Checking if commands are complete.");
        c();
        synchronized (this.f18876g) {
            try {
                if (this.f18877h != null) {
                    s e11 = s.e();
                    e11.a(str, "Removing command " + this.f18877h);
                    if (((Intent) this.f18876g.remove(0)).equals(this.f18877h)) {
                        this.f18877h = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                R3.a c10 = this.f18871b.c();
                if (!this.f18875f.n() && this.f18876g.isEmpty() && !c10.W0()) {
                    s.e().a(str, "No more commands & intents.");
                    c cVar = this.f18878i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f18876g.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C1860u e() {
        return this.f18873d;
    }

    /* access modifiers changed from: package-private */
    public R3.b f() {
        return this.f18871b;
    }

    /* access modifiers changed from: package-private */
    public P g() {
        return this.f18874e;
    }

    /* access modifiers changed from: package-private */
    public C h() {
        return this.f18872c;
    }

    /* access modifiers changed from: package-private */
    public N i() {
        return this.f18880k;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        s.e().a(f18869l, "Destroying SystemAlarmDispatcher");
        this.f18873d.p(this);
        this.f18878i = null;
    }

    /* access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.f18878i != null) {
            s.e().c(f18869l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f18878i = cVar;
        }
    }

    g(Context context, C1860u uVar, P p10, N n10) {
        Context applicationContext = context.getApplicationContext();
        this.f18870a = applicationContext;
        this.f18879j = new B();
        p10 = p10 == null ? P.i(context) : p10;
        this.f18874e = p10;
        this.f18875f = new b(applicationContext, p10.g().a(), this.f18879j);
        this.f18872c = new C(p10.g().k());
        uVar = uVar == null ? p10.k() : uVar;
        this.f18873d = uVar;
        R3.b o10 = p10.o();
        this.f18871b = o10;
        this.f18880k = n10 == null ? new O(uVar, o10) : n10;
        uVar.e(this);
        this.f18876g = new ArrayList();
        this.f18877h = null;
    }
}
