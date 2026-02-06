package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.Background$Color$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background$Image$$serializer;
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
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C;
import kh.C6448e0;
import kh.C6455i;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002RQB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB\u0001\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J(\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÇ\u0001¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bA\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010N\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "badge", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "overflow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "getDimension", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/Float;", "getSpacing", "()Ljava/lang/Float;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "getBadge", "()Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverflow", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialStackComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Dimension", O.b(Dimension.class), new d[]{O.b(Dimension.Horizontal.class), O.b(Dimension.Vertical.class), O.b(Dimension.ZLayer.class)}, new C5978b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, StackComponent.Overflow.Companion.serializer()};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Badge badge;
    private final Border border;
    private final Dimension dimension;
    private final Padding margin;
    private final StackComponent.Overflow overflow;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialStackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialStackComponent() {
        this((Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialStackComponent partialStackComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(partialStackComponent.visible, Boolean.TRUE)) {
            dVar.p(fVar, 0, C6455i.f71663a, partialStackComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialStackComponent.dimension != null) {
            dVar.p(fVar, 1, bVarArr[1], partialStackComponent.dimension);
        }
        if (dVar.q(fVar, 2) || partialStackComponent.size != null) {
            dVar.p(fVar, 2, Size$$serializer.INSTANCE, partialStackComponent.size);
        }
        if (dVar.q(fVar, 3) || partialStackComponent.spacing != null) {
            dVar.p(fVar, 3, C.f71587a, partialStackComponent.spacing);
        }
        if (dVar.q(fVar, 4) || partialStackComponent.backgroundColor != null) {
            dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, partialStackComponent.backgroundColor);
        }
        if (dVar.q(fVar, 5) || partialStackComponent.background != null) {
            dVar.p(fVar, 5, bVarArr[5], partialStackComponent.background);
        }
        if (dVar.q(fVar, 6) || partialStackComponent.padding != null) {
            dVar.p(fVar, 6, Padding$$serializer.INSTANCE, partialStackComponent.padding);
        }
        if (dVar.q(fVar, 7) || partialStackComponent.margin != null) {
            dVar.p(fVar, 7, Padding$$serializer.INSTANCE, partialStackComponent.margin);
        }
        if (dVar.q(fVar, 8) || partialStackComponent.shape != null) {
            dVar.p(fVar, 8, bVarArr[8], partialStackComponent.shape);
        }
        if (dVar.q(fVar, 9) || partialStackComponent.border != null) {
            dVar.p(fVar, 9, Border$$serializer.INSTANCE, partialStackComponent.border);
        }
        if (dVar.q(fVar, 10) || partialStackComponent.shadow != null) {
            dVar.p(fVar, 10, Shadow$$serializer.INSTANCE, partialStackComponent.shadow);
        }
        if (dVar.q(fVar, 11) || partialStackComponent.badge != null) {
            dVar.p(fVar, 11, Badge$$serializer.INSTANCE, partialStackComponent.badge);
        }
        if (dVar.q(fVar, 12) || partialStackComponent.overflow != null) {
            dVar.p(fVar, 12, bVarArr[12], partialStackComponent.overflow);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialStackComponent)) {
            return false;
        }
        PartialStackComponent partialStackComponent = (PartialStackComponent) obj;
        return C6496s.c(this.visible, partialStackComponent.visible) && C6496s.c(this.dimension, partialStackComponent.dimension) && C6496s.c(this.size, partialStackComponent.size) && C6496s.c(this.spacing, partialStackComponent.spacing) && C6496s.c(this.backgroundColor, partialStackComponent.backgroundColor) && C6496s.c(this.background, partialStackComponent.background) && C6496s.c(this.padding, partialStackComponent.padding) && C6496s.c(this.margin, partialStackComponent.margin) && C6496s.c(this.shape, partialStackComponent.shape) && C6496s.c(this.border, partialStackComponent.border) && C6496s.c(this.shadow, partialStackComponent.shadow) && C6496s.c(this.badge, partialStackComponent.badge) && this.overflow == partialStackComponent.overflow;
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

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ StackComponent.Overflow getOverflow() {
        return this.overflow;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Dimension dimension2 = this.dimension;
        int hashCode2 = (hashCode + (dimension2 == null ? 0 : dimension2.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode3 = (hashCode2 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Float f10 = this.spacing;
        int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode6 = (hashCode5 + (background2 == null ? 0 : background2.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode7 = (hashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        int hashCode8 = (hashCode7 + (padding3 == null ? 0 : padding3.hashCode())) * 31;
        Shape shape2 = this.shape;
        int hashCode9 = (hashCode8 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode10 = (hashCode9 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        int hashCode11 = (hashCode10 + (shadow2 == null ? 0 : shadow2.hashCode())) * 31;
        Badge badge2 = this.badge;
        int hashCode12 = (hashCode11 + (badge2 == null ? 0 : badge2.hashCode())) * 31;
        StackComponent.Overflow overflow2 = this.overflow;
        if (overflow2 != null) {
            i10 = overflow2.hashCode();
        }
        return hashCode12 + i10;
    }

    public String toString() {
        return "PartialStackComponent(visible=" + this.visible + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", overflow=" + this.overflow + ')';
    }

    @C6521e
    public /* synthetic */ PartialStackComponent(int i10, Boolean bool, Dimension dimension2, Size size2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, Badge badge2, StackComponent.Overflow overflow2, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.dimension = null;
        } else {
            this.dimension = dimension2;
        }
        if ((i10 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i10 & 8) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f10;
        }
        if ((i10 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.background = null;
        } else {
            this.background = background2;
        }
        if ((i10 & 64) == 0) {
            this.padding = null;
        } else {
            this.padding = padding2;
        }
        if ((i10 & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding3;
        }
        if ((i10 & 256) == 0) {
            this.shape = null;
        } else {
            this.shape = shape2;
        }
        if ((i10 & 512) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i10 & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
        if ((i10 & 2048) == 0) {
            this.badge = null;
        } else {
            this.badge = badge2;
        }
        if ((i10 & 4096) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow2;
        }
    }

    public PartialStackComponent(Boolean bool, Dimension dimension2, Size size2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, Badge badge2, StackComponent.Overflow overflow2) {
        this.visible = bool;
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
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialStackComponent(java.lang.Boolean r15, com.revenuecat.purchases.paywalls.components.properties.Dimension r16, com.revenuecat.purchases.paywalls.components.properties.Size r17, java.lang.Float r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, com.revenuecat.purchases.paywalls.components.common.Background r20, com.revenuecat.purchases.paywalls.components.properties.Padding r21, com.revenuecat.purchases.paywalls.components.properties.Padding r22, com.revenuecat.purchases.paywalls.components.properties.Shape r23, com.revenuecat.purchases.paywalls.components.properties.Border r24, com.revenuecat.purchases.paywalls.components.properties.Shadow r25, com.revenuecat.purchases.paywalls.components.properties.Badge r26, com.revenuecat.purchases.paywalls.components.StackComponent.Overflow r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0013
        L_0x0011:
            r2 = r16
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r3
            goto L_0x001b
        L_0x0019:
            r4 = r17
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r3
            goto L_0x0023
        L_0x0021:
            r5 = r18
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r3
            goto L_0x002b
        L_0x0029:
            r6 = r19
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r3
            goto L_0x0033
        L_0x0031:
            r7 = r20
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r3
            goto L_0x003b
        L_0x0039:
            r8 = r21
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            r9 = r3
            goto L_0x0043
        L_0x0041:
            r9 = r22
        L_0x0043:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0049
            r10 = r3
            goto L_0x004b
        L_0x0049:
            r10 = r23
        L_0x004b:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0051
            r11 = r3
            goto L_0x0053
        L_0x0051:
            r11 = r24
        L_0x0053:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0059
            r12 = r3
            goto L_0x005b
        L_0x0059:
            r12 = r25
        L_0x005b:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0061
            r13 = r3
            goto L_0x0063
        L_0x0061:
            r13 = r26
        L_0x0063:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r3 = r27
        L_0x006a:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialStackComponent.<init>(java.lang.Boolean, com.revenuecat.purchases.paywalls.components.properties.Dimension, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.Float, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.properties.Badge, com.revenuecat.purchases.paywalls.components.StackComponent$Overflow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
