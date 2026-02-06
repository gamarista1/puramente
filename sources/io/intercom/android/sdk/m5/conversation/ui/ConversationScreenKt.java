package io.intercom.android.sdk.m5.conversation.ui;

import C.N;
import D.A;
import D.k;
import Ef.m;
import Ug.C5600w0;
import Ug.K;
import V.B0;
import V.K0;
import Y.A1;
import Y.C1500m;
import Y.C1510r0;
import Y.L;
import Y.M;
import Y.M0;
import Y.Y0;
import Y.o1;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.C1651m1;
import c1.h;
import c1.t;
import e.C1935h;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.TextInputSource;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a©\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a6\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\u001a\u0010\u001b\u001aß\u0004\u0010B\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00050\t2\u001a\b\u0002\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00050\"2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u001a\b\u0002\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00050\t2\u0018\u0010>\u001a\u0014\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050\"2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\u000e\b\u0002\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\bB\u0010C\u001a)\u0010I\u001a\u00020H*\b\u0012\u0004\u0012\u00020D0+2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020=H\u0002¢\u0006\u0004\bI\u0010J\u001a\u001b\u0010N\u001a\u00020K*\u00020K2\u0006\u0010M\u001a\u00020LH\u0003¢\u0006\u0004\bN\u0010O\u001a\u000f\u0010P\u001a\u00020\u0005H\u0003¢\u0006\u0004\bP\u0010Q\u001a\u000f\u0010R\u001a\u00020\u0005H\u0003¢\u0006\u0004\bR\u0010Q\"\u0014\u0010T\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010U\"\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010U\"\u0014\u0010W\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010U\"\u0014\u0010Z\u001a\u00020H8@X\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006a²\u0006\u001a\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\n0[8\n@\nX\u0002²\u0006\u0010\u0010^\u001a\u0004\u0018\u00010]8\n@\nX\u0002²\u0006\f\u0010`\u001a\u00020_8\nX\u0002"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "conversationViewModel", "Lk0/i;", "modifier", "Lkotlin/Function0;", "Llf/M;", "onBackClick", "onNewConversationClicked", "navigateToTicketDetail", "Lkotlin/Function1;", "", "openTicket", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onCreateTicket", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "onMenuClicked", "navigateToAnotherConversation", "ConversationScreen", "(Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;Lk0/i;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/l;Lyf/l;Lyf/l;LY/m;II)V", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "networkState", "LV/K0;", "snackbarHostState", "Landroid/content/Context;", "context", "onDismiss", "showNetworkMessage", "(Lio/intercom/android/sdk/m5/conversation/states/NetworkState;LV/K0;Landroid/content/Context;Lyf/a;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "uiState", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "onSuggestionClick", "Lio/intercom/android/sdk/models/ReplyOption;", "onReplyClicked", "Lkotlin/Function2;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/TextInputSource;", "onSendMessage", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "onInputChange", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "onGifClick", "onGifSearchQueryChange", "onGifInputSelected", "", "Landroid/net/Uri;", "onMediaSelected", "onMediaInputSelected", "onTitleClicked", "onRetryClick", "Lio/intercom/android/sdk/models/Part;", "onRetryMessageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onRetryImageClicked", "onTyping", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "onSubmitAttribute", "trackClickedInput", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "trackMetric", "Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "onConversationScrolled", "", "onJumpToBottomButtonClicked", "LD/A;", "lazyListState", "onPrivacyNoticeDismissed", "ConversationScreenContent", "(Lk0/i;Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;LV/K0;Lyf/l;Lyf/l;Lyf/p;Lyf/l;Lyf/l;Lyf/l;Lyf/a;Lyf/l;Lyf/a;Lyf/a;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/l;Lyf/a;Lyf/l;Lyf/a;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/l;Lyf/p;Lyf/l;LD/A;Lyf/a;LY/m;IIIII)V", "LD/k;", "", "scrollOffset", "itemsCount", "", "isLazyListScrolled", "(Ljava/util/List;FI)Z", "LC/N;", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "bottomBarUiState", "getPaddingValuesForComposer", "(LC/N;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;LY/m;I)LC/N;", "ConversationScreenContentPreview", "(LY/m;I)V", "NewConversationScreenContentPreview", "Lc1/h;", "JumpToBottomNewMessagesTopOffset", "F", "JumpToBottomScrollOffset", "LazyListJumpToBottomScrollOffset", "getLazyMessageListEnabled", "()Z", "LazyMessageListEnabled", "Lkotlin/Pair;", "showUploadSizeLimitDialog", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "selectedGif", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardAsState", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationScreenKt {
    /* access modifiers changed from: private */
    public static final float JumpToBottomNewMessagesTopOffset = h.j((float) 180);
    private static final float JumpToBottomScrollOffset = h.j((float) 80);
    private static final float LazyListJumpToBottomScrollOffset = h.j((float) 40);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConversationScreen(io.intercom.android.sdk.m5.conversation.ConversationViewModel r53, k0.i r54, yf.C6787a r55, yf.C6787a r56, yf.C6787a r57, yf.C6798l r58, yf.C6798l r59, yf.C6798l r60, yf.C6798l r61, Y.C1500m r62, int r63, int r64) {
        /*
            r1 = r53
            r11 = r64
            java.lang.String r0 = "conversationViewModel"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = -1550678767(0xffffffffa3928511, float:-1.5885708E-17)
            r2 = r62
            Y.m r0 = r2.h(r0)
            r2 = r11 & 2
            if (r2 == 0) goto L_0x0019
            k0.i$a r2 = k0.i.f23074a
            goto L_0x001b
        L_0x0019:
            r2 = r54
        L_0x001b:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x0025
            io.intercom.android.sdk.m5.conversation.ui.z r3 = new io.intercom.android.sdk.m5.conversation.ui.z
            r3.<init>()
            goto L_0x0027
        L_0x0025:
            r3 = r55
        L_0x0027:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x0031
            io.intercom.android.sdk.m5.conversation.ui.L r4 = new io.intercom.android.sdk.m5.conversation.ui.L
            r4.<init>()
            goto L_0x0033
        L_0x0031:
            r4 = r56
        L_0x0033:
            r5 = r11 & 16
            if (r5 == 0) goto L_0x003d
            io.intercom.android.sdk.m5.conversation.ui.Z r5 = new io.intercom.android.sdk.m5.conversation.ui.Z
            r5.<init>()
            goto L_0x003f
        L_0x003d:
            r5 = r57
        L_0x003f:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0049
            io.intercom.android.sdk.m5.conversation.ui.e0 r6 = new io.intercom.android.sdk.m5.conversation.ui.e0
            r6.<init>()
            goto L_0x004b
        L_0x0049:
            r6 = r58
        L_0x004b:
            r7 = r11 & 64
            if (r7 == 0) goto L_0x0055
            io.intercom.android.sdk.m5.conversation.ui.f0 r7 = new io.intercom.android.sdk.m5.conversation.ui.f0
            r7.<init>()
            goto L_0x0057
        L_0x0055:
            r7 = r59
        L_0x0057:
            r8 = r11 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0061
            io.intercom.android.sdk.m5.conversation.ui.g0 r8 = new io.intercom.android.sdk.m5.conversation.ui.g0
            r8.<init>()
            goto L_0x0063
        L_0x0061:
            r8 = r60
        L_0x0063:
            r9 = r11 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x006d
            io.intercom.android.sdk.m5.conversation.ui.h0 r9 = new io.intercom.android.sdk.m5.conversation.ui.h0
            r9.<init>()
            goto L_0x006f
        L_0x006d:
            r9 = r61
        L_0x006f:
            Y.I0 r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r10 = r0.m(r10)
            android.content.Context r10 = (android.content.Context) r10
            r12 = 1223554640(0x48edf650, float:487346.5)
            r0.T(r12)
            java.lang.Object r12 = r0.A()
            Y.m$a r13 = Y.C1500m.f10026a
            java.lang.Object r14 = r13.a()
            if (r12 != r14) goto L_0x0093
            V.K0 r12 = new V.K0
            r12.<init>()
            r0.r(r12)
        L_0x0093:
            r14 = r12
            V.K0 r14 = (V.K0) r14
            r0.M()
            r12 = 0
            java.lang.Object[] r15 = new java.lang.Object[r12]
            io.intercom.android.sdk.m5.conversation.ui.i0 r16 = new io.intercom.android.sdk.m5.conversation.ui.i0
            r16.<init>()
            r17 = 3080(0xc08, float:4.316E-42)
            r18 = 6
            r19 = 0
            r20 = 0
            r54 = r15
            r55 = r19
            r56 = r20
            r57 = r16
            r58 = r0
            r59 = r17
            r60 = r18
            java.lang.Object r15 = h0.C2018b.e(r54, r55, r56, r57, r58, r59, r60)
            Y.r0 r15 = (Y.C1510r0) r15
            java.lang.Object[] r11 = new java.lang.Object[r12]
            io.intercom.android.sdk.m5.conversation.ui.k0 r16 = new io.intercom.android.sdk.m5.conversation.ui.k0
            r16.<init>()
            r54 = r11
            r57 = r16
            java.lang.Object r11 = h0.C2018b.e(r54, r55, r56, r57, r58, r59, r60)
            Y.r0 r11 = (Y.C1510r0) r11
            io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract r12 = new io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract
            r12.<init>()
            r62 = r7
            io.intercom.android.sdk.m5.conversation.ui.l0 r7 = new io.intercom.android.sdk.m5.conversation.ui.l0
            r7.<init>(r1, r11)
            r49 = r8
            int r8 = io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract.$stable
            e.h r7 = e.C1930c.a(r12, r7, r0, r8)
            r8 = 1223575865(0x48ee4939, float:488009.78)
            r0.T(r8)
            boolean r8 = getLazyMessageListEnabled()
            if (r8 == 0) goto L_0x00ff
            r8 = 2147483647(0x7fffffff, float:NaN)
            r12 = 6
            r50 = r6
            r6 = 2
            r51 = r5
            r5 = 0
            D.A r6 = D.B.c(r8, r5, r0, r12, r6)
            r41 = r6
            goto L_0x0105
        L_0x00ff:
            r51 = r5
            r50 = r6
            r41 = 0
        L_0x0105:
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8 r5 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$8
            r6 = 0
            r5.<init>(r1, r15, r6)
            r8 = 70
            Y.P.g(r6, r5, r0, r8)
            io.intercom.android.sdk.m5.conversation.ui.A r5 = new io.intercom.android.sdk.m5.conversation.ui.A
            r5.<init>()
            r8 = 54
            Y.P.c(r6, r5, r0, r8)
            r5 = 1223601075(0x48eeabb3, float:488797.6)
            r0.T(r5)
            kotlin.Pair r5 = ConversationScreen$lambda$9(r15)
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x018c
            int r5 = io.intercom.android.sdk.R.string.intercom_file_too_big
            io.intercom.android.sdk.utilities.Phrase r5 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r10, (int) r5)
            kotlin.Pair r6 = ConversationScreen$lambda$9(r15)
            java.lang.Object r6 = r6.d()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r8 = "limit"
            io.intercom.android.sdk.utilities.Phrase r5 = r5.put((java.lang.String) r8, (java.lang.CharSequence) r6)
            java.lang.CharSequence r5 = r5.format()
            java.lang.String r5 = r5.toString()
            int r6 = io.intercom.android.sdk.R.string.intercom_failed_to_send
            r8 = 0
            java.lang.String r6 = M0.i.a(r6, r0, r8)
            r12 = 1223613272(0x48eedb58, float:489178.75)
            r0.T(r12)
            boolean r12 = r0.S(r15)
            java.lang.Object r8 = r0.A()
            if (r12 != 0) goto L_0x016e
            java.lang.Object r12 = r13.a()
            if (r8 != r12) goto L_0x0176
        L_0x016e:
            io.intercom.android.sdk.m5.conversation.ui.C r8 = new io.intercom.android.sdk.m5.conversation.ui.C
            r8.<init>(r15)
            r0.r(r8)
        L_0x0176:
            yf.a r8 = (yf.C6787a) r8
            r0.M()
            r12 = 0
            r15 = 0
            r54 = r6
            r55 = r5
            r56 = r8
            r57 = r0
            r58 = r12
            r59 = r15
            io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog(r54, r55, r56, r57, r58, r59)
        L_0x018c:
            r0.M()
            Xg.L r5 = r53.getUiState()
            r6 = 8
            r8 = 1
            r12 = 0
            Y.A1 r5 = Y.p1.b(r5, r12, r0, r6, r8)
            java.lang.Object r5 = r5.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState r5 = (io.intercom.android.sdk.m5.conversation.states.ConversationUiState) r5
            r6 = 1223620016(0x48eef5b0, float:489389.5)
            r0.T(r6)
            boolean r6 = r5 instanceof io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Content
            if (r6 == 0) goto L_0x01c9
            r6 = r5
            io.intercom.android.sdk.m5.conversation.states.ConversationUiState$Content r6 = (io.intercom.android.sdk.m5.conversation.states.ConversationUiState.Content) r6
            io.intercom.android.sdk.m5.conversation.states.NetworkState r6 = r6.getNetworkState()
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11 r12 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreen$11
            r15 = 0
            r54 = r12
            r55 = r5
            r56 = r14
            r57 = r10
            r58 = r53
            r59 = r15
            r54.<init>(r55, r56, r57, r58, r59)
            r15 = 64
            Y.P.g(r6, r12, r0, r15)
        L_0x01c9:
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.D r15 = new io.intercom.android.sdk.m5.conversation.ui.D
            r15.<init>(r1)
            io.intercom.android.sdk.m5.conversation.ui.E r6 = new io.intercom.android.sdk.m5.conversation.ui.E
            r6.<init>(r1)
            io.intercom.android.sdk.m5.conversation.ui.F r12 = new io.intercom.android.sdk.m5.conversation.ui.F
            r12.<init>(r1)
            io.intercom.android.sdk.m5.conversation.ui.G r8 = new io.intercom.android.sdk.m5.conversation.ui.G
            r8.<init>(r1)
            r55 = r4
            io.intercom.android.sdk.m5.conversation.ui.H r4 = new io.intercom.android.sdk.m5.conversation.ui.H
            r4.<init>(r7, r11)
            io.intercom.android.sdk.m5.conversation.ui.I r7 = new io.intercom.android.sdk.m5.conversation.ui.I
            r7.<init>(r1)
            io.intercom.android.sdk.m5.conversation.ui.J r11 = new io.intercom.android.sdk.m5.conversation.ui.J
            r11.<init>(r1)
            r52 = r3
            io.intercom.android.sdk.m5.conversation.ui.K r3 = new io.intercom.android.sdk.m5.conversation.ui.K
            r3.<init>(r10, r1)
            io.intercom.android.sdk.m5.conversation.ui.N r10 = new io.intercom.android.sdk.m5.conversation.ui.N
            r10.<init>(r1)
            r56 = r10
            io.intercom.android.sdk.m5.conversation.ui.O r10 = new io.intercom.android.sdk.m5.conversation.ui.O
            r10.<init>(r1)
            r57 = r10
            io.intercom.android.sdk.m5.conversation.ui.P r10 = new io.intercom.android.sdk.m5.conversation.ui.P
            r10.<init>(r1)
            r58 = r10
            io.intercom.android.sdk.m5.conversation.ui.Q r10 = new io.intercom.android.sdk.m5.conversation.ui.Q
            r10.<init>(r1)
            r59 = r10
            io.intercom.android.sdk.m5.conversation.ui.S r10 = new io.intercom.android.sdk.m5.conversation.ui.S
            r10.<init>(r1)
            r61 = r10
            io.intercom.android.sdk.m5.conversation.ui.T r10 = new io.intercom.android.sdk.m5.conversation.ui.T
            r10.<init>(r1)
            r30 = r10
            io.intercom.android.sdk.m5.conversation.ui.U r10 = new io.intercom.android.sdk.m5.conversation.ui.U
            r10.<init>(r1)
            r31 = r10
            io.intercom.android.sdk.m5.conversation.ui.V r10 = new io.intercom.android.sdk.m5.conversation.ui.V
            r10.<init>(r1)
            r36 = r10
            io.intercom.android.sdk.m5.conversation.ui.W r10 = new io.intercom.android.sdk.m5.conversation.ui.W
            r10.<init>(r1)
            r37 = r10
            io.intercom.android.sdk.m5.conversation.ui.X r10 = new io.intercom.android.sdk.m5.conversation.ui.X
            r10.<init>(r1)
            r38 = r10
            io.intercom.android.sdk.m5.conversation.ui.a0 r10 = new io.intercom.android.sdk.m5.conversation.ui.a0
            r10.<init>(r1)
            r16 = r12
            r12 = 1223743913(0x48f0d9a9, float:493261.28)
            r0.T(r12)
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r63 & r12
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r12 = r12 ^ r17
            r39 = r10
            r10 = 67108864(0x4000000, float:1.5046328E-36)
            if (r12 <= r10) goto L_0x025f
            boolean r12 = r0.S(r9)
            if (r12 != 0) goto L_0x0263
        L_0x025f:
            r12 = r63 & r17
            if (r12 != r10) goto L_0x0265
        L_0x0263:
            r12 = 1
            goto L_0x0266
        L_0x0265:
            r12 = 0
        L_0x0266:
            java.lang.Object r10 = r0.A()
            if (r12 != 0) goto L_0x0272
            java.lang.Object r12 = r13.a()
            if (r10 != r12) goto L_0x027a
        L_0x0272:
            io.intercom.android.sdk.m5.conversation.ui.b0 r10 = new io.intercom.android.sdk.m5.conversation.ui.b0
            r10.<init>(r9)
            r0.r(r10)
        L_0x027a:
            r40 = r10
            yf.l r40 = (yf.C6798l) r40
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.c0 r10 = new io.intercom.android.sdk.m5.conversation.ui.c0
            r42 = r10
            r10.<init>(r1)
            int r10 = r63 >> 3
            r10 = r10 & 14
            r10 = r10 | 384(0x180, float:5.38E-43)
            r44 = r10
            int r10 = r63 << 3
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            int r12 = r63 << 6
            r13 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r13
            r45 = r10 | r12
            int r10 = r63 >> 12
            r10 = r10 & 126(0x7e, float:1.77E-43)
            int r12 = r63 >> 15
            r12 = r12 & 896(0x380, float:1.256E-42)
            r10 = r10 | r12
            int r12 = r63 >> 9
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r46 = r10 | r12
            r47 = 0
            r48 = 0
            r10 = r16
            r12 = r2
            r13 = r5
            r16 = r6
            r17 = r10
            r18 = r8
            r19 = r4
            r20 = r7
            r21 = r11
            r22 = r3
            r23 = r56
            r24 = r57
            r25 = r52
            r26 = r58
            r27 = r55
            r28 = r59
            r29 = r61
            r32 = r51
            r33 = r50
            r34 = r49
            r35 = r62
            r43 = r0
            ConversationScreenContent(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            Y.Y0 r12 = r0.k()
            if (r12 == 0) goto L_0x02fc
            io.intercom.android.sdk.m5.conversation.ui.d0 r13 = new io.intercom.android.sdk.m5.conversation.ui.d0
            r0 = r13
            r1 = r53
            r3 = r52
            r4 = r55
            r5 = r51
            r6 = r50
            r7 = r62
            r8 = r49
            r10 = r63
            r11 = r64
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a(r13)
        L_0x02fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.ConversationScreen(io.intercom.android.sdk.m5.conversation.ConversationViewModel, k0.i, yf.a, yf.a, yf.a, yf.l, yf.l, yf.l, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void ConversationScreen$lambda$10(C1510r0 r0Var, Pair<Boolean, String> pair) {
        r0Var.setValue(pair);
    }

    /* access modifiers changed from: private */
    public static final C1510r0 ConversationScreen$lambda$11() {
        return u1.d((Object) null, (o1) null, 2, (Object) null);
    }

    private static final MediaData.Gif ConversationScreen$lambda$12(C1510r0 r0Var) {
        return (MediaData.Gif) r0Var.getValue();
    }

    private static final void ConversationScreen$lambda$13(C1510r0 r0Var, MediaData.Gif gif) {
        r0Var.setValue(gif);
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$15(ConversationViewModel conversationViewModel, C1510r0 r0Var, List list) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(r0Var, "$selectedGif$delegate");
        C6496s.h(list, "it");
        if (!(((Uri) C6565s.q0(list)) == null || ConversationScreen$lambda$12(r0Var) == null)) {
            MediaData.Gif ConversationScreen$lambda$12 = ConversationScreen$lambda$12(r0Var);
            C6496s.e(ConversationScreen$lambda$12);
            conversationViewModel.sendAfterPreview(ConversationScreen$lambda$12);
            ConversationScreen$lambda$13(r0Var, (MediaData.Gif) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final L ConversationScreen$lambda$17(M m10) {
        C6496s.h(m10, "$this$DisposableEffect");
        return new ConversationScreenKt$ConversationScreen$lambda$17$$inlined$onDispose$1();
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$19$lambda$18(C1510r0 r0Var) {
        C6496s.h(r0Var, "$showUploadSizeLimitDialog$delegate");
        ConversationScreen$lambda$10(r0Var, C6502A.a(Boolean.FALSE, "0"));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$2() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$20(ConversationViewModel conversationViewModel, ReplySuggestion replySuggestion) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(replySuggestion, "it");
        conversationViewModel.onSuggestionClick(replySuggestion);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$21(ConversationViewModel conversationViewModel, ReplyOption replyOption) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(replyOption, "it");
        conversationViewModel.onReplyOptionClicked(replyOption);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$22(ConversationViewModel conversationViewModel, String str, TextInputSource textInputSource) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(str, MetricTracker.Object.MESSAGE);
        C6496s.h(textInputSource, "textInputSource");
        conversationViewModel.sendMessage(str, textInputSource);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$23(ConversationViewModel conversationViewModel, ComposerInputType composerInputType) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(composerInputType, "it");
        conversationViewModel.onInputChange(composerInputType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$24(C1935h hVar, C1510r0 r0Var, Block block) {
        C1935h hVar2 = hVar;
        C1510r0 r0Var2 = r0Var;
        C6496s.h(hVar2, "$gifPreviewLauncher");
        C6496s.h(r0Var2, "$selectedGif$delegate");
        C6496s.h(block, "it");
        int width = block.getWidth();
        int height = block.getHeight();
        String attribution = block.getAttribution();
        C6496s.g(attribution, "getAttribution(...)");
        String url = block.getUrl();
        C6496s.g(url, "getUrl(...)");
        ConversationScreen$lambda$13(r0Var2, new MediaData.Gif(width, height, url, attribution));
        String url2 = block.getUrl();
        C6496s.g(url2, "getUrl(...)");
        hVar2.b(new IntercomPreviewArgs(C6565s.e(new IntercomPreviewFile.NetworkFile(url2, "image/gif")), (DeleteType) null, (String) null, true, (DownloadState) null, 22, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$25(ConversationViewModel conversationViewModel, String str) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(str, "it");
        conversationViewModel.onGifSearchQueryChange(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$26(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.loadGifs();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$29(Context context, ConversationViewModel conversationViewModel, List list) {
        C6496s.h(context, "$context");
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(list, "uris");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaData.Media mediaData = URIExtensionsKt.getMediaData((Uri) it.next(), context, false);
            if (mediaData != null) {
                conversationViewModel.sendAfterPreview(mediaData);
            }
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$3(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$30(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.updateBottomSheet(BottomSheetState.MediaInput.INSTANCE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$31(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.updateBottomSheet(BottomSheetState.TeammatePresence.INSTANCE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$32(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onRetryClick();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$33(ConversationViewModel conversationViewModel, Part part) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(part, "it");
        conversationViewModel.onRetryMessageClicked(part);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$34(ConversationViewModel conversationViewModel, PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(failedImageUploadData, "it");
        conversationViewModel.onRetryMediaClicked(failedImageUploadData);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$35(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onTyping();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$36(ConversationViewModel conversationViewModel, AttributeData attributeData) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(attributeData, "it");
        conversationViewModel.onSubmitAttribute(attributeData.getAttribute(), attributeData.getPartId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$37(ConversationViewModel conversationViewModel, String str) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(str, "it");
        conversationViewModel.trackClickedInput(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$38(ConversationViewModel conversationViewModel, MetricData metricData) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(metricData, "it");
        conversationViewModel.trackMetric(metricData);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$39(ConversationViewModel conversationViewModel, ConversationScrolledState conversationScrolledState) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(conversationScrolledState, "conversationScrollState");
        conversationViewModel.onConversationScrolled(conversationScrolledState);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$4(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$40(ConversationViewModel conversationViewModel, int i10, int i11) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onJumpToBottomButtonClicked(i10, i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$42$lambda$41(C6798l lVar, String str) {
        C6496s.h(str, "it");
        lVar.invoke(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$43(ConversationViewModel conversationViewModel) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        conversationViewModel.onPrivacyNoticeDismissed();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$44(ConversationViewModel conversationViewModel, i iVar, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6798l lVar2, C6798l lVar3, C6798l lVar4, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(conversationViewModel, "$conversationViewModel");
        ConversationScreen(conversationViewModel, iVar, aVar, aVar2, aVar3, lVar, lVar2, lVar3, lVar4, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$5(HeaderMenuItem headerMenuItem) {
        C6496s.h(headerMenuItem, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreen$lambda$6(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C1510r0 ConversationScreen$lambda$8() {
        return u1.d(C6502A.a(Boolean.FALSE, "0"), (o1) null, 2, (Object) null);
    }

    private static final Pair<Boolean, String> ConversationScreen$lambda$9(C1510r0 r0Var) {
        return (Pair) r0Var.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r61v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r60v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v3, resolved type: io.intercom.android.sdk.m5.conversation.ui.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v9, resolved type: io.intercom.android.sdk.m5.conversation.ui.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v3, resolved type: io.intercom.android.sdk.m5.conversation.ui.o0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: io.intercom.android.sdk.m5.conversation.ui.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: io.intercom.android.sdk.m5.conversation.ui.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v5, resolved type: io.intercom.android.sdk.m5.conversation.ui.Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: io.intercom.android.sdk.m5.conversation.ui.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: io.intercom.android.sdk.m5.conversation.ui.B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v8, resolved type: io.intercom.android.sdk.m5.conversation.ui.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v6, resolved type: io.intercom.android.sdk.m5.conversation.ui.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r55v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r52v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r49v2, resolved type: io.intercom.android.sdk.m5.conversation.ui.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: k0.i$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v47, resolved type: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v7, resolved type: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v8, resolved type: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1} */
    /* JADX WARNING: type inference failed for: r10v21 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x067e, code lost:
        if (r5 == r1.a()) goto L_0x0680;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x06fa, code lost:
        if (r10 == r1.a()) goto L_0x06fc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0846  */
    /* JADX WARNING: Removed duplicated region for block: B:451:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ConversationScreenContent(k0.i r68, io.intercom.android.sdk.m5.conversation.states.ConversationUiState r69, V.K0 r70, yf.C6798l r71, yf.C6798l r72, yf.p r73, yf.C6798l r74, yf.C6798l r75, yf.C6798l r76, yf.C6787a r77, yf.C6798l r78, yf.C6787a r79, yf.C6787a r80, yf.C6787a r81, yf.C6787a r82, yf.C6787a r83, yf.C6798l r84, yf.C6798l r85, yf.C6787a r86, yf.C6798l r87, yf.C6787a r88, yf.C6798l r89, yf.C6798l r90, yf.C6798l r91, yf.C6798l r92, yf.C6798l r93, yf.C6798l r94, yf.p r95, yf.C6798l r96, D.A r97, yf.C6787a r98, Y.C1500m r99, int r100, int r101, int r102, int r103, int r104) {
        /*
            r15 = r69
            r14 = r83
            r13 = r94
            r12 = r95
            r11 = r100
            r10 = r101
            r9 = r102
            r8 = r104
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "onNewConversationClicked"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "onConversationScrolled"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "onJumpToBottomButtonClicked"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            r0 = 1534682946(0x5b796742, float:7.0200802E16)
            r1 = r99
            Y.m r7 = r1.h(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0037
            r3 = r11 | 6
            r4 = r3
            r3 = r68
            goto L_0x004b
        L_0x0037:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0048
            r3 = r68
            boolean r4 = r7.S(r3)
            if (r4 == 0) goto L_0x0045
            r4 = 4
            goto L_0x0046
        L_0x0045:
            r4 = 2
        L_0x0046:
            r4 = r4 | r11
            goto L_0x004b
        L_0x0048:
            r3 = r68
            r4 = r11
        L_0x004b:
            r5 = r8 & 2
            if (r5 == 0) goto L_0x0052
            r4 = r4 | 48
            goto L_0x0062
        L_0x0052:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0062
            boolean r5 = r7.S(r15)
            if (r5 == 0) goto L_0x005f
            r5 = 32
            goto L_0x0061
        L_0x005f:
            r5 = 16
        L_0x0061:
            r4 = r4 | r5
        L_0x0062:
            r5 = r8 & 4
            r16 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x006d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x006a:
            r1 = r70
            goto L_0x0080
        L_0x006d:
            r1 = r11 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x006a
            r1 = r70
            boolean r17 = r7.S(r1)
            if (r17 == 0) goto L_0x007c
            r17 = r16
            goto L_0x007e
        L_0x007c:
            r17 = 128(0x80, float:1.794E-43)
        L_0x007e:
            r4 = r4 | r17
        L_0x0080:
            r17 = r8 & 8
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L_0x008d
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x008a:
            r6 = r71
            goto L_0x00a0
        L_0x008d:
            r6 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x008a
            r6 = r71
            boolean r21 = r7.C(r6)
            if (r21 == 0) goto L_0x009c
            r21 = r19
            goto L_0x009e
        L_0x009c:
            r21 = r18
        L_0x009e:
            r4 = r4 | r21
        L_0x00a0:
            r21 = r8 & 16
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            if (r21 == 0) goto L_0x00ad
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r2 = r72
            goto L_0x00c3
        L_0x00ad:
            r24 = 57344(0xe000, float:8.0356E-41)
            r24 = r11 & r24
            r2 = r72
            if (r24 != 0) goto L_0x00c3
            boolean r25 = r7.C(r2)
            if (r25 == 0) goto L_0x00bf
            r25 = r23
            goto L_0x00c1
        L_0x00bf:
            r25 = r22
        L_0x00c1:
            r4 = r4 | r25
        L_0x00c3:
            r25 = r8 & 32
            r26 = 65536(0x10000, float:9.18355E-41)
            r27 = 131072(0x20000, float:1.83671E-40)
            if (r25 == 0) goto L_0x00d2
            r28 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r28
            r1 = r73
            goto L_0x00e7
        L_0x00d2:
            r28 = 458752(0x70000, float:6.42848E-40)
            r28 = r11 & r28
            r1 = r73
            if (r28 != 0) goto L_0x00e7
            boolean r28 = r7.C(r1)
            if (r28 == 0) goto L_0x00e3
            r28 = r27
            goto L_0x00e5
        L_0x00e3:
            r28 = r26
        L_0x00e5:
            r4 = r4 | r28
        L_0x00e7:
            r28 = r8 & 64
            r29 = 524288(0x80000, float:7.34684E-40)
            r30 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00f6
            r31 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r31
            r1 = r74
            goto L_0x0109
        L_0x00f6:
            r31 = r11 & r30
            r1 = r74
            if (r31 != 0) goto L_0x0109
            boolean r32 = r7.C(r1)
            if (r32 == 0) goto L_0x0105
            r32 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0107
        L_0x0105:
            r32 = r29
        L_0x0107:
            r4 = r4 | r32
        L_0x0109:
            r1 = r8 & 128(0x80, float:1.794E-43)
            r32 = 4194304(0x400000, float:5.877472E-39)
            r33 = 8388608(0x800000, float:1.17549435E-38)
            if (r1 == 0) goto L_0x0118
            r34 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r34
            r2 = r75
            goto L_0x012d
        L_0x0118:
            r34 = 29360128(0x1c00000, float:7.052966E-38)
            r34 = r11 & r34
            r2 = r75
            if (r34 != 0) goto L_0x012d
            boolean r34 = r7.C(r2)
            if (r34 == 0) goto L_0x0129
            r34 = r33
            goto L_0x012b
        L_0x0129:
            r34 = r32
        L_0x012b:
            r4 = r4 | r34
        L_0x012d:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r34 = 33554432(0x2000000, float:9.403955E-38)
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 == 0) goto L_0x013c
            r36 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r36
            r3 = r76
            goto L_0x0151
        L_0x013c:
            r36 = 234881024(0xe000000, float:1.5777218E-30)
            r36 = r11 & r36
            r3 = r76
            if (r36 != 0) goto L_0x0151
            boolean r36 = r7.C(r3)
            if (r36 == 0) goto L_0x014d
            r36 = r35
            goto L_0x014f
        L_0x014d:
            r36 = r34
        L_0x014f:
            r4 = r4 | r36
        L_0x0151:
            r3 = r8 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x015c
            r36 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r36
            r6 = r77
            goto L_0x0171
        L_0x015c:
            r36 = 1879048192(0x70000000, float:1.58456325E29)
            r36 = r11 & r36
            r6 = r77
            if (r36 != 0) goto L_0x0171
            boolean r37 = r7.C(r6)
            if (r37 == 0) goto L_0x016d
            r37 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x016f
        L_0x016d:
            r37 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x016f:
            r4 = r4 | r37
        L_0x0171:
            r6 = r8 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x017a
            r37 = r10 | 6
            r11 = r78
            goto L_0x0190
        L_0x017a:
            r37 = r10 & 14
            r11 = r78
            if (r37 != 0) goto L_0x018e
            boolean r37 = r7.C(r11)
            if (r37 == 0) goto L_0x0189
            r37 = 4
            goto L_0x018b
        L_0x0189:
            r37 = 2
        L_0x018b:
            r37 = r10 | r37
            goto L_0x0190
        L_0x018e:
            r37 = r10
        L_0x0190:
            r11 = r8 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x0199
            r37 = r37 | 48
        L_0x0196:
            r15 = r37
            goto L_0x01ad
        L_0x0199:
            r38 = r10 & 112(0x70, float:1.57E-43)
            r15 = r79
            if (r38 != 0) goto L_0x0196
            boolean r38 = r7.C(r15)
            if (r38 == 0) goto L_0x01a8
            r38 = 32
            goto L_0x01aa
        L_0x01a8:
            r38 = 16
        L_0x01aa:
            r37 = r37 | r38
            goto L_0x0196
        L_0x01ad:
            r37 = r11
            r11 = r8 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L_0x01ba
            r15 = r15 | 384(0x180, float:5.38E-43)
            r38 = r11
        L_0x01b7:
            r11 = r80
            goto L_0x01cf
        L_0x01ba:
            r38 = r11
            r11 = r10 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x01b7
            r11 = r80
            boolean r39 = r7.C(r11)
            if (r39 == 0) goto L_0x01cb
            r39 = r16
            goto L_0x01cd
        L_0x01cb:
            r39 = 128(0x80, float:1.794E-43)
        L_0x01cd:
            r15 = r15 | r39
        L_0x01cf:
            r11 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01da
            r15 = r15 | 3072(0xc00, float:4.305E-42)
            r39 = r11
        L_0x01d7:
            r11 = r81
            goto L_0x01ef
        L_0x01da:
            r39 = r11
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01d7
            r11 = r81
            boolean r40 = r7.C(r11)
            if (r40 == 0) goto L_0x01eb
            r40 = r19
            goto L_0x01ed
        L_0x01eb:
            r40 = r18
        L_0x01ed:
            r15 = r15 | r40
        L_0x01ef:
            r11 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01fa
            r15 = r15 | 24576(0x6000, float:3.4438E-41)
        L_0x01f5:
            r40 = r11
            r11 = r82
            goto L_0x0212
        L_0x01fa:
            r40 = 57344(0xe000, float:8.0356E-41)
            r40 = r10 & r40
            if (r40 != 0) goto L_0x01f5
            r40 = r11
            r11 = r82
            boolean r41 = r7.C(r11)
            if (r41 == 0) goto L_0x020e
            r41 = r23
            goto L_0x0210
        L_0x020e:
            r41 = r22
        L_0x0210:
            r15 = r15 | r41
        L_0x0212:
            r41 = 32768(0x8000, float:4.5918E-41)
            r41 = r8 & r41
            if (r41 == 0) goto L_0x021e
            r41 = 196608(0x30000, float:2.75506E-40)
        L_0x021b:
            r15 = r15 | r41
            goto L_0x0230
        L_0x021e:
            r41 = 458752(0x70000, float:6.42848E-40)
            r41 = r10 & r41
            if (r41 != 0) goto L_0x0230
            boolean r41 = r7.C(r14)
            if (r41 == 0) goto L_0x022d
            r41 = r27
            goto L_0x021b
        L_0x022d:
            r41 = r26
            goto L_0x021b
        L_0x0230:
            r41 = r8 & r26
            if (r41 == 0) goto L_0x023b
            r42 = 1572864(0x180000, float:2.204052E-39)
            r15 = r15 | r42
            r11 = r84
            goto L_0x024e
        L_0x023b:
            r42 = r10 & r30
            r11 = r84
            if (r42 != 0) goto L_0x024e
            boolean r42 = r7.C(r11)
            if (r42 == 0) goto L_0x024a
            r42 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x024c
        L_0x024a:
            r42 = r29
        L_0x024c:
            r15 = r15 | r42
        L_0x024e:
            r42 = r8 & r27
            if (r42 == 0) goto L_0x0259
            r43 = 12582912(0xc00000, float:1.7632415E-38)
            r15 = r15 | r43
            r11 = r85
            goto L_0x026e
        L_0x0259:
            r43 = 29360128(0x1c00000, float:7.052966E-38)
            r43 = r10 & r43
            r11 = r85
            if (r43 != 0) goto L_0x026e
            boolean r43 = r7.C(r11)
            if (r43 == 0) goto L_0x026a
            r43 = r33
            goto L_0x026c
        L_0x026a:
            r43 = r32
        L_0x026c:
            r15 = r15 | r43
        L_0x026e:
            r43 = 262144(0x40000, float:3.67342E-40)
            r43 = r8 & r43
            if (r43 == 0) goto L_0x027b
            r44 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r15 | r44
            r11 = r86
            goto L_0x0290
        L_0x027b:
            r44 = 234881024(0xe000000, float:1.5777218E-30)
            r44 = r10 & r44
            r11 = r86
            if (r44 != 0) goto L_0x0290
            boolean r44 = r7.C(r11)
            if (r44 == 0) goto L_0x028c
            r44 = r35
            goto L_0x028e
        L_0x028c:
            r44 = r34
        L_0x028e:
            r15 = r15 | r44
        L_0x0290:
            r44 = r8 & r29
            if (r44 == 0) goto L_0x029d
            r45 = 805306368(0x30000000, float:4.656613E-10)
            r15 = r15 | r45
            r10 = r87
        L_0x029a:
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x02b3
        L_0x029d:
            r45 = 1879048192(0x70000000, float:1.58456325E29)
            r45 = r10 & r45
            r10 = r87
            if (r45 != 0) goto L_0x029a
            boolean r45 = r7.C(r10)
            if (r45 == 0) goto L_0x02ae
            r45 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x02b0
        L_0x02ae:
            r45 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x02b0:
            r15 = r15 | r45
            goto L_0x029a
        L_0x02b3:
            r45 = r8 & r31
            if (r45 == 0) goto L_0x02bc
            r46 = r9 | 6
        L_0x02b9:
            r10 = r46
            goto L_0x02d1
        L_0x02bc:
            r46 = r9 & 14
            r10 = r88
            if (r46 != 0) goto L_0x02d0
            boolean r46 = r7.C(r10)
            if (r46 == 0) goto L_0x02cb
            r46 = 4
            goto L_0x02cd
        L_0x02cb:
            r46 = 2
        L_0x02cd:
            r46 = r9 | r46
            goto L_0x02b9
        L_0x02d0:
            r10 = r9
        L_0x02d1:
            r46 = r8 & r32
            if (r46 == 0) goto L_0x02da
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x02d7:
            r11 = r90
            goto L_0x02eb
        L_0x02da:
            r11 = r9 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x02d7
            r11 = r90
            boolean r47 = r7.C(r11)
            if (r47 == 0) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            r16 = 128(0x80, float:1.794E-43)
        L_0x02e9:
            r10 = r10 | r16
        L_0x02eb:
            r16 = r8 & r33
            if (r16 == 0) goto L_0x02f4
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x02f1:
            r11 = r91
            goto L_0x0304
        L_0x02f4:
            r11 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x02f1
            r11 = r91
            boolean r20 = r7.C(r11)
            if (r20 == 0) goto L_0x0302
            r18 = r19
        L_0x0302:
            r10 = r10 | r18
        L_0x0304:
            r18 = 16777216(0x1000000, float:2.3509887E-38)
            r18 = r8 & r18
            if (r18 == 0) goto L_0x030f
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            r11 = r92
            goto L_0x0322
        L_0x030f:
            r19 = 57344(0xe000, float:8.0356E-41)
            r19 = r9 & r19
            r11 = r92
            if (r19 != 0) goto L_0x0322
            boolean r19 = r7.C(r11)
            if (r19 == 0) goto L_0x0320
            r22 = r23
        L_0x0320:
            r10 = r10 | r22
        L_0x0322:
            r19 = r8 & r34
            if (r19 == 0) goto L_0x032d
            r20 = 196608(0x30000, float:2.75506E-40)
            r10 = r10 | r20
            r11 = r93
            goto L_0x033f
        L_0x032d:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r9 & r20
            r11 = r93
            if (r20 != 0) goto L_0x033f
            boolean r20 = r7.C(r11)
            if (r20 == 0) goto L_0x033d
            r26 = r27
        L_0x033d:
            r10 = r10 | r26
        L_0x033f:
            r20 = r8 & r35
            if (r20 == 0) goto L_0x0348
            r20 = 1572864(0x180000, float:2.204052E-39)
            r10 = r10 | r20
            goto L_0x0356
        L_0x0348:
            r20 = r9 & r30
            if (r20 != 0) goto L_0x0356
            boolean r20 = r7.C(r13)
            if (r20 == 0) goto L_0x0354
            r29 = 1048576(0x100000, float:1.469368E-39)
        L_0x0354:
            r10 = r10 | r29
        L_0x0356:
            r20 = 134217728(0x8000000, float:3.85186E-34)
            r20 = r8 & r20
            if (r20 == 0) goto L_0x0361
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r10 | r20
            goto L_0x0371
        L_0x0361:
            r20 = 29360128(0x1c00000, float:7.052966E-38)
            r20 = r9 & r20
            if (r20 != 0) goto L_0x0371
            boolean r20 = r7.C(r12)
            if (r20 == 0) goto L_0x036f
            r32 = r33
        L_0x036f:
            r10 = r10 | r32
        L_0x0371:
            r20 = 268435456(0x10000000, float:2.5243549E-29)
            r20 = r8 & r20
            if (r20 == 0) goto L_0x0380
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r10 = r10 | r22
            r11 = r96
        L_0x037d:
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0393
        L_0x0380:
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            r22 = r9 & r22
            r11 = r96
            if (r22 != 0) goto L_0x037d
            boolean r22 = r7.C(r11)
            if (r22 == 0) goto L_0x0390
            r34 = r35
        L_0x0390:
            r10 = r10 | r34
            goto L_0x037d
        L_0x0393:
            r23 = r8 & r22
            if (r23 == 0) goto L_0x039e
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r10 = r10 | r22
            r9 = r97
            goto L_0x03b3
        L_0x039e:
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            r22 = r9 & r22
            r9 = r97
            if (r22 != 0) goto L_0x03b3
            boolean r22 = r7.S(r9)
            if (r22 == 0) goto L_0x03af
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b1
        L_0x03af:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x03b1:
            r10 = r10 | r22
        L_0x03b3:
            r22 = 1073741824(0x40000000, float:2.0)
            r22 = r8 & r22
            if (r22 == 0) goto L_0x03be
            r26 = r103 | 6
            r9 = r98
            goto L_0x03d4
        L_0x03be:
            r26 = r103 & 14
            r9 = r98
            if (r26 != 0) goto L_0x03d2
            boolean r26 = r7.C(r9)
            if (r26 == 0) goto L_0x03cd
            r26 = 4
            goto L_0x03cf
        L_0x03cd:
            r26 = 2
        L_0x03cf:
            r26 = r103 | r26
            goto L_0x03d4
        L_0x03d2:
            r26 = r103
        L_0x03d4:
            r27 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r27
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r9) goto L_0x0438
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r15
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r9) goto L_0x0438
            r4 = 1533916811(0x5b6db68b, float:6.6910278E16)
            r4 = r4 & r10
            r9 = 306783362(0x12492482, float:6.3469416E-28)
            if (r4 != r9) goto L_0x0438
            r4 = r26 & 11
            r9 = 2
            if (r4 != r9) goto L_0x0438
            boolean r4 = r7.i()
            if (r4 != 0) goto L_0x03fc
            goto L_0x0438
        L_0x03fc:
            r7.I()
            r1 = r68
            r3 = r70
            r4 = r71
            r5 = r72
            r6 = r73
            r8 = r75
            r9 = r76
            r10 = r77
            r12 = r79
            r13 = r80
            r14 = r81
            r15 = r82
            r17 = r84
            r18 = r85
            r19 = r86
            r20 = r87
            r21 = r88
            r22 = r89
            r23 = r90
            r24 = r91
            r25 = r92
            r26 = r93
            r30 = r97
            r31 = r98
            r2 = r7
            r29 = r11
            r7 = r74
            r11 = r78
            goto L_0x0840
        L_0x0438:
            if (r0 == 0) goto L_0x043f
            k0.i$a r0 = k0.i.f23074a
            r47 = r0
            goto L_0x0441
        L_0x043f:
            r47 = r68
        L_0x0441:
            if (r5 == 0) goto L_0x0465
            r0 = 1612221385(0x60188bc9, float:4.39684E19)
            r7.T(r0)
            java.lang.Object r0 = r7.A()
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x045d
            V.K0 r0 = new V.K0
            r0.<init>()
            r7.r(r0)
        L_0x045d:
            V.K0 r0 = (V.K0) r0
            r7.M()
            r48 = r0
            goto L_0x0467
        L_0x0465:
            r48 = r70
        L_0x0467:
            if (r17 == 0) goto L_0x0471
            io.intercom.android.sdk.m5.conversation.ui.q r0 = new io.intercom.android.sdk.m5.conversation.ui.q
            r0.<init>()
            r49 = r0
            goto L_0x0473
        L_0x0471:
            r49 = r71
        L_0x0473:
            if (r21 == 0) goto L_0x047d
            io.intercom.android.sdk.m5.conversation.ui.i r0 = new io.intercom.android.sdk.m5.conversation.ui.i
            r0.<init>()
            r50 = r0
            goto L_0x047f
        L_0x047d:
            r50 = r72
        L_0x047f:
            if (r25 == 0) goto L_0x0489
            io.intercom.android.sdk.m5.conversation.ui.r r0 = new io.intercom.android.sdk.m5.conversation.ui.r
            r0.<init>()
            r51 = r0
            goto L_0x048b
        L_0x0489:
            r51 = r73
        L_0x048b:
            if (r28 == 0) goto L_0x0495
            io.intercom.android.sdk.m5.conversation.ui.s r0 = new io.intercom.android.sdk.m5.conversation.ui.s
            r0.<init>()
            r52 = r0
            goto L_0x0497
        L_0x0495:
            r52 = r74
        L_0x0497:
            if (r1 == 0) goto L_0x04a1
            io.intercom.android.sdk.m5.conversation.ui.t r0 = new io.intercom.android.sdk.m5.conversation.ui.t
            r0.<init>()
            r53 = r0
            goto L_0x04a3
        L_0x04a1:
            r53 = r75
        L_0x04a3:
            if (r2 == 0) goto L_0x04ad
            io.intercom.android.sdk.m5.conversation.ui.u r0 = new io.intercom.android.sdk.m5.conversation.ui.u
            r0.<init>()
            r54 = r0
            goto L_0x04af
        L_0x04ad:
            r54 = r76
        L_0x04af:
            if (r3 == 0) goto L_0x04b9
            io.intercom.android.sdk.m5.conversation.ui.v r0 = new io.intercom.android.sdk.m5.conversation.ui.v
            r0.<init>()
            r55 = r0
            goto L_0x04bb
        L_0x04b9:
            r55 = r77
        L_0x04bb:
            if (r6 == 0) goto L_0x04c5
            io.intercom.android.sdk.m5.conversation.ui.w r0 = new io.intercom.android.sdk.m5.conversation.ui.w
            r0.<init>()
            r56 = r0
            goto L_0x04c7
        L_0x04c5:
            r56 = r78
        L_0x04c7:
            if (r37 == 0) goto L_0x04d1
            io.intercom.android.sdk.m5.conversation.ui.x r0 = new io.intercom.android.sdk.m5.conversation.ui.x
            r0.<init>()
            r37 = r0
            goto L_0x04d3
        L_0x04d1:
            r37 = r79
        L_0x04d3:
            if (r38 == 0) goto L_0x04dd
            io.intercom.android.sdk.m5.conversation.ui.y r0 = new io.intercom.android.sdk.m5.conversation.ui.y
            r0.<init>()
            r38 = r0
            goto L_0x04df
        L_0x04dd:
            r38 = r80
        L_0x04df:
            if (r39 == 0) goto L_0x04e9
            io.intercom.android.sdk.m5.conversation.ui.B r0 = new io.intercom.android.sdk.m5.conversation.ui.B
            r0.<init>()
            r39 = r0
            goto L_0x04eb
        L_0x04e9:
            r39 = r81
        L_0x04eb:
            if (r40 == 0) goto L_0x04f5
            io.intercom.android.sdk.m5.conversation.ui.M r0 = new io.intercom.android.sdk.m5.conversation.ui.M
            r0.<init>()
            r40 = r0
            goto L_0x04f7
        L_0x04f5:
            r40 = r82
        L_0x04f7:
            if (r41 == 0) goto L_0x0501
            io.intercom.android.sdk.m5.conversation.ui.Y r0 = new io.intercom.android.sdk.m5.conversation.ui.Y
            r0.<init>()
            r41 = r0
            goto L_0x0503
        L_0x0501:
            r41 = r84
        L_0x0503:
            if (r42 == 0) goto L_0x050d
            io.intercom.android.sdk.m5.conversation.ui.j0 r0 = new io.intercom.android.sdk.m5.conversation.ui.j0
            r0.<init>()
            r42 = r0
            goto L_0x050f
        L_0x050d:
            r42 = r85
        L_0x050f:
            if (r43 == 0) goto L_0x0519
            io.intercom.android.sdk.m5.conversation.ui.n0 r0 = new io.intercom.android.sdk.m5.conversation.ui.n0
            r0.<init>()
            r43 = r0
            goto L_0x051b
        L_0x0519:
            r43 = r86
        L_0x051b:
            if (r44 == 0) goto L_0x0525
            io.intercom.android.sdk.m5.conversation.ui.o0 r0 = new io.intercom.android.sdk.m5.conversation.ui.o0
            r0.<init>()
            r44 = r0
            goto L_0x0527
        L_0x0525:
            r44 = r87
        L_0x0527:
            if (r45 == 0) goto L_0x0531
            io.intercom.android.sdk.m5.conversation.ui.p0 r0 = new io.intercom.android.sdk.m5.conversation.ui.p0
            r0.<init>()
            r45 = r0
            goto L_0x0533
        L_0x0531:
            r45 = r88
        L_0x0533:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0540
            io.intercom.android.sdk.m5.conversation.ui.q0 r0 = new io.intercom.android.sdk.m5.conversation.ui.q0
            r0.<init>()
            r57 = r0
            goto L_0x0542
        L_0x0540:
            r57 = r89
        L_0x0542:
            if (r46 == 0) goto L_0x054c
            io.intercom.android.sdk.m5.conversation.ui.g r0 = new io.intercom.android.sdk.m5.conversation.ui.g
            r0.<init>()
            r46 = r0
            goto L_0x054e
        L_0x054c:
            r46 = r90
        L_0x054e:
            if (r16 == 0) goto L_0x0558
            io.intercom.android.sdk.m5.conversation.ui.h r0 = new io.intercom.android.sdk.m5.conversation.ui.h
            r0.<init>()
            r58 = r0
            goto L_0x055a
        L_0x0558:
            r58 = r91
        L_0x055a:
            if (r18 == 0) goto L_0x0564
            io.intercom.android.sdk.m5.conversation.ui.j r0 = new io.intercom.android.sdk.m5.conversation.ui.j
            r0.<init>()
            r59 = r0
            goto L_0x0566
        L_0x0564:
            r59 = r92
        L_0x0566:
            if (r19 == 0) goto L_0x0570
            io.intercom.android.sdk.m5.conversation.ui.k r0 = new io.intercom.android.sdk.m5.conversation.ui.k
            r0.<init>()
            r60 = r0
            goto L_0x0572
        L_0x0570:
            r60 = r93
        L_0x0572:
            if (r20 == 0) goto L_0x057c
            io.intercom.android.sdk.m5.conversation.ui.l r0 = new io.intercom.android.sdk.m5.conversation.ui.l
            r0.<init>()
            r61 = r0
            goto L_0x057e
        L_0x057c:
            r61 = r11
        L_0x057e:
            if (r23 == 0) goto L_0x0583
            r0 = 0
            r15 = r0
            goto L_0x0585
        L_0x0583:
            r15 = r97
        L_0x0585:
            if (r22 == 0) goto L_0x058f
            io.intercom.android.sdk.m5.conversation.ui.m r0 = new io.intercom.android.sdk.m5.conversation.ui.m
            r0.<init>()
            r62 = r0
            goto L_0x0591
        L_0x058f:
            r62 = r98
        L_0x0591:
            java.lang.Object r0 = r7.A()
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x05ac
            qf.h r0 = qf.h.f72645a
            Ug.K r0 = Y.P.j(r0, r7)
            Y.B r2 = new Y.B
            r2.<init>(r0)
            r7.r(r2)
            r0 = r2
        L_0x05ac:
            Y.B r0 = (Y.B) r0
            Ug.K r9 = r0.a()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r3 = 0
            androidx.compose.foundation.o r11 = androidx.compose.foundation.m.a(r0, r7, r2, r3)
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.o()
            java.lang.Object r0 = r7.m(r0)
            r63 = r0
            androidx.compose.ui.platform.m1 r63 = (androidx.compose.ui.platform.C1651m1) r63
            Y.A1 r64 = io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt.keyboardAsState(r7, r3)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            io.intercom.android.sdk.m5.conversation.ui.n r4 = new io.intercom.android.sdk.m5.conversation.ui.n
            r4.<init>()
            r5 = 3080(0xc08, float:4.316E-42)
            r6 = 6
            r16 = 0
            r17 = 0
            r70 = r0
            r71 = r16
            r72 = r17
            r73 = r4
            r74 = r7
            r75 = r5
            r76 = r6
            java.lang.Object r0 = h0.C2018b.e(r70, r71, r72, r73, r74, r75, r76)
            r6 = r0
            Y.r0 r6 = (Y.C1510r0) r6
            r0 = 0
            r5 = 1
            r4 = 2
            V.E0 r18 = V.C1386i0.l(r5, r0, r7, r2, r4)
            Y.I0 r0 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r0 = r7.m(r0)
            c1.d r0 = (c1.d) r0
            float r2 = JumpToBottomScrollOffset
            float r0 = r0.t1(r2)
            Y.I0 r2 = androidx.compose.ui.platform.C1644k0.e()
            java.lang.Object r2 = r7.m(r2)
            c1.d r2 = (c1.d) r2
            float r4 = LazyListJumpToBottomScrollOffset
            float r2 = r2.t1(r4)
            Y.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r7.m(r4)
            android.content.Context r4 = (android.content.Context) r4
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            float r3 = r4.fontScale
            r78 = r6
            double r5 = (double) r3
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0634
            r3 = 1
            goto L_0x0635
        L_0x0634:
            r3 = 0
        L_0x0635:
            int r4 = r4.orientation
            r5 = 2
            if (r4 != r5) goto L_0x063c
            r4 = 1
            goto L_0x063d
        L_0x063c:
            r4 = 0
        L_0x063d:
            if (r15 == 0) goto L_0x06aa
            boolean r5 = getLazyMessageListEnabled()
            if (r5 == 0) goto L_0x06aa
            r0 = -1557781914(0xffffffffa3262266, float:-9.006162E-18)
            r7.T(r0)
            r0 = 1612318190(0x601a05ee, float:4.4394154E19)
            r7.T(r0)
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r10
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 != r5) goto L_0x065a
            r0 = 1
            goto L_0x065b
        L_0x065a:
            r0 = 0
        L_0x065b:
            boolean r5 = r7.c(r2)
            r0 = r0 | r5
            r5 = r10 & r30
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r6) goto L_0x0668
            r5 = 1
            goto L_0x0669
        L_0x0668:
            r5 = 0
        L_0x0669:
            r0 = r0 | r5
            boolean r5 = r7.b(r4)
            r0 = r0 | r5
            boolean r5 = r7.b(r3)
            r0 = r0 | r5
            java.lang.Object r5 = r7.A()
            if (r0 != 0) goto L_0x0680
            java.lang.Object r0 = r1.a()
            if (r5 != r0) goto L_0x0697
        L_0x0680:
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1 r5 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$26$1
            r0 = 0
            r70 = r5
            r71 = r15
            r72 = r2
            r73 = r94
            r74 = r4
            r75 = r3
            r76 = r0
            r70.<init>(r71, r72, r73, r74, r75, r76)
            r7.r(r5)
        L_0x0697:
            yf.p r5 = (yf.p) r5
            r7.M()
            int r0 = r10 >> 27
            r0 = r0 & 14
            r0 = r0 | 64
            Y.P.g(r15, r5, r7, r0)
            r7.M()
            goto L_0x072d
        L_0x06aa:
            r2 = -1556738361(0xffffffffa3360ec7, float:-9.869369E-18)
            r7.T(r2)
            int r2 = r11.n()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.intercom.android.sdk.m5.conversation.utils.KeyboardState r5 = ConversationScreenContent$lambda$71(r64)
            boolean r5 = r5.isVisible()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            int r6 = r11.m()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 1612355604(0x601a9814, float:4.4558703E19)
            r7.T(r8)
            boolean r8 = r7.S(r11)
            boolean r16 = r7.c(r0)
            r8 = r8 | r16
            r10 = r10 & r30
            r12 = 1048576(0x100000, float:1.469368E-39)
            if (r10 != r12) goto L_0x06e4
            r10 = 1
            goto L_0x06e5
        L_0x06e4:
            r10 = 0
        L_0x06e5:
            r8 = r8 | r10
            boolean r10 = r7.b(r4)
            r8 = r8 | r10
            boolean r10 = r7.b(r3)
            r8 = r8 | r10
            java.lang.Object r10 = r7.A()
            if (r8 != 0) goto L_0x06fc
            java.lang.Object r1 = r1.a()
            if (r10 != r1) goto L_0x0713
        L_0x06fc:
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1 r10 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$27$1
            r1 = 0
            r70 = r10
            r71 = r11
            r72 = r0
            r73 = r94
            r74 = r4
            r75 = r3
            r76 = r1
            r70.<init>(r71, r72, r73, r74, r75, r76)
            r7.r(r10)
        L_0x0713:
            r0 = r10
            yf.p r0 = (yf.p) r0
            r7.M()
            r1 = 4096(0x1000, float:5.74E-42)
            r70 = r2
            r71 = r5
            r72 = r6
            r73 = r0
            r74 = r7
            r75 = r1
            Y.P.e(r70, r71, r72, r73, r74, r75)
            r7.M()
        L_0x072d:
            r0 = 1612388912(0x601b1a30, float:4.4705193E19)
            r7.T(r0)
            java.lang.Object r0 = r78.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0795
            k0.i$a r0 = k0.i.f23074a
            k0.i r17 = C.j0.e(r0)
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r7, r1)
            long r21 = r0.m678getBackground0d7_KjU()
            io.intercom.android.sdk.m5.conversation.ui.o r0 = new io.intercom.android.sdk.m5.conversation.ui.o
            r16 = r0
            r6 = r78
            r0.<init>(r9, r6)
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$29 r29 = io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$29.INSTANCE
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$30 r0 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$30
            r70 = r0
            r71 = r69
            r72 = r59
            r73 = r54
            r74 = r56
            r75 = r9
            r76 = r6
            r77 = r53
            r70.<init>(r71, r72, r73, r74, r75, r76, r77)
            r1 = 54
            r2 = 1243776177(0x4a2284b1, float:2662700.2)
            r5 = 1
            g0.a r31 = g0.c.e(r2, r5, r0, r7, r1)
            r34 = 384(0x180, float:5.38E-43)
            r35 = 3032(0xbd8, float:4.249E-42)
            r19 = 0
            r20 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r33 = 0
            r32 = r7
            V.C1386i0.a(r16, r17, r18, r19, r20, r21, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0798
        L_0x0795:
            r6 = r78
            r5 = 1
        L_0x0798:
            r7.M()
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31 r12 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31
            r0 = r12
            r1 = r47
            r2 = r69
            r3 = r39
            r4 = r45
            r10 = r5
            r5 = r46
            r16 = r6
            r6 = r60
            r8 = r7
            r7 = r38
            r65 = r8
            r8 = r63
            r10 = r16
            r17 = r11
            r11 = r64
            r66 = r12
            r12 = r52
            r13 = r83
            r14 = r61
            r31 = r15
            r15 = r62
            r16 = r43
            r18 = r51
            r19 = r55
            r20 = r37
            r21 = r48
            r22 = r40
            r23 = r31
            r24 = r49
            r25 = r50
            r26 = r41
            r27 = r42
            r28 = r44
            r29 = r58
            r30 = r95
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 54
            r1 = -243643368(0xfffffffff17a4c18, float:-1.2394119E30)
            r2 = r65
            r4 = r66
            r3 = 1
            g0.a r0 = g0.c.e(r1, r3, r4, r2, r0)
            r1 = 3072(0xc00, float:4.305E-42)
            r3 = 7
            r4 = 0
            r5 = 0
            r6 = 0
            r70 = r4
            r71 = r5
            r72 = r6
            r73 = r0
            r74 = r2
            r75 = r1
            r76 = r3
            C.C1087e.a(r70, r71, r72, r73, r74, r75, r76)
            r30 = r31
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r17 = r41
            r18 = r42
            r19 = r43
            r20 = r44
            r21 = r45
            r23 = r46
            r1 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r11 = r56
            r22 = r57
            r24 = r58
            r25 = r59
            r26 = r60
            r29 = r61
            r31 = r62
        L_0x0840:
            Y.Y0 r2 = r2.k()
            if (r2 == 0) goto L_0x0868
            io.intercom.android.sdk.m5.conversation.ui.p r0 = new io.intercom.android.sdk.m5.conversation.ui.p
            r68 = r0
            r67 = r2
            r2 = r69
            r16 = r83
            r27 = r94
            r28 = r95
            r32 = r100
            r33 = r101
            r34 = r102
            r35 = r103
            r36 = r104
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r68
            r0 = r67
            r0.a(r1)
        L_0x0868:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.ConversationScreenContent(k0.i, io.intercom.android.sdk.m5.conversation.states.ConversationUiState, V.K0, yf.l, yf.l, yf.p, yf.l, yf.l, yf.l, yf.a, yf.l, yf.a, yf.a, yf.a, yf.a, yf.a, yf.l, yf.l, yf.a, yf.l, yf.a, yf.l, yf.l, yf.l, yf.l, yf.l, yf.l, yf.p, yf.l, D.A, yf.a, Y.m, int, int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void ConversationScreenContent$hideBottomSheet(K k10, C1510r0 r0Var) {
        C5600w0 unused = C5576k.d(k10, (g) null, (Ug.M) null, new ConversationScreenKt$ConversationScreenContent$hideBottomSheet$1(r0Var, (C6658d<? super ConversationScreenKt$ConversationScreenContent$hideBottomSheet$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void ConversationScreenContent$hideKeyboardAndShowBottomSheet(C1651m1 m1Var, K k10, C1510r0 r0Var, A1 a12) {
        if (m1Var != null) {
            m1Var.a();
        }
        C5600w0 unused = C5576k.d(k10, (g) null, (Ug.M) null, new ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1(r0Var, a12, (C6658d<? super ConversationScreenKt$ConversationScreenContent$hideKeyboardAndShowBottomSheet$1>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$47(ReplySuggestion replySuggestion) {
        C6496s.h(replySuggestion, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$48(ReplyOption replyOption) {
        C6496s.h(replyOption, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$49(String str, TextInputSource textInputSource) {
        C6496s.h(str, "<unused var>");
        C6496s.h(textInputSource, "<unused var>");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$50(ComposerInputType composerInputType) {
        C6496s.h(composerInputType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$51(Block block) {
        C6496s.h(block, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$52(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$53() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$54(List list) {
        C6496s.h(list, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$55() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$56() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$57() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$58() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$59(Part part) {
        C6496s.h(part, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$60(PendingMessage.FailedImageUploadData failedImageUploadData) {
        C6496s.h(failedImageUploadData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$61() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$62(AttributeData attributeData) {
        C6496s.h(attributeData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$63() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$64(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$65(HeaderMenuItem headerMenuItem) {
        C6496s.h(headerMenuItem, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$66(TicketType ticketType) {
        C6496s.h(ticketType, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$67(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$68(MetricData metricData) {
        C6496s.h(metricData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$69(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$70() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final KeyboardState ConversationScreenContent$lambda$71(A1 a12) {
        return (KeyboardState) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C1510r0 ConversationScreenContent$lambda$72() {
        return u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$77(K k10, C1510r0 r0Var) {
        C6496s.h(k10, "$coroutineScope");
        C6496s.h(r0Var, "$openBottomSheet");
        ConversationScreenContent$hideBottomSheet(k10, r0Var);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContent$lambda$78(i iVar, ConversationUiState conversationUiState, K0 k02, C6798l lVar, C6798l lVar2, p pVar, C6798l lVar3, C6798l lVar4, C6798l lVar5, C6787a aVar, C6798l lVar6, C6787a aVar2, C6787a aVar3, C6787a aVar4, C6787a aVar5, C6787a aVar6, C6798l lVar7, C6798l lVar8, C6787a aVar7, C6798l lVar9, C6787a aVar8, C6798l lVar10, C6798l lVar11, C6798l lVar12, C6798l lVar13, C6798l lVar14, C6798l lVar15, p pVar2, C6798l lVar16, A a10, C6787a aVar9, int i10, int i11, int i12, int i13, int i14, C1500m mVar, int i15) {
        i iVar2 = iVar;
        ConversationUiState conversationUiState2 = conversationUiState;
        C6496s.h(conversationUiState2, "$uiState");
        C6496s.h(aVar6, "$onNewConversationClicked");
        C6496s.h(lVar15, "$onConversationScrolled");
        C6496s.h(pVar2, "$onJumpToBottomButtonClicked");
        i iVar3 = iVar;
        ConversationUiState conversationUiState3 = conversationUiState2;
        ConversationScreenContent(iVar3, conversationUiState3, k02, lVar, lVar2, pVar, lVar3, lVar4, lVar5, aVar, lVar6, aVar2, aVar3, aVar4, aVar5, aVar6, lVar7, lVar8, aVar7, lVar9, aVar8, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, pVar2, lVar16, a10, aVar9, mVar, M0.a(i10 | 1), M0.a(i11), M0.a(i12), M0.a(i13), i14);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void ConversationScreenContent$showBottomSheet(K k10, C1510r0 r0Var) {
        C5600w0 unused = C5576k.d(k10, (g) null, (Ug.M) null, new ConversationScreenKt$ConversationScreenContent$showBottomSheet$1(r0Var, (C6658d<? super ConversationScreenKt$ConversationScreenContent$showBottomSheet$1>) null), 3, (Object) null);
    }

    @IntercomPreviews
    private static final void ConversationScreenContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1340943046);
        if (i10 != 0 || !h10.i()) {
            List e10 = C6565s.e(new Header.Expanded.Body(Header.Expanded.Style.CAPTION, "Active 15m ago", (String) null));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar create = Avatar.create("", "M");
            C6496s.g(create, "create(...)");
            AvatarWrapper avatarWrapper = new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null);
            Avatar create2 = Avatar.create("", "S");
            C6496s.g(create2, "create(...)");
            AvatarWrapper avatarWrapper2 = new AvatarWrapper(create2, false, 2, (DefaultConstructorMarker) null);
            Avatar create3 = Avatar.create("", "D");
            C6496s.g(create3, "create(...)");
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(1448885348, true, new ConversationScreenKt$ConversationScreenContentPreview$1(new ExpandedTeamPresenceState("Banana", e10, avatarType, C6565s.q(avatarWrapper, avatarWrapper2, new AvatarWrapper(create3, false, 2, (DefaultConstructorMarker) null)), C6565s.n(), C6565s.n(), false)), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new m0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationScreenContentPreview$lambda$80(int i10, C1500m mVar, int i11) {
        ConversationScreenContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void NewConversationScreenContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1946511650);
        if (i10 != 0 || !h10.i()) {
            List e10 = C6565s.e(new Header.Expanded.Body(Header.Expanded.Style.CAPTION, "Active 15m ago", (String) null));
            AvatarType avatarType = AvatarType.LAYERED_BUBBLES;
            Avatar create = Avatar.create("", "S");
            C6496s.g(create, "create(...)");
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(-2080970892, true, new ConversationScreenKt$NewConversationScreenContentPreview$1(new ExpandedTeamPresenceState("Banana", e10, avatarType, C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null)), C6565s.n(), C6565s.n(), false)), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6171f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NewConversationScreenContentPreview$lambda$81(int i10, C1500m mVar, int i11) {
        NewConversationScreenContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final boolean getLazyMessageListEnabled() {
        if (Injector.isNotInitialised()) {
            return false;
        }
        return Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.LAZY_MESSAGES_LIST_ENABLED);
    }

    /* access modifiers changed from: private */
    public static final N getPaddingValuesForComposer(N n10, BottomBarUiState bottomBarUiState, C1500m mVar, int i10) {
        mVar.T(-849083091);
        if ((bottomBarUiState.getComposerState() instanceof ComposerState.TextInput) || (bottomBarUiState.getComposerState() instanceof ComposerState.VoiceInput)) {
            t tVar = (t) mVar.m(C1644k0.k());
            n10 = n.d(n.g(n10, tVar), n10.d(), n.f(n10, tVar), h.j(m.c(h.j(n10.a() - MessageComposerKt.getComposerHalfSize()), h.j((float) 0))));
        }
        mVar.M();
        return n10;
    }

    /* access modifiers changed from: private */
    public static final boolean isLazyListScrolled(List<? extends k> list, float f10, int i10) {
        int i11;
        boolean z10;
        k kVar = (k) C6565s.B0(list);
        if (kVar != null) {
            i11 = kVar.getIndex();
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object next : C6565s.N0(list)) {
            k kVar2 = (k) next;
            if (((float) i12) <= f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            i12 += kVar2.getSize();
            if (!z10) {
                break;
            }
            arrayList.add(next);
        }
        if (i10 - i11 > arrayList.size()) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: yf.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object showNetworkMessage(io.intercom.android.sdk.m5.conversation.states.NetworkState r9, V.K0 r10, android.content.Context r11, yf.C6787a r12, qf.C6658d<? super lf.C6514M> r13) {
        /*
            boolean r0 = r13 instanceof io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1 r0 = (io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1 r0 = new io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$showNetworkMessage$1
            r0.<init>(r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r6.result
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r3) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            java.lang.Object r9 = r6.L$0
            r12 = r9
            yf.a r12 = (yf.C6787a) r12
            lf.w.b(r13)
            goto L_0x00a8
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            lf.w.b(r13)
            goto L_0x006e
        L_0x0040:
            lf.w.b(r13)
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Connected r13 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Connected.INSTANCE
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r13 != 0) goto L_0x00b4
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Disconnected r13 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Disconnected.INSTANCE
            boolean r13 = kotlin.jvm.internal.C6496s.c(r9, r13)
            java.lang.String r1 = "getString(...)"
            if (r13 == 0) goto L_0x0071
            int r9 = io.intercom.android.sdk.R.string.intercom_no_network_connection
            java.lang.String r2 = r11.getString(r9)
            kotlin.jvm.internal.C6496s.g(r2, r1)
            V.I0 r5 = V.I0.Indefinite
            r6.label = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            r1 = r10
            java.lang.Object r9 = V.K0.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L_0x006e
            return r0
        L_0x006e:
            lf.M r9 = lf.C6514M.f71813a
            return r9
        L_0x0071:
            io.intercom.android.sdk.m5.conversation.states.NetworkState$Reconnected r13 = io.intercom.android.sdk.m5.conversation.states.NetworkState.Reconnected.INSTANCE
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 == 0) goto L_0x00ae
            int r9 = io.intercom.android.sdk.R.string.intercom_connected
            java.lang.String r9 = r11.getString(r9)
            kotlin.jvm.internal.C6496s.g(r9, r1)
            V.I0 r5 = V.I0.Long
            int r13 = io.intercom.android.sdk.R.string.intercom_dismiss
            java.lang.String r11 = r11.getString(r13)
            kotlin.jvm.internal.C6496s.g(r11, r1)
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r3 = r11.toUpperCase(r13)
            java.lang.String r11 = "toUpperCase(...)"
            kotlin.jvm.internal.C6496s.g(r3, r11)
            r6.L$0 = r12
            r6.label = r2
            r4 = 0
            r7 = 4
            r8 = 0
            r1 = r10
            r2 = r9
            java.lang.Object r13 = V.K0.f(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L_0x00a8
            return r0
        L_0x00a8:
            V.M0 r13 = (V.M0) r13
            r12.invoke()
            goto L_0x00b4
        L_0x00ae:
            lf.s r9 = new lf.s
            r9.<init>()
            throw r9
        L_0x00b4:
            lf.M r9 = lf.C6514M.f71813a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt.showNetworkMessage(io.intercom.android.sdk.m5.conversation.states.NetworkState, V.K0, android.content.Context, yf.a, qf.d):java.lang.Object");
    }
}
