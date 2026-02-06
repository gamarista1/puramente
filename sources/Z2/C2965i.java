package z2;

import f2.C1975j;
import f2.x;
import i2.L;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: z2.i  reason: case insensitive filesystem */
public final class C2965i implements C2973q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f29227a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final C1975j f29228b;

    /* renamed from: c  reason: collision with root package name */
    private final long f29229c;

    /* renamed from: d  reason: collision with root package name */
    private long f29230d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f29231e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f29232f;

    /* renamed from: g  reason: collision with root package name */
    private int f29233g;

    static {
        x.a("media3.extractor");
    }

    public C2965i(C1975j jVar, long j10, long j11) {
        this.f29228b = jVar;
        this.f29230d = j10;
        this.f29229c = j11;
    }

    private void o(int i10) {
        if (i10 != -1) {
            this.f29230d += (long) i10;
        }
    }

    private void p(int i10) {
        int i11 = this.f29232f + i10;
        byte[] bArr = this.f29231e;
        if (i11 > bArr.length) {
            this.f29231e = Arrays.copyOf(this.f29231e, L.o(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int q(byte[] bArr, int i10, int i11) {
        int i12 = this.f29233g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f29231e, 0, bArr, i10, min);
        u(min);
        return min;
    }

    private int r(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f29228b.read(bArr, i10 + i12, i11 - i12);
            if (read != -1) {
                return i12 + read;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private int s(int i10) {
        int min = Math.min(this.f29233g, i10);
        u(min);
        return min;
    }

    private void u(int i10) {
        byte[] bArr;
        int i11 = this.f29233g - i10;
        this.f29233g = i11;
        this.f29232f = 0;
        byte[] bArr2 = this.f29231e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[(65536 + i11)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f29231e = bArr;
    }

    public long a() {
        return this.f29229c;
    }

    public int b(int i10) {
        int s10 = s(i10);
        if (s10 == 0) {
            byte[] bArr = this.f29227a;
            s10 = r(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        o(s10);
        return s10;
    }

    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f29231e, this.f29232f - i11, bArr, i10, i11);
        return true;
    }

    public void e() {
        this.f29232f = 0;
    }

    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        int q10 = q(bArr, i10, i11);
        while (q10 < i11 && q10 != -1) {
            q10 = r(bArr, i10, i11, q10, z10);
        }
        o(q10);
        if (q10 != -1) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.f29230d + ((long) this.f29232f);
    }

    public long getPosition() {
        return this.f29230d;
    }

    public void h(int i10) {
        k(i10, false);
    }

    public int i(byte[] bArr, int i10, int i11) {
        int i12;
        p(i11);
        int i13 = this.f29233g;
        int i14 = this.f29232f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = r(this.f29231e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f29233g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f29231e, this.f29232f, bArr, i10, i12);
        this.f29232f += i12;
        return i12;
    }

    public void j(int i10) {
        t(i10, false);
    }

    public boolean k(int i10, boolean z10) {
        p(i10);
        int i11 = this.f29233g - this.f29232f;
        while (i11 < i10) {
            i11 = r(this.f29231e, this.f29232f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f29233g = this.f29232f + i11;
        }
        this.f29232f += i10;
        return true;
    }

    public void l(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    public int read(byte[] bArr, int i10, int i11) {
        int q10 = q(bArr, i10, i11);
        if (q10 == 0) {
            q10 = r(bArr, i10, i11, 0, true);
        }
        o(q10);
        return q10;
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        f(bArr, i10, i11, false);
    }

    public boolean t(int i10, boolean z10) {
        int s10 = s(i10);
        while (s10 < i10 && s10 != -1) {
            s10 = r(this.f29227a, -s10, Math.min(i10, this.f29227a.length + s10), s10, z10);
        }
        o(s10);
        if (s10 != -1) {
            return true;
        }
        return false;
    }
}
