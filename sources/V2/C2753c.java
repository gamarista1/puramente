package v2;

import f2.I;
import f2.s;
import i2.C2076a;
import java.util.Arrays;

/* renamed from: v2.c  reason: case insensitive filesystem */
public abstract class C2753c implements x {

    /* renamed from: a  reason: collision with root package name */
    protected final I f26995a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f26996b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f26997c;

    /* renamed from: d  reason: collision with root package name */
    private final int f26998d;

    /* renamed from: e  reason: collision with root package name */
    private final s[] f26999e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f27000f;

    /* renamed from: g  reason: collision with root package name */
    private int f27001g;

    public C2753c(I i10, int[] iArr, int i11) {
        boolean z10;
        int i12 = 0;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f26998d = i11;
        this.f26995a = (I) C2076a.e(i10);
        int length = iArr.length;
        this.f26996b = length;
        this.f26999e = new s[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f26999e[i13] = i10.a(iArr[i13]);
        }
        Arrays.sort(this.f26999e, new C2752b());
        this.f26997c = new int[this.f26996b];
        while (true) {
            int i14 = this.f26996b;
            if (i12 < i14) {
                this.f26997c[i12] = i10.b(this.f26999e[i12]);
                i12++;
            } else {
                this.f27000f = new long[i14];
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int m(s sVar, s sVar2) {
        return sVar2.f20078i - sVar.f20078i;
    }

    public final s b(int i10) {
        return this.f26999e[i10];
    }

    public final int c(int i10) {
        return this.f26997c[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2753c cVar = (C2753c) obj;
        if (!this.f26995a.equals(cVar.f26995a) || !Arrays.equals(this.f26997c, cVar.f26997c)) {
            return false;
        }
        return true;
    }

    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f26996b; i11++) {
            if (this.f26997c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final I g() {
        return this.f26995a;
    }

    public int hashCode() {
        if (this.f27001g == 0) {
            this.f27001g = (System.identityHashCode(this.f26995a) * 31) + Arrays.hashCode(this.f26997c);
        }
        return this.f27001g;
    }

    public final int i() {
        return this.f26997c[a()];
    }

    public final s j() {
        return this.f26999e[a()];
    }

    public final int length() {
        return this.f26997c.length;
    }

    public void disable() {
    }

    public void enable() {
    }

    public void d(float f10) {
    }
}
