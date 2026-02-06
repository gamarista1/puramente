package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH@¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHB¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase;", "", "<init>", "()V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/models/Avatar;", "avatar", "", "isBot", "showAvatar", "Llf/M;", "sendAdminIndicator", "(LXg/x;Lio/intercom/android/sdk/models/Avatar;ZZLqf/d;)Ljava/lang/Object;", "invoke", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShowAdminIsTypingUseCase {
    public static final int $stable = 0;

    public static /* synthetic */ Object invoke$default(ShowAdminIsTypingUseCase showAdminIsTypingUseCase, x xVar, Avatar avatar, boolean z10, boolean z11, C6658d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return showAdminIsTypingUseCase.invoke(xVar, avatar, z12, z11, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object sendAdminIndicator(Xg.x r32, io.intercom.android.sdk.models.Avatar r33, boolean r34, boolean r35, qf.C6658d<? super lf.C6514M> r36) {
        /*
            r31 = this;
            r0 = r32
            r1 = r36
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1
            if (r2 == 0) goto L_0x0019
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.label = r3
            r3 = r31
            goto L_0x0020
        L_0x0019:
            io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase$sendAdminIndicator$1
            r3 = r31
            r2.<init>(r3, r1)
        L_0x0020:
            java.lang.Object r1 = r2.result
            java.lang.Object r4 = rf.C6680b.f()
            int r5 = r2.label
            r6 = 1
            if (r5 == 0) goto L_0x003f
            if (r5 != r6) goto L_0x0037
            java.lang.Object r0 = r2.L$0
            Xg.x r0 = (Xg.x) r0
            lf.w.b(r1)
        L_0x0034:
            r1 = r0
            goto L_0x00b1
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            lf.w.b(r1)
            java.lang.Object r1 = r32.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r1 = r1.getCurrentlyTypingState()
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r1 = r1.getUserType()
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r5 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.NONE
            if (r1 == r5) goto L_0x0057
            lf.M r0 = lf.C6514M.f71813a
            return r0
        L_0x0057:
            java.lang.Object r1 = r32.getValue()
            r7 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r7
            io.intercom.android.sdk.m5.components.avatar.AvatarWrapper r9 = new io.intercom.android.sdk.m5.components.avatar.AvatarWrapper
            r5 = r33
            r15 = r34
            r9.<init>(r5, r15)
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r12 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.ADMIN
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r30 = new io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState
            r13 = 4
            r14 = 0
            r11 = 0
            r8 = r30
            r10 = r35
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r28 = 1048567(0xffff7, float:1.469355E-39)
            r29 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = r11
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
            r11 = r30
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r7 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r0.e(r1, r7)
            if (r1 == 0) goto L_0x0057
            r2.L$0 = r0
            r2.label = r6
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = Ug.V.a(r5, r2)
            if (r1 != r4) goto L_0x0034
            return r4
        L_0x00b1:
            java.lang.Object r0 = r1.getValue()
            r4 = r0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r4
            io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState r9 = new io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState
            r8 = r9
            io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType r13 = io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType.NONE
            r14 = 7
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r25 = 1048567(0xffff7, float:1.469355E-39)
            r26 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
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
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r2 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = r1.e(r0, r2)
            if (r0 == 0) goto L_0x00b1
            lf.M r0 = lf.C6514M.f71813a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase.sendAdminIndicator(Xg.x, io.intercom.android.sdk.models.Avatar, boolean, boolean, qf.d):java.lang.Object");
    }

    public final Object invoke(x xVar, Avatar avatar, boolean z10, boolean z11, C6658d<? super C6514M> dVar) {
        boolean z12;
        if (!z11 || z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        Object sendAdminIndicator = sendAdminIndicator(xVar, avatar, z10, z12, dVar);
        if (sendAdminIndicator == C6680b.f()) {
            return sendAdminIndicator;
        }
        return C6514M.f71813a;
    }
}
