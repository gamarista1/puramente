package mh;

import ih.f;
import ih.k;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f72120a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    private int[] f72121b;

    /* renamed from: c  reason: collision with root package name */
    private int f72122c;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72123a = new a();

        private a() {
        }
    }

    public H() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f72121b = iArr;
        this.f72122c = -1;
    }

    private final void e() {
        int i10 = this.f72122c * 2;
        Object[] copyOf = Arrays.copyOf(this.f72120a, i10);
        C6496s.g(copyOf, "copyOf(...)");
        this.f72120a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f72121b, i10);
        C6496s.g(copyOf2, "copyOf(...)");
        this.f72121b = copyOf2;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f72122c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f72120a[i11];
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!C6496s.c(fVar.h(), k.b.f68507a)) {
                    int i12 = this.f72121b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(fVar.e(i12));
                    }
                } else if (this.f72121b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f72121b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f72123a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final void b() {
        int i10 = this.f72122c;
        int[] iArr = this.f72121b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f72122c = i10 - 1;
        }
        int i11 = this.f72122c;
        if (i11 != -1) {
            this.f72122c = i11 - 1;
        }
    }

    public final void c(f fVar) {
        C6496s.h(fVar, "sd");
        int i10 = this.f72122c + 1;
        this.f72122c = i10;
        if (i10 == this.f72120a.length) {
            e();
        }
        this.f72120a[i10] = fVar;
    }

    public final void d() {
        int[] iArr = this.f72121b;
        int i10 = this.f72122c;
        if (iArr[i10] == -2) {
            this.f72120a[i10] = a.f72123a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f72121b;
        int i10 = this.f72122c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f72122c = i11;
            if (i11 == this.f72120a.length) {
                e();
            }
        }
        Object[] objArr = this.f72120a;
        int i12 = this.f72122c;
        objArr[i12] = obj;
        this.f72121b[i12] = -2;
    }

    public final void g(int i10) {
        this.f72121b[this.f72122c] = i10;
    }

    public String toString() {
        return a();
    }
}
