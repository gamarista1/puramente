package com.revenuecat.purchases.paywalls.components.properties;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class ColorScheme {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ColorInfo dark;
    private final ColorInfo light;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return ColorScheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Class<ColorInfo> cls = ColorInfo.class;
        Class<ColorInfo.Alias> cls2 = ColorInfo.Alias.class;
        Class<ColorInfo.Gradient.Linear> cls3 = ColorInfo.Gradient.Linear.class;
        Class<ColorInfo.Gradient.Radial> cls4 = ColorInfo.Gradient.Radial.class;
        Class<ColorInfo.Hex> cls5 = ColorInfo.Hex.class;
        ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = ColorInfo$Alias$$serializer.INSTANCE;
        ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = ColorInfo$Gradient$Linear$$serializer.INSTANCE;
        ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = ColorInfo$Gradient$Radial$$serializer.INSTANCE;
        ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = ColorInfo$Hex$$serializer.INSTANCE;
        $childSerializers = new C5978b[]{new C5983g("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", O.b(cls), new d[]{O.b(cls2), O.b(cls3), O.b(cls4), O.b(cls5)}, new C5978b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0]), new C5983g("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", O.b(cls), new d[]{O.b(cls2), O.b(cls3), O.b(cls4), O.b(cls5)}, new C5978b[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new Annotation[0])};
    }

    @C6521e
    public /* synthetic */ ColorScheme(int i10, ColorInfo colorInfo, ColorInfo colorInfo2, t0 t0Var) {
        if (1 != (i10 & 1)) {
            C6456i0.a(i10, 1, ColorScheme$$serializer.INSTANCE.getDescriptor());
        }
        this.light = colorInfo;
        if ((i10 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = colorInfo2;
        }
    }

    public static final /* synthetic */ void write$Self(ColorScheme colorScheme, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, bVarArr[0], colorScheme.light);
        if (dVar.q(fVar, 1) || colorScheme.dark != null) {
            dVar.p(fVar, 1, bVarArr[1], colorScheme.dark);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) obj;
        return C6496s.c(this.light, colorScheme.light) && C6496s.c(this.dark, colorScheme.dark);
    }

    public final /* synthetic */ ColorInfo getDark() {
        return this.dark;
    }

    public final /* synthetic */ ColorInfo getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        ColorInfo colorInfo = this.dark;
        return hashCode + (colorInfo == null ? 0 : colorInfo.hashCode());
    }

    public String toString() {
        return "ColorScheme(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2) {
        C6496s.h(colorInfo, "light");
        this.light = colorInfo;
        this.dark = colorInfo2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ColorScheme(ColorInfo colorInfo, ColorInfo colorInfo2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorInfo, (i10 & 2) != 0 ? null : colorInfo2);
    }
}
