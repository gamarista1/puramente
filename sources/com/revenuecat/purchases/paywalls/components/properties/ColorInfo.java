package com.revenuecat.purchases.paywalls.components.properties;

import Ff.d;
import com.revenuecat.purchases.ColorAlias;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kh.C6449f;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00032\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "", "Alias", "Companion", "Gradient", "Hex", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface ColorInfo {
    public static final Companion Companion = Companion.$$INSTANCE;

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B(\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "Lcom/revenuecat/purchases/ColorAlias;", "value", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias;Ljh/d;Lih/f;)V", "Ljava/lang/String;", "getValue-671NwFM", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Alias implements ColorInfo {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Alias;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return ColorInfo$Alias$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @C6521e
        public /* synthetic */ Alias(int i10, String str, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, t0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Alias) && ColorAlias.m30equalsimpl0(this.value, ((Alias) obj).value);
        }

        /* renamed from: getValue-671NwFM  reason: not valid java name */
        public final /* synthetic */ String m123getValue671NwFM() {
            return this.value;
        }

        public int hashCode() {
            return ColorAlias.m31hashCodeimpl(this.value);
        }

        public String toString() {
            return "Alias(value=" + ColorAlias.m32toStringimpl(this.value) + ')';
        }

        public /* synthetic */ Alias(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Alias(int i10, String str, t0 t0Var) {
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, ColorInfo$Alias$$serializer.INSTANCE.getDescriptor());
            }
            this.value = str;
        }

        private Alias(String str) {
            C6496s.h(str, "value");
            this.value = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            d b10 = O.b(ColorInfo.class);
            d[] dVarArr = {O.b(Alias.class), O.b(Gradient.Linear.class), O.b(Gradient.Radial.class), O.b(Hex.class)};
            return new C5983g("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", b10, dVarArr, new C5978b[]{ColorInfo$Alias$$serializer.INSTANCE, ColorInfo$Gradient$Linear$$serializer.INSTANCE, ColorInfo$Gradient$Radial$$serializer.INSTANCE, ColorInfo$Hex$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "Linear", "Point", "Radial", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Gradient extends ColorInfo {

        @C5985i
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;", "points", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILjava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;Ljh/d;Lih/f;)V", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Radial implements Gradient {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {new C6449f(ColorInfo$Gradient$Point$$serializer.INSTANCE)};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final List<Point> points;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Radial;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ColorInfo$Gradient$Radial$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @C6521e
            public /* synthetic */ Radial(int i10, List list, t0 t0Var) {
                if (1 != (i10 & 1)) {
                    C6456i0.a(i10, 1, ColorInfo$Gradient$Radial$$serializer.INSTANCE.getDescriptor());
                }
                this.points = list;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Radial) && C6496s.c(this.points, ((Radial) obj).points);
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return this.points.hashCode();
            }

            public String toString() {
                return "Radial(points=" + this.points + ')';
            }

            public Radial(List<Point> list) {
                C6496s.h(list, "points");
                this.points = list;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient;", "", "degrees", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;", "points", "<init>", "(FLjava/util/List;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IFLjava/util/List;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;Ljh/d;Lih/f;)V", "F", "getDegrees", "()F", "Ljava/util/List;", "getPoints", "()Ljava/util/List;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Linear implements Gradient {
            /* access modifiers changed from: private */
            public static final C5978b[] $childSerializers = {null, new C6449f(ColorInfo$Gradient$Point$$serializer.INSTANCE)};
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final float degrees;
            private final List<Point> points;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Linear;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ColorInfo$Gradient$Linear$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Linear(float f10, List<Point> list) {
                C6496s.h(list, "points");
                this.degrees = f10;
                this.points = list;
            }

            public static final /* synthetic */ void write$Self(Linear linear, jh.d dVar, f fVar) {
                C5978b[] bVarArr = $childSerializers;
                dVar.o(fVar, 0, linear.degrees);
                dVar.B(fVar, 1, bVarArr[1], linear.points);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Linear)) {
                    return false;
                }
                Linear linear = (Linear) obj;
                return Float.compare(this.degrees, linear.degrees) == 0 && C6496s.c(this.points, linear.points);
            }

            public final /* synthetic */ float getDegrees() {
                return this.degrees;
            }

            public final /* synthetic */ List getPoints() {
                return this.points;
            }

            public int hashCode() {
                return (Float.hashCode(this.degrees) * 31) + this.points.hashCode();
            }

            public String toString() {
                return "Linear(degrees=" + this.degrees + ", points=" + this.points + ')';
            }

            @C6521e
            public /* synthetic */ Linear(int i10, float f10, List list, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, ColorInfo$Gradient$Linear$$serializer.INSTANCE.getDescriptor());
                }
                this.degrees = f10;
                this.points = list;
            }
        }

        @C5985i
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;", "", "", "color", "", "percent", "<init>", "(IF)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IIFLkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;Ljh/d;Lih/f;)V", "I", "getColor", "()I", "getColor$annotations", "()V", "F", "getPercent", "()F", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Point {
            public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
            private final int color;
            private final float percent;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Gradient$Point;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C5978b serializer() {
                    return ColorInfo$Gradient$Point$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Point(int i10, float f10) {
                this.color = i10;
                this.percent = f10;
            }

            @C5985i(with = RgbaStringArgbColorIntDeserializer.class)
            public static /* synthetic */ void getColor$annotations() {
            }

            public static final /* synthetic */ void write$Self(Point point, jh.d dVar, f fVar) {
                dVar.B(fVar, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(point.color));
                dVar.o(fVar, 1, point.percent);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Point)) {
                    return false;
                }
                Point point = (Point) obj;
                return this.color == point.color && Float.compare(this.percent, point.percent) == 0;
            }

            public final /* synthetic */ int getColor() {
                return this.color;
            }

            public final /* synthetic */ float getPercent() {
                return this.percent;
            }

            public int hashCode() {
                return (Integer.hashCode(this.color) * 31) + Float.hashCode(this.percent);
            }

            public String toString() {
                return "Point(color=" + this.color + ", percent=" + this.percent + ')';
            }

            @C6521e
            public /* synthetic */ Point(int i10, @C5985i(with = RgbaStringArgbColorIntDeserializer.class) int i11, float f10, t0 t0Var) {
                if (3 != (i10 & 3)) {
                    C6456i0.a(i10, 3, ColorInfo$Gradient$Point$$serializer.INSTANCE.getDescriptor());
                }
                this.color = i11;
                this.percent = f10;
            }
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rHÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "", "value", "<init>", "(I)V", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(IILkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex;Ljh/d;Lih/f;)V", "I", "getValue", "()I", "getValue$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Hex implements ColorInfo {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final int value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo$Hex;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return ColorInfo$Hex$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Hex(int i10) {
            this.value = i10;
        }

        @C5985i(with = RgbaStringArgbColorIntDeserializer.class)
        public static /* synthetic */ void getValue$annotations() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Hex) && this.value == ((Hex) obj).value;
        }

        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "Hex(value=" + this.value + ')';
        }

        @C6521e
        public /* synthetic */ Hex(int i10, @C5985i(with = RgbaStringArgbColorIntDeserializer.class) int i11, t0 t0Var) {
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, ColorInfo$Hex$$serializer.INSTANCE.getDescriptor());
            }
            this.value = i11;
        }
    }
}
