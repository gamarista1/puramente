package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.ConversationEndedButton;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.models.PrivacyNotice;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¨\u0006\u0010"}, d2 = {"reduceComposerState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "isNewConversation", "", "reduceBottomBadge", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState$BottomBadgeState;", "reduceTextInput", "Lio/intercom/android/sdk/m5/conversation/states/ComposerState;", "currentState", "placeholder", "", "isDisabled", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposerStateReducerKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversationEndedButton.Reason.values().length];
            try {
                iArr[ConversationEndedButton.Reason.MERGED_INTO_CONVERSATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final BottomBarUiState.BottomBadgeState reduceBottomBadge(ConversationClientState conversationClientState) {
        PoweredBy poweredBy;
        PrivacyNotice privacyNotice = null;
        if (conversationClientState.getConversation() == null) {
            OpenMessengerResponse openMessengerResponse = conversationClientState.getOpenMessengerResponse();
            if (openMessengerResponse != null) {
                poweredBy = openMessengerResponse.getPoweredBy();
            } else {
                poweredBy = null;
            }
        } else {
            poweredBy = conversationClientState.getConversation().getPoweredBy();
        }
        OpenMessengerResponse openMessengerResponse2 = conversationClientState.getOpenMessengerResponse();
        if (openMessengerResponse2 != null) {
            privacyNotice = openMessengerResponse2.getPrivacyNotice();
        }
        if (privacyNotice != null && !privacyNotice.isDismissed() && !conversationClientState.hasUserSentAMessage$intercom_sdk_base_release() && !conversationClientState.getDismissedPrivacyNotice()) {
            return new BottomBarUiState.BottomBadgeState.PrivacyNoticeBadgeState(privacyNotice.getText());
        }
        if (poweredBy != null) {
            return new BottomBarUiState.BottomBadgeState.PoweredByBadgeState(poweredBy);
        }
        return BottomBarUiState.BottomBadgeState.None.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final io.intercom.android.sdk.m5.conversation.states.BottomBarUiState reduceComposerState(io.intercom.android.sdk.m5.conversation.states.ConversationClientState r13, io.intercom.android.sdk.identity.AppConfig r14, boolean r15) {
        /*
            java.lang.String r0 = "clientState"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            io.intercom.android.sdk.models.Conversation r0 = r13.getConversation()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0046
            io.intercom.android.sdk.models.OpenMessengerResponse r0 = r13.getOpenMessengerResponse()
            if (r0 == 0) goto L_0x002d
            io.intercom.android.sdk.models.ComposerSuggestions r0 = r0.getComposerSuggestions()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isComposerDisabled()
            if (r0 != r2) goto L_0x002d
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden r15 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden
            r15.<init>(r1, r2, r3)
        L_0x002a:
            r2 = r15
            goto L_0x0188
        L_0x002d:
            io.intercom.android.sdk.m5.conversation.states.ComposerState r0 = r13.getComposerState()
            io.intercom.android.sdk.models.OpenMessengerResponse r2 = r13.getOpenMessengerResponse()
            if (r2 == 0) goto L_0x0041
            io.intercom.android.sdk.models.ComposerState r2 = r2.getComposerState()
            if (r2 == 0) goto L_0x0041
            java.lang.String r3 = r2.getPlaceholder()
        L_0x0041:
            io.intercom.android.sdk.m5.conversation.states.ComposerState r15 = reduceTextInput(r0, r15, r3, r1)
            goto L_0x002a
        L_0x0046:
            boolean r4 = io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt.canStartNewConversation(r14)
            if (r4 == 0) goto L_0x0054
            boolean r4 = r0.getInboundConversationsDisabled()
            if (r4 != 0) goto L_0x0054
            r4 = r2
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            io.intercom.android.sdk.models.OpenMessengerResponse r5 = r13.getOpenMessengerResponse()
            if (r5 == 0) goto L_0x0066
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData r5 = r5.getNewConversationData()
            if (r5 == 0) goto L_0x0066
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r5 = r5.getCta()
            goto L_0x0067
        L_0x0066:
            r5 = r3
        L_0x0067:
            if (r4 == 0) goto L_0x0091
            if (r5 == 0) goto L_0x0091
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta r4 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta
            io.intercom.android.sdk.ui.common.StringProvider$ActualString r7 = new io.intercom.android.sdk.ui.common.StringProvider$ActualString
            java.lang.String r6 = r5.getText()
            r7.<init>(r6)
            io.intercom.android.sdk.models.OpenMessengerResponse$IconType r5 = r5.getIcon()
            java.lang.Integer r5 = r5.getIcon()
            if (r5 == 0) goto L_0x0086
            int r5 = r5.intValue()
        L_0x0084:
            r8 = r5
            goto L_0x0089
        L_0x0086:
            int r5 = io.intercom.android.sdk.R.drawable.intercom_send_message_icon
            goto L_0x0084
        L_0x0089:
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0092
        L_0x0091:
            r4 = r3
        L_0x0092:
            io.intercom.android.sdk.models.Part r5 = r0.lastPart()
            io.intercom.android.sdk.models.ReactionReply r5 = r5.getReactionReply()
            boolean r5 = io.intercom.android.sdk.models.ReactionReply.isNull(r5)
            boolean r6 = r0.getPreventEndUserReplies()
            if (r6 == 0) goto L_0x0106
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded r15 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded
            io.intercom.android.sdk.ui.common.StringProvider$StringRes r1 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
            int r5 = io.intercom.android.sdk.R.string.intercom_conversation_has_ended
            r6 = 2
            r1.<init>(r5, r3, r6, r3)
            r15.<init>(r1, r4)
            io.intercom.android.sdk.models.ConversationEndedButton r0 = r0.getConversationEndedButton()
            if (r0 == 0) goto L_0x002a
            io.intercom.android.sdk.models.ConversationEndedButton$Reason r1 = r0.getReason()
            int[] r4 = io.intercom.android.sdk.m5.conversation.reducers.ComposerStateReducerKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r4[r1]
            if (r1 != r2) goto L_0x00f2
            io.intercom.android.sdk.models.ConversationEndedButton$Metadata r1 = r0.getMetadata()
            if (r1 != 0) goto L_0x00cc
            goto L_0x00e4
        L_0x00cc:
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta r3 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded$ConversationEndedCta
            io.intercom.android.sdk.ui.common.StringProvider$ActualString r1 = new io.intercom.android.sdk.ui.common.StringProvider$ActualString
            java.lang.String r2 = r0.getCtaTitle()
            r1.<init>(r2)
            int r2 = io.intercom.android.sdk.R.drawable.intercom_send_message_icon
            io.intercom.android.sdk.models.ConversationEndedButton$Metadata r4 = r0.getMetadata()
            java.lang.String r4 = r4.getMergedIntoConversationId()
            r3.<init>(r1, r2, r4)
        L_0x00e4:
            io.intercom.android.sdk.ui.common.StringProvider$ActualString r1 = new io.intercom.android.sdk.ui.common.StringProvider$ActualString
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded r0 = r15.copy(r1, r3)
            goto L_0x00ff
        L_0x00f2:
            io.intercom.android.sdk.ui.common.StringProvider$ActualString r1 = new io.intercom.android.sdk.ui.common.StringProvider$ActualString
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            io.intercom.android.sdk.m5.conversation.states.ComposerState$ConversationEnded r0 = io.intercom.android.sdk.m5.conversation.states.ComposerState.ConversationEnded.copy$default(r15, r1, r3, r6, r3)
        L_0x00ff:
            if (r0 != 0) goto L_0x0103
            goto L_0x002a
        L_0x0103:
            r15 = r0
            goto L_0x002a
        L_0x0106:
            io.intercom.android.sdk.models.ComposerState r3 = r0.getComposerState()
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L_0x012c
            if (r5 == 0) goto L_0x012c
            io.intercom.android.sdk.m5.conversation.states.ComposerState r1 = r13.getComposerState()
            io.intercom.android.sdk.models.ComposerState r2 = r0.getComposerState()
            java.lang.String r2 = r2.getPlaceholder()
            io.intercom.android.sdk.models.ComposerState r0 = r0.getComposerState()
            boolean r0 = r0.isDisabled()
            io.intercom.android.sdk.m5.conversation.states.ComposerState r15 = reduceTextInput(r1, r15, r2, r0)
            goto L_0x002a
        L_0x012c:
            if (r5 != 0) goto L_0x0153
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions r15 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$Reactions
            io.intercom.android.sdk.models.Part r1 = r0.lastPart()
            io.intercom.android.sdk.models.ReactionReply r1 = r1.getReactionReply()
            java.lang.String r2 = "getReactionReply(...)"
            kotlin.jvm.internal.C6496s.g(r1, r2)
            io.intercom.android.sdk.models.Part r2 = r0.lastPart()
            java.lang.String r2 = r2.getId()
            java.lang.String r3 = "getId(...)"
            kotlin.jvm.internal.C6496s.g(r2, r3)
            java.lang.String r0 = r0.getId()
            r15.<init>(r1, r2, r0)
            goto L_0x002a
        L_0x0153:
            java.util.List r15 = r0.parts()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            boolean r0 = r15 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0167
            r0 = r15
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0167
            goto L_0x0180
        L_0x0167:
            java.util.Iterator r15 = r15.iterator()
        L_0x016b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r0 = r15.next()
            io.intercom.android.sdk.models.Part r0 = (io.intercom.android.sdk.models.Part) r0
            io.intercom.android.sdk.models.MessageStyle r0 = r0.getMessageStyle()
            io.intercom.android.sdk.models.MessageStyle r3 = io.intercom.android.sdk.models.MessageStyle.ATTRIBUTE_COLLECTOR
            if (r0 != r3) goto L_0x016b
            r1 = r2
        L_0x0180:
            r15 = r1 ^ 1
            io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden r0 = new io.intercom.android.sdk.m5.conversation.states.ComposerState$Hidden
            r0.<init>(r15)
            r2 = r0
        L_0x0188:
            java.util.List r15 = mf.C6565s.c()
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r0 = r0.getGifsEnabled()
            if (r0 == 0) goto L_0x019b
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState$BottomBarButton$GifInsert r0 = io.intercom.android.sdk.m5.conversation.states.BottomBarUiState.BottomBarButton.GifInsert.INSTANCE
            r15.add(r0)
        L_0x019b:
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r0 = r0.getMediaEnabled()
            if (r0 != 0) goto L_0x01b9
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r0 = r0.getCameraEnabled()
            if (r0 != 0) goto L_0x01b9
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r0 = r0.getFilesEnabled()
            if (r0 == 0) goto L_0x01be
        L_0x01b9:
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState$BottomBarButton$MediaInsert r0 = io.intercom.android.sdk.m5.conversation.states.BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE
            r15.add(r0)
        L_0x01be:
            java.util.List r5 = mf.C6565s.a(r15)
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState r15 = new io.intercom.android.sdk.m5.conversation.states.BottomBarUiState
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r3 = r13.getCurrentlyTypingState()
            io.intercom.android.sdk.m5.conversation.states.InputTypeState r4 = new io.intercom.android.sdk.m5.conversation.states.InputTypeState
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r7 = r0.getMediaEnabled()
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r8 = r0.getGifsEnabled()
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r9 = r0.getCameraEnabled()
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            boolean r10 = r0.getFilesEnabled()
            io.intercom.android.sdk.models.AttachmentSettings r0 = r14.getAttachmentSettings()
            java.util.Set r11 = r0.getTrustedFileExtensions()
            boolean r12 = r14.getFinDictationUiEnabled()
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r6 = r14.getFinDictationUiEnabled()
            io.intercom.android.sdk.m5.conversation.states.BottomBarUiState$BottomBadgeState r7 = reduceBottomBadge(r13)
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.reducers.ComposerStateReducerKt.reduceComposerState(io.intercom.android.sdk.m5.conversation.states.ConversationClientState, io.intercom.android.sdk.identity.AppConfig, boolean):io.intercom.android.sdk.m5.conversation.states.BottomBarUiState");
    }

    private static final ComposerState reduceTextInput(ComposerState composerState, boolean z10, String str, boolean z11) {
        StringProvider stringProvider;
        String str2;
        if (!(composerState instanceof ComposerState.TextInput)) {
            return composerState;
        }
        ComposerState.TextInput textInput = (ComposerState.TextInput) composerState;
        if (str != null) {
            stringProvider = new StringProvider.ActualString(str);
        } else {
            stringProvider = new StringProvider.StringRes(R.string.intercom_message_placeholder, (List) null, 2, (DefaultConstructorMarker) null);
        }
        if (z10) {
            str2 = textInput.getInitialMessage();
        } else {
            str2 = "";
        }
        return textInput.copy(str2, stringProvider, z11);
    }
}
