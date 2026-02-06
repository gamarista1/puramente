package ia;

import ia.C3604b;
import ja.C3645a;
import ja.M;
import java.util.Arrays;

public final class o implements C3604b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f44477a;

    /* renamed from: b  reason: collision with root package name */
    private final int f44478b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f44479c;

    /* renamed from: d  reason: collision with root package name */
    private int f44480d;

    /* renamed from: e  reason: collision with root package name */
    private int f44481e;

    /* renamed from: f  reason: collision with root package name */
    private int f44482f;

    /* renamed from: g  reason: collision with root package name */
    private C3603a[] f44483g;

    public o(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized C3603a a() {
        C3603a aVar;
        try {
            this.f44481e++;
            int i10 = this.f44482f;
            if (i10 > 0) {
                C3603a[] aVarArr = this.f44483g;
                int i11 = i10 - 1;
                this.f44482f = i11;
                aVar = (C3603a) C3645a.e(aVarArr[i11]);
                this.f44483g[this.f44482f] = null;
            } else {
                aVar = new C3603a(new byte[this.f44478b], 0);
                int i12 = this.f44481e;
                C3603a[] aVarArr2 = this.f44483g;
                if (i12 > aVarArr2.length) {
                    this.f44483g = (C3603a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
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
            int max = Math.max(0, M.l(this.f44480d, this.f44478b) - this.f44481e);
            int i11 = this.f44482f;
            if (max < i11) {
                if (this.f44479c != null) {
                    int i12 = i11 - 1;
                    while (i10 <= i12) {
                        C3603a aVar = (C3603a) C3645a.e(this.f44483g[i10]);
                        if (aVar.f44420a == this.f44479c) {
                            i10++;
                        } else {
                            C3603a aVar2 = (C3603a) C3645a.e(this.f44483g[i12]);
                            if (aVar2.f44420a != this.f44479c) {
                                i12--;
                            } else {
                                C3603a[] aVarArr = this.f44483g;
                                aVarArr[i10] = aVar2;
                                aVarArr[i12] = aVar;
                                i12--;
                                i10++;
                            }
                        }
                    }
                    max = Math.max(max, i10);
                    if (max >= this.f44482f) {
                        return;
                    }
                }
                Arrays.fill(this.f44483g, max, this.f44482f, (Object) null);
                this.f44482f = max;
            }
        } finally {
            while (true) {
            }
        }
    }

    public int c() {
        return this.f44478b;
    }

    public synchronized void d(C3603a aVar) {
        C3603a[] aVarArr = this.f44483g;
        int i10 = this.f44482f;
        this.f44482f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f44481e--;
        notifyAll();
    }

    public synchronized void e(C3604b.a aVar) {
        while (aVar != null) {
            try {
                C3603a[] aVarArr = this.f44483g;
                int i10 = this.f44482f;
                this.f44482f = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f44481e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        notifyAll();
    }

    public synchronized int f() {
        return this.f44481e * this.f44478b;
    }

    public synchronized void g() {
        if (this.f44477a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10;
        if (i10 < this.f44480d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44480d = i10;
        if (z10) {
            b();
        }
    }

    public o(boolean z10, int i10, int i11) {
        boolean z11 = true;
        C3645a.a(i10 > 0);
        C3645a.a(i11 < 0 ? false : z11);
        this.f44477a = z10;
        this.f44478b = i10;
        this.f44482f = i11;
        this.f44483g = new C3603a[(i11 + 100)];
        if (i11 > 0) {
            this.f44479c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f44483g[i12] = new C3603a(this.f44479c, i12 * i10);
            }
            return;
        }
        this.f44479c = null;
    }
}
