package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import android.os.Build;
import gh.C5978b;
import ih.e;
import ih.f;
import ih.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallColor;", "", "stringRepresentation", "", "(Ljava/lang/String;)V", "colorInt", "", "(I)V", "underlyingColor", "Landroid/graphics/Color;", "(Ljava/lang/String;Landroid/graphics/Color;)V", "getColorInt", "()I", "getStringRepresentation", "()Ljava/lang/String;", "getUnderlyingColor", "()Landroid/graphics/Color;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallColor {
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallColor$Serializer;", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Serializer implements C5978b {
        public static final Serializer INSTANCE = new Serializer();
        private static final f descriptor = i.a("PaywallColor", e.i.f68482a);

        private Serializer() {
        }

        public f getDescriptor() {
            return descriptor;
        }

        public PaywallColor deserialize(jh.e eVar) {
            C6496s.h(eVar, "decoder");
            return new PaywallColor(eVar.B());
        }

        public void serialize(jh.f fVar, PaywallColor paywallColor) {
            C6496s.h(fVar, "encoder");
            C6496s.h(paywallColor, "value");
            fVar.F(paywallColor.toString());
        }
    }

    public PaywallColor(String str, Color color) {
        C6496s.h(str, "stringRepresentation");
        this.stringRepresentation = str;
        this.underlyingColor = color;
        this.colorInt = ColorUtilsKt.parseRGBAColor(str);
    }

    public static /* synthetic */ PaywallColor copy$default(PaywallColor paywallColor, String str, Color color, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallColor.stringRepresentation;
        }
        if ((i10 & 2) != 0) {
            color = paywallColor.underlyingColor;
        }
        return paywallColor.copy(str, color);
    }

    public final String component1() {
        return this.stringRepresentation;
    }

    public final Color component2() {
        return this.underlyingColor;
    }

    public final PaywallColor copy(String str, Color color) {
        C6496s.h(str, "stringRepresentation");
        return new PaywallColor(str, color);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) obj;
        return C6496s.c(this.stringRepresentation, paywallColor.stringRepresentation) && C6496s.c(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int hashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return hashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaywallColor(String str) {
        this(str, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(ColorUtilsKt.parseRGBAColor(str)) : null);
        C6496s.h(str, "stringRepresentation");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaywallColor(int r4) {
        /*
            r3 = this;
            kotlin.jvm.internal.U r0 = kotlin.jvm.internal.U.f71764a
            java.util.Locale r0 = java.util.Locale.US
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "#%06X"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            java.lang.String r1 = "format(locale, format, *args)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x002b
            android.graphics.Color r4 = android.graphics.Color.valueOf(r4)
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallColor.<init>(int):void");
    }
}
