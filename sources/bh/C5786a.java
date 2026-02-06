package bh;

import Ef.m;
import Ug.C5560c;
import Ug.O;
import Zg.B;
import Zg.G;
import com.google.android.gms.common.api.a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import sf.C6714a;

/* renamed from: bh.a  reason: case insensitive filesystem */
public final class C5786a implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final C0986a f67268h = new C0986a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f67269i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f67270j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67271k;

    /* renamed from: l  reason: collision with root package name */
    public static final G f67272l = new G("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final int f67273a;

    /* renamed from: b  reason: collision with root package name */
    public final int f67274b;

    /* renamed from: c  reason: collision with root package name */
    public final long f67275c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final String f67276d;

    /* renamed from: e  reason: collision with root package name */
    public final C5789d f67277e;

    /* renamed from: f  reason: collision with root package name */
    public final C5789d f67278f;

    /* renamed from: g  reason: collision with root package name */
    public final B f67279g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: bh.a$a  reason: collision with other inner class name */
    public static final class C0986a {
        public /* synthetic */ C0986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0986a() {
        }
    }

    /* renamed from: bh.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                bh.a$d[] r0 = bh.C5786a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                bh.a$d r1 = bh.C5786a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                bh.a$d r1 = bh.C5786a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                bh.a$d r1 = bh.C5786a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                bh.a$d r1 = bh.C5786a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                bh.a$d r1 = bh.C5786a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f67280a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bh.C5786a.b.<clinit>():void");
        }
    }

    /* renamed from: bh.a$d */
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        static {
            d[] a10;
            f67296g = C6714a.a(a10);
        }
    }

    static {
        Class<C5786a> cls = C5786a.class;
        f67269i = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        f67270j = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        f67271k = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    public C5786a(int i10, int i11, long j10, String str) {
        this.f67273a = i10;
        this.f67274b = i11;
        this.f67275c = j10;
        this.f67276d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        } else if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j10 > 0) {
            this.f67277e = new C5789d();
            this.f67278f = new C5789d();
            this.f67279g = new B((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
    }

    private final int I(c cVar) {
        Object i10 = cVar.i();
        while (i10 != f67272l) {
            if (i10 == null) {
                return 0;
            }
            c cVar2 = (c) i10;
            int h10 = cVar2.h();
            if (h10 != 0) {
                return h10;
            }
            i10 = cVar2.i();
        }
        return -1;
    }

    private final c M() {
        AtomicLongFieldUpdater E10 = f67269i;
        while (true) {
            long j10 = E10.get(this);
            c cVar = (c) this.f67279g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int I10 = I(cVar);
            if (I10 >= 0) {
                if (f67269i.compareAndSet(this, j10, ((long) I10) | j11)) {
                    cVar.r(f67272l);
                    return cVar;
                }
            }
        }
    }

    private final boolean b(C5793h hVar) {
        if (hVar.f67307b.b() == 1) {
            return this.f67278f.a(hVar);
        }
        return this.f67277e.a(hVar);
    }

    private final int f() {
        synchronized (this.f67279g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f67270j.get(this);
                int i10 = (int) (j10 & 2097151);
                int d10 = m.d(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (d10 >= this.f67273a) {
                    return 0;
                }
                if (i10 >= this.f67274b) {
                    return 0;
                }
                int i11 = ((int) (f67270j.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f67279g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f67279g.c(i11, cVar);
                if (i11 == ((int) (2097151 & f67270j.incrementAndGet(this)))) {
                    int i12 = d10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f0(long j10, boolean z10) {
        if (!z10 && !x0() && !o0(j10)) {
            x0();
        }
    }

    private final C5793h j0(c cVar, C5793h hVar, boolean z10) {
        if (cVar == null || cVar.f67284c == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f67307b.b() == 0 && cVar.f67284c == d.BLOCKING) {
            return hVar;
        }
        cVar.f67288g = true;
        return cVar.f67282a.a(hVar, z10);
    }

    private final c o() {
        c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof c) {
            cVar = (c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !C6496s.c(C5786a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final boolean o0(long j10) {
        if (m.d(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f67273a) {
            int f10 = f();
            if (f10 == 1 && this.f67273a > 1) {
                f();
            }
            if (f10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean t0(C5786a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f67270j.get(aVar);
        }
        return aVar.o0(j10);
    }

    public static /* synthetic */ void v(C5786a aVar, Runnable runnable, C5794i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f67316g;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        aVar.q(runnable, iVar, z10);
    }

    private final boolean x0() {
        c M10;
        do {
            M10 = M();
            if (M10 == null) {
                return false;
            }
        } while (!c.f67281i.compareAndSet(M10, -1, 0));
        LockSupport.unpark(M10);
        return true;
    }

    public final boolean Q(c cVar) {
        long j10;
        int h10;
        if (cVar.i() != f67272l) {
            return false;
        }
        AtomicLongFieldUpdater E10 = f67269i;
        do {
            j10 = E10.get(this);
            h10 = cVar.h();
            cVar.r(this.f67279g.b((int) (2097151 & j10)));
        } while (!f67269i.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) h10)));
        return true;
    }

    public final void T(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater E10 = f67269i;
        while (true) {
            long j10 = E10.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                if (i11 == 0) {
                    i12 = I(cVar);
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f67269i.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void U(C5793h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            C5560c.a();
            throw th2;
        }
        C5560c.a();
    }

    public final void V(long j10) {
        int i10;
        C5793h hVar;
        if (f67271k.compareAndSet(this, 0, 1)) {
            c o10 = o();
            synchronized (this.f67279g) {
                i10 = (int) (f67270j.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b10 = this.f67279g.b(i11);
                    C6496s.e(b10);
                    c cVar = (c) b10;
                    if (cVar != o10) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f67282a.j(this.f67278f);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f67278f.b();
            this.f67277e.b();
            while (true) {
                if (o10 != null) {
                    hVar = o10.g(true);
                    if (hVar != null) {
                        continue;
                        U(hVar);
                    }
                }
                hVar = (C5793h) this.f67277e.e();
                if (hVar == null && (hVar = (C5793h) this.f67278f.e()) == null) {
                    break;
                }
                U(hVar);
            }
            if (o10 != null) {
                o10.u(d.TERMINATED);
            }
            f67269i.set(this, 0);
            f67270j.set(this, 0);
        }
    }

    public void close() {
        V(10000);
    }

    public void execute(Runnable runnable) {
        v(this, runnable, (C5794i) null, false, 6, (Object) null);
    }

    public final void g0() {
        if (!x0() && !t0(this, 0, 1, (Object) null)) {
            x0();
        }
    }

    public final boolean isTerminated() {
        if (f67271k.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final C5793h n(Runnable runnable, C5794i iVar) {
        long a10 = l.f67315f.a();
        if (!(runnable instanceof C5793h)) {
            return new k(runnable, a10, iVar);
        }
        C5793h hVar = (C5793h) runnable;
        hVar.f67306a = a10;
        hVar.f67307b = iVar;
        return hVar;
    }

    public final void q(Runnable runnable, C5794i iVar, boolean z10) {
        boolean z11;
        long j10;
        C5560c.a();
        C5793h n10 = n(runnable, iVar);
        boolean z12 = false;
        if (n10.f67307b.b() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j10 = f67270j.addAndGet(this, 2097152);
        } else {
            j10 = 0;
        }
        c o10 = o();
        C5793h j02 = j0(o10, n10, z10);
        if (j02 == null || b(j02)) {
            if (z10 && o10 != null) {
                z12 = true;
            }
            if (z11) {
                f0(j10, z12);
            } else if (!z12) {
                g0();
            }
        } else {
            throw new RejectedExecutionException(this.f67276d + " was terminated");
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f67279g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c cVar = (c) this.f67279g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f67282a.i();
                int i17 = b.f67280a[cVar.f67284c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i17 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f67270j.get(this);
        return this.f67276d + '@' + O.b(this) + "[Pool Size {core = " + this.f67273a + ", max = " + this.f67274b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f67277e.c() + ", global blocking queue size = " + this.f67278f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f67273a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* renamed from: bh.a$c */
    public final class c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f67281i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a  reason: collision with root package name */
        public final n f67282a;

        /* renamed from: b  reason: collision with root package name */
        private final N f67283b;

        /* renamed from: c  reason: collision with root package name */
        public d f67284c;

        /* renamed from: d  reason: collision with root package name */
        private long f67285d;

        /* renamed from: e  reason: collision with root package name */
        private long f67286e;

        /* renamed from: f  reason: collision with root package name */
        private int f67287f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f67288g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(C5786a.this.getClass().getClassLoader());
            this.f67282a = new n();
            this.f67283b = new N();
            this.f67284c = d.DORMANT;
            this.nextParkedWorker = C5786a.f67272l;
            int nanoTime = (int) System.nanoTime();
            this.f67287f = nanoTime == 0 ? 42 : nanoTime;
        }

        private final void b(int i10) {
            if (i10 != 0) {
                C5786a.f67270j.addAndGet(C5786a.this, -2097152);
                if (this.f67284c != d.TERMINATED) {
                    this.f67284c = d.DORMANT;
                }
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                C5786a.this.g0();
            }
        }

        private final void d(C5793h hVar) {
            int b10 = hVar.f67307b.b();
            k(b10);
            c(b10);
            C5786a.this.U(hVar);
            b(b10);
        }

        private final C5793h e(boolean z10) {
            boolean z11;
            C5793h o10;
            C5793h o11;
            if (z10) {
                if (m(C5786a.this.f67273a * 2) == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (o11 = o()) != null) {
                    return o11;
                }
                C5793h k10 = this.f67282a.k();
                if (k10 != null) {
                    return k10;
                }
                if (!z11 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                C5793h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final C5793h f() {
            C5793h l10 = this.f67282a.l();
            if (l10 != null) {
                return l10;
            }
            C5793h hVar = (C5793h) C5786a.this.f67278f.e();
            if (hVar == null) {
                return v(1);
            }
            return hVar;
        }

        private final void k(int i10) {
            this.f67285d = 0;
            if (this.f67284c == d.PARKING) {
                this.f67284c = d.BLOCKING;
            }
        }

        private final boolean l() {
            if (this.nextParkedWorker != C5786a.f67272l) {
                return true;
            }
            return false;
        }

        private final void n() {
            if (this.f67285d == 0) {
                this.f67285d = System.nanoTime() + C5786a.this.f67275c;
            }
            LockSupport.parkNanos(C5786a.this.f67275c);
            if (System.nanoTime() - this.f67285d >= 0) {
                this.f67285d = 0;
                w();
            }
        }

        private final C5793h o() {
            if (m(2) == 0) {
                C5793h hVar = (C5793h) C5786a.this.f67277e.e();
                if (hVar != null) {
                    return hVar;
                }
                return (C5793h) C5786a.this.f67278f.e();
            }
            C5793h hVar2 = (C5793h) C5786a.this.f67278f.e();
            if (hVar2 != null) {
                return hVar2;
            }
            return (C5793h) C5786a.this.f67277e.e();
        }

        private final void p() {
            loop0:
            while (true) {
                boolean z10 = false;
                while (!C5786a.this.isTerminated() && this.f67284c != d.TERMINATED) {
                    C5793h g10 = g(this.f67288g);
                    if (g10 != null) {
                        this.f67286e = 0;
                        d(g10);
                    } else {
                        this.f67288g = false;
                        if (this.f67286e == 0) {
                            t();
                        } else if (!z10) {
                            z10 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f67286e);
                            this.f67286e = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            long j10;
            if (this.f67284c == d.CPU_ACQUIRED) {
                return true;
            }
            C5786a aVar = C5786a.this;
            AtomicLongFieldUpdater a10 = C5786a.f67270j;
            do {
                j10 = a10.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!C5786a.f67270j.compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f67284c = d.CPU_ACQUIRED;
            return true;
        }

        private final void t() {
            if (!l()) {
                C5786a.this.Q(this);
                return;
            }
            f67281i.set(this, -1);
            while (l() && f67281i.get(this) == -1 && !C5786a.this.isTerminated() && this.f67284c != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final C5793h v(int i10) {
            int i11 = (int) (C5786a.f67270j.get(C5786a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            C5786a aVar = C5786a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c cVar = (c) aVar.f67279g.b(m10);
                if (cVar == null || cVar == this) {
                    int i13 = i10;
                } else {
                    long r10 = cVar.f67282a.r(i10, this.f67283b);
                    if (r10 == -1) {
                        N n10 = this.f67283b;
                        C5793h hVar = (C5793h) n10.f71759a;
                        n10.f71759a = null;
                        return hVar;
                    } else if (r10 > 0) {
                        j10 = Math.min(j10, r10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f67286e = j10;
            return null;
        }

        private final void w() {
            C5786a aVar = C5786a.this;
            synchronized (aVar.f67279g) {
                try {
                    if (!aVar.isTerminated()) {
                        if (((int) (C5786a.f67270j.get(aVar) & 2097151)) > aVar.f67273a) {
                            if (f67281i.compareAndSet(this, -1, 1)) {
                                int i10 = this.indexInArray;
                                q(0);
                                aVar.T(this, i10, 0);
                                int andDecrement = (int) (C5786a.f67270j.getAndDecrement(aVar) & 2097151);
                                if (andDecrement != i10) {
                                    Object b10 = aVar.f67279g.b(andDecrement);
                                    C6496s.e(b10);
                                    c cVar = (c) b10;
                                    aVar.f67279g.c(i10, cVar);
                                    cVar.q(i10);
                                    aVar.T(cVar, andDecrement, i10);
                                }
                                aVar.f67279g.c(andDecrement, (Object) null);
                                C6514M m10 = C6514M.f71813a;
                                this.f67284c = d.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final C5793h g(boolean z10) {
            if (s()) {
                return e(z10);
            }
            return f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f67287f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f67287f = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & a.e.API_PRIORITY_OTHER) % i10;
        }

        public final void q(int i10) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C5786a.this.f67276d);
            sb2.append("-worker-");
            if (i10 == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i10);
            }
            sb2.append(str);
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            boolean z10;
            d dVar2 = this.f67284c;
            if (dVar2 == d.CPU_ACQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                C5786a.f67270j.addAndGet(C5786a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f67284c = dVar;
            }
            return z10;
        }

        public c(C5786a aVar, int i10) {
            this();
            q(i10);
        }
    }
}
