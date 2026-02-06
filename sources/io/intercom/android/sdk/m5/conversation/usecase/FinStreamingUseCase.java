package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007HB¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;", "data", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;Lqf/d;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FinStreamingUseCase {
    public static final int $stable = 0;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e A[LOOP:0: B:20:0x006e->B:26:0x00ef, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r31, io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent.FinStreaming r32, qf.C6658d<? super lf.C6514M> r33) {
        /*
            r30 = this;
            r0 = r33
            boolean r1 = r0 instanceof io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1 r1 = (io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            r2 = r30
            goto L_0x001e
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1 r1 = new io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase$invoke$1
            r2 = r30
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r1.label
            r5 = 1
            if (r4 == 0) goto L_0x0040
            if (r4 != r5) goto L_0x0038
            java.lang.Object r3 = r1.L$1
            io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent$ConversationNexusEvent$FinStreaming r3 = (io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent.FinStreaming) r3
            java.lang.Object r1 = r1.L$0
            Xg.x r1 = (Xg.x) r1
            lf.w.b(r0)
            r0 = r1
            goto L_0x0057
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            lf.w.b(r0)
            r0 = r31
            r1.L$0 = r0
            r4 = r32
            r1.L$1 = r4
            r1.label = r5
            r6 = 100
            java.lang.Object r1 = Ug.V.a(r6, r1)
            if (r1 != r3) goto L_0x0056
            return r3
        L_0x0056:
            r3 = r4
        L_0x0057:
            int r1 = r3.getTokenSequenceIndex()
            java.lang.Object r4 = r0.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r4
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r4 = r4.getFinStreamingData()
            int r4 = r4.getTokenSequenceIndex()
            if (r1 >= r4) goto L_0x006e
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x006e:
            java.lang.Object r1 = r0.getValue()
            r6 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r6 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r6
            io.intercom.android.sdk.models.Conversation r7 = r6.getConversation()
            if (r7 == 0) goto L_0x00a6
            r28 = 983039(0xeffff, float:1.377531E-39)
            r29 = 0
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
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            io.intercom.android.sdk.models.Conversation r4 = io.intercom.android.sdk.models.Conversation.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x00a4:
            r8 = r4
            goto L_0x00a8
        L_0x00a6:
            r4 = 0
            goto L_0x00a4
        L_0x00a8:
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r4 = r6.getFinStreamingData()
            java.util.List r7 = r3.getBlocks()
            java.lang.String r9 = r3.getClientAssignedUUID()
            int r10 = r3.getTokenSequenceIndex()
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r19 = r4.copy(r5, r7, r9, r10)
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r11 = new io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState
            r10 = r11
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r15 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.NONE
            r16 = 7
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r27 = 1044469(0xfeff5, float:1.463613E-39)
            r28 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r1 = r0.e(r1, r4)
            if (r1 == 0) goto L_0x006e
            lf.M r0 = lf.C6514M.f71813a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase.invoke(Xg.x, io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent$ConversationNexusEvent$FinStreaming, qf.d):java.lang.Object");
    }
}
