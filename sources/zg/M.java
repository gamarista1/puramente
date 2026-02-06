package Zg;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C6496s;

public class M {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66961b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a  reason: collision with root package name */
    private N[] f66962a;

    private final N[] g() {
        N[] nArr = this.f66962a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f66962a = nArr2;
            return nArr2;
        } else if (c() < nArr.length) {
            return nArr;
        } else {
            Object[] copyOf = Arrays.copyOf(nArr, c() * 2);
            C6496s.g(copyOf, "copyOf(...)");
            N[] nArr3 = (N[]) copyOf;
            this.f66962a = nArr3;
            return nArr3;
        }
    }

    private final void k(int i10) {
        f66961b.set(this, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (((java.lang.Comparable) r3).compareTo(r4) < 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(int r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto L_0x000b
            return
        L_0x000b:
            Zg.N[] r2 = r5.f66962a
            kotlin.jvm.internal.C6496s.e(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L_0x002b
            r3 = r2[r0]
            kotlin.jvm.internal.C6496s.e(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.C6496s.e(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            r1 = r2[r6]
            kotlin.jvm.internal.C6496s.e(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.C6496s.e(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L_0x003f
            return
        L_0x003f:
            r5.n(r6, r0)
            r6 = r0
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.M.l(int):void");
    }

    private final void m(int i10) {
        while (i10 > 0) {
            N[] nArr = this.f66962a;
            C6496s.e(nArr);
            int i11 = (i10 - 1) / 2;
            N n10 = nArr[i11];
            C6496s.e(n10);
            N n11 = nArr[i10];
            C6496s.e(n11);
            if (((Comparable) n10).compareTo(n11) > 0) {
                n(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    private final void n(int i10, int i11) {
        N[] nArr = this.f66962a;
        C6496s.e(nArr);
        N n10 = nArr[i11];
        C6496s.e(n10);
        N n11 = nArr[i10];
        C6496s.e(n11);
        nArr[i10] = n10;
        nArr[i11] = n11;
        n10.setIndex(i10);
        n11.setIndex(i11);
    }

    public final void a(N n10) {
        n10.b(this);
        N[] g10 = g();
        int c10 = c();
        k(c10 + 1);
        g10[c10] = n10;
        n10.setIndex(c10);
        m(c10);
    }

    public final N b() {
        N[] nArr = this.f66962a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f66961b.get(this);
    }

    public final boolean e() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final N f() {
        N b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean h(N n10) {
        boolean z10;
        synchronized (this) {
            if (n10.a() == null) {
                z10 = false;
            } else {
                i(n10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final N i(int i10) {
        N[] nArr = this.f66962a;
        C6496s.e(nArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                N n10 = nArr[i10];
                C6496s.e(n10);
                N n11 = nArr[i11];
                C6496s.e(n11);
                if (((Comparable) n10).compareTo(n11) < 0) {
                    n(i10, i11);
                    m(i11);
                }
            }
            l(i10);
        }
        N n12 = nArr[c()];
        C6496s.e(n12);
        n12.b((M) null);
        n12.setIndex(-1);
        nArr[c()] = null;
        return n12;
    }

    public final N j() {
        N n10;
        synchronized (this) {
            if (c() > 0) {
                n10 = i(0);
            } else {
                n10 = null;
            }
        }
        return n10;
    }
}
