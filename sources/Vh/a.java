package Vh;

import bi.e;
import com.amazon.c.a.a.c;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a extends b {

    /* renamed from: Z  reason: collision with root package name */
    public static Map f65432Z = new HashMap();

    /* renamed from: a0  reason: collision with root package name */
    public static Map f65433a0 = new HashMap();

    /* renamed from: A  reason: collision with root package name */
    public int f65434A;

    /* renamed from: B  reason: collision with root package name */
    public int f65435B;

    /* renamed from: C  reason: collision with root package name */
    public int f65436C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f65437D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f65438E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f65439F;

    /* renamed from: G  reason: collision with root package name */
    public int f65440G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f65441H;

    /* renamed from: I  reason: collision with root package name */
    public int f65442I;

    /* renamed from: J  reason: collision with root package name */
    public int f65443J;

    /* renamed from: K  reason: collision with root package name */
    public int f65444K;

    /* renamed from: L  reason: collision with root package name */
    public int f65445L;

    /* renamed from: M  reason: collision with root package name */
    public int f65446M;

    /* renamed from: N  reason: collision with root package name */
    public int f65447N;

    /* renamed from: O  reason: collision with root package name */
    public int f65448O;

    /* renamed from: P  reason: collision with root package name */
    public int f65449P;

    /* renamed from: Q  reason: collision with root package name */
    public int f65450Q;

    /* renamed from: R  reason: collision with root package name */
    public int f65451R;

    /* renamed from: S  reason: collision with root package name */
    public int f65452S;

    /* renamed from: T  reason: collision with root package name */
    public int f65453T;

    /* renamed from: U  reason: collision with root package name */
    public int f65454U;

    /* renamed from: V  reason: collision with root package name */
    public int f65455V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f65456W;

    /* renamed from: X  reason: collision with root package name */
    byte[] f65457X;

    /* renamed from: Y  reason: collision with root package name */
    boolean f65458Y = false;

    /* renamed from: d  reason: collision with root package name */
    public C0960a f65459d;

    /* renamed from: e  reason: collision with root package name */
    public int f65460e;

    /* renamed from: f  reason: collision with root package name */
    public int f65461f;

    /* renamed from: g  reason: collision with root package name */
    public int f65462g;

    /* renamed from: h  reason: collision with root package name */
    public int f65463h;

    /* renamed from: i  reason: collision with root package name */
    public int f65464i;

    /* renamed from: j  reason: collision with root package name */
    public int f65465j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f65466k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f65467l;

    /* renamed from: m  reason: collision with root package name */
    public int f65468m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f65469n;

    /* renamed from: o  reason: collision with root package name */
    public int f65470o;

    /* renamed from: p  reason: collision with root package name */
    public int f65471p;

    /* renamed from: q  reason: collision with root package name */
    public int f65472q;

    /* renamed from: r  reason: collision with root package name */
    public int f65473r;

    /* renamed from: s  reason: collision with root package name */
    public int f65474s;

    /* renamed from: t  reason: collision with root package name */
    public int f65475t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f65476u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f65477v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f65478w;

    /* renamed from: x  reason: collision with root package name */
    public int f65479x;

    /* renamed from: y  reason: collision with root package name */
    public int f65480y;

    /* renamed from: z  reason: collision with root package name */
    public int f65481z;

    /* renamed from: Vh.a$a  reason: collision with other inner class name */
    public class C0960a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f65482a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f65483b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f65484c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f65485d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f65486e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f65487f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f65488g;

        public C0960a(int i10, c cVar) {
            int i11;
            this.f65482a = cVar.b();
            this.f65483b = cVar.b();
            this.f65484c = cVar.b();
            this.f65485d = cVar.b();
            boolean b10 = cVar.b();
            this.f65486e = b10;
            if (b10) {
                this.f65487f = cVar.b();
                this.f65488g = cVar.b();
                a(i10, cVar);
            }
            while (cVar.a(4) != 0) {
                int a10 = cVar.a(4);
                if (a10 == 15) {
                    i11 = cVar.a(8);
                    a10 += i11;
                } else {
                    i11 = 0;
                }
                if (i11 == 255) {
                    a10 += cVar.a(16);
                }
                for (int i12 = 0; i12 < a10; i12++) {
                    cVar.a(8);
                }
            }
        }

        public void a(int i10, c cVar) {
            int i11;
            switch (i10) {
                case 1:
                case 2:
                    i11 = 1;
                    break;
                case 3:
                    i11 = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                default:
                    i11 = 0;
                    break;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                new b(cVar);
            }
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f65490a;

        /* renamed from: b  reason: collision with root package name */
        public int f65491b;

        /* renamed from: c  reason: collision with root package name */
        public int f65492c;

        /* renamed from: d  reason: collision with root package name */
        public int f65493d;

        /* renamed from: e  reason: collision with root package name */
        public int f65494e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f65495f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f65496g;

        /* renamed from: h  reason: collision with root package name */
        public int f65497h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f65498i;

        /* renamed from: j  reason: collision with root package name */
        public int f65499j;

        /* renamed from: k  reason: collision with root package name */
        public int f65500k;

        /* renamed from: l  reason: collision with root package name */
        public int f65501l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f65502m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f65503n;

        public b(c cVar) {
            this.f65490a = cVar.b();
            this.f65491b = cVar.a(4);
            this.f65492c = cVar.a(4);
            this.f65493d = cVar.a(3);
            this.f65494e = cVar.a(2);
            this.f65495f = cVar.b();
            this.f65496g = cVar.b();
            if (this.f65495f) {
                this.f65497h = cVar.a(2);
                this.f65498i = cVar.b();
                this.f65499j = cVar.a(2);
            }
            if (this.f65496g) {
                this.f65500k = cVar.a(2);
                this.f65501l = cVar.a(2);
                this.f65502m = cVar.b();
            }
            this.f65503n = cVar.b();
        }
    }

    static {
        f65432Z.put(0, 96000);
        f65432Z.put(1, 88200);
        f65432Z.put(2, 64000);
        f65432Z.put(3, 48000);
        f65432Z.put(4, 44100);
        f65432Z.put(5, 32000);
        f65432Z.put(6, 24000);
        f65432Z.put(7, 22050);
        f65432Z.put(8, 16000);
        f65432Z.put(9, 12000);
        f65432Z.put(10, 11025);
        f65432Z.put(11, 8000);
        f65433a0.put(1, "AAC main");
        f65433a0.put(2, "AAC LC");
        f65433a0.put(3, "AAC SSR");
        f65433a0.put(4, "AAC LTP");
        f65433a0.put(5, "SBR");
        f65433a0.put(6, "AAC Scalable");
        f65433a0.put(7, "TwinVQ");
        f65433a0.put(8, "CELP");
        f65433a0.put(9, "HVXC");
        f65433a0.put(10, "(reserved)");
        f65433a0.put(11, "(reserved)");
        f65433a0.put(12, "TTSI");
        f65433a0.put(13, "Main synthetic");
        f65433a0.put(14, "Wavetable synthesis");
        f65433a0.put(15, "General MIDI");
        f65433a0.put(16, "Algorithmic Synthesis and Audio FX");
        f65433a0.put(17, "ER AAC LC");
        f65433a0.put(18, "(reserved)");
        f65433a0.put(19, "ER AAC LTP");
        f65433a0.put(20, "ER AAC Scalable");
        f65433a0.put(21, "ER TwinVQ");
        f65433a0.put(22, "ER BSAC");
        f65433a0.put(23, "ER AAC LD");
        f65433a0.put(24, "ER CELP");
        f65433a0.put(25, "ER HVXC");
        f65433a0.put(26, "ER HILN");
        f65433a0.put(27, "ER Parametric");
        f65433a0.put(28, "SSC");
        f65433a0.put(29, "PS");
        f65433a0.put(30, "MPEG Surround");
        f65433a0.put(31, "(escape)");
        f65433a0.put(32, "Layer-1");
        f65433a0.put(33, "Layer-2");
        f65433a0.put(34, "Layer-3");
        f65433a0.put(35, "DST");
        f65433a0.put(36, "ALS");
        f65433a0.put(37, "SLS");
        f65433a0.put(38, "SLS non-core");
        f65433a0.put(39, "ER AAC ELD");
        f65433a0.put(40, "SMR Simple");
        f65433a0.put(41, "SMR Main");
    }

    public a() {
        this.f65505a = 5;
    }

    private int g() {
        int i10;
        if (this.f65479x == 1) {
            i10 = 16;
        } else {
            i10 = 2;
        }
        int i11 = i10 + 1;
        if (this.f65464i != 0) {
            int i12 = this.f65460e;
            if (i12 == 6 || i12 == 20) {
                i11 = i10 + 4;
            }
            if (this.f65481z == 1) {
                if (i12 == 22) {
                    i11 += 16;
                }
                if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                    i11 += 3;
                }
                i11++;
                if (this.f65440G == 1) {
                    throw new RuntimeException("Not implemented");
                }
            }
            return i11;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    private static int h(c cVar) {
        int a10 = cVar.a(5);
        if (a10 == 31) {
            return cVar.a(6) + 32;
        }
        return a10;
    }

    private void i(int i10, int i11, int i12, c cVar) {
        this.f65445L = cVar.a(1);
        this.f65446M = cVar.a(2);
        int a10 = cVar.a(1);
        this.f65447N = a10;
        if (a10 == 1) {
            this.f65448O = cVar.a(1);
        }
    }

    private void j(int i10, int i11, int i12, c cVar) {
        this.f65478w = cVar.a(1);
        int a10 = cVar.a(1);
        this.f65479x = a10;
        if (a10 == 1) {
            this.f65480y = cVar.a(14);
        }
        this.f65481z = cVar.a(1);
        if (i11 != 0) {
            if (i12 == 6 || i12 == 20) {
                this.f65434A = cVar.a(3);
            }
            if (this.f65481z == 1) {
                if (i12 == 22) {
                    this.f65435B = cVar.a(5);
                    this.f65436C = cVar.a(11);
                }
                if (i12 == 17 || i12 == 19 || i12 == 20 || i12 == 23) {
                    this.f65437D = cVar.b();
                    this.f65438E = cVar.b();
                    this.f65439F = cVar.b();
                }
                int a11 = cVar.a(1);
                this.f65440G = a11;
                if (a11 == 1) {
                    throw new RuntimeException("not yet implemented");
                }
            }
            this.f65441H = true;
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    private void k(int i10, int i11, int i12, c cVar) {
        this.f65449P = cVar.a(1);
        this.f65450Q = cVar.a(8);
        this.f65451R = cVar.a(4);
        this.f65452S = cVar.a(12);
        this.f65453T = cVar.a(2);
    }

    private void l(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.f65454U = a10;
        if (a10 == 1) {
            this.f65455V = cVar.a(2);
        }
    }

    private void m(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(2);
        this.f65443J = a10;
        if (a10 != 1) {
            i(i10, i11, i12, cVar);
        }
        if (this.f65443J != 0) {
            k(i10, i11, i12, cVar);
        }
        this.f65444K = cVar.a(1);
        this.f65456W = true;
    }

    private void n(int i10, int i11, int i12, c cVar) {
        int a10 = cVar.a(1);
        this.f65442I = a10;
        if (a10 == 1) {
            m(i10, i11, i12, cVar);
        } else {
            l(i10, i11, i12, cVar);
        }
    }

    private static void t(int i10, d dVar) {
        if (i10 >= 32) {
            dVar.a(31, 5);
            dVar.a(i10 - 32, 6);
            return;
        }
        dVar.a(i10, 5);
    }

    private void u(d dVar) {
        dVar.a(this.f65478w, 1);
        dVar.a(this.f65479x, 1);
        if (this.f65479x == 1) {
            dVar.a(this.f65480y, 14);
        }
        dVar.a(this.f65481z, 1);
        if (this.f65464i != 0) {
            int i10 = this.f65460e;
            if (i10 == 6 || i10 == 20) {
                dVar.a(this.f65434A, 3);
            }
            if (this.f65481z == 1) {
                if (this.f65460e == 22) {
                    dVar.a(this.f65435B, 5);
                    dVar.a(this.f65436C, 11);
                }
                int i11 = this.f65460e;
                if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                    dVar.b(this.f65437D);
                    dVar.b(this.f65438E);
                    dVar.b(this.f65439F);
                }
                dVar.a(this.f65440G, 1);
                if (this.f65440G == 1) {
                    throw new RuntimeException("not yet implemented");
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("can't parse program_config_element yet");
    }

    /* access modifiers changed from: protected */
    public int a() {
        int i10;
        int i11;
        if (this.f65461f > 30) {
            i10 = 11;
        } else {
            i10 = 5;
        }
        int i12 = i10 + 4;
        if (this.f65462g == 15) {
            i12 = i10 + 28;
        }
        int i13 = i12 + 4;
        int i14 = this.f65460e;
        if (i14 == 5 || i14 == 29) {
            i13 = i12 + 8;
            if (this.f65468m == 15) {
                i13 = i12 + 32;
            }
        }
        if (i14 == 22) {
            i13 += 4;
        }
        if (this.f65441H) {
            i13 += g();
        }
        int i15 = this.f65477v;
        if (i15 >= 0) {
            int i16 = i11 + 11;
            if (i15 == 695) {
                int i17 = i11 + 16;
                int i18 = this.f65465j;
                if (i18 > 30) {
                    i17 = i11 + 22;
                }
                if (i18 == 5) {
                    i11 = i17 + 1;
                    if (this.f65466k) {
                        i11 = i17 + 5;
                        if (this.f65468m == 15) {
                            i11 = i17 + 29;
                        }
                        int i19 = this.f65476u;
                        if (i19 >= 0) {
                            int i20 = i11 + 11;
                            if (i19 == 1352) {
                                i11 += 12;
                            } else {
                                i11 = i20;
                            }
                        }
                    }
                } else {
                    i11 = i17;
                }
                if (i18 == 22) {
                    int i21 = i11 + 1;
                    if (this.f65466k) {
                        i21 = i11 + 5;
                        if (this.f65468m == 15) {
                            i21 = i11 + 29;
                        }
                    }
                    i11 = i21 + 4;
                }
            } else {
                i11 = i16;
            }
        }
        return (int) Math.ceil(((double) i11) / 8.0d);
    }

    public void e(ByteBuffer byteBuffer) {
        this.f65458Y = true;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f65506b);
        byteBuffer.position(byteBuffer.position() + this.f65506b);
        byte[] bArr = new byte[this.f65506b];
        this.f65457X = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(slice);
        int h10 = h(cVar);
        this.f65460e = h10;
        this.f65461f = h10;
        int a10 = cVar.a(4);
        this.f65462g = a10;
        if (a10 == 15) {
            this.f65463h = cVar.a(24);
        }
        this.f65464i = cVar.a(4);
        int i10 = this.f65460e;
        if (i10 == 5 || i10 == 29) {
            this.f65465j = 5;
            this.f65466k = true;
            if (i10 == 29) {
                this.f65467l = true;
            }
            int a11 = cVar.a(4);
            this.f65468m = a11;
            if (a11 == 15) {
                this.f65469n = cVar.a(24);
            }
            int h11 = h(cVar);
            this.f65460e = h11;
            if (h11 == 22) {
                this.f65470o = cVar.a(4);
            }
        } else {
            this.f65465j = 0;
        }
        int i11 = this.f65460e;
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                j(this.f65462g, this.f65464i, i11, cVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                n(this.f65462g, this.f65464i, i11, cVar);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f65471p = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f65472q = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.f65459d = new C0960a(this.f65464i, cVar);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i12 = this.f65460e;
        if (!(i12 == 17 || i12 == 39)) {
            switch (i12) {
                case 19:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
        }
        int a12 = cVar.a(2);
        this.f65473r = a12;
        if (a12 == 2 || a12 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (a12 == 3) {
            int a13 = cVar.a(1);
            this.f65474s = a13;
            if (a13 == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        if (this.f65465j != 5 && cVar.c() >= 16) {
            int a14 = cVar.a(11);
            this.f65475t = a14;
            this.f65477v = a14;
            if (a14 == 695) {
                int h12 = h(cVar);
                this.f65465j = h12;
                if (h12 == 5) {
                    boolean b10 = cVar.b();
                    this.f65466k = b10;
                    if (b10) {
                        int a15 = cVar.a(4);
                        this.f65468m = a15;
                        if (a15 == 15) {
                            this.f65469n = cVar.a(24);
                        }
                        if (cVar.c() >= 12) {
                            int a16 = cVar.a(11);
                            this.f65475t = a16;
                            this.f65476u = a16;
                            if (a16 == 1352) {
                                this.f65467l = cVar.b();
                            }
                        }
                    }
                }
                if (this.f65465j == 22) {
                    boolean b11 = cVar.b();
                    this.f65466k = b11;
                    if (b11) {
                        int a17 = cVar.a(4);
                        this.f65468m = a17;
                        if (a17 == 15) {
                            this.f65469n = cVar.a(24);
                        }
                    }
                    this.f65470o = cVar.a(4);
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f65438E == aVar.f65438E && this.f65437D == aVar.f65437D && this.f65439F == aVar.f65439F && this.f65460e == aVar.f65460e && this.f65464i == aVar.f65464i && this.f65480y == aVar.f65480y && this.f65479x == aVar.f65479x && this.f65474s == aVar.f65474s && this.f65473r == aVar.f65473r && this.f65447N == aVar.f65447N && this.f65465j == aVar.f65465j && this.f65470o == aVar.f65470o && this.f65481z == aVar.f65481z && this.f65440G == aVar.f65440G && this.f65469n == aVar.f65469n && this.f65468m == aVar.f65468m && this.f65472q == aVar.f65472q && this.f65478w == aVar.f65478w && this.f65441H == aVar.f65441H && this.f65453T == aVar.f65453T && this.f65454U == aVar.f65454U && this.f65455V == aVar.f65455V && this.f65452S == aVar.f65452S && this.f65450Q == aVar.f65450Q && this.f65449P == aVar.f65449P && this.f65451R == aVar.f65451R && this.f65446M == aVar.f65446M && this.f65445L == aVar.f65445L && this.f65442I == aVar.f65442I && this.f65434A == aVar.f65434A && this.f65436C == aVar.f65436C && this.f65435B == aVar.f65435B && this.f65444K == aVar.f65444K && this.f65443J == aVar.f65443J && this.f65456W == aVar.f65456W && this.f65467l == aVar.f65467l && this.f65471p == aVar.f65471p && this.f65463h == aVar.f65463h && this.f65462g == aVar.f65462g && this.f65466k == aVar.f65466k && this.f65475t == aVar.f65475t && this.f65448O == aVar.f65448O && Arrays.equals(this.f65457X, aVar.f65457X)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        byte[] bArr = this.f65457X;
        if (bArr != null) {
            i10 = Arrays.hashCode(bArr);
        } else {
            i10 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i10 * 31) + this.f65460e) * 31) + this.f65462g) * 31) + this.f65463h) * 31) + this.f65464i) * 31) + this.f65465j) * 31) + (this.f65466k ? 1 : 0)) * 31) + (this.f65467l ? 1 : 0)) * 31) + this.f65468m) * 31) + this.f65469n) * 31) + this.f65470o) * 31) + this.f65471p) * 31) + this.f65472q) * 31) + this.f65473r) * 31) + this.f65474s) * 31) + this.f65475t) * 31) + this.f65478w) * 31) + this.f65479x) * 31) + this.f65480y) * 31) + this.f65481z) * 31) + this.f65434A) * 31) + this.f65435B) * 31) + this.f65436C) * 31) + (this.f65437D ? 1 : 0)) * 31) + (this.f65438E ? 1 : 0)) * 31) + (this.f65439F ? 1 : 0)) * 31) + this.f65440G) * 31) + (this.f65441H ? 1 : 0)) * 31) + this.f65442I) * 31) + this.f65443J) * 31) + this.f65444K) * 31) + this.f65445L) * 31) + this.f65446M) * 31) + this.f65447N) * 31) + this.f65448O) * 31) + this.f65449P) * 31) + this.f65450Q) * 31) + this.f65451R) * 31) + this.f65452S) * 31) + this.f65453T) * 31) + this.f65454U) * 31) + this.f65455V) * 31) + (this.f65456W ? 1 : 0);
    }

    public ByteBuffer o() {
        ByteBuffer allocate = ByteBuffer.allocate(b());
        e.i(allocate, this.f65505a);
        f(allocate, a());
        allocate.put(p());
        return (ByteBuffer) allocate.rewind();
    }

    /* access modifiers changed from: protected */
    public ByteBuffer p() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[a()]);
        d dVar = new d(wrap);
        t(this.f65461f, dVar);
        dVar.a(this.f65462g, 4);
        if (this.f65462g == 15) {
            dVar.a(this.f65463h, 24);
        }
        dVar.a(this.f65464i, 4);
        int i10 = this.f65460e;
        if (i10 == 5 || i10 == 29) {
            this.f65465j = 5;
            this.f65466k = true;
            if (i10 == 29) {
                this.f65467l = true;
            }
            dVar.a(this.f65468m, 4);
            if (this.f65468m == 15) {
                dVar.a(this.f65469n, 24);
            }
            t(this.f65460e, dVar);
            if (this.f65460e == 22) {
                dVar.a(this.f65470o, 4);
            }
        }
        switch (this.f65460e) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case InboxPagingSource.PAGE_SIZE /*20*/:
            case 21:
            case 22:
            case 23:
                u(dVar);
                break;
            case 8:
                throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
            case 16:
                throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
            case 28:
                throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
            case 30:
                dVar.a(this.f65471p, 1);
                throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
            case c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
                throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
            case 36:
                dVar.a(this.f65472q, 5);
                throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
            case 39:
                throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i11 = this.f65460e;
        if (!(i11 == 17 || i11 == 39)) {
            switch (i11) {
                case 19:
                case InboxPagingSource.PAGE_SIZE /*20*/:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
        }
        dVar.a(this.f65473r, 2);
        int i12 = this.f65473r;
        if (i12 == 2 || i12 == 3) {
            throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
        }
        if (i12 == 3) {
            dVar.a(this.f65474s, 1);
            if (this.f65474s == 0) {
                throw new RuntimeException("not implemented");
            }
        }
        int i13 = this.f65477v;
        if (i13 >= 0) {
            dVar.a(i13, 11);
            if (this.f65477v == 695) {
                t(this.f65465j, dVar);
                if (this.f65465j == 5) {
                    dVar.b(this.f65466k);
                    if (this.f65466k) {
                        dVar.a(this.f65468m, 4);
                        if (this.f65468m == 15) {
                            dVar.a(this.f65469n, 24);
                        }
                        int i14 = this.f65476u;
                        if (i14 >= 0) {
                            dVar.a(i14, 11);
                            if (this.f65475t == 1352) {
                                dVar.b(this.f65467l);
                            }
                        }
                    }
                }
                if (this.f65465j == 22) {
                    dVar.b(this.f65466k);
                    if (this.f65466k) {
                        dVar.a(this.f65468m, 4);
                        if (this.f65468m == 15) {
                            dVar.a(this.f65469n, 24);
                        }
                    }
                    dVar.a(this.f65470o, 4);
                }
            }
        }
        return (ByteBuffer) wrap.rewind();
    }

    public void q(int i10) {
        this.f65460e = i10;
    }

    public void r(int i10) {
        this.f65464i = i10;
    }

    public void s(int i10) {
        this.f65462g = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AudioSpecificConfig");
        sb2.append("{configBytes=");
        sb2.append(bi.c.a(this.f65457X));
        sb2.append(", audioObjectType=");
        sb2.append(this.f65460e);
        sb2.append(" (");
        sb2.append((String) f65433a0.get(Integer.valueOf(this.f65460e)));
        sb2.append(")");
        sb2.append(", samplingFrequencyIndex=");
        sb2.append(this.f65462g);
        sb2.append(" (");
        sb2.append(f65432Z.get(Integer.valueOf(this.f65462g)));
        sb2.append(")");
        sb2.append(", samplingFrequency=");
        sb2.append(this.f65463h);
        sb2.append(", channelConfiguration=");
        sb2.append(this.f65464i);
        if (this.f65465j > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f65465j);
            sb2.append(" (");
            sb2.append((String) f65433a0.get(Integer.valueOf(this.f65465j)));
            sb2.append(")");
            sb2.append(", sbrPresentFlag=");
            sb2.append(this.f65466k);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f65467l);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f65468m);
            sb2.append(" (");
            sb2.append(f65432Z.get(Integer.valueOf(this.f65468m)));
            sb2.append(")");
            sb2.append(", extensionSamplingFrequency=");
            sb2.append(this.f65469n);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f65470o);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f65475t);
        if (this.f65441H) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f65478w);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f65479x);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.f65480y);
            sb2.append(", extensionFlag=");
            sb2.append(this.f65481z);
            sb2.append(", layerNr=");
            sb2.append(this.f65434A);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f65435B);
            sb2.append(", layer_length=");
            sb2.append(this.f65436C);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.f65437D);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.f65438E);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.f65439F);
            sb2.append(", extensionFlag3=");
            sb2.append(this.f65440G);
        }
        if (this.f65456W) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.f65442I);
            sb2.append(", paraMode=");
            sb2.append(this.f65443J);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.f65444K);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.f65445L);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.f65446M);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.f65447N);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.f65448O);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.f65449P);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.f65450Q);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.f65451R);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.f65452S);
            sb2.append(", hilnContMode=");
            sb2.append(this.f65453T);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.f65454U);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.f65455V);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
