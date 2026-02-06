package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$SearchBrowseCardKt$lambda-2$1  reason: invalid class name */
final class ComposableSingletons$SearchBrowseCardKt$lambda2$1 implements p {
    public static final ComposableSingletons$SearchBrowseCardKt$lambda2$1 INSTANCE = new ComposableSingletons$SearchBrowseCardKt$lambda2$1();

    ComposableSingletons$SearchBrowseCardKt$lambda2$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            HomeCards.HomeHelpCenterData homeHelpCenterData = new HomeCards.HomeHelpCenterData("Help Center", HomeCardType.HELP_CENTER, C6565s.n());
            Avatar create = Avatar.create("", "VR");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "PR");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "SK");
            C6496s.g(create3, "create(...)");
            List q10 = C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null));
            MetricTracker metricTracker = Injector.get().getMetricTracker();
            C6496s.g(metricTracker, "getMetricTracker(...)");
            SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, true, q10, true, metricTracker, mVar, 36408);
            return;
        }
        mVar.I();
    }
}
