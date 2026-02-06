package X9;

import W9.h;
import W9.i;
import W9.l;
import W9.m;
import ja.C3645a;
import ja.M;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import n9.C3872h;

abstract class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque f35636a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f35637b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityQueue f35638c;

    /* renamed from: d  reason: collision with root package name */
    private b f35639d;

    /* renamed from: e  reason: collision with root package name */
    private long f35640e;

    /* renamed from: f  reason: collision with root package name */
    private long f35641f;

    private static final class b extends l implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f35642j;

        private b() {
        }

        /* renamed from: E */
        public int compareTo(b bVar) {
            if (p() == bVar.p()) {
                long j10 = this.f46952e - bVar.f46952e;
                if (j10 == 0) {
                    j10 = this.f35642j - bVar.f35642j;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
                return -1;
            } else if (p()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    private static final class c extends m {

        /* renamed from: f  reason: collision with root package name */
        private C3872h.a f35643f;

        public c(C3872h.a aVar) {
            this.f35643f = aVar;
        }

        public final void u() {
            this.f35643f.a(this);
        }
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f35636a.add(new b());
        }
        this.f35637b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f35637b.add(new c(new d(this)));
        }
        this.f35638c = new PriorityQueue();
    }

    private void m(b bVar) {
        bVar.i();
        this.f35636a.add(bVar);
    }

    public void b(long j10) {
        this.f35640e = j10;
    }

    /* access modifiers changed from: protected */
    public abstract h e();

    /* access modifiers changed from: protected */
    public abstract void f(l lVar);

    public void flush() {
        this.f35641f = 0;
        this.f35640e = 0;
        while (!this.f35638c.isEmpty()) {
            m((b) M.j((b) this.f35638c.poll()));
        }
        b bVar = this.f35639d;
        if (bVar != null) {
            m(bVar);
            this.f35639d = null;
        }
    }

    /* renamed from: g */
    public l d() {
        boolean z10;
        if (this.f35639d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (this.f35636a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f35636a.pollFirst();
        this.f35639d = bVar;
        return bVar;
    }

    /* renamed from: h */
    public m a() {
        if (this.f35637b.isEmpty()) {
            return null;
        }
        while (!this.f35638c.isEmpty() && ((b) M.j((b) this.f35638c.peek())).f46952e <= this.f35640e) {
            b bVar = (b) M.j((b) this.f35638c.poll());
            if (bVar.p()) {
                m mVar = (m) M.j((m) this.f35637b.pollFirst());
                mVar.f(4);
                m(bVar);
                return mVar;
            }
            f(bVar);
            if (k()) {
                h e10 = e();
                m mVar2 = (m) M.j((m) this.f35637b.pollFirst());
                mVar2.x(bVar.f46952e, e10, Long.MAX_VALUE);
                m(bVar);
                return mVar2;
            }
            m(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final m i() {
        return (m) this.f35637b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long j() {
        return this.f35640e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean k();

    /* renamed from: l */
    public void c(l lVar) {
        boolean z10;
        if (lVar == this.f35639d) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        b bVar = (b) lVar;
        if (bVar.o()) {
            m(bVar);
        } else {
            long j10 = this.f35641f;
            this.f35641f = 1 + j10;
            long unused = bVar.f35642j = j10;
            this.f35638c.add(bVar);
        }
        this.f35639d = null;
    }

    /* access modifiers changed from: protected */
    public void n(m mVar) {
        mVar.i();
        this.f35637b.add(mVar);
    }

    public void release() {
    }
}
