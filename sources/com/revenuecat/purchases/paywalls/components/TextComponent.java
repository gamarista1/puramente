package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import jh.d;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 H2\u00020\u0001:\u0002IHB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019B¢\u0001\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u001dJ(\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!HÇ\u0001¢\u0006\u0004\b$\u0010%R)\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010-R+\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010(R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010:\u0012\u0004\b=\u0010*\u001a\u0004\b;\u0010<R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bD\u0010CR#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010G\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "text", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "backgroundColor", "Lcom/revenuecat/purchases/FontAlias;", "fontName", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "horizontalAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "overrides", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Ljava/util/List;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/TextComponent;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getText-z7Tp-4o", "()Ljava/lang/String;", "getText-z7Tp-4o$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "getBackgroundColor$annotations", "getFontName-ARcRonI", "getFontName-ARcRonI$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight$annotations", "I", "getFontSize", "()I", "getFontSize$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class TextComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, FontWeight.Companion.serializer(), null, HorizontalAlignment.Companion.serializer(), null, null, null, new C6449f(ComponentOverride.Companion.serializer(PartialTextComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final int fontSize;
    private final FontWeight fontWeight;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final List<ComponentOverride<PartialTextComponent>> overrides;
    private final Padding padding;
    private final Size size;
    private final String text;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TextComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/TextComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return TextComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ TextComponent(int i10, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, @C5985i(with = FontSizeSerializer.class) int i11, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, List list, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, colorScheme, colorScheme2, str2, fontWeight2, i11, horizontalAlignment2, size2, padding2, padding3, (List<ComponentOverride<PartialTextComponent>>) list, t0Var);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    /* renamed from: getFontName-ARcRonI$annotations  reason: not valid java name */
    public static /* synthetic */ void m80getFontNameARcRonI$annotations() {
    }

    @C5985i(with = FontSizeSerializer.class)
    public static /* synthetic */ void getFontSize$annotations() {
    }

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public static /* synthetic */ void getHorizontalAlignment$annotations() {
    }

    /* renamed from: getText-z7Tp-4o$annotations  reason: not valid java name */
    public static /* synthetic */ void m81getTextz7Tp4o$annotations() {
    }

    public static final /* synthetic */ void write$Self(TextComponent textComponent, d dVar, f fVar) {
        FontAlias fontAlias;
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, LocalizationKey$$serializer.INSTANCE, LocalizationKey.m112boximpl(textComponent.text));
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        dVar.B(fVar, 1, colorScheme$$serializer, textComponent.color);
        if (dVar.q(fVar, 2) || textComponent.backgroundColor != null) {
            dVar.p(fVar, 2, colorScheme$$serializer, textComponent.backgroundColor);
        }
        if (dVar.q(fVar, 3) || textComponent.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str = textComponent.fontName;
            if (str != null) {
                fontAlias = FontAlias.m36boximpl(str);
            } else {
                fontAlias = null;
            }
            dVar.p(fVar, 3, fontAlias$$serializer, fontAlias);
        }
        if (dVar.q(fVar, 4) || textComponent.fontWeight != FontWeight.REGULAR) {
            dVar.B(fVar, 4, bVarArr[4], textComponent.fontWeight);
        }
        if (dVar.q(fVar, 5) || textComponent.fontSize != 15) {
            dVar.B(fVar, 5, FontSizeSerializer.INSTANCE, Integer.valueOf(textComponent.fontSize));
        }
        if (dVar.q(fVar, 6) || textComponent.horizontalAlignment != HorizontalAlignment.CENTER) {
            dVar.B(fVar, 6, bVarArr[6], textComponent.horizontalAlignment);
        }
        if (dVar.q(fVar, 7) || !C6496s.c(textComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 7, Size$$serializer.INSTANCE, textComponent.size);
        }
        if (dVar.q(fVar, 8) || !C6496s.c(textComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 8, Padding$$serializer.INSTANCE, textComponent.padding);
        }
        if (dVar.q(fVar, 9) || !C6496s.c(textComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 9, Padding$$serializer.INSTANCE, textComponent.margin);
        }
        if (dVar.q(fVar, 10) || !C6496s.c(textComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 10, bVarArr[10], textComponent.overrides);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0084 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.TextComponent
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.revenuecat.purchases.paywalls.components.TextComponent r5 = (com.revenuecat.purchases.paywalls.components.TextComponent) r5
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m115equalsimpl0(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.color
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.color
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.backgroundColor
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r1 = r4.fontName
            java.lang.String r3 = r5.fontName
            if (r1 != 0) goto L_0x0039
            if (r3 != 0) goto L_0x0037
            r1 = r0
            goto L_0x0040
        L_0x0037:
            r1 = r2
            goto L_0x0040
        L_0x0039:
            if (r3 != 0) goto L_0x003c
            goto L_0x0037
        L_0x003c:
            boolean r1 = com.revenuecat.purchases.FontAlias.m39equalsimpl0(r1, r3)
        L_0x0040:
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = r4.fontWeight
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r3 = r5.fontWeight
            if (r1 == r3) goto L_0x004a
            return r2
        L_0x004a:
            int r1 = r4.fontSize
            int r3 = r5.fontSize
            if (r1 == r3) goto L_0x0051
            return r2
        L_0x0051:
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = r4.horizontalAlignment
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r3 = r5.horizontalAlignment
            if (r1 == r3) goto L_0x0058
            return r2
        L_0x0058:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0063
            return r2
        L_0x0063:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x006e
            return r2
        L_0x006e:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0079
            return r2
        L_0x0079:
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialTextComponent>> r1 = r4.overrides
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialTextComponent>> r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r5)
            if (r5 != 0) goto L_0x0084
            return r2
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TextComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    /* renamed from: getFontName-ARcRonI  reason: not valid java name */
    public final /* synthetic */ String m82getFontNameARcRonI() {
        return this.fontName;
    }

    public final /* synthetic */ int getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
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

    /* renamed from: getText-z7Tp-4o  reason: not valid java name */
    public final /* synthetic */ String m83getTextz7Tp4o() {
        return this.text;
    }

    public int hashCode() {
        int r02 = ((LocalizationKey.m116hashCodeimpl(this.text) * 31) + this.color.hashCode()) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int i10 = 0;
        int hashCode = (r02 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        String str = this.fontName;
        if (str != null) {
            i10 = FontAlias.m40hashCodeimpl(str);
        }
        return ((((((((((((((hashCode + i10) * 31) + this.fontWeight.hashCode()) * 31) + Integer.hashCode(this.fontSize)) * 31) + this.horizontalAlignment.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextComponent(text=");
        sb2.append(LocalizationKey.m117toStringimpl(this.text));
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", fontName=");
        String str = this.fontName;
        sb2.append(str == null ? "null" : FontAlias.m41toStringimpl(str));
        sb2.append(", fontWeight=");
        sb2.append(this.fontWeight);
        sb2.append(", fontSize=");
        sb2.append(this.fontSize);
        sb2.append(", horizontalAlignment=");
        sb2.append(this.horizontalAlignment);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", overrides=");
        sb2.append(this.overrides);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ TextComponent(String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, int i10, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, colorScheme, colorScheme2, str2, fontWeight2, i10, horizontalAlignment2, size2, padding2, padding3, list);
    }

    private TextComponent(int i10, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, int i11, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, List<ComponentOverride<PartialTextComponent>> list, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, TextComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        this.color = colorScheme;
        if ((i10 & 4) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i10 & 8) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i10 & 16) == 0) {
            this.fontWeight = FontWeight.REGULAR;
        } else {
            this.fontWeight = fontWeight2;
        }
        if ((i10 & 32) == 0) {
            this.fontSize = 15;
        } else {
            this.fontSize = i11;
        }
        if ((i10 & 64) == 0) {
            this.horizontalAlignment = HorizontalAlignment.CENTER;
        } else {
            this.horizontalAlignment = horizontalAlignment2;
        }
        if ((i10 & 128) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size2;
        }
        if ((i10 & 256) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding2;
        }
        if ((i10 & 512) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding3;
        }
        if ((i10 & 1024) == 0) {
            this.overrides = C6565s.n();
        } else {
            this.overrides = list;
        }
    }

    private TextComponent(String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, int i10, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, List<ComponentOverride<PartialTextComponent>> list) {
        C6496s.h(str, AttributeType.TEXT);
        C6496s.h(colorScheme, "color");
        C6496s.h(fontWeight2, "fontWeight");
        C6496s.h(horizontalAlignment2, "horizontalAlignment");
        C6496s.h(size2, "size");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(list, "overrides");
        this.text = str;
        this.color = colorScheme;
        this.backgroundColor = colorScheme2;
        this.fontName = str2;
        this.fontWeight = fontWeight2;
        this.fontSize = i10;
        this.horizontalAlignment = horizontalAlignment2;
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
        this.overrides = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextComponent(java.lang.String r17, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, java.lang.String r20, com.revenuecat.purchases.paywalls.components.properties.FontWeight r21, int r22, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r23, com.revenuecat.purchases.paywalls.components.properties.Size r24, com.revenuecat.purchases.paywalls.components.properties.Padding r25, com.revenuecat.purchases.paywalls.components.properties.Padding r26, java.util.List r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r16 = this;
            r0 = r28
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r19
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r20
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001b
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = com.revenuecat.purchases.paywalls.components.properties.FontWeight.REGULAR
            r8 = r1
            goto L_0x001d
        L_0x001b:
            r8 = r21
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0025
            r1 = 15
            r9 = r1
            goto L_0x0027
        L_0x0025:
            r9 = r22
        L_0x0027:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002f
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment.CENTER
            r10 = r1
            goto L_0x0031
        L_0x002f:
            r10 = r23
        L_0x0031:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0040
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r2 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r2, r3)
            r11 = r1
            goto L_0x0042
        L_0x0040:
            r11 = r24
        L_0x0042:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004e
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r12 = r1
            goto L_0x0050
        L_0x004e:
            r12 = r25
        L_0x0050:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x005c
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r13 = r1
            goto L_0x005e
        L_0x005c:
            r13 = r26
        L_0x005e:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0068
            java.util.List r0 = mf.C6565s.n()
            r14 = r0
            goto L_0x006a
        L_0x0068:
            r14 = r27
        L_0x006a:
            r15 = 0
            r3 = r16
            r4 = r17
            r5 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TextComponent.<init>(java.lang.String, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, java.lang.String, com.revenuecat.purchases.paywalls.components.properties.FontWeight, int, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
