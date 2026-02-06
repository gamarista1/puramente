package io.intercom.android.sdk.tickets.create.data;

import Xg.C5694f;
import android.content.Context;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import qf.C6658d;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0006\u0010\u001c\u001a\u00020\u001bH@¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0012H@¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0010H@¢\u0006\u0004\b&\u0010'J.\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00172\u0006\u0010(\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00172\u0006\u0010\u0013\u001a\u00020\u0010H@¢\u0006\u0004\b-\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00101¨\u00062"}, d2 = {"Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "", "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "api", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "uploadRepository", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketApi;Lio/intercom/android/sdk/m5/upload/data/UploadRepository;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "LXg/f;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "realTimeEvents", "()LXg/f;", "", "conversationId", "", "ticketId", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "attributes", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Ticket;", "createTicket", "(Ljava/lang/String;ILjava/util/List;Lqf/d;)Ljava/lang/Object;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "data", "Lio/intercom/android/sdk/models/Upload$Builder;", "uploadFile", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lqf/d;)Ljava/lang/Object;", "", "page", "pageSize", "Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "fetchTickets", "(JILqf/d;)Ljava/lang/Object;", "fetchTicketDetail", "(Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "ticketTypeId", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "fetchTicketType", "(ILjava/util/List;Lqf/d;)Ljava/lang/Object;", "Llf/M;", "markAsRead", "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketRepository {
    public static final int $stable = 8;
    private final TicketApi api;
    private final IntercomDataLayer intercomDataLayer;
    private final NexusClient nexusClient;
    private final UploadRepository uploadRepository;

    public TicketRepository() {
        this((TicketApi) null, (UploadRepository) null, (NexusClient) null, (IntercomDataLayer) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Object fetchTicketType$default(TicketRepository ticketRepository, int i10, List list, C6658d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = C6565s.n();
        }
        return ticketRepository.fetchTicketType(i10, list, dVar);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j10, int i10, C6658d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return ticketRepository.fetchTickets(j10, i10, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createTicket(java.lang.String r7, int r8, java.util.List<io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest> r9, qf.C6658d<? super io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse<io.intercom.android.sdk.models.Ticket>> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1 r0 = (io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1 r0 = new io.intercom.android.sdk.tickets.create.data.TicketRepository$createTicket$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            io.intercom.android.sdk.tickets.create.data.TicketRepository r7 = (io.intercom.android.sdk.tickets.create.data.TicketRepository) r7
            lf.w.b(r10)
            goto L_0x0072
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            lf.w.b(r10)
            io.intercom.android.sdk.tickets.create.data.TicketApi r10 = r6.api
            io.intercom.android.sdk.api.MessengerApiHelper r2 = io.intercom.android.sdk.api.MessengerApiHelper.INSTANCE
            java.util.Map r4 = mf.O.c()
            if (r7 == 0) goto L_0x004e
            boolean r5 = Sg.p.d0(r7)
            if (r5 == 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = "conversation_id"
            r4.put(r5, r7)
        L_0x004e:
            java.lang.String r7 = "type_id"
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.c(r8)
            r4.put(r7, r8)
            java.lang.String r7 = "attributes"
            r4.put(r7, r9)
            lf.M r7 = lf.C6514M.f71813a
            java.util.Map r7 = mf.O.b(r4)
            rh.D r7 = r2.getDefaultRequestBody$intercom_sdk_base_release(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r10 = r10.createTicket(r7, r0)
            if (r10 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r7 = r6
        L_0x0072:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r10 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r10
            boolean r8 = r10 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            if (r8 == 0) goto L_0x0086
            io.intercom.android.sdk.m5.data.IntercomDataLayer r7 = r7.intercomDataLayer
            r8 = r10
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r8 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r8
            java.lang.Object r8 = r8.getBody()
            io.intercom.android.sdk.models.Ticket r8 = (io.intercom.android.sdk.models.Ticket) r8
            r7.updateTicket(r8)
        L_0x0086:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.data.TicketRepository.createTicket(java.lang.String, int, java.util.List, qf.d):java.lang.Object");
    }

    public final Object fetchTicketDetail(String str, C6658d<? super NetworkResponse<Ticket>> dVar) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null), dVar);
    }

    public final Object fetchTicketType(int i10, List<TicketAttributeRequest> list, C6658d<? super NetworkResponse<TicketTypeV2>> dVar) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.l(C6502A.a(CreateTicketDestinationKt.TICKET_TYPE_ID, b.c(i10)), C6502A.a("attributes", list))), dVar);
    }

    public final Object fetchTickets(long j10, int i10, C6658d<? super NetworkResponse<TicketsResponse>> dVar) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(O.l(C6502A.a("page", b.d(j10)), C6502A.a("per_page", b.c(i10)))), dVar);
    }

    public final Object markAsRead(String str, C6658d<? super NetworkResponse<C6514M>> dVar) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, (Map) null, 1, (Object) null), dVar);
    }

    public final C5694f realTimeEvents() {
        return NexusEventAsFlowKt.nexusEventAsFlow(this.nexusClient);
    }

    public final Object uploadFile(MediaData.Media media, C6658d<? super NetworkResponse<Upload.Builder>> dVar) {
        return this.uploadRepository.uploadFile(media, dVar);
    }

    public TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository2, NexusClient nexusClient2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(ticketApi, MetricTracker.Place.API);
        C6496s.h(uploadRepository2, "uploadRepository");
        C6496s.h(nexusClient2, "nexusClient");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.api = ticketApi;
        this.uploadRepository = uploadRepository2;
        this.nexusClient = nexusClient2;
        this.intercomDataLayer = intercomDataLayer2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository2, NexusClient nexusClient2, IntercomDataLayer intercomDataLayer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getTicketApi() : ticketApi, (i10 & 2) != 0 ? new UploadRepository((MessengerApi) null, (ExternalUploadApi) null, (UserIdentity) null, (Context) null, 15, (DefaultConstructorMarker) null) : uploadRepository2, (i10 & 4) != 0 ? Injector.get().getNexusClient() : nexusClient2, (i10 & 8) != 0 ? Injector.get().getDataLayer() : intercomDataLayer2);
    }
}
