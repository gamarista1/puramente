package W9;

import com.google.common.collect.C4770v;
import ja.C3645a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final c f34965a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final l f34966b = new l();

    /* renamed from: c  reason: collision with root package name */
    private final Deque f34967c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private int f34968d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34969e;

    class a extends m {
        a() {
        }

        public void u() {
            f.this.i(this);
        }
    }

    private static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        private final long f34971a;

        /* renamed from: b  reason: collision with root package name */
        private final C4770v f34972b;

        public b(long j10, C4770v vVar) {
            this.f34971a = j10;
            this.f34972b = vVar;
        }

        public int a(long j10) {
            if (this.f34971a > j10) {
                return 0;
            }
            return -1;
        }

        public List b(long j10) {
            if (j10 >= this.f34971a) {
                return this.f34972b;
            }
            return C4770v.E();
        }

        public long c(int i10) {
            boolean z10;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            return this.f34971a;
        }

        public int e() {
            return 1;
        }
    }

    public f() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f34967c.addFirst(new a());
        }
        this.f34968d = 0;
    }

    /* access modifiers changed from: private */
    public void i(m mVar) {
        boolean z10;
        if (this.f34967c.size() < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        C3645a.a(!this.f34967c.contains(mVar));
        mVar.i();
        this.f34967c.addFirst(mVar);
    }

    /* renamed from: f */
    public l d() {
        C3645a.f(!this.f34969e);
        if (this.f34968d != 0) {
            return null;
        }
        this.f34968d = 1;
        return this.f34966b;
    }

    public void flush() {
        C3645a.f(!this.f34969e);
        this.f34966b.i();
        this.f34968d = 0;
    }

    /* renamed from: g */
    public m a() {
        C3645a.f(!this.f34969e);
        if (this.f34968d != 2 || this.f34967c.isEmpty()) {
            return null;
        }
        m mVar = (m) this.f34967c.removeFirst();
        if (this.f34966b.p()) {
            mVar.f(4);
        } else {
            l lVar = this.f34966b;
            b bVar = new b(lVar.f46952e, this.f34965a.a(((ByteBuffer) C3645a.e(lVar.f46950c)).array()));
            mVar.x(this.f34966b.f46952e, bVar, 0);
        }
        this.f34966b.i();
        this.f34968d = 0;
        return mVar;
    }

    /* renamed from: h */
    public void c(l lVar) {
        boolean z10;
        boolean z11 = true;
        C3645a.f(!this.f34969e);
        if (this.f34968d == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (this.f34966b != lVar) {
            z11 = false;
        }
        C3645a.a(z11);
        this.f34968d = 2;
    }

    public void release() {
        this.f34969e = true;
    }

    public void b(long j10) {
    }
}
