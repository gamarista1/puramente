package io.intercom.android.sdk.ui.theme;

import I.a;
import V.A;
import V.B0;
import Y.C1500m;
import Y.C1521x;
import Y.I0;
import Y.J0;
import Y.M0;
import Y.Y0;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import r0.C2544x0;
import x.C2874m;
import yf.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomColors;", "colors", "Lio/intercom/android/sdk/ui/theme/IntercomTypography;", "typography", "LV/B0;", "shapes", "Lkotlin/Function0;", "Llf/M;", "content", "IntercomTheme", "(Lio/intercom/android/sdk/ui/theme/IntercomColors;Lio/intercom/android/sdk/ui/theme/IntercomTypography;LV/B0;Lyf/p;LY/m;II)V", "", "isDarkThemeInEditMode", "(LY/m;I)Z", "LY/I0;", "LocalShapes", "LY/I0;", "getLocalShapes", "()LY/I0;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomThemeKt {
    private static final I0 LocalShapes = C1521x.f(new b());

    public static final void IntercomTheme(IntercomColors intercomColors, IntercomTypography intercomTypography, B0 b02, p pVar, C1500m mVar, int i10, int i11) {
        int i12;
        IntercomTypography intercomTypography2;
        B0 b03;
        IntercomTypography intercomTypography3;
        IntercomColors intercomColors2;
        IntercomColors intercomColors3;
        IntercomColors intercomColors4;
        int i13;
        int i14;
        int i15;
        p pVar2 = pVar;
        int i16 = i10;
        C6496s.h(pVar2, "content");
        C1500m h10 = mVar.h(163228735);
        if ((i16 & 112) == 0) {
            if ((i11 & 2) == 0) {
                intercomTypography2 = intercomTypography;
                if (h10.S(intercomTypography)) {
                    i15 = 32;
                    i12 = i15 | i16;
                }
            } else {
                intercomTypography2 = intercomTypography;
            }
            i15 = 16;
            i12 = i15 | i16;
        } else {
            intercomTypography2 = intercomTypography;
            i12 = i16;
        }
        if ((i16 & 896) == 0) {
            if ((i11 & 4) == 0) {
                b03 = b02;
                if (h10.S(b02)) {
                    i14 = 256;
                    i12 |= i14;
                }
            } else {
                b03 = b02;
            }
            i14 = 128;
            i12 |= i14;
        } else {
            b03 = b02;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i16 & 7168) == 0) {
            if (h10.C(pVar2)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5841) != 1168 || !h10.i()) {
            h10.D();
            if ((i16 & 1) == 0 || h10.L()) {
                if ((i11 & 1) != 0) {
                    intercomColors3 = IntercomTheme.INSTANCE.getColors(h10, 6);
                } else {
                    intercomColors3 = intercomColors;
                }
                if ((i11 & 2) != 0) {
                    intercomTypography2 = IntercomTheme.INSTANCE.getTypography(h10, 6);
                }
                if ((i11 & 4) != 0) {
                    b03 = IntercomTheme.INSTANCE.getShapes(h10, 6);
                }
            } else {
                h10.I();
                intercomColors3 = intercomColors;
            }
            h10.v();
            h10.T(-541038063);
            if (isDarkThemeInEditMode(h10, 0)) {
                intercomColors4 = IntercomColorsKt.intercomDarkColors();
            } else {
                ThemeMode themeMode = (ThemeMode) IntercomColorsKt.getCurrentThemeMode().getValue();
                if (themeMode == ThemeMode.DARK) {
                    intercomColors4 = IntercomColorsKt.intercomDarkColors();
                } else if (themeMode == ThemeMode.LIGHT) {
                    intercomColors4 = IntercomColorsKt.intercomLightColors();
                } else if (themeMode != ThemeMode.SYSTEM) {
                    throw new C6535s();
                } else if (C2874m.a(h10, 0)) {
                    intercomColors4 = IntercomColorsKt.intercomDarkColors();
                } else {
                    intercomColors4 = IntercomColorsKt.intercomLightColors();
                }
            }
            h10.M();
            C1521x.b(new J0[]{IntercomColorsKt.getLocalIntercomColors().d(intercomColors4), IntercomTypographyKt.getLocalIntercomTypography().d(intercomTypography2), A.a().d(C2544x0.k(intercomColors4.m700getPrimaryText0d7_KjU()))}, c.e(1689661311, true, new IntercomThemeKt$IntercomTheme$1(intercomColors4, intercomTypography2, b03, pVar2), h10, 54), h10, J0.f9784i | 48);
            IntercomColors intercomColors5 = intercomColors3;
            intercomTypography3 = intercomTypography2;
            intercomColors2 = intercomColors5;
        } else {
            h10.I();
            intercomTypography3 = intercomTypography2;
            intercomColors2 = intercomColors;
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(intercomColors2, intercomTypography3, b03, pVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTheme$lambda$0(IntercomColors intercomColors, IntercomTypography intercomTypography, B0 b02, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(pVar, "$content");
        IntercomTheme(intercomColors, intercomTypography, b02, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final B0 LocalShapes$lambda$1() {
        return new B0((a) null, (a) null, (a) null, (a) null, (a) null, 31, (DefaultConstructorMarker) null);
    }

    public static final I0 getLocalShapes() {
        return LocalShapes;
    }

    private static final boolean isDarkThemeInEditMode(C1500m mVar, int i10) {
        mVar.T(-320047698);
        boolean z10 = false;
        if (C2874m.a(mVar, 0) && ((View) mVar.m(AndroidCompositionLocals_androidKt.k())).isInEditMode()) {
            z10 = true;
        }
        mVar.M();
        return z10;
    }
}
