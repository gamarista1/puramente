package A9;

import A9.I;
import ja.B;
import m9.C3844b;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

/* renamed from: A9.b  reason: case insensitive filesystem */
public final class C2985b implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final p f29512d = new C2984a();

    /* renamed from: a  reason: collision with root package name */
    private final C2986c f29513a = new C2986c();

    /* renamed from: b  reason: collision with root package name */
    private final B f29514b = new B(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f29515c;

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] c() {
        return new k[]{new C2985b()};
    }

    public void a(long j10, long j11) {
        this.f29515c = false;
        this.f29513a.a();
    }

    public void f(m mVar) {
        this.f29513a.f(mVar, new I.d(0, 1));
        mVar.k();
        mVar.q(new z.b(-9223372036854775807L));
    }

    public boolean h(l lVar) {
        B b10 = new B(10);
        int i10 = 0;
        while (true) {
            lVar.l(b10.d(), 0, 10);
            b10.P(0);
            if (b10.G() != 4801587) {
                break;
            }
            b10.Q(3);
            int C10 = b10.C();
            i10 += C10 + 10;
            lVar.h(C10);
        }
        lVar.e();
        lVar.h(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.l(b10.d(), 0, 6);
            b10.P(0);
            if (b10.J() != 2935) {
                lVar.e();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.h(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int f10 = C3844b.f(b10.d());
                if (f10 == -1) {
                    return false;
                }
                lVar.h(f10 - 6);
            }
        }
    }

    public int i(l lVar, y yVar) {
        int read = lVar.read(this.f29514b.d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f29514b.P(0);
        this.f29514b.O(read);
        if (!this.f29515c) {
            this.f29513a.d(0, 4);
            this.f29515c = true;
        }
        this.f29513a.c(this.f29514b);
        return 0;
    }

    public void release() {
    }
}
