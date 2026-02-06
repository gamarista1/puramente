package com.revenuecat.purchases.paywalls.components.common;

import com.adjust.sdk.Constants;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import ih.i;
import java.util.List;
import jh.c;
import jh.d;
import jh.e;
import kh.C6449f;
import kh.C6456i0;
import kh.C6458j0;
import kh.D;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000  *\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0004! \"#B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB5\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJB\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0001\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "T", "", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "conditions", "properties", "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/PartialComponent;Lkh/t0;)V", "T0", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Lgh/b;", "typeSerial0", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;Ljh/d;Lih/f;Lgh/b;)V", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "getProperties", "()Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "Companion", "$serializer", "Condition", "ConditionSerializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ComponentOverride<T extends PartialComponent> {
    private static final f $cachedDescriptor;
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {new C6449f(ConditionSerializer.INSTANCE), null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final List<Condition> conditions;
    private final T properties;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Companion;", "", "<init>", "()V", "T0", "Lgh/b;", "typeSerial0", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "serializer", "(Lgh/b;)Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T0> C5978b serializer(C5978b bVar) {
            C6496s.h(bVar, "typeSerial0");
            return new ComponentOverride$$serializer(bVar);
        }

        private Companion() {
        }
    }

    @C5985i(with = ConditionSerializer.class)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "", "Compact", "Companion", "Expanded", "IntroOffer", "Medium", "MultipleIntroOffers", "Selected", "Unsupported", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultipleIntroOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Condition {
        public static final Companion Companion = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Compact;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Compact implements Condition {
            public static final Compact INSTANCE = new Compact();

            private Compact() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final C5978b serializer() {
                return ConditionSerializer.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Expanded;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Expanded implements Condition {
            public static final Expanded INSTANCE = new Expanded();

            private Expanded() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$IntroOffer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class IntroOffer implements Condition {
            public static final IntroOffer INSTANCE = new IntroOffer();

            private IntroOffer() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Medium;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Medium implements Condition {
            public static final Medium INSTANCE = new Medium();

            private Medium() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$MultipleIntroOffers;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class MultipleIntroOffers implements Condition {
            public static final MultipleIntroOffers INSTANCE = new MultipleIntroOffers();

            private MultipleIntroOffers() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Selected;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Selected implements Condition {
            public static final Selected INSTANCE = new Selected();

            private Selected() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition$Unsupported;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Unsupported implements Condition {
            public static final Unsupported INSTANCE = new Unsupported();

            private Unsupported() {
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$ConditionSerializer;", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride$Condition;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class ConditionSerializer implements C5978b {
        public static final ConditionSerializer INSTANCE = new ConditionSerializer();
        private static final f descriptor = i.b("ComponentOverride.Condition", new f[0], ComponentOverride$ConditionSerializer$descriptor$1.INSTANCE);

        private ConditionSerializer() {
        }

        public f getDescriptor() {
            return descriptor;
        }

        public void serialize(jh.f fVar, Condition condition) {
            C6496s.h(fVar, "encoder");
            C6496s.h(condition, "value");
        }

        public Condition deserialize(e eVar) {
            C6496s.h(eVar, "decoder");
            c b10 = eVar.b(getDescriptor());
            String str = null;
            while (b10.o(getDescriptor()) == 0) {
                str = b10.A(getDescriptor(), 0);
            }
            b10.c(getDescriptor());
            if (str != null) {
                switch (str.hashCode()) {
                    case -1939100487:
                        if (str.equals("expanded")) {
                            return Condition.Expanded.INSTANCE;
                        }
                        break;
                    case -1502800743:
                        if (str.equals("multiple_intro_offers")) {
                            return Condition.MultipleIntroOffers.INSTANCE;
                        }
                        break;
                    case -1078030475:
                        if (str.equals(Constants.MEDIUM)) {
                            return Condition.Medium.INSTANCE;
                        }
                        break;
                    case 316695241:
                        if (str.equals("intro_offer")) {
                            return Condition.IntroOffer.INSTANCE;
                        }
                        break;
                    case 950483747:
                        if (str.equals("compact")) {
                            return Condition.Compact.INSTANCE;
                        }
                        break;
                    case 1191572123:
                        if (str.equals("selected")) {
                            return Condition.Selected.INSTANCE;
                        }
                        break;
                }
            }
            return Condition.Unsupported.INSTANCE;
        }
    }

    static {
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", (D) null, 2);
        j0Var.l("conditions", false);
        j0Var.l(DiagnosticsEntry.PROPERTIES_KEY, false);
        $cachedDescriptor = j0Var;
    }

    @C6521e
    public /* synthetic */ ComponentOverride(int i10, List list, PartialComponent partialComponent, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, $cachedDescriptor);
        }
        this.conditions = list;
        this.properties = partialComponent;
    }

    public static final /* synthetic */ void write$Self(ComponentOverride componentOverride, d dVar, f fVar, C5978b bVar) {
        dVar.B(fVar, 0, $childSerializers[0], componentOverride.conditions);
        dVar.B(fVar, 1, bVar, componentOverride.properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentOverride)) {
            return false;
        }
        ComponentOverride componentOverride = (ComponentOverride) obj;
        return C6496s.c(this.conditions, componentOverride.conditions) && C6496s.c(this.properties, componentOverride.properties);
    }

    public final /* synthetic */ List getConditions() {
        return this.conditions;
    }

    public final /* synthetic */ PartialComponent getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (this.conditions.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "ComponentOverride(conditions=" + this.conditions + ", properties=" + this.properties + ')';
    }

    public ComponentOverride(List<? extends Condition> list, T t10) {
        C6496s.h(list, "conditions");
        C6496s.h(t10, DiagnosticsEntry.PROPERTIES_KEY);
        this.conditions = list;
        this.properties = t10;
    }
}
