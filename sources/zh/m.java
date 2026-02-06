package zh;

import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final a f74205c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private int f74206a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f74207b = new int[10];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final int a(int i10) {
        return this.f74207b[i10];
    }

    public final int b() {
        if ((this.f74206a & 2) != 0) {
            return this.f74207b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f74206a & 128) != 0) {
            return this.f74207b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f74206a & 16) != 0) {
            return this.f74207b[4];
        }
        return a.e.API_PRIORITY_OTHER;
    }

    public final int e(int i10) {
        if ((this.f74206a & 32) != 0) {
            return this.f74207b[5];
        }
        return i10;
    }

    public final boolean f(int i10) {
        if (((1 << i10) & this.f74206a) != 0) {
            return true;
        }
        return false;
    }

    public final void g(m mVar) {
        C6496s.h(mVar, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.f(i10)) {
                h(i10, mVar.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f74207b;
            if (i10 < iArr.length) {
                this.f74206a = (1 << i10) | this.f74206a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f74206a);
    }
}
