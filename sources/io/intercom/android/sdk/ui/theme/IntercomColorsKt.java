package io.intercom.android.sdk.ui.theme;

import V.C1404s;
import V.r;
import Y.C1510r0;
import Y.C1521x;
import Y.I0;
import Y.o1;
import io.intercom.android.sdk.ui.theme.BaseColors;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;
import r0.C2550z0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lr0/x0;", "action", "onAction", "actionContrastWhite", "onActionContrastWhite", "header", "onHeader", "", "isLight", "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getIntercomColors-nl4AeYM", "(JJJJJJZ)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getIntercomColors", "intercomLightColors", "()Lio/intercom/android/sdk/ui/theme/IntercomColors;", "intercomDarkColors", "LV/r;", "toMaterialColors", "(Lio/intercom/android/sdk/ui/theme/IntercomColors;)LV/r;", "LY/I0;", "LocalIntercomColors", "LY/I0;", "getLocalIntercomColors", "()LY/I0;", "LY/r0;", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "currentThemeMode", "LY/r0;", "getCurrentThemeMode", "()LY/r0;", "setCurrentThemeMode", "(LY/r0;)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomColorsKt {
    private static final I0 LocalIntercomColors = C1521x.f(new a());
    private static C1510r0 currentThemeMode = u1.d(ThemeMode.LIGHT, (o1) null, 2, (Object) null);

    /* access modifiers changed from: private */
    public static final IntercomColors LocalIntercomColors$lambda$0() {
        return intercomLightColors();
    }

    public static final C1510r0 getCurrentThemeMode() {
        return currentThemeMode;
    }

    /* renamed from: getIntercomColors-nl4AeYM  reason: not valid java name */
    public static final IntercomColors m709getIntercomColorsnl4AeYM(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10) {
        if (z10) {
            return IntercomColors.m633copyWGGFGZc$default(intercomLightColors(), j10, j11, j12, j13, j14, j15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, -64, 63, (Object) null);
        }
        return IntercomColors.m633copyWGGFGZc$default(intercomDarkColors(), j10, j11, j12, j13, j14, j15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, -64, 63, (Object) null);
    }

    public static final I0 getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long r12 = baseColors.m622getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(r12, newColorScheme.m630getGray250d7_KjU(), newColorScheme.m630getGray250d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m630getGray250d7_KjU(), newColorScheme.m632getGray9000d7_KjU(), newColorScheme.m630getGray250d7_KjU(), newColorScheme.m630getGray250d7_KjU(), baseColors.m616getBlack450d7_KjU(), baseColors.m620getBlack950d7_KjU(), baseColors.m614getBlack100d7_KjU(), newColorScheme.m631getGray8500d7_KjU(), C2544x0.o(newColorScheme.m631getGray8500d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, (Object) null), baseColors.m614getBlack100d7_KjU(), C2544x0.o(newColorScheme.m630getGray250d7_KjU(), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C2544x0.o(newColorScheme.m631getGray8500d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C2550z0.d(4292993505L), C2550z0.d(4294375158L), newColorScheme.m631getGray8500d7_KjU(), C2544x0.o(C2550z0.d(4279176975L), 0.44f, 0.0f, 0.0f, 0.0f, 14, (Object) null), newColorScheme.m631getGray8500d7_KjU(), baseColors.m614getBlack100d7_KjU(), baseColors.m614getBlack100d7_KjU(), C2544x0.o(newColorScheme.m631getGray8500d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, (Object) null), baseColors.m619getBlack900d7_KjU(), baseColors.m616getBlack450d7_KjU(), newColorScheme.m630getGray250d7_KjU(), baseColors.m617getBlack700d7_KjU(), baseColors.m617getBlack700d7_KjU(), baseColors.m626getRed0d7_KjU(), baseColors.m625getOrange0d7_KjU(), baseColors.m621getBlue0d7_KjU(), baseColors.m623getGreen0d7_KjU(), baseColors.m628getYellow0d7_KjU(), baseColors.m624getGreenLighter200d7_KjU(), baseColors.m626getRed0d7_KjU(), false, (DefaultConstructorMarker) null);
    }

    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        return new IntercomColors(baseColors.m622getFallback0d7_KjU(), baseColors.m627getWhite0d7_KjU(), baseColors.m613getBlack0d7_KjU(), baseColors.m627getWhite0d7_KjU(), baseColors.m627getWhite0d7_KjU(), baseColors.m613getBlack0d7_KjU(), baseColors.m627getWhite0d7_KjU(), baseColors.m614getBlack100d7_KjU(), baseColors.m613getBlack0d7_KjU(), baseColors.m616getBlack450d7_KjU(), baseColors.m615getBlack200d7_KjU(), baseColors.m620getBlack950d7_KjU(), C2544x0.o(baseColors.m613getBlack0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C2544x0.o(baseColors.m613getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14, (Object) null), baseColors.m620getBlack950d7_KjU(), C2544x0.o(baseColors.m614getBlack100d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C2544x0.o(baseColors.m613getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null), C2550z0.d(4292993505L), C2550z0.d(4294375158L), BaseColors.NewColorScheme.INSTANCE.m629getGray1000d7_KjU(), C2544x0.o(C2550z0.d(4279176975L), 0.06f, 0.0f, 0.0f, 0.0f, 14, (Object) null), baseColors.m627getWhite0d7_KjU(), baseColors.m620getBlack950d7_KjU(), C2550z0.d(4294440951L), C2544x0.o(baseColors.m613getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14, (Object) null), baseColors.m619getBlack900d7_KjU(), baseColors.m616getBlack450d7_KjU(), baseColors.m613getBlack0d7_KjU(), baseColors.m617getBlack700d7_KjU(), baseColors.m617getBlack700d7_KjU(), baseColors.m626getRed0d7_KjU(), baseColors.m625getOrange0d7_KjU(), baseColors.m621getBlue0d7_KjU(), baseColors.m623getGreen0d7_KjU(), baseColors.m628getYellow0d7_KjU(), baseColors.m624getGreenLighter200d7_KjU(), baseColors.m626getRed0d7_KjU(), true, (DefaultConstructorMarker) null);
    }

    public static final void setCurrentThemeMode(C1510r0 r0Var) {
        C6496s.h(r0Var, "<set-?>");
        currentThemeMode = r0Var;
    }

    public static final r toMaterialColors(IntercomColors intercomColors) {
        C6496s.h(intercomColors, "<this>");
        if (intercomColors.isLight()) {
            return C1404s.j(intercomColors.m672getAction0d7_KjU(), intercomColors.m694getOnAction0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), 0, 0, intercomColors.m689getError0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5234692, 15, (Object) null);
        }
        return C1404s.e(intercomColors.m672getAction0d7_KjU(), intercomColors.m694getOnAction0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), intercomColors.m700getPrimaryText0d7_KjU(), intercomColors.m678getBackground0d7_KjU(), 0, 0, intercomColors.m689getError0d7_KjU(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -5234692, 15, (Object) null);
    }
}
