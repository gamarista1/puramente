package io.intercom.android.sdk.m5.conversation.ui.components;

import C.Y;
import Y.A1;
import Y.C1500m;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationTopAppBarKt$ConversationTopAppBar$5$1 implements q {
    final /* synthetic */ A1 $contentColorState;
    final /* synthetic */ C6798l $onMenuClicked;
    final /* synthetic */ TopAppBarUiState $topAppBarUiState;
    final /* synthetic */ C6798l $trackMetric;

    ConversationTopAppBarKt$ConversationTopAppBar$5$1(TopAppBarUiState topAppBarUiState, C6798l lVar, A1 a12, C6798l lVar2) {
        this.$topAppBarUiState = topAppBarUiState;
        this.$onMenuClicked = lVar;
        this.$contentColorState = a12;
        this.$trackMetric = lVar2;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(C6798l lVar, HeaderMenuItem headerMenuItem) {
        C6496s.h(headerMenuItem, "item");
        lVar.invoke(headerMenuItem);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Y) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(Y y10, C1500m mVar, int i10) {
        C6496s.h(y10, "$this$TopActionBar");
        if ((i10 & 81) != 16 || !mVar.i()) {
            List<HeaderMenuItem> headerMenuItems = this.$topAppBarUiState.getHeaderMenuItems();
            mVar.T(-1166882668);
            boolean S10 = mVar.S(this.$onMenuClicked);
            C6798l lVar = this.$onMenuClicked;
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new C6162v(lVar);
                mVar.r(A10);
            }
            mVar.M();
            ConversationKebabKt.m250ConversationKebabcf5BqRc(headerMenuItems, (C6798l) A10, ((C2544x0) this.$contentColorState.getValue()).y(), this.$trackMetric, mVar, 8, 0);
            return;
        }
        mVar.I();
    }
}
