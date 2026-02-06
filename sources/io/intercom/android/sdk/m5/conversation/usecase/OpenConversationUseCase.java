package io.intercom.android.sdk.m5.conversation.usecase;

import Xg.x;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.data.CommonRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHB¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase;", "", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "refreshUnreadConversationsCountUseCase", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;", "getConversationReason", "Llf/M;", "invoke", "(LXg/x;Lio/intercom/android/sdk/m5/conversation/data/GetConversationReason;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenConversationUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;

    public OpenConversationUseCase(RefreshConversationUseCase refreshConversationUseCase2, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2, CommonRepository commonRepository2) {
        C6496s.h(refreshConversationUseCase2, "refreshConversationUseCase");
        C6496s.h(refreshUnreadConversationsCountUseCase2, "refreshUnreadConversationsCountUseCase");
        C6496s.h(commonRepository2, "commonRepository");
        this.refreshConversationUseCase = refreshConversationUseCase2;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase2;
        this.commonRepository = commonRepository2;
    }

    public static /* synthetic */ Object invoke$default(OpenConversationUseCase openConversationUseCase, x xVar, GetConversationReason getConversationReason, C6658d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            getConversationReason = GetConversationReason.OPEN_CONVERSATION;
        }
        return openConversationUseCase.invoke(xVar, getConversationReason, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r35, io.intercom.android.sdk.m5.conversation.data.GetConversationReason r36, qf.C6658d<? super lf.C6514M> r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r37
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0060
            if (r4 == r7) goto L_0x004a
            if (r4 == r6) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            lf.w.b(r1)
            goto L_0x00f5
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            java.lang.Object r4 = r2.L$1
            Xg.x r4 = (Xg.x) r4
            java.lang.Object r6 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase r6 = (io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase) r6
            lf.w.b(r1)
            goto L_0x00e5
        L_0x004a:
            java.lang.Object r4 = r2.L$2
            io.intercom.android.sdk.m5.conversation.data.GetConversationReason r4 = (io.intercom.android.sdk.m5.conversation.data.GetConversationReason) r4
            java.lang.Object r7 = r2.L$1
            Xg.x r7 = (Xg.x) r7
            java.lang.Object r9 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase r9 = (io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase) r9
            lf.w.b(r1)
            r33 = r9
            r9 = r4
            r4 = r7
            r7 = r33
            goto L_0x0079
        L_0x0060:
            lf.w.b(r1)
            io.intercom.android.sdk.m5.data.CommonRepository r1 = r0.commonRepository
            r2.L$0 = r0
            r4 = r35
            r2.L$1 = r4
            r9 = r36
            r2.L$2 = r9
            r2.label = r7
            java.lang.Object r1 = r1.openMessenger(r2)
            if (r1 != r3) goto L_0x0078
            return r3
        L_0x0078:
            r7 = r0
        L_0x0079:
            io.intercom.android.sdk.models.OpenMessengerResponse r1 = (io.intercom.android.sdk.models.OpenMessengerResponse) r1
            java.lang.Object r10 = r4.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r10 = r10.getLastNetworkCall()
            if (r10 == 0) goto L_0x0098
            java.lang.Object r10 = r4.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r10 = r10.getLastNetworkCall()
            boolean r10 = r10 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r10 != 0) goto L_0x0098
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x0098:
            java.lang.Object r15 = r4.getValue()
            r10 = r15
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r10
            r31 = 1040255(0xfdf7f, float:1.457708E-39)
            r32 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r5 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r24 = r1
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r10 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r5 = r4.e(r5, r10)
            if (r5 == 0) goto L_0x00f8
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r1 = r7.refreshConversationUseCase
            r2.L$0 = r7
            r2.L$1 = r4
            r2.L$2 = r8
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r4, r9, r2)
            if (r1 != r3) goto L_0x00e4
            return r3
        L_0x00e4:
            r6 = r7
        L_0x00e5:
            io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase r1 = r6.refreshUnreadConversationsCountUseCase
            r2.L$0 = r8
            r2.L$1 = r8
            r5 = 3
            r2.label = r5
            java.lang.Object r1 = r1.invoke(r4, r2)
            if (r1 != r3) goto L_0x00f5
            return r3
        L_0x00f5:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x00f8:
            r5 = 3
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase.invoke(Xg.x, io.intercom.android.sdk.m5.conversation.data.GetConversationReason, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OpenConversationUseCase(io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r2, io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase r3, io.intercom.android.sdk.m5.data.CommonRepository r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r1 = this;
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0023
            io.intercom.android.sdk.m5.data.CommonRepository r4 = new io.intercom.android.sdk.m5.data.CommonRepository
            io.intercom.android.sdk.Injector r5 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.api.MessengerApi r5 = r5.getMessengerApi()
            java.lang.String r6 = "getMessengerApi(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            io.intercom.android.sdk.Injector r6 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r6 = r6.getDataLayer()
            java.lang.String r0 = "getDataLayer(...)"
            kotlin.jvm.internal.C6496s.g(r6, r0)
            r4.<init>(r5, r6)
        L_0x0023:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase.<init>(io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase, io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase, io.intercom.android.sdk.m5.data.CommonRepository, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
