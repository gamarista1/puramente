package io.intercom.android.sdk.survey.ui;

import Ug.K;
import Y.A1;
import Y.C1500m;
import Y.p1;
import android.view.Window;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.survey.CloseEventTrigger;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.utilities.ApplyStatusBarColorKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.g;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomSurveyActivity$onCreate$1 implements p {
    final /* synthetic */ IntercomSurveyActivity this$0;

    IntercomSurveyActivity$onCreate$1(IntercomSurveyActivity intercomSurveyActivity) {
        this.this$0 = intercomSurveyActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AppConfig appConfig = Injector.get().getAppConfigProvider().get();
            C6496s.g(appConfig, "get(...)");
            final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
            ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, c.e(-2107771943, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(IntercomSurveyActivity intercomSurveyActivity) {
                    C6496s.h(intercomSurveyActivity, "this$0");
                    intercomSurveyActivity.getViewModel().onCloseClicked(CloseEventTrigger.CLOSE_BUTTON);
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(IntercomSurveyActivity intercomSurveyActivity, String str) {
                    C6496s.h(intercomSurveyActivity, "this$0");
                    C6496s.h(str, "it");
                    intercomSurveyActivity.getViewModel().onAnswerUpdated();
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$2(IntercomSurveyActivity intercomSurveyActivity, SurveyState.Content.SecondaryCta secondaryCta) {
                    C6496s.h(intercomSurveyActivity, "this$0");
                    C6496s.h(secondaryCta, "it");
                    intercomSurveyActivity.getViewModel().onSecondaryCtaClicked(secondaryCta);
                    LinkOpener.handleUrl(secondaryCta.getDestination(), intercomSurveyActivity, intercomSurveyActivity.injector.getApi());
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        A1 b10 = p1.b(intercomSurveyActivity.getViewModel().getState(), (g) null, mVar, 8, 1);
                        ApplyStatusBarColorKt.m710applyStatusBarColor4WTKRHQ(U8.c.e((Window) null, mVar, 0, 1), ColorExtensionsKt.m711darken8_81llA(((SurveyState) b10.getValue()).getSurveyUiColors().m422getBackground0d7_KjU()));
                        SurveyComponentKt.SurveyComponent((SurveyState) b10.getValue(), new C6798l(intercomSurveyActivity.getViewModel()) {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((K) obj);
                                return C6514M.f71813a;
                            }

                            public final void invoke(K k10) {
                                ((SurveyViewModel) this.receiver).continueClicked(k10);
                            }
                        }, new b(intercomSurveyActivity), new c(intercomSurveyActivity), new d(intercomSurveyActivity), mVar, 0, 0);
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
