package z9;

import D9.a;
import com.google.common.collect.C4770v;
import ja.B;
import ja.C3645a;
import java.util.Arrays;
import java.util.List;
import k9.C3717q0;
import m9.E;
import q9.C3965E;
import z9.i;

final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f50136o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f50137p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f50138n;

    h() {
    }

    private long n(byte[] bArr) {
        byte b10;
        int i10;
        byte b11 = bArr[0];
        byte b12 = b11 & 255;
        byte b13 = b11 & 3;
        if (b13 != 0) {
            b10 = 2;
            if (!(b13 == 1 || b13 == 2)) {
                b10 = bArr[1] & 63;
            }
        } else {
            b10 = 1;
        }
        int i11 = b12 >> 3;
        int i12 = i11 & 3;
        if (i11 >= 16) {
            i10 = 2500 << i12;
        } else if (i11 >= 12) {
            i10 = 10000 << (i11 & 1);
        } else if (i12 == 3) {
            i10 = 60000;
        } else {
            i10 = 10000 << i12;
        }
        return ((long) b10) * ((long) i10);
    }

    private static boolean o(B b10, byte[] bArr) {
        if (b10.a() < bArr.length) {
            return false;
        }
        int e10 = b10.e();
        byte[] bArr2 = new byte[bArr.length];
        b10.j(bArr2, 0, bArr.length);
        b10.P(e10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(B b10) {
        return o(b10, f50136o);
    }

    /* access modifiers changed from: protected */
    public long f(B b10) {
        return c(n(b10.d()));
    }

    /* access modifiers changed from: protected */
    public boolean h(B b10, long j10, i.b bVar) {
        if (o(b10, f50136o)) {
            byte[] copyOf = Arrays.copyOf(b10.d(), b10.f());
            int c10 = E.c(copyOf);
            List a10 = E.a(copyOf);
            if (bVar.f50152a != null) {
                return true;
            }
            bVar.f50152a = new C3717q0.b().e0("audio/opus").H(c10).f0(48000).T(a10).E();
            return true;
        }
        byte[] bArr = f50137p;
        if (o(b10, bArr)) {
            C3645a.h(bVar.f50152a);
            if (this.f50138n) {
                return true;
            }
            this.f50138n = true;
            b10.Q(bArr.length);
            a c11 = C3965E.c(C4770v.A(C3965E.j(b10, false, false).f47812b));
            if (c11 == null) {
                return true;
            }
            bVar.f50152a = bVar.f50152a.b().X(c11.b(bVar.f50152a.f45768j)).E();
            return true;
        }
        C3645a.h(bVar.f50152a);
        return false;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f50138n = false;
        }
    }
}
