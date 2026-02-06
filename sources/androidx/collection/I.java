package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

public final class I extends P {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    public final boolean g(Object obj) {
        i(this.f12113b + 1);
        Object[] objArr = this.f12112a;
        int i10 = this.f12113b;
        objArr[i10] = obj;
        this.f12113b = i10 + 1;
        return true;
    }

    public final void h() {
        C6559l.w(this.f12112a, (Object) null, 0, this.f12113b);
        this.f12113b = 0;
    }

    public final void i(int i10) {
        Object[] objArr = this.f12112a;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, (objArr.length * 3) / 2));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f12112a = copyOf;
        }
    }

    public final boolean j(Object obj) {
        int b10 = b(obj);
        if (b10 < 0) {
            return false;
        }
        k(b10);
        return true;
    }

    public final Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f12113b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index ");
            sb2.append(i10);
            sb2.append(" must be in 0..");
            sb2.append(this.f12113b - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        Object[] objArr = this.f12112a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            C6559l.m(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f12113b - 1;
        this.f12113b = i12;
        objArr[i12] = null;
        return obj;
    }

    public I(int i10) {
        super(i10, (DefaultConstructorMarker) null);
    }
}
