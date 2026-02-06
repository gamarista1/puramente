package ea;

import W9.b;
import W9.g;
import W9.h;
import W9.j;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import ja.B;
import ja.M;
import ja.s;
import java.util.List;
import nb.C5110e;

public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final B f43375o = new B();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f43376p;

    /* renamed from: q  reason: collision with root package name */
    private final int f43377q;

    /* renamed from: r  reason: collision with root package name */
    private final int f43378r;

    /* renamed from: s  reason: collision with root package name */
    private final String f43379s;

    /* renamed from: t  reason: collision with root package name */
    private final float f43380t;

    /* renamed from: u  reason: collision with root package name */
    private final int f43381u;

    public a(List list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z10 = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f43377q = bArr[24];
            this.f43378r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f43379s = "Serif".equals(M.E(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f43381u = i10;
            z10 = (bArr[0] & 32) != 0 ? true : z10;
            this.f43376p = z10;
            if (z10) {
                this.f43380t = M.p(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f43380t = 0.85f;
            }
        } else {
            this.f43377q = 0;
            this.f43378r = -1;
            this.f43379s = str;
            this.f43376p = false;
            this.f43380t = 0.85f;
            this.f43381u = -1;
        }
    }

    private void B(B b10, SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        if (b10.a() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        C(z10);
        int J10 = b10.J();
        int J11 = b10.J();
        b10.Q(2);
        int D10 = b10.D();
        b10.Q(1);
        int n10 = b10.n();
        if (J11 > spannableStringBuilder.length()) {
            s.i("Tx3gDecoder", "Truncating styl end (" + J11 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            J11 = spannableStringBuilder.length();
        }
        if (J10 >= J11) {
            s.i("Tx3gDecoder", "Ignoring styl with start (" + J10 + ") >= end (" + J11 + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i10 = J10;
        int i11 = J11;
        E(spannableStringBuilder2, D10, this.f43377q, i10, i11, 0);
        D(spannableStringBuilder2, n10, this.f43378r, i10, i11, 0);
    }

    private static void C(boolean z10) {
        if (!z10) {
            throw new j("Unexpected subtitle format.");
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void F(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String G(B b10) {
        boolean z10;
        char g10;
        if (b10.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C(z10);
        int J10 = b10.J();
        if (J10 == 0) {
            return "";
        }
        if (b10.a() < 2 || ((g10 = b10.g()) != 65279 && g10 != 65534)) {
            return b10.B(J10, C5110e.f61085c);
        }
        return b10.B(J10, C5110e.f61088f);
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        this.f43375o.N(bArr, i10);
        String G10 = G(this.f43375o);
        if (G10.isEmpty()) {
            return b.f43382b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G10);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        E(spannableStringBuilder2, this.f43377q, 0, 0, spannableStringBuilder.length(), 16711680);
        D(spannableStringBuilder2, this.f43378r, -1, 0, spannableStringBuilder.length(), 16711680);
        F(spannableStringBuilder, this.f43379s, 0, spannableStringBuilder.length());
        float f10 = this.f43380t;
        while (this.f43375o.a() >= 8) {
            int e10 = this.f43375o.e();
            int n10 = this.f43375o.n();
            int n11 = this.f43375o.n();
            boolean z11 = true;
            if (n11 == 1937013100) {
                if (this.f43375o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                int J10 = this.f43375o.J();
                for (int i11 = 0; i11 < J10; i11++) {
                    B(this.f43375o, spannableStringBuilder);
                }
            } else if (n11 == 1952608120 && this.f43376p) {
                if (this.f43375o.a() < 2) {
                    z11 = false;
                }
                C(z11);
                f10 = M.p(((float) this.f43375o.J()) / ((float) this.f43381u), 0.0f, 0.95f);
            }
            this.f43375o.P(e10 + n10);
        }
        return new b(new b.C0565b().o(spannableStringBuilder).h(f10, 0).i(0).a());
    }
}
