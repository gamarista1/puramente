package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6448e0;
import kh.C6456i0;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0005\u001c\u001d\u001b\u001e\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Companion", "$serializer", "Action", "Destination", "UrlMethod", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ButtonComponent implements PaywallComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Action action;
    private final StackComponent stack;

    @C5985i(with = ActionSerializer.class)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "", "Companion", "NavigateBack", "NavigateTo", "RestorePurchases", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public interface Action {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final C5978b serializer() {
                return ActionSerializer.INSTANCE;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateBack;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateBack implements Action {
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
            public static final NavigateBack INSTANCE = new NavigateBack();

            private NavigateBack() {
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) $cachedSerializer$delegate.getValue();
            }

            public final C5978b serializer() {
                return get$cachedSerializer();
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "destination", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;Ljh/d;Lih/f;)V", "component1", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "getDestination", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NavigateTo implements Action {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {new C5983g("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", O.b(Destination.class), new d[]{O.b(Destination.CustomerCenter.class), O.b(Destination.PrivacyPolicy.class), O.b(Destination.Terms.class), O.b(Destination.Url.class)}, new C5978b[]{new C6448e0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", Destination.CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0])};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final Destination destination;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$NavigateTo;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ButtonComponent$Action$NavigateTo$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ NavigateTo(int i10, Destination destination2, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, ButtonComponent$Action$NavigateTo$$serializer.INSTANCE.getDescriptor());
                }
                this.destination = destination2;
            }

            public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, Destination destination2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    destination2 = navigateTo.destination;
                }
                return navigateTo.copy(destination2);
            }

            public final Destination component1() {
                return this.destination;
            }

            public final NavigateTo copy(Destination destination2) {
                C6496s.h(destination2, "destination");
                return new NavigateTo(destination2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && C6496s.c(this.destination, ((NavigateTo) obj).destination);
            }

            public final /* synthetic */ Destination getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return this.destination.hashCode();
            }

            public String toString() {
                return "NavigateTo(destination=" + this.destination + ')';
            }

            public NavigateTo(Destination destination2) {
                C6496s.h(destination2, "destination");
                this.destination = destination2;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action$RestorePurchases;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Action;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RestorePurchases implements Action {
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
            public static final RestorePurchases INSTANCE = new RestorePurchases();

            private RestorePurchases() {
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) $cachedSerializer$delegate.getValue();
            }

            public final C5978b serializer() {
                return get$cachedSerializer();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "", "Companion", "CustomerCenter", "PrivacyPolicy", "Terms", "Url", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InternalRevenueCatAPI
    public interface Destination {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final C5978b serializer() {
                return new C5983g("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination", O.b(Destination.class), new d[]{O.b(CustomerCenter.class), O.b(PrivacyPolicy.class), O.b(Terms.class), O.b(Url.class)}, new C5978b[]{new C6448e0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.CustomerCenter", CustomerCenter.INSTANCE, new Annotation[0]), ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE, ButtonComponent$Destination$Terms$$serializer.INSTANCE, ButtonComponent$Destination$Url$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$CustomerCenter;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class CustomerCenter implements Destination {
            private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
            public static final CustomerCenter INSTANCE = new CustomerCenter();

            private CustomerCenter() {
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) $cachedSerializer$delegate.getValue();
            }

            public final C5978b serializer() {
                return get$cachedSerializer();
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B2\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;Ljh/d;Lih/f;)V", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class PrivacyPolicy implements Destination {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {null, UrlMethod.Companion.serializer()};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ PrivacyPolicy(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* renamed from: copy-26kQY28$default  reason: not valid java name */
            public static /* synthetic */ PrivacyPolicy m58copy26kQY28$default(PrivacyPolicy privacyPolicy, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = privacyPolicy.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = privacyPolicy.method;
                }
                return privacyPolicy.m60copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(PrivacyPolicy privacyPolicy, jh.d dVar, f fVar) {
                C5978b[] bVarArr = $childSerializers;
                dVar.B(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m112boximpl(privacyPolicy.urlLid));
                dVar.B(fVar, 1, bVarArr[1], privacyPolicy.method);
            }

            /* renamed from: component1-z7Tp-4o  reason: not valid java name */
            public final String m59component1z7Tp4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            /* renamed from: copy-26kQY28  reason: not valid java name */
            public final PrivacyPolicy m60copy26kQY28(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                return new PrivacyPolicy(str, urlMethod, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PrivacyPolicy)) {
                    return false;
                }
                PrivacyPolicy privacyPolicy = (PrivacyPolicy) obj;
                return LocalizationKey.m115equalsimpl0(this.urlLid, privacyPolicy.urlLid) && this.method == privacyPolicy.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* renamed from: getUrlLid-z7Tp-4o  reason: not valid java name */
            public final /* synthetic */ String m61getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m116hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "PrivacyPolicy(urlLid=" + LocalizationKey.m117toStringimpl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ PrivacyPolicy(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private PrivacyPolicy(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, ButtonComponent$Destination$PrivacyPolicy$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private PrivacyPolicy(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B2\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;Ljh/d;Lih/f;)V", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Terms implements Destination {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {null, UrlMethod.Companion.serializer()};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Terms;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ButtonComponent$Destination$Terms$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Terms(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* renamed from: copy-26kQY28$default  reason: not valid java name */
            public static /* synthetic */ Terms m62copy26kQY28$default(Terms terms, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = terms.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = terms.method;
                }
                return terms.m64copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(Terms terms, jh.d dVar, f fVar) {
                C5978b[] bVarArr = $childSerializers;
                dVar.B(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m112boximpl(terms.urlLid));
                dVar.B(fVar, 1, bVarArr[1], terms.method);
            }

            /* renamed from: component1-z7Tp-4o  reason: not valid java name */
            public final String m63component1z7Tp4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            /* renamed from: copy-26kQY28  reason: not valid java name */
            public final Terms m64copy26kQY28(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                return new Terms(str, urlMethod, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Terms)) {
                    return false;
                }
                Terms terms = (Terms) obj;
                return LocalizationKey.m115equalsimpl0(this.urlLid, terms.urlLid) && this.method == terms.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* renamed from: getUrlLid-z7Tp-4o  reason: not valid java name */
            public final /* synthetic */ String m65getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m116hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Terms(urlLid=" + LocalizationKey.m117toStringimpl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Terms(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private Terms(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, ButtonComponent$Destination$Terms$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Terms(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007B2\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\nø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u0002HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "method", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;Ljh/d;Lih/f;)V", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy-26kQY28", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Url implements Destination {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {null, UrlMethod.Companion.serializer()};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final UrlMethod method;
            private final String urlLid;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ButtonComponent$Destination$Url$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Url(int i10, String str, UrlMethod urlMethod, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, str, urlMethod, t0Var);
            }

            /* renamed from: copy-26kQY28$default  reason: not valid java name */
            public static /* synthetic */ Url m66copy26kQY28$default(Url url, String str, UrlMethod urlMethod, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = url.urlLid;
                }
                if ((i10 & 2) != 0) {
                    urlMethod = url.method;
                }
                return url.m68copy26kQY28(str, urlMethod);
            }

            public static final /* synthetic */ void write$Self(Url url, jh.d dVar, f fVar) {
                C5978b[] bVarArr = $childSerializers;
                dVar.B(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m112boximpl(url.urlLid));
                dVar.B(fVar, 1, bVarArr[1], url.method);
            }

            /* renamed from: component1-z7Tp-4o  reason: not valid java name */
            public final String m67component1z7Tp4o() {
                return this.urlLid;
            }

            public final UrlMethod component2() {
                return this.method;
            }

            /* renamed from: copy-26kQY28  reason: not valid java name */
            public final Url m68copy26kQY28(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                return new Url(str, urlMethod, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Url)) {
                    return false;
                }
                Url url = (Url) obj;
                return LocalizationKey.m115equalsimpl0(this.urlLid, url.urlLid) && this.method == url.method;
            }

            public final /* synthetic */ UrlMethod getMethod() {
                return this.method;
            }

            /* renamed from: getUrlLid-z7Tp-4o  reason: not valid java name */
            public final /* synthetic */ String m69getUrlLidz7Tp4o() {
                return this.urlLid;
            }

            public int hashCode() {
                return (LocalizationKey.m116hashCodeimpl(this.urlLid) * 31) + this.method.hashCode();
            }

            public String toString() {
                return "Url(urlLid=" + LocalizationKey.m117toStringimpl(this.urlLid) + ", method=" + this.method + ')';
            }

            public /* synthetic */ Url(String str, UrlMethod urlMethod, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, urlMethod);
            }

            private Url(int i10, String str, UrlMethod urlMethod, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, ButtonComponent$Destination$Url$$serializer.INSTANCE.getDescriptor());
                }
                this.urlLid = str;
                this.method = urlMethod;
            }

            private Url(String str, UrlMethod urlMethod) {
                C6496s.h(str, "urlLid");
                C6496s.h(urlMethod, "method");
                this.urlLid = str;
                this.method = urlMethod;
            }
        }
    }

    @InternalRevenueCatAPI
    @C5985i
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "", "(Ljava/lang/String;I)V", "IN_APP_BROWSER", "EXTERNAL_BROWSER", "DEEP_LINK", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UrlMethod {
        IN_APP_BROWSER,
        EXTERNAL_BROWSER,
        DEEP_LINK;
        
        /* access modifiers changed from: private */
        public static final Lazy $cachedSerializer$delegate = null;
        public static final Companion Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) UrlMethod.$cachedSerializer$delegate.getValue();
            }

            public final C5978b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
        }
    }

    @C6521e
    public /* synthetic */ ButtonComponent(int i10, Action action2, StackComponent stackComponent, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, ButtonComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.action = action2;
        this.stack = stackComponent;
    }

    public static final /* synthetic */ void write$Self(ButtonComponent buttonComponent, jh.d dVar, f fVar) {
        dVar.B(fVar, 0, ActionSerializer.INSTANCE, buttonComponent.action);
        dVar.B(fVar, 1, StackComponent$$serializer.INSTANCE, buttonComponent.stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonComponent)) {
            return false;
        }
        ButtonComponent buttonComponent = (ButtonComponent) obj;
        return C6496s.c(this.action, buttonComponent.action) && C6496s.c(this.stack, buttonComponent.stack);
    }

    public final /* synthetic */ Action getAction() {
        return this.action;
    }

    public final /* synthetic */ StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        return (this.action.hashCode() * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "ButtonComponent(action=" + this.action + ", stack=" + this.stack + ')';
    }

    public ButtonComponent(Action action2, StackComponent stackComponent) {
        C6496s.h(action2, "action");
        C6496s.h(stackComponent, "stack");
        this.action = action2;
        this.stack = stackComponent;
    }
}
