package io.intercom.android.sdk.m5.inbox;

import Ug.C5600w0;
import Ug.G;
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
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.m5.inbox.data.InboxRepository;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import m3.C2199D;
import m3.C2200E;
import m3.C2204c;
import m3.L;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R$\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "Landroidx/lifecycle/a0;", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "inboxRepository", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "commonRepository", "<init>", "(Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;LUg/G;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "Lio/intercom/android/sdk/models/Conversation;", "it", "Llf/M;", "onConversationClick", "(Lio/intercom/android/sdk/models/Conversation;)V", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "LUg/G;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "Lio/intercom/android/sdk/models/EmptyState;", "value", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "LXg/f;", "Lm3/F;", "inboxPagingData", "LXg/f;", "getInboxPagingData", "()LXg/f;", "LXg/w;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "_effect", "LXg/w;", "LXg/B;", "effect", "LXg/B;", "getEffect", "()LXg/B;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InboxViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final w _effect;
    /* access modifiers changed from: private */
    public final CommonRepository commonRepository;
    private final G dispatcher;
    private final B effect;
    /* access modifiers changed from: private */
    public EmptyState emptyState;
    private final C5694f inboxPagingData;
    /* access modifiers changed from: private */
    public final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1", f = "InboxViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;
        final /* synthetic */ InboxViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.label;
            if (i10 == 0) {
                lf.w.b(obj);
                InboxViewModel$1$invokeSuspend$$inlined$filter$1 inboxViewModel$1$invokeSuspend$$inlined$filter$1 = new InboxViewModel$1$invokeSuspend$$inlined$filter$1(new InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1(this.this$0.inboxRepository.realTimeEvents()));
                final InboxViewModel inboxViewModel = this.this$0;
                AnonymousClass2 r12 = new C5695g() {
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, C6658d<? super C6514M> dVar) {
                        Object emit = inboxViewModel._effect.emit(InboxUiEffects.RefreshInbox.INSTANCE, dVar);
                        return emit == C6680b.f() ? emit : C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (inboxViewModel$1$invokeSuspend$$inlined$filter$1.collect(r12, this) == f10) {
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

    @Metadata(d1 = {"\u0000!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/InboxViewModel$Companion;", "", "<init>", "()V", "io/intercom/android/sdk/m5/inbox/InboxViewModel$Companion$factory$1", "factory", "()Lio/intercom/android/sdk/m5/inbox/InboxViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "create", "(Landroidx/lifecycle/e0;)Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final InboxViewModel$Companion$factory$1 factory() {
            return new InboxViewModel$Companion$factory$1();
        }

        public final InboxViewModel create(e0 e0Var) {
            C6496s.h(e0Var, "owner");
            return (InboxViewModel) new c0(e0Var, (c0.c) factory()).b(InboxViewModel.class);
        }

        private Companion() {
        }
    }

    public InboxViewModel() {
        this((InboxRepository) null, (G) null, (IntercomDataLayer) null, (CommonRepository) null, 15, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final L inboxPagingData$lambda$0(InboxViewModel inboxViewModel) {
        C6496s.h(inboxViewModel, "this$0");
        return new InboxPagingSource(inboxViewModel.inboxRepository, inboxViewModel.intercomDataLayer, new InboxViewModel$inboxPagingData$1$1(inboxViewModel, (C6658d<? super InboxViewModel$inboxPagingData$1$1>) null));
    }

    public final B getEffect() {
        return this.effect;
    }

    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    public final C5694f getInboxPagingData() {
        return this.inboxPagingData;
    }

    public final void onConversationClick(Conversation conversation) {
        C6496s.h(conversation, "it");
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new InboxViewModel$onConversationClick$1(this, conversation, (C6658d<? super InboxViewModel$onConversationClick$1>) null), 2, (Object) null);
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InboxViewModel(io.intercom.android.sdk.m5.inbox.data.InboxRepository r2, Ug.G r3, io.intercom.android.sdk.m5.data.IntercomDataLayer r4, io.intercom.android.sdk.m5.data.CommonRepository r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L_0x000b
            io.intercom.android.sdk.m5.inbox.data.InboxRepository r2 = new io.intercom.android.sdk.m5.inbox.data.InboxRepository
            r7 = 3
            r0 = 0
            r2.<init>(r0, r0, r7, r0)
        L_0x000b:
            r7 = r6 & 2
            if (r7 == 0) goto L_0x0013
            Ug.G r3 = Ug.Z.b()
        L_0x0013:
            r7 = r6 & 4
            if (r7 == 0) goto L_0x001f
            io.intercom.android.sdk.Injector r4 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.m5.data.IntercomDataLayer r4 = r4.getDataLayer()
        L_0x001f:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0035
            io.intercom.android.sdk.m5.data.CommonRepository r5 = new io.intercom.android.sdk.m5.data.CommonRepository
            io.intercom.android.sdk.Injector r6 = io.intercom.android.sdk.Injector.get()
            io.intercom.android.sdk.api.MessengerApi r6 = r6.getMessengerApi()
            java.lang.String r7 = "getMessengerApi(...)"
            kotlin.jvm.internal.C6496s.g(r6, r7)
            r5.<init>(r6, r4)
        L_0x0035:
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.inbox.InboxViewModel.<init>(io.intercom.android.sdk.m5.inbox.data.InboxRepository, Ug.G, io.intercom.android.sdk.m5.data.IntercomDataLayer, io.intercom.android.sdk.m5.data.CommonRepository, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public InboxViewModel(InboxRepository inboxRepository2, G g10, IntercomDataLayer intercomDataLayer2, CommonRepository commonRepository2) {
        C6496s.h(inboxRepository2, "inboxRepository");
        C6496s.h(g10, "dispatcher");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        C6496s.h(commonRepository2, "commonRepository");
        this.inboxRepository = inboxRepository2;
        this.dispatcher = g10;
        this.intercomDataLayer = intercomDataLayer2;
        this.commonRepository = commonRepository2;
        this.emptyState = EmptyState.Companion.getNULL();
        this.inboxPagingData = C2204c.a(new C2199D(new C2200E(20, 0, false, 0, 0, 0, 58, (DefaultConstructorMarker) null), (Object) null, new a(this), 2, (DefaultConstructorMarker) null).a(), b0.a(this));
        w b10 = D.b(0, 0, (a) null, 7, (Object) null);
        this._effect = b10;
        this.effect = t.g(b10, b0.a(this), H.f66443a.c(), 0, 4, (Object) null);
        C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new AnonymousClass1(this, (C6658d<? super AnonymousClass1>) null), 3, (Object) null);
    }
}
