package com.revenuecat.purchases.paywalls.components.properties;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6448e0;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "", "Circle", "Companion", "Concave", "Convex", "Rectangle", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Circle;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Concave;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Convex;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface MaskShape {
    public static final Companion Companion = Companion.$$INSTANCE;

    @C5985i
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Circle;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Circle implements MaskShape {
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
        public static final Circle INSTANCE = new Circle();

        private Circle() {
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) $cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            return new C5983g("com.revenuecat.purchases.paywalls.components.properties.MaskShape", O.b(MaskShape.class), new d[]{O.b(Circle.class), O.b(Concave.class), O.b(Convex.class), O.b(Rectangle.class)}, new C5978b[]{new C6448e0("circle", Circle.INSTANCE, new Annotation[0]), new C6448e0("concave", Concave.INSTANCE, new Annotation[0]), new C6448e0("convex", Convex.INSTANCE, new Annotation[0]), MaskShape$Rectangle$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Concave;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Concave implements MaskShape {
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
        public static final Concave INSTANCE = new Concave();

        private Concave() {
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) $cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Convex;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Convex implements MaskShape {
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
        public static final Convex INSTANCE = new Convex();

        private Convex() {
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) $cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "corners", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "getCorners", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Rectangle implements MaskShape {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final CornerRadiuses corners;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape$Rectangle;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return MaskShape$Rectangle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Rectangle() {
            this((CornerRadiuses) null, 1, (DefaultConstructorMarker) null);
        }

        public static final /* synthetic */ void write$Self(Rectangle rectangle, jh.d dVar, f fVar) {
            if (dVar.q(fVar, 0) || rectangle.corners != null) {
                dVar.p(fVar, 0, CornerRadiusesSerializer.INSTANCE, rectangle.corners);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Rectangle) && C6496s.c(this.corners, ((Rectangle) obj).corners);
        }

        public final /* synthetic */ CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }

        @C6521e
        public /* synthetic */ Rectangle(int i10, CornerRadiuses cornerRadiuses, t0 t0Var) {
            if ((i10 & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Rectangle(CornerRadiuses cornerRadiuses, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cornerRadiuses);
        }
    }
}
