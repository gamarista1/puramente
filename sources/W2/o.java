package W2;

import W2.s;
import com.google.common.primitives.f;
import f2.C1961B;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z2.C2972p;
import z2.C2973q;
import z2.E;
import z2.I;
import z2.O;
import z2.r;

public class o implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final s f8647a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8648b = new d();

    /* renamed from: c  reason: collision with root package name */
    private final s f8649c;

    /* renamed from: d  reason: collision with root package name */
    private final List f8650d;

    /* renamed from: e  reason: collision with root package name */
    private final C2073A f8651e = new C2073A();

    /* renamed from: f  reason: collision with root package name */
    private byte[] f8652f = L.f22077f;

    /* renamed from: g  reason: collision with root package name */
    private O f8653g;

    /* renamed from: h  reason: collision with root package name */
    private int f8654h;

    /* renamed from: i  reason: collision with root package name */
    private int f8655i;

    /* renamed from: j  reason: collision with root package name */
    private long[] f8656j;

    /* renamed from: k  reason: collision with root package name */
    private long f8657k;

    private static class b implements Comparable {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f8658a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f8659b;

        /* renamed from: c */
        public int compareTo(b bVar) {
            return Long.compare(this.f8658a, bVar.f8658a);
        }

        private b(long j10, byte[] bArr) {
            this.f8658a = j10;
            this.f8659b = bArr;
        }
    }

    public o(s sVar, s sVar2) {
        this.f8647a = sVar;
        this.f8649c = sVar2.a().o0("application/x-media3-cues").O(sVar2.f20083n).S(sVar.c()).K();
        this.f8650d = new ArrayList();
        this.f8655i = 0;
        this.f8656j = L.f22078g;
        this.f8657k = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(e eVar) {
        b bVar = new b(eVar.f8638b, this.f8648b.a(eVar.f8637a, eVar.f8639c));
        this.f8650d.add(bVar);
        long j10 = this.f8657k;
        if (j10 == -9223372036854775807L || eVar.f8638b >= j10) {
            m(bVar);
        }
    }

    private void d() {
        s.b b10;
        try {
            long j10 = this.f8657k;
            if (j10 != -9223372036854775807L) {
                b10 = s.b.c(j10);
            } else {
                b10 = s.b.b();
            }
            this.f8647a.a(this.f8652f, 0, this.f8654h, b10, new n(this));
            Collections.sort(this.f8650d);
            this.f8656j = new long[this.f8650d.size()];
            for (int i10 = 0; i10 < this.f8650d.size(); i10++) {
                this.f8656j[i10] = ((b) this.f8650d.get(i10)).f8658a;
            }
            this.f8652f = L.f22077f;
        } catch (RuntimeException e10) {
            throw C1961B.a("SubtitleParser failed.", e10);
        }
    }

    private boolean e(C2973q qVar) {
        byte[] bArr = this.f8652f;
        if (bArr.length == this.f8654h) {
            this.f8652f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f8652f;
        int i10 = this.f8654h;
        int read = qVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            this.f8654h += read;
        }
        long a10 = qVar.a();
        if ((a10 == -1 || ((long) this.f8654h) != a10) && read != -1) {
            return false;
        }
        return true;
    }

    private boolean g(C2973q qVar) {
        int i10;
        if (qVar.a() != -1) {
            i10 = f.d(qVar.a());
        } else {
            i10 = 1024;
        }
        if (qVar.b(i10) == -1) {
            return true;
        }
        return false;
    }

    private void l() {
        int i10;
        long j10 = this.f8657k;
        if (j10 == -9223372036854775807L) {
            i10 = 0;
        } else {
            i10 = L.g(this.f8656j, j10, true, true);
        }
        while (i10 < this.f8650d.size()) {
            m((b) this.f8650d.get(i10));
            i10++;
        }
    }

    private void m(b bVar) {
        C2076a.i(this.f8653g);
        int length = bVar.f8659b.length;
        this.f8651e.R(bVar.f8659b);
        this.f8653g.f(this.f8651e, length);
        this.f8653g.d(bVar.f8658a, 1, length, 0, (O.a) null);
    }

    public void a(long j10, long j11) {
        boolean z10;
        int i10 = this.f8655i;
        if (i10 == 0 || i10 == 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.g(z10);
        this.f8657k = j11;
        if (this.f8655i == 2) {
            this.f8655i = 1;
        }
        if (this.f8655i == 4) {
            this.f8655i = 3;
        }
    }

    public void f(r rVar) {
        boolean z10;
        if (this.f8655i == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        O d10 = rVar.d(0, 3);
        this.f8653g = d10;
        d10.c(this.f8649c);
        rVar.k();
        rVar.u(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f8655i = 1;
    }

    public int i(C2973q qVar, I i10) {
        boolean z10;
        int i11;
        int i12 = this.f8655i;
        if (i12 == 0 || i12 == 5) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.g(z10);
        if (this.f8655i == 1) {
            if (qVar.a() != -1) {
                i11 = f.d(qVar.a());
            } else {
                i11 = 1024;
            }
            if (i11 > this.f8652f.length) {
                this.f8652f = new byte[i11];
            }
            this.f8654h = 0;
            this.f8655i = 2;
        }
        if (this.f8655i == 2 && e(qVar)) {
            d();
            this.f8655i = 4;
        }
        if (this.f8655i == 3 && g(qVar)) {
            l();
            this.f8655i = 4;
        }
        if (this.f8655i == 4) {
            return -1;
        }
        return 0;
    }

    public boolean j(C2973q qVar) {
        return true;
    }

    public void release() {
        if (this.f8655i != 5) {
            this.f8647a.reset();
            this.f8655i = 5;
        }
    }
}
