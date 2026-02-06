package J0;

import a0.C1538b;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    private int f3748a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f3749b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private C1538b[] f3750c = new C1538b[16];

    public final boolean a() {
        int i10 = this.f3748a;
        if (i10 <= 0 || this.f3749b[i10 - 1] < 0) {
            return false;
        }
        return true;
    }

    public final Object b() {
        int i10 = this.f3748a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            int i12 = this.f3749b[i11];
            C1538b bVar = this.f3750c[i11];
            C6496s.e(bVar);
            if (i12 > 0) {
                int[] iArr = this.f3749b;
                iArr[i11] = iArr[i11] - 1;
            } else if (i12 == 0) {
                this.f3750c[i11] = null;
                this.f3748a--;
            }
            return bVar.p()[i12];
        }
        throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
    }

    public final void c(C1538b bVar) {
        if (!bVar.s()) {
            int i10 = this.f3748a;
            int[] iArr = this.f3749b;
            if (i10 >= iArr.length) {
                int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f3749b = copyOf;
                C1538b[] bVarArr = this.f3750c;
                Object[] copyOf2 = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                C6496s.g(copyOf2, "copyOf(this, newSize)");
                this.f3750c = (C1538b[]) copyOf2;
            }
            this.f3749b[i10] = bVar.q() - 1;
            this.f3750c[i10] = bVar;
            this.f3748a++;
        }
    }
}
