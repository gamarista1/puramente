package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.I;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 42\u00020\u0001:\u000254Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b3\u00102¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "", "itemSpacing", "textSpacing", "columnGutter", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "iconAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getItemSpacing", "()Ljava/lang/Integer;", "getItemSpacing$annotations", "()V", "getTextSpacing", "getTextSpacing$annotations", "getColumnGutter", "getColumnGutter$annotations", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment", "()Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$IconAlignment;", "getIconAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialTimelineComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, TimelineComponent.IconAlignment.Companion.serializer(), null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Integer columnGutter;
    private final TimelineComponent.IconAlignment iconAlignment;
    private final Integer itemSpacing;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final Integer textSpacing;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialTimelineComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTimelineComponent() {
        this((Boolean) null, (Integer) null, (Integer) null, (Integer) null, (TimelineComponent.IconAlignment) null, (Size) null, (Padding) null, (Padding) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getColumnGutter$annotations() {
    }

    public static /* synthetic */ void getIconAlignment$annotations() {
    }

    public static /* synthetic */ void getItemSpacing$annotations() {
    }

    public static /* synthetic */ void getTextSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialTimelineComponent partialTimelineComponent, d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || partialTimelineComponent.visible != null) {
            dVar.p(fVar, 0, C6455i.f71663a, partialTimelineComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialTimelineComponent.itemSpacing != null) {
            dVar.p(fVar, 1, I.f71604a, partialTimelineComponent.itemSpacing);
        }
        if (dVar.q(fVar, 2) || partialTimelineComponent.textSpacing != null) {
            dVar.p(fVar, 2, I.f71604a, partialTimelineComponent.textSpacing);
        }
        if (dVar.q(fVar, 3) || partialTimelineComponent.columnGutter != null) {
            dVar.p(fVar, 3, I.f71604a, partialTimelineComponent.columnGutter);
        }
        if (dVar.q(fVar, 4) || partialTimelineComponent.iconAlignment != null) {
            dVar.p(fVar, 4, bVarArr[4], partialTimelineComponent.iconAlignment);
        }
        if (dVar.q(fVar, 5) || partialTimelineComponent.size != null) {
            dVar.p(fVar, 5, Size$$serializer.INSTANCE, partialTimelineComponent.size);
        }
        if (dVar.q(fVar, 6) || partialTimelineComponent.padding != null) {
            dVar.p(fVar, 6, Padding$$serializer.INSTANCE, partialTimelineComponent.padding);
        }
        if (dVar.q(fVar, 7) || partialTimelineComponent.margin != null) {
            dVar.p(fVar, 7, Padding$$serializer.INSTANCE, partialTimelineComponent.margin);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTimelineComponent)) {
            return false;
        }
        PartialTimelineComponent partialTimelineComponent = (PartialTimelineComponent) obj;
        return C6496s.c(this.visible, partialTimelineComponent.visible) && C6496s.c(this.itemSpacing, partialTimelineComponent.itemSpacing) && C6496s.c(this.textSpacing, partialTimelineComponent.textSpacing) && C6496s.c(this.columnGutter, partialTimelineComponent.columnGutter) && this.iconAlignment == partialTimelineComponent.iconAlignment && C6496s.c(this.size, partialTimelineComponent.size) && C6496s.c(this.padding, partialTimelineComponent.padding) && C6496s.c(this.margin, partialTimelineComponent.margin);
    }

    public final /* synthetic */ Integer getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ Integer getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Integer getTextSpacing() {
        return this.textSpacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.itemSpacing;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textSpacing;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.columnGutter;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        TimelineComponent.IconAlignment iconAlignment2 = this.iconAlignment;
        int hashCode5 = (hashCode4 + (iconAlignment2 == null ? 0 : iconAlignment2.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode6 = (hashCode5 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode7 = (hashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        if (padding3 != null) {
            i10 = padding3.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        return "PartialTimelineComponent(visible=" + this.visible + ", itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ')';
    }

    @C6521e
    public /* synthetic */ PartialTimelineComponent(int i10, Boolean bool, Integer num, Integer num2, Integer num3, TimelineComponent.IconAlignment iconAlignment2, Size size2, Padding padding2, Padding padding3, t0 t0Var) {
        if ((i10 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i10 & 2) == 0) {
            this.itemSpacing = null;
        } else {
            this.itemSpacing = num;
        }
        if ((i10 & 4) == 0) {
            this.textSpacing = null;
        } else {
            this.textSpacing = num2;
        }
        if ((i10 & 8) == 0) {
            this.columnGutter = null;
        } else {
            this.columnGutter = num3;
        }
        if ((i10 & 16) == 0) {
            this.iconAlignment = null;
        } else {
            this.iconAlignment = iconAlignment2;
        }
        if ((i10 & 32) == 0) {
            this.size = null;
        } else {
            this.size = size2;
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
    }

    public PartialTimelineComponent(Boolean bool, Integer num, Integer num2, Integer num3, TimelineComponent.IconAlignment iconAlignment2, Size size2, Padding padding2, Padding padding3) {
        this.visible = bool;
        this.itemSpacing = num;
        this.textSpacing = num2;
        this.columnGutter = num3;
        this.iconAlignment = iconAlignment2;
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialTimelineComponent(java.lang.Boolean r10, java.lang.Integer r11, java.lang.Integer r12, java.lang.Integer r13, com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment r14, com.revenuecat.purchases.paywalls.components.properties.Size r15, com.revenuecat.purchases.paywalls.components.properties.Padding r16, com.revenuecat.purchases.paywalls.components.properties.Padding r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTimelineComponent.<init>(java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
