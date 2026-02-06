package vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import sh.C6726e;

/* renamed from: vh.d  reason: case insensitive filesystem */
public final class C6759d {

    /* renamed from: a  reason: collision with root package name */
    private final C6760e f73688a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73689b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73690c;

    /* renamed from: d  reason: collision with root package name */
    private C6756a f73691d;

    /* renamed from: e  reason: collision with root package name */
    private final List f73692e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f73693f;

    public C6759d(C6760e eVar, String str) {
        C6496s.h(eVar, "taskRunner");
        C6496s.h(str, "name");
        this.f73688a = eVar;
        this.f73689b = str;
    }

    public static /* synthetic */ void j(C6759d dVar, C6756a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            synchronized (this.f73688a) {
                try {
                    if (b()) {
                        this.f73688a.h(this);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean b() {
        C6756a aVar = this.f73691d;
        if (aVar != null) {
            C6496s.e(aVar);
            if (aVar.a()) {
                this.f73693f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f73692e.size() - 1; -1 < size; size--) {
            if (((C6756a) this.f73692e.get(size)).a()) {
                C6756a aVar2 = (C6756a) this.f73692e.get(size);
                if (C6760e.f73694h.a().isLoggable(Level.FINE)) {
                    C6757b.c(aVar2, this, "canceled");
                }
                this.f73692e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final C6756a c() {
        return this.f73691d;
    }

    public final boolean d() {
        return this.f73693f;
    }

    public final List e() {
        return this.f73692e;
    }

    public final String f() {
        return this.f73689b;
    }

    public final boolean g() {
        return this.f73690c;
    }

    public final C6760e h() {
        return this.f73688a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(vh.C6756a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            vh.e r0 = r2.f73688a
            monitor-enter(r0)
            boolean r1 = r2.f73690c     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0043
            boolean r4 = r3.a()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x002a
            vh.e$b r4 = vh.C6760e.f73694h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            vh.C6757b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0053
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            vh.e$b r4 = vh.C6760e.f73694h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            vh.C6757b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
        L_0x003d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0026 }
            r3.<init>()     // Catch:{ all -> 0x0026 }
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x004f
            vh.e r3 = r2.f73688a     // Catch:{ all -> 0x0026 }
            r3.h(r2)     // Catch:{ all -> 0x0026 }
        L_0x004f:
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return
        L_0x0053:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.C6759d.i(vh.a, long):void");
    }

    public final boolean k(C6756a aVar, long j10, boolean z10) {
        String str;
        C6496s.h(aVar, "task");
        aVar.e(this);
        long b10 = this.f73688a.g().b();
        long j11 = b10 + j10;
        int indexOf = this.f73692e.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (C6760e.f73694h.a().isLoggable(Level.FINE)) {
                    C6757b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f73692e.remove(indexOf);
        }
        aVar.g(j11);
        if (C6760e.f73694h.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + C6757b.b(j11 - b10);
            } else {
                str = "scheduled after " + C6757b.b(j11 - b10);
            }
            C6757b.c(aVar, this, str);
        }
        Iterator it = this.f73692e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((C6756a) it.next()).c() - b10 > j10) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            i10 = this.f73692e.size();
        }
        this.f73692e.add(i10, aVar);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void l(C6756a aVar) {
        this.f73691d = aVar;
    }

    public final void m(boolean z10) {
        this.f73693f = z10;
    }

    public final void n() {
        if (!C6726e.f73547h || !Thread.holdsLock(this)) {
            synchronized (this.f73688a) {
                try {
                    this.f73690c = true;
                    if (b()) {
                        this.f73688a.h(this);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f73689b;
    }
}
