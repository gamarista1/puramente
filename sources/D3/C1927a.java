package d3;

import W2.e;
import W2.s;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.collect.C4770v;
import h2.C2030a;
import i2.C2073A;
import i2.C2076a;
import i2.C2082g;
import i2.L;
import i2.p;
import java.nio.charset.Charset;
import java.util.List;
import nb.C5110e;

/* renamed from: d3.a  reason: case insensitive filesystem */
public final class C1927a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f19462a = new C2073A();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19463b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19464c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19465d;

    /* renamed from: e  reason: collision with root package name */
    private final String f19466e;

    /* renamed from: f  reason: collision with root package name */
    private final float f19467f;

    /* renamed from: g  reason: collision with root package name */
    private final int f19468g;

    public C1927a(List list) {
        String str = "sans-serif";
        boolean z10 = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f19464c = bArr[24];
            this.f19465d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f19466e = "Serif".equals(L.H(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f19468g = i10;
            z10 = (bArr[0] & 32) != 0 ? true : z10;
            this.f19463b = z10;
            if (z10) {
                this.f19467f = L.n(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f19467f = 0.85f;
            }
        } else {
            this.f19464c = 0;
            this.f19465d = -1;
            this.f19466e = str;
            this.f19463b = false;
            this.f19467f = 0.85f;
            this.f19468g = -1;
        }
    }

    private void d(C2073A a10, SpannableStringBuilder spannableStringBuilder) {
        boolean z10;
        if (a10.a() >= 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        int N10 = a10.N();
        int N11 = a10.N();
        a10.V(2);
        int H10 = a10.H();
        a10.V(1);
        int q10 = a10.q();
        if (N11 > spannableStringBuilder.length()) {
            p.h("Tx3gParser", "Truncating styl end (" + N11 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            N11 = spannableStringBuilder.length();
        }
        if (N10 >= N11) {
            p.h("Tx3gParser", "Ignoring styl with start (" + N10 + ") >= end (" + N11 + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i10 = N10;
        int i11 = N11;
        f(spannableStringBuilder2, H10, this.f19464c, i10, i11, 0);
        e(spannableStringBuilder2, q10, this.f19465d, i10, i11, 0);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
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

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String h(C2073A a10) {
        boolean z10;
        if (a10.a() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        int N10 = a10.N();
        if (N10 == 0) {
            return "";
        }
        int f10 = a10.f();
        Charset P10 = a10.P();
        int f11 = N10 - (a10.f() - f10);
        if (P10 == null) {
            P10 = C5110e.f61085c;
        }
        return a10.F(f11, P10);
    }

    public void a(byte[] bArr, int i10, int i11, s.b bVar, C2082g gVar) {
        int i12 = i10;
        C2082g gVar2 = gVar;
        this.f19462a.S(bArr, i12 + i11);
        this.f19462a.U(i12);
        String h10 = h(this.f19462a);
        if (h10.isEmpty()) {
            gVar2.accept(new e(C4770v.E(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(h10);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        f(spannableStringBuilder2, this.f19464c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder2, this.f19465d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f19466e, 0, spannableStringBuilder.length());
        float f10 = this.f19467f;
        while (this.f19462a.a() >= 8) {
            int f11 = this.f19462a.f();
            int q10 = this.f19462a.q();
            int q11 = this.f19462a.q();
            boolean z10 = true;
            if (q11 == 1937013100) {
                if (this.f19462a.a() < 2) {
                    z10 = false;
                }
                C2076a.a(z10);
                int N10 = this.f19462a.N();
                for (int i13 = 0; i13 < N10; i13++) {
                    d(this.f19462a, spannableStringBuilder);
                }
            } else if (q11 == 1952608120 && this.f19463b) {
                if (this.f19462a.a() < 2) {
                    z10 = false;
                }
                C2076a.a(z10);
                f10 = L.n(((float) this.f19462a.N()) / ((float) this.f19468g), 0.0f, 0.95f);
            }
            this.f19462a.U(f11 + q10);
        }
        gVar2.accept(new e(C4770v.H(new C2030a.b().o(spannableStringBuilder).h(f10, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }
}
