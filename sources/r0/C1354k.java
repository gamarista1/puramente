package R0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: R0.k  reason: case insensitive filesystem */
public final class C1354k {

    /* renamed from: a  reason: collision with root package name */
    public static final C1354k f5560a = new C1354k();

    private C1354k() {
    }

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, boolean z11, TextUtils.TruncateAt truncateAt, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("negative width");
        } else if (i11 < 0) {
            throw new IllegalArgumentException("negative ellipsized width");
        } else if (Build.VERSION.SDK_INT >= 33) {
            return C1353j.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, z11, truncateAt, i11);
        } else {
            return C1355l.a(charSequence, textPaint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
        }
    }

    public final boolean b(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C1353j.c(boringLayout);
        }
        return false;
    }

    public final BoringLayout.Metrics c(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C1353j.b(charSequence, textPaint, textDirectionHeuristic);
        }
        return C1355l.b(charSequence, textPaint, textDirectionHeuristic);
    }
}
