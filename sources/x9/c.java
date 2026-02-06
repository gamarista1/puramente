package X9;

import W9.b;
import W9.h;
import W9.l;
import W9.m;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.C3649e;
import ja.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c extends e {

    /* renamed from: g  reason: collision with root package name */
    private final B f35584g = new B();

    /* renamed from: h  reason: collision with root package name */
    private final A f35585h = new A();

    /* renamed from: i  reason: collision with root package name */
    private int f35586i = -1;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f35587j;

    /* renamed from: k  reason: collision with root package name */
    private final int f35588k;

    /* renamed from: l  reason: collision with root package name */
    private final b[] f35589l;

    /* renamed from: m  reason: collision with root package name */
    private b f35590m;

    /* renamed from: n  reason: collision with root package name */
    private List f35591n;

    /* renamed from: o  reason: collision with root package name */
    private List f35592o;

    /* renamed from: p  reason: collision with root package name */
    private C0573c f35593p;

    /* renamed from: q  reason: collision with root package name */
    private int f35594q;

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator f35595c = new b();

        /* renamed from: a  reason: collision with root package name */
        public final W9.b f35596a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35597b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            b.C0565b n10 = new b.C0565b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f35596a = n10.a();
            this.f35597b = i14;
        }
    }

    private static final class b {

        /* renamed from: A  reason: collision with root package name */
        private static final int[] f35598A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B  reason: collision with root package name */
        private static final int[] f35599B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C  reason: collision with root package name */
        private static final boolean[] f35600C = {false, false, false, true, true, true, false};

        /* renamed from: D  reason: collision with root package name */
        private static final int[] f35601D;

        /* renamed from: E  reason: collision with root package name */
        private static final int[] f35602E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F  reason: collision with root package name */
        private static final int[] f35603F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G  reason: collision with root package name */
        private static final int[] f35604G;

        /* renamed from: w  reason: collision with root package name */
        public static final int f35605w = h(2, 2, 2, 0);

        /* renamed from: x  reason: collision with root package name */
        public static final int f35606x;

        /* renamed from: y  reason: collision with root package name */
        public static final int f35607y;

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f35608z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a  reason: collision with root package name */
        private final List f35609a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f35610b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f35611c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f35612d;

        /* renamed from: e  reason: collision with root package name */
        private int f35613e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f35614f;

        /* renamed from: g  reason: collision with root package name */
        private int f35615g;

        /* renamed from: h  reason: collision with root package name */
        private int f35616h;

        /* renamed from: i  reason: collision with root package name */
        private int f35617i;

        /* renamed from: j  reason: collision with root package name */
        private int f35618j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f35619k;

        /* renamed from: l  reason: collision with root package name */
        private int f35620l;

        /* renamed from: m  reason: collision with root package name */
        private int f35621m;

        /* renamed from: n  reason: collision with root package name */
        private int f35622n;

        /* renamed from: o  reason: collision with root package name */
        private int f35623o;

        /* renamed from: p  reason: collision with root package name */
        private int f35624p;

        /* renamed from: q  reason: collision with root package name */
        private int f35625q;

        /* renamed from: r  reason: collision with root package name */
        private int f35626r;

        /* renamed from: s  reason: collision with root package name */
        private int f35627s;

        /* renamed from: t  reason: collision with root package name */
        private int f35628t;

        /* renamed from: u  reason: collision with root package name */
        private int f35629u;

        /* renamed from: v  reason: collision with root package name */
        private int f35630v;

        static {
            int h10 = h(0, 0, 0, 0);
            f35606x = h10;
            int h11 = h(0, 0, 0, 3);
            f35607y = h11;
            int i10 = h10;
            int i11 = h10;
            f35601D = new int[]{h10, h11, i10, i11, h11, h10, h10};
            f35604G = new int[]{h10, h10, i10, i11, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                ja.C3645a.c(r4, r0, r1)
                ja.C3645a.c(r5, r0, r1)
                ja.C3645a.c(r6, r0, r1)
                ja.C3645a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x001b
                if (r7 == r1) goto L_0x001b
                r3 = 2
                if (r7 == r3) goto L_0x001f
                r3 = 3
                if (r7 == r3) goto L_0x001d
            L_0x001b:
                r7 = r2
                goto L_0x0021
            L_0x001d:
                r7 = r0
                goto L_0x0021
            L_0x001f:
                r7 = 127(0x7f, float:1.78E-43)
            L_0x0021:
                if (r4 <= r1) goto L_0x0025
                r4 = r2
                goto L_0x0026
            L_0x0025:
                r4 = r0
            L_0x0026:
                if (r5 <= r1) goto L_0x002a
                r5 = r2
                goto L_0x002b
            L_0x002a:
                r5 = r0
            L_0x002b:
                if (r6 <= r1) goto L_0x002e
                r0 = r2
            L_0x002e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: X9.c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f35609a.add(d());
                this.f35610b.clear();
                if (this.f35624p != -1) {
                    this.f35624p = 0;
                }
                if (this.f35625q != -1) {
                    this.f35625q = 0;
                }
                if (this.f35626r != -1) {
                    this.f35626r = 0;
                }
                if (this.f35628t != -1) {
                    this.f35628t = 0;
                }
                while (true) {
                    if ((this.f35619k && this.f35609a.size() >= this.f35618j) || this.f35609a.size() >= 15) {
                        this.f35609a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f35610b.append(c10);
            }
        }

        public void b() {
            int length = this.f35610b.length();
            if (length > 0) {
                this.f35610b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public X9.c.a c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = r0
            L_0x000f:
                java.util.List r3 = r15.f35609a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List r3 = r15.f35609a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.f35620l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005f
                if (r1 == r5) goto L_0x005c
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005f
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f35620l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            L_0x005a:
                r6 = r1
                goto L_0x0062
            L_0x005c:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x005a
            L_0x005f:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
                goto L_0x005a
            L_0x0062:
                boolean r1 = r15.f35614f
                if (r1 == 0) goto L_0x0071
                int r1 = r15.f35616h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f35615g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007e
            L_0x0071:
                int r1 = r15.f35616h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f35615g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007e:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f35617i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0092
                r8 = r0
                goto L_0x0099
            L_0x0092:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0098
                r8 = r5
                goto L_0x0099
            L_0x0098:
                r8 = r3
            L_0x0099:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x009f
                r9 = r0
                goto L_0x00a5
            L_0x009f:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a4
                r9 = r5
                goto L_0x00a5
            L_0x00a4:
                r9 = r3
            L_0x00a5:
                int r1 = r15.f35623o
                int r3 = f35606x
                if (r1 == r3) goto L_0x00ac
                r0 = r5
            L_0x00ac:
                X9.c$a r13 = new X9.c$a
                int r11 = r15.f35623o
                int r12 = r15.f35613e
                r5 = 0
                r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r14
                r10 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: X9.c.b.c():X9.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35610b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f35624p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f35624p, length, 33);
                }
                if (this.f35625q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f35625q, length, 33);
                }
                if (this.f35626r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f35627s), this.f35626r, length, 33);
                }
                if (this.f35628t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f35629u), this.f35628t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f35609a.clear();
            this.f35610b.clear();
            this.f35624p = -1;
            this.f35625q = -1;
            this.f35626r = -1;
            this.f35628t = -1;
            this.f35630v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z14 = z11;
            int i18 = i16;
            int i19 = i17;
            this.f35611c = true;
            this.f35612d = z10;
            this.f35619k = z14;
            this.f35613e = i10;
            this.f35614f = z13;
            this.f35615g = i11;
            this.f35616h = i12;
            this.f35617i = i15;
            int i20 = i13 + 1;
            if (this.f35618j != i20) {
                this.f35618j = i20;
                while (true) {
                    if ((!z14 || this.f35609a.size() < this.f35618j) && this.f35609a.size() < 15) {
                        break;
                    }
                    this.f35609a.remove(0);
                }
            }
            if (!(i18 == 0 || this.f35621m == i18)) {
                this.f35621m = i18;
                int i21 = i18 - 1;
                q(f35601D[i21], f35607y, f35600C[i21], 0, f35598A[i21], f35599B[i21], f35608z[i21]);
            }
            if (i19 != 0 && this.f35622n != i19) {
                this.f35622n = i19;
                int i22 = i19 - 1;
                m(0, 1, 1, false, false, f35603F[i22], f35602E[i22]);
                n(f35605w, f35604G[i22], f35606x);
            }
        }

        public boolean i() {
            return this.f35611c;
        }

        public boolean j() {
            if (!i() || (this.f35609a.isEmpty() && this.f35610b.length() == 0)) {
                return true;
            }
            return false;
        }

        public boolean k() {
            return this.f35612d;
        }

        public void l() {
            e();
            this.f35611c = false;
            this.f35612d = false;
            this.f35613e = 4;
            this.f35614f = false;
            this.f35615g = 0;
            this.f35616h = 0;
            this.f35617i = 0;
            this.f35618j = 15;
            this.f35619k = true;
            this.f35620l = 0;
            this.f35621m = 0;
            this.f35622n = 0;
            int i10 = f35606x;
            this.f35623o = i10;
            this.f35627s = f35605w;
            this.f35629u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f35624p != -1) {
                if (!z10) {
                    this.f35610b.setSpan(new StyleSpan(2), this.f35624p, this.f35610b.length(), 33);
                    this.f35624p = -1;
                }
            } else if (z10) {
                this.f35624p = this.f35610b.length();
            }
            if (this.f35625q != -1) {
                if (!z11) {
                    this.f35610b.setSpan(new UnderlineSpan(), this.f35625q, this.f35610b.length(), 33);
                    this.f35625q = -1;
                }
            } else if (z11) {
                this.f35625q = this.f35610b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f35626r == -1 || this.f35627s == i10)) {
                this.f35610b.setSpan(new ForegroundColorSpan(this.f35627s), this.f35626r, this.f35610b.length(), 33);
            }
            if (i10 != f35605w) {
                this.f35626r = this.f35610b.length();
                this.f35627s = i10;
            }
            if (!(this.f35628t == -1 || this.f35629u == i11)) {
                this.f35610b.setSpan(new BackgroundColorSpan(this.f35629u), this.f35628t, this.f35610b.length(), 33);
            }
            if (i11 != f35606x) {
                this.f35628t = this.f35610b.length();
                this.f35629u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f35630v != i10) {
                a(10);
            }
            this.f35630v = i10;
        }

        public void p(boolean z10) {
            this.f35612d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f35623o = i10;
            this.f35620l = i15;
        }
    }

    /* renamed from: X9.c$c  reason: collision with other inner class name */
    private static final class C0573c {

        /* renamed from: a  reason: collision with root package name */
        public final int f35631a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35632b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f35633c;

        /* renamed from: d  reason: collision with root package name */
        int f35634d = 0;

        public C0573c(int i10, int i11) {
            this.f35631a = i10;
            this.f35632b = i11;
            this.f35633c = new byte[((i11 * 2) - 1)];
        }
    }

    public c(int i10, List list) {
        boolean z10 = true;
        this.f35588k = i10 == -1 ? 1 : i10;
        this.f35587j = (list == null || !C3649e.h(list)) ? false : z10;
        this.f35589l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f35589l[i11] = new b();
        }
        this.f35590m = this.f35589l[0];
    }

    private void A() {
        int h10 = b.h(this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2));
        int h11 = b.h(this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2));
        this.f35585h.r(2);
        this.f35590m.n(h10, h11, b.g(this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2)));
    }

    private void B() {
        this.f35585h.r(4);
        int h10 = this.f35585h.h(4);
        this.f35585h.r(2);
        this.f35590m.o(h10, this.f35585h.h(6));
    }

    private void C() {
        int h10 = b.h(this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2));
        int h11 = this.f35585h.h(2);
        int g10 = b.g(this.f35585h.h(2), this.f35585h.h(2), this.f35585h.h(2));
        if (this.f35585h.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f35585h.g();
        int h12 = this.f35585h.h(2);
        int h13 = this.f35585h.h(2);
        int h14 = this.f35585h.h(2);
        this.f35585h.r(8);
        this.f35590m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void D() {
        C0573c cVar = this.f35593p;
        if (cVar.f35634d != (cVar.f35632b * 2) - 1) {
            s.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f35593p.f35632b * 2) - 1) + ", but current index is " + this.f35593p.f35634d + " (sequence number " + this.f35593p.f35631a + ");");
        }
        A a10 = this.f35585h;
        C0573c cVar2 = this.f35593p;
        a10.o(cVar2.f35633c, cVar2.f35634d);
        boolean z10 = false;
        while (true) {
            if (this.f35585h.b() <= 0) {
                break;
            }
            int h10 = this.f35585h.h(3);
            int h11 = this.f35585h.h(5);
            if (h10 == 7) {
                this.f35585h.r(2);
                h10 = this.f35585h.h(6);
                if (h10 < 7) {
                    s.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    s.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f35588k) {
                this.f35585h.s(h11);
            } else {
                int e10 = this.f35585h.e() + (h11 * 8);
                while (this.f35585h.e() < e10) {
                    int h12 = this.f35585h.h(8);
                    if (h12 == 16) {
                        int h13 = this.f35585h.h(8);
                        if (h13 <= 31) {
                            s(h13);
                        } else if (h13 <= 127) {
                            x(h13);
                        } else if (h13 <= 159) {
                            t(h13);
                        } else if (h13 <= 255) {
                            y(h13);
                        } else {
                            s.i("Cea708Decoder", "Invalid extended command: " + h13);
                        }
                    } else if (h12 <= 31) {
                        q(h12);
                    } else if (h12 <= 127) {
                        v(h12);
                    } else if (h12 <= 159) {
                        r(h12);
                    } else if (h12 <= 255) {
                        w(h12);
                    } else {
                        s.i("Cea708Decoder", "Invalid base command: " + h12);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f35591n = p();
        }
    }

    private void E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f35589l[i10].l();
        }
    }

    private void o() {
        if (this.f35593p != null) {
            D();
            this.f35593p = null;
        }
    }

    private List p() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f35589l[i10].j() && this.f35589l[i10].k() && (c10 = this.f35589l[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f35595c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f35596a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f35591n = p();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    E();
                    return;
                case 13:
                    this.f35590m.a(10);
                    return;
                case StdKeyDeserializer.TYPE_URL /*14*/:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        s.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f35585h.r(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        s.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        s.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f35585h.r(16);
                        return;
                    }
            }
        } else {
            this.f35590m.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f35585h.g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f35589l[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f35585h.g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f35589l[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f35585h.g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f35589l[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            ja.s.i(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.u(r5)
            int r0 = r4.f35594q
            if (r0 == r5) goto L_0x0117
            r4.f35594q = r5
            X9.c$b[] r0 = r4.f35589l
            r5 = r0[r5]
            r4.f35590m = r5
            goto L_0x0117
        L_0x0033:
            X9.c$b r5 = r4.f35590m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0044
            ja.A r5 = r4.f35585h
            r0 = 32
            r5.r(r0)
            goto L_0x0117
        L_0x0044:
            r4.C()
            goto L_0x0117
        L_0x0049:
            X9.c$b r5 = r4.f35590m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0058
            ja.A r5 = r4.f35585h
            r5.r(r0)
            goto L_0x0117
        L_0x0058:
            r4.B()
            goto L_0x0117
        L_0x005d:
            X9.c$b r5 = r4.f35590m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x006e
            ja.A r5 = r4.f35585h
            r0 = 24
            r5.r(r0)
            goto L_0x0117
        L_0x006e:
            r4.A()
            goto L_0x0117
        L_0x0073:
            X9.c$b r5 = r4.f35590m
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0082
            ja.A r5 = r4.f35585h
            r5.r(r0)
            goto L_0x0117
        L_0x0082:
            r4.z()
            goto L_0x0117
        L_0x0087:
            r4.E()
            goto L_0x0117
        L_0x008c:
            ja.A r5 = r4.f35585h
            r5.r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            ja.A r5 = r4.f35585h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00a6
            X9.c$b[] r5 = r4.f35589l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            ja.A r0 = r4.f35585h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00c2
            X9.c$b[] r0 = r4.f35589l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            ja.A r5 = r4.f35585h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00d9
            X9.c$b[] r5 = r4.f35589l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = r2
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            ja.A r0 = r4.f35585h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00f0
            X9.c$b[] r0 = r4.f35589l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            ja.A r5 = r4.f35585h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0106
            X9.c$b[] r5 = r4.f35589l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f35594q
            if (r0 == r5) goto L_0x0117
            r4.f35594q = r5
            X9.c$b[] r0 = r4.f35589l
            r5 = r0[r5]
            r4.f35590m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X9.c.r(int):void");
    }

    private void s(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f35585h.r(8);
            } else if (i10 <= 23) {
                this.f35585h.r(16);
            } else if (i10 <= 31) {
                this.f35585h.r(24);
            }
        }
    }

    private void t(int i10) {
        if (i10 <= 135) {
            this.f35585h.r(32);
        } else if (i10 <= 143) {
            this.f35585h.r(40);
        } else if (i10 <= 159) {
            this.f35585h.r(2);
            this.f35585h.r(this.f35585h.h(6) * 8);
        }
    }

    private void u(int i10) {
        b bVar = this.f35589l[i10];
        this.f35585h.r(2);
        boolean g10 = this.f35585h.g();
        boolean g11 = this.f35585h.g();
        boolean g12 = this.f35585h.g();
        int h10 = this.f35585h.h(3);
        boolean g13 = this.f35585h.g();
        int h11 = this.f35585h.h(7);
        int h12 = this.f35585h.h(8);
        int h13 = this.f35585h.h(4);
        int h14 = this.f35585h.h(4);
        this.f35585h.r(2);
        int h15 = this.f35585h.h(6);
        this.f35585h.r(2);
        bVar.f(g10, g11, g12, h10, g13, h11, h12, h14, h15, h13, this.f35585h.h(3), this.f35585h.h(3));
    }

    private void v(int i10) {
        if (i10 == 127) {
            this.f35590m.a(9835);
        } else {
            this.f35590m.a((char) (i10 & 255));
        }
    }

    private void w(int i10) {
        this.f35590m.a((char) (i10 & 255));
    }

    private void x(int i10) {
        if (i10 == 32) {
            this.f35590m.a(' ');
        } else if (i10 == 33) {
            this.f35590m.a(160);
        } else if (i10 == 37) {
            this.f35590m.a(8230);
        } else if (i10 == 42) {
            this.f35590m.a(352);
        } else if (i10 == 44) {
            this.f35590m.a(338);
        } else if (i10 == 63) {
            this.f35590m.a(376);
        } else if (i10 == 57) {
            this.f35590m.a(8482);
        } else if (i10 == 58) {
            this.f35590m.a(353);
        } else if (i10 == 60) {
            this.f35590m.a(339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f35590m.a(9608);
                    return;
                case 49:
                    this.f35590m.a(8216);
                    return;
                case 50:
                    this.f35590m.a(8217);
                    return;
                case 51:
                    this.f35590m.a(8220);
                    return;
                case 52:
                    this.f35590m.a(8221);
                    return;
                case 53:
                    this.f35590m.a(8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f35590m.a(8539);
                            return;
                        case 119:
                            this.f35590m.a(8540);
                            return;
                        case 120:
                            this.f35590m.a(8541);
                            return;
                        case 121:
                            this.f35590m.a(8542);
                            return;
                        case 122:
                            this.f35590m.a(9474);
                            return;
                        case 123:
                            this.f35590m.a(9488);
                            return;
                        case 124:
                            this.f35590m.a(9492);
                            return;
                        case 125:
                            this.f35590m.a(9472);
                            return;
                        case 126:
                            this.f35590m.a(9496);
                            return;
                        case 127:
                            this.f35590m.a(9484);
                            return;
                        default:
                            s.i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            this.f35590m.a(8480);
        }
    }

    private void y(int i10) {
        if (i10 == 160) {
            this.f35590m.a(13252);
            return;
        }
        s.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f35590m.a('_');
    }

    private void z() {
        this.f35590m.m(this.f35585h.h(4), this.f35585h.h(2), this.f35585h.h(2), this.f35585h.g(), this.f35585h.g(), this.f35585h.h(3), this.f35585h.h(3));
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    /* access modifiers changed from: protected */
    public h e() {
        List list = this.f35591n;
        this.f35592o = list;
        return new f((List) C3645a.e(list));
    }

    /* access modifiers changed from: protected */
    public void f(l lVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) C3645a.e(lVar.f46950c);
        this.f35584g.N(byteBuffer.array(), byteBuffer.limit());
        while (this.f35584g.a() >= 3) {
            int D10 = this.f35584g.D();
            int i10 = D10 & 3;
            boolean z11 = false;
            if ((D10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte D11 = (byte) this.f35584g.D();
            byte D12 = (byte) this.f35584g.D();
            if ((i10 == 2 || i10 == 3) && z10) {
                if (i10 == 3) {
                    o();
                    int i11 = (D11 & 192) >> 6;
                    int i12 = this.f35586i;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        E();
                        s.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f35586i + " current=" + i11);
                    }
                    this.f35586i = i11;
                    byte b10 = D11 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    C0573c cVar = new C0573c(i11, b10);
                    this.f35593p = cVar;
                    byte[] bArr = cVar.f35633c;
                    int i13 = cVar.f35634d;
                    cVar.f35634d = i13 + 1;
                    bArr[i13] = D12;
                } else {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    C3645a.a(z11);
                    C0573c cVar2 = this.f35593p;
                    if (cVar2 == null) {
                        s.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f35633c;
                        int i14 = cVar2.f35634d;
                        int i15 = i14 + 1;
                        cVar2.f35634d = i15;
                        bArr2[i14] = D11;
                        cVar2.f35634d = i14 + 2;
                        bArr2[i15] = D12;
                    }
                }
                C0573c cVar3 = this.f35593p;
                if (cVar3.f35634d == (cVar3.f35632b * 2) - 1) {
                    o();
                }
            }
        }
    }

    public void flush() {
        super.flush();
        this.f35591n = null;
        this.f35592o = null;
        this.f35594q = 0;
        this.f35590m = this.f35589l[0];
        E();
        this.f35593p = null;
    }

    public /* bridge */ /* synthetic */ l g() {
        return super.d();
    }

    public /* bridge */ /* synthetic */ m h() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public boolean k() {
        if (this.f35591n != this.f35592o) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void l(l lVar) {
        super.c(lVar);
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
