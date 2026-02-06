package com.revenuecat.purchases.paywalls.components.properties;

import Ff.d;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import gh.C5978b;
import gh.C5983g;
import gh.C5985i;
import ih.f;
import java.lang.annotation.Annotation;
import kh.C6448e0;
import kh.C6456i0;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6521e;

@C5985i
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "width", "height", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V", "", "seen1", "Lkh/t0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lkh/t0;)V", "self", "Ljh/d;", "output", "Lih/f;", "serialDesc", "Llf/M;", "write$Self", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljh/d;Lih/f;)V", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "getWidth", "()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "getHeight", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class Size {
    /* access modifiers changed from: private */
    public static final C5978b[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SizeConstraint height;
    private final SizeConstraint width;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Size$Companion;", "", "<init>", "()V", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "serializer", "()Lgh/b;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5978b serializer() {
            return Size$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        Class<SizeConstraint> cls = SizeConstraint.class;
        d b10 = O.b(cls);
        Class<SizeConstraint.Fill> cls2 = SizeConstraint.Fill.class;
        Class<SizeConstraint.Fit> cls3 = SizeConstraint.Fit.class;
        Class<SizeConstraint.Fixed> cls4 = SizeConstraint.Fixed.class;
        d[] dVarArr = {O.b(cls2), O.b(cls3), O.b(cls4)};
        SizeConstraint.Fill fill = SizeConstraint.Fill.INSTANCE;
        C6448e0 e0Var = new C6448e0("fill", fill, new Annotation[0]);
        SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
        C6448e0 e0Var2 = new C6448e0("fit", fit, new Annotation[0]);
        SizeConstraint$Fixed$$serializer sizeConstraint$Fixed$$serializer = SizeConstraint$Fixed$$serializer.INSTANCE;
        SizeConstraint.Fit fit2 = fit;
        $childSerializers = new C5978b[]{new C5983g("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", b10, dVarArr, new C5978b[]{e0Var, e0Var2, sizeConstraint$Fixed$$serializer}, new Annotation[0]), new C5983g("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint", O.b(cls), new d[]{O.b(cls2), O.b(cls3), O.b(cls4)}, new C5978b[]{new C6448e0("fill", fill, new Annotation[0]), new C6448e0("fit", fit2, new Annotation[0]), sizeConstraint$Fixed$$serializer}, new Annotation[0])};
    }

    @C6521e
    public /* synthetic */ Size(int i10, SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, t0 t0Var) {
        if (3 != (i10 & 3)) {
            C6456i0.a(i10, 3, Size$$serializer.INSTANCE.getDescriptor());
        }
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public static final /* synthetic */ void write$Self(Size size, jh.d dVar, f fVar) {
        C5978b[] bVarArr = $childSerializers;
        dVar.B(fVar, 0, bVarArr[0], size.width);
        dVar.B(fVar, 1, bVarArr[1], size.height);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return C6496s.c(this.width, size.width) && C6496s.c(this.height, size.height);
    }

    public final /* synthetic */ SizeConstraint getHeight() {
        return this.height;
    }

    public final /* synthetic */ SizeConstraint getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2) {
        C6496s.h(sizeConstraint, Snapshot.WIDTH);
        C6496s.h(sizeConstraint2, Snapshot.HEIGHT);
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }
}
