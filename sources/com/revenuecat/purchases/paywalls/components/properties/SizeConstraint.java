package com.revenuecat.purchases.paywalls.components.properties;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import java.lang.annotation.Annotation;
import kh.C6448e0;
import kh.C6456i0;
import kh.t0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6506E;
import lf.C6521e;
import lf.C6531o;
import lf.C6534r;

@C5985i
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "", "Companion", "Fill", "Fit", "Fixed", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public interface SizeConstraint {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final C5978b serializer() {
            return new C5983g("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", O.b(SizeConstraint.class), new d[]{O.b(Fill.class), O.b(Fit.class), O.b(Fixed.class)}, new C5978b[]{new C6448e0("fill", Fill.INSTANCE, new Annotation[0]), new C6448e0("fit", Fit.INSTANCE, new Annotation[0]), SizeConstraint$Fixed$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fill;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fill implements SizeConstraint {
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) $cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }
    }

    @C5985i
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fit;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "<init>", "()V", "Lgh/b;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fit implements SizeConstraint {
        private static final /* synthetic */ Lazy $cachedSerializer$delegate = C6531o.a(C6534r.PUBLICATION, AnonymousClass1.INSTANCE);
        public static final Fit INSTANCE = new Fit();

        private Fit() {
        }

        private final /* synthetic */ C5978b get$cachedSerializer() {
            return (C5978b) $cachedSerializer$delegate.getValue();
        }

        public final C5978b serializer() {
            return get$cachedSerializer();
        }
    }

    @C5985i
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0016B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B(\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "Llf/E;", "value", "<init>", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILlf/E;Lkh/t0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;Ljh/d;Lih/f;)V", "I", "getValue-pVg5ArA", "()I", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Fixed implements SizeConstraint {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private final int value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint$Fixed;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final C5978b serializer() {
                return SizeConstraint$Fixed$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Fixed(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fixed) && this.value == ((Fixed) obj).value;
        }

        /* renamed from: getValue-pVg5ArA  reason: not valid java name */
        public final /* synthetic */ int m126getValuepVg5ArA() {
            return this.value;
        }

        public int hashCode() {
            return C6506E.e(this.value);
        }

        public String toString() {
            return "Fixed(value=" + C6506E.f(this.value) + ')';
        }

        @C6521e
        public /* synthetic */ Fixed(int i10, C6506E e10, t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, e10, t0Var);
        }

        private Fixed(int i10) {
            this.value = i10;
        }

        private Fixed(int i10, C6506E e10, t0 t0Var) {
            if (1 != (i10 & 1)) {
                C6456i0.a(i10, 1, SizeConstraint$Fixed$$serializer.INSTANCE.getDescriptor());
            }
            this.value = e10.i();
        }
    }
}
