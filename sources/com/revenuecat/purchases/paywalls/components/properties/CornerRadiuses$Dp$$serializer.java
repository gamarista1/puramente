package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import gh.C5978b;
import gh.C5992p;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kh.C6458j0;
import kh.C6473u;
import kh.D;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/CornerRadiuses.Dp.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CornerRadiuses$Dp$$serializer implements D {
    public static final CornerRadiuses$Dp$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CornerRadiuses$Dp$$serializer cornerRadiuses$Dp$$serializer = new CornerRadiuses$Dp$$serializer();
        INSTANCE = cornerRadiuses$Dp$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp", cornerRadiuses$Dp$$serializer, 4);
        j0Var.l("top_leading", false);
        j0Var.l("top_trailing", false);
        j0Var.l("bottom_leading", false);
        j0Var.l("bottom_trailing", false);
        descriptor = j0Var;
    }

    private CornerRadiuses$Dp$$serializer() {
    }

    public C5978b[] childSerializers() {
        C6473u uVar = C6473u.f71706a;
        return new C5978b[]{uVar, uVar, uVar, uVar};
    }

    public CornerRadiuses.Dp deserialize(e eVar) {
        double d10;
        double d11;
        double d12;
        double d13;
        int i10;
        e eVar2 = eVar;
        C6496s.h(eVar2, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar2.b(descriptor2);
        if (b10.p()) {
            double x10 = b10.x(descriptor2, 0);
            double x11 = b10.x(descriptor2, 1);
            double x12 = b10.x(descriptor2, 2);
            d10 = b10.x(descriptor2, 3);
            d11 = x12;
            d13 = x10;
            d12 = x11;
            i10 = 15;
        } else {
            double d14 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    d16 = b10.x(descriptor2, 0);
                    i11 |= 1;
                } else if (o10 == 1) {
                    d17 = b10.x(descriptor2, 1);
                    i11 |= 2;
                } else if (o10 == 2) {
                    d15 = b10.x(descriptor2, 2);
                    i11 |= 4;
                } else if (o10 == 3) {
                    d14 = b10.x(descriptor2, 3);
                    i11 |= 8;
                } else {
                    throw new C5992p(o10);
                }
            }
            i10 = i11;
            d10 = d14;
            d11 = d15;
            d13 = d16;
            d12 = d17;
        }
        b10.c(descriptor2);
        return new CornerRadiuses.Dp(i10, d13, d12, d11, d10, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CornerRadiuses.Dp dp) {
        C6496s.h(fVar, "encoder");
        C6496s.h(dp, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CornerRadiuses.Dp.write$Self(dp, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
