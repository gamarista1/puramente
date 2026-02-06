package t2;

import f2.H;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import java.util.ArrayList;
import t2.C2615C;
import w2.C2820b;

/* renamed from: t2.e  reason: case insensitive filesystem */
public final class C2639e extends l0 {

    /* renamed from: m  reason: collision with root package name */
    private final long f26214m;

    /* renamed from: n  reason: collision with root package name */
    private final long f26215n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f26216o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f26217p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f26218q;

    /* renamed from: r  reason: collision with root package name */
    private final ArrayList f26219r;

    /* renamed from: s  reason: collision with root package name */
    private final H.c f26220s;

    /* renamed from: t  reason: collision with root package name */
    private a f26221t;

    /* renamed from: u  reason: collision with root package name */
    private b f26222u;

    /* renamed from: v  reason: collision with root package name */
    private long f26223v;

    /* renamed from: w  reason: collision with root package name */
    private long f26224w;

    /* renamed from: t2.e$a */
    private static final class a extends C2656v {

        /* renamed from: f  reason: collision with root package name */
        private final long f26225f;

        /* renamed from: g  reason: collision with root package name */
        private final long f26226g;

        /* renamed from: h  reason: collision with root package name */
        private final long f26227h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f26228i;

        public a(H h10, long j10, long j11) {
            super(h10);
            long j12;
            long j13;
            boolean z10 = false;
            if (h10.i() == 1) {
                H.c n10 = h10.n(0, new H.c());
                long max = Math.max(0, j10);
                if (n10.f19777k || max == 0 || n10.f19774h) {
                    if (j11 == Long.MIN_VALUE) {
                        j12 = n10.f19779m;
                    } else {
                        j12 = Math.max(0, j11);
                    }
                    long j14 = n10.f19779m;
                    if (j14 != -9223372036854775807L) {
                        j12 = j12 > j14 ? j14 : j12;
                        if (max > j12) {
                            throw new b(2);
                        }
                    }
                    this.f26225f = max;
                    this.f26226g = j12;
                    int i10 = (j12 > -9223372036854775807L ? 1 : (j12 == -9223372036854775807L ? 0 : -1));
                    if (i10 == 0) {
                        j13 = -9223372036854775807L;
                    } else {
                        j13 = j12 - max;
                    }
                    this.f26227h = j13;
                    if (n10.f19775i && (i10 == 0 || (j14 != -9223372036854775807L && j12 == j14))) {
                        z10 = true;
                    }
                    this.f26228i = z10;
                    return;
                }
                throw new b(1);
            }
            throw new b(0);
        }

        public H.b g(int i10, H.b bVar, boolean z10) {
            long j10;
            this.f26321e.g(0, bVar, z10);
            long n10 = bVar.n() - this.f26225f;
            long j11 = this.f26227h;
            if (j11 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j11 - n10;
            }
            return bVar.s(bVar.f19744a, bVar.f19745b, 0, j10, n10);
        }

        public H.c o(int i10, H.c cVar, long j10) {
            this.f26321e.o(0, cVar, 0);
            long j11 = cVar.f19782p;
            long j12 = this.f26225f;
            cVar.f19782p = j11 + j12;
            cVar.f19779m = this.f26227h;
            cVar.f19775i = this.f26228i;
            long j13 = cVar.f19778l;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f19778l = max;
                long j14 = this.f26226g;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f19778l = max - this.f26225f;
            }
            long h12 = L.h1(this.f26225f);
            long j15 = cVar.f19771e;
            if (j15 != -9223372036854775807L) {
                cVar.f19771e = j15 + h12;
            }
            long j16 = cVar.f19772f;
            if (j16 != -9223372036854775807L) {
                cVar.f19772f = j16 + h12;
            }
            return cVar;
        }
    }

    /* renamed from: t2.e$b */
    public static final class b extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final int f26229a;

        public b(int i10) {
            super("Illegal clipping: " + a(i10));
            this.f26229a = i10;
        }

        private static String a(int i10) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return "unknown";
            }
            return "start exceeds end";
        }
    }

    public C2639e(C2615C c10, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        super((C2615C) C2076a.e(c10));
        boolean z13;
        if (j10 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C2076a.a(z13);
        this.f26214m = j10;
        this.f26215n = j11;
        this.f26216o = z10;
        this.f26217p = z11;
        this.f26218q = z12;
        this.f26219r = new ArrayList();
        this.f26220s = new H.c();
    }

    private void S(H h10) {
        long j10;
        h10.n(0, this.f26220s);
        long e10 = this.f26220s.e();
        long j11 = Long.MIN_VALUE;
        if (this.f26221t == null || this.f26219r.isEmpty() || this.f26217p) {
            long j12 = this.f26214m;
            long j13 = this.f26215n;
            if (this.f26218q) {
                long c10 = this.f26220s.c();
                j12 += c10;
                j13 += c10;
            }
            this.f26223v = e10 + j12;
            if (this.f26215n != Long.MIN_VALUE) {
                j11 = e10 + j13;
            }
            this.f26224w = j11;
            int size = this.f26219r.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C2638d) this.f26219r.get(i10)).u(this.f26223v, this.f26224w);
            }
            j10 = j12;
            j11 = j13;
        } else {
            long j14 = this.f26223v - e10;
            if (this.f26215n != Long.MIN_VALUE) {
                j11 = this.f26224w - e10;
            }
            j10 = j14;
        }
        try {
            a aVar = new a(h10, j10, j11);
            this.f26221t = aVar;
            z(aVar);
        } catch (b e11) {
            this.f26222u = e11;
            for (int i11 = 0; i11 < this.f26219r.size(); i11++) {
                ((C2638d) this.f26219r.get(i11)).q(this.f26222u);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A() {
        super.A();
        this.f26222u = null;
        this.f26221t = null;
    }

    /* access modifiers changed from: protected */
    public void O(H h10) {
        if (this.f26222u == null) {
            S(h10);
        }
    }

    public void c() {
        b bVar = this.f26222u;
        if (bVar == null) {
            super.c();
            return;
        }
        throw bVar;
    }

    public void j(C2614B b10) {
        C2076a.g(this.f26219r.remove(b10));
        this.f26281k.j(((C2638d) b10).f26183a);
        if (this.f26219r.isEmpty() && !this.f26217p) {
            S(((a) C2076a.e(this.f26221t)).f26321e);
        }
    }

    public C2614B o(C2615C.b bVar, C2820b bVar2, long j10) {
        C2638d dVar = new C2638d(this.f26281k.o(bVar, bVar2, j10), this.f26216o, this.f26223v, this.f26224w);
        this.f26219r.add(dVar);
        return dVar;
    }
}
