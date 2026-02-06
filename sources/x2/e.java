package X2;

import W2.k;
import W2.l;
import W2.p;
import W2.q;
import i2.C2076a;
import i2.L;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import l2.g;

abstract class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f9663a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f9664b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue f9665c;

    /* renamed from: d  reason: collision with root package name */
    private b f9666d;

    /* renamed from: e  reason: collision with root package name */
    private long f9667e;

    /* renamed from: f  reason: collision with root package name */
    private long f9668f;

    /* renamed from: g  reason: collision with root package name */
    private long f9669g;

    private static final class b extends p implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public long f9670k;

        private b() {
        }

        /* renamed from: D */
        public int compareTo(b bVar) {
            if (m() == bVar.m()) {
                long j10 = this.f23522f - bVar.f23522f;
                if (j10 == 0) {
                    j10 = this.f9670k - bVar.f9670k;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
                return -1;
            } else if (m()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    private static final class c extends q {

        /* renamed from: g  reason: collision with root package name */
        private g.a f9671g;

        public c(g.a aVar) {
            this.f9671g = aVar;
        }

        public final void t() {
            this.f9671g.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f9663a.add(new b());
        }
        this.f9664b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f9664b.add(new c(new d(this)));
        }
        this.f9665c = new PriorityQueue();
        this.f9669g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.i();
        this.f9663a.add(bVar);
    }

    public void b(long j10) {
        this.f9667e = j10;
    }

    public final void f(long j10) {
        this.f9669g = j10;
    }

    public void flush() {
        this.f9668f = 0;
        this.f9667e = 0;
        while (!this.f9665c.isEmpty()) {
            o((b) L.h((b) this.f9665c.poll()));
        }
        b bVar = this.f9666d;
        if (bVar != null) {
            o(bVar);
            this.f9666d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract k g();

    /* access modifiers changed from: protected */
    public abstract void h(p pVar);

    /* renamed from: i */
    public p d() {
        boolean z10;
        if (this.f9666d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f9663a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f9663a.pollFirst();
        this.f9666d = bVar;
        return bVar;
    }

    /* renamed from: j */
    public q a() {
        if (this.f9664b.isEmpty()) {
            return null;
        }
        while (!this.f9665c.isEmpty() && ((b) L.h((b) this.f9665c.peek())).f23522f <= this.f9667e) {
            b bVar = (b) L.h((b) this.f9665c.poll());
            if (bVar.m()) {
                q qVar = (q) L.h((q) this.f9664b.pollFirst());
                qVar.f(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                k g10 = g();
                q qVar2 = (q) L.h((q) this.f9664b.pollFirst());
                qVar2.u(bVar.f23522f, g10, Long.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final q k() {
        return (q) this.f9664b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long l() {
        return this.f9667e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean m();

    /* renamed from: n */
    public void c(p pVar) {
        boolean z10;
        if (pVar == this.f9666d) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        b bVar = (b) pVar;
        long j10 = this.f9669g;
        if (j10 == -9223372036854775807L || bVar.f23522f >= j10) {
            long j11 = this.f9668f;
            this.f9668f = 1 + j11;
            long unused = bVar.f9670k = j11;
            this.f9665c.add(bVar);
        } else {
            o(bVar);
        }
        this.f9666d = null;
    }

    /* access modifiers changed from: protected */
    public void p(q qVar) {
        qVar.i();
        this.f9664b.add(qVar);
    }

    public void release() {
    }
}
