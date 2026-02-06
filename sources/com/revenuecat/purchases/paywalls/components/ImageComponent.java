package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.C6448e0;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;
import mf.C6565s;

@C5985i
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 L2\u00020\u0001:\u0002MLB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aB \u0001\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001fJ(\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÇ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R+\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b6\u00102\u001a\u0004\b4\u00105R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b:\u00102\u001a\u0004\b8\u00109R \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010HR#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010K\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "overrides", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljava/util/List;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/ImageComponent;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ImageComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.MaskShape", O.b(MaskShape.class), new d[]{O.b(MaskShape.Circle.class), O.b(MaskShape.Concave.class), O.b(MaskShape.Convex.class), O.b(MaskShape.Rectangle.class)}, new C5978b[]{new C6448e0("circle", MaskShape.Circle.INSTANCE, new Annotation[0]), new C6448e0("concave", MaskShape.Concave.INSTANCE, new Annotation[0]), new C6448e0("convex", MaskShape.Convex.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, FitMode.Companion.serializer(), null, null, null, null, new C6449f(ComponentOverride.Companion.serializer(PartialImageComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final List<ComponentOverride<PartialImageComponent>> overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/ImageComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ ImageComponent(int i10, ThemeImageUrls themeImageUrls, Size size2, String str, MaskShape maskShape2, ColorScheme colorScheme, FitMode fitMode2, Padding padding2, Padding padding3, Border border2, Shadow shadow2, List list, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, themeImageUrls, size2, str, maskShape2, colorScheme, fitMode2, padding2, padding3, border2, shadow2, (List<ComponentOverride<PartialImageComponent>>) list, t0Var);
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    /* renamed from: getOverrideSourceLid-sa7TU9Q$annotations  reason: not valid java name */
    public static /* synthetic */ void m72getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(ImageComponent imageComponent, jh.d dVar, f fVar) {
        LocalizationKey localizationKey;
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, ThemeImageUrls$$serializer.INSTANCE, imageComponent.source);
        if (dVar.q(fVar, 1) || !C6496s.c(imageComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 1, Size$$serializer.INSTANCE, imageComponent.size);
        }
        if (dVar.q(fVar, 2) || imageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = imageComponent.overrideSourceLid;
            if (str != null) {
                localizationKey = LocalizationKey.m112boximpl(str);
            } else {
                localizationKey = null;
            }
            dVar.p(fVar, 2, localizationKey$$serializer, localizationKey);
        }
        if (dVar.q(fVar, 3) || imageComponent.maskShape != null) {
            dVar.p(fVar, 3, bVarArr[3], imageComponent.maskShape);
        }
        if (dVar.q(fVar, 4) || imageComponent.colorOverlay != null) {
            dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, imageComponent.colorOverlay);
        }
        if (dVar.q(fVar, 5) || imageComponent.fitMode != FitMode.FIT) {
            dVar.B(fVar, 5, bVarArr[5], imageComponent.fitMode);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(imageComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 6, Padding$$serializer.INSTANCE, imageComponent.padding);
        }
        if (dVar.q(fVar, 7) || !C6496s.c(imageComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 7, Padding$$serializer.INSTANCE, imageComponent.margin);
        }
        if (dVar.q(fVar, 8) || imageComponent.border != null) {
            dVar.p(fVar, 8, Border$$serializer.INSTANCE, imageComponent.border);
        }
        if (dVar.q(fVar, 9) || imageComponent.shadow != null) {
            dVar.p(fVar, 9, Shadow$$serializer.INSTANCE, imageComponent.shadow);
        }
        if (dVar.q(fVar, 10) || !C6496s.c(imageComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 10, bVarArr[10], imageComponent.overrides);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.ImageComponent
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.revenuecat.purchases.paywalls.components.ImageComponent r5 = (com.revenuecat.purchases.paywalls.components.ImageComponent) r5
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
            if (r1 != 0) goto L_0x002e
            if (r3 != 0) goto L_0x002c
            r1 = r0
            goto L_0x0035
        L_0x002c:
            r1 = r2
            goto L_0x0035
        L_0x002e:
            if (r3 != 0) goto L_0x0031
            goto L_0x002c
        L_0x0031:
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m115equalsimpl0(r1, r3)
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            return r2
        L_0x0038:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x004e
            return r2
        L_0x004e:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L_0x0055
            return r2
        L_0x0055:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0060
            return r2
        L_0x0060:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x006b
            return r2
        L_0x006b:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0076
            return r2
        L_0x0076:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r3 = r5.shadow
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0081
            return r2
        L_0x0081:
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialImageComponent>> r1 = r4.overrides
            java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<com.revenuecat.purchases.paywalls.components.PartialImageComponent>> r5 = r5.overrides
            boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r5)
            if (r5 != 0) goto L_0x008c
            return r2
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ MaskShape getMaskShape() {
        return this.maskShape;
    }

    /* renamed from: getOverrideSourceLid-sa7TU9Q  reason: not valid java name */
    public final /* synthetic */ String m73getOverrideSourceLidsa7TU9Q() {
        return this.overrideSourceLid;
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

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ ThemeImageUrls getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = ((this.source.hashCode() * 31) + this.size.hashCode()) * 31;
        String str = this.overrideSourceLid;
        int i10 = 0;
        int r02 = (hashCode + (str == null ? 0 : LocalizationKey.m116hashCodeimpl(str))) * 31;
        MaskShape maskShape2 = this.maskShape;
        int hashCode2 = (r02 + (maskShape2 == null ? 0 : maskShape2.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode3 = (((((((hashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.fitMode.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Border border2 = this.border;
        int hashCode4 = (hashCode3 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        if (shadow2 != null) {
            i10 = shadow2.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ImageComponent(source=");
        sb2.append(this.source);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb2.append(str == null ? "null" : LocalizationKey.m117toStringimpl(str));
        sb2.append(", maskShape=");
        sb2.append(this.maskShape);
        sb2.append(", colorOverlay=");
        sb2.append(this.colorOverlay);
        sb2.append(", fitMode=");
        sb2.append(this.fitMode);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", border=");
        sb2.append(this.border);
        sb2.append(", shadow=");
        sb2.append(this.shadow);
        sb2.append(", overrides=");
        sb2.append(this.overrides);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ ImageComponent(ThemeImageUrls themeImageUrls, Size size2, String str, MaskShape maskShape2, ColorScheme colorScheme, FitMode fitMode2, Padding padding2, Padding padding3, Border border2, Shadow shadow2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(themeImageUrls, size2, str, maskShape2, colorScheme, fitMode2, padding2, padding3, border2, shadow2, list);
    }

    private ImageComponent(int i10, ThemeImageUrls themeImageUrls, Size size2, String str, MaskShape maskShape2, ColorScheme colorScheme, FitMode fitMode2, Padding padding2, Padding padding3, Border border2, Shadow shadow2, List<ComponentOverride<PartialImageComponent>> list, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, ImageComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.source = themeImageUrls;
        if ((i10 & 2) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size2;
        }
        if ((i10 & 4) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i10 & 8) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape2;
        }
        if ((i10 & 16) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.fitMode = FitMode.FIT;
        } else {
            this.fitMode = fitMode2;
        }
        if ((i10 & 64) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding2;
        }
        if ((i10 & 128) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding3;
        }
        if ((i10 & 256) == 0) {
            this.border = null;
        } else {
            this.border = border2;
        }
        if ((i10 & 512) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow2;
        }
        if ((i10 & 1024) == 0) {
            this.overrides = C6565s.n();
        } else {
            this.overrides = list;
        }
    }

    private ImageComponent(ThemeImageUrls themeImageUrls, Size size2, String str, MaskShape maskShape2, ColorScheme colorScheme, FitMode fitMode2, Padding padding2, Padding padding3, Border border2, Shadow shadow2, List<ComponentOverride<PartialImageComponent>> list) {
        C6496s.h(themeImageUrls, "source");
        C6496s.h(size2, "size");
        C6496s.h(fitMode2, "fitMode");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(list, "overrides");
        this.source = themeImageUrls;
        this.size = size2;
        this.overrideSourceLid = str;
        this.maskShape = maskShape2;
        this.colorOverlay = colorScheme;
        this.fitMode = fitMode2;
        this.padding = padding2;
        this.margin = padding3;
        this.border = border2;
        this.shadow = shadow2;
        this.overrides = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ImageComponent(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r18, com.revenuecat.purchases.paywalls.components.properties.Size r19, java.lang.String r20, com.revenuecat.purchases.paywalls.components.properties.MaskShape r21, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r22, com.revenuecat.purchases.paywalls.components.properties.FitMode r23, com.revenuecat.purchases.paywalls.components.properties.Padding r24, com.revenuecat.purchases.paywalls.components.properties.Padding r25, com.revenuecat.purchases.paywalls.components.properties.Border r26, com.revenuecat.purchases.paywalls.components.properties.Shadow r27, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r17 = this;
            r0 = r29
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r2 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r2, r3)
            r6 = r1
            goto L_0x0013
        L_0x0011:
            r6 = r19
        L_0x0013:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r7 = r2
            goto L_0x001c
        L_0x001a:
            r7 = r20
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0022
            r8 = r2
            goto L_0x0024
        L_0x0022:
            r8 = r21
        L_0x0024:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002c
        L_0x002a:
            r9 = r22
        L_0x002c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0034
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = com.revenuecat.purchases.paywalls.components.properties.FitMode.FIT
            r10 = r1
            goto L_0x0036
        L_0x0034:
            r10 = r23
        L_0x0036:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0042
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r11 = r1
            goto L_0x0044
        L_0x0042:
            r11 = r24
        L_0x0044:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0050
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r12 = r1
            goto L_0x0052
        L_0x0050:
            r12 = r25
        L_0x0052:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0058
            r13 = r2
            goto L_0x005a
        L_0x0058:
            r13 = r26
        L_0x005a:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0060
            r14 = r2
            goto L_0x0062
        L_0x0060:
            r14 = r27
        L_0x0062:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = mf.C6565s.n()
            r15 = r0
            goto L_0x006e
        L_0x006c:
            r15 = r28
        L_0x006e:
            r16 = 0
            r4 = r17
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent.<init>(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.String, com.revenuecat.purchases.paywalls.components.properties.MaskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.FitMode, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
