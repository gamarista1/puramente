package io.intercom.android.sdk.ui.theme;

import V.B0;
import V.Y;
import Y.C1500m;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomThemeKt$IntercomTheme$1 implements p {
    final /* synthetic */ p $content;
    final /* synthetic */ IntercomColors $intercomColors;
    final /* synthetic */ B0 $shapes;
    final /* synthetic */ IntercomTypography $typography;

    IntercomThemeKt$IntercomTheme$1(IntercomColors intercomColors, IntercomTypography intercomTypography, B0 b02, p pVar) {
        this.$intercomColors = intercomColors;
        this.$typography = intercomTypography;
        this.$shapes = b02;
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            Y.a(IntercomColorsKt.toMaterialColors(this.$intercomColors), this.$shapes, IntercomTypographyKt.toMaterialTypography(this.$typography), this.$content, mVar, 0, 0);
            return;
        }
        mVar.I();
    }
}
