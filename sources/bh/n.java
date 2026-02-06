package bh;

import Wg.i;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.N;

public final class n {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67319b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67320c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67321d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67322e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray f67323a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<n> cls = n.class;
        f67319b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        f67320c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        f67321d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        f67322e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    private final C5793h b(C5793h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f67307b.b() == 1) {
            f67322e.incrementAndGet(this);
        }
        int i10 = f67320c.get(this) & 127;
        while (this.f67323a.get(i10) != null) {
            Thread.yield();
        }
        this.f67323a.lazySet(i10, hVar);
        f67320c.incrementAndGet(this);
        return null;
    }

    private final void c(C5793h hVar) {
        if (hVar != null && hVar.f67307b.b() == 1) {
            f67322e.decrementAndGet(this);
        }
    }

    private final int e() {
        return f67320c.get(this) - f67321d.get(this);
    }

    private final C5793h m() {
        C5793h hVar;
        while (true) {
            int i10 = f67321d.get(this);
            if (i10 - f67320c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f67321d.compareAndSet(this, i10, i10 + 1) && (hVar = (C5793h) this.f67323a.getAndSet(i11, (Object) null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(C5789d dVar) {
        C5793h m10 = m();
        if (m10 == null) {
            return false;
        }
        dVar.a(m10);
        return true;
    }

    private final C5793h o(boolean z10) {
        C5793h hVar;
        do {
            hVar = (C5793h) f67319b.get(this);
            if (hVar != null) {
                boolean z11 = true;
                if (hVar.f67307b.b() != 1) {
                    z11 = false;
                }
                if (z11 == z10) {
                }
            }
            int i10 = f67321d.get(this);
            int i11 = f67320c.get(this);
            while (i10 != i11) {
                if (z10 && f67322e.get(this) == 0) {
                    return null;
                }
                i11--;
                C5793h q10 = q(i11, z10);
                if (q10 != null) {
                    return q10;
                }
            }
            return null;
        } while (!b.a(f67319b, this, hVar, (Object) null));
        return hVar;
    }

    private final C5793h p(int i10) {
        int i11 = f67321d.get(this);
        int i12 = f67320c.get(this);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        while (i11 != i12) {
            if (z10 && f67322e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            C5793h q10 = q(i11, z10);
            if (q10 != null) {
                return q10;
            }
            i11 = i13;
        }
        return null;
    }

    private final C5793h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        C5793h hVar = (C5793h) this.f67323a.get(i11);
        if (hVar != null) {
            boolean z11 = true;
            if (hVar.f67307b.b() != 1) {
                z11 = false;
            }
            if (z11 == z10 && i.a(this.f67323a, i11, hVar, (Object) null)) {
                if (z10) {
                    f67322e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long s(int i10, N n10) {
        C5793h hVar;
        do {
            hVar = (C5793h) f67319b.get(this);
            if (hVar == null) {
                return -2;
            }
            int i11 = 1;
            if (hVar.f67307b.b() != 1) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2;
            }
            long a10 = l.f67315f.a() - hVar.f67306a;
            long j10 = l.f67311b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(f67319b, this, hVar, (Object) null));
        n10.f71759a = hVar;
        return -1;
    }

    public final C5793h a(C5793h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        C5793h hVar2 = (C5793h) f67319b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        if (f67319b.get(this) != null) {
            return e() + 1;
        }
        return e();
    }

    public final void j(C5789d dVar) {
        C5793h hVar = (C5793h) f67319b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (n(dVar));
    }

    public final C5793h k() {
        C5793h hVar = (C5793h) f67319b.getAndSet(this, (Object) null);
        if (hVar == null) {
            return m();
        }
        return hVar;
    }

    public final C5793h l() {
        return o(true);
    }

    public final long r(int i10, N n10) {
        C5793h hVar;
        if (i10 == 3) {
            hVar = m();
        } else {
            hVar = p(i10);
        }
        if (hVar == null) {
            return s(i10, n10);
        }
        n10.f71759a = hVar;
        return -1;
    }
}
