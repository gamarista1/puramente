package z2;

import f2.C1975j;
import f2.s;
import i2.C2073A;
import java.util.Arrays;

public interface O {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29123a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f29124b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29125c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29126d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f29123a = i10;
            this.f29124b = bArr;
            this.f29125c = i11;
            this.f29126d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29123a == aVar.f29123a && this.f29125c == aVar.f29125c && this.f29126d == aVar.f29126d && Arrays.equals(this.f29124b, aVar.f29124b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f29123a * 31) + Arrays.hashCode(this.f29124b)) * 31) + this.f29125c) * 31) + this.f29126d;
        }
    }

    int a(C1975j jVar, int i10, boolean z10) {
        return b(jVar, i10, z10, 0);
    }

    int b(C1975j jVar, int i10, boolean z10, int i11);

    void c(s sVar);

    void d(long j10, int i10, int i11, int i12, a aVar);

    void e(C2073A a10, int i10, int i11);

    void f(C2073A a10, int i10) {
        e(a10, i10, 0);
    }
}
