package io.intercom.android.sdk.m5.components;

import Y.C1500m;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$HomeItemKt$lambda-4$1  reason: invalid class name */
final class ComposableSingletons$HomeItemKt$lambda4$1 implements p {
    public static final ComposableSingletons$HomeItemKt$lambda4$1 INSTANCE = new ComposableSingletons$HomeItemKt$lambda4$1();

    ComposableSingletons$HomeItemKt$lambda4$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            HomeItemKt.HomeItem((i) null, Integer.valueOf(R.drawable.intercom_messages_icon), (p) null, (i) null, (Integer) null, "Messages", (String) null, new HomeItemBadge.IndicatorWithCount(3), (C6787a) null, mVar, 196608, 349);
        } else {
            mVar.I();
        }
    }
}
