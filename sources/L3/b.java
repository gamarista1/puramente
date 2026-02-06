package L3;

import M3.b;
import M3.d;
import M3.e;
import O3.n;
import P3.m;
import P3.u;
import P3.x;
import Q3.r;
import Ug.C5600w0;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.A;
import androidx.work.C1836c;
import androidx.work.D;
import androidx.work.impl.B;
import androidx.work.impl.C1846f;
import androidx.work.impl.C1860u;
import androidx.work.impl.N;
import androidx.work.impl.w;
import androidx.work.s;
import com.amazon.a.a.o.b.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

public class b implements w, d, C1846f {

    /* renamed from: o  reason: collision with root package name */
    private static final String f4158o = s.i("GreedyScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4159a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4160b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private a f4161c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4162d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f4163e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private final B f4164f = new B();

    /* renamed from: g  reason: collision with root package name */
    private final C1860u f4165g;

    /* renamed from: h  reason: collision with root package name */
    private final N f4166h;

    /* renamed from: i  reason: collision with root package name */
    private final C1836c f4167i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f4168j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    Boolean f4169k;

    /* renamed from: l  reason: collision with root package name */
    private final e f4170l;

    /* renamed from: m  reason: collision with root package name */
    private final R3.b f4171m;

    /* renamed from: n  reason: collision with root package name */
    private final d f4172n;

    /* renamed from: L3.b$b  reason: collision with other inner class name */
    private static class C0098b {

        /* renamed from: a  reason: collision with root package name */
        final int f4173a;

        /* renamed from: b  reason: collision with root package name */
        final long f4174b;

        private C0098b(int i10, long j10) {
            this.f4173a = i10;
            this.f4174b = j10;
        }
    }

    public b(Context context, C1836c cVar, n nVar, C1860u uVar, N n10, R3.b bVar) {
        this.f4159a = context;
        A k10 = cVar.k();
        this.f4161c = new a(this, k10, cVar.a());
        this.f4172n = new d(k10, n10);
        this.f4171m = bVar;
        this.f4170l = new e(nVar);
        this.f4167i = cVar;
        this.f4165g = uVar;
        this.f4166h = n10;
    }

    private void f() {
        this.f4169k = Boolean.valueOf(r.b(this.f4159a, this.f4167i));
    }

    private void g() {
        if (!this.f4162d) {
            this.f4165g.e(this);
            this.f4162d = true;
        }
    }

    private void h(m mVar) {
        C5600w0 w0Var;
        synchronized (this.f4163e) {
            w0Var = (C5600w0) this.f4160b.remove(mVar);
        }
        if (w0Var != null) {
            s e10 = s.e();
            String str = f4158o;
            e10.a(str, "Stopping tracking for " + mVar);
            w0Var.n((CancellationException) null);
        }
    }

    private long i(u uVar) {
        long max;
        synchronized (this.f4163e) {
            try {
                m a10 = x.a(uVar);
                C0098b bVar = (C0098b) this.f4168j.get(a10);
                if (bVar == null) {
                    bVar = new C0098b(uVar.f5101k, this.f4167i.a().currentTimeMillis());
                    this.f4168j.put(a10, bVar);
                }
                max = bVar.f4174b + (((long) Math.max((uVar.f5101k - bVar.f4173a) - 5, 0)) * 30000);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return max;
    }

    public void a(String str) {
        if (this.f4169k == null) {
            f();
        }
        if (!this.f4169k.booleanValue()) {
            s.e().f(f4158o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        s e10 = s.e();
        String str2 = f4158o;
        e10.a(str2, "Cancelling work ID " + str);
        a aVar = this.f4161c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (androidx.work.impl.A a10 : this.f4164f.c(str)) {
            this.f4172n.b(a10);
            this.f4166h.e(a10);
        }
    }

    public void b(m mVar, boolean z10) {
        androidx.work.impl.A b10 = this.f4164f.b(mVar);
        if (b10 != null) {
            this.f4172n.b(b10);
        }
        h(mVar);
        if (!z10) {
            synchronized (this.f4163e) {
                this.f4168j.remove(mVar);
            }
        }
    }

    public boolean c() {
        return false;
    }

    public void d(u... uVarArr) {
        if (this.f4169k == null) {
            f();
        }
        if (!this.f4169k.booleanValue()) {
            s.e().f(f4158o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<u> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        for (u uVar : uVarArr) {
            if (!this.f4164f.a(x.a(uVar))) {
                long max = Math.max(uVar.c(), i(uVar));
                long currentTimeMillis = this.f4167i.a().currentTimeMillis();
                if (uVar.f5092b == D.ENQUEUED) {
                    if (currentTimeMillis < max) {
                        a aVar = this.f4161c;
                        if (aVar != null) {
                            aVar.a(uVar, max);
                        }
                    } else if (uVar.k()) {
                        if (uVar.f5100j.h()) {
                            s.e().a(f4158o, "Ignoring " + uVar + ". Requires device idle.");
                        } else if (uVar.f5100j.e()) {
                            s.e().a(f4158o, "Ignoring " + uVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(uVar);
                            hashSet2.add(uVar.f5091a);
                        }
                    } else if (!this.f4164f.a(x.a(uVar))) {
                        s.e().a(f4158o, "Starting work for " + uVar.f5091a);
                        androidx.work.impl.A e10 = this.f4164f.e(uVar);
                        this.f4172n.c(e10);
                        this.f4166h.c(e10);
                    }
                }
            }
        }
        synchronized (this.f4163e) {
            try {
                if (!hashSet.isEmpty()) {
                    String join = TextUtils.join(f.f37529a, hashSet2);
                    s.e().a(f4158o, "Starting tracking for " + join);
                    for (u uVar2 : hashSet) {
                        m a10 = x.a(uVar2);
                        if (!this.f4160b.containsKey(a10)) {
                            this.f4160b.put(a10, M3.f.b(this.f4170l, uVar2, this.f4171m.b(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void e(u uVar, M3.b bVar) {
        m a10 = x.a(uVar);
        if (!(bVar instanceof b.a)) {
            s e10 = s.e();
            String str = f4158o;
            e10.a(str, "Constraints not met: Cancelling work ID " + a10);
            androidx.work.impl.A b10 = this.f4164f.b(a10);
            if (b10 != null) {
                this.f4172n.b(b10);
                this.f4166h.b(b10, ((b.C0106b) bVar).a());
            }
        } else if (!this.f4164f.a(a10)) {
            s e11 = s.e();
            String str2 = f4158o;
            e11.a(str2, "Constraints met: Scheduling work ID " + a10);
            androidx.work.impl.A d10 = this.f4164f.d(a10);
            this.f4172n.c(d10);
            this.f4166h.c(d10);
        }
    }
}
