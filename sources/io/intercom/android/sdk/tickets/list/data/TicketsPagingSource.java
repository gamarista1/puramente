package io.intercom.android.sdk.tickets.list.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.L;
import m3.M;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsPagingSource;", "Lm3/L;", "", "Lio/intercom/android/sdk/models/Ticket;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "repository", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketRepository;)V", "Lm3/L$a;", "params", "Lm3/L$b;", "load", "(Lm3/L$a;Lqf/d;)Ljava/lang/Object;", "Lm3/M;", "state", "getRefreshKey", "(Lm3/M;)Ljava/lang/Long;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketsPagingSource extends L {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int PAGE_SIZE = 10;
    private final TicketRepository repository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsPagingSource$Companion;", "", "<init>", "()V", "PAGE_SIZE", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TicketsPagingSource() {
        this((TicketRepository) null, 1, (DefaultConstructorMarker) null);
    }

    public Long getRefreshKey(M m10) {
        C6496s.h(m10, "state");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object load(m3.L.a r7, qf.C6658d<? super m3.L.b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1 r0 = (io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1 r0 = new io.intercom.android.sdk.tickets.list.data.TicketsPagingSource$load$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            m3.L$a r7 = (m3.L.a) r7
            lf.w.b(r8)
            goto L_0x0056
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            lf.w.b(r8)
            io.intercom.android.sdk.tickets.create.data.TicketRepository r8 = r6.repository
            java.lang.Object r2 = r7.a()
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0047
            long r4 = r2.longValue()
            goto L_0x0049
        L_0x0047:
            r4 = 1
        L_0x0049:
            r0.L$0 = r7
            r0.label = r3
            r2 = 10
            java.lang.Object r8 = r8.fetchTickets(r4, r2, r0)
            if (r8 != r1) goto L_0x0056
            return r1
        L_0x0056:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r8
            boolean r0 = r8 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r0 == 0) goto L_0x008d
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r8
            java.lang.Object r0 = r8.getBody()
            io.intercom.android.sdk.tickets.list.data.TicketsResponse r0 = (io.intercom.android.sdk.tickets.list.data.TicketsResponse) r0
            java.util.List r0 = r0.getTickets()
            m3.L$b$b r1 = new m3.L$b$b
            java.lang.Object r7 = r7.a()
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x007e
            long r2 = r7.longValue()
            r4 = -1
            long r2 = r2 + r4
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.b.d(r2)
            goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            java.lang.Object r8 = r8.getBody()
            io.intercom.android.sdk.tickets.list.data.TicketsResponse r8 = (io.intercom.android.sdk.tickets.list.data.TicketsResponse) r8
            java.lang.Long r8 = r8.getNextPage()
            r1.<init>(r0, r7, r8)
            goto L_0x00d2
        L_0x008d:
            boolean r7 = r8 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            if (r7 == 0) goto L_0x009d
            m3.L$b$a r1 = new m3.L$b$a
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$NetworkError r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError) r8
            java.io.IOException r7 = r8.getError()
            r1.<init>(r7)
            goto L_0x00d2
        L_0x009d:
            boolean r7 = r8 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r7 == 0) goto L_0x00ad
            m3.L$b$a r1 = new m3.L$b$a
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ClientError r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError) r8
            java.lang.Throwable r7 = r8.getError()
            r1.<init>(r7)
            goto L_0x00d2
        L_0x00ad:
            boolean r7 = r8 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r7 == 0) goto L_0x00d3
            m3.L$b$a r1 = new m3.L$b$a
            java.lang.Error r7 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Server error : code "
            r0.append(r2)
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$ServerError r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError) r8
            int r8 = r8.getCode()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            r1.<init>(r7)
        L_0x00d2:
            return r1
        L_0x00d3:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.data.TicketsPagingSource.load(m3.L$a, qf.d):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new TicketRepository((TicketApi) null, (UploadRepository) null, (NexusClient) null, (IntercomDataLayer) null, 15, (DefaultConstructorMarker) null) : ticketRepository);
    }

    public TicketsPagingSource(TicketRepository ticketRepository) {
        C6496s.h(ticketRepository, "repository");
        this.repository = ticketRepository;
    }
}
