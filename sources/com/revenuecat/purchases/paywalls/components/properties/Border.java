package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5985i;
import ih.f;
import jh.d;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "", "width", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;D)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/Border;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "D", "getWidth", "()D", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class Border {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ColorScheme color;
    private final double width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Border$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return Border$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ Border(int i10, ColorScheme colorScheme, double d10, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, Border$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.width = d10;
    }

    public static final /* synthetic */ void write$Self(Border border, d dVar, f fVar) {
        dVar.B(fVar, 0, ColorScheme$$serializer.INSTANCE, border.color);
        dVar.g(fVar, 1, border.width);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Border)) {
            return false;
        }
        Border border = (Border) obj;
        return C6496s.c(this.color, border.color) && Double.compare(this.width, border.width) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Double.hashCode(this.width);
    }

    public String toString() {
        return "Border(color=" + this.color + ", width=" + this.width + ')';
    }

    public Border(ColorScheme colorScheme, double d10) {
        C6496s.h(colorScheme, "color");
        this.color = colorScheme;
        this.width = d10;
    }
}
