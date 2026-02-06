package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHB¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase;", "", "Lkotlin/Function0;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "timeProvider", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "refreshConversationUseCase", "<init>", "(Lyf/a;Lio/intercom/android/sdk/utilities/commons/TimeProvider;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;)V", "LXg/x;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "clientStateFlow", "Llf/M;", "invoke", "(LXg/x;Lqf/d;)Ljava/lang/Object;", "Lyf/a;", "getAppConfig", "()Lyf/a;", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "getTimeProvider", "()Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "getRefreshConversationUseCase", "()Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FallbackPollingUseCase {
    public static final int $stable = 8;
    private final C6787a appConfig;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final TimeProvider timeProvider;

    public FallbackPollingUseCase(C6787a aVar, TimeProvider timeProvider2, RefreshConversationUseCase refreshConversationUseCase2) {
        C6496s.h(aVar, "appConfig");
        C6496s.h(timeProvider2, "timeProvider");
        C6496s.h(refreshConversationUseCase2, "refreshConversationUseCase");
        this.appConfig = aVar;
        this.timeProvider = timeProvider2;
        this.refreshConversationUseCase = refreshConversationUseCase2;
    }

    /* access modifiers changed from: private */
    public static final AppConfig _init_$lambda$0() {
        return (AppConfig) Injector.get().getDataLayer().getConfig().getValue();
    }

    public final C6787a getAppConfig() {
        return this.appConfig;
    }

    public final RefreshConversationUseCase getRefreshConversationUseCase() {
        return this.refreshConversationUseCase;
    }

    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(Xg.x r13, qf.C6658d<? super lf.C6514M> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1 r0 = (io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1 r0 = new io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase$invoke$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r13 = r0.L$1
            Xg.x r13 = (Xg.x) r13
            java.lang.Object r2 = r0.L$0
            io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase r2 = (io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase) r2
            lf.w.b(r14)
            goto L_0x004d
        L_0x0034:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003c:
            java.lang.Object r13 = r0.L$1
            Xg.x r13 = (Xg.x) r13
            java.lang.Object r2 = r0.L$0
            io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase r2 = (io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase) r2
            lf.w.b(r14)
            goto L_0x00c7
        L_0x0049:
            lf.w.b(r14)
            r2 = r12
        L_0x004d:
            yf.a r14 = r2.appConfig
            java.lang.Object r14 = r14.invoke()
            io.intercom.android.sdk.identity.AppConfig r14 = (io.intercom.android.sdk.identity.AppConfig) r14
            io.intercom.android.sdk.models.ConversationStateSyncSettings r14 = r14.getConversationStateSyncSettings()
            boolean r14 = r14.getEnabled()
            if (r14 == 0) goto L_0x00e5
            java.lang.Object r14 = r13.getValue()
            io.intercom.android.sdk.m5.conversation.states.ConversationClientState r14 = (io.intercom.android.sdk.m5.conversation.states.ConversationClientState) r14
            io.intercom.android.sdk.models.Conversation r14 = r14.getConversation()
            r5 = 0
            if (r14 == 0) goto L_0x0090
            java.util.List r14 = r14.parts()
            if (r14 == 0) goto L_0x0090
            int r6 = r14.size()
            java.util.ListIterator r14 = r14.listIterator(r6)
        L_0x007a:
            boolean r6 = r14.hasPrevious()
            if (r6 == 0) goto L_0x008e
            java.lang.Object r6 = r14.previous()
            r7 = r6
            io.intercom.android.sdk.models.Part r7 = (io.intercom.android.sdk.models.Part) r7
            boolean r7 = r7.isAdmin()
            if (r7 == 0) goto L_0x007a
            r5 = r6
        L_0x008e:
            io.intercom.android.sdk.models.Part r5 = (io.intercom.android.sdk.models.Part) r5
        L_0x0090:
            if (r5 == 0) goto L_0x00c7
            yf.a r14 = r2.appConfig
            java.lang.Object r14 = r14.invoke()
            io.intercom.android.sdk.identity.AppConfig r14 = (io.intercom.android.sdk.identity.AppConfig) r14
            io.intercom.android.sdk.models.ConversationStateSyncSettings r14 = r14.getConversationStateSyncSettings()
            int r14 = r14.getStartTimeout()
            io.intercom.android.sdk.utilities.commons.TimeProvider r6 = r2.timeProvider
            long r6 = r6.currentTimeMillis()
            long r8 = r5.getCreatedAt()
            r5 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 - r8
            long r8 = (long) r14
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x00c7
            io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r14 = r2.refreshConversationUseCase
            io.intercom.android.sdk.m5.conversation.data.GetConversationReason r5 = io.intercom.android.sdk.m5.conversation.data.GetConversationReason.POLLING
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r14 = r14.invoke(r13, r5, r0)
            if (r14 != r1) goto L_0x00c7
            return r1
        L_0x00c7:
            yf.a r14 = r2.appConfig
            java.lang.Object r14 = r14.invoke()
            io.intercom.android.sdk.identity.AppConfig r14 = (io.intercom.android.sdk.identity.AppConfig) r14
            io.intercom.android.sdk.models.ConversationStateSyncSettings r14 = r14.getConversationStateSyncSettings()
            int r14 = r14.getSyncInterval()
            long r5 = (long) r14
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = Ug.V.a(r5, r0)
            if (r14 != r1) goto L_0x004d
            return r1
        L_0x00e5:
            lf.M r13 = lf.C6514M.f71813a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase.invoke(Xg.x, qf.d):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FallbackPollingUseCase(yf.C6787a r1, io.intercom.android.sdk.utilities.commons.TimeProvider r2, io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0009
            io.intercom.android.sdk.m5.conversation.usecase.a r1 = new io.intercom.android.sdk.m5.conversation.usecase.a
            r1.<init>()
        L_0x0009:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0015
            io.intercom.android.sdk.Injector r2 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.utilities.commons.TimeProvider r2 = r2.getTimeProvider()
        L_0x0015:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase.<init>(yf.a, io.intercom.android.sdk.utilities.commons.TimeProvider, io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
