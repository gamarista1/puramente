package io.intercom.android.sdk.m5;

import Y.C1500m;
import android.content.Intent;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomRootActivity$onCreate$1 implements p {
    final /* synthetic */ IntercomRootActivity this$0;

    IntercomRootActivity$onCreate$1(IntercomRootActivity intercomRootActivity) {
        this.this$0 = intercomRootActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AppConfig appConfig = Injector.get().getAppConfigProvider().get();
            C6496s.g(appConfig, "get(...)");
            final IntercomRootActivity intercomRootActivity = this.this$0;
            ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, c.e(-1535408283, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        Intent intent = intercomRootActivity.getIntent();
                        C6496s.g(intent, "getIntent(...)");
                        IntercomRootNavHostKt.IntercomRootNavHost(intent, intercomRootActivity, mVar, 8);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 56);
            return;
        }
        mVar.I();
    }
}
