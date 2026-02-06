package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import ja.x;
import java.util.Arrays;
import java.util.Collections;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class o implements m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f29621l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final K f29622a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29623b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f29624c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f29625d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final u f29626e;

    /* renamed from: f  reason: collision with root package name */
    private b f29627f;

    /* renamed from: g  reason: collision with root package name */
    private long f29628g;

    /* renamed from: h  reason: collision with root package name */
    private String f29629h;

    /* renamed from: i  reason: collision with root package name */
    private C3962B f29630i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29631j;

    /* renamed from: k  reason: collision with root package name */
    private long f29632k = -9223372036854775807L;

    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f29633f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f29634a;

        /* renamed from: b  reason: collision with root package name */
        private int f29635b;

        /* renamed from: c  reason: collision with root package name */
        public int f29636c;

        /* renamed from: d  reason: collision with root package name */
        public int f29637d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f29638e;

        public a(int i10) {
            this.f29638e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f29634a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f29638e;
                int length = bArr2.length;
                int i13 = this.f29636c;
                if (length < i13 + i12) {
                    this.f29638e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f29638e, this.f29636c, i12);
                this.f29636c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f29635b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f29636c -= i11;
                                this.f29634a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            s.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f29637d = this.f29636c;
                            this.f29635b = 4;
                        }
                    } else if (i10 > 31) {
                        s.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f29635b = 3;
                    }
                } else if (i10 != 181) {
                    s.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f29635b = 2;
                }
            } else if (i10 == 176) {
                this.f29635b = 1;
                this.f29634a = true;
            }
            byte[] bArr = f29633f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f29634a = false;
            this.f29636c = 0;
            this.f29635b = 0;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C3962B f29639a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f29640b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f29641c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29642d;

        /* renamed from: e  reason: collision with root package name */
        private int f29643e;

        /* renamed from: f  reason: collision with root package name */
        private int f29644f;

        /* renamed from: g  reason: collision with root package name */
        private long f29645g;

        /* renamed from: h  reason: collision with root package name */
        private long f29646h;

        public b(C3962B b10) {
            this.f29639a = b10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.f29641c) {
                int i12 = this.f29644f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    if (((bArr[i13] & 192) >> 6) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f29642d = z10;
                    this.f29641c = false;
                    return;
                }
                this.f29644f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f29643e == 182 && z10 && this.f29640b) {
                long j11 = this.f29646h;
                if (j11 != -9223372036854775807L) {
                    int i11 = (int) (j10 - this.f29645g);
                    this.f29639a.f(j11, this.f29642d ? 1 : 0, i11, i10, (C3962B.a) null);
                }
            }
            if (this.f29643e != 179) {
                this.f29645g = j10;
            }
        }

        public void c(int i10, long j10) {
            boolean z10;
            this.f29643e = i10;
            this.f29642d = false;
            boolean z11 = true;
            if (i10 == 182 || i10 == 179) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29640b = z10;
            if (i10 != 182) {
                z11 = false;
            }
            this.f29641c = z11;
            this.f29644f = 0;
            this.f29646h = j10;
        }

        public void d() {
            this.f29640b = false;
            this.f29641c = false;
            this.f29642d = false;
            this.f29643e = -1;
        }
    }

    o(K k10) {
        this.f29622a = k10;
        if (k10 != null) {
            this.f29626e = new u(178, 128);
            this.f29623b = new B();
            return;
        }
        this.f29626e = null;
        this.f29623b = null;
    }

    private static C3717q0 b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f29638e, aVar.f29636c);
        A a10 = new A(copyOf);
        a10.s(i10);
        a10.s(4);
        a10.q();
        a10.r(8);
        if (a10.g()) {
            a10.r(4);
            a10.r(3);
        }
        int h10 = a10.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = a10.h(8);
            int h12 = a10.h(8);
            if (h12 == 0) {
                s.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) h11) / ((float) h12);
            }
        } else {
            float[] fArr = f29621l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                s.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (a10.g()) {
            a10.r(2);
            a10.r(1);
            if (a10.g()) {
                a10.r(15);
                a10.q();
                a10.r(15);
                a10.q();
                a10.r(15);
                a10.q();
                a10.r(3);
                a10.r(11);
                a10.q();
                a10.r(15);
                a10.q();
            }
        }
        if (a10.h(2) != 0) {
            s.i("H263Reader", "Unhandled video object layer shape");
        }
        a10.q();
        int h13 = a10.h(16);
        a10.q();
        if (a10.g()) {
            if (h13 == 0) {
                s.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                a10.r(i11);
            }
        }
        a10.q();
        int h14 = a10.h(13);
        a10.q();
        int h15 = a10.h(13);
        a10.q();
        a10.q();
        return new C3717q0.b().S(str).e0("video/mp4v-es").j0(h14).Q(h15).a0(f10).T(Collections.singletonList(copyOf)).E();
    }

    public void a() {
        x.a(this.f29624c);
        this.f29625d.c();
        b bVar = this.f29627f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f29626e;
        if (uVar != null) {
            uVar.d();
        }
        this.f29628g = 0;
        this.f29632k = -9223372036854775807L;
    }

    public void c(B b10) {
        int i10;
        C3645a.h(this.f29627f);
        C3645a.h(this.f29630i);
        int e10 = b10.e();
        int f10 = b10.f();
        byte[] d10 = b10.d();
        this.f29628g += (long) b10.a();
        this.f29630i.d(b10, b10.a());
        while (true) {
            int c10 = x.c(d10, e10, f10, this.f29624c);
            if (c10 == f10) {
                break;
            }
            int i11 = c10 + 3;
            byte b11 = b10.d()[i11] & 255;
            int i12 = c10 - e10;
            int i13 = 0;
            if (!this.f29631j) {
                if (i12 > 0) {
                    this.f29625d.a(d10, e10, c10);
                }
                if (i12 < 0) {
                    i10 = -i12;
                } else {
                    i10 = 0;
                }
                if (this.f29625d.b(b11, i10)) {
                    C3962B b12 = this.f29630i;
                    a aVar = this.f29625d;
                    b12.c(b(aVar, aVar.f29637d, (String) C3645a.e(this.f29629h)));
                    this.f29631j = true;
                }
            }
            this.f29627f.a(d10, e10, c10);
            u uVar = this.f29626e;
            if (uVar != null) {
                if (i12 > 0) {
                    uVar.a(d10, e10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f29626e.b(i13)) {
                    u uVar2 = this.f29626e;
                    ((B) M.j(this.f29623b)).N(this.f29626e.f29765d, x.q(uVar2.f29765d, uVar2.f29766e));
                    ((K) M.j(this.f29622a)).a(this.f29632k, this.f29623b);
                }
                if (b11 == 178 && b10.d()[c10 + 2] == 1) {
                    this.f29626e.e(b11);
                }
            }
            int i14 = f10 - c10;
            this.f29627f.b(this.f29628g - ((long) i14), i14, this.f29631j);
            this.f29627f.c(b11, this.f29632k);
            e10 = i11;
        }
        if (!this.f29631j) {
            this.f29625d.a(d10, e10, f10);
        }
        this.f29627f.a(d10, e10, f10);
        u uVar3 = this.f29626e;
        if (uVar3 != null) {
            uVar3.a(d10, e10, f10);
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29632k = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29629h = dVar.b();
        C3962B d10 = mVar.d(dVar.c(), 2);
        this.f29630i = d10;
        this.f29627f = new b(d10);
        K k10 = this.f29622a;
        if (k10 != null) {
            k10.b(mVar, dVar);
        }
    }

    public void e() {
    }
}
