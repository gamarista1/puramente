package com.revenuecat.purchases.paywalls.components;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape$Rectangle$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 >2\u00020\u0001:\u0004?>@ABk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0001\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b6\u00105R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\b:\u0010'\u001a\u0004\b8\u00109R#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", "baseUrl", "iconName", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "formats", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "iconBackground", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "overrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Ljava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getBaseUrl$annotations", "()V", "getIconName", "getIconName$annotations", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "getFormats", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground", "()Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "getIconBackground$annotations", "Ljava/util/List;", "getOverrides", "()Ljava/util/List;", "Companion", "$serializer", "Formats", "IconBackground", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class IconComponent implements PaywallComponent {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers = {null, null, null, null, null, null, null, null, new C6449f(ComponentOverride.Companion.serializer(PartialIconComponent$$serializer.INSTANCE))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String baseUrl;
    private final ColorScheme color;
    private final Formats formats;
    private final IconBackground iconBackground;
    private final String iconName;
    private final Padding margin;
    private final List<ComponentOverride<PartialIconComponent>> overrides;
    private final Padding padding;
    private final Size size;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return IconComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "", "", "webp", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getWebp", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Formats {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String webp;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$Formats;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return IconComponent$Formats$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Formats(int i10, String str, t0 t0Var) {
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, IconComponent$Formats$$serializer.INSTANCE.getDescriptor());
            }
            this.webp = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Formats) && C6496s.c(this.webp, ((Formats) obj).webp);
        }

        public final /* synthetic */ String getWebp() {
            return this.webp;
        }

        public int hashCode() {
            return this.webp.hashCode();
        }

        public String toString() {
            return "Formats(webp=" + this.webp + ')';
        }

        public Formats(String str) {
            C6496s.h(str, "webp");
            this.webp = str;
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconBackground {
        /* access modifiers changed from: private */
        public static final C5978b[] $childSerializers = {null, new C5983g("com.revenuecat.purchases.paywalls.components.properties.MaskShape", O.b(MaskShape.class), new d[]{O.b(MaskShape.Circle.class), O.b(MaskShape.Concave.class), O.b(MaskShape.Convex.class), O.b(MaskShape.Rectangle.class)}, new C5978b[]{new C6448e0("circle", MaskShape.Circle.INSTANCE, new Annotation[0]), new C6448e0("concave", MaskShape.Concave.INSTANCE, new Annotation[0]), new C6448e0("convex", MaskShape.Convex.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]), null, null};
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final Border border;
        private final ColorScheme color;
        private final Shadow shadow;
        private final MaskShape shape;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return IconComponent$IconBackground$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ IconBackground(int i10, ColorScheme colorScheme, MaskShape maskShape, Border border2, Shadow shadow2, t0 t0Var) {
            if (3 != (i10 & 3)) {
                C6456i0.a(i10, 3, IconComponent$IconBackground$$serializer.INSTANCE.getDescriptor());
            }
            this.color = colorScheme;
            this.shape = maskShape;
            if ((i10 & 4) == 0) {
                this.border = null;
            } else {
                this.border = border2;
            }
            if ((i10 & 8) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow2;
            }
        }

        public static final /* synthetic */ void write$Self(IconBackground iconBackground, jh.d dVar, f fVar) {
            C5978b[] bVarArr = $childSerializers;
            dVar.B(fVar, 0, ColorScheme$$serializer.INSTANCE, iconBackground.color);
            dVar.B(fVar, 1, bVarArr[1], iconBackground.shape);
            if (dVar.q(fVar, 2) || iconBackground.border != null) {
                dVar.p(fVar, 2, Border$$serializer.INSTANCE, iconBackground.border);
            }
            if (dVar.q(fVar, 3) || iconBackground.shadow != null) {
                dVar.p(fVar, 3, Shadow$$serializer.INSTANCE, iconBackground.shadow);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconBackground)) {
                return false;
            }
            IconBackground iconBackground = (IconBackground) obj;
            return C6496s.c(this.color, iconBackground.color) && C6496s.c(this.shape, iconBackground.shape) && C6496s.c(this.border, iconBackground.border) && C6496s.c(this.shadow, iconBackground.shadow);
        }

        public final /* synthetic */ Border getBorder() {
            return this.border;
        }

        public final /* synthetic */ ColorScheme getColor() {
            return this.color;
        }

        public final /* synthetic */ Shadow getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ MaskShape getShape() {
            return this.shape;
        }

        public int hashCode() {
            int hashCode = ((this.color.hashCode() * 31) + this.shape.hashCode()) * 31;
            Border border2 = this.border;
            int i10 = 0;
            int hashCode2 = (hashCode + (border2 == null ? 0 : border2.hashCode())) * 31;
            Shadow shadow2 = this.shadow;
            if (shadow2 != null) {
                i10 = shadow2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "IconBackground(color=" + this.color + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
        }

        public IconBackground(ColorScheme colorScheme, MaskShape maskShape, Border border2, Shadow shadow2) {
            C6496s.h(colorScheme, "color");
            C6496s.h(maskShape, "shape");
            this.color = colorScheme;
            this.shape = maskShape;
            this.border = border2;
            this.shadow = shadow2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ IconBackground(ColorScheme colorScheme, MaskShape maskShape, Border border2, Shadow shadow2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(colorScheme, maskShape, (i10 & 4) != 0 ? null : border2, (i10 & 8) != 0 ? null : shadow2);
        }
    }

    @C6521e
    public /* synthetic */ IconComponent(int i10, String str, String str2, Formats formats2, Size size2, ColorScheme colorScheme, Padding padding2, Padding padding3, IconBackground iconBackground2, List list, t0 t0Var) {
        if (7 != (i10 & 7)) {
            C6456i0.a(i10, 7, IconComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats2;
        if ((i10 & 8) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size2;
        }
        if ((i10 & 16) == 0) {
            this.color = null;
        } else {
            this.color = colorScheme;
        }
        if ((i10 & 32) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding2;
        }
        if ((i10 & 64) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding3;
        }
        if ((i10 & 128) == 0) {
            this.iconBackground = null;
        } else {
            this.iconBackground = iconBackground2;
        }
        if ((i10 & 256) == 0) {
            this.overrides = C6565s.n();
        } else {
            this.overrides = list;
        }
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getIconBackground$annotations() {
    }

    public static /* synthetic */ void getIconName$annotations() {
    }

    public static final /* synthetic */ void write$Self(IconComponent iconComponent, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.t(fVar, 0, iconComponent.baseUrl);
        dVar.t(fVar, 1, iconComponent.iconName);
        dVar.B(fVar, 2, IconComponent$Formats$$serializer.INSTANCE, iconComponent.formats);
        if (dVar.q(fVar, 3) || !C6496s.c(iconComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.B(fVar, 3, Size$$serializer.INSTANCE, iconComponent.size);
        }
        if (dVar.q(fVar, 4) || iconComponent.color != null) {
            dVar.p(fVar, 4, ColorScheme$$serializer.INSTANCE, iconComponent.color);
        }
        if (dVar.q(fVar, 5) || !C6496s.c(iconComponent.padding, Padding.Companion.getZero())) {
            dVar.B(fVar, 5, Padding$$serializer.INSTANCE, iconComponent.padding);
        }
        if (dVar.q(fVar, 6) || !C6496s.c(iconComponent.margin, Padding.Companion.getZero())) {
            dVar.B(fVar, 6, Padding$$serializer.INSTANCE, iconComponent.margin);
        }
        if (dVar.q(fVar, 7) || iconComponent.iconBackground != null) {
            dVar.p(fVar, 7, IconComponent$IconBackground$$serializer.INSTANCE, iconComponent.iconBackground);
        }
        if (dVar.q(fVar, 8) || !C6496s.c(iconComponent.overrides, C6565s.n())) {
            dVar.B(fVar, 8, bVarArr[8], iconComponent.overrides);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconComponent)) {
            return false;
        }
        IconComponent iconComponent = (IconComponent) obj;
        return C6496s.c(this.baseUrl, iconComponent.baseUrl) && C6496s.c(this.iconName, iconComponent.iconName) && C6496s.c(this.formats, iconComponent.formats) && C6496s.c(this.size, iconComponent.size) && C6496s.c(this.color, iconComponent.color) && C6496s.c(this.padding, iconComponent.padding) && C6496s.c(this.margin, iconComponent.margin) && C6496s.c(this.iconBackground, iconComponent.iconBackground) && C6496s.c(this.overrides, iconComponent.overrides);
    }

    public final /* synthetic */ String getBaseUrl() {
        return this.baseUrl;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ Formats getFormats() {
        return this.formats;
    }

    public final /* synthetic */ IconBackground getIconBackground() {
        return this.iconBackground;
    }

    public final /* synthetic */ String getIconName() {
        return this.iconName;
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

    public int hashCode() {
        int hashCode = ((((((this.baseUrl.hashCode() * 31) + this.iconName.hashCode()) * 31) + this.formats.hashCode()) * 31) + this.size.hashCode()) * 31;
        ColorScheme colorScheme = this.color;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        IconBackground iconBackground2 = this.iconBackground;
        if (iconBackground2 != null) {
            i10 = iconBackground2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "IconComponent(baseUrl=" + this.baseUrl + ", iconName=" + this.iconName + ", formats=" + this.formats + ", size=" + this.size + ", color=" + this.color + ", padding=" + this.padding + ", margin=" + this.margin + ", iconBackground=" + this.iconBackground + ", overrides=" + this.overrides + ')';
    }

    public IconComponent(String str, String str2, Formats formats2, Size size2, ColorScheme colorScheme, Padding padding2, Padding padding3, IconBackground iconBackground2, List<ComponentOverride<PartialIconComponent>> list) {
        C6496s.h(str, "baseUrl");
        C6496s.h(str2, "iconName");
        C6496s.h(formats2, "formats");
        C6496s.h(size2, "size");
        C6496s.h(padding2, "padding");
        C6496s.h(padding3, "margin");
        C6496s.h(list, "overrides");
        this.baseUrl = str;
        this.iconName = str2;
        this.formats = formats2;
        this.size = size2;
        this.color = colorScheme;
        this.padding = padding2;
        this.margin = padding3;
        this.iconBackground = iconBackground2;
        this.overrides = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ IconComponent(java.lang.String r15, java.lang.String r16, com.revenuecat.purchases.paywalls.components.IconComponent.Formats r17, com.revenuecat.purchases.paywalls.components.properties.Size r18, com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19, com.revenuecat.purchases.paywalls.components.properties.Padding r20, com.revenuecat.purchases.paywalls.components.properties.Padding r21, com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground r22, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r14 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = new com.revenuecat.purchases.paywalls.components.properties.Size
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fill r2 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fill.INSTANCE
            com.revenuecat.purchases.paywalls.components.properties.SizeConstraint$Fit r3 = com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fit.INSTANCE
            r1.<init>(r2, r3)
            r8 = r1
            goto L_0x0013
        L_0x0011:
            r8 = r18
        L_0x0013:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x001a
            r9 = r2
            goto L_0x001c
        L_0x001a:
            r9 = r19
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0028
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r10 = r1
            goto L_0x002a
        L_0x0028:
            r10 = r20
        L_0x002a:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0036
            com.revenuecat.purchases.paywalls.components.properties.Padding$Companion r1 = com.revenuecat.purchases.paywalls.components.properties.Padding.Companion
            com.revenuecat.purchases.paywalls.components.properties.Padding r1 = r1.getZero()
            r11 = r1
            goto L_0x0038
        L_0x0036:
            r11 = r21
        L_0x0038:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003e
            r12 = r2
            goto L_0x0040
        L_0x003e:
            r12 = r22
        L_0x0040:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x004a
            java.util.List r0 = mf.C6565s.n()
            r13 = r0
            goto L_0x004c
        L_0x004a:
            r13 = r23
        L_0x004c:
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.IconComponent.<init>(java.lang.String, java.lang.String, com.revenuecat.purchases.paywalls.components.IconComponent$Formats, com.revenuecat.purchases.paywalls.components.properties.Size, com.revenuecat.purchases.paywalls.components.properties.ColorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.properties.Padding, com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
