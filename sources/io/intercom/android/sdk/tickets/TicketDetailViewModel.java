package io.intercom.android.sdk.tickets;

import Sg.p;
import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import Xg.C5695g;
import Xg.L;
import Xg.N;
import Xg.x;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020&0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8BX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "launchedFrom", "Lio/intercom/android/sdk/identity/UserIdentity;", "user", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "repository", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/tickets/create/data/TicketRepository;LUg/G;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "Lio/intercom/android/sdk/models/Ticket;", "ticket", "Llf/M;", "markAsReadIfNecessary", "(Lio/intercom/android/sdk/models/Ticket;)V", "fireMetricIfNecessary", "", "ticketId", "fetchTicketDetail$intercom_sdk_base_release", "(Ljava/lang/String;)V", "fetchTicketDetail", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "Lio/intercom/android/sdk/identity/UserIdentity;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "LUg/G;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Ljava/lang/String;", "", "metricSent", "Z", "LXg/x;", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "_stateFlow", "LXg/x;", "LXg/L;", "stateFlow", "LXg/L;", "getStateFlow", "()LXg/L;", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getActiveAdminsAvatars", "()Ljava/util/List;", "activeAdminsAvatars", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final x _stateFlow;
    private final G dispatcher;
    private final IntercomDataLayer intercomDataLayer;
    /* access modifiers changed from: private */
    public final TicketLaunchedFrom launchedFrom;
    private boolean metricSent;
    private final MetricTracker metricTracker;
    /* access modifiers changed from: private */
    public final TicketRepository repository;
    private final L stateFlow;
    /* access modifiers changed from: private */
    public String ticketId;
    /* access modifiers changed from: private */
    public final UserIdentity user;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$2", f = "TicketDetailViewModel.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.tickets.TicketDetailViewModel$2  reason: invalid class name */
    static final class AnonymousClass2 extends l implements yf.p {
        int label;
        final /* synthetic */ TicketDetailViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.label;
            if (i10 == 0) {
                w.b(obj);
                TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1 ticketDetailViewModel$2$invokeSuspend$$inlined$filter$1 = new TicketDetailViewModel$2$invokeSuspend$$inlined$filter$1(new TicketDetailViewModel$2$invokeSuspend$$inlined$filterIsInstance$1(this.this$0.repository.realTimeEvents()), this.this$0);
                final TicketDetailViewModel ticketDetailViewModel = this.this$0;
                AnonymousClass2 r52 = new C5695g() {
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, C6658d<? super C6514M> dVar) {
                        TicketDetailViewModel ticketDetailViewModel = ticketDetailViewModel;
                        String access$getTicketId$p = ticketDetailViewModel.ticketId;
                        C6496s.e(access$getTicketId$p);
                        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(access$getTicketId$p);
                        return C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (ticketDetailViewModel$2$invokeSuspend$$inlined$filter$1.collect(r52, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailViewModel$Companion;", "", "<init>", "()V", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "launchedFrom", "io/intercom/android/sdk/tickets/TicketDetailViewModel$Companion$factory$1", "factory", "(Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/TicketDetailViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/tickets/TicketDetailViewModel;", "create", "(Landroidx/lifecycle/e0;Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/TicketDetailViewModel;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final TicketDetailViewModel$Companion$factory$1 factory(TicketLaunchedFrom ticketLaunchedFrom) {
            return new TicketDetailViewModel$Companion$factory$1(ticketLaunchedFrom);
        }

        public final TicketDetailViewModel create(e0 e0Var, TicketLaunchedFrom ticketLaunchedFrom) {
            C6496s.h(e0Var, "owner");
            C6496s.h(ticketLaunchedFrom, "launchedFrom");
            return (TicketDetailViewModel) new c0(e0Var, (c0.c) factory(ticketLaunchedFrom)).b(TicketDetailViewModel.class);
        }

        private Companion() {
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TicketDetailViewModel(io.intercom.android.sdk.tickets.TicketLaunchedFrom r11, io.intercom.android.sdk.identity.UserIdentity r12, io.intercom.android.sdk.metrics.MetricTracker r13, io.intercom.android.sdk.tickets.create.data.TicketRepository r14, Ug.G r15, io.intercom.android.sdk.m5.data.IntercomDataLayer r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r10 = this;
            r0 = r17 & 2
            if (r0 == 0) goto L_0x000d
            io.intercom.android.sdk.Injector r0 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.identity.UserIdentity r0 = r0.getUserIdentity()
            goto L_0x000e
        L_0x000d:
            r0 = r12
        L_0x000e:
            r1 = r17 & 4
            if (r1 == 0) goto L_0x001b
            io.intercom.android.sdk.Injector r1 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.metrics.MetricTracker r1 = r1.getMetricTracker()
            goto L_0x001c
        L_0x001b:
            r1 = r13
        L_0x001c:
            r2 = r17 & 8
            if (r2 == 0) goto L_0x002e
            io.intercom.android.sdk.tickets.create.data.TicketRepository r2 = new io.intercom.android.sdk.tickets.create.data.TicketRepository
            r8 = 15
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x002f
        L_0x002e:
            r2 = r14
        L_0x002f:
            r3 = r17 & 16
            if (r3 == 0) goto L_0x0038
            Ug.G r3 = Ug.Z.b()
            goto L_0x0039
        L_0x0038:
            r3 = r15
        L_0x0039:
            r4 = r17 & 32
            if (r4 == 0) goto L_0x0046
            io.intercom.android.sdk.Injector r4 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r4.getDataLayer()
            goto L_0x0048
        L_0x0046:
            r4 = r16
        L_0x0048:
            r12 = r10
            r13 = r11
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketDetailViewModel.<init>(io.intercom.android.sdk.tickets.TicketLaunchedFrom, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.metrics.MetricTracker, io.intercom.android.sdk.tickets.create.data.TicketRepository, Ug.G, io.intercom.android.sdk.m5.data.IntercomDataLayer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* access modifiers changed from: private */
    public final void fireMetricIfNecessary(Ticket ticket) {
        if (!this.metricSent) {
            MetricTracker metricTracker2 = this.metricTracker;
            Integer valueOf = Integer.valueOf(ticket.getTicketTypeId());
            String conversationId = ticket.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            metricTracker2.viewedTicketDetails(valueOf, conversationId, ticket.getCurrentStatus().getType(), this.launchedFrom.getFrom());
        }
    }

    /* access modifiers changed from: private */
    public final List<AvatarWrapper> getActiveAdminsAvatars() {
        Iterable<Participant> builtActiveAdmins = ((TeamPresence) this.intercomDataLayer.getTeamPresence().getValue()).getBuiltActiveAdmins();
        ArrayList arrayList = new ArrayList(C6565s.y(builtActiveAdmins, 10));
        for (Participant participant : builtActiveAdmins) {
            Avatar avatar = participant.getAvatar();
            C6496s.g(avatar, "getAvatar(...)");
            Boolean isBot = participant.isBot();
            C6496s.g(isBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void markAsReadIfNecessary(Ticket ticket) {
        if (C6496s.c(ticket.isRead(), Boolean.FALSE)) {
            C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new TicketDetailViewModel$markAsReadIfNecessary$1(this, ticket, (C6658d<? super TicketDetailViewModel$markAsReadIfNecessary$1>) null), 2, (Object) null);
        }
    }

    public final void fetchTicketDetail$intercom_sdk_base_release(String str) {
        C6496s.h(str, "ticketId");
        if (p.d0(str)) {
            this._stateFlow.setValue(new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Integer.valueOf(R.string.intercom_error_loading_ticket), 3, (DefaultConstructorMarker) null)));
        } else {
            C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new TicketDetailViewModel$fetchTicketDetail$1(this, str, (C6658d<? super TicketDetailViewModel$fetchTicketDetail$1>) null), 2, (Object) null);
        }
    }

    public final L getStateFlow() {
        return this.stateFlow;
    }

    public TicketDetailViewModel(TicketLaunchedFrom ticketLaunchedFrom, UserIdentity userIdentity, MetricTracker metricTracker2, TicketRepository ticketRepository, G g10, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(ticketLaunchedFrom, "launchedFrom");
        C6496s.h(userIdentity, Participant.USER_TYPE);
        C6496s.h(metricTracker2, "metricTracker");
        C6496s.h(ticketRepository, "repository");
        C6496s.h(g10, "dispatcher");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.launchedFrom = ticketLaunchedFrom;
        this.user = userIdentity;
        this.metricTracker = metricTracker2;
        this.repository = ticketRepository;
        this.dispatcher = g10;
        this.intercomDataLayer = intercomDataLayer2;
        x a10 = N.a(TicketDetailState.Initial.INSTANCE);
        this._stateFlow = a10;
        this.stateFlow = a10;
        if (ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) {
            fireMetricIfNecessary(((TicketLaunchedFrom.Conversation) ticketLaunchedFrom).getTicket());
            markAsReadIfNecessary(((TicketLaunchedFrom.Conversation) ticketLaunchedFrom).getTicket());
            Ticket ticket = ((TicketLaunchedFrom.Conversation) ticketLaunchedFrom).getTicket();
            this.ticketId = ticket.getId();
            a10.setValue(TicketDetailReducerKt.computeTicketViewState(ticket, userIdentity, getActiveAdminsAvatars(), ticketLaunchedFrom));
        } else if (ticketLaunchedFrom instanceof TicketLaunchedFrom.Other) {
            fetchTicketDetail$intercom_sdk_base_release(((TicketLaunchedFrom.Other) ticketLaunchedFrom).getTicketId());
        } else {
            throw new C6535s();
        }
        C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new AnonymousClass2(this, (C6658d<? super AnonymousClass2>) null), 3, (Object) null);
    }
}
