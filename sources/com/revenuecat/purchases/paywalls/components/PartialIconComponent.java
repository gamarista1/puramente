package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.t0;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=<Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cHÇ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b7\u00106R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u00108\u0012\u0004\b;\u0010(\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "", "baseUrl", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "iconBackground", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getBaseUrl$annotations", "()V", "getIconName", "getIconName$annotations", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialIconComponent implements PartialComponent {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String baseUrl;
    private final ColorScheme color;
    private final IconComponent.Formats formats;
    private final IconComponent.IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialIconComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialIconComponent() {
        this((Boolean) null, (String) null, (String) null, (IconComponent.Formats) null, (Size) null, (ColorScheme) null, (Padding) null, (Padding) null, (IconComponent.IconBackground) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getIconBackground$annotations() {
    }

    public static /* synthetic */ void getIconName$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialIconComponent partialIconComponent, d dVar, f fVar) {
        if (dVar.q(fVar, 0) || !C6496s.c(partialIconComponent.visible, Boolean.TRUE)) {
            dVar.p(fVar, 0, C6455i.f71663a, partialIconComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialIconComponent.baseUrl != null) {
            dVar.p(fVar, 1, x0.f71726a, partialIconComponent.baseUrl);
        }
        if (dVar.q(fVar, 2) || partialIconComponent.iconName != null) {
            dVar.p(fVar, 2, x0.f71726a, partialIconComponent.iconName);
        }
        if (dVar.q(fVar, 3) || partialIconComponent.formats != null) {
            dVar.p(fVar, 3, IconComponent$Formats$$serializer.INSTANCE, partialIconComponent.formats);
        }
        if (dVar.q(fVar, 4) || partialIconComponent.size != null) {
            dVar.p(fVar, 4, Size$$serializer.INSTANCE, partialIconComponent.size);
        }
        if (dVar.q(fVar, 5) || partialIconComponent.color != null) {
            dVar.p(fVar, 5, ColorScheme$$serializer.INSTANCE, partialIconComponent.color);
        }
        if (dVar.q(fVar, 6) || partialIconComponent.padding != null) {
            dVar.p(fVar, 6, Padding$$serializer.INSTANCE, partialIconComponent.padding);
        }
        if (dVar.q(fVar, 7) || partialIconComponent.margin != null) {
            dVar.p(fVar, 7, Padding$$serializer.INSTANCE, partialIconComponent.margin);
        }
        if (dVar.q(fVar, 8) || partialIconComponent.iconBackground != null) {
            dVar.p(fVar, 8, IconComponent$IconBackground$$serializer.INSTANCE, partialIconComponent.iconBackground);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialIconComponent)) {
            return false;
        }
        PartialIconComponent partialIconComponent = (PartialIconComponent) obj;
        return C6496s.c(this.visible, partialIconComponent.visible) && C6496s.c(this.baseUrl, partialIconComponent.baseUrl) && C6496s.c(this.iconName, partialIconComponent.iconName) && C6496s.c(this.formats, partialIconComponent.formats) && C6496s.c(this.size, partialIconComponent.size) && C6496s.c(this.color, partialIconComponent.color) && C6496s.c(this.padding, partialIconComponent.padding) && C6496s.c(this.margin, partialIconComponent.margin) && C6496s.c(this.iconBackground, partialIconComponent.iconBackground);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.baseUrl;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ IconComponent.Formats getFormats() {
        return this.formats;
    }

    public final /* synthetic */ IconComponent.IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final /* synthetic */ String getIconName() {
        return this.iconName;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.baseUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconComponent.Formats formats2 = this.formats;
        int hashCode4 = (hashCode3 + (formats2 == null ? 0 : formats2.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode5 = (hashCode4 + (size2 == null ? 0 : size2.hashCode())) * 31;
        ColorScheme colorScheme = this.color;
        int hashCode6 = (hashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode7 = (hashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        int hashCode8 = (hashCode7 + (padding3 == null ? 0 : padding3.hashCode())) * 31;
        IconComponent.IconBackground iconBackground2 = this.iconBackground;
        if (iconBackground2 != null) {
            i10 = iconBackground2.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        return "PartialIconComponent(visible=" + this.visible + ", baseUrl=" + this.baseUrl + ", iconName=" + this.iconName + ", formats=" + this.formats + ", size=" + this.size + ", color=" + this.color + ", padding=" + this.padding + ", margin=" + this.margin + ", iconBackground=" + this.iconBackground + ')';
    }

    @C6521e
    public /* synthetic */ PartialIconComponent(int i10, Boolean bool, String str, String str2, IconComponent.Formats formats2, Size size2, ColorScheme colorScheme, Padding padding2, Padding padding3, IconComponent.IconBackground iconBackground2, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.baseUrl = null;
        } else {
            this.baseUrl = str;
        }
        if ((i10 & 4) == 0) {
            this.iconName = null;
        } else {
            this.iconName = str2;
        }
        if ((i10 & 8) == 0) {
            this.formats = null;
        } else {
            this.formats = formats2;
        }
        if ((i10 & 16) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i10 & 32) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
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
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground2;
        }
    }

    public PartialIconComponent(Boolean bool, String str, String str2, IconComponent.Formats formats2, Size size2, ColorScheme colorScheme, Padding padding2, Padding padding3, IconComponent.IconBackground iconBackground2) {
        this.visible = bool;
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats2;
        this.size = size2;
        this.color = colorScheme;
        this.padding = padding2;
        this.margin = padding3;
        this.iconBackground = iconBackground2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialIconComponent(java.lang.Boolean r11, java.lang.String r12, java.lang.String r13, com.revenuecat.purchases.paywalls.components.IconComponent.Formats r14, com.revenuecat.purchases.paywalls.components.properties.Size r15, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r16, com.revenuecat.purchases.paywalls.components.properties.Padding r17, com.revenuecat.purchases.paywalls.components.properties.Padding r18, com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialIconComponent.<init>(java.lang.Boolean, java.lang.String, java.lang.String, com.revenuecat.purchases.paywalls.components.IconComponent$Formats, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
