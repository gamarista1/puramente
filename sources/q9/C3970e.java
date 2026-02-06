package q9;

import ia.C3610h;
import ja.M;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import k9.C3711n0;

/* renamed from: q9.e  reason: case insensitive filesystem */
public final class C3970e implements l {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47864a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private final C3610h f47865b;

    /* renamed from: c  reason: collision with root package name */
    private final long f47866c;

    /* renamed from: d  reason: collision with root package name */
    private long f47867d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f47868e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    private int f47869f;

    /* renamed from: g  reason: collision with root package name */
    private int f47870g;

    static {
        C3711n0.a("goog.exo.extractor");
    }

    public C3970e(C3610h hVar, long j10, long j11) {
        this.f47865b = hVar;
        this.f47867d = j10;
        this.f47866c = j11;
    }

    private void o(int i10) {
        if (i10 != -1) {
            this.f47867d += (long) i10;
        }
    }

    private void p(int i10) {
        int i11 = this.f47869f + i10;
        byte[] bArr = this.f47868e;
        if (i11 > bArr.length) {
            this.f47868e = Arrays.copyOf(this.f47868e, M.q(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int q(byte[] bArr, int i10, int i11) {
        int i12 = this.f47870g;
        if (i12 == 0) {
            return 0;
        }
        int min = Math.min(i12, i11);
        System.arraycopy(this.f47868e, 0, bArr, i10, min);
        u(min);
        return min;
    }

    private int r(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f47865b.read(bArr, i10 + i12, i11 - i12);
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
        int min = Math.min(this.f47870g, i10);
        u(min);
        return min;
    }

    private void u(int i10) {
        byte[] bArr;
        int i11 = this.f47870g - i10;
        this.f47870g = i11;
        this.f47869f = 0;
        byte[] bArr2 = this.f47868e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[(65536 + i11)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f47868e = bArr;
    }

    public long a() {
        return this.f47866c;
    }

    public int b(int i10) {
        int s10 = s(i10);
        if (s10 == 0) {
            byte[] bArr = this.f47864a;
            s10 = r(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        o(s10);
        return s10;
    }

    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f47868e, this.f47869f - i11, bArr, i10, i11);
        return true;
    }

    public void e() {
        this.f47869f = 0;
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
        return this.f47867d + ((long) this.f47869f);
    }

    public long getPosition() {
        return this.f47867d;
    }

    public void h(int i10) {
        k(i10, false);
    }

    public int i(byte[] bArr, int i10, int i11) {
        int i12;
        p(i11);
        int i13 = this.f47870g;
        int i14 = this.f47869f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = r(this.f47868e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f47870g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f47868e, this.f47869f, bArr, i10, i12);
        this.f47869f += i12;
        return i12;
    }

    public void j(int i10) {
        t(i10, false);
    }

    public boolean k(int i10, boolean z10) {
        p(i10);
        int i11 = this.f47870g - this.f47869f;
        while (i11 < i10) {
            i11 = r(this.f47868e, this.f47869f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f47870g = this.f47869f + i11;
        }
        this.f47869f += i10;
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
            s10 = r(this.f47864a, -s10, Math.min(i10, this.f47864a.length + s10), s10, z10);
        }
        o(s10);
        if (s10 != -1) {
            return true;
        }
        return false;
    }
}
