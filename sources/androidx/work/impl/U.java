package androidx.work.impl;

import P3.C1299b;
import P3.m;
import P3.u;
import P3.v;
import P3.x;
import Q3.A;
import Q3.B;
import Q3.p;
import Q3.z;
import android.content.Context;
import androidx.work.C1835b;
import androidx.work.C1836c;
import androidx.work.C1840g;
import androidx.work.D;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.l;
import androidx.work.r;
import androidx.work.s;
import com.google.common.util.concurrent.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class U implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    static final String f18787s = s.i("WorkerWrapper");

    /* renamed from: a  reason: collision with root package name */
    Context f18788a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18789b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f18790c;

    /* renamed from: d  reason: collision with root package name */
    u f18791d;

    /* renamed from: e  reason: collision with root package name */
    r f18792e;

    /* renamed from: f  reason: collision with root package name */
    R3.b f18793f;

    /* renamed from: g  reason: collision with root package name */
    r.a f18794g = r.a.a();

    /* renamed from: h  reason: collision with root package name */
    private C1836c f18795h;

    /* renamed from: i  reason: collision with root package name */
    private C1835b f18796i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.work.impl.foreground.a f18797j;

    /* renamed from: k  reason: collision with root package name */
    private WorkDatabase f18798k;

    /* renamed from: l  reason: collision with root package name */
    private v f18799l;

    /* renamed from: m  reason: collision with root package name */
    private C1299b f18800m;

    /* renamed from: n  reason: collision with root package name */
    private List f18801n;

    /* renamed from: o  reason: collision with root package name */
    private String f18802o;

    /* renamed from: p  reason: collision with root package name */
    androidx.work.impl.utils.futures.c f18803p = androidx.work.impl.utils.futures.c.t();

    /* renamed from: q  reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f18804q = androidx.work.impl.utils.futures.c.t();

    /* renamed from: r  reason: collision with root package name */
    private volatile int f18805r = -256;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f18806a;

        a(g gVar) {
            this.f18806a = gVar;
        }

        public void run() {
            if (!U.this.f18804q.isCancelled()) {
                try {
                    this.f18806a.get();
                    s e10 = s.e();
                    String str = U.f18787s;
                    e10.a(str, "Starting work for " + U.this.f18791d.f5093c);
                    U u10 = U.this;
                    u10.f18804q.r(u10.f18792e.startWork());
                } catch (Throwable th2) {
                    U.this.f18804q.q(th2);
                }
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f18808a;

        b(String str) {
            this.f18808a = str;
        }

        public void run() {
            try {
                r.a aVar = (r.a) U.this.f18804q.get();
                if (aVar == null) {
                    s e10 = s.e();
                    String str = U.f18787s;
                    e10.c(str, U.this.f18791d.f5093c + " returned a null result. Treating it as a failure.");
                } else {
                    s e11 = s.e();
                    String str2 = U.f18787s;
                    e11.a(str2, U.this.f18791d.f5093c + " returned a " + aVar + ".");
                    U.this.f18794g = aVar;
                }
            } catch (CancellationException e12) {
                s e13 = s.e();
                String str3 = U.f18787s;
                e13.g(str3, this.f18808a + " was cancelled", e12);
            } catch (InterruptedException e14) {
                e = e14;
                s e15 = s.e();
                String str4 = U.f18787s;
                e15.d(str4, this.f18808a + " failed because it threw an exception/error", e);
            } catch (ExecutionException e16) {
                e = e16;
                s e152 = s.e();
                String str42 = U.f18787s;
                e152.d(str42, this.f18808a + " failed because it threw an exception/error", e);
            } catch (Throwable th2) {
                U.this.j();
                throw th2;
            }
            U.this.j();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Context f18810a;

        /* renamed from: b  reason: collision with root package name */
        r f18811b;

        /* renamed from: c  reason: collision with root package name */
        androidx.work.impl.foreground.a f18812c;

        /* renamed from: d  reason: collision with root package name */
        R3.b f18813d;

        /* renamed from: e  reason: collision with root package name */
        C1836c f18814e;

        /* renamed from: f  reason: collision with root package name */
        WorkDatabase f18815f;

        /* renamed from: g  reason: collision with root package name */
        u f18816g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final List f18817h;

        /* renamed from: i  reason: collision with root package name */
        WorkerParameters.a f18818i = new WorkerParameters.a();

        public c(Context context, C1836c cVar, R3.b bVar, androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, u uVar, List list) {
            this.f18810a = context.getApplicationContext();
            this.f18813d = bVar;
            this.f18812c = aVar;
            this.f18814e = cVar;
            this.f18815f = workDatabase;
            this.f18816g = uVar;
            this.f18817h = list;
        }

        public U b() {
            return new U(this);
        }

        public c c(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f18818i = aVar;
            }
            return this;
        }
    }

    U(c cVar) {
        this.f18788a = cVar.f18810a;
        this.f18793f = cVar.f18813d;
        this.f18797j = cVar.f18812c;
        u uVar = cVar.f18816g;
        this.f18791d = uVar;
        this.f18789b = uVar.f5091a;
        this.f18790c = cVar.f18818i;
        this.f18792e = cVar.f18811b;
        C1836c cVar2 = cVar.f18814e;
        this.f18795h = cVar2;
        this.f18796i = cVar2.a();
        WorkDatabase workDatabase = cVar.f18815f;
        this.f18798k = workDatabase;
        this.f18799l = workDatabase.H();
        this.f18800m = this.f18798k.C();
        this.f18801n = cVar.f18817h;
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f18789b);
        sb2.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        return sb2.toString();
    }

    private void f(r.a aVar) {
        if (aVar instanceof r.a.c) {
            s e10 = s.e();
            String str = f18787s;
            e10.f(str, "Worker result SUCCESS for " + this.f18802o);
            if (this.f18791d.m()) {
                l();
            } else {
                q();
            }
        } else if (aVar instanceof r.a.b) {
            s e11 = s.e();
            String str2 = f18787s;
            e11.f(str2, "Worker result RETRY for " + this.f18802o);
            k();
        } else {
            s e12 = s.e();
            String str3 = f18787s;
            e12.f(str3, "Worker result FAILURE for " + this.f18802o);
            if (this.f18791d.m()) {
                l();
            } else {
                p();
            }
        }
    }

    private void h(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f18799l.g(str2) != D.CANCELLED) {
                this.f18799l.q(D.FAILED, str2);
            }
            linkedList.addAll(this.f18800m.b(str2));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(g gVar) {
        if (this.f18804q.isCancelled()) {
            gVar.cancel(true);
        }
    }

    private void k() {
        this.f18798k.e();
        try {
            this.f18799l.q(D.ENQUEUED, this.f18789b);
            this.f18799l.s(this.f18789b, this.f18796i.currentTimeMillis());
            this.f18799l.z(this.f18789b, this.f18791d.h());
            this.f18799l.n(this.f18789b, -1);
            this.f18798k.A();
        } finally {
            this.f18798k.i();
            m(true);
        }
    }

    private void l() {
        this.f18798k.e();
        try {
            this.f18799l.s(this.f18789b, this.f18796i.currentTimeMillis());
            this.f18799l.q(D.ENQUEUED, this.f18789b);
            this.f18799l.w(this.f18789b);
            this.f18799l.z(this.f18789b, this.f18791d.h());
            this.f18799l.b(this.f18789b);
            this.f18799l.n(this.f18789b, -1);
            this.f18798k.A();
        } finally {
            this.f18798k.i();
            m(false);
        }
    }

    private void m(boolean z10) {
        this.f18798k.e();
        try {
            if (!this.f18798k.H().u()) {
                p.c(this.f18788a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f18799l.q(D.ENQUEUED, this.f18789b);
                this.f18799l.d(this.f18789b, this.f18805r);
                this.f18799l.n(this.f18789b, -1);
            }
            this.f18798k.A();
            this.f18798k.i();
            this.f18803p.p(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.f18798k.i();
            throw th2;
        }
    }

    private void n() {
        D g10 = this.f18799l.g(this.f18789b);
        if (g10 == D.RUNNING) {
            s e10 = s.e();
            String str = f18787s;
            e10.a(str, "Status for " + this.f18789b + " is RUNNING; not doing any work and rescheduling for later execution");
            m(true);
            return;
        }
        s e11 = s.e();
        String str2 = f18787s;
        e11.a(str2, "Status for " + this.f18789b + " is " + g10 + " ; not doing any work");
        m(false);
    }

    private void o() {
        C1840g a10;
        if (!r()) {
            this.f18798k.e();
            try {
                u uVar = this.f18791d;
                if (uVar.f5092b != D.ENQUEUED) {
                    n();
                    this.f18798k.A();
                    s e10 = s.e();
                    String str = f18787s;
                    e10.a(str, this.f18791d.f5093c + " is not in ENQUEUED state. Nothing more to do");
                } else if ((uVar.m() || this.f18791d.l()) && this.f18796i.currentTimeMillis() < this.f18791d.c()) {
                    s.e().a(f18787s, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f18791d.f5093c}));
                    m(true);
                    this.f18798k.A();
                    this.f18798k.i();
                } else {
                    this.f18798k.A();
                    this.f18798k.i();
                    if (this.f18791d.m()) {
                        a10 = this.f18791d.f5095e;
                    } else {
                        l b10 = this.f18795h.f().b(this.f18791d.f5094d);
                        if (b10 == null) {
                            s e11 = s.e();
                            String str2 = f18787s;
                            e11.c(str2, "Could not create Input Merger " + this.f18791d.f5094d);
                            p();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f18791d.f5095e);
                        arrayList.addAll(this.f18799l.j(this.f18789b));
                        a10 = b10.a(arrayList);
                    }
                    C1840g gVar = a10;
                    UUID fromString = UUID.fromString(this.f18789b);
                    List list = this.f18801n;
                    WorkerParameters.a aVar = this.f18790c;
                    u uVar2 = this.f18791d;
                    WorkerParameters workerParameters = new WorkerParameters(fromString, gVar, list, aVar, uVar2.f5101k, uVar2.f(), this.f18795h.d(), this.f18793f, this.f18795h.n(), new B(this.f18798k, this.f18793f), new A(this.f18798k, this.f18797j, this.f18793f));
                    if (this.f18792e == null) {
                        this.f18792e = this.f18795h.n().b(this.f18788a, this.f18791d.f5093c, workerParameters);
                    }
                    r rVar = this.f18792e;
                    if (rVar == null) {
                        s e12 = s.e();
                        String str3 = f18787s;
                        e12.c(str3, "Could not create Worker " + this.f18791d.f5093c);
                        p();
                    } else if (rVar.isUsed()) {
                        s e13 = s.e();
                        String str4 = f18787s;
                        e13.c(str4, "Received an already-used Worker " + this.f18791d.f5093c + "; Worker Factory should return new instances");
                        p();
                    } else {
                        this.f18792e.setUsed();
                        if (!s()) {
                            n();
                        } else if (!r()) {
                            z zVar = new z(this.f18788a, this.f18791d, this.f18792e, workerParameters.b(), this.f18793f);
                            this.f18793f.a().execute(zVar);
                            g b11 = zVar.b();
                            this.f18804q.e(new T(this, b11), new Q3.v());
                            b11.e(new a(b11), this.f18793f.a());
                            this.f18804q.e(new b(this.f18802o), this.f18793f.c());
                        }
                    }
                }
            } finally {
                this.f18798k.i();
            }
        }
    }

    private void q() {
        this.f18798k.e();
        try {
            this.f18799l.q(D.SUCCEEDED, this.f18789b);
            this.f18799l.r(this.f18789b, ((r.a.c) this.f18794g).e());
            long currentTimeMillis = this.f18796i.currentTimeMillis();
            for (String str : this.f18800m.b(this.f18789b)) {
                if (this.f18799l.g(str) == D.BLOCKED && this.f18800m.c(str)) {
                    s e10 = s.e();
                    String str2 = f18787s;
                    e10.f(str2, "Setting status to enqueued for " + str);
                    this.f18799l.q(D.ENQUEUED, str);
                    this.f18799l.s(str, currentTimeMillis);
                }
            }
            this.f18798k.A();
            this.f18798k.i();
            m(false);
        } catch (Throwable th2) {
            this.f18798k.i();
            m(false);
            throw th2;
        }
    }

    private boolean r() {
        if (this.f18805r == -256) {
            return false;
        }
        s e10 = s.e();
        String str = f18787s;
        e10.a(str, "Work interrupted for " + this.f18802o);
        D g10 = this.f18799l.g(this.f18789b);
        if (g10 == null) {
            m(false);
        } else {
            m(!g10.b());
        }
        return true;
    }

    private boolean s() {
        boolean z10;
        this.f18798k.e();
        try {
            if (this.f18799l.g(this.f18789b) == D.ENQUEUED) {
                this.f18799l.q(D.RUNNING, this.f18789b);
                this.f18799l.x(this.f18789b);
                this.f18799l.d(this.f18789b, -256);
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18798k.A();
            this.f18798k.i();
            return z10;
        } catch (Throwable th2) {
            this.f18798k.i();
            throw th2;
        }
    }

    public g c() {
        return this.f18803p;
    }

    public m d() {
        return x.a(this.f18791d);
    }

    public u e() {
        return this.f18791d;
    }

    public void g(int i10) {
        this.f18805r = i10;
        r();
        this.f18804q.cancel(true);
        if (this.f18792e == null || !this.f18804q.isCancelled()) {
            s.e().a(f18787s, "WorkSpec " + this.f18791d + " is already done. Not interrupting.");
            return;
        }
        this.f18792e.stop(i10);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!r()) {
            this.f18798k.e();
            try {
                D g10 = this.f18799l.g(this.f18789b);
                this.f18798k.G().a(this.f18789b);
                if (g10 == null) {
                    m(false);
                } else if (g10 == D.RUNNING) {
                    f(this.f18794g);
                } else if (!g10.b()) {
                    this.f18805r = -512;
                    k();
                }
                this.f18798k.A();
                this.f18798k.i();
            } catch (Throwable th2) {
                this.f18798k.i();
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f18798k.e();
        try {
            h(this.f18789b);
            C1840g e10 = ((r.a.C0325a) this.f18794g).e();
            this.f18799l.z(this.f18789b, this.f18791d.h());
            this.f18799l.r(this.f18789b, e10);
            this.f18798k.A();
        } finally {
            this.f18798k.i();
            m(false);
        }
    }

    public void run() {
        this.f18802o = b(this.f18801n);
        o();
    }
}
