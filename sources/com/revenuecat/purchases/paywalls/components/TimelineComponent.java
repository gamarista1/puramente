package com.revenuecat.purchases.paywalls.components;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import java.util.List;
import jh.d;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 92\u00020\u0001:\u0005:9;<=Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r¢\u0006\u0004\b\u0013\u0010\u0014B\u0001\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u00103R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\r8\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b8\u00107¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "items", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "overrides", "<init>", "(IIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IIIILcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;Ljh/d;Lih/f;)V", "I", "getItemSpacing", "()I", "getItemSpacing$annotations", "()V", "getTextSpacing", "getTextSpacing$annotations", "getColumnGutter", "getColumnGutter$annotations", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getOverrides", "Companion", "$serializer", "Connector", "IconAlignment", "Item", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TimelineComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, IconAlignment.Companion.serializer(), null, null, null, new C6449f(TimelineComponent$Item$$serializer.INSTANCE), new C6449f(ComponentOverride.Companion.serializer(PartialTimelineComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final int columnGutter;
    private final IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List<Item> items;
    private final Padding margin;
    private final List<ComponentOverride<PartialTimelineComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final int textSpacing;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return TimelineComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "", "", "width", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "<init>", "(ILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IILcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljh/d;Lih/f;)V", "I", "getWidth", "()I", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Connector {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final ColorScheme color;
        private final Padding margin;
        private final int width;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return TimelineComponent$Connector$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Connector(int i10, int i11, Padding padding, ColorScheme colorScheme, t0 t0Var) {
            if (7 != (i10 & 7)) {
                C6456i0.a(i10, 7, TimelineComponent$Connector$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.margin = padding;
            this.color = colorScheme;
        }

        public static final /* synthetic */ void write$Self(Connector connector, d dVar, f fVar) {
            dVar.i(fVar, 0, connector.width);
            dVar.B(fVar, 1, Padding$$serializer.INSTANCE, connector.margin);
            dVar.B(fVar, 2, ColorScheme$$serializer.INSTANCE, connector.color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connector)) {
                return false;
            }
            Connector connector = (Connector) obj;
            return this.width == connector.width && C6496s.c(this.margin, connector.margin) && C6496s.c(this.color, connector.color);
        }

        public final /* synthetic */ ColorScheme getColor() {
            return this.color;
        }

        public final /* synthetic */ Padding getMargin() {
            return this.margin;
        }

        public final /* synthetic */ int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.width) * 31) + this.margin.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "Connector(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }

        public Connector(int i10, Padding padding, ColorScheme colorScheme) {
            C6496s.h(padding, "margin");
            C6496s.h(colorScheme, "color");
            this.width = i10;
            this.margin = padding;
            this.color = colorScheme;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "", "(Ljava/lang/String;I)V", "Title", "TitleAndDescription", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum IconAlignment {
        Title,
        TitleAndDescription;
        
        /* access modifiers changed from: private */
        public static final Lazy $cachedSerializer$delegate = null;
        public static final Companion Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) IconAlignment.$cachedSerializer$delegate.getValue();
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
    public /* synthetic */ TimelineComponent(int i10, int i11, int i12, int i13, IconAlignment iconAlignment2, Size size2, Padding padding2, Padding padding3, List list, List list2, t0 t0Var) {
        if (15 != (i10 & 15)) {
            C6456i0.a(i10, 15, TimelineComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.itemSpacing = i11;
        this.textSpacing = i12;
        this.columnGutter = i13;
        this.iconAlignment = iconAlignment2;
        if ((i10 & 16) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size2;
        }
        if ((i10 & 32) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding2;
        }
        if ((i10 & 64) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding3;
        }
        if ((i10 & 128) == 0) {
            this.items = C6565s.n();
        } else {
            this.items = list;
        }
        if ((i10 & 256) == 0) {
            this.overrides = C6565s.n();
        } else {
            this.overrides = list2;
        }
    }

    public static /* synthetic */ void getColumnGutter$annotations() {
    }

    public static /* synthetic */ void getIconAlignment$annotations() {
    }

    public static /* synthetic */ void getItemSpacing$annotations() {
    }

    public static /* synthetic */ void getTextSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self(TimelineComponent timelineComponent, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.i(fVar, 0, timelineComponent.itemSpacing);
        dVar.i(fVar, 1, timelineComponent.textSpacing);
        dVar.i(fVar, 2, timelineComponent.columnGutter);
        dVar.B(fVar, 3, bVarArr[3], timelineComponent.iconAlignment);
        if (dVar.q(fVar, 4) || !C6496s.c(timelineComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 4, Size$$serializer.INSTANCE, timelineComponent.size);
        }
        if (dVar.q(fVar, 5) || !C6496s.c(timelineComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 5, Padding$$serializer.INSTANCE, timelineComponent.padding);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(timelineComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 6, Padding$$serializer.INSTANCE, timelineComponent.margin);
        }
        if (dVar.q(fVar, 7) || !C6496s.c(timelineComponent.items, C6565s.n())) {
            dVar.B(fVar, 7, bVarArr[7], timelineComponent.items);
        }
        if (dVar.q(fVar, 8) || !C6496s.c(timelineComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 8, bVarArr[8], timelineComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineComponent)) {
            return false;
        }
        TimelineComponent timelineComponent = (TimelineComponent) obj;
        return this.itemSpacing == timelineComponent.itemSpacing && this.textSpacing == timelineComponent.textSpacing && this.columnGutter == timelineComponent.columnGutter && this.iconAlignment == timelineComponent.iconAlignment && C6496s.c(this.size, timelineComponent.size) && C6496s.c(this.padding, timelineComponent.padding) && C6496s.c(this.margin, timelineComponent.margin) && C6496s.c(this.items, timelineComponent.items) && C6496s.c(this.overrides, timelineComponent.overrides);
    }

    public final /* synthetic */ int getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ int getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ List getItems() {
        return this.items;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ int getTextSpacing() {
        return this.textSpacing;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.itemSpacing) * 31) + Integer.hashCode(this.textSpacing)) * 31) + Integer.hashCode(this.columnGutter)) * 31) + this.iconAlignment.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.items.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TimelineComponent(itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", items=" + this.items + ", overrides=" + this.overrides + ')';
    }

    @C5985i
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*)BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\u0004\b\r\u0010\u000eBY\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÇ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "title", "description", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "icon", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "connector", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponentItem;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/TextComponent;Lcom/revenuecat/purchases/paywalls/components/IconComponent;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "getTitle", "()Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "getDescription", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "getIcon", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "getConnector", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Item {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {null, null, null, null, new C6449f(ComponentOverride.Companion.serializer(PartialTimelineComponentItem$$serializer.INSTANCE))};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Connector connector;
        private final TextComponent description;
        private final IconComponent icon;
        private final List<ComponentOverride<PartialTimelineComponentItem>> overrides;
        private final TextComponent title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return TimelineComponent$Item$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Item(int i10, TextComponent textComponent, TextComponent textComponent2, IconComponent iconComponent, Connector connector2, List list, t0 t0Var) {
            if (5 != (i10 & 5)) {
                C6456i0.a(i10, 5, TimelineComponent$Item$$serializer.INSTANCE.getDescriptor());
            }
            this.title = textComponent;
            if ((i10 & 2) == 0) {
                this.description = null;
            } else {
                this.description = textComponent2;
            }
            this.icon = iconComponent;
            if ((i10 & 8) == 0) {
                this.connector = null;
            } else {
                this.connector = connector2;
            }
            if ((i10 & 16) == 0) {
                this.overrides = C6565s.n();
            } else {
                this.overrides = list;
            }
        }

        public static final /* synthetic */ void write$Self(Item item, d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            dVar.B(fVar, 0, textComponent$$serializer, item.title);
            if (dVar.q(fVar, 1) || item.description != null) {
                dVar.p(fVar, 1, textComponent$$serializer, item.description);
            }
            dVar.B(fVar, 2, IconComponent$$serializer.INSTANCE, item.icon);
            if (dVar.q(fVar, 3) || item.connector != null) {
                dVar.p(fVar, 3, TimelineComponent$Connector$$serializer.INSTANCE, item.connector);
            }
            if (dVar.q(fVar, 4) || !C6496s.c(item.overrides, C6565s.n())) {
                dVar.B(fVar, 4, bVarArr[4], item.overrides);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return C6496s.c(this.title, item.title) && C6496s.c(this.description, item.description) && C6496s.c(this.icon, item.icon) && C6496s.c(this.connector, item.connector) && C6496s.c(this.overrides, item.overrides);
        }

        public final /* synthetic */ Connector getConnector() {
            return this.connector;
        }

        public final /* synthetic */ TextComponent getDescription() {
            return this.description;
        }

        public final /* synthetic */ IconComponent getIcon() {
            return this.icon;
        }

        public final /* synthetic */ List getOverrides() {
            return this.overrides;
        }

        public final /* synthetic */ TextComponent getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextComponent textComponent = this.description;
            int i10 = 0;
            int hashCode2 = (((hashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31) + this.icon.hashCode()) * 31;
            Connector connector2 = this.connector;
            if (connector2 != null) {
                i10 = connector2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + this.overrides.hashCode();
        }

        public String toString() {
            return "Item(title=" + this.title + ", description=" + this.description + ", icon=" + this.icon + ", connector=" + this.connector + ", overrides=" + this.overrides + ')';
        }

        public Item(TextComponent textComponent, TextComponent textComponent2, IconComponent iconComponent, Connector connector2, List<ComponentOverride<PartialTimelineComponentItem>> list) {
            C6496s.h(textComponent, b.f37461S);
            C6496s.h(iconComponent, "icon");
            C6496s.h(list, "overrides");
            this.title = textComponent;
            this.description = textComponent2;
            this.icon = iconComponent;
            this.connector = connector2;
            this.overrides = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Item(TextComponent textComponent, TextComponent textComponent2, IconComponent iconComponent, Connector connector2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(textComponent, (i10 & 2) != 0 ? null : textComponent2, iconComponent, (i10 & 8) != 0 ? null : connector2, (i10 & 16) != 0 ? C6565s.n() : list);
        }
    }

    public TimelineComponent(int i10, int i11, int i12, IconAlignment iconAlignment2, Size size2, Padding padding2, Padding padding3, List<Item> list, List<ComponentOverride<PartialTimelineComponent>> list2) {
        C6496s.h(iconAlignment2, "iconAlignment");
        C6496s.h(size2, "size");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(list, "items");
        C6496s.h(list2, "overrides");
        this.itemSpacing = i10;
        this.textSpacing = i11;
        this.columnGutter = i12;
        this.iconAlignment = iconAlignment2;
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
        this.items = list;
        this.overrides = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TimelineComponent(int r15, int r16, int r17, com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment r18, com.revenuecat.purchases.paywalls.components.properties.Size r19, com.revenuecat.purchases.paywalls.components.properties.Padding r20, com.revenuecat.purchases.paywalls.components.properties.Padding r21, java.util.List r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r14 = this;
            r0 = r24
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r2 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r2, r3)
            r9 = r1
            goto L_0x0013
        L_0x0011:
            r9 = r19
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001f
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r10 = r1
            goto L_0x0021
        L_0x001f:
            r10 = r20
        L_0x0021:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002d
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r11 = r1
            goto L_0x002f
        L_0x002d:
            r11 = r21
        L_0x002f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            java.util.List r1 = mf.C6565s.n()
            r12 = r1
            goto L_0x003b
        L_0x0039:
            r12 = r22
        L_0x003b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0045
            java.util.List r0 = mf.C6565s.n()
            r13 = r0
            goto L_0x0047
        L_0x0045:
            r13 = r23
        L_0x0047:
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TimelineComponent.<init>(int, int, int, com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
