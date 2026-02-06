package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bHB¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationRepository", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/models/Attribute;", "attribute", "", "partId", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/models/Attribute;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubmitAttributeUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public SubmitAttributeUseCase(ConversationRepository conversationRepository2) {
        C6496s.h(conversationRepository2, "conversationRepository");
        this.conversationRepository = conversationRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7 A[LOOP:2: B:34:0x00f7->B:47:0x0189, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r35, io.intercom.android.sdk.models.Attribute r36, java.lang.String r37, qf.C6658d<? super lf.C6514M> r38) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r38
            boolean r3 = r2 instanceof io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1
            if (r3 == 0) goto L_0x001a
            r3 = r2
            io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1 r3 = (io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.label = r4
        L_0x0018:
            r10 = r3
            goto L_0x0020
        L_0x001a:
            io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1 r3 = new io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase$invoke$1
            r3.<init>(r0, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r10.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r10.label
            r5 = 1
            if (r4 == 0) goto L_0x0044
            if (r4 != r5) goto L_0x003c
            java.lang.Object r1 = r10.L$1
            io.intercom.android.sdk.models.Attribute r1 = (io.intercom.android.sdk.models.Attribute) r1
            java.lang.Object r3 = r10.L$0
            Xg.x r3 = (Xg.x) r3
            lf.w.b(r2)
            r4 = r1
            r6 = r3
            goto L_0x00f1
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            lf.w.b(r2)
            java.lang.Object r2 = r35.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r2
            io.intercom.android.sdk.models.Conversation r2 = r2.getConversation()
            if (r2 != 0) goto L_0x0056
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x0056:
            java.lang.Object r4 = r35.getValue()
            r11 = r4
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r11 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r11
            java.util.List r6 = r11.getLoadingAttributeIdentifiers()
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r7 = r36.getIdentifier()
            java.util.List r23 = mf.C6565s.L0(r6, r7)
            java.util.List r6 = r11.getFailedAttributeIdentifiers()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x007a:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0095
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r12 = r36.getIdentifier()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r12)
            if (r9 != 0) goto L_0x007a
            r7.add(r8)
            goto L_0x007a
        L_0x0095:
            r32 = 1045503(0xff3ff, float:1.465062E-39)
            r33 = 0
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
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r22 = r7
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r6 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r4 = r1.e(r4, r6)
            if (r4 == 0) goto L_0x020f
            io.intercom.android.sdk.m5.conversation.data.ConversationRepository r4 = r0.conversationRepository
            java.lang.String r2 = r2.getId()
            java.lang.String r7 = r36.getIdentifier()
            java.lang.String r6 = r36.getValue()
            if (r6 != 0) goto L_0x00d8
            java.lang.String r6 = ""
        L_0x00d8:
            r8 = r6
            java.lang.String r9 = r36.getType()
            r10.L$0 = r1
            r11 = r36
            r10.L$1 = r11
            r10.label = r5
            r5 = r2
            r6 = r37
            java.lang.Object r2 = r4.submitForm(r5, r6, r7, r8, r9, r10)
            if (r2 != r3) goto L_0x00ef
            return r3
        L_0x00ef:
            r6 = r1
            r4 = r11
        L_0x00f1:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r2 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r2
            boolean r1 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r1 == 0) goto L_0x018d
        L_0x00f7:
            java.lang.Object r1 = r6.getValue()
            r7 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r7
            java.util.List r3 = r7.getFailedAttributeIdentifiers()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x010d:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0128
            java.lang.Object r8 = r3.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r4.getIdentifier()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)
            if (r9 != 0) goto L_0x010d
            r5.add(r8)
            goto L_0x010d
        L_0x0128:
            java.util.List r3 = r7.getLoadingAttributeIdentifiers()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0137:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0152
            java.lang.Object r8 = r3.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r4.getIdentifier()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)
            if (r9 != 0) goto L_0x0137
            r15.add(r8)
            goto L_0x0137
        L_0x0152:
            r3 = r2
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r3 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r3
            java.lang.Object r3 = r3.getBody()
            r9 = r3
            io.intercom.android.sdk.models.Conversation r9 = (io.intercom.android.sdk.models.Conversation) r9
            r28 = 1045501(0xff3fd, float:1.465059E-39)
            r29 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = 0
            r19 = r15
            r15 = r3
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r18 = r5
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r3 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r6.e(r1, r3)
            if (r1 == 0) goto L_0x00f7
            goto L_0x020c
        L_0x018d:
            boolean r1 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r1 != 0) goto L_0x01a0
            boolean r1 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r1 != 0) goto L_0x01a0
            boolean r1 = r2 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r1 == 0) goto L_0x019a
            goto L_0x01a0
        L_0x019a:
            lf.s r1 = new lf.s
            r1.<init>()
            throw r1
        L_0x01a0:
            java.lang.Object r1 = r6.getValue()
            r7 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r7
            java.util.List r2 = r7.getFailedAttributeIdentifiers()
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r3 = r4.getIdentifier()
            java.util.List r18 = mf.C6565s.L0(r2, r3)
            java.util.List r2 = r7.getLoadingAttributeIdentifiers()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01c4:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x01df
            java.lang.Object r5 = r2.next()
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r4.getIdentifier()
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)
            if (r8 != 0) goto L_0x01c4
            r3.add(r5)
            goto L_0x01c4
        L_0x01df:
            r28 = 1045503(0xff3ff, float:1.465062E-39)
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
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r19 = r3
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r6.e(r1, r2)
            if (r1 == 0) goto L_0x01a0
        L_0x020c:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x020f:
            r11 = r36
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase.invoke(Xg.x, io.intercom.android.sdk.models.Attribute, java.lang.String, qf.d):java.lang.Object");
    }
}
