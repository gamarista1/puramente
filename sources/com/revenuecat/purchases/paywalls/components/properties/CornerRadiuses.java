package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i(with = CornerRadiusesSerializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "Companion", "Dp", "Percentage", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface CornerRadiuses {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            return CornerRadiusesSerializer.INSTANCE;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001c¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(DDDD)V", "all", "(D)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IDDDDLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;Ljh/d;Lih/f;)V", "copy", "(DDDD)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "D", "getTopLeading", "()D", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dp implements CornerRadiuses {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: default  reason: not valid java name */
        public static final Dp f3default;
        /* access modifiers changed from: private */
        public static final Dp zero;
        private final double bottomLeading;
        private final double bottomTrailing;
        private final double topLeading;
        private final double topTrailing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00058F¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "serializer", "()Lgh/b;", "zero", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "getZero", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "default", "getDefault", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dp getDefault() {
                return Dp.f3default;
            }

            public final /* synthetic */ Dp getZero() {
                return Dp.zero;
            }

            public final C5978b serializer() {
                return CornerRadiuses$Dp$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            Dp dp = new Dp(0.0d, 0.0d, 0.0d, 0.0d);
            zero = dp;
            f3default = dp;
        }

        public Dp(double d10, double d11, double d12, double d13) {
            this.topLeading = d10;
            this.topTrailing = d11;
            this.bottomLeading = d12;
            this.bottomTrailing = d13;
        }

        public static /* synthetic */ Dp copy$default(Dp dp, double d10, double d11, double d12, double d13, int i10, Object obj) {
            double d14;
            double d15;
            double d16;
            double d17;
            Dp dp2 = dp;
            if ((i10 & 1) != 0) {
                d14 = dp2.topLeading;
            } else {
                d14 = d10;
            }
            if ((i10 & 2) != 0) {
                d15 = dp2.topTrailing;
            } else {
                d15 = d11;
            }
            if ((i10 & 4) != 0) {
                d16 = dp2.bottomLeading;
            } else {
                d16 = d12;
            }
            if ((i10 & 8) != 0) {
                d17 = dp2.bottomTrailing;
            } else {
                d17 = d13;
            }
            return dp.copy(d14, d15, d16, d17);
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self(Dp dp, d dVar, f fVar) {
            dVar.g(fVar, 0, dp.topLeading);
            dVar.g(fVar, 1, dp.topTrailing);
            dVar.g(fVar, 2, dp.bottomLeading);
            dVar.g(fVar, 3, dp.bottomTrailing);
        }

        public final Dp copy(double d10, double d11, double d12, double d13) {
            return new Dp(d10, d11, d12, d13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dp)) {
                return false;
            }
            Dp dp = (Dp) obj;
            return Double.compare(this.topLeading, dp.topLeading) == 0 && Double.compare(this.topTrailing, dp.topTrailing) == 0 && Double.compare(this.bottomLeading, dp.bottomLeading) == 0 && Double.compare(this.bottomTrailing, dp.bottomTrailing) == 0;
        }

        public final /* synthetic */ double getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ double getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ double getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ double getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.topLeading) * 31) + Double.hashCode(this.topTrailing)) * 31) + Double.hashCode(this.bottomLeading)) * 31) + Double.hashCode(this.bottomTrailing);
        }

        public String toString() {
            return "Dp(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @C6521e
        public /* synthetic */ Dp(int i10, double d10, double d11, double d12, double d13, t0 t0Var) {
            if (15 != (i10 & 15)) {
                C6456i0.a(i10, 15, CornerRadiuses$Dp$$serializer.INSTANCE.getDescriptor());
            }
            this.topLeading = d10;
            this.topTrailing = d11;
            this.bottomLeading = d12;
            this.bottomTrailing = d13;
        }

        public Dp(double d10) {
            this(d10, d10, d10, d10);
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u0019R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b!\u0010\u001b\u001a\u0004\b \u0010\u0019¨\u0006$"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(IIII)V", "all", "(I)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IIIIILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;Ljh/d;Lih/f;)V", "I", "getTopLeading", "()I", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Percentage implements CornerRadiuses {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final int bottomLeading;
        private final int bottomTrailing;
        private final int topLeading;
        private final int topTrailing;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return CornerRadiuses$Percentage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Percentage(int i10, int i11, int i12, int i13) {
            this.topLeading = i10;
            this.topTrailing = i11;
            this.bottomLeading = i12;
            this.bottomTrailing = i13;
        }

        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        public static /* synthetic */ void getTopLeading$annotations() {
        }

        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self(Percentage percentage, d dVar, f fVar) {
            dVar.i(fVar, 0, percentage.topLeading);
            dVar.i(fVar, 1, percentage.topTrailing);
            dVar.i(fVar, 2, percentage.bottomLeading);
            dVar.i(fVar, 3, percentage.bottomTrailing);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Percentage)) {
                return false;
            }
            Percentage percentage = (Percentage) obj;
            return this.topLeading == percentage.topLeading && this.topTrailing == percentage.topTrailing && this.bottomLeading == percentage.bottomLeading && this.bottomTrailing == percentage.bottomTrailing;
        }

        public final /* synthetic */ int getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ int getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ int getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ int getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.topLeading) * 31) + Integer.hashCode(this.topTrailing)) * 31) + Integer.hashCode(this.bottomLeading)) * 31) + Integer.hashCode(this.bottomTrailing);
        }

        public String toString() {
            return "Percentage(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @C6521e
        public /* synthetic */ Percentage(int i10, int i11, int i12, int i13, int i14, t0 t0Var) {
            if (15 != (i10 & 15)) {
                C6456i0.a(i10, 15, CornerRadiuses$Percentage$$serializer.INSTANCE.getDescriptor());
            }
            this.topLeading = i11;
            this.topTrailing = i12;
            this.bottomLeading = i13;
            this.bottomTrailing = i14;
        }

        public Percentage(int i10) {
            this(i10, i10, i10, i10);
        }
    }
}
