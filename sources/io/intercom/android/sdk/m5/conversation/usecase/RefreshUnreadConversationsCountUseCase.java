package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/m5/data/CommonRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Llf/M;", "invoke", "(LXg/x;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshUnreadConversationsCountUseCase {
    public static final int $stable = 8;
    private final CommonRepository commonRepository;
    private final IntercomDataLayer intercomDataLayer;

    public RefreshUnreadConversationsCountUseCase() {
        this((CommonRepository) null, (IntercomDataLayer) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r28, qf.C6658d<? super lf.C6514M> r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            boolean r2 = r1 instanceof io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1 r2 = (io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1 r2 = new io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = rf.C6680b.f()
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 != r5) goto L_0x0035
            java.lang.Object r3 = r2.L$1
            Xg.x r3 = (Xg.x) r3
            java.lang.Object r2 = r2.L$0
            io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase r2 = (io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase) r2
            lf.w.b(r1)
            goto L_0x0061
        L_0x0035:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003d:
            lf.w.b(r1)
            java.lang.Object r1 = r28.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r1 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r1
            io.intercom.android.sdk.m5.conversation.states.LaunchMode r1 = r1.getLaunchMode()
            io.intercom.android.sdk.m5.conversation.states.LaunchMode r4 = io.intercom.android.sdk.m5.conversation.states.LaunchMode.PROGRAMMATIC
            if (r1 != r4) goto L_0x00b5
            io.intercom.android.sdk.m5.data.CommonRepository r1 = r0.commonRepository
            r2.L$0 = r0
            r4 = r28
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r1.fetchUnreadCounts(r2)
            if (r1 != r3) goto L_0x005f
            return r3
        L_0x005f:
            r2 = r0
            r3 = r4
        L_0x0061:
            io.intercom.android.sdk.models.UsersResponse r1 = (io.intercom.android.sdk.models.UsersResponse) r1
            if (r1 != 0) goto L_0x0068
            lf.M r1 = lf.C6514M.f71813a
            return r1
        L_0x0068:
            io.intercom.android.sdk.m5.data.IntercomDataLayer r2 = r2.intercomDataLayer
            io.intercom.android.sdk.models.Config r4 = r1.getConfig()
            java.lang.String r5 = "getConfig(...)"
            kotlin.jvm.internal.C6496s.g(r4, r5)
            r2.updateConfig(r4)
        L_0x0076:
            java.lang.Object r2 = r3.getValue()
            r4 = r2
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r4
            io.intercom.android.sdk.models.ConversationList r5 = r1.getUnreadConversations()
            int r19 = r5.getUnreadConversationsCount()
            io.intercom.android.sdk.models.UnreadTickets r5 = r1.getUnreadTickets()
            int r20 = r5.getTotalCount()
            r25 = 999423(0xf3fff, float:1.40049E-39)
            r26 = 0
            r5 = 0
            r6 = 0
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
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r4 = io.intercom.android.sdk.m5.conversation.states.ConversationClientState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r2 = r3.e(r2, r4)
            if (r2 == 0) goto L_0x0076
        L_0x00b5:
            lf.M r1 = lf.C6514M.f71813a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase.invoke(Xg.x, qf.d):java.lang.Object");
    }

    public RefreshUnreadConversationsCountUseCase(CommonRepository commonRepository2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(commonRepository2, "commonRepository");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.commonRepository = commonRepository2;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RefreshUnreadConversationsCountUseCase(io.intercom.android.sdk.m5.data.CommonRepository r3, io.intercom.android.sdk.m5.data.IntercomDataLayer r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r2 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0023
            io.intercom.android.sdk.m5.data.CommonRepository r3 = new io.intercom.android.sdk.m5.data.CommonRepository
            io.intercom.android.sdk.Injector r6 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.api.MessengerApi r6 = r6.getMessengerApi()
            java.lang.String r0 = "getMessengerApi(...)"
            kotlin.jvm.internal.C6496s.g(r6, r0)
            io.intercom.android.sdk.Injector r0 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r0 = r0.getDataLayer()
            java.lang.String r1 = "getDataLayer(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            r3.<init>(r6, r0)
        L_0x0023:
            r5 = r5 & 2
            if (r5 == 0) goto L_0x002f
            io.intercom.android.sdk.Injector r4 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r4.getDataLayer()
        L_0x002f:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase.<init>(io.intercom.android.sdk.m5.data.CommonRepository, io.intercom.android.sdk.m5.data.IntercomDataLayer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
