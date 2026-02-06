package io.intercom.android.sdk.m5.inbox.data;

import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.L;
import m3.M;
import yf.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR0\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxPagingSource;", "Lm3/L;", "", "Lio/intercom/android/sdk/models/Conversation;", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "inboxRepository", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lkotlin/Function2;", "Lio/intercom/android/sdk/models/EmptyState;", "Lqf/d;", "Llf/M;", "", "onEmptyState", "<init>", "(Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lyf/p;)V", "Lm3/L$a;", "params", "Lm3/L$b;", "load", "(Lm3/L$a;Lqf/d;)Ljava/lang/Object;", "Lm3/M;", "state", "getRefreshKey", "(Lm3/M;)Ljava/lang/Long;", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lyf/p;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InboxPagingSource extends L {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PAGE_SIZE = 20;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final p onEmptyState;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxPagingSource$Companion;", "", "<init>", "()V", "PAGE_SIZE", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public InboxPagingSource(InboxRepository inboxRepository2, IntercomDataLayer intercomDataLayer2, p pVar) {
        C6496s.h(inboxRepository2, "inboxRepository");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        C6496s.h(pVar, "onEmptyState");
        this.inboxRepository = inboxRepository2;
        this.intercomDataLayer = intercomDataLayer2;
        this.onEmptyState = pVar;
    }

    public Long getRefreshKey(M m10) {
        C6496s.h(m10, "state");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object load(m3.L.a r8, qf.C6658d<? super m3.L.b> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1 r0 = (io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1 r0 = new io.intercom.android.sdk.m5.inbox.data.InboxPagingSource$load$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$1
            io.intercom.android.sdk.models.ConversationList r1 = (io.intercom.android.sdk.models.ConversationList) r1
            java.lang.Object r0 = r0.L$0
            io.intercom.android.sdk.m5.inbox.data.InboxPagingSource r0 = (io.intercom.android.sdk.m5.inbox.data.InboxPagingSource) r0
            lf.w.b(r9)
            goto L_0x00bd
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            java.lang.Object r8 = r0.L$1
            m3.L$a r8 = (m3.L.a) r8
            java.lang.Object r2 = r0.L$0
            io.intercom.android.sdk.m5.inbox.data.InboxPagingSource r2 = (io.intercom.android.sdk.m5.inbox.data.InboxPagingSource) r2
            lf.w.b(r9)
            goto L_0x0066
        L_0x004b:
            lf.w.b(r9)
            io.intercom.android.sdk.m5.inbox.data.InboxRepository r9 = r7.inboxRepository
            java.lang.Object r2 = r8.a()
            java.lang.Long r2 = (java.lang.Long) r2
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            r5 = 20
            java.lang.Object r9 = r9.getConversations(r2, r5, r0)
            if (r9 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r7
        L_0x0066:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r9
            boolean r5 = r9 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r5 == 0) goto L_0x00f6
            java.lang.Object r8 = r8.a()
            if (r8 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r4 = 0
        L_0x0074:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r9
            java.lang.Object r8 = r9.getBody()
            io.intercom.android.sdk.models.ConversationsResponse$Builder r8 = (io.intercom.android.sdk.models.ConversationsResponse.Builder) r8
            io.intercom.android.sdk.models.ConversationsResponse r8 = r8.build()
            io.intercom.android.sdk.models.ConversationList r9 = r8.getConversationPage()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r5 = r2.intercomDataLayer
            io.intercom.android.sdk.models.Config r8 = r8.getConfig()
            java.lang.String r6 = "getConfig(...)"
            kotlin.jvm.internal.C6496s.g(r8, r6)
            r5.updateConfig(r8)
            io.intercom.android.sdk.m5.data.IntercomDataLayer r8 = r2.intercomDataLayer
            java.util.List r5 = r9.getConversations()
            java.lang.String r6 = "getConversations(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            r8.addConversations(r5)
            yf.p r8 = r2.onEmptyState
            io.intercom.android.sdk.models.EmptyState r5 = r9.getEmptyState()
            java.lang.String r6 = "getEmptyState(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            r0.L$0 = r2
            r0.L$1 = r9
            r0.I$0 = r4
            r0.label = r3
            java.lang.Object r8 = r8.invoke(r5, r0)
            if (r8 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r1 = r9
            r0 = r2
            r8 = r4
        L_0x00bd:
            if (r8 == 0) goto L_0x00d0
            io.intercom.android.sdk.m5.data.IntercomDataLayer r8 = r0.intercomDataLayer
            Xg.L r8 = r8.getConversations()
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = mf.C6565s.e1(r8)
            goto L_0x00d4
        L_0x00d0:
            java.util.List r8 = r1.getConversations()
        L_0x00d4:
            m3.L$b$b r9 = new m3.L$b$b
            kotlin.jvm.internal.C6496s.e(r8)
            boolean r0 = r1.hasMorePages()
            r1 = 0
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = mf.C6565s.B0(r8)
            io.intercom.android.sdk.models.Conversation r0 = (io.intercom.android.sdk.models.Conversation) r0
            if (r0 == 0) goto L_0x00f1
            long r2 = io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt.lastActionCreatedAt(r0)
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.d(r2)
            goto L_0x00f2
        L_0x00f1:
            r0 = r1
        L_0x00f2:
            r9.<init>(r8, r1, r0)
            goto L_0x013d
        L_0x00f6:
            boolean r8 = r9 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r8 == 0) goto L_0x0107
            m3.L$b$a r8 = new m3.L$b$a
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$NetworkError r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError) r9
            java.io.IOException r9 = r9.getError()
            r8.<init>(r9)
        L_0x0105:
            r9 = r8
            goto L_0x013d
        L_0x0107:
            boolean r8 = r9 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r8 == 0) goto L_0x0117
            m3.L$b$a r8 = new m3.L$b$a
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ClientError r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError) r9
            java.lang.Throwable r9 = r9.getError()
            r8.<init>(r9)
            goto L_0x0105
        L_0x0117:
            boolean r8 = r9 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r8 == 0) goto L_0x013e
            m3.L$b$a r8 = new m3.L$b$a
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Server error : code "
            r1.append(r2)
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ServerError r9 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError) r9
            int r9 = r9.getCode()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            r8.<init>(r0)
            goto L_0x0105
        L_0x013d:
            return r9
        L_0x013e:
            lf.s r8 = new lf.s
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.data.InboxPagingSource.load(m3.L$a, qf.d):java.lang.Object");
    }
}
