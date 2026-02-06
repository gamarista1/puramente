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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "color", "", "radius", "x", "y", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDD)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDDLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "D", "getRadius", "()D", "getX", "getY", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class Shadow {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ColorScheme color;
    private final double radius;

    /* renamed from: x  reason: collision with root package name */
    private final double f59542x;

    /* renamed from: y  reason: collision with root package name */
    private final double f59543y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return Shadow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C6521e
    public /* synthetic */ Shadow(int i10, ColorScheme colorScheme, double d10, double d11, double d12, t0 t0Var) {
        if (15 != (i10 & 15)) {
            C6456i0.a(i10, 15, Shadow$$serializer.INSTANCE.getDescriptor());
        }
        this.color = colorScheme;
        this.radius = d10;
        this.f59542x = d11;
        this.f59543y = d12;
    }

    public static final /* synthetic */ void write$Self(Shadow shadow, d dVar, f fVar) {
        dVar.B(fVar, 0, ColorScheme$$serializer.INSTANCE, shadow.color);
        dVar.g(fVar, 1, shadow.radius);
        dVar.g(fVar, 2, shadow.f59542x);
        dVar.g(fVar, 3, shadow.f59543y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return C6496s.c(this.color, shadow.color) && Double.compare(this.radius, shadow.radius) == 0 && Double.compare(this.f59542x, shadow.f59542x) == 0 && Double.compare(this.f59543y, shadow.f59543y) == 0;
    }

    public final /* synthetic */ ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getRadius() {
        return this.radius;
    }

    public final /* synthetic */ double getX() {
        return this.f59542x;
    }

    public final /* synthetic */ double getY() {
        return this.f59543y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + Double.hashCode(this.radius)) * 31) + Double.hashCode(this.f59542x)) * 31) + Double.hashCode(this.f59543y);
    }

    public String toString() {
        return "Shadow(color=" + this.color + ", radius=" + this.radius + ", x=" + this.f59542x + ", y=" + this.f59543y + ')';
    }

    public Shadow(ColorScheme colorScheme, double d10, double d11, double d12) {
        C6496s.h(colorScheme, "color");
        this.color = colorScheme;
        this.radius = d10;
        this.f59542x = d11;
        this.f59543y = d12;
    }
}
