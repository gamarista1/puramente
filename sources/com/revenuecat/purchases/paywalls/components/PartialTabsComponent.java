package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
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
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6448e0;
import kh.C6455i;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 =2\u00020\u0001:\u0002>=Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "backgroundColor", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialTabsComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.common.Background", O.b(Background.class), new d[]{O.b(Background.Color.class), O.b(Background.Image.class)}, new C5978b[]{Background$Color$$serializer.INSTANCE, Background$Image$$serializer.INSTANCE}, new Annotation[0]), new C5983g("com.revenuecat.purchases.paywalls.components.properties.Shape", O.b(Shape.class), new d[]{O.b(Shape.Pill.class), O.b(Shape.Rectangle.class)}, new C5978b[]{new C6448e0("pill", Shape.Pill.INSTANCE, new Annotation[0]), Shape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Padding margin;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialTabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTabsComponent() {
        this((Boolean) null, (Size) null, (Padding) null, (Padding) null, (ColorScheme) null, (Background) null, (Shape) null, (Border) null, (Shadow) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialTabsComponent partialTabsComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(partialTabsComponent.visible, Boolean.TRUE)) {
            dVar.p(fVar, 0, C6455i.f71663a, partialTabsComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialTabsComponent.size != null) {
            dVar.p(fVar, 1, Size$$serializer.INSTANCE, partialTabsComponent.size);
        }
        if (dVar.q(fVar, 2) || partialTabsComponent.padding != null) {
            dVar.p(fVar, 2, Padding$$serializer.INSTANCE, partialTabsComponent.padding);
        }
        if (dVar.q(fVar, 3) || partialTabsComponent.margin != null) {
            dVar.p(fVar, 3, Padding$$serializer.INSTANCE, partialTabsComponent.margin);
        }
        if (dVar.q(fVar, 4) || partialTabsComponent.backgroundColor != null) {
            dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, partialTabsComponent.backgroundColor);
        }
        if (dVar.q(fVar, 5) || partialTabsComponent.background != null) {
            dVar.p(fVar, 5, bVarArr[5], partialTabsComponent.background);
        }
        if (dVar.q(fVar, 6) || partialTabsComponent.shape != null) {
            dVar.p(fVar, 6, bVarArr[6], partialTabsComponent.shape);
        }
        if (dVar.q(fVar, 7) || partialTabsComponent.border != null) {
            dVar.p(fVar, 7, Border$$serializer.INSTANCE, partialTabsComponent.border);
        }
        if (dVar.q(fVar, 8) || partialTabsComponent.shadow != null) {
            dVar.p(fVar, 8, Shadow$$serializer.INSTANCE, partialTabsComponent.shadow);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTabsComponent)) {
            return false;
        }
        PartialTabsComponent partialTabsComponent = (PartialTabsComponent) obj;
        return C6496s.c(this.visible, partialTabsComponent.visible) && C6496s.c(this.size, partialTabsComponent.size) && C6496s.c(this.padding, partialTabsComponent.padding) && C6496s.c(this.margin, partialTabsComponent.margin) && C6496s.c(this.backgroundColor, partialTabsComponent.backgroundColor) && C6496s.c(this.background, partialTabsComponent.background) && C6496s.c(this.shape, partialTabsComponent.shape) && C6496s.c(this.border, partialTabsComponent.border) && C6496s.c(this.shadow, partialTabsComponent.shadow);
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

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Size size2 = this.size;
        int hashCode2 = (hashCode + (size2 == null ? 0 : size2.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode3 = (hashCode2 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        int hashCode4 = (hashCode3 + (padding3 == null ? 0 : padding3.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background2 = this.background;
        int hashCode6 = (hashCode5 + (background2 == null ? 0 : background2.hashCode())) * 31;
        Shape shape2 = this.shape;
        int hashCode7 = (hashCode6 + (shape2 == null ? 0 : shape2.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode8 = (hashCode7 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        if (shadow2 != null) {
            i10 = shadow2.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "PartialTabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
    }

    @C6521e
    public /* synthetic */ PartialTabsComponent(int i10, Boolean bool, Size size2, Padding padding2, Padding padding3, ColorScheme colorScheme, Background background2, Shape shape2, Border border2, Shadow shadow2, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i10 & 4) == 0) {
            this.padding = null;
        } else {
            this.padding = padding2;
        }
        if ((i10 & 8) == 0) {
            this.margin = null;
        } else {
            this.margin = padding3;
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
            this.shape = null;
        } else {
            this.shape = shape2;
        }
        if ((i10 & 128) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i10 & 256) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
    }

    public PartialTabsComponent(Boolean bool, Size size2, Padding padding2, Padding padding3, ColorScheme colorScheme, Background background2, Shape shape2, Border border2, Shadow shadow2) {
        this.visible = bool;
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
        this.backgroundColor = colorScheme;
        this.background = background2;
        this.shape = shape2;
        this.border = border2;
        this.shadow = shadow2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialTabsComponent(java.lang.Boolean r11, com.revenuecat.purchases.paywalls.components.properties.Size r12, com.revenuecat.purchases.paywalls.components.properties.Padding r13, com.revenuecat.purchases.paywalls.components.properties.Padding r14, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r15, com.revenuecat.purchases.paywalls.components.common.Background r16, com.revenuecat.purchases.paywalls.components.properties.Shape r17, com.revenuecat.purchases.paywalls.components.properties.Border r18, com.revenuecat.purchases.paywalls.components.properties.Shadow r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r13
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r14
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r3
            goto L_0x0027
        L_0x0026:
            r6 = r15
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r3
            goto L_0x002f
        L_0x002d:
            r7 = r16
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r3
            goto L_0x0037
        L_0x0035:
            r8 = r17
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r3
            goto L_0x003f
        L_0x003d:
            r9 = r18
        L_0x003f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r3 = r19
        L_0x0046:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTabsComponent.<init>(java.lang.Boolean, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.common.Background, com.revenuecat.purchases.paywalls.components.properties.Shape, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
