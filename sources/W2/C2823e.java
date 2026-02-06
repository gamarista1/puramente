package w2;

import i2.C2076a;
import i2.L;
import java.util.Arrays;
import w2.C2820b;

/* renamed from: w2.e  reason: case insensitive filesystem */
public final class C2823e implements C2820b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f27717a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27718b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f27719c;

    /* renamed from: d  reason: collision with root package name */
    private int f27720d;

    /* renamed from: e  reason: collision with root package name */
    private int f27721e;

    /* renamed from: f  reason: collision with root package name */
    private int f27722f;

    /* renamed from: g  reason: collision with root package name */
    private C2819a[] f27723g;

    public C2823e(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized C2819a a() {
        C2819a aVar;
        try {
            this.f27721e++;
            int i10 = this.f27722f;
            if (i10 > 0) {
                C2819a[] aVarArr = this.f27723g;
                int i11 = i10 - 1;
                this.f27722f = i11;
                aVar = (C2819a) C2076a.e(aVarArr[i11]);
                this.f27723g[this.f27722f] = null;
            } else {
                aVar = new C2819a(new byte[this.f27718b], 0);
                int i12 = this.f27721e;
                C2819a[] aVarArr2 = this.f27723g;
                if (i12 > aVarArr2.length) {
                    this.f27723g = (C2819a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return aVar;
    }

    public synchronized void b() {
        try {
            int i10 = 0;
            int max = Math.max(0, L.j(this.f27720d, this.f27718b) - this.f27721e);
            int i11 = this.f27722f;
            if (max < i11) {
                if (this.f27719c != null) {
                    int i12 = i11 - 1;
                    while (i10 <= i12) {
                        C2819a aVar = (C2819a) C2076a.e(this.f27723g[i10]);
                        if (aVar.f27707a == this.f27719c) {
                            i10++;
                        } else {
                            C2819a aVar2 = (C2819a) C2076a.e(this.f27723g[i12]);
                            if (aVar2.f27707a != this.f27719c) {
                                i12--;
                            } else {
                                C2819a[] aVarArr = this.f27723g;
                                aVarArr[i10] = aVar2;
                                aVarArr[i12] = aVar;
                                i12--;
                                i10++;
                            }
                        }
                    }
                    max = Math.max(max, i10);
                    if (max >= this.f27722f) {
                        return;
                    }
                }
                Arrays.fill(this.f27723g, max, this.f27722f, (Object) null);
                this.f27722f = max;
            }
        } finally {
            while (true) {
            }
        }
    }

    public int c() {
        return this.f27718b;
    }

    public synchronized void d(C2820b.a aVar) {
        while (aVar != null) {
            try {
                C2819a[] aVarArr = this.f27723g;
                int i10 = this.f27722f;
                this.f27722f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f27721e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        notifyAll();
    }

    public synchronized void e(C2819a aVar) {
        C2819a[] aVarArr = this.f27723g;
        int i10 = this.f27722f;
        this.f27722f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f27721e--;
        notifyAll();
    }

    public synchronized int f() {
        return this.f27721e * this.f27718b;
    }

    public synchronized void g() {
        if (this.f27717a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10;
        if (i10 < this.f27720d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27720d = i10;
        if (z10) {
            b();
        }
    }

    public C2823e(boolean z10, int i10, int i11) {
        boolean z11 = true;
        C2076a.a(i10 > 0);
        C2076a.a(i11 < 0 ? false : z11);
        this.f27717a = z10;
        this.f27718b = i10;
        this.f27722f = i11;
        this.f27723g = new C2819a[(i11 + 100)];
        if (i11 > 0) {
            this.f27719c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f27723g[i12] = new C2819a(this.f27719c, i12 * i10);
            }
            return;
        }
        this.f27719c = null;
    }
}
