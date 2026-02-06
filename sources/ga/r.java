package ga;

import N9.C3070t;
import N9.T;
import P9.f;
import P9.o;
import ia.C3607e;
import ja.s;
import java.util.List;
import k9.C3717q0;
import k9.n1;

public interface r extends u {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final T f43902a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f43903b;

        /* renamed from: c  reason: collision with root package name */
        public final int f43904c;

        public a(T t10, int... iArr) {
            this(t10, iArr, 0);
        }

        public a(T t10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                s.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f43902a = t10;
            this.f43903b = iArr;
            this.f43904c = i10;
        }
    }

    public interface b {
        r[] a(a[] aVarArr, C3607e eVar, C3070t.b bVar, n1 n1Var);
    }

    int a();

    void d(float f10);

    void disable();

    void enable();

    int i();

    C3717q0 j();

    void m(long j10, long j11, long j12, List list, o[] oVarArr);

    boolean n(long j10, f fVar, List list) {
        return false;
    }

    boolean o(int i10, long j10);

    boolean p(int i10, long j10);

    Object q();

    int r(long j10, List list);

    int s();

    void e() {
    }

    void k() {
    }

    void h(boolean z10) {
    }
}
