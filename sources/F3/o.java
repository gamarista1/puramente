package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import i2.z;
import j2.d;
import java.util.Arrays;
import java.util.Collections;
import z2.O;
import z2.r;

public final class o implements C1997m {

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f20603l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final M f20604a;

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20605b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean[] f20606c = new boolean[4];

    /* renamed from: d  reason: collision with root package name */
    private final a f20607d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    private final w f20608e;

    /* renamed from: f  reason: collision with root package name */
    private b f20609f;

    /* renamed from: g  reason: collision with root package name */
    private long f20610g;

    /* renamed from: h  reason: collision with root package name */
    private String f20611h;

    /* renamed from: i  reason: collision with root package name */
    private O f20612i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20613j;

    /* renamed from: k  reason: collision with root package name */
    private long f20614k = -9223372036854775807L;

    private static final class a {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f20615f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f20616a;

        /* renamed from: b  reason: collision with root package name */
        private int f20617b;

        /* renamed from: c  reason: collision with root package name */
        public int f20618c;

        /* renamed from: d  reason: collision with root package name */
        public int f20619d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f20620e;

        public a(int i10) {
            this.f20620e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f20616a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f20620e;
                int length = bArr2.length;
                int i13 = this.f20618c;
                if (length < i13 + i12) {
                    this.f20620e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f20620e, this.f20618c, i12);
                this.f20618c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f20617b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            } else if (i10 == 179 || i10 == 181) {
                                this.f20618c -= i11;
                                this.f20616a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            p.h("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f20619d = this.f20618c;
                            this.f20617b = 4;
                        }
                    } else if (i10 > 31) {
                        p.h("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f20617b = 3;
                    }
                } else if (i10 != 181) {
                    p.h("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f20617b = 2;
                }
            } else if (i10 == 176) {
                this.f20617b = 1;
                this.f20616a = true;
            }
            byte[] bArr = f20615f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f20616a = false;
            this.f20618c = 0;
            this.f20617b = 0;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final O f20621a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f20622b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f20623c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f20624d;

        /* renamed from: e  reason: collision with root package name */
        private int f20625e;

        /* renamed from: f  reason: collision with root package name */
        private int f20626f;

        /* renamed from: g  reason: collision with root package name */
        private long f20627g;

        /* renamed from: h  reason: collision with root package name */
        private long f20628h;

        public b(O o10) {
            this.f20621a = o10;
        }

        public void a(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.f20623c) {
                int i12 = this.f20626f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    if (((bArr[i13] & 192) >> 6) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f20624d = z10;
                    this.f20623c = false;
                    return;
                }
                this.f20626f = i12 + (i11 - i10);
            }
        }

        public void b(long j10, int i10, boolean z10) {
            boolean z11;
            if (this.f20628h != -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.g(z11);
            if (this.f20625e == 182 && z10 && this.f20622b) {
                boolean z12 = this.f20624d;
                this.f20621a.d(this.f20628h, z12 ? 1 : 0, (int) (j10 - this.f20627g), i10, (O.a) null);
            }
            if (this.f20625e != 179) {
                this.f20627g = j10;
            }
        }

        public void c(int i10, long j10) {
            boolean z10;
            this.f20625e = i10;
            this.f20624d = false;
            boolean z11 = true;
            if (i10 == 182 || i10 == 179) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20622b = z10;
            if (i10 != 182) {
                z11 = false;
            }
            this.f20623c = z11;
            this.f20626f = 0;
            this.f20628h = j10;
        }

        public void d() {
            this.f20622b = false;
            this.f20623c = false;
            this.f20624d = false;
            this.f20625e = -1;
        }
    }

    o(M m10) {
        this.f20604a = m10;
        if (m10 != null) {
            this.f20608e = new w(178, 128);
            this.f20605b = new C2073A();
            return;
        }
        this.f20608e = null;
        this.f20605b = null;
    }

    private static s f(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f20620e, aVar.f20618c);
        z zVar = new z(copyOf);
        zVar.s(i10);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h10 = zVar.h(4);
        float f10 = 1.0f;
        if (h10 == 15) {
            int h11 = zVar.h(8);
            int h12 = zVar.h(8);
            if (h12 == 0) {
                p.h("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = ((float) h11) / ((float) h12);
            }
        } else {
            float[] fArr = f20603l;
            if (h10 < fArr.length) {
                f10 = fArr[h10];
            } else {
                p.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            p.h("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h13 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h13 == 0) {
                p.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = h13 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                zVar.r(i11);
            }
        }
        zVar.q();
        int h14 = zVar.h(13);
        zVar.q();
        int h15 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new s.b().a0(str).o0("video/mp4v-es").t0(h14).Y(h15).k0(f10).b0(Collections.singletonList(copyOf)).K();
    }

    public void a() {
        d.a(this.f20606c);
        this.f20607d.c();
        b bVar = this.f20609f;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f20608e;
        if (wVar != null) {
            wVar.d();
        }
        this.f20610g = 0;
        this.f20614k = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        int i10;
        C2076a.i(this.f20609f);
        C2076a.i(this.f20612i);
        int f10 = a10.f();
        int g10 = a10.g();
        byte[] e10 = a10.e();
        this.f20610g += (long) a10.a();
        this.f20612i.f(a10, a10.a());
        while (true) {
            int c10 = d.c(e10, f10, g10, this.f20606c);
            if (c10 == g10) {
                break;
            }
            int i11 = c10 + 3;
            byte b10 = a10.e()[i11] & 255;
            int i12 = c10 - f10;
            int i13 = 0;
            if (!this.f20613j) {
                if (i12 > 0) {
                    this.f20607d.a(e10, f10, c10);
                }
                if (i12 < 0) {
                    i10 = -i12;
                } else {
                    i10 = 0;
                }
                if (this.f20607d.b(b10, i10)) {
                    O o10 = this.f20612i;
                    a aVar = this.f20607d;
                    o10.c(f(aVar, aVar.f20619d, (String) C2076a.e(this.f20611h)));
                    this.f20613j = true;
                }
            }
            this.f20609f.a(e10, f10, c10);
            w wVar = this.f20608e;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(e10, f10, c10);
                } else {
                    i13 = -i12;
                }
                if (this.f20608e.b(i13)) {
                    w wVar2 = this.f20608e;
                    ((C2073A) L.h(this.f20605b)).S(this.f20608e.f20778d, d.r(wVar2.f20778d, wVar2.f20779e));
                    ((M) L.h(this.f20604a)).a(this.f20614k, this.f20605b);
                }
                if (b10 == 178 && a10.e()[c10 + 2] == 1) {
                    this.f20608e.e(b10);
                }
            }
            int i14 = g10 - c10;
            this.f20609f.b(this.f20610g - ((long) i14), i14, this.f20613j);
            this.f20609f.c(b10, this.f20614k);
            f10 = i11;
        }
        if (!this.f20613j) {
            this.f20607d.a(e10, f10, g10);
        }
        this.f20609f.a(e10, f10, g10);
        w wVar3 = this.f20608e;
        if (wVar3 != null) {
            wVar3.a(e10, f10, g10);
        }
    }

    public void c(boolean z10) {
        C2076a.i(this.f20609f);
        if (z10) {
            this.f20609f.b(this.f20610g, 0, this.f20613j);
            this.f20609f.d();
        }
    }

    public void d(long j10, int i10) {
        this.f20614k = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20611h = dVar.b();
        O d10 = rVar.d(dVar.c(), 2);
        this.f20612i = d10;
        this.f20609f = new b(d10);
        M m10 = this.f20604a;
        if (m10 != null) {
            m10.b(rVar, dVar);
        }
    }
}
