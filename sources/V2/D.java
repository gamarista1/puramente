package v2;

import f2.L;
import i2.C2076a;
import m2.z;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final int f26965a;

    /* renamed from: b  reason: collision with root package name */
    public final z[] f26966b;

    /* renamed from: c  reason: collision with root package name */
    public final x[] f26967c;

    /* renamed from: d  reason: collision with root package name */
    public final L f26968d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f26969e;

    public D(z[] zVarArr, x[] xVarArr, L l10, Object obj) {
        boolean z10;
        if (zVarArr.length == xVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f26966b = zVarArr;
        this.f26967c = (x[]) xVarArr.clone();
        this.f26968d = l10;
        this.f26969e = obj;
        this.f26965a = zVarArr.length;
    }

    public boolean a(D d10) {
        if (d10 == null || d10.f26967c.length != this.f26967c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f26967c.length; i10++) {
            if (!b(d10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(D d10, int i10) {
        if (d10 != null && i2.L.c(this.f26966b[i10], d10.f26966b[i10]) && i2.L.c(this.f26967c[i10], d10.f26967c[i10])) {
            return true;
        }
        return false;
    }

    public boolean c(int i10) {
        if (this.f26966b[i10] != null) {
            return true;
        }
        return false;
    }
}
