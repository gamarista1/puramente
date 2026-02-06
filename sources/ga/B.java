package ga;

import ja.M;
import k9.c1;
import k9.s1;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final int f43758a;

    /* renamed from: b  reason: collision with root package name */
    public final c1[] f43759b;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f43760c;

    /* renamed from: d  reason: collision with root package name */
    public final s1 f43761d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f43762e;

    public B(c1[] c1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        this.f43759b = c1VarArr;
        this.f43760c = (r[]) rVarArr.clone();
        this.f43761d = s1Var;
        this.f43762e = obj;
        this.f43758a = c1VarArr.length;
    }

    public boolean a(B b10) {
        if (b10 == null || b10.f43760c.length != this.f43760c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f43760c.length; i10++) {
            if (!b(b10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(B b10, int i10) {
        if (b10 != null && M.c(this.f43759b[i10], b10.f43759b[i10]) && M.c(this.f43760c[i10], b10.f43760c[i10])) {
            return true;
        }
        return false;
    }

    public boolean c(int i10) {
        if (this.f43759b[i10] != null) {
            return true;
        }
        return false;
    }
}
