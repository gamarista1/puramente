package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.Link;
import kotlin.Metadata;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$ExternalLinkCardKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$ExternalLinkCardKt$lambda1$1 implements p {
    public static final ComposableSingletons$ExternalLinkCardKt$lambda1$1 INSTANCE = new ComposableSingletons$ExternalLinkCardKt$lambda1$1();

    ComposableSingletons$ExternalLinkCardKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            ExternalLinkCardKt.ExternalLinkCard(new HomeCards.HomeExternalLinkData("External Links", HomeCardType.EXTERNAL_LINKS, C6565s.q(new Link("Ask the community", "https://stackoverflow.com/"), new Link("Knowledge base", "https://stackoverflow.com/"))), mVar, 8);
            return;
        }
        mVar.I();
    }
}
