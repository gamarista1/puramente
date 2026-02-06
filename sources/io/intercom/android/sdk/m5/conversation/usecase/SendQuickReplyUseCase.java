package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HB¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendQuickReplyUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/models/ReplyOption;", "replyOption", "Lio/intercom/android/sdk/models/Part;", "part", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/models/ReplyOption;Lio/intercom/android/sdk/models/Part;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "Lio/intercom/android/sdk/identity/UserIdentity;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendQuickReplyUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    public SendQuickReplyUseCase(ConversationRepository conversationRepository2, RefreshConversationUseCase refreshConversationUseCase2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        C6496s.h(refreshConversationUseCase2, "refreshConversationUseCase");
        C6496s.h(soundEffectsUseCase2, "soundEffectsUseCase");
        C6496s.h(userIdentity2, "userIdentity");
        this.conversationRepository = conversationRepository2;
        this.refreshConversationUseCase = refreshConversationUseCase2;
        this.soundEffectsUseCase = soundEffectsUseCase2;
        this.userIdentity = userIdentity2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r21, io.intercom.android.sdk.models.ReplyOption r22, io.intercom.android.sdk.models.Part r23, qf.C6658d<? super lf.C6514M> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r24
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = rf.C6680b.f()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x004b
            if (r3 == r4) goto L_0x0039
            if (r3 != r10) goto L_0x0031
            lf.w.b(r1)
            goto L_0x00fa
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            java.lang.Object r3 = r2.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.L$1
            Xg.x r4 = (Xg.x) r4
            java.lang.Object r5 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase r5 = (io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase) r5
            lf.w.b(r1)
            r11 = r4
            goto L_0x00cc
        L_0x004b:
            lf.w.b(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r1, r3)
            io.intercom.android.sdk.blocks.BlockFactory r3 = new io.intercom.android.sdk.blocks.BlockFactory
            io.intercom.android.sdk.blocks.logic.TextSplittingStrategy r5 = new io.intercom.android.sdk.blocks.logic.TextSplittingStrategy
            r5.<init>()
            r3.<init>(r5)
            java.lang.String r5 = r22.getText()
            java.lang.CharSequence r5 = Sg.p.g1(r5)
            java.lang.String r5 = r5.toString()
            java.util.List r13 = r3.getBlocksForText(r5)
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$Companion r11 = io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.Companion
            kotlin.jvm.internal.C6496s.e(r13)
            io.intercom.android.sdk.identity.UserIdentity r15 = r0.userIdentity
            r17 = 16
            r18 = 0
            r16 = 0
            r12 = r21
            r14 = r1
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.Companion.addBlocksToPendingMessages$default(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r21.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r3
            io.intercom.android.sdk.models.Conversation r3 = r3.getConversation()
            boolean r5 = r23.isInitialMessage()
            if (r5 != 0) goto L_0x009e
            java.lang.String r5 = r23.getId()
        L_0x009c:
            r6 = r5
            goto L_0x00a1
        L_0x009e:
            java.lang.String r5 = ""
            goto L_0x009c
        L_0x00a1:
            if (r3 == 0) goto L_0x010f
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r5 = r0.conversationRepository
            java.lang.String r7 = r22.getUuid()
            java.lang.String r8 = r3.getId()
            kotlin.jvm.internal.C6496s.e(r6)
            r2.L$0 = r0
            r11 = r21
            r2.L$1 = r11
            r2.L$2 = r1
            r2.label = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r7 = r1
            r8 = r2
            java.lang.Object r3 = r3.addQuickReplyToConversation(r4, r5, r6, r7, r8)
            if (r3 != r9) goto L_0x00c6
            return r9
        L_0x00c6:
            r5 = r0
            r19 = r3
            r3 = r1
            r1 = r19
        L_0x00cc:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r1
            boolean r4 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r4 != 0) goto L_0x0103
            boolean r4 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r4 != 0) goto L_0x0103
            boolean r4 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r4 == 0) goto L_0x00db
            goto L_0x0103
        L_0x00db:
            boolean r1 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r1 == 0) goto L_0x00fd
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r5.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r3 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_SENT
            r1.invoke$intercom_sdk_base_release(r3)
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r1 = r5.refreshConversationUseCase
            io.intercom.android.sdk.m5.conversation.data.GetConversationReason r3 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.NEW_COMMENT
            r4 = 0
            r2.L$0 = r4
            r2.L$1 = r4
            r2.L$2 = r4
            r2.label = r10
            java.lang.Object r1 = r1.invoke(r11, r3, r2)
            if (r1 != r9) goto L_0x00fa
            return r9
        L_0x00fa:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x00fd:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x0103:
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r1 = r5.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r2 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_FAILED
            r1.invoke$intercom_sdk_base_release(r2)
            io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase$Companion r1 = io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase.Companion
            r1.updateFailedPendingMessages(r11, r3)
        L_0x010f:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase.invoke(Xg.x, io.intercom.android.sdk.models.ReplyOption, io.intercom.android.sdk.models.Part, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendQuickReplyUseCase(ConversationRepository conversationRepository2, RefreshConversationUseCase refreshConversationUseCase2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, (i10 & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity2);
    }
}
