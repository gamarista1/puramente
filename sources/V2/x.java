package v2;

import f2.H;
import f2.I;
import f2.s;
import i2.p;
import t2.C2615C;
import w2.C2822d;

public interface x extends C2750A {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final I f27132a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f27133b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27134c;

        public a(I i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public a(I i10, int[] iArr, int i11) {
            if (iArr.length == 0) {
                p.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f27132a = i10;
            this.f27133b = iArr;
            this.f27134c = i11;
        }
    }

    public interface b {
        x[] a(a[] aVarArr, C2822d dVar, C2615C.b bVar, H h10);
    }

    int a();

    void d(float f10);

    void disable();

    void enable();

    int i();

    s j();

    void e() {
    }

    void k() {
    }

    void h(boolean z10) {
    }
}
