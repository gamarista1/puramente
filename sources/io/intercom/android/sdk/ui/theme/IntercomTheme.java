package io.intercom.android.sdk.ui.theme;

import V.B0;
import Y.C1500m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomTheme;", "", "<init>", "()V", "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getColors", "(LY/m;I)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "colors", "Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "getTypography", "(LY/m;I)Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "typography", "LV/B0;", "getShapes", "(LY/m;I)LV/B0;", "shapes", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomTheme {
    public static final int $stable = 0;
    public static final IntercomTheme INSTANCE = new IntercomTheme();

    private IntercomTheme() {
    }

    public final IntercomColors getColors(C1500m mVar, int i10) {
        mVar.T(159743073);
        IntercomColors intercomColors = (IntercomColors) mVar.m(IntercomColorsKt.getLocalIntercomColors());
        mVar.M();
        return intercomColors;
    }

    public final B0 getShapes(C1500m mVar, int i10) {
        mVar.T(-474718694);
        B0 b02 = (B0) mVar.m(IntercomThemeKt.getLocalShapes());
        mVar.M();
        return b02;
    }

    public final IntercomTypography getTypography(C1500m mVar, int i10) {
        mVar.T(-989585502);
        IntercomTypography intercomTypography = (IntercomTypography) mVar.m(IntercomTypographyKt.getLocalIntercomTypography());
        mVar.M();
        return intercomTypography;
    }
}
