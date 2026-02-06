package w9;

import ja.C3645a;
import java.util.ArrayDeque;
import k9.L0;
import q9.l;

/* renamed from: w9.a  reason: case insensitive filesystem */
final class C4148a implements C4150c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f49229a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f49230b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final C4154g f49231c = new C4154g();

    /* renamed from: d  reason: collision with root package name */
    private C4149b f49232d;

    /* renamed from: e  reason: collision with root package name */
    private int f49233e;

    /* renamed from: f  reason: collision with root package name */
    private int f49234f;

    /* renamed from: g  reason: collision with root package name */
    private long f49235g;

    /* renamed from: w9.a$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f49236a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f49237b;

        private b(int i10, long j10) {
            this.f49236a = i10;
            this.f49237b = j10;
        }
    }

    private long c(l lVar) {
        lVar.e();
        while (true) {
            lVar.l(this.f49229a, 0, 4);
            int c10 = C4154g.c(this.f49229a[0]);
            if (c10 != -1 && c10 <= 4) {
                int a10 = (int) C4154g.a(this.f49229a, c10, false);
                if (this.f49232d.e(a10)) {
                    lVar.j(c10);
                    return (long) a10;
                }
            }
            lVar.j(1);
        }
    }

    private double d(l lVar, int i10) {
        long e10 = e(lVar, i10);
        if (i10 == 4) {
            return (double) Float.intBitsToFloat((int) e10);
        }
        return Double.longBitsToDouble(e10);
    }

    private long e(l lVar, int i10) {
        lVar.readFully(this.f49229a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f49229a[i11] & 255));
        }
        return j10;
    }

    private static String f(l lVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        lVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public boolean a(l lVar) {
        C3645a.h(this.f49232d);
        while (true) {
            b bVar = (b) this.f49230b.peek();
            if (bVar == null || lVar.getPosition() < bVar.f49237b) {
                if (this.f49233e == 0) {
                    long d10 = this.f49231c.d(lVar, true, false, 4);
                    if (d10 == -2) {
                        d10 = c(lVar);
                    }
                    if (d10 == -1) {
                        return false;
                    }
                    this.f49234f = (int) d10;
                    this.f49233e = 1;
                }
                if (this.f49233e == 1) {
                    this.f49235g = this.f49231c.d(lVar, false, true, 8);
                    this.f49233e = 2;
                }
                int d11 = this.f49232d.d(this.f49234f);
                if (d11 == 0) {
                    lVar.j((int) this.f49235g);
                    this.f49233e = 0;
                } else if (d11 == 1) {
                    long position = lVar.getPosition();
                    this.f49230b.push(new b(this.f49234f, this.f49235g + position));
                    this.f49232d.g(this.f49234f, position, this.f49235g);
                    this.f49233e = 0;
                    return true;
                } else if (d11 == 2) {
                    long j10 = this.f49235g;
                    if (j10 <= 8) {
                        this.f49232d.c(this.f49234f, e(lVar, (int) j10));
                        this.f49233e = 0;
                        return true;
                    }
                    throw L0.a("Invalid integer size: " + this.f49235g, (Throwable) null);
                } else if (d11 == 3) {
                    long j11 = this.f49235g;
                    if (j11 <= 2147483647L) {
                        this.f49232d.f(this.f49234f, f(lVar, (int) j11));
                        this.f49233e = 0;
                        return true;
                    }
                    throw L0.a("String element size: " + this.f49235g, (Throwable) null);
                } else if (d11 == 4) {
                    this.f49232d.h(this.f49234f, (int) this.f49235g, lVar);
                    this.f49233e = 0;
                    return true;
                } else if (d11 == 5) {
                    long j12 = this.f49235g;
                    if (j12 == 4 || j12 == 8) {
                        this.f49232d.b(this.f49234f, d(lVar, (int) j12));
                        this.f49233e = 0;
                        return true;
                    }
                    throw L0.a("Invalid float size: " + this.f49235g, (Throwable) null);
                } else {
                    throw L0.a("Invalid element type " + d11, (Throwable) null);
                }
            } else {
                this.f49232d.a(((b) this.f49230b.pop()).f49236a);
                return true;
            }
        }
    }

    public void b(C4149b bVar) {
        this.f49232d = bVar;
    }

    public void reset() {
        this.f49233e = 0;
        this.f49230b.clear();
        this.f49231c.e();
    }
}
