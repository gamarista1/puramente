package v9;

import q9.C3961A;
import q9.C3962B;
import q9.m;
import q9.z;

public final class d implements m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final long f48984a;

    /* renamed from: b  reason: collision with root package name */
    private final m f48985b;

    class a implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f48986a;

        a(z zVar) {
            this.f48986a = zVar;
        }

        public z.a c(long j10) {
            z.a c10 = this.f48986a.c(j10);
            C3961A a10 = c10.f47920a;
            C3961A a11 = new C3961A(a10.f47789a, a10.f47790b + d.this.f48984a);
            C3961A a12 = c10.f47921b;
            return new z.a(a11, new C3961A(a12.f47789a, a12.f47790b + d.this.f48984a));
        }

        public boolean e() {
            return this.f48986a.e();
        }

        public long g() {
            return this.f48986a.g();
        }
    }

    public d(long j10, m mVar) {
        this.f48984a = j10;
        this.f48985b = mVar;
    }

    public C3962B d(int i10, int i11) {
        return this.f48985b.d(i10, i11);
    }

    public void k() {
        this.f48985b.k();
    }

    public void q(z zVar) {
        this.f48985b.q(new a(zVar));
    }
}
