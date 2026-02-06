package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.Background$Color$$serializer;
import com.revenuecat.purchases.paywalls.components.common.Background$Image$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C;
import kh.C6448e0;
import kh.C6455i;
import kh.I;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\u0007\u0018\u0000 _2\u00020\u0001:\u0002`_BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 BÉ\u0001\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÇ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010;R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b=\u00104\u001a\u0004\b<\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u0010>\u0012\u0004\bA\u00104\u001a\u0004\b?\u0010@R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bE\u00104\u001a\u0004\bC\u0010DR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bL\u0010KR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010S\u001a\u0004\bT\u0010UR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010V\u0012\u0004\bY\u00104\u001a\u0004\bW\u0010XR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\bZ\u0010/R\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010[\u0012\u0004\b^\u00104\u001a\u0004\b\\\u0010]¨\u0006a"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "", "initialPageIndex", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "pageAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "pagePeek", "", "pageSpacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "pageControl", "loop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "autoAdvance", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Integer;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getInitialPageIndex", "()Ljava/lang/Integer;", "getInitialPageIndex$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getPageAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getPagePeek", "getPagePeek$annotations", "Ljava/lang/Float;", "getPageSpacing", "()Ljava/lang/Float;", "getPageSpacing$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "getPageControl$annotations", "getLoop", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance", "()Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$AutoAdvancePages;", "getAutoAdvance$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialCarouselComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, VerticalAlignment.Companion.serializer(), null, null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CarouselComponent.AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final CarouselComponent.PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialCarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialCarouselComponent() {
        this((Boolean) null, (Integer) null, (VerticalAlignment) null, (Size) null, (Integer) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (CarouselComponent.PageControl) null, (Boolean) null, (CarouselComponent.AutoAdvancePages) null, 65535, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getAutoAdvance$annotations() {
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getInitialPageIndex$annotations() {
    }

    public static /* synthetic */ void getPageAlignment$annotations() {
    }

    public static /* synthetic */ void getPageControl$annotations() {
    }

    public static /* synthetic */ void getPagePeek$annotations() {
    }

    public static /* synthetic */ void getPageSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialCarouselComponent partialCarouselComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || partialCarouselComponent.visible != null) {
            dVar.p(fVar, 0, C6455i.f71663a, partialCarouselComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialCarouselComponent.initialPageIndex != null) {
            dVar.p(fVar, 1, I.f71604a, partialCarouselComponent.initialPageIndex);
        }
        if (dVar.q(fVar, 2) || partialCarouselComponent.pageAlignment != null) {
            dVar.p(fVar, 2, bVarArr[2], partialCarouselComponent.pageAlignment);
        }
        if (dVar.q(fVar, 3) || partialCarouselComponent.size != null) {
            dVar.p(fVar, 3, Size$$serializer.INSTANCE, partialCarouselComponent.size);
        }
        if (dVar.q(fVar, 4) || partialCarouselComponent.pagePeek != null) {
            dVar.p(fVar, 4, I.f71604a, partialCarouselComponent.pagePeek);
        }
        if (dVar.q(fVar, 5) || partialCarouselComponent.pageSpacing != null) {
            dVar.p(fVar, 5, C.f71587a, partialCarouselComponent.pageSpacing);
        }
        if (dVar.q(fVar, 6) || partialCarouselComponent.backgroundColor != null) {
            dVar.p(fVar, 6, ColorScheme$$serializer.INSTANCE, partialCarouselComponent.backgroundColor);
        }
        if (dVar.q(fVar, 7) || partialCarouselComponent.background != null) {
            dVar.p(fVar, 7, bVarArr[7], partialCarouselComponent.background);
        }
        if (dVar.q(fVar, 8) || partialCarouselComponent.padding != null) {
            dVar.p(fVar, 8, Padding$$serializer.INSTANCE, partialCarouselComponent.padding);
        }
        if (dVar.q(fVar, 9) || partialCarouselComponent.margin != null) {
            dVar.p(fVar, 9, Padding$$serializer.INSTANCE, partialCarouselComponent.margin);
        }
        if (dVar.q(fVar, 10) || partialCarouselComponent.shape != null) {
            dVar.p(fVar, 10, bVarArr[10], partialCarouselComponent.shape);
        }
        if (dVar.q(fVar, 11) || partialCarouselComponent.border != null) {
            dVar.p(fVar, 11, Border$$serializer.INSTANCE, partialCarouselComponent.border);
        }
        if (dVar.q(fVar, 12) || partialCarouselComponent.shadow != null) {
            dVar.p(fVar, 12, Shadow$$serializer.INSTANCE, partialCarouselComponent.shadow);
        }
        if (dVar.q(fVar, 13) || partialCarouselComponent.pageControl != null) {
            dVar.p(fVar, 13, CarouselComponent$PageControl$$serializer.INSTANCE, partialCarouselComponent.pageControl);
        }
        if (dVar.q(fVar, 14) || partialCarouselComponent.loop != null) {
            dVar.p(fVar, 14, C6455i.f71663a, partialCarouselComponent.loop);
        }
        if (dVar.q(fVar, 15) || partialCarouselComponent.autoAdvance != null) {
            dVar.p(fVar, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, partialCarouselComponent.autoAdvance);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialCarouselComponent)) {
            return false;
        }
        PartialCarouselComponent partialCarouselComponent = (PartialCarouselComponent) obj;
        return C6496s.c(this.visible, partialCarouselComponent.visible) && C6496s.c(this.initialPageIndex, partialCarouselComponent.initialPageIndex) && this.pageAlignment == partialCarouselComponent.pageAlignment && C6496s.c(this.size, partialCarouselComponent.size) && C6496s.c(this.pagePeek, partialCarouselComponent.pagePeek) && C6496s.c(this.pageSpacing, partialCarouselComponent.pageSpacing) && C6496s.c(this.backgroundColor, partialCarouselComponent.backgroundColor) && C6496s.c(this.background, partialCarouselComponent.background) && C6496s.c(this.padding, partialCarouselComponent.padding) && C6496s.c(this.margin, partialCarouselComponent.margin) && C6496s.c(this.shape, partialCarouselComponent.shape) && C6496s.c(this.border, partialCarouselComponent.border) && C6496s.c(this.shadow, partialCarouselComponent.shadow) && C6496s.c(this.pageControl, partialCarouselComponent.pageControl) && C6496s.c(this.loop, partialCarouselComponent.loop) && C6496s.c(this.autoAdvance, partialCarouselComponent.autoAdvance);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ Boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ CarouselComponent.PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.initialPageIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.pageAlignment;
        int hashCode3 = (hashCode2 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode4 = (hashCode3 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Integer num2 = this.pagePeek;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f10 = this.pageSpacing;
        int hashCode6 = (hashCode5 + (f10 == null ? 0 : f10.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode7 = (hashCode6 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode8 = (hashCode7 + (background2 == null ? 0 : background2.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode9 = (hashCode8 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        int hashCode10 = (hashCode9 + (padding3 == null ? 0 : padding3.hashCode())) * 31;
        Shape shape2 = this.shape;
        int hashCode11 = (hashCode10 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode12 = (hashCode11 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        int hashCode13 = (hashCode12 + (shadow2 == null ? 0 : shadow2.hashCode())) * 31;
        CarouselComponent.PageControl pageControl2 = this.pageControl;
        int hashCode14 = (hashCode13 + (pageControl2 == null ? 0 : pageControl2.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CarouselComponent.AutoAdvancePages autoAdvancePages = this.autoAdvance;
        if (autoAdvancePages != null) {
            i10 = autoAdvancePages.hashCode();
        }
        return hashCode15 + i10;
    }

    public String toString() {
        return "PartialCarouselComponent(visible=" + this.visible + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ')';
    }

    @C6521e
    public /* synthetic */ PartialCarouselComponent(int i10, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size2, Integer num2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, CarouselComponent.PageControl pageControl2, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages, t0 t0Var) {
        int i11 = i10;
        if ((i11 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i11 & 2) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        if ((i11 & 4) == 0) {
            this.pageAlignment = null;
        } else {
            this.pageAlignment = verticalAlignment;
        }
        if ((i11 & 8) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i11 & 16) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i11 & 32) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f10;
        }
        if ((i11 & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i11 & 128) == 0) {
            this.background = null;
        } else {
            this.background = background2;
        }
        if ((i11 & 256) == 0) {
            this.padding = null;
        } else {
            this.padding = padding2;
        }
        if ((i11 & 512) == 0) {
            this.margin = null;
        } else {
            this.margin = padding3;
        }
        if ((i11 & 1024) == 0) {
            this.shape = null;
        } else {
            this.shape = shape2;
        }
        if ((i11 & 2048) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i11 & 4096) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
        if ((i11 & 8192) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl2;
        }
        if ((i11 & 16384) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((i11 & 32768) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
    }

    public PartialCarouselComponent(Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size2, Integer num2, Float f10, ColorScheme colorScheme, Background background2, Padding padding2, Padding padding3, Shape shape2, Border border2, Shadow shadow2, CarouselComponent.PageControl pageControl2, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = verticalAlignment;
        this.size = size2;
        this.pagePeek = num2;
        this.pageSpacing = f10;
        this.backgroundColor = colorScheme;
        this.background = background2;
        this.padding = padding2;
        this.margin = padding3;
        this.shape = shape2;
        this.border = border2;
        this.shadow = shadow2;
        this.pageControl = pageControl2;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialCarouselComponent(java.lang.Boolean r18, java.lang.Integer r19, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment r20, com.revenuecat.purchases.paywalls.components.properties.Size r21, java.lang.Integer r22, java.lang.Float r23, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r24, com.revenuecat.purchases.paywalls.components.common.Background r25, com.revenuecat.purchases.paywalls.components.properties.Padding r26, com.revenuecat.purchases.paywalls.components.properties.Padding r27, com.revenuecat.purchases.paywalls.components.properties.Shape r28, com.revenuecat.purchases.paywalls.components.properties.Border r29, com.revenuecat.purchases.paywalls.components.properties.Shadow r30, com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl r31, java.lang.Boolean r32, com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r18
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r19
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r20
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r21
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r22
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r23
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r24
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r25
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r26
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r27
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r28
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r29
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r30
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r31
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r32
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0083
            r0 = 0
            goto L_0x0085
        L_0x0083:
            r0 = r33
        L_0x0085:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r2
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialCarouselComponent.<init>(java.lang.Boolean, java.lang.Integer, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.Integer, java.lang.Float, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl, java.lang.Boolean, com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
