package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias;
import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.InternalRevenueCatAPI;
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
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002GFB\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017B\u0001\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fHÇ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R+\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010.R+\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b2\u0010+\u001a\u0004\b1\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b6\u0010+\u001a\u0004\b4\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010+\u001a\u0004\b8\u00109R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b>\u0010+\u001a\u0004\b<\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010B\u001a\u0004\bE\u0010D\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "text", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "backgroundColor", "Lcom/revenuecat/purchases/FontAlias;", "fontName", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "fontWeight", "", "fontSize", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "horizontalAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getText-sa7TU9Q", "()Ljava/lang/String;", "getText-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "getBackgroundColor$annotations", "getFontName-ARcRonI", "getFontName-ARcRonI$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "getFontWeight$annotations", "Ljava/lang/Integer;", "getFontSize", "()Ljava/lang/Integer;", "getFontSize$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getHorizontalAlignment$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialTextComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, null, FontWeight.Companion.serializer(), null, HorizontalAlignment.Companion.serializer(), null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ColorScheme backgroundColor;
    private final ColorScheme color;
    private final String fontName;
    private final Integer fontSize;
    private final FontWeight fontWeight;
    private final HorizontalAlignment horizontalAlignment;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final String text;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialTextComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PartialTextComponent(int i10, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, @C5985i(with = FontSizeSerializer.class) Integer num, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, str, colorScheme, colorScheme2, str2, fontWeight2, num, horizontalAlignment2, size2, padding2, padding3, t0Var);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    /* renamed from: getFontName-ARcRonI$annotations  reason: not valid java name */
    public static /* synthetic */ void m76getFontNameARcRonI$annotations() {
    }

    @C5985i(with = FontSizeSerializer.class)
    public static /* synthetic */ void getFontSize$annotations() {
    }

    public static /* synthetic */ void getFontWeight$annotations() {
    }

    public static /* synthetic */ void getHorizontalAlignment$annotations() {
    }

    /* renamed from: getText-sa7TU9Q$annotations  reason: not valid java name */
    public static /* synthetic */ void m77getTextsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialTextComponent partialTextComponent, d dVar, f fVar) {
        LocalizationKey localizationKey;
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(partialTextComponent.visible, Boolean.TRUE)) {
            dVar.p(fVar, 0, C6455i.f71663a, partialTextComponent.visible);
        }
        FontAlias fontAlias = null;
        if (dVar.q(fVar, 1) || partialTextComponent.text != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = partialTextComponent.text;
            if (str != null) {
                localizationKey = LocalizationKey.m112boximpl(str);
            } else {
                localizationKey = null;
            }
            dVar.p(fVar, 1, localizationKey$$serializer, localizationKey);
        }
        if (dVar.q(fVar, 2) || partialTextComponent.color != null) {
            dVar.p(fVar, 2, ColorScheme$$serializer.INSTANCE, partialTextComponent.color);
        }
        if (dVar.q(fVar, 3) || partialTextComponent.backgroundColor != null) {
            dVar.p(fVar, 3, ColorScheme$$serializer.INSTANCE, partialTextComponent.backgroundColor);
        }
        if (dVar.q(fVar, 4) || partialTextComponent.fontName != null) {
            FontAlias$$serializer fontAlias$$serializer = FontAlias$$serializer.INSTANCE;
            String str2 = partialTextComponent.fontName;
            if (str2 != null) {
                fontAlias = FontAlias.m36boximpl(str2);
            }
            dVar.p(fVar, 4, fontAlias$$serializer, fontAlias);
        }
        if (dVar.q(fVar, 5) || partialTextComponent.fontWeight != null) {
            dVar.p(fVar, 5, bVarArr[5], partialTextComponent.fontWeight);
        }
        if (dVar.q(fVar, 6) || partialTextComponent.fontSize != null) {
            dVar.p(fVar, 6, FontSizeSerializer.INSTANCE, partialTextComponent.fontSize);
        }
        if (dVar.q(fVar, 7) || partialTextComponent.horizontalAlignment != null) {
            dVar.p(fVar, 7, bVarArr[7], partialTextComponent.horizontalAlignment);
        }
        if (dVar.q(fVar, 8) || partialTextComponent.size != null) {
            dVar.p(fVar, 8, Size$$serializer.INSTANCE, partialTextComponent.size);
        }
        if (dVar.q(fVar, 9) || partialTextComponent.padding != null) {
            dVar.p(fVar, 9, Padding$$serializer.INSTANCE, partialTextComponent.padding);
        }
        if (dVar.q(fVar, 10) || partialTextComponent.margin != null) {
            dVar.p(fVar, 10, Padding$$serializer.INSTANCE, partialTextComponent.margin);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0093 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialTextComponent
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.revenuecat.purchases.paywalls.components.PartialTextComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialTextComponent) r5
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            if (r1 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0021
            r1 = r0
            goto L_0x002a
        L_0x0021:
            r1 = r2
            goto L_0x002a
        L_0x0023:
            if (r3 != 0) goto L_0x0026
            goto L_0x0021
        L_0x0026:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m115equalsimpl0(r1, r3)
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.color
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.color
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0038
            return r2
        L_0x0038:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.backgroundColor
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.backgroundColor
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            java.lang.String r1 = r4.fontName
            java.lang.String r3 = r5.fontName
            if (r1 != 0) goto L_0x004f
            if (r3 != 0) goto L_0x004d
            r1 = r0
            goto L_0x0056
        L_0x004d:
            r1 = r2
            goto L_0x0056
        L_0x004f:
            if (r3 != 0) goto L_0x0052
            goto L_0x004d
        L_0x0052:
            boolean r1 = com.revenuecat.purchases.FontAlias.m39equalsimpl0(r1, r3)
        L_0x0056:
            if (r1 != 0) goto L_0x0059
            return r2
        L_0x0059:
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r1 = r4.fontWeight
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r3 = r5.fontWeight
            if (r1 == r3) goto L_0x0060
            return r2
        L_0x0060:
            java.lang.Integer r1 = r4.fontSize
            java.lang.Integer r3 = r5.fontSize
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x006b
            return r2
        L_0x006b:
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r1 = r4.horizontalAlignment
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r3 = r5.horizontalAlignment
            if (r1 == r3) goto L_0x0072
            return r2
        L_0x0072:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x007d
            return r2
        L_0x007d:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0088
            return r2
        L_0x0088:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r5 = r5.margin
            boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r5)
            if (r5 != 0) goto L_0x0093
            return r2
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTextComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    /* renamed from: getFontName-ARcRonI  reason: not valid java name */
    public final /* synthetic */ String m78getFontNameARcRonI() {
        return this.fontName;
    }

    public final /* synthetic */ Integer getFontSize() {
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

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    /* renamed from: getText-sa7TU9Q  reason: not valid java name */
    public final /* synthetic */ String m79getTextsa7TU9Q() {
        return this.text;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.text;
        int r02 = (hashCode + (str == null ? 0 : LocalizationKey.m116hashCodeimpl(str))) * 31;
        ColorScheme colorScheme = this.color;
        int hashCode2 = (r02 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        ColorScheme colorScheme2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (colorScheme2 == null ? 0 : colorScheme2.hashCode())) * 31;
        String str2 = this.fontName;
        int r03 = (hashCode3 + (str2 == null ? 0 : FontAlias.m40hashCodeimpl(str2))) * 31;
        FontWeight fontWeight2 = this.fontWeight;
        int hashCode4 = (r03 + (fontWeight2 == null ? 0 : fontWeight2.hashCode())) * 31;
        Integer num = this.fontSize;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment2 = this.horizontalAlignment;
        int hashCode6 = (hashCode5 + (horizontalAlignment2 == null ? 0 : horizontalAlignment2.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode7 = (hashCode6 + (size2 == null ? 0 : size2.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode8 = (hashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        if (padding3 != null) {
            i10 = padding3.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PartialTextComponent(visible=");
        sb2.append(this.visible);
        sb2.append(", text=");
        String str = this.text;
        String str2 = "null";
        sb2.append(str == null ? str2 : LocalizationKey.m117toStringimpl(str));
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", fontName=");
        String str3 = this.fontName;
        if (str3 != null) {
            str2 = FontAlias.m41toStringimpl(str3);
        }
        sb2.append(str2);
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
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, Integer num, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, str, colorScheme, colorScheme2, str2, fontWeight2, num, horizontalAlignment2, size2, padding2, padding3);
    }

    private PartialTextComponent(int i10, Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, Integer num, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i10 & 4) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i10 & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme2;
        }
        if ((i10 & 16) == 0) {
            this.fontName = null;
        } else {
            this.fontName = str2;
        }
        if ((i10 & 32) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = fontWeight2;
        }
        if ((i10 & 64) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        if ((i10 & 128) == 0) {
            this.horizontalAlignment = null;
        } else {
            this.horizontalAlignment = horizontalAlignment2;
        }
        if ((i10 & 256) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i10 & 512) == 0) {
            this.padding = null;
        } else {
            this.padding = padding2;
        }
        if ((i10 & 1024) == 0) {
            this.margin = null;
        } else {
            this.margin = padding3;
        }
    }

    private PartialTextComponent(Boolean bool, String str, ColorScheme colorScheme, ColorScheme colorScheme2, String str2, FontWeight fontWeight2, Integer num, HorizontalAlignment horizontalAlignment2, Size size2, Padding padding2, Padding padding3) {
        this.visible = bool;
        this.text = str;
        this.color = colorScheme;
        this.backgroundColor = colorScheme2;
        this.fontName = str2;
        this.fontWeight = fontWeight2;
        this.fontSize = num;
        this.horizontalAlignment = horizontalAlignment2;
        this.size = size2;
        this.padding = padding2;
        this.margin = padding3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialTextComponent(java.lang.Boolean r13, java.lang.String r14, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r15, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r16, java.lang.String r17, com.revenuecat.purchases.paywalls.components.properties.FontWeight r18, java.lang.Integer r19, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r20, com.revenuecat.purchases.paywalls.components.properties.Size r21, com.revenuecat.purchases.paywalls.components.properties.Padding r22, com.revenuecat.purchases.paywalls.components.properties.Padding r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r14
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r15
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0021
        L_0x001f:
            r5 = r16
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r3
            goto L_0x0029
        L_0x0027:
            r6 = r17
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r3
            goto L_0x0031
        L_0x002f:
            r7 = r18
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r3
            goto L_0x0039
        L_0x0037:
            r8 = r19
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r3
            goto L_0x0041
        L_0x003f:
            r9 = r20
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r3
            goto L_0x0049
        L_0x0047:
            r10 = r21
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r3
            goto L_0x0051
        L_0x004f:
            r11 = r22
        L_0x0051:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r3 = r23
        L_0x0058:
            r0 = 0
            r13 = r12
            r14 = r1
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r3
            r25 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTextComponent.<init>(java.lang.Boolean, java.lang.String, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, java.lang.String, com.revenuecat.purchases.paywalls.components.properties.FontWeight, java.lang.Integer, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
