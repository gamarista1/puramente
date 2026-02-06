package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.utils.Event;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/utils/Event;", "<init>", "()V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent;Ljh/d;Lih/f;)V", "Companion", "CustomerCenter", "Paywalls", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BackendStoredEvent implements Event {
    /* access modifiers changed from: private */
    public static final Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) BackendStoredEvent.$cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$CustomerCenter;", "getEvent", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomerCenter extends BackendStoredEvent {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final BackendEvent.CustomerCenter event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$CustomerCenter;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return BackendStoredEvent$CustomerCenter$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C6521e
        public /* synthetic */ CustomerCenter(int i10, BackendEvent.CustomerCenter customerCenter, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, BackendStoredEvent$CustomerCenter$$serializer.INSTANCE.getDescriptor());
            }
            this.event = customerCenter;
        }

        public static /* synthetic */ CustomerCenter copy$default(CustomerCenter customerCenter, BackendEvent.CustomerCenter customerCenter2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerCenter2 = customerCenter.event;
            }
            return customerCenter.copy(customerCenter2);
        }

        public static final /* synthetic */ void write$Self(CustomerCenter customerCenter, d dVar, f fVar) {
            BackendStoredEvent.write$Self(customerCenter, dVar, fVar);
            dVar.B(fVar, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, customerCenter.event);
        }

        public final BackendEvent.CustomerCenter component1() {
            return this.event;
        }

        public final CustomerCenter copy(BackendEvent.CustomerCenter customerCenter) {
            C6496s.h(customerCenter, "event");
            return new CustomerCenter(customerCenter);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomerCenter) && C6496s.c(this.event, ((CustomerCenter) obj).event);
        }

        public final BackendEvent.CustomerCenter getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "CustomerCenter(event=" + this.event + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CustomerCenter(BackendEvent.CustomerCenter customerCenter) {
            super((DefaultConstructorMarker) null);
            C6496s.h(customerCenter, "event");
            this.event = customerCenter;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "event", "<init>", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "copy", "(Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;)Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/common/events/BackendEvent$Paywalls;", "getEvent", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Paywalls extends BackendStoredEvent {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final BackendEvent.Paywalls event;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent$Paywalls;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return BackendStoredEvent$Paywalls$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @C6521e
        public /* synthetic */ Paywalls(int i10, BackendEvent.Paywalls paywalls, t0 t0Var) {
            super(i10, t0Var);
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, BackendStoredEvent$Paywalls$$serializer.INSTANCE.getDescriptor());
            }
            this.event = paywalls;
        }

        public static /* synthetic */ Paywalls copy$default(Paywalls paywalls, BackendEvent.Paywalls paywalls2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                paywalls2 = paywalls.event;
            }
            return paywalls.copy(paywalls2);
        }

        public static final /* synthetic */ void write$Self(Paywalls paywalls, d dVar, f fVar) {
            BackendStoredEvent.write$Self(paywalls, dVar, fVar);
            dVar.B(fVar, 0, BackendEvent$Paywalls$$serializer.INSTANCE, paywalls.event);
        }

        public final BackendEvent.Paywalls component1() {
            return this.event;
        }

        public final Paywalls copy(BackendEvent.Paywalls paywalls) {
            C6496s.h(paywalls, "event");
            return new Paywalls(paywalls);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paywalls) && C6496s.c(this.event, ((Paywalls) obj).event);
        }

        public final BackendEvent.Paywalls getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "Paywalls(event=" + this.event + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Paywalls(BackendEvent.Paywalls paywalls) {
            super((DefaultConstructorMarker) null);
            C6496s.h(paywalls, "event");
            this.event = paywalls;
        }
    }

    public /* synthetic */ BackendStoredEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BackendStoredEvent() {
    }

    @C6521e
    public /* synthetic */ BackendStoredEvent(int i10, t0 t0Var) {
    }

    public static final /* synthetic */ void write$Self(BackendStoredEvent backendStoredEvent, d dVar, f fVar) {
    }
}
