package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class B extends C1599m {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final void g(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f12186b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f12186b);
        }
        j(i12 + 1);
        int[] iArr = this.f12185a;
        int i13 = this.f12186b;
        if (i10 != i13) {
            C6559l.k(iArr, iArr, i10 + 1, i10, i13);
        }
        iArr[i10] = i11;
        this.f12186b++;
    }

    public final boolean h(int i10) {
        j(this.f12186b + 1);
        int[] iArr = this.f12185a;
        int i11 = this.f12186b;
        iArr[i11] = i10;
        this.f12186b = i11 + 1;
        return true;
    }

    public final boolean i(int i10, int[] iArr) {
        int i11;
        C6496s.h(iArr, "elements");
        if (i10 < 0 || i10 > (i11 = this.f12186b)) {
            throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + this.f12186b);
        } else if (iArr.length == 0) {
            return false;
        } else {
            j(i11 + iArr.length);
            int[] iArr2 = this.f12185a;
            int i12 = this.f12186b;
            if (i10 != i12) {
                C6559l.k(iArr2, iArr2, iArr.length + i10, i10, i12);
            }
            C6559l.p(iArr, iArr2, i10, 0, 0, 12, (Object) null);
            this.f12186b += iArr.length;
            return true;
        }
    }

    public final void j(int i10) {
        int[] iArr = this.f12185a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f12185a = copyOf;
        }
    }

    public final void k(int[] iArr) {
        C6496s.h(iArr, "elements");
        i(this.f12186b, iArr);
    }

    public final int l(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f12186b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f12186b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.f12185a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            C6559l.k(iArr, iArr, i10, i10 + 1, i11);
        }
        this.f12186b--;
        return i12;
    }

    public final int m(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f12186b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("set index ");
            sb2.append(i10);
            sb2.append(" must be between 0 .. ");
            sb2.append(this.f12186b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int[] iArr = this.f12185a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void n() {
        int i10 = this.f12186b;
        if (i10 != 0) {
            C6559l.J(this.f12185a, 0, i10);
        }
    }

    public B(int i10) {
        super(i10, (DefaultConstructorMarker) null);
    }
}
