package io.intercom.android.sdk.m5.conversation.data;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.a;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Xg.D;
import Xg.w;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.UserIdentity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/NexusEventsRepository;", "", "Lio/intercom/android/nexus/NexusClient;", "nexusClient", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "LUg/K;", "scope", "<init>", "(Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/identity/UserIdentity;LUg/K;)V", "", "conversationId", "Llf/M;", "markAsSeen", "(Ljava/lang/String;)V", "userTyping", "Lio/intercom/android/nexus/NexusClient;", "Lio/intercom/android/sdk/identity/UserIdentity;", "LUg/K;", "LXg/w;", "Lio/intercom/android/nexus/NexusEvent;", "typingEventsFlow", "LXg/w;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NexusEventsRepository {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public final NexusClient nexusClient;
    private final K scope;
    /* access modifiers changed from: private */
    public final w typingEventsFlow;
    /* access modifiers changed from: private */
    public final UserIdentity userIdentity;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1", f = "NexusEventsRepository.kt", l = {25}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventsRepository$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;
        final /* synthetic */ NexusEventsRepository this$0;

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
                C5694f J10 = C5696h.J(this.this$0.typingEventsFlow, 200);
                final NexusEventsRepository nexusEventsRepository = this.this$0;
                AnonymousClass1 r12 = new C5695g() {
                    public final Object emit(NexusEvent nexusEvent, C6658d<? super C6514M> dVar) {
                        nexusEventsRepository.nexusClient.fire(nexusEvent);
                        return C6514M.f71813a;
                    }
                };
                this.label = 1;
                if (J10.collect(r12, this) == f10) {
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

    public NexusEventsRepository(NexusClient nexusClient2, UserIdentity userIdentity2, K k10) {
        C6496s.h(nexusClient2, "nexusClient");
        C6496s.h(userIdentity2, "userIdentity");
        C6496s.h(k10, "scope");
        this.nexusClient = nexusClient2;
        this.userIdentity = userIdentity2;
        this.scope = k10;
        this.typingEventsFlow = D.b(0, 0, (a) null, 7, (Object) null);
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new AnonymousClass1(this, (C6658d<? super AnonymousClass1>) null), 3, (Object) null);
    }

    public final void markAsSeen(String str) {
        C6496s.h(str, "conversationId");
        this.nexusClient.fire(NexusEvent.getConversationSeenEvent(str, this.userIdentity.getIntercomId()));
    }

    public final void userTyping(String str) {
        C6496s.h(str, "conversationId");
        C5600w0 unused = C5576k.d(this.scope, (g) null, (M) null, new NexusEventsRepository$userTyping$1(this, str, (C6658d<? super NexusEventsRepository$userTyping$1>) null), 3, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NexusEventsRepository(NexusClient nexusClient2, UserIdentity userIdentity2, K k10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Injector.get().getNexusClient() : nexusClient2, (i10 & 2) != 0 ? Injector.get().getUserIdentity() : userIdentity2, k10);
    }
}
