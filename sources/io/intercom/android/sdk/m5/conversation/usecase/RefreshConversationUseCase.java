package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000fHB¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "trackLastReceivedPartsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "recordOpenedInteractionUseCase", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "getConversationReason", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshConversationUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;

    public RefreshConversationUseCase(ConversationRepository conversationRepository2, IntercomDataLayer intercomDataLayer2, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        C6496s.h(trackLastReceivedPartsUseCase2, "trackLastReceivedPartsUseCase");
        C6496s.h(recordOpenedInteractionUseCase2, "recordOpenedInteractionUseCase");
        this.conversationRepository = conversationRepository2;
        this.intercomDataLayer = intercomDataLayer2;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase2;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: io.intercom.android.sdk.models.Conversation} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022d A[EDGE_INSN: B:109:0x022d->B:77:0x022d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x027d A[LOOP:5: B:75:0x01e0->B:87:0x027d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r36, io.intercom.android.sdk.m5.conversation.data.GetConversationReason r37, qf.C6658d<? super lf.C6514M> r38) {
        /*
            r35 = this;
            r0 = r35
            r1 = r38
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x004d
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r3 = r2.L$1
            io.intercom.android.sdk.models.Conversation r3 = (io.intercom.android.sdk.models.Conversation) r3
            java.lang.Object r2 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r2 = (io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase) r2
            lf.w.b(r1)
            goto L_0x0266
        L_0x0039:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0041:
            java.lang.Object r4 = r2.L$1
            Xg.x r4 = (Xg.x) r4
            java.lang.Object r6 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r6 = (io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase) r6
            lf.w.b(r1)
            goto L_0x0071
        L_0x004d:
            lf.w.b(r1)
            java.lang.Object r1 = r36.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            java.lang.String r1 = r1.getConversationId()
            if (r1 == 0) goto L_0x02bf
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r4 = r0.conversationRepository
            r2.L$0 = r0
            r7 = r36
            r2.L$1 = r7
            r2.label = r6
            r6 = r37
            java.lang.Object r1 = r4.getConversation(r1, r6, r2)
            if (r1 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r6 = r0
            r4 = r7
        L_0x0071:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r1 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r1
            java.lang.Object r7 = r4.getValue()
            r15 = r7
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r15 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r15
            boolean r7 = r1 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r7 == 0) goto L_0x0285
            r7 = r1
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r7 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r7
            java.lang.Object r7 = r7.getBody()
            r9 = r7
            io.intercom.android.sdk.models.Conversation r9 = (io.intercom.android.sdk.models.Conversation) r9
            io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase r7 = r6.trackLastReceivedPartsUseCase
            r7.invoke(r9)
            java.util.Map r7 = r15.getPendingMessages()
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x009e:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x010b
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.util.List r11 = r9.parts()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x00be
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00be
            goto L_0x00ff
        L_0x00be:
            java.util.Iterator r11 = r11.iterator()
        L_0x00c2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ff
            java.lang.Object r12 = r11.next()
            io.intercom.android.sdk.models.Part r12 = (io.intercom.android.sdk.models.Part) r12
            java.lang.String r13 = r12.getUuid()
            java.lang.Object r14 = r10.getValue()
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r14 = (io.intercom.android.sdk.m5.conversation.states.PendingMessage) r14
            io.intercom.android.sdk.models.Part r14 = r14.getPart()
            java.lang.String r14 = r14.getUuid()
            boolean r13 = kotlin.jvm.internal.C6496s.c(r13, r14)
            if (r13 != 0) goto L_0x009e
            java.lang.String r12 = r12.getId()
            java.lang.Object r13 = r10.getValue()
            io.intercom.android.sdk.m5.conversation.states.PendingMessage r13 = (io.intercom.android.sdk.m5.conversation.states.PendingMessage) r13
            io.intercom.android.sdk.models.Part r13 = r13.getPart()
            java.lang.String r13 = r13.getId()
            boolean r12 = kotlin.jvm.internal.C6496s.c(r12, r13)
            if (r12 == 0) goto L_0x00c2
            goto L_0x009e
        L_0x00ff:
            java.lang.Object r11 = r10.getKey()
            java.lang.Object r10 = r10.getValue()
            r8.put(r11, r10)
            goto L_0x009e
        L_0x010b:
            java.util.List r7 = r9.parts()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r10 = r7 instanceof java.util.Collection
            if (r10 == 0) goto L_0x011f
            r10 = r7
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x011f
            goto L_0x015f
        L_0x011f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0123:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x015f
            java.lang.Object r10 = r7.next()
            io.intercom.android.sdk.models.Part r10 = (io.intercom.android.sdk.models.Part) r10
            java.lang.String r11 = r10.getUuid()
            java.lang.String r12 = "getUuid(...)"
            kotlin.jvm.internal.C6496s.g(r11, r12)
            boolean r11 = Sg.p.d0(r11)
            if (r11 != 0) goto L_0x0123
            java.lang.String r10 = r10.getUuid()
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r11 = r15.getFinStreamingData()
            java.lang.String r11 = r11.getClientAssignedUUID()
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r11)
            if (r10 == 0) goto L_0x0123
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r7 = new io.intercom.android.sdk.m5.conversation.states.FinStreamingData
            java.util.List r10 = mf.C6565s.n()
            java.lang.String r11 = ""
            r12 = 0
            r7.<init>(r12, r10, r11, r12)
        L_0x015c:
            r30 = r7
            goto L_0x0164
        L_0x015f:
            io.intercom.android.sdk.m5.conversation.states.FinStreamingData r7 = r15.getFinStreamingData()
            goto L_0x015c
        L_0x0164:
            java.util.List r7 = r9.parts()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0173:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x01ce
            java.lang.Object r11 = r7.next()
            r12 = r11
            io.intercom.android.sdk.models.Part r12 = (io.intercom.android.sdk.models.Part) r12
            boolean r13 = r12.isUser()
            if (r13 != 0) goto L_0x01cc
            io.intercom.android.sdk.models.Conversation r13 = r15.getConversation()
            if (r13 == 0) goto L_0x0191
            java.util.List r13 = r13.parts()
            goto L_0x0192
        L_0x0191:
            r13 = 0
        L_0x0192:
            if (r13 != 0) goto L_0x0198
            java.util.List r13 = mf.C6565s.n()
        L_0x0198:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            boolean r14 = r13 instanceof java.util.Collection
            if (r14 == 0) goto L_0x01a8
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x01a8
            goto L_0x01c9
        L_0x01a8:
            java.util.Iterator r13 = r13.iterator()
        L_0x01ac:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01c9
            java.lang.Object r14 = r13.next()
            io.intercom.android.sdk.models.Part r14 = (io.intercom.android.sdk.models.Part) r14
            java.lang.String r14 = r14.getId()
            java.lang.String r5 = r12.getId()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r14, r5)
            if (r5 == 0) goto L_0x01c7
            goto L_0x01cc
        L_0x01c7:
            r5 = 2
            goto L_0x01ac
        L_0x01c9:
            r10.add(r11)
        L_0x01cc:
            r5 = 2
            goto L_0x0173
        L_0x01ce:
            kotlin.Pair r5 = io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCaseKt.calculateJumpToBottomButtonState(r15, r9, r10)
            java.lang.Object r7 = r5.a()
            r31 = r7
            io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState r31 = (io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState) r31
            java.lang.Object r5 = r5.b()
            java.lang.String r5 = (java.lang.String) r5
        L_0x01e0:
            java.lang.Object r7 = r4.getValue()
            r10 = r7
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r16 = new io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState
            r11 = r16
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r20 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.NONE
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r28 = 847732(0xcef74, float:1.187926E-39)
            r29 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r32 = r7
            r7 = r15
            r33 = r8
            r36 = r9
            r34 = r15
            r15 = r1
            r20 = r30
            r24 = r31
            r25 = r5
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r8 = r32
            boolean r7 = r4.e(r8, r7)
            if (r7 == 0) goto L_0x027d
            io.intercom.android.sdk.m5.data.IntercomDataLayer r1 = r6.intercomDataLayer
            io.intercom.android.sdk.models.Ticket r4 = r36.getTicket()
            if (r4 != 0) goto L_0x023b
            io.intercom.android.sdk.models.Ticket$Companion r4 = io.intercom.android.sdk.models.Ticket.Companion
            io.intercom.android.sdk.models.Ticket r4 = r4.getNULL()
        L_0x023b:
            r1.updateTicket(r4)
            io.intercom.android.sdk.m5.data.IntercomDataLayer r1 = r6.intercomDataLayer
            r7 = r36
            r1.fetchConversationSuccess(r7)
            io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase r1 = r6.recordOpenedInteractionUseCase
            r1.invoke(r7)
            boolean r1 = r7.isRead()
            if (r1 != 0) goto L_0x02bf
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r1 = r6.conversationRepository
            java.lang.String r4 = r7.getId()
            r2.L$0 = r6
            r2.L$1 = r7
            r8 = 2
            r2.label = r8
            java.lang.Object r1 = r1.markAsRead(r4, r2)
            if (r1 != r3) goto L_0x0264
            return r3
        L_0x0264:
            r2 = r6
            r3 = r7
        L_0x0266:
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r1 = r2.conversationRepository
            io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository r1 = r1.nexusEventsRepository()
            java.lang.String r4 = r3.getId()
            r1.markAsSeen(r4)
            io.intercom.android.sdk.m5.data.IntercomDataLayer r1 = r2.intercomDataLayer
            java.lang.String r2 = r3.getId()
            r1.markConversationAsRead(r2)
            goto L_0x02bf
        L_0x027d:
            r9 = r36
            r8 = r33
            r15 = r34
            goto L_0x01e0
        L_0x0285:
            r34 = r15
        L_0x0287:
            java.lang.Object r2 = r4.getValue()
            r3 = r2
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r3
            r28 = 1048447(0xfff7f, float:1.469187E-39)
            r29 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
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
            r7 = r34
            r15 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r4.e(r2, r3)
            if (r2 == 0) goto L_0x0287
        L_0x02bf:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase.invoke(Xg.x, io.intercom.android.sdk.m5.conversation.data.GetConversationReason, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RefreshConversationUseCase(ConversationRepository conversationRepository2, IntercomDataLayer intercomDataLayer2, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository2, (i10 & 2) != 0 ? Injector.get().getDataLayer() : intercomDataLayer2, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2);
    }
}
