package R0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: R0.j  reason: case insensitive filesystem */
final class C1353j {

    /* renamed from: a  reason: collision with root package name */
    public static final C1353j f5556a = new C1353j();

    private C1353j() {
    }

    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f10, float f11, BoringLayout.Metrics metrics, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        return C1352i.a(charSequence, textPaint, i10, alignment, f10, f11, metrics, z10, truncateAt, i11, z11);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, (BoringLayout.Metrics) null);
    }

    public static final boolean c(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
