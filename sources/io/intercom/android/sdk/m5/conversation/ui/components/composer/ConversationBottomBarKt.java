package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import C.C1087e;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import c1.h;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aË\u0001\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u000f\u0010\u001a\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001b¨\u0006!²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "bottomBarUiState", "Lkotlin/Function2;", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;", "Llf/M;", "onSendMessage", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "onInputChange", "Lkotlin/Function0;", "onGifInputSelected", "onNewConversationClicked", "onMediaInputSelected", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "trackMetric", "Lc1/h;", "topSpacing", "navigateToAnotherConversation", "onPrivacyNoticeDismissed", "onTyping", "ConversationBottomBar-wn8IZOc", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lyf/p;Lyf/l;Lyf/a;Lyf/a;Lyf/a;Lyf/l;FLyf/l;Lyf/a;Lyf/a;LY/m;III)V", "ConversationBottomBar", "MessageComposerPreview", "(LY/m;I)V", "MessageComposerLongTextPreview", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "", "bottomBadgeVisibility", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationBottomBarKt {
    /* renamed from: ConversationBottomBar-wn8IZOc  reason: not valid java name */
    public static final void m273ConversationBottomBarwn8IZOc(i iVar, BottomBarUiState bottomBarUiState, p pVar, C6798l lVar, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar2, float f10, C6798l lVar3, C6787a aVar4, C6787a aVar5, C1500m mVar, int i10, int i11, int i12) {
        int i13 = i12;
        C6496s.h(bottomBarUiState, "bottomBarUiState");
        C6496s.h(pVar, "onSendMessage");
        C6496s.h(lVar, "onInputChange");
        C6496s.h(aVar, "onGifInputSelected");
        C6496s.h(aVar2, "onNewConversationClicked");
        C6496s.h(aVar3, "onMediaInputSelected");
        C6496s.h(lVar3, "navigateToAnotherConversation");
        C6496s.h(aVar4, "onPrivacyNoticeDismissed");
        C1500m h10 = mVar.h(-975908602);
        i.a aVar6 = (i13 & 1) != 0 ? i.f23074a : iVar;
        G g10 = (i13 & 128) != 0 ? new G() : lVar2;
        float j10 = (i13 & 256) != 0 ? h.j((float) 0) : f10;
        H h11 = (i13 & 2048) != 0 ? new H() : aVar5;
        ConversationBottomBarKt$ConversationBottomBar$3 conversationBottomBarKt$ConversationBottomBar$3 = r1;
        ConversationBottomBarKt$ConversationBottomBar$3 conversationBottomBarKt$ConversationBottomBar$32 = new ConversationBottomBarKt$ConversationBottomBar$3(j10, bottomBarUiState, pVar, aVar, aVar3, lVar, g10, h11, aVar2, lVar3, aVar4);
        C1087e.a(aVar6, (c) null, false, g0.c.e(188868976, true, conversationBottomBarKt$ConversationBottomBar$3, h10, 54), h10, (i10 & 14) | 3072, 6);
        Y0 k10 = h10.k();
        if (k10 != null) {
            I i14 = r0;
            I i15 = new I(aVar6, bottomBarUiState, pVar, lVar, aVar, aVar2, aVar3, g10, j10, lVar3, aVar4, h11, i10, i11, i12);
            k10.a(i14);
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationBottomBar_wn8IZOc$lambda$0(MetricData metricData) {
        C6496s.h(metricData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationBottomBar_wn8IZOc$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationBottomBar_wn8IZOc$lambda$2(i iVar, BottomBarUiState bottomBarUiState, p pVar, C6798l lVar, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar2, float f10, C6798l lVar3, C6787a aVar4, C6787a aVar5, int i10, int i11, int i12, C1500m mVar, int i13) {
        BottomBarUiState bottomBarUiState2 = bottomBarUiState;
        C6496s.h(bottomBarUiState2, "$bottomBarUiState");
        p pVar2 = pVar;
        C6496s.h(pVar2, "$onSendMessage");
        C6798l lVar4 = lVar;
        C6496s.h(lVar4, "$onInputChange");
        C6787a aVar6 = aVar;
        C6496s.h(aVar6, "$onGifInputSelected");
        C6787a aVar7 = aVar2;
        C6496s.h(aVar7, "$onNewConversationClicked");
        C6787a aVar8 = aVar3;
        C6496s.h(aVar8, "$onMediaInputSelected");
        C6798l lVar5 = lVar3;
        C6496s.h(lVar5, "$navigateToAnotherConversation");
        C6787a aVar9 = aVar4;
        C6496s.h(aVar9, "$onPrivacyNoticeDismissed");
        m273ConversationBottomBarwn8IZOc(iVar, bottomBarUiState2, pVar2, lVar4, aVar6, aVar7, aVar8, lVar2, f10, lVar5, aVar9, aVar5, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void MessageComposerLongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1582182192);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m266getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageComposerLongTextPreview$lambda$4(int i10, C1500m mVar, int i11) {
        MessageComposerLongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void MessageComposerPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-961451097);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m264getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new K(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MessageComposerPreview$lambda$3(int i10, C1500m mVar, int i11) {
        MessageComposerPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
