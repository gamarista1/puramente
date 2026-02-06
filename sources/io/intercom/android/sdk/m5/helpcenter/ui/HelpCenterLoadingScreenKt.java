package io.intercom.android.sdk.m5.helpcenter.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import com.facebook.shimmer.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "HelpCenterLoadingScreen", "(Lk0/i;LY/m;II)V", "HomeLoadingContentPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterLoadingScreenKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HelpCenterLoadingScreen(k0.i r7, Y.C1500m r8, int r9, int r10) {
        /*
            r0 = 581033983(0x22a1dfff, float:4.3876303E-18)
            Y.m r8 = r8.h(r0)
            r0 = r10 & 1
            r1 = 2
            if (r0 == 0) goto L_0x000f
            r2 = r9 | 6
            goto L_0x001f
        L_0x000f:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x001e
            boolean r2 = r8.S(r7)
            if (r2 == 0) goto L_0x001b
            r2 = 4
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            r2 = r2 | r9
            goto L_0x001f
        L_0x001e:
            r2 = r9
        L_0x001f:
            r2 = r2 & 11
            if (r2 != r1) goto L_0x002e
            boolean r1 = r8.i()
            if (r1 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            r8.I()
            goto L_0x0072
        L_0x002e:
            if (r0 == 0) goto L_0x0032
            k0.i$a r7 = k0.i.f23074a
        L_0x0032:
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r8, r1)
            long r0 = r0.m700getPrimaryText0d7_KjU()
            r2 = 0
            r3 = 0
            r4 = 1
            k0.i r2 = androidx.compose.foundation.layout.q.f(r7, r2, r4, r3)
            r3 = 1093772715(0x4131a5ab, float:11.102946)
            r8.T(r3)
            boolean r3 = r8.e(r0)
            java.lang.Object r4 = r8.A()
            if (r3 != 0) goto L_0x005d
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0065
        L_0x005d:
            io.intercom.android.sdk.m5.helpcenter.ui.m r4 = new io.intercom.android.sdk.m5.helpcenter.ui.m
            r4.<init>(r0)
            r8.r(r4)
        L_0x0065:
            r1 = r4
            yf.l r1 = (yf.C6798l) r1
            r8.M()
            r5 = 0
            r6 = 4
            r3 = 0
            r4 = r8
            androidx.compose.ui.viewinterop.e.a(r1, r2, r3, r4, r5, r6)
        L_0x0072:
            Y.Y0 r8 = r8.k()
            if (r8 == 0) goto L_0x0080
            io.intercom.android.sdk.m5.helpcenter.ui.n r0 = new io.intercom.android.sdk.m5.helpcenter.ui.n
            r0.<init>(r7, r9, r10)
            r8.a(r0)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final d HelpCenterLoadingScreen$lambda$2$lambda$1(long j10, Context context) {
        C6496s.h(context, "context");
        d buildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        buildLoadingContainer.addView(LoadingComponentKt.m466buildLoadingContentbw27NRU(context, j10, R.drawable.intercom_help_center_loading_state));
        return buildLoadingContainer;
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterLoadingScreen$lambda$3(i iVar, int i10, int i11, C1500m mVar, int i12) {
        HelpCenterLoadingScreen(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void HomeLoadingContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-192893266);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m341getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeLoadingContentPreview$lambda$4(int i10, C1500m mVar, int i11) {
        HomeLoadingContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
