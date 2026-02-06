package X2;

import W2.k;
import W2.q;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h2.C2030a;
import i2.C2073A;
import i2.C2076a;
import i2.p;
import io.intercom.android.sdk.models.carousel.Carousel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a extends e {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f9575A = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f9576B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C  reason: collision with root package name */
    private static final int[] f9577C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, ModuleDescriptor.MODULE_VERSION, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f9578D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f9579E = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F  reason: collision with root package name */
    private static final int[] f9580F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G  reason: collision with root package name */
    private static final boolean[] f9581G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f9582z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h  reason: collision with root package name */
    private final C2073A f9583h = new C2073A();

    /* renamed from: i  reason: collision with root package name */
    private final int f9584i;

    /* renamed from: j  reason: collision with root package name */
    private final int f9585j;

    /* renamed from: k  reason: collision with root package name */
    private final int f9586k;

    /* renamed from: l  reason: collision with root package name */
    private final long f9587l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList f9588m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private C0180a f9589n = new C0180a(0, 4);

    /* renamed from: o  reason: collision with root package name */
    private List f9590o;

    /* renamed from: p  reason: collision with root package name */
    private List f9591p;

    /* renamed from: q  reason: collision with root package name */
    private int f9592q;

    /* renamed from: r  reason: collision with root package name */
    private int f9593r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9594s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9595t;

    /* renamed from: u  reason: collision with root package name */
    private byte f9596u;

    /* renamed from: v  reason: collision with root package name */
    private byte f9597v;

    /* renamed from: w  reason: collision with root package name */
    private int f9598w = 0;

    /* renamed from: x  reason: collision with root package name */
    private boolean f9599x;

    /* renamed from: y  reason: collision with root package name */
    private long f9600y;

    /* renamed from: X2.a$a  reason: collision with other inner class name */
    private static final class C0180a {

        /* renamed from: a  reason: collision with root package name */
        private final List f9601a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List f9602b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f9603c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f9604d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f9605e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f9606f;

        /* renamed from: g  reason: collision with root package name */
        private int f9607g;

        /* renamed from: h  reason: collision with root package name */
        private int f9608h;

        /* renamed from: X2.a$a$a  reason: collision with other inner class name */
        private static class C0181a {

            /* renamed from: a  reason: collision with root package name */
            public final int f9609a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f9610b;

            /* renamed from: c  reason: collision with root package name */
            public int f9611c;

            public C0181a(int i10, boolean z10, int i11) {
                this.f9609a = i10;
                this.f9610b = z10;
                this.f9611c = i11;
            }
        }

        public C0180a(int i10, int i11) {
            j(i10);
            this.f9608h = i11;
        }

        private SpannableString h() {
            int i10;
            boolean z10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9603c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (i15 < this.f9601a.size()) {
                C0181a aVar = (C0181a) this.f9601a.get(i15);
                boolean z12 = aVar.f9610b;
                int i17 = aVar.f9609a;
                if (i17 != 8) {
                    if (i17 == 7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i17 != 7) {
                        i14 = a.f9576B[i17];
                    }
                    z11 = z10;
                }
                int i18 = aVar.f9611c;
                i15++;
                if (i15 < this.f9601a.size()) {
                    i10 = ((C0181a) this.f9601a.get(i15)).f9611c;
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
            if (this.f9603c.length() < 32) {
                this.f9603c.append(c10);
            }
        }

        public void f() {
            int length = this.f9603c.length();
            if (length > 0) {
                this.f9603c.delete(length - 1, length);
                int size = this.f9601a.size() - 1;
                while (size >= 0) {
                    C0181a aVar = (C0181a) this.f9601a.get(size);
                    int i10 = aVar.f9611c;
                    if (i10 == length) {
                        aVar.f9611c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public C2030a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f9602b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f9602b.get(i11));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f9605e + this.f9606f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                if (this.f9607g == 2 && (Math.abs(i13) < 3 || length < 0)) {
                    i10 = 1;
                } else if (this.f9607g != 2 || i13 <= 0) {
                    i10 = 0;
                } else {
                    i10 = 2;
                }
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((((float) i12) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f9604d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f9607g == 1) {
                i14 -= this.f9608h - 1;
            }
            return new C2030a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h((float) i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            if (!this.f9601a.isEmpty() || !this.f9602b.isEmpty() || this.f9603c.length() != 0) {
                return false;
            }
            return true;
        }

        public void j(int i10) {
            this.f9607g = i10;
            this.f9601a.clear();
            this.f9602b.clear();
            this.f9603c.setLength(0);
            this.f9604d = 15;
            this.f9605e = 0;
            this.f9606f = 0;
        }

        public void k() {
            this.f9602b.add(h());
            this.f9603c.setLength(0);
            this.f9601a.clear();
            int min = Math.min(this.f9608h, this.f9604d);
            while (this.f9602b.size() >= min) {
                this.f9602b.remove(0);
            }
        }

        public void l(int i10) {
            this.f9607g = i10;
        }

        public void m(int i10) {
            this.f9608h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f9601a.add(new C0181a(i10, z10, this.f9603c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        int i11;
        boolean z10;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 16000) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.a(z10);
            this.f9587l = j10 * 1000;
        } else {
            this.f9587l = -9223372036854775807L;
        }
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f9584i = i11;
        if (i10 == 1) {
            this.f9586k = 0;
            this.f9585j = 0;
        } else if (i10 == 2) {
            this.f9586k = 1;
            this.f9585j = 0;
        } else if (i10 == 3) {
            this.f9586k = 0;
            this.f9585j = 1;
        } else if (i10 != 4) {
            p.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f9586k = 0;
            this.f9585j = 0;
        } else {
            this.f9586k = 1;
            this.f9585j = 1;
        }
        O(0);
        N();
        this.f9599x = true;
        this.f9600y = -9223372036854775807L;
    }

    private void A(byte b10, byte b11) {
        boolean z10;
        int i10;
        int i11 = f9582z[b10 & 7];
        if ((b11 & 32) != 0) {
            i11++;
        }
        if (i11 != this.f9589n.f9604d) {
            if (this.f9592q != 1 && !this.f9589n.i()) {
                C0180a aVar = new C0180a(this.f9592q, this.f9593r);
                this.f9589n = aVar;
                this.f9588m.add(aVar);
            }
            int unused = this.f9589n.f9604d = i11;
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
        C0180a aVar2 = this.f9589n;
        if (z10) {
            i10 = 8;
        } else {
            i10 = i12;
        }
        aVar2.p(i10, z11);
        if (z10) {
            int unused2 = this.f9589n.f9605e = f9575A[i12];
        }
    }

    private static boolean B(byte b10) {
        if ((b10 & 224) == 0) {
            return true;
        }
        return false;
    }

    private static boolean C(byte b10, byte b11) {
        if ((b10 & 246) == 18 && (b11 & 224) == 32) {
            return true;
        }
        return false;
    }

    private static boolean D(byte b10, byte b11) {
        if ((b10 & 247) == 17 && (b11 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean E(byte b10, byte b11) {
        if ((b10 & 246) == 20 && (b11 & 240) == 32) {
            return true;
        }
        return false;
    }

    private static boolean F(byte b10, byte b11) {
        if ((b10 & 240) == 16 && (b11 & 192) == 64) {
            return true;
        }
        return false;
    }

    private static boolean G(byte b10) {
        if ((b10 & 240) == 16) {
            return true;
        }
        return false;
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f9595t = false;
        } else if (this.f9595t && this.f9596u == b10 && this.f9597v == b11) {
            this.f9595t = false;
            return true;
        } else {
            this.f9595t = true;
            this.f9596u = b10;
            this.f9597v = b11;
        }
        return false;
    }

    private static boolean I(byte b10) {
        if ((b10 & 246) == 20) {
            return true;
        }
        return false;
    }

    private static boolean J(byte b10, byte b11) {
        if ((b10 & 247) == 17 && (b11 & 240) == 48) {
            return true;
        }
        return false;
    }

    private static boolean K(byte b10, byte b11) {
        if ((b10 & 247) != 23 || b11 < 33 || b11 > 35) {
            return false;
        }
        return true;
    }

    private static boolean L(byte b10) {
        if (1 > b10 || b10 > 15) {
            return false;
        }
        return true;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f9599x = false;
        } else if (I(b10)) {
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
                                this.f9599x = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f9599x = true;
        }
    }

    private void N() {
        this.f9589n.j(this.f9592q);
        this.f9588m.clear();
        this.f9588m.add(this.f9589n);
    }

    private void O(int i10) {
        int i11 = this.f9592q;
        if (i11 != i10) {
            this.f9592q = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f9588m.size(); i12++) {
                    ((C0180a) this.f9588m.get(i12)).l(i10);
                }
                return;
            }
            N();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f9590o = Collections.emptyList();
            }
        }
    }

    private void P(int i10) {
        this.f9593r = i10;
        this.f9589n.m(i10);
    }

    private boolean Q() {
        if (this.f9587l == -9223372036854775807L || this.f9600y == -9223372036854775807L || l() - this.f9600y < this.f9587l) {
            return false;
        }
        return true;
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f9598w = s(b10);
        }
        if (this.f9598w == this.f9586k) {
            return true;
        }
        return false;
    }

    private static char r(byte b10) {
        return (char) f9577C[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List t() {
        int size = this.f9588m.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            C2030a g10 = ((C0180a) this.f9588m.get(i11)).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f21198i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            C2030a aVar = (C2030a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f21198i != i10) {
                    aVar = (C2030a) C2076a.e(((C0180a) this.f9588m.get(i12)).g(i10));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f9579E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) f9580F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return u(b11);
        }
        return v(b11);
    }

    private static char x(byte b10) {
        return (char) f9578D[b10 & 15];
    }

    private void y(byte b10) {
        boolean z10;
        this.f9589n.e(' ');
        if ((b10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9589n.p((b10 >> 1) & 7, z10);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    O(1);
                    P(2);
                    return;
                case 38:
                    O(1);
                    P(3);
                    return;
                case 39:
                    O(1);
                    P(4);
                    return;
                default:
                    int i10 = this.f9592q;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case Carousel.ENTITY_TYPE /*44*/:
                                    this.f9590o = Collections.emptyList();
                                    int i11 = this.f9592q;
                                    if (i11 == 1 || i11 == 3) {
                                        N();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f9589n.i()) {
                                        this.f9589n.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    N();
                                    return;
                                case 47:
                                    this.f9590o = t();
                                    N();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f9589n.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            O(3);
        }
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    public void flush() {
        super.flush();
        this.f9590o = null;
        this.f9591p = null;
        O(0);
        P(4);
        N();
        this.f9594s = false;
        this.f9595t = false;
        this.f9596u = 0;
        this.f9597v = 0;
        this.f9598w = 0;
        this.f9599x = true;
        this.f9600y = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public k g() {
        List list = this.f9590o;
        this.f9591p = list;
        return new f((List) C2076a.e(list));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(W2.p r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f23520d
            java.lang.Object r10 = i2.C2076a.e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            i2.A r0 = r9.f9583h
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.S(r1, r10)
            r10 = 0
            r0 = r10
        L_0x0017:
            i2.A r1 = r9.f9583h
            int r1 = r1.a()
            int r2 = r9.f9584i
            r3 = 1
            if (r1 < r2) goto L_0x00f5
            r1 = 2
            if (r2 != r1) goto L_0x0027
            r1 = -4
            goto L_0x002d
        L_0x0027:
            i2.A r1 = r9.f9583h
            int r1 = r1.H()
        L_0x002d:
            i2.A r2 = r9.f9583h
            int r2 = r2.H()
            i2.A r4 = r9.f9583h
            int r4 = r4.H()
            r5 = r1 & 2
            if (r5 == 0) goto L_0x003e
            goto L_0x0017
        L_0x003e:
            r5 = r1 & 1
            int r6 = r9.f9585j
            if (r5 == r6) goto L_0x0045
            goto L_0x0017
        L_0x0045:
            r5 = r2 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0050
            if (r6 != 0) goto L_0x0050
            goto L_0x0017
        L_0x0050:
            boolean r7 = r9.f9594s
            r1 = r1 & 4
            r8 = 4
            if (r1 != r8) goto L_0x0063
            boolean[] r1 = f9581G
            boolean r2 = r1[r2]
            if (r2 == 0) goto L_0x0063
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x0063
            r1 = r3
            goto L_0x0064
        L_0x0063:
            r1 = r10
        L_0x0064:
            r9.f9594s = r1
            boolean r1 = r9.H(r1, r5, r6)
            if (r1 == 0) goto L_0x006d
            goto L_0x0017
        L_0x006d:
            boolean r1 = r9.f9594s
            if (r1 != 0) goto L_0x0078
            if (r7 == 0) goto L_0x0017
            r9.N()
        L_0x0076:
            r0 = r3
            goto L_0x0017
        L_0x0078:
            r9.M(r5, r6)
            boolean r1 = r9.f9599x
            if (r1 != 0) goto L_0x0080
            goto L_0x0017
        L_0x0080:
            boolean r1 = r9.R(r5)
            if (r1 != 0) goto L_0x0087
            goto L_0x0017
        L_0x0087:
            boolean r0 = B(r5)
            if (r0 == 0) goto L_0x00de
            boolean r0 = J(r5, r6)
            if (r0 == 0) goto L_0x009d
            X2.a$a r0 = r9.f9589n
            char r1 = x(r6)
            r0.e(r1)
            goto L_0x0076
        L_0x009d:
            boolean r0 = C(r5, r6)
            if (r0 == 0) goto L_0x00b2
            X2.a$a r0 = r9.f9589n
            r0.f()
            X2.a$a r0 = r9.f9589n
            char r1 = w(r5, r6)
            r0.e(r1)
            goto L_0x0076
        L_0x00b2:
            boolean r0 = D(r5, r6)
            if (r0 == 0) goto L_0x00bc
            r9.y(r6)
            goto L_0x0076
        L_0x00bc:
            boolean r0 = F(r5, r6)
            if (r0 == 0) goto L_0x00c6
            r9.A(r5, r6)
            goto L_0x0076
        L_0x00c6:
            boolean r0 = K(r5, r6)
            if (r0 == 0) goto L_0x00d4
            X2.a$a r0 = r9.f9589n
            int r6 = r6 + -32
            int unused = r0.f9606f = r6
            goto L_0x0076
        L_0x00d4:
            boolean r0 = E(r5, r6)
            if (r0 == 0) goto L_0x0076
            r9.z(r6)
            goto L_0x0076
        L_0x00de:
            X2.a$a r0 = r9.f9589n
            char r1 = r(r5)
            r0.e(r1)
            r0 = r6 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0076
            X2.a$a r0 = r9.f9589n
            char r1 = r(r6)
            r0.e(r1)
            goto L_0x0076
        L_0x00f5:
            if (r0 == 0) goto L_0x010a
            int r10 = r9.f9592q
            if (r10 == r3) goto L_0x00fe
            r0 = 3
            if (r10 != r0) goto L_0x010a
        L_0x00fe:
            java.util.List r10 = r9.t()
            r9.f9590o = r10
            long r0 = r9.l()
            r9.f9600y = r0
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.a.h(W2.p):void");
    }

    public /* bridge */ /* synthetic */ W2.p i() {
        return super.d();
    }

    /* renamed from: j */
    public q a() {
        q k10;
        q j10 = super.a();
        if (j10 != null) {
            return j10;
        }
        if (!Q() || (k10 = k()) == null) {
            return null;
        }
        this.f9590o = Collections.emptyList();
        this.f9600y = -9223372036854775807L;
        q qVar = k10;
        qVar.u(l(), g(), Long.MAX_VALUE);
        return k10;
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        if (this.f9590o != this.f9591p) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void n(W2.p pVar) {
        super.c(pVar);
    }

    public void release() {
    }
}
