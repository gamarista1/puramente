package io.intercom.android.sdk.tickets.list.ui;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.a;
import Xg.B;
import Xg.C5694f;
import Xg.C5695g;
import Xg.D;
import Xg.H;
import Xg.w;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.list.data.TicketsPagingSource;
import io.intercom.android.sdk.tickets.list.ui.TicketsScreenEffects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m3.C2199D;
import m3.C2204c;
import m3.L;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "repository", "Lm3/D;", "", "Lio/intercom/android/sdk/models/Ticket;", "pager", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketRepository;Lm3/D;)V", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "LXg/f;", "Lm3/F;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "pagerFlow", "LXg/f;", "getPagerFlow", "()LXg/f;", "LXg/w;", "Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenEffects;", "_effect", "LXg/w;", "LXg/B;", "effect", "LXg/B;", "getEffect", "()LXg/B;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketsScreenViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final w _effect;
    private final B effect;
    private final C5694f pagerFlow;
    /* access modifiers changed from: private */
    public final TicketRepository repository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2", f = "TicketsScreenViewModel.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel$2  reason: invalid class name */
    static final class AnonymousClass2 extends l implements p {
        int label;
        final /* synthetic */ TicketsScreenViewModel this$0;

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
                lf.w.b(obj);
                TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1 ticketsScreenViewModel$2$invokeSuspend$$inlined$filter$1 = new TicketsScreenViewModel$2$invokeSuspend$$inlined$filter$1(new TicketsScreenViewModel$2$invokeSuspend$$inlined$filterIsInstance$1(this.this$0.repository.realTimeEvents()));
                final TicketsScreenViewModel ticketsScreenViewModel = this.this$0;
                AnonymousClass2 r12 = new C5695g() {
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent.NewComment newComment, C6658d<? super C6514M> dVar) {
                        Object emit = ticketsScreenViewModel._effect.emit(TicketsScreenEffects.RefreshTickets.INSTANCE, dVar);
                        return emit == C6680b.f() ? emit : C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (ticketsScreenViewModel$2$invokeSuspend$$inlined$filter$1.collect(r12, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                lf.w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion;", "", "<init>", "()V", "io/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion$factory$1", "factory", "()Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel;", "create", "(Landroidx/lifecycle/e0;)Lio/intercom/android/sdk/tickets/list/ui/TicketsScreenViewModel;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final TicketsScreenViewModel$Companion$factory$1 factory() {
            return new TicketsScreenViewModel$Companion$factory$1();
        }

        public final TicketsScreenViewModel create(e0 e0Var) {
            C6496s.h(e0Var, "owner");
            return (TicketsScreenViewModel) new c0(e0Var, (c0.c) factory()).b(TicketsScreenViewModel.class);
        }

        private Companion() {
        }
    }

    public TicketsScreenViewModel() {
        this((TicketRepository) null, (C2199D) null, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final L _init_$lambda$0(TicketRepository ticketRepository) {
        C6496s.h(ticketRepository, "$repository");
        return new TicketsPagingSource(ticketRepository);
    }

    public final B getEffect() {
        return this.effect;
    }

    public final C5694f getPagerFlow() {
        return this.pagerFlow;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TicketsScreenViewModel(io.intercom.android.sdk.tickets.create.data.TicketRepository r10, m3.C2199D r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r9 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0011
            io.intercom.android.sdk.tickets.create.data.TicketRepository r10 = new io.intercom.android.sdk.tickets.create.data.TicketRepository
            r5 = 15
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x0011:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x0034
            m3.D r11 = new m3.D
            m3.E r12 = new m3.E
            r7 = 58
            r8 = 0
            r1 = 10
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            io.intercom.android.sdk.tickets.list.ui.q r3 = new io.intercom.android.sdk.tickets.list.ui.q
            r3.<init>(r10)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x0034:
            r9.<init>(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketsScreenViewModel.<init>(io.intercom.android.sdk.tickets.create.data.TicketRepository, m3.D, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public TicketsScreenViewModel(TicketRepository ticketRepository, C2199D d10) {
        C6496s.h(ticketRepository, "repository");
        C6496s.h(d10, "pager");
        this.repository = ticketRepository;
        this.pagerFlow = C2204c.a(new TicketsScreenViewModel$special$$inlined$map$1(d10.a()), b0.a(this));
        w b10 = D.b(0, 0, (a) null, 7, (Object) null);
        this._effect = b10;
        this.effect = t.g(b10, b0.a(this), H.f66443a.c(), 0, 4, (Object) null);
        C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new AnonymousClass2(this, (C6658d<? super AnonymousClass2>) null), 3, (Object) null);
    }
}
