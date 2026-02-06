package R2;

import f2.C1961B;
import i2.C2076a;
import java.util.ArrayDeque;
import z2.C2973q;

final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5681a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f5682b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final g f5683c = new g();

    /* renamed from: d  reason: collision with root package name */
    private b f5684d;

    /* renamed from: e  reason: collision with root package name */
    private int f5685e;

    /* renamed from: f  reason: collision with root package name */
    private int f5686f;

    /* renamed from: g  reason: collision with root package name */
    private long f5687g;

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f5688a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f5689b;

        private b(int i10, long j10) {
            this.f5688a = i10;
            this.f5689b = j10;
        }
    }

    private long c(C2973q qVar) {
        qVar.e();
        while (true) {
            qVar.l(this.f5681a, 0, 4);
            int c10 = g.c(this.f5681a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) g.a(this.f5681a, c10, false);
                if (this.f5684d.e(a10)) {
                    qVar.j(c10);
                    return (long) a10;
                }
            }
            qVar.j(1);
        }
    }

    private double d(C2973q qVar, int i10) {
        long e10 = e(qVar, i10);
        if (i10 == 4) {
            return (double) Float.intBitsToFloat((int) e10);
        }
        return Double.longBitsToDouble(e10);
    }

    private long e(C2973q qVar, int i10) {
        qVar.readFully(this.f5681a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f5681a[i11] & 255));
        }
        return j10;
    }

    private static String f(C2973q qVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        qVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public boolean a(C2973q qVar) {
        C2076a.i(this.f5684d);
        while (true) {
            b bVar = (b) this.f5682b.peek();
            if (bVar == null || qVar.getPosition() < bVar.f5689b) {
                if (this.f5685e == 0) {
                    long d10 = this.f5683c.d(qVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = c(qVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f5686f = (int) d10;
                    this.f5685e = 1;
                }
                if (this.f5685e == 1) {
                    this.f5687g = this.f5683c.d(qVar, false, true, 8);
                    this.f5685e = 2;
                }
                int d11 = this.f5684d.d(this.f5686f);
                if (d11 == 0) {
                    qVar.j((int) this.f5687g);
                    this.f5685e = 0;
                } else if (d11 == 1) {
                    long position = qVar.getPosition();
                    this.f5682b.push(new b(this.f5686f, this.f5687g + position));
                    this.f5684d.g(this.f5686f, position, this.f5687g);
                    this.f5685e = 0;
                    return true;
                } else if (d11 == 2) {
                    long j10 = this.f5687g;
                    if (j10 <= 8) {
                        this.f5684d.c(this.f5686f, e(qVar, (int) j10));
                        this.f5685e = 0;
                        return true;
                    }
                    throw C1961B.a("Invalid integer size: " + this.f5687g, (Throwable) null);
                } else if (d11 == 3) {
                    long j11 = this.f5687g;
                    if (j11 <= 2147483647L) {
                        this.f5684d.f(this.f5686f, f(qVar, (int) j11));
                        this.f5685e = 0;
                        return true;
                    }
                    throw C1961B.a("String element size: " + this.f5687g, (Throwable) null);
                } else if (d11 == 4) {
                    this.f5684d.h(this.f5686f, (int) this.f5687g, qVar);
                    this.f5685e = 0;
                    return true;
                } else if (d11 == 5) {
                    long j12 = this.f5687g;
                    if (j12 == 4 || j12 == 8) {
                        this.f5684d.b(this.f5686f, d(qVar, (int) j12));
                        this.f5685e = 0;
                        return true;
                    }
                    throw C1961B.a("Invalid float size: " + this.f5687g, (Throwable) null);
                } else {
                    throw C1961B.a("Invalid element type " + d11, (Throwable) null);
                }
            } else {
                this.f5684d.a(((b) this.f5682b.pop()).f5688a);
                return true;
            }
        }
    }

    public void b(b bVar) {
        this.f5684d = bVar;
    }

    public void reset() {
        this.f5685e = 0;
        this.f5682b.clear();
        this.f5683c.e();
    }
}
