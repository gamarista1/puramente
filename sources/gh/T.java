package Gh;

import Hh.e;
import java.security.MessageDigest;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public final class T extends C5407h {

    /* renamed from: f  reason: collision with root package name */
    private final transient byte[][] f63253f;

    /* renamed from: g  reason: collision with root package name */
    private final transient int[] f63254g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(byte[][] bArr, int[] iArr) {
        super(C5407h.f63296e.l());
        C6496s.h(bArr, "segments");
        C6496s.h(iArr, "directory");
        this.f63253f = bArr;
        this.f63254g = iArr;
    }

    private final C5407h c0() {
        return new C5407h(T());
    }

    private final Object writeReplace() {
        C5407h c02 = c0();
        C6496s.f(c02, "null cannot be cast to non-null type java.lang.Object");
        return c02;
    }

    public int A(byte[] bArr, int i10) {
        C6496s.h(bArr, "other");
        return c0().A(bArr, i10);
    }

    public boolean F(int i10, C5407h hVar, int i11, int i12) {
        int i13;
        C6496s.h(hVar, "other");
        if (i10 < 0 || i10 > O() - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = e.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = Z()[b10 - 1];
            }
            int i15 = Z()[a0().length + b10];
            int min = Math.min(i14, (Z()[b10] - i13) + i13) - i10;
            if (!hVar.G(i11, a0()[b10], i15 + (i10 - i13), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public boolean G(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        C6496s.h(bArr, "other");
        if (i10 < 0 || i10 > O() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = e.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = Z()[b10 - 1];
            }
            int i15 = Z()[a0().length + b10];
            int min = Math.min(i14, (Z()[b10] - i13) + i13) - i10;
            if (!C5401b.a(a0()[b10], i15 + (i10 - i13), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    public C5407h Q(int i10, int i11) {
        int e10 = C5401b.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        } else if (e10 <= O()) {
            int i12 = e10 - i10;
            if (i12 < 0) {
                throw new IllegalArgumentException(("endIndex=" + e10 + " < beginIndex=" + i10).toString());
            } else if (i10 == 0 && e10 == O()) {
                return this;
            } else {
                if (i10 == e10) {
                    return C5407h.f63296e;
                }
                int b10 = e.b(this, i10);
                int b11 = e.b(this, e10 - 1);
                byte[][] bArr = (byte[][]) C6559l.s(a0(), b10, b11 + 1);
                int[] iArr = new int[(bArr.length * 2)];
                int i13 = 0;
                if (b10 <= b11) {
                    int i14 = b10;
                    int i15 = 0;
                    while (true) {
                        iArr[i15] = Math.min(Z()[i14] - i10, i12);
                        int i16 = i15 + 1;
                        iArr[i15 + bArr.length] = Z()[a0().length + i14];
                        if (i14 == b11) {
                            break;
                        }
                        i14++;
                        i15 = i16;
                    }
                }
                if (b10 != 0) {
                    i13 = Z()[b10 - 1];
                }
                int length = bArr.length;
                iArr[length] = iArr[length] + (i10 - i13);
                return new T(bArr, iArr);
            }
        } else {
            throw new IllegalArgumentException(("endIndex=" + e10 + " > length(" + O() + ')').toString());
        }
    }

    public C5407h S() {
        return c0().S();
    }

    public byte[] T() {
        byte[] bArr = new byte[O()];
        int length = a0().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = Z()[length + i10];
            int i14 = Z()[i10];
            int i15 = i14 - i11;
            C6559l.h(a0()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public void X(C5404e eVar, int i10, int i11) {
        int i12;
        C6496s.h(eVar, "buffer");
        int i13 = i10 + i11;
        int b10 = e.b(this, i10);
        while (i10 < i13) {
            if (b10 == 0) {
                i12 = 0;
            } else {
                i12 = Z()[b10 - 1];
            }
            int i14 = Z()[a0().length + b10];
            int min = Math.min(i13, (Z()[b10] - i12) + i12) - i10;
            int i15 = i14 + (i10 - i12);
            Q q10 = new Q(a0()[b10], i15, i15 + min, true, false);
            Q q11 = eVar.f63284a;
            if (q11 == null) {
                q10.f63247g = q10;
                q10.f63246f = q10;
                eVar.f63284a = q10;
            } else {
                C6496s.e(q11);
                Q q12 = q11.f63247g;
                C6496s.e(q12);
                q12.c(q10);
            }
            i10 += min;
            b10++;
        }
        eVar.x0(eVar.B0() + ((long) i11));
    }

    public final int[] Z() {
        return this.f63254g;
    }

    public String a() {
        return c0().a();
    }

    public final byte[][] a0() {
        return this.f63253f;
    }

    public C5407h e(String str) {
        C6496s.h(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = a0().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = Z()[length + i10];
            int i13 = Z()[i10];
            instance.update(a0()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = instance.digest();
        C6496s.e(digest);
        return new C5407h(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5407h) {
            C5407h hVar = (C5407h) obj;
            if (hVar.O() == O() && F(0, hVar, 0, O())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m10 = m();
        if (m10 != 0) {
            return m10;
        }
        int length = a0().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = Z()[length + i10];
            int i14 = Z()[i10];
            byte[] bArr = a0()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        H(i11);
        return i11;
    }

    public int o() {
        return Z()[a0().length - 1];
    }

    public String r() {
        return c0().r();
    }

    public int t(byte[] bArr, int i10) {
        C6496s.h(bArr, "other");
        return c0().t(bArr, i10);
    }

    public String toString() {
        return c0().toString();
    }

    public byte[] x() {
        return T();
    }

    public byte y(int i10) {
        int i11;
        C5401b.b((long) Z()[a0().length - 1], (long) i10, 1);
        int b10 = e.b(this, i10);
        if (b10 == 0) {
            i11 = 0;
        } else {
            i11 = Z()[b10 - 1];
        }
        return a0()[b10][(i10 - i11) + Z()[a0().length + b10]];
    }
}
