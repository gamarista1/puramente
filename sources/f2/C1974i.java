package f2;

import i2.L;
import java.util.Arrays;

/* renamed from: f2.i  reason: case insensitive filesystem */
public final class C1974i {

    /* renamed from: h  reason: collision with root package name */
    public static final C1974i f19977h = new b().d(1).c(2).e(3).a();

    /* renamed from: i  reason: collision with root package name */
    public static final C1974i f19978i = new b().d(1).c(1).e(2).a();

    /* renamed from: j  reason: collision with root package name */
    private static final String f19979j = L.y0(0);

    /* renamed from: k  reason: collision with root package name */
    private static final String f19980k = L.y0(1);

    /* renamed from: l  reason: collision with root package name */
    private static final String f19981l = L.y0(2);

    /* renamed from: m  reason: collision with root package name */
    private static final String f19982m = L.y0(3);

    /* renamed from: n  reason: collision with root package name */
    private static final String f19983n = L.y0(4);

    /* renamed from: o  reason: collision with root package name */
    private static final String f19984o = L.y0(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f19985a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19986b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19987c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f19988d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19989e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19990f;

    /* renamed from: g  reason: collision with root package name */
    private int f19991g;

    /* renamed from: f2.i$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f19992a;

        /* renamed from: b  reason: collision with root package name */
        private int f19993b;

        /* renamed from: c  reason: collision with root package name */
        private int f19994c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f19995d;

        /* renamed from: e  reason: collision with root package name */
        private int f19996e;

        /* renamed from: f  reason: collision with root package name */
        private int f19997f;

        public C1974i a() {
            return new C1974i(this.f19992a, this.f19993b, this.f19994c, this.f19995d, this.f19996e, this.f19997f);
        }

        public b b(int i10) {
            this.f19997f = i10;
            return this;
        }

        public b c(int i10) {
            this.f19993b = i10;
            return this;
        }

        public b d(int i10) {
            this.f19992a = i10;
            return this;
        }

        public b e(int i10) {
            this.f19994c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f19995d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f19996e = i10;
            return this;
        }

        public b() {
            this.f19992a = -1;
            this.f19993b = -1;
            this.f19994c = -1;
            this.f19996e = -1;
            this.f19997f = -1;
        }

        private b(C1974i iVar) {
            this.f19992a = iVar.f19985a;
            this.f19993b = iVar.f19986b;
            this.f19994c = iVar.f19987c;
            this.f19995d = iVar.f19988d;
            this.f19996e = iVar.f19989e;
            this.f19997f = iVar.f19990f;
        }
    }

    private static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(C1974i iVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (iVar == null) {
            return true;
        }
        int i14 = iVar.f19985a;
        if ((i14 == -1 || i14 == 1 || i14 == 2) && (((i10 = iVar.f19986b) == -1 || i10 == 2) && (((i11 = iVar.f19987c) == -1 || i11 == 3) && iVar.f19988d == null && (((i12 = iVar.f19990f) == -1 || i12 == 8) && ((i13 = iVar.f19989e) == -1 || i13 == 8))))) {
            return true;
        }
        return false;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            return 2;
        }
        return -1;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 == 18) {
            return 7;
        }
        if (i10 == 6 || i10 == 7) {
            return 3;
        }
        return -1;
    }

    private static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1974i.class != obj.getClass()) {
            return false;
        }
        C1974i iVar = (C1974i) obj;
        if (this.f19985a == iVar.f19985a && this.f19986b == iVar.f19986b && this.f19987c == iVar.f19987c && Arrays.equals(this.f19988d, iVar.f19988d) && this.f19989e == iVar.f19989e && this.f19990f == iVar.f19990f) {
            return true;
        }
        return false;
    }

    public boolean f() {
        if (this.f19989e == -1 || this.f19990f == -1) {
            return false;
        }
        return true;
    }

    public boolean g() {
        if (this.f19985a == -1 || this.f19986b == -1 || this.f19987c == -1) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f19991g == 0) {
            this.f19991g = ((((((((((527 + this.f19985a) * 31) + this.f19986b) * 31) + this.f19987c) * 31) + Arrays.hashCode(this.f19988d)) * 31) + this.f19989e) * 31) + this.f19990f;
        }
        return this.f19991g;
    }

    public boolean i() {
        if (f() || g()) {
            return true;
        }
        return false;
    }

    public String m() {
        String str;
        String str2;
        if (g()) {
            str = L.F("%s/%s/%s", d(this.f19985a), c(this.f19986b), e(this.f19987c));
        } else {
            str = "NA/NA/NA";
        }
        if (f()) {
            str2 = this.f19989e + "/" + this.f19990f;
        } else {
            str2 = "NA/NA";
        }
        return str + "/" + str2;
    }

    public String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f19985a));
        sb2.append(", ");
        sb2.append(c(this.f19986b));
        sb2.append(", ");
        sb2.append(e(this.f19987c));
        sb2.append(", ");
        if (this.f19988d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", ");
        sb2.append(l(this.f19989e));
        sb2.append(", ");
        sb2.append(b(this.f19990f));
        sb2.append(")");
        return sb2.toString();
    }

    private C1974i(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f19985a = i10;
        this.f19986b = i11;
        this.f19987c = i12;
        this.f19988d = bArr;
        this.f19989e = i13;
        this.f19990f = i14;
    }
}
