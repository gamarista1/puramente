package R0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f5532a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private static final h0 f5533b = new U();

    /* renamed from: c  reason: collision with root package name */
    public static final int f5534c = 8;

    private g0() {
    }

    public static /* synthetic */ StaticLayout b(g0 g0Var, CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2, int i20, Object obj) {
        int i21 = i20;
        return g0Var.a(charSequence, textPaint, i10, (i21 & 8) != 0 ? 0 : i11, (i21 & 16) != 0 ? charSequence.length() : i12, (i21 & 32) != 0 ? J.f5506a.b() : textDirectionHeuristic, (i21 & 64) != 0 ? J.f5506a.a() : alignment, (i21 & 128) != 0 ? Integer.MAX_VALUE : i13, (i21 & 256) != 0 ? null : truncateAt, (i21 & 512) != 0 ? i10 : i14, (i21 & 1024) != 0 ? 1.0f : f10, (i21 & 2048) != 0 ? 0.0f : f11, (i21 & 4096) != 0 ? 0 : i15, (i21 & 8192) != 0 ? false : z10, (i21 & 16384) != 0 ? true : z11, (32768 & i21) != 0 ? 0 : i16, (65536 & i21) != 0 ? 0 : i17, (131072 & i21) != 0 ? 0 : i18, (262144 & i21) != 0 ? 0 : i19, (524288 & i21) != 0 ? null : iArr, (i21 & 1048576) != 0 ? null : iArr2);
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i10, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        CharSequence charSequence2 = charSequence;
        h0 h0Var = f5533b;
        i0 i0Var = r0;
        CharSequence charSequence3 = charSequence;
        i0 i0Var2 = new i0(charSequence3, i11, i12, textPaint, i10, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, i18, i19, iArr, iArr2);
        return h0Var.a(i0Var);
    }

    public final boolean c(StaticLayout staticLayout, boolean z10) {
        return f5533b.b(staticLayout, z10);
    }
}
