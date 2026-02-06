package t2;

import androidx.media3.exoplayer.U;
import com.google.common.collect.C4770v;
import i2.C2076a;
import java.util.List;

/* renamed from: t2.h  reason: case insensitive filesystem */
public final class C2642h implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C4770v f26264a;

    /* renamed from: b  reason: collision with root package name */
    private long f26265b;

    /* renamed from: t2.h$a */
    private static final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f26266a;

        /* renamed from: b  reason: collision with root package name */
        private final C4770v f26267b;

        public a(a0 a0Var, List list) {
            this.f26266a = a0Var;
            this.f26267b = C4770v.z(list);
        }

        public long a() {
            return this.f26266a.a();
        }

        public boolean b() {
            return this.f26266a.b();
        }

        public long c() {
            return this.f26266a.c();
        }

        public C4770v d() {
            return this.f26267b;
        }

        public boolean e(U u10) {
            return this.f26266a.e(u10);
        }

        public void f(long j10) {
            this.f26266a.f(j10);
        }
    }

    public C2642h(List list, List list2) {
        boolean z10;
        C4770v.a t10 = C4770v.t();
        if (list.size() == list2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(new a((a0) list.get(i10), (List) list2.get(i10)));
        }
        this.f26264a = t10.k();
        this.f26265b = -9223372036854775807L;
    }

    public long a() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f26264a.size(); i10++) {
            long a10 = ((a) this.f26264a.get(i10)).a();
            if (a10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, a10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public boolean b() {
        for (int i10 = 0; i10 < this.f26264a.size(); i10++) {
            if (((a) this.f26264a.get(i10)).b()) {
                return true;
            }
        }
        return false;
    }

    public long c() {
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f26264a.size(); i10++) {
            a aVar = (a) this.f26264a.get(i10);
            long c10 = aVar.c();
            if ((aVar.d().contains(1) || aVar.d().contains(2) || aVar.d().contains(4)) && c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
            if (c10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, c10);
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.f26265b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f26265b;
            if (j12 != -9223372036854775807L) {
                return j12;
            }
            return j11;
        }
    }

    public boolean e(U u10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long a10 = a();
            if (a10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.f26264a.size(); i10++) {
                long a11 = ((a) this.f26264a.get(i10)).a();
                if (a11 == Long.MIN_VALUE || a11 > u10.f17543a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (a11 == a10 || z11) {
                    z10 |= ((a) this.f26264a.get(i10)).e(u10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    public void f(long j10) {
        for (int i10 = 0; i10 < this.f26264a.size(); i10++) {
            ((a) this.f26264a.get(i10)).f(j10);
        }
    }
}
