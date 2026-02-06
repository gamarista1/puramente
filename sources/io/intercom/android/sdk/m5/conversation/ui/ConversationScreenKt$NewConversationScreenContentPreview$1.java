package io.intercom.android.sdk.m5.conversation.ui;

import D.A;
import V.K0;
import V.O0;
import Y.C1500m;
import g0.c;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.InputTypeState;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.TeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationScreenKt$NewConversationScreenContentPreview$1 implements p {
    final /* synthetic */ ExpandedTeamPresenceState $expandedTeamPresenceState;

    ConversationScreenKt$NewConversationScreenContentPreview$1(ExpandedTeamPresenceState expandedTeamPresenceState) {
        this.$expandedTeamPresenceState = expandedTeamPresenceState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            final ExpandedTeamPresenceState expandedTeamPresenceState = this.$expandedTeamPresenceState;
            C1500m mVar2 = mVar;
            O0.a((i) null, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, c.e(-1434887623, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0() {
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(ConversationScrolledState conversationScrolledState) {
                    C6496s.h(conversationScrolledState, "<unused var>");
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$2(int i10, int i11) {
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        List q10 = C6565s.q(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"), new ContentRow.QuickRepliesRow(C6565s.q(new ReplyOption("Option 1", "1"), new ReplyOption("Option 2", "2"), new ReplyOption("Option 3", "3")), "1"));
                        BottomBarUiState bottomBarUiState = new BottomBarUiState(new ComposerState.TextInput("", new StringProvider.StringRes(R.string.intercom_reply_to_conversation, (List) null, 2, (DefaultConstructorMarker) null), false, 4, (DefaultConstructorMarker) null), new CurrentlyTypingState((AvatarWrapper) null, false, (StringProvider) null, TypingIndicatorType.NONE, 7, (DefaultConstructorMarker) null), InputTypeState.Companion.getDEFAULT(), (List) null, false, (BottomBarUiState.BottomBadgeState) null, 56, (DefaultConstructorMarker) null);
                        StringProvider.ActualString actualString = new StringProvider.ActualString("Banana");
                        StringProvider.ActualString actualString2 = new StringProvider.ActualString("Active 15m ago");
                        Integer valueOf = Integer.valueOf(R.drawable.intercom_clock);
                        Avatar create = Avatar.create("", "S");
                        C6496s.g(create, "create(...)");
                        ConversationUiState.Content content = r6;
                        BottomBarUiState bottomBarUiState2 = bottomBarUiState;
                        ConversationUiState.Content content2 = new ConversationUiState.Content(new TopAppBarUiState(actualString, (Integer) null, actualString2, valueOf, C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null)), false, (TicketProgressRowState) null, (List) null, (C2544x0) null, (C2544x0) null, (C2544x0) null, 2018, (DefaultConstructorMarker) null), q10, bottomBarUiState2, (NetworkState) null, (BottomSheetState) null, FloatingIndicatorState.None.INSTANCE, new TeamPresenceState(expandedTeamPresenceState, "Our team is here to help you with any questions you have.", "Our response times are slower than usual. We’re working hard to get to your message"), 24, (DefaultConstructorMarker) null);
                        G0 g02 = r1;
                        G0 g03 = new G0();
                        H0 h02 = r1;
                        H0 h03 = new H0();
                        I0 i02 = r1;
                        I0 i03 = new I0();
                        ConversationScreenKt.ConversationScreenContent((i) null, content, (K0) null, (C6798l) null, (C6798l) null, (p) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6787a) null, (C6798l) null, (C6787a) null, (C6787a) null, (C6787a) null, (C6787a) null, g02, (C6798l) null, (C6798l) null, (C6787a) null, (C6798l) null, (C6787a) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, h02, i02, (C6798l) null, (A) null, (C6787a) null, mVar, 64, 196608, 14155776, 0, 1946124285);
                        return;
                    }
                    mVar.I();
                }
            }, mVar2, 54), mVar2, 12582912, 127);
            return;
        }
        mVar.I();
    }
}
