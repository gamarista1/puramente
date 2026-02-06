package io.intercom.android.sdk.m5.home.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
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
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeTicketLinksData;", "ticketLinksData", "Lkotlin/Function1;", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "Llf/M;", "onTicketLinkClicked", "TicketLinksCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeTicketLinksData;Lyf/l;LY/m;I)V", "ExternalLinkCardPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketLinksCardKt {
    @IntercomPreviews
    private static final void ExternalLinkCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1962060809);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketLinksCardKt.INSTANCE.m379getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ExternalLinkCardPreview$lambda$1(int i10, C1500m mVar, int i11) {
        ExternalLinkCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TicketLinksCard(HomeCards.HomeTicketLinksData homeTicketLinksData, C6798l lVar, C1500m mVar, int i10) {
        C6496s.h(homeTicketLinksData, "ticketLinksData");
        C6496s.h(lVar, "onTicketLinkClicked");
        C1500m h10 = mVar.h(-1931742368);
        IntercomCardKt.IntercomCard((i) null, (IntercomCardStyle.Style) null, c.e(1008312684, true, new TicketLinksCardKt$TicketLinksCard$1(homeTicketLinksData, lVar), h10, 54), h10, 384, 3);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(homeTicketLinksData, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketLinksCard$lambda$0(HomeCards.HomeTicketLinksData homeTicketLinksData, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(homeTicketLinksData, "$ticketLinksData");
        C6496s.h(lVar, "$onTicketLinkClicked");
        TicketLinksCard(homeTicketLinksData, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
