package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeSpacesData;", "homeSpacesData", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/home/data/SpaceItemType;", "Llf/M;", "onItemClick", "SpacesCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeSpacesData;Lyf/l;LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpacesCardKt {
    public static final void SpacesCard(HomeCards.HomeSpacesData homeSpacesData, C6798l lVar, C1500m mVar, int i10) {
        C6496s.h(homeSpacesData, "homeSpacesData");
        C6496s.h(lVar, "onItemClick");
        C1500m h10 = mVar.h(-261271608);
        IntercomCardKt.IntercomCard((i) null, (IntercomCardStyle.Style) null, c.e(1212336956, true, new SpacesCardKt$SpacesCard$1(homeSpacesData, lVar), h10, 54), h10, 384, 3);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(homeSpacesData, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SpacesCard$lambda$0(HomeCards.HomeSpacesData homeSpacesData, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(homeSpacesData, "$homeSpacesData");
        C6496s.h(lVar, "$onItemClick");
        SpacesCard(homeSpacesData, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
