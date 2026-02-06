package q9;

import ia.C3610h;
import ja.B;
import java.util.Arrays;
import k9.C3717q0;

/* renamed from: q9.B  reason: case insensitive filesystem */
public interface C3962B {

    /* renamed from: q9.B$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f47791a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f47792b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47793c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47794d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f47791a = i10;
            this.f47792b = bArr;
            this.f47793c = i11;
            this.f47794d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f47791a == aVar.f47791a && this.f47793c == aVar.f47793c && this.f47794d == aVar.f47794d && Arrays.equals(this.f47792b, aVar.f47792b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f47791a * 31) + Arrays.hashCode(this.f47792b)) * 31) + this.f47793c) * 31) + this.f47794d;
        }
    }

    int a(C3610h hVar, int i10, boolean z10) {
        return e(hVar, i10, z10, 0);
    }

    void b(B b10, int i10, int i11);

    void c(C3717q0 q0Var);

    void d(B b10, int i10) {
        b(b10, i10, 0);
    }

    int e(C3610h hVar, int i10, boolean z10, int i11);

    void f(long j10, int i10, int i11, int i12, a aVar);
}
