package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import C.C1092j;
import Y.C1500m;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.LinkOpener;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import r0.C2544x0;
import v.C2722e;
import yf.C6787a;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationBottomBarKt$ConversationBottomBar$3$1$4 implements q {
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ Context $context;
    final /* synthetic */ C6787a $onPrivacyNoticeDismissed;
    final /* synthetic */ C1092j $this_Column;
    final /* synthetic */ C6798l $trackMetric;

    ConversationBottomBarKt$ConversationBottomBar$3$1$4(BottomBarUiState bottomBarUiState, C6787a aVar, C1092j jVar, C6798l lVar, Context context) {
        this.$bottomBarUiState = bottomBarUiState;
        this.$onPrivacyNoticeDismissed = aVar;
        this.$this_Column = jVar;
        this.$trackMetric = lVar;
        this.$context = context;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6798l lVar, PoweredBy poweredBy, Context context) {
        C6496s.h(poweredBy, "$this_with");
        C6496s.h(context, "$context");
        lVar.invoke(MetricData.PoweredByClicked.INSTANCE);
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(eVar, "$this$AnimatedVisibility");
        BottomBarUiState.BottomBadgeState bottomBadge = this.$bottomBarUiState.getBottomBadge();
        if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PoweredByBadgeState) {
            mVar2.T(-249535578);
            PoweredBy poweredBy = ((BottomBarUiState.BottomBadgeState.PoweredByBadgeState) this.$bottomBarUiState.getBottomBadge()).getPoweredBy();
            C1092j jVar = this.$this_Column;
            C6798l lVar = this.$trackMetric;
            Context context = this.$context;
            i b10 = jVar.b(i.f23074a, c.f23044a.g());
            long g10 = C2544x0.f25560b.g();
            long r82 = IntercomTheme.INSTANCE.getColors(mVar2, IntercomTheme.$stable).m686getDescriptionText0d7_KjU();
            PoweredByBadgeKt.m205PoweredByBadgewBJOh4Y(poweredBy.getText(), poweredBy.getIcon(), new P(lVar, poweredBy, context), b10, g10, r82, mVar, 24576, 0);
            mVar.M();
        } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) {
            mVar2.T(-248466884);
            PrivacyPolicyKt.PrivacyPolicy(((BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState) this.$bottomBarUiState.getBottomBadge()).getText(), n.j(i.f23074a, h.j((float) 16), h.j((float) 4)), this.$onPrivacyNoticeDismissed, mVar, 48, 0);
            mVar.M();
        } else if (bottomBadge instanceof BottomBarUiState.BottomBadgeState.None) {
            mVar2.T(-248063915);
            mVar.M();
        } else {
            mVar2.T(-1254978776);
            mVar.M();
            throw new C6535s();
        }
    }
}
