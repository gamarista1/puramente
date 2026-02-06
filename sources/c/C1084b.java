package C;

import Y.C1510r0;
import Y.o1;
import androidx.core.view.D0;
import c1.d;
import c1.t;
import p1.C2388d;

/* renamed from: C.b  reason: case insensitive filesystem */
public final class C1084b implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f876b;

    /* renamed from: c  reason: collision with root package name */
    private final String f877c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f878d = u1.d(C2388d.f25149e, (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f879e = u1.d(Boolean.TRUE, (o1) null, 2, (Object) null);

    public C1084b(int i10, String str) {
        this.f876b = i10;
        this.f877c = str;
    }

    private final void g(boolean z10) {
        this.f879e.setValue(Boolean.valueOf(z10));
    }

    public int a(d dVar) {
        return e().f25153d;
    }

    public int b(d dVar, t tVar) {
        return e().f25152c;
    }

    public int c(d dVar) {
        return e().f25151b;
    }

    public int d(d dVar, t tVar) {
        return e().f25150a;
    }

    public final C2388d e() {
        return (C2388d) this.f878d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1084b)) {
            return false;
        }
        if (this.f876b == ((C1084b) obj).f876b) {
            return true;
        }
        return false;
    }

    public final void f(C2388d dVar) {
        this.f878d.setValue(dVar);
    }

    public final void h(D0 d02, int i10) {
        if (i10 == 0 || (i10 & this.f876b) != 0) {
            f(d02.f(this.f876b));
            g(d02.q(this.f876b));
        }
    }

    public int hashCode() {
        return this.f876b;
    }

    public String toString() {
        return this.f877c + '(' + e().f25150a + ", " + e().f25151b + ", " + e().f25152c + ", " + e().f25153d + ')';
    }
}
