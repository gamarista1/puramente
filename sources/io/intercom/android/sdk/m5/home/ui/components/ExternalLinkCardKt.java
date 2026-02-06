package io.intercom.android.sdk.m5.home.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.c;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeExternalLinkData;", "homeExternalLinkData", "Llf/M;", "ExternalLinkCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeExternalLinkData;LY/m;I)V", "ExternalLinkCardPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExternalLinkCardKt {
    public static final void ExternalLinkCard(HomeCards.HomeExternalLinkData homeExternalLinkData, C1500m mVar, int i10) {
        C6496s.h(homeExternalLinkData, "homeExternalLinkData");
        C1500m h10 = mVar.h(-1463768637);
        IntercomCardKt.IntercomCard((i) null, (IntercomCardStyle.Style) null, c.e(1810723127, true, new ExternalLinkCardKt$ExternalLinkCard$1(homeExternalLinkData, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, 54), h10, 384, 3);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(homeExternalLinkData, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData homeExternalLinkData, int i10, C1500m mVar, int i11) {
        C6496s.h(homeExternalLinkData, "$homeExternalLinkData");
        ExternalLinkCard(homeExternalLinkData, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ExternalLinkCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-144974605);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ExternalLinkCardKt.INSTANCE.m372getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExternalLinkCardPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ExternalLinkCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
