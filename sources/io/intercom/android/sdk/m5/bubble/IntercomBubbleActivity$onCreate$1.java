package io.intercom.android.sdk.m5.bubble;

import V.B0;
import Y.C1500m;
import android.content.Intent;
import g0.c;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomBubbleActivity$onCreate$1 implements p {
    final /* synthetic */ IntercomBubbleActivity this$0;

    IntercomBubbleActivity$onCreate$1(IntercomBubbleActivity intercomBubbleActivity) {
        this.this$0 = intercomBubbleActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final IntercomBubbleActivity intercomBubbleActivity = this.this$0;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-397450188, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        Intent intent = intercomBubbleActivity.getIntent();
                        C6496s.g(intent, "getIntent(...)");
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomBubbleActivity, mVar, 8);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
