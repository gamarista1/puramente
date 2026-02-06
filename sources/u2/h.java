package U2;

import U2.i;
import com.google.common.collect.C4770v;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import java.util.Arrays;
import java.util.List;
import z2.H;
import z2.S;

final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f6375o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f6376p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n  reason: collision with root package name */
    private boolean f6377n;

    h() {
    }

    private static boolean n(C2073A a10, byte[] bArr) {
        if (a10.a() < bArr.length) {
            return false;
        }
        int f10 = a10.f();
        byte[] bArr2 = new byte[bArr.length];
        a10.l(bArr2, 0, bArr.length);
        a10.U(f10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(C2073A a10) {
        return n(a10, f6375o);
    }

    /* access modifiers changed from: protected */
    public long f(C2073A a10) {
        return c(H.e(a10.e()));
    }

    /* access modifiers changed from: protected */
    public boolean h(C2073A a10, long j10, i.b bVar) {
        if (n(a10, f6375o)) {
            byte[] copyOf = Arrays.copyOf(a10.e(), a10.g());
            int c10 = H.c(copyOf);
            List a11 = H.a(copyOf);
            if (bVar.f6391a != null) {
                return true;
            }
            bVar.f6391a = new s.b().o0("audio/opus").N(c10).p0(48000).b0(a11).K();
            return true;
        }
        byte[] bArr = f6376p;
        if (n(a10, bArr)) {
            C2076a.i(bVar.f6391a);
            if (this.f6377n) {
                return true;
            }
            this.f6377n = true;
            a10.V(bArr.length);
            z d10 = S.d(C4770v.A(S.k(a10, false, false).f29139b));
            if (d10 == null) {
                return true;
            }
            bVar.f6391a = bVar.f6391a.a().h0(d10.b(bVar.f6391a.f20080k)).K();
            return true;
        }
        C2076a.i(bVar.f6391a);
        return false;
    }

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f6377n = false;
        }
    }
}
