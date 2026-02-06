package Zg;

import Ug.C5559b0;
import Ug.C5582n;
import Ug.G;
import Ug.I;
import Ug.Q;
import Ug.U;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import qf.g;
import qf.h;

/* renamed from: Zg.n  reason: case insensitive filesystem */
public final class C5725n extends G implements U {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66983h = AtomicIntegerFieldUpdater.newUpdater(C5725n.class, "runningWorkers$volatile");
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final G f66984c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66985d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ U f66986e;

    /* renamed from: f  reason: collision with root package name */
    private final s f66987f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f66988g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* renamed from: Zg.n$a */
    private final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f66989a;

        public a(Runnable runnable) {
            this.f66989a = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f66989a.run();
                } catch (Throwable th2) {
                    I.a(h.f72645a, th2);
                }
                Runnable E12 = C5725n.this.G1();
                if (E12 != null) {
                    this.f66989a = E12;
                    i10++;
                    if (i10 >= 16 && C5725n.this.f66984c.B1(C5725n.this)) {
                        C5725n.this.f66984c.z1(C5725n.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C5725n(G g10, int i10) {
        U u10;
        this.f66984c = g10;
        this.f66985d = i10;
        if (g10 instanceof U) {
            u10 = (U) g10;
        } else {
            u10 = null;
        }
        this.f66986e = u10 == null ? Q.a() : u10;
        this.f66987f = new s(false);
        this.f66988g = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable G1() {
        while (true) {
            Runnable runnable = (Runnable) this.f66987f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f66988g) {
                f66983h.decrementAndGet(this);
                if (this.f66987f.c() == 0) {
                    return null;
                }
                f66983h.incrementAndGet(this);
            }
        }
    }

    private final boolean H1() {
        synchronized (this.f66988g) {
            if (f66983h.get(this) >= this.f66985d) {
                return false;
            }
            f66983h.incrementAndGet(this);
            return true;
        }
    }

    public void A1(g gVar, Runnable runnable) {
        Runnable G12;
        this.f66987f.a(runnable);
        if (f66983h.get(this) < this.f66985d && H1() && (G12 = G1()) != null) {
            this.f66984c.A1(this, new a(G12));
        }
    }

    public G C1(int i10) {
        C5726o.a(i10);
        if (i10 >= this.f66985d) {
            return this;
        }
        return super.C1(i10);
    }

    public C5559b0 I0(long j10, Runnable runnable, g gVar) {
        return this.f66986e.I0(j10, runnable, gVar);
    }

    public void g0(long j10, C5582n nVar) {
        this.f66986e.g0(j10, nVar);
    }

    public void z1(g gVar, Runnable runnable) {
        Runnable G12;
        this.f66987f.a(runnable);
        if (f66983h.get(this) < this.f66985d && H1() && (G12 = G1()) != null) {
            this.f66984c.z1(this, new a(G12));
        }
    }
}
