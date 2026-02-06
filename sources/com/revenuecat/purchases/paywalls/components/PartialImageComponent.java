package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
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
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018B\u0001\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u001dJ(\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!HÇ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R+\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u00103\u001a\u0004\b5\u00106R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u00103\u001a\u0004\b9\u0010:R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\b?\u00103\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010@\u001a\u0004\bC\u0010BR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010I\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;Ljh/d;Lih/f;)V", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class PartialImageComponent implements PartialComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, FitMode.Companion.serializer(), new C5983g("com.revenuecat.purchases.paywalls.components.properties.MaskShape", O.b(MaskShape.class), new d[]{O.b(MaskShape.Circle.class), O.b(MaskShape.Concave.class), O.b(MaskShape.Convex.class), O.b(MaskShape.Rectangle.class)}, new C5978b[]{new C6448e0("circle", MaskShape.Circle.INSTANCE, new Annotation[0]), new C6448e0("concave", MaskShape.Concave.INSTANCE, new Annotation[0]), new C6448e0("convex", MaskShape.Convex.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Border border;
    private final ColorScheme colorOverlay;
    private final FitMode fitMode;
    private final Padding margin;
    private final MaskShape maskShape;
    private final String overrideSourceLid;
    private final Padding padding;
    private final Shadow shadow;
    private final Size size;
    private final ThemeImageUrls source;
    private final Boolean visible;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return PartialImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ PartialImageComponent(int i10, Boolean bool, ThemeImageUrls themeImageUrls, Size size2, String str, FitMode fitMode2, MaskShape maskShape2, ColorScheme colorScheme, Padding padding2, Padding padding3, Border border2, Shadow shadow2, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, themeImageUrls, size2, str, fitMode2, maskShape2, colorScheme, padding2, padding3, border2, shadow2, t0Var);
    }

    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    public static /* synthetic */ void getFitMode$annotations() {
    }

    public static /* synthetic */ void getMaskShape$annotations() {
    }

    /* renamed from: getOverrideSourceLid-sa7TU9Q$annotations  reason: not valid java name */
    public static /* synthetic */ void m74getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self(PartialImageComponent partialImageComponent, jh.d dVar, f fVar) {
        LocalizationKey localizationKey;
        C5978b[] bVarArr = $childSerializers;
        if (dVar.q(fVar, 0) || !C6496s.c(partialImageComponent.visible, Boolean.TRUE)) {
            dVar.p(fVar, 0, C6455i.f71663a, partialImageComponent.visible);
        }
        if (dVar.q(fVar, 1) || partialImageComponent.source != null) {
            dVar.p(fVar, 1, ThemeImageUrls$$serializer.INSTANCE, partialImageComponent.source);
        }
        if (dVar.q(fVar, 2) || partialImageComponent.size != null) {
            dVar.p(fVar, 2, Size$$serializer.INSTANCE, partialImageComponent.size);
        }
        if (dVar.q(fVar, 3) || partialImageComponent.overrideSourceLid != null) {
            LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
            String str = partialImageComponent.overrideSourceLid;
            if (str != null) {
                localizationKey = LocalizationKey.m112boximpl(str);
            } else {
                localizationKey = null;
            }
            dVar.p(fVar, 3, localizationKey$$serializer, localizationKey);
        }
        if (dVar.q(fVar, 4) || partialImageComponent.fitMode != null) {
            dVar.p(fVar, 4, bVarArr[4], partialImageComponent.fitMode);
        }
        if (dVar.q(fVar, 5) || partialImageComponent.maskShape != null) {
            dVar.p(fVar, 5, bVarArr[5], partialImageComponent.maskShape);
        }
        if (dVar.q(fVar, 6) || partialImageComponent.colorOverlay != null) {
            dVar.p(fVar, 6, ColorScheme$$serializer.INSTANCE, partialImageComponent.colorOverlay);
        }
        if (dVar.q(fVar, 7) || partialImageComponent.padding != null) {
            dVar.p(fVar, 7, Padding$$serializer.INSTANCE, partialImageComponent.padding);
        }
        if (dVar.q(fVar, 8) || partialImageComponent.margin != null) {
            dVar.p(fVar, 8, Padding$$serializer.INSTANCE, partialImageComponent.margin);
        }
        if (dVar.q(fVar, 9) || partialImageComponent.border != null) {
            dVar.p(fVar, 9, Border$$serializer.INSTANCE, partialImageComponent.border);
        }
        if (dVar.q(fVar, 10) || partialImageComponent.shadow != null) {
            dVar.p(fVar, 10, Shadow$$serializer.INSTANCE, partialImageComponent.shadow);
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
            boolean r1 = r5 instanceof com.revenuecat.purchases.paywalls.components.PartialImageComponent
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.revenuecat.purchases.paywalls.components.PartialImageComponent r5 = (com.revenuecat.purchases.paywalls.components.PartialImageComponent) r5
            java.lang.Boolean r1 = r4.visible
            java.lang.Boolean r3 = r5.visible
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = r4.source
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r3 = r5.source
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0022
            return r2
        L_0x0022:
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = r4.size
            com.revenuecat.purchases.paywalls.components.properties.Size r3 = r5.size
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r1 = r4.overrideSourceLid
            java.lang.String r3 = r5.overrideSourceLid
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
            boolean r1 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m115equalsimpl0(r1, r3)
        L_0x0040:
            if (r1 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.revenuecat.purchases.paywalls.components.properties.FitMode r1 = r4.fitMode
            com.revenuecat.purchases.paywalls.components.properties.FitMode r3 = r5.fitMode
            if (r1 == r3) goto L_0x004a
            return r2
        L_0x004a:
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r1 = r4.maskShape
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r3 = r5.maskShape
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0055
            return r2
        L_0x0055:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r1 = r4.colorOverlay
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r3 = r5.colorOverlay
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0060
            return r2
        L_0x0060:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.padding
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.padding
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x006b
            return r2
        L_0x006b:
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r4.margin
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = r5.margin
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0076
            return r2
        L_0x0076:
            com.revenuecat.purchases.paywalls.components.properties.Border r1 = r4.border
            com.revenuecat.purchases.paywalls.components.properties.Border r3 = r5.border
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r3)
            if (r1 != 0) goto L_0x0081
            return r2
        L_0x0081:
            com.revenuecat.purchases.paywalls.components.properties.Shadow r1 = r4.shadow
            com.revenuecat.purchases.paywalls.components.properties.Shadow r5 = r5.shadow
            boolean r5 = kotlin.jvm.internal.C6496s.c(r1, r5)
            if (r5 != 0) goto L_0x008c
            return r2
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialImageComponent.equals(java.lang.Object):boolean");
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
    public final /* synthetic */ String m75getOverrideSourceLidsa7TU9Q() {
        return this.overrideSourceLid;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ThemeImageUrls themeImageUrls = this.source;
        int hashCode2 = (hashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        Size size2 = this.size;
        int hashCode3 = (hashCode2 + (size2 == null ? 0 : size2.hashCode())) * 31;
        String str = this.overrideSourceLid;
        int r02 = (hashCode3 + (str == null ? 0 : LocalizationKey.m116hashCodeimpl(str))) * 31;
        FitMode fitMode2 = this.fitMode;
        int hashCode4 = (r02 + (fitMode2 == null ? 0 : fitMode2.hashCode())) * 31;
        MaskShape maskShape2 = this.maskShape;
        int hashCode5 = (hashCode4 + (maskShape2 == null ? 0 : maskShape2.hashCode())) * 31;
        ColorScheme colorScheme = this.colorOverlay;
        int hashCode6 = (hashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Padding padding2 = this.padding;
        int hashCode7 = (hashCode6 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Padding padding3 = this.margin;
        int hashCode8 = (hashCode7 + (padding3 == null ? 0 : padding3.hashCode())) * 31;
        Border border2 = this.border;
        int hashCode9 = (hashCode8 + (border2 == null ? 0 : border2.hashCode())) * 31;
        Shadow shadow2 = this.shadow;
        if (shadow2 != null) {
            i10 = shadow2.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PartialImageComponent(visible=");
        sb2.append(this.visible);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", overrideSourceLid=");
        String str = this.overrideSourceLid;
        sb2.append(str == null ? "null" : LocalizationKey.m117toStringimpl(str));
        sb2.append(", fitMode=");
        sb2.append(this.fitMode);
        sb2.append(", maskShape=");
        sb2.append(this.maskShape);
        sb2.append(", colorOverlay=");
        sb2.append(this.colorOverlay);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", border=");
        sb2.append(this.border);
        sb2.append(", shadow=");
        sb2.append(this.shadow);
        sb2.append(')');
        return sb2.toString();
    }

    public /* synthetic */ PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size2, String str, FitMode fitMode2, MaskShape maskShape2, ColorScheme colorScheme, Padding padding2, Padding padding3, Border border2, Shadow shadow2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, themeImageUrls, size2, str, fitMode2, maskShape2, colorScheme, padding2, padding3, border2, shadow2);
    }

    private PartialImageComponent(int i10, Boolean bool, ThemeImageUrls themeImageUrls, Size size2, String str, FitMode fitMode2, MaskShape maskShape2, ColorScheme colorScheme, Padding padding2, Padding padding3, Border border2, Shadow shadow2, t0 t0Var) {
        this.visible = (i10 & 1) == 0 ? Boolean.TRUE : bool;
        if ((i10 & 2) == 0) {
            this.source = null;
        } else {
            this.source = themeImageUrls;
        }
        if ((i10 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size2;
        }
        if ((i10 & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i10 & 16) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode2;
        }
        if ((i10 & 32) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape2;
        }
        if ((i10 & 64) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i10 & 128) == 0) {
            this.padding = null;
        } else {
            this.padding = padding2;
        }
        if ((i10 & 256) == 0) {
            this.margin = null;
        } else {
            this.margin = padding3;
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
    }

    private PartialImageComponent(Boolean bool, ThemeImageUrls themeImageUrls, Size size2, String str, FitMode fitMode2, MaskShape maskShape2, ColorScheme colorScheme, Padding padding2, Padding padding3, Border border2, Shadow shadow2) {
        this.visible = bool;
        this.source = themeImageUrls;
        this.size = size2;
        this.overrideSourceLid = str;
        this.fitMode = fitMode2;
        this.maskShape = maskShape2;
        this.colorOverlay = colorScheme;
        this.padding = padding2;
        this.margin = padding3;
        this.border = border2;
        this.shadow = shadow2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PartialImageComponent(java.lang.Boolean r13, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r14, com.revenuecat.purchases.paywalls.components.properties.Size r15, java.lang.String r16, com.revenuecat.purchases.paywalls.components.properties.FitMode r17, com.revenuecat.purchases.paywalls.components.properties.MaskShape r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, com.revenuecat.purchases.paywalls.components.properties.Padding r20, com.revenuecat.purchases.paywalls.components.properties.Padding r21, com.revenuecat.purchases.paywalls.components.properties.Border r22, com.revenuecat.purchases.paywalls.components.properties.Shadow r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialImageComponent.<init>(java.lang.Boolean, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size, java.lang.String, com.revenuecat.purchases.paywalls.components.properties.FitMode, com.revenuecat.purchases.paywalls.components.properties.MaskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Border, com.revenuecat.purchases.paywalls.components.properties.Shadow, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
