package io.intercom.android.sdk.m5;

import Y.C1500m;
import Y.M0;
import io.intercom.android.sdk.identity.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lkotlin/Function0;", "Llf/M;", "content", "ConfigurableIntercomTheme", "(Lio/intercom/android/sdk/identity/AppConfig;Lyf/p;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfigurableIntercomThemeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        if (x.C2874m.a(r10, 0) == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConfigurableIntercomTheme(io.intercom.android.sdk.identity.AppConfig r24, yf.p r25, Y.C1500m r26, int r27) {
        /*
            r0 = r24
            r8 = r25
            r9 = r27
            java.lang.String r1 = "appConfig"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            java.lang.String r1 = "content"
            kotlin.jvm.internal.C6496s.h(r8, r1)
            r1 = 180143044(0xabcc3c4, float:1.817738E-32)
            r2 = r26
            Y.m r10 = r2.h(r1)
            io.intercom.android.sdk.models.ConfigModules r1 = r24.getConfigModules()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            io.intercom.android.sdk.models.CustomizationModel r1 = r1.getCustomization()
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            r3 = -1126609231(0xffffffffbcd94eb1, float:-0.02652678)
            r10.T(r3)
            if (r1 != 0) goto L_0x0030
            goto L_0x00d2
        L_0x0030:
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getAction()
            java.lang.String r3 = r3.getBackgroundColor()
            r4 = 0
            r5 = 1
            long r11 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getAction()
            java.lang.String r3 = r3.getForegroundColor()
            long r13 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getActionContrastWhite()
            if (r3 == 0) goto L_0x005c
            java.lang.String r3 = r3.getBackgroundColor()
            if (r3 == 0) goto L_0x005c
            long r6 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
        L_0x005a:
            r15 = r6
            goto L_0x0069
        L_0x005c:
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getAction()
            java.lang.String r3 = r3.getBackgroundColor()
            long r6 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
            goto L_0x005a
        L_0x0069:
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getActionContrastWhite()
            if (r3 == 0) goto L_0x007c
            java.lang.String r3 = r3.getForegroundColor()
            if (r3 == 0) goto L_0x007c
            long r6 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
        L_0x0079:
            r17 = r6
            goto L_0x0089
        L_0x007c:
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getAction()
            java.lang.String r3 = r3.getForegroundColor()
            long r6 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
            goto L_0x0079
        L_0x0089:
            io.intercom.android.sdk.models.CustomizationColorsModel r3 = r1.getHeader()
            java.lang.String r3 = r3.getBackgroundColor()
            long r19 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r3, r4, r5, r2)
            io.intercom.android.sdk.models.CustomizationColorsModel r1 = r1.getHeader()
            java.lang.String r1 = r1.getForegroundColor()
            long r21 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r1, r4, r5, r2)
            Y.r0 r1 = io.intercom.android.sdk.ui.theme.IntercomColorsKt.getCurrentThemeMode()
            java.lang.Object r1 = r1.getValue()
            io.intercom.android.sdk.ui.theme.ThemeMode r1 = (io.intercom.android.sdk.ui.theme.ThemeMode) r1
            r2 = -1126588943(0xffffffffbcd99df1, float:-0.02656457)
            r10.T(r2)
            io.intercom.android.sdk.ui.theme.ThemeMode r2 = io.intercom.android.sdk.ui.theme.ThemeMode.DARK
            r3 = 0
            if (r1 != r2) goto L_0x00b9
        L_0x00b6:
            r23 = r3
            goto L_0x00cb
        L_0x00b9:
            io.intercom.android.sdk.ui.theme.ThemeMode r2 = io.intercom.android.sdk.ui.theme.ThemeMode.LIGHT
            if (r1 != r2) goto L_0x00c0
        L_0x00bd:
            r23 = r5
            goto L_0x00cb
        L_0x00c0:
            io.intercom.android.sdk.ui.theme.ThemeMode r2 = io.intercom.android.sdk.ui.theme.ThemeMode.SYSTEM
            if (r1 != r2) goto L_0x0106
            boolean r1 = x.C2874m.a(r10, r3)
            if (r1 != 0) goto L_0x00b6
            goto L_0x00bd
        L_0x00cb:
            r10.M()
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = io.intercom.android.sdk.ui.theme.IntercomColorsKt.m709getIntercomColorsnl4AeYM(r11, r13, r15, r17, r19, r21, r23)
        L_0x00d2:
            r10.M()
            r1 = -1126610447(0xffffffffbcd949f1, float:-0.026524516)
            r10.T(r1)
            if (r2 != 0) goto L_0x00e6
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r10, r2)
            goto L_0x00e7
        L_0x00e6:
            r1 = r2
        L_0x00e7:
            r10.M()
            int r2 = r9 << 6
            r6 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = 6
            r2 = 0
            r3 = 0
            r4 = r25
            r5 = r10
            io.intercom.android.sdk.ui.theme.IntercomThemeKt.IntercomTheme(r1, r2, r3, r4, r5, r6, r7)
            Y.Y0 r1 = r10.k()
            if (r1 == 0) goto L_0x0105
            io.intercom.android.sdk.m5.a r2 = new io.intercom.android.sdk.m5.a
            r2.<init>(r0, r8, r9)
            r1.a(r2)
        L_0x0105:
            return
        L_0x0106:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(io.intercom.android.sdk.identity.AppConfig, yf.p, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConfigurableIntercomTheme$lambda$1(AppConfig appConfig, p pVar, int i10, C1500m mVar, int i11) {
        C6496s.h(appConfig, "$appConfig");
        C6496s.h(pVar, "$content");
        ConfigurableIntercomTheme(appConfig, pVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
