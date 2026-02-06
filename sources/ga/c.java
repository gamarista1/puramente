package ga;

import N9.T;
import android.os.SystemClock;
import ja.C3645a;
import ja.M;
import java.util.Arrays;
import java.util.List;
import k9.C3717q0;

public abstract class c implements r {

    /* renamed from: a  reason: collision with root package name */
    protected final T f43788a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f43789b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f43790c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43791d;

    /* renamed from: e  reason: collision with root package name */
    private final C3717q0[] f43792e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f43793f;

    /* renamed from: g  reason: collision with root package name */
    private int f43794g;

    public c(T t10, int... iArr) {
        this(t10, iArr, 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int u(C3717q0 q0Var, C3717q0 q0Var2) {
        return q0Var2.f45766h - q0Var.f45766h;
    }

    public final C3717q0 b(int i10) {
        return this.f43792e[i10];
    }

    public final int c(int i10) {
        return this.f43790c[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f43788a != cVar.f43788a || !Arrays.equals(this.f43790c, cVar.f43790c)) {
            return false;
        }
        return true;
    }

    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f43789b; i11++) {
            if (this.f43790c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final T g() {
        return this.f43788a;
    }

    public int hashCode() {
        if (this.f43794g == 0) {
            this.f43794g = (System.identityHashCode(this.f43788a) * 31) + Arrays.hashCode(this.f43790c);
        }
        return this.f43794g;
    }

    public final int i() {
        return this.f43790c[a()];
    }

    public final C3717q0 j() {
        return this.f43792e[a()];
    }

    public final int l(C3717q0 q0Var) {
        for (int i10 = 0; i10 < this.f43789b; i10++) {
            if (this.f43792e[i10] == q0Var) {
                return i10;
            }
        }
        return -1;
    }

    public final int length() {
        return this.f43790c.length;
    }

    public boolean o(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean p10 = p(i10, elapsedRealtime);
        for (int i11 = 0; i11 < this.f43789b && !p10; i11++) {
            if (i11 == i10 || p(i11, elapsedRealtime)) {
                p10 = false;
            } else {
                p10 = true;
            }
        }
        if (!p10) {
            return false;
        }
        long[] jArr = this.f43793f;
        jArr[i10] = Math.max(jArr[i10], M.b(elapsedRealtime, j10, Long.MAX_VALUE));
        return true;
    }

    public boolean p(int i10, long j10) {
        if (this.f43793f[i10] > j10) {
            return true;
        }
        return false;
    }

    public int r(long j10, List list) {
        return list.size();
    }

    public c(T t10, int[] iArr, int i10) {
        int i11 = 0;
        C3645a.f(iArr.length > 0);
        this.f43791d = i10;
        this.f43788a = (T) C3645a.e(t10);
        int length = iArr.length;
        this.f43789b = length;
        this.f43792e = new C3717q0[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f43792e[i12] = t10.b(iArr[i12]);
        }
        Arrays.sort(this.f43792e, new C3565b());
        this.f43790c = new int[this.f43789b];
        while (true) {
            int i13 = this.f43789b;
            if (i11 < i13) {
                this.f43790c[i11] = t10.c(this.f43792e[i11]);
                i11++;
            } else {
                this.f43793f = new long[i13];
                return;
            }
        }
    }

    public void disable() {
    }

    public void enable() {
    }

    public void d(float f10) {
    }
}
