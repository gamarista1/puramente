package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import gh.C5978b;
import gh.C5992p;
import ih.f;
import jh.c;
import jh.d;
import jh.e;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/CornerRadiuses.Percentage.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CornerRadiuses$Percentage$$serializer implements D {
    public static final CornerRadiuses$Percentage$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CornerRadiuses$Percentage$$serializer cornerRadiuses$Percentage$$serializer = new CornerRadiuses$Percentage$$serializer();
        INSTANCE = cornerRadiuses$Percentage$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage", cornerRadiuses$Percentage$$serializer, 4);
        j0Var.l("top_leading", false);
        j0Var.l("top_trailing", false);
        j0Var.l("bottom_leading", false);
        j0Var.l("bottom_trailing", false);
        descriptor = j0Var;
    }

    private CornerRadiuses$Percentage$$serializer() {
    }

    public C5978b[] childSerializers() {
        I i10 = I.f71604a;
        return new C5978b[]{i10, i10, i10, i10};
    }

    public CornerRadiuses.Percentage deserialize(e eVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        e eVar2 = eVar;
        C6496s.h(eVar2, "decoder");
        f descriptor2 = getDescriptor();
        c b10 = eVar2.b(descriptor2);
        if (b10.p()) {
            int E10 = b10.E(descriptor2, 0);
            int E11 = b10.E(descriptor2, 1);
            int E12 = b10.E(descriptor2, 2);
            i13 = E10;
            i10 = b10.E(descriptor2, 3);
            i11 = E12;
            i12 = E11;
            i14 = 15;
        } else {
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (z10) {
                int o10 = b10.o(descriptor2);
                if (o10 == -1) {
                    z10 = false;
                } else if (o10 == 0) {
                    i15 = b10.E(descriptor2, 0);
                    i19 |= 1;
                } else if (o10 == 1) {
                    i18 = b10.E(descriptor2, 1);
                    i19 |= 2;
                } else if (o10 == 2) {
                    i17 = b10.E(descriptor2, 2);
                    i19 |= 4;
                } else if (o10 == 3) {
                    i16 = b10.E(descriptor2, 3);
                    i19 |= 8;
                } else {
                    throw new C5992p(o10);
                }
            }
            i13 = i15;
            i10 = i16;
            i11 = i17;
            i12 = i18;
            i14 = i19;
        }
        b10.c(descriptor2);
        return new CornerRadiuses.Percentage(i14, i13, i12, i11, i10, (t0) null);
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CornerRadiuses.Percentage percentage) {
        C6496s.h(fVar, "encoder");
        C6496s.h(percentage, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CornerRadiuses.Percentage.write$Self(percentage, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
