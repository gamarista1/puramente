package X9;

import W9.b;
import W9.h;
import W9.l;
import W9.m;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.intercom.android.sdk.models.carousel.Carousel;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a extends e {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f35547A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B  reason: collision with root package name */
    private static final int[] f35548B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, ModuleDescriptor.MODULE_VERSION, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C  reason: collision with root package name */
    private static final int[] f35549C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f35550D = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f35551E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F  reason: collision with root package name */
    private static final boolean[] f35552F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f35553y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f35554z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g  reason: collision with root package name */
    private final B f35555g = new B();

    /* renamed from: h  reason: collision with root package name */
    private final int f35556h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35557i;

    /* renamed from: j  reason: collision with root package name */
    private final int f35558j;

    /* renamed from: k  reason: collision with root package name */
    private final long f35559k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList f35560l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private C0571a f35561m = new C0571a(0, 4);

    /* renamed from: n  reason: collision with root package name */
    private List f35562n;

    /* renamed from: o  reason: collision with root package name */
    private List f35563o;

    /* renamed from: p  reason: collision with root package name */
    private int f35564p;

    /* renamed from: q  reason: collision with root package name */
    private int f35565q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f35566r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f35567s;

    /* renamed from: t  reason: collision with root package name */
    private byte f35568t;

    /* renamed from: u  reason: collision with root package name */
    private byte f35569u;

    /* renamed from: v  reason: collision with root package name */
    private int f35570v = 0;

    /* renamed from: w  reason: collision with root package name */
    private boolean f35571w;

    /* renamed from: x  reason: collision with root package name */
    private long f35572x;

    /* renamed from: X9.a$a  reason: collision with other inner class name */
    private static final class C0571a {

        /* renamed from: a  reason: collision with root package name */
        private final List f35573a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List f35574b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f35575c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f35576d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f35577e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f35578f;

        /* renamed from: g  reason: collision with root package name */
        private int f35579g;

        /* renamed from: h  reason: collision with root package name */
        private int f35580h;

        /* renamed from: X9.a$a$a  reason: collision with other inner class name */
        private static class C0572a {

            /* renamed from: a  reason: collision with root package name */
            public final int f35581a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f35582b;

            /* renamed from: c  reason: collision with root package name */
            public int f35583c;

            public C0572a(int i10, boolean z10, int i11) {
                this.f35581a = i10;
                this.f35582b = z10;
                this.f35583c = i11;
            }
        }

        public C0571a(int i10, int i11) {
            j(i10);
            this.f35580h = i11;
        }

        private SpannableString h() {
            int i10;
            boolean z10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35575c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 < this.f35573a.size()) {
                C0572a aVar = (C0572a) this.f35573a.get(i15);
                boolean z12 = aVar.f35582b;
                int i17 = aVar.f35581a;
                if (i17 != 8) {
                    if (i17 == 7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i17 != 7) {
                        i14 = a.f35547A[i17];
                    }
                    z11 = z10;
                }
                int i18 = aVar.f35583c;
                i15++;
                if (i15 < this.f35573a.size()) {
                    i10 = ((C0572a) this.f35573a.get(i15)).f35583c;
                } else {
                    i10 = length;
                }
                if (i18 != i10) {
                    if (i11 != -1 && !z12) {
                        q(spannableStringBuilder, i11, i18);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i18;
                    }
                    if (i12 != -1 && !z11) {
                        o(spannableStringBuilder, i12, i18);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i18;
                    }
                    if (i14 != i13) {
                        n(spannableStringBuilder, i16, i18, i13);
                        i13 = i14;
                        i16 = i18;
                    }
                }
            }
            if (!(i11 == -1 || i11 == length)) {
                q(spannableStringBuilder, i11, length);
            }
            if (!(i12 == -1 || i12 == length)) {
                o(spannableStringBuilder, i12, length);
            }
            if (i16 != length) {
                n(spannableStringBuilder, i16, length, i13);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f35575c.length() < 32) {
                this.f35575c.append(c10);
            }
        }

        public void f() {
            int length = this.f35575c.length();
            if (length > 0) {
                this.f35575c.delete(length - 1, length);
                int size = this.f35573a.size() - 1;
                while (size >= 0) {
                    C0572a aVar = (C0572a) this.f35573a.get(size);
                    int i10 = aVar.f35583c;
                    if (i10 == length) {
                        aVar.f35583c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public b g(int i10) {
            float f10;
            int i11 = this.f35577e + this.f35578f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f35574b.size(); i13++) {
                spannableStringBuilder.append(M.Y0((CharSequence) this.f35574b.get(i13), i12));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(M.Y0(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f35579g == 2 && (Math.abs(i14) < 3 || length < 0)) {
                    i10 = 1;
                } else if (this.f35579g != 2 || i14 <= 0) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((((float) i11) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f35576d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f35579g == 1) {
                i15 -= this.f35580h - 1;
            }
            return new b.C0565b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h((float) i15, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            if (!this.f35573a.isEmpty() || !this.f35574b.isEmpty() || this.f35575c.length() != 0) {
                return false;
            }
            return true;
        }

        public void j(int i10) {
            this.f35579g = i10;
            this.f35573a.clear();
            this.f35574b.clear();
            this.f35575c.setLength(0);
            this.f35576d = 15;
            this.f35577e = 0;
            this.f35578f = 0;
        }

        public void k() {
            this.f35574b.add(h());
            this.f35575c.setLength(0);
            this.f35573a.clear();
            int min = Math.min(this.f35580h, this.f35576d);
            while (this.f35574b.size() >= min) {
                this.f35574b.remove(0);
            }
        }

        public void l(int i10) {
            this.f35579g = i10;
        }

        public void m(int i10) {
            this.f35580h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f35573a.add(new C0572a(i10, z10, this.f35575c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        long j11;
        int i11;
        if (j10 > 0) {
            j11 = j10 * 1000;
        } else {
            j11 = -9223372036854775807L;
        }
        this.f35559k = j11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f35556h = i11;
        if (i10 == 1) {
            this.f35558j = 0;
            this.f35557i = 0;
        } else if (i10 == 2) {
            this.f35558j = 1;
            this.f35557i = 0;
        } else if (i10 == 3) {
            this.f35558j = 0;
            this.f35557i = 1;
        } else if (i10 != 4) {
            s.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f35558j = 0;
            this.f35557i = 0;
        } else {
            this.f35558j = 1;
            this.f35557i = 1;
        }
        M(0);
        L();
        this.f35571w = true;
        this.f35572x = -9223372036854775807L;
    }

    private static boolean A(byte b10, byte b11) {
        if ((b10 & 246) == 18 && (b11 & 224) == 32) {
            return true;
        }
        return false;
    }

    private static boolean B(byte b10, byte b11) {
        if ((b10 & 247) == 17 && (b11 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean C(byte b10, byte b11) {
        if ((b10 & 246) == 20 && (b11 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean D(byte b10, byte b11) {
        if ((b10 & 240) == 16 && (b11 & 192) == 64) {
            return true;
        }
        return false;
    }

    private static boolean E(byte b10) {
        if ((b10 & 240) == 16) {
            return true;
        }
        return false;
    }

    private boolean F(boolean z10, byte b10, byte b11) {
        if (!z10 || !E(b10)) {
            this.f35567s = false;
        } else if (this.f35567s && this.f35568t == b10 && this.f35569u == b11) {
            this.f35567s = false;
            return true;
        } else {
            this.f35567s = true;
            this.f35568t = b10;
            this.f35569u = b11;
        }
        return false;
    }

    private static boolean G(byte b10) {
        if ((b10 & 247) == 20) {
            return true;
        }
        return false;
    }

    private static boolean H(byte b10, byte b11) {
        if ((b10 & 247) == 17 && (b11 & 240) == 48) {
            return true;
        }
        return false;
    }

    private static boolean I(byte b10, byte b11) {
        if ((b10 & 247) != 23 || b11 < 33 || b11 > 35) {
            return false;
        }
        return true;
    }

    private static boolean J(byte b10) {
        if (1 > b10 || b10 > 15) {
            return false;
        }
        return true;
    }

    private void K(byte b10, byte b11) {
        if (J(b10)) {
            this.f35571w = false;
        } else if (G(b10)) {
            if (!(b11 == 32 || b11 == 47)) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f35571w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f35571w = true;
        }
    }

    private void L() {
        this.f35561m.j(this.f35564p);
        this.f35560l.clear();
        this.f35560l.add(this.f35561m);
    }

    private void M(int i10) {
        int i11 = this.f35564p;
        if (i11 != i10) {
            this.f35564p = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f35560l.size(); i12++) {
                    ((C0571a) this.f35560l.get(i12)).l(i10);
                }
                return;
            }
            L();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f35562n = Collections.emptyList();
            }
        }
    }

    private void N(int i10) {
        this.f35565q = i10;
        this.f35561m.m(i10);
    }

    private boolean O() {
        if (this.f35559k == -9223372036854775807L || this.f35572x == -9223372036854775807L || j() - this.f35572x < this.f35559k) {
            return false;
        }
        return true;
    }

    private boolean P(byte b10) {
        if (z(b10)) {
            this.f35570v = q(b10);
        }
        if (this.f35570v == this.f35558j) {
            return true;
        }
        return false;
    }

    private static char p(byte b10) {
        return (char) f35548B[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int q(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List r() {
        int size = this.f35560l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            b g10 = ((C0571a) this.f35560l.get(i11)).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f34936i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            if (bVar != null) {
                if (bVar.f34936i != i10) {
                    bVar = (b) C3645a.e(((C0571a) this.f35560l.get(i12)).g(i10));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char s(byte b10) {
        return (char) f35550D[b10 & 31];
    }

    private static char t(byte b10) {
        return (char) f35551E[b10 & 31];
    }

    private static char u(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return s(b11);
        }
        return t(b11);
    }

    private static char v(byte b10) {
        return (char) f35549C[b10 & 15];
    }

    private void w(byte b10) {
        boolean z10;
        this.f35561m.e(' ');
        if ((b10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35561m.p((b10 >> 1) & 7, z10);
    }

    private void x(byte b10) {
        if (b10 == 32) {
            M(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    M(1);
                    N(2);
                    return;
                case 38:
                    M(1);
                    N(3);
                    return;
                case 39:
                    M(1);
                    N(4);
                    return;
                default:
                    int i10 = this.f35564p;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case Carousel.ENTITY_TYPE /*44*/:
                                    this.f35562n = Collections.emptyList();
                                    int i11 = this.f35564p;
                                    if (i11 == 1 || i11 == 3) {
                                        L();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f35561m.i()) {
                                        this.f35561m.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    L();
                                    return;
                                case 47:
                                    this.f35562n = r();
                                    L();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f35561m.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            M(3);
        }
    }

    private void y(byte b10, byte b11) {
        boolean z10;
        int i10;
        int i11 = f35553y[b10 & 7];
        if ((b11 & 32) != 0) {
            i11++;
        }
        if (i11 != this.f35561m.f35576d) {
            if (this.f35564p != 1 && !this.f35561m.i()) {
                C0571a aVar = new C0571a(this.f35564p, this.f35565q);
                this.f35561m = aVar;
                this.f35560l.add(aVar);
            }
            int unused = this.f35561m.f35576d = i11;
        }
        boolean z11 = false;
        if ((b11 & 16) == 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((b11 & 1) == 1) {
            z11 = true;
        }
        int i12 = (b11 >> 1) & 7;
        C0571a aVar2 = this.f35561m;
        if (z10) {
            i10 = 8;
        } else {
            i10 = i12;
        }
        aVar2.p(i10, z11);
        if (z10) {
            int unused2 = this.f35561m.f35577e = f35554z[i12];
        }
    }

    private static boolean z(byte b10) {
        if ((b10 & 224) == 0) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    /* access modifiers changed from: protected */
    public h e() {
        List list = this.f35562n;
        this.f35563o = list;
        return new f((List) C3645a.e(list));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(W9.l r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f46950c
            java.lang.Object r10 = ja.C3645a.e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            ja.B r0 = r9.f35555g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.N(r1, r10)
            r10 = 0
            r0 = r10
        L_0x0017:
            ja.B r1 = r9.f35555g
            int r1 = r1.a()
            int r2 = r9.f35556h
            r3 = 1
            if (r1 < r2) goto L_0x00f6
            r1 = 2
            if (r2 != r1) goto L_0x0027
            r1 = -4
            goto L_0x002e
        L_0x0027:
            ja.B r1 = r9.f35555g
            int r1 = r1.D()
            byte r1 = (byte) r1
        L_0x002e:
            ja.B r2 = r9.f35555g
            int r2 = r2.D()
            ja.B r4 = r9.f35555g
            int r4 = r4.D()
            r5 = r1 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0017
        L_0x003f:
            r5 = r1 & 1
            int r6 = r9.f35557i
            if (r5 == r6) goto L_0x0046
            goto L_0x0017
        L_0x0046:
            r5 = r2 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0017
        L_0x0051:
            boolean r7 = r9.f35566r
            r1 = r1 & 4
            r8 = 4
            if (r1 != r8) goto L_0x0064
            boolean[] r1 = f35552F
            boolean r2 = r1[r2]
            if (r2 == 0) goto L_0x0064
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x0064
            r1 = r3
            goto L_0x0065
        L_0x0064:
            r1 = r10
        L_0x0065:
            r9.f35566r = r1
            boolean r1 = r9.F(r1, r5, r6)
            if (r1 == 0) goto L_0x006e
            goto L_0x0017
        L_0x006e:
            boolean r1 = r9.f35566r
            if (r1 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0017
            r9.L()
        L_0x0077:
            r0 = r3
            goto L_0x0017
        L_0x0079:
            r9.K(r5, r6)
            boolean r1 = r9.f35571w
            if (r1 != 0) goto L_0x0081
            goto L_0x0017
        L_0x0081:
            boolean r1 = r9.P(r5)
            if (r1 != 0) goto L_0x0088
            goto L_0x0017
        L_0x0088:
            boolean r0 = z(r5)
            if (r0 == 0) goto L_0x00df
            boolean r0 = H(r5, r6)
            if (r0 == 0) goto L_0x009e
            X9.a$a r0 = r9.f35561m
            char r1 = v(r6)
            r0.e(r1)
            goto L_0x0077
        L_0x009e:
            boolean r0 = A(r5, r6)
            if (r0 == 0) goto L_0x00b3
            X9.a$a r0 = r9.f35561m
            r0.f()
            X9.a$a r0 = r9.f35561m
            char r1 = u(r5, r6)
            r0.e(r1)
            goto L_0x0077
        L_0x00b3:
            boolean r0 = B(r5, r6)
            if (r0 == 0) goto L_0x00bd
            r9.w(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r0 = D(r5, r6)
            if (r0 == 0) goto L_0x00c7
            r9.y(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r0 = I(r5, r6)
            if (r0 == 0) goto L_0x00d5
            X9.a$a r0 = r9.f35561m
            int r6 = r6 + -32
            int unused = r0.f35578f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r0 = C(r5, r6)
            if (r0 == 0) goto L_0x0077
            r9.x(r6)
            goto L_0x0077
        L_0x00df:
            X9.a$a r0 = r9.f35561m
            char r1 = p(r5)
            r0.e(r1)
            r0 = r6 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0077
            X9.a$a r0 = r9.f35561m
            char r1 = p(r6)
            r0.e(r1)
            goto L_0x0077
        L_0x00f6:
            if (r0 == 0) goto L_0x010b
            int r10 = r9.f35564p
            if (r10 == r3) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.r()
            r9.f35562n = r10
            long r0 = r9.j()
            r9.f35572x = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X9.a.f(W9.l):void");
    }

    public void flush() {
        super.flush();
        this.f35562n = null;
        this.f35563o = null;
        M(0);
        N(4);
        L();
        this.f35566r = false;
        this.f35567s = false;
        this.f35568t = 0;
        this.f35569u = 0;
        this.f35570v = 0;
        this.f35571w = true;
        this.f35572x = -9223372036854775807L;
    }

    public /* bridge */ /* synthetic */ l g() {
        return super.d();
    }

    /* renamed from: h */
    public m a() {
        m i10;
        m h10 = super.a();
        if (h10 != null) {
            return h10;
        }
        if (!O() || (i10 = i()) == null) {
            return null;
        }
        this.f35562n = Collections.emptyList();
        this.f35572x = -9223372036854775807L;
        m mVar = i10;
        mVar.x(j(), e(), Long.MAX_VALUE);
        return i10;
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        if (this.f35562n != this.f35563o) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void l(l lVar) {
        super.c(lVar);
    }

    public void release() {
    }
}
