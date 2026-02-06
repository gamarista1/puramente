package R0;

import T0.h;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public abstract class n0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f5582a = new k0();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final long f5583b = a(0, 0);

    public static final long a(int i10, int i11) {
        return o0.a((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    /* access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(l0 l0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, h[] hVarArr) {
        boolean z10;
        h[] hVarArr2 = hVarArr;
        int m10 = l0Var.m() - 1;
        if (l0Var.i().getLineStart(m10) != l0Var.i().getLineEnd(m10) || hVarArr2 == null || hVarArr2.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("​");
        h hVar = (h) C6559l.b0(hVarArr);
        int length = spannableString.length();
        if (m10 == 0 || !hVar.e()) {
            z10 = hVar.e();
        } else {
            z10 = false;
        }
        spannableString.setSpan(hVar.b(0, length, z10), 0, spannableString.length(), 33);
        StaticLayout b10 = g0.b(g0.f5532a, spannableString, textPaint, a.e.API_PRIORITY_OTHER, 0, spannableString.length(), textDirectionHeuristic, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, l0Var.h(), l0Var.e(), 0, 0, 0, 0, (int[]) null, (int[]) null, 2072512, (Object) null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = b10.getLineAscent(0);
        fontMetricsInt.descent = b10.getLineDescent(0);
        fontMetricsInt.top = b10.getLineTop(0);
        fontMetricsInt.bottom = b10.getLineBottom(0);
        return fontMetricsInt;
    }

    /* access modifiers changed from: private */
    public static final long i(h[] hVarArr) {
        int i10 = 0;
        int i11 = 0;
        for (h hVar : hVarArr) {
            if (hVar.c() < 0) {
                i10 = Math.max(i10, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                i11 = Math.max(i10, Math.abs(hVar.d()));
            }
        }
        if (i10 == 0 && i11 == 0) {
            return f5583b;
        }
        return a(i10, i11);
    }

    /* access modifiers changed from: private */
    public static final h[] j(l0 l0Var) {
        if (!(l0Var.G() instanceof Spanned)) {
            return null;
        }
        CharSequence G10 = l0Var.G();
        C6496s.f(G10, "null cannot be cast to non-null type android.text.Spanned");
        Class<h> cls = h.class;
        if (!T.a((Spanned) G10, cls) && l0Var.G().length() > 0) {
            return null;
        }
        CharSequence G11 = l0Var.G();
        C6496s.f(G11, "null cannot be cast to non-null type android.text.Spanned");
        return (h[]) ((Spanned) G11).getSpans(0, l0Var.G().length(), cls);
    }

    public static final TextDirectionHeuristic k(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i10 == 4) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (i10 != 5) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return TextDirectionHeuristics.LOCALE;
    }

    /* access modifiers changed from: private */
    public static final long l(l0 l0Var) {
        int i10;
        int i11;
        if (l0Var.h() || l0Var.J()) {
            return f5583b;
        }
        TextPaint paint = l0Var.i().getPaint();
        CharSequence text = l0Var.i().getText();
        Rect c10 = S.c(paint, text, l0Var.i().getLineStart(0), l0Var.i().getLineEnd(0));
        int lineAscent = l0Var.i().getLineAscent(0);
        int i12 = c10.top;
        if (i12 < lineAscent) {
            i10 = lineAscent - i12;
        } else {
            i10 = l0Var.i().getTopPadding();
        }
        if (l0Var.m() != 1) {
            int m10 = l0Var.m() - 1;
            c10 = S.c(paint, text, l0Var.i().getLineStart(m10), l0Var.i().getLineEnd(m10));
        }
        int lineDescent = l0Var.i().getLineDescent(l0Var.m() - 1);
        int i13 = c10.bottom;
        if (i13 > lineDescent) {
            i11 = i13 - lineDescent;
        } else {
            i11 = l0Var.i().getBottomPadding();
        }
        if (i10 == 0 && i11 == 0) {
            return f5583b;
        }
        return a(i10, i11);
    }

    public static final boolean m(Layout layout, int i10) {
        if (layout.getEllipsisCount(i10) > 0) {
            return true;
        }
        return false;
    }
}
