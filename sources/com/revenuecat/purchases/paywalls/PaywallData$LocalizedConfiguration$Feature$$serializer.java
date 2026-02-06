package com.revenuecat.purchases.paywalls;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.PaywallData;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.Feature.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$Feature;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements D {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        j0Var.l(b.f37461S, false);
        j0Var.l("content", true);
        j0Var.l("icon_id", true);
        descriptor = j0Var;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    public C5978b[] childSerializers() {
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, C5998a.u(x0Var), C5998a.u(x0Var)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r0.A(r1, r5)
            kh.x0 r5 = kh.x0.f71726a
            java.lang.Object r4 = r0.i(r1, r4, r5, r6)
            java.lang.Object r3 = r0.i(r1, r3, r5, r6)
            r5 = 7
            r12 = r2
            r11 = r5
            goto L_0x0063
        L_0x002b:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x002f:
            if (r9 == 0) goto L_0x005f
            int r10 = r0.o(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005d
            if (r10 == 0) goto L_0x0056
            if (r10 == r4) goto L_0x004d
            if (r10 != r3) goto L_0x0047
            kh.x0 r10 = kh.x0.f71726a
            java.lang.Object r8 = r0.i(r1, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x002f
        L_0x0047:
            gh.p r0 = new gh.p
            r0.<init>((int) r10)
            throw r0
        L_0x004d:
            kh.x0 r10 = kh.x0.f71726a
            java.lang.Object r7 = r0.i(r1, r4, r10, r7)
            r2 = r2 | 2
            goto L_0x002f
        L_0x0056:
            java.lang.String r6 = r0.A(r1, r5)
            r2 = r2 | 1
            goto L_0x002f
        L_0x005d:
            r9 = r5
            goto L_0x002f
        L_0x005f:
            r11 = r2
            r12 = r6
            r4 = r7
            r3 = r8
        L_0x0063:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature r0 = new com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            r10 = r0
            r10.<init>((int) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (kh.t0) r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$Feature");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.LocalizedConfiguration.Feature feature) {
        C6496s.h(fVar, "encoder");
        C6496s.h(feature, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self(feature, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
