package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fHB¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "suggestion", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendSuggestionUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    public SendSuggestionUseCase(ConversationRepository conversationRepository2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        C6496s.h(soundEffectsUseCase2, "soundEffectsUseCase");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.conversationRepository = conversationRepository2;
        this.soundEffectsUseCase = soundEffectsUseCase2;
        this.userIdentity = userIdentity2;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r32, io.intercom.android.sdk.m5.conversation.states.ReplySuggestion r33, qf.C6658d<? super lf.C6514M> r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r34
            boolean r3 = r2 instanceof io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1 r3 = (io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1 r3 = new io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase$invoke$1
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = rf.C6680b.f()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L_0x0040
            if (r5 != r6) goto L_0x0038
            java.lang.Object r1 = r3.L$1
            Xg.x r1 = (Xg.x) r1
            java.lang.Object r3 = r3.L$0
            io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase r3 = (io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase) r3
            lf.w.b(r2)
            goto L_0x0113
        L_0x0038:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0040:
            lf.w.b(r2)
            io.intercom.android.sdk.blocks.BlockFactory r2 = new io.intercom.android.sdk.blocks.BlockFactory
            io.intercom.android.sdk.blocks.logic.TextSplittingStrategy r5 = new io.intercom.android.sdk.blocks.logic.TextSplittingStrategy
            r5.<init>()
            r2.<init>(r5)
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r5, r7)
        L_0x005a:
            java.lang.Object r7 = r32.getValue()
            r10 = r7
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            r8 = r10
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r9 = r11
            r11.<init>()
            java.util.Map r10 = r10.getPendingMessages()
            r11.putAll(r10)
            io.intercom.android.sdk.models.Part$Builder r10 = new io.intercom.android.sdk.models.Part$Builder
            r10.<init>()
            java.lang.String r12 = r33.getText()
            java.util.List r12 = r2.getBlocksForText(r12)
            io.intercom.android.sdk.models.Part$Builder r10 = r10.withBlocks(r12)
            io.intercom.android.sdk.models.Part$Builder r10 = r10.withClientAssignedUuid(r5)
            io.intercom.android.sdk.models.Part r13 = r10.build()
            io.intercom.android.sdk.models.Participant$Builder r10 = new io.intercom.android.sdk.models.Participant$Builder
            r10.<init>()
            io.intercom.android.sdk.identity.UserIdentity r12 = r0.userIdentity
            java.lang.String r12 = r12.getIntercomId()
            io.intercom.android.sdk.models.Participant$Builder r10 = r10.withId(r12)
            io.intercom.android.sdk.models.Participant r10 = r10.build()
            r13.setParticipant(r10)
            io.intercom.android.sdk.models.Part$MessageState r10 = io.intercom.android.sdk.models.Part.MessageState.SENDING
            r13.setMessageState(r10)
            lf.M r10 = lf.C6514M.f71813a
            java.lang.String r10 = "apply(...)"
            kotlin.jvm.internal.C6496s.g(r13, r10)
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r10 = new io.intercom.android.sdk.m5.conversation.states.PendingMessage
            r14 = 0
            r15 = 0
            r16 = 4
            r17 = 0
            r12 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r11.put(r5, r10)
            r29 = 1048574(0xffffe, float:1.469365E-39)
            r30 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r8 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r7 = r1.e(r7, r8)
            if (r7 == 0) goto L_0x0182
            java.lang.Object r2 = r32.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r2
            io.intercom.android.sdk.models.Conversation r2 = r2.getConversation()
            if (r2 != 0) goto L_0x017f
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r2 = r0.conversationRepository
            java.lang.String r5 = r33.getId()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r7 = r0.intercomDataLayer
            io.intercom.android.sdk.models.OpenMessengerResponse r7 = r7.getOpenResponse()
            if (r7 == 0) goto L_0x0104
            java.lang.String r7 = r7.getRequestId()
            goto L_0x0105
        L_0x0104:
            r7 = 0
        L_0x0105:
            r3.L$0 = r0
            r3.L$1 = r1
            r3.label = r6
            java.lang.Object r2 = r2.createConversationFromSuggestion(r5, r7, r3)
            if (r2 != r4) goto L_0x0112
            return r4
        L_0x0112:
            r3 = r0
        L_0x0113:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r2
            boolean r4 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r4 != 0) goto L_0x0178
            boolean r4 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r4 != 0) goto L_0x0178
            boolean r4 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r4 == 0) goto L_0x0122
            goto L_0x0178
        L_0x0122:
            boolean r4 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r4 == 0) goto L_0x0172
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r3 = r3.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r4 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_SENT
            r3.invoke$intercom_sdk_base_release(r4)
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r2
            java.lang.Object r2 = r2.getBody()
            io.intercom.android.sdk.models.Conversation r2 = (io.intercom.android.sdk.models.Conversation) r2
        L_0x0135:
            java.lang.Object r5 = r1.getValue()
            r3 = r5
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r3
            java.util.Map r4 = mf.O.i()
            java.lang.String r6 = r2.getId()
            r24 = 1048568(0xffff8, float:1.469357E-39)
            r25 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r0 = r5
            r5 = r2
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r1.e(r0, r3)
            if (r0 == 0) goto L_0x016f
            goto L_0x017f
        L_0x016f:
            r0 = r31
            goto L_0x0135
        L_0x0172:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        L_0x0178:
            io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase r0 = r3.soundEffectsUseCase
            io.intercom.android.sdk.m5.conversation.usecase.Action r1 = io.intercom.android.sdk.m5.conversation.usecase.Action.MESSAGE_FAILED
            r0.invoke$intercom_sdk_base_release(r1)
        L_0x017f:
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x0182:
            r0 = r31
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase.invoke(Xg.x, io.intercom.android.sdk.m5.conversation.states.ReplySuggestion, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SendSuggestionUseCase(ConversationRepository conversationRepository2, SoundEffectsUseCase soundEffectsUseCase2, UserIdentity userIdentity2, IntercomDataLayer intercomDataLayer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository2, soundEffectsUseCase2, (i10 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity2, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer2);
    }
}
