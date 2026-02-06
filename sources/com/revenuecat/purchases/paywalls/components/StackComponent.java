package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.Background$Color$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background$Image$$serializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.C;
import kh.C6448e0;
import kh.C6449f;
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
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 U2\u00020\u0001:\u0003VUWB³\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0002¢\u0006\u0004\b\u001e\u0010\u001fB»\u0001\b\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0014\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001e\u0010$J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÇ\u0001¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\bR\u0010SR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\bT\u0010/¨\u0006X"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "components", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "badge", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "overflow", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "overrides", "<init>", "(Ljava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Ljh/d;Lih/f;)V", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "getDimension", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/Float;", "getSpacing", "()Ljava/lang/Float;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "getBadge", "()Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverflow", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverrides", "Companion", "$serializer", "Overflow", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class StackComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {new C6449f(new PaywallComponentSerializer()), new C5983g("com.revenuecat.purchases.paywalls.components.properties.Dimension", O.b(Dimension.class), new d[]{O.b(Dimension.Horizontal.class), O.b(Dimension.Vertical.class), O.b(Dimension.ZLayer.class)}, new C5978b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, Overflow.Companion.serializer(), new C6449f(ComponentOverride.Companion.serializer(PartialStackComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Badge badge;
    private final Border border;
    private final List<PaywallComponent> components;
    private final Dimension dimension;
    private final Padding margin;
    private final Overflow overflow;
    private final List<ComponentOverride<PartialStackComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return StackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "", "(Ljava/lang/String;I)V", "NONE", "SCROLL", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Overflow {
        NONE,
        SCROLL;
        
        /* access modifiers changed from: private */
        public static final Lazy $cachedSerializer$delegate = null;
        public static final Companion Companion = null;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ C5978b get$cachedSerializer() {
                return (C5978b) Overflow.$cachedSerializer$delegate.getValue();
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
    public /* synthetic */ StackComponent(int i10, List list, Dimension dimension2, Size size2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, Badge badge2, Overflow overflow2, List list2, t0 t0Var) {
        Dimension dimension3;
        Size size3;
        Padding padding4;
        Padding padding5;
        List list3;
        int i11 = i10;
        if (1 != (i11 & 1)) {
            C6456i0.a(i10, 1, StackComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.components = list;
        if ((i11 & 2) == 0) {
            dimension3 = new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START);
        } else {
            dimension3 = dimension2;
        }
        this.dimension = dimension3;
        if ((i11 & 4) == 0) {
            size3 = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            size3 = size2;
        }
        this.size = size3;
        if ((i11 & 8) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f10;
        }
        if ((i11 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i11 & 32) == 0) {
            this.background = null;
        } else {
            this.background = background2;
        }
        if ((i11 & 64) == 0) {
            padding4 = Padding.Companion.getZero();
        } else {
            padding4 = padding2;
        }
        this.padding = padding4;
        if ((i11 & 128) == 0) {
            padding5 = Padding.Companion.getZero();
        } else {
            padding5 = padding3;
        }
        this.margin = padding5;
        if ((i11 & 256) == 0) {
            this.shape = null;
        } else {
            this.shape = shape2;
        }
        if ((i11 & 512) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i11 & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
        if ((i11 & 2048) == 0) {
            this.badge = null;
        } else {
            this.badge = badge2;
        }
        if ((i11 & 4096) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow2;
        }
        if ((i11 & 8192) == 0) {
            list3 = C6565s.n();
        } else {
            list3 = list2;
        }
        this.overrides = list3;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(StackComponent stackComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, bVarArr[0], stackComponent.components);
        if (dVar.q(fVar, 1) || !C6496s.c(stackComponent.dimension, new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START))) {
            dVar.B(fVar, 1, bVarArr[1], stackComponent.dimension);
        }
        if (dVar.q(fVar, 2) || !C6496s.c(stackComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 2, Size$$serializer.INSTANCE, stackComponent.size);
        }
        if (dVar.q(fVar, 3) || stackComponent.spacing != null) {
            dVar.p(fVar, 3, C.f71587a, stackComponent.spacing);
        }
        if (dVar.q(fVar, 4) || stackComponent.backgroundColor != null) {
            dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, stackComponent.backgroundColor);
        }
        if (dVar.q(fVar, 5) || stackComponent.background != null) {
            dVar.p(fVar, 5, bVarArr[5], stackComponent.background);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(stackComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 6, Padding$$serializer.INSTANCE, stackComponent.padding);
        }
        if (dVar.q(fVar, 7) || !C6496s.c(stackComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 7, Padding$$serializer.INSTANCE, stackComponent.margin);
        }
        if (dVar.q(fVar, 8) || stackComponent.shape != null) {
            dVar.p(fVar, 8, bVarArr[8], stackComponent.shape);
        }
        if (dVar.q(fVar, 9) || stackComponent.border != null) {
            dVar.p(fVar, 9, Border$$serializer.INSTANCE, stackComponent.border);
        }
        if (dVar.q(fVar, 10) || stackComponent.shadow != null) {
            dVar.p(fVar, 10, Shadow$$serializer.INSTANCE, stackComponent.shadow);
        }
        if (dVar.q(fVar, 11) || stackComponent.badge != null) {
            dVar.p(fVar, 11, Badge$$serializer.INSTANCE, stackComponent.badge);
        }
        if (dVar.q(fVar, 12) || stackComponent.overflow != null) {
            dVar.p(fVar, 12, bVarArr[12], stackComponent.overflow);
        }
        if (dVar.q(fVar, 13) || !C6496s.c(stackComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 13, bVarArr[13], stackComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponent)) {
            return false;
        }
        StackComponent stackComponent = (StackComponent) obj;
        return C6496s.c(this.components, stackComponent.components) && C6496s.c(this.dimension, stackComponent.dimension) && C6496s.c(this.size, stackComponent.size) && C6496s.c(this.spacing, stackComponent.spacing) && C6496s.c(this.backgroundColor, stackComponent.backgroundColor) && C6496s.c(this.background, stackComponent.background) && C6496s.c(this.padding, stackComponent.padding) && C6496s.c(this.margin, stackComponent.margin) && C6496s.c(this.shape, stackComponent.shape) && C6496s.c(this.border, stackComponent.border) && C6496s.c(this.shadow, stackComponent.shadow) && C6496s.c(this.badge, stackComponent.badge) && this.overflow == stackComponent.overflow && C6496s.c(this.overrides, stackComponent.overrides);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Badge getBadge() {
        return this.badge;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getComponents() {
        return this.components;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Overflow getOverflow() {
        return this.overflow;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Float getSpacing() {
        return this.spacing;
    }

    public int hashCode() {
        int hashCode = ((((this.components.hashCode() * 31) + this.dimension.hashCode()) * 31) + this.size.hashCode()) * 31;
        Float f10 = this.spacing;
        int i10 = 0;
        int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode3 = (hashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode4 = (((((hashCode3 + (background2 == null ? 0 : background2.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape2 = this.shape;
        int hashCode5 = (hashCode4 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode6 = (hashCode5 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        int hashCode7 = (hashCode6 + (shadow2 == null ? 0 : shadow2.hashCode())) * 31;
        Badge badge2 = this.badge;
        int hashCode8 = (hashCode7 + (badge2 == null ? 0 : badge2.hashCode())) * 31;
        Overflow overflow2 = this.overflow;
        if (overflow2 != null) {
            i10 = overflow2.hashCode();
        }
        return ((hashCode8 + i10) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "StackComponent(components=" + this.components + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", overflow=" + this.overflow + ", overrides=" + this.overrides + ')';
    }

    public StackComponent(List<? extends PaywallComponent> list, Dimension dimension2, Size size2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, Badge badge2, Overflow overflow2, List<ComponentOverride<PartialStackComponent>> list2) {
        C6496s.h(list, "components");
        C6496s.h(dimension2, "dimension");
        C6496s.h(size2, "size");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(list2, "overrides");
        this.components = list;
        this.dimension = dimension2;
        this.size = size2;
        this.spacing = f10;
        this.backgroundColor = colorScheme;
        this.background = background2;
        this.padding = padding2;
        this.margin = padding3;
        this.shape = shape2;
        this.border = border2;
        this.shadow = shadow2;
        this.badge = badge2;
        this.overflow = overflow2;
        this.overrides = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StackComponent(java.util.List r15, com.revenuecat.purchases.paywalls.components.properties.Dimension r16, com.revenuecat.purchases.paywalls.components.properties.Size r17, java.lang.Float r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, com.revenuecat.purchases.paywalls.components.common.Background r20, com.revenuecat.purchases.paywalls.components.properties.Padding r21, com.revenuecat.purchases.paywalls.components.properties.Padding r22, com.revenuecat.purchases.paywalls.components.properties.Shape r23, com.revenuecat.purchases.paywalls.components.properties.Border r24, com.revenuecat.purchases.paywalls.components.properties.Shadow r25, com.revenuecat.purchases.paywalls.components.properties.Badge r26, com.revenuecat.purchases.paywalls.components.StackComponent.Overflow r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r14 = this;
            r0 = r29
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical r1 = new com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r2 = com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment.CENTER
            com.revenuecat.purchases.paywalls.components.properties.FlexDistribution r3 = com.revenuecat.purchases.paywalls.components.properties.FlexDistribution.START
            r1.<init>(r2, r3)
            goto L_0x0012
        L_0x0010:
            r1 = r16
        L_0x0012:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0020
            com.revenuecat.purchases.paywalls.components.properties.Size r2 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r4 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r2.<init>(r3, r4)
            goto L_0x0022
        L_0x0020:
            r2 = r17
        L_0x0022:
            r3 = r0 & 8
            r4 = 0
            if (r3 == 0) goto L_0x0029
            r3 = r4
            goto L_0x002b
        L_0x0029:
            r3 = r18
        L_0x002b:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0031
            r5 = r4
            goto L_0x0033
        L_0x0031:
            r5 = r19
        L_0x0033:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0039
            r6 = r4
            goto L_0x003b
        L_0x0039:
            r6 = r20
        L_0x003b:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0046
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r7 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r7 = r7.getZero()
            goto L_0x0048
        L_0x0046:
            r7 = r21
        L_0x0048:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0053
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r8 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r8 = r8.getZero()
            goto L_0x0055
        L_0x0053:
            r8 = r22
        L_0x0055:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x005b
            r9 = r4
            goto L_0x005d
        L_0x005b:
            r9 = r23
        L_0x005d:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0063
            r10 = r4
            goto L_0x0065
        L_0x0063:
            r10 = r24
        L_0x0065:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x006b
            r11 = r4
            goto L_0x006d
        L_0x006b:
            r11 = r25
        L_0x006d:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0073
            r12 = r4
            goto L_0x0075
        L_0x0073:
            r12 = r26
        L_0x0075:
            r13 = r0 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r4 = r27
        L_0x007c:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0085
            java.util.List r0 = mf.C6565s.n()
            goto L_0x0087
        L_0x0085:
            r0 = r28
        L_0x0087:
            r16 = r14
            r17 = r15
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r4
            r30 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.StackComponent.<init>(java.util.List, com.revenuecat.purchases.paywalls.components.properties.Dimension, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.Float, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.properties.Badge, com.revenuecat.purchases.paywalls.components.StackComponent$Overflow, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
