package com.revenuecat.purchases.paywalls;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.OfferOverride.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$LocalizedConfiguration$OfferOverride$$serializer implements D {
    public static final PaywallData$LocalizedConfiguration$OfferOverride$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$OfferOverride$$serializer paywallData$LocalizedConfiguration$OfferOverride$$serializer = new PaywallData$LocalizedConfiguration$OfferOverride$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$OfferOverride$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride", paywallData$LocalizedConfiguration$OfferOverride$$serializer, 5);
        j0Var.l("offer_name", false);
        j0Var.l("offer_details", false);
        j0Var.l("offer_details_with_intro_offer", true);
        j0Var.l("offer_details_with_multiple_intro_offers", true);
        j0Var.l("offer_badge", true);
        descriptor = j0Var;
    }

    private PaywallData$LocalizedConfiguration$OfferOverride$$serializer() {
    }

    public C5978b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        C5978b u10 = C5998a.u(emptyStringToNullSerializer);
        C5978b u11 = C5998a.u(emptyStringToNullSerializer);
        C5978b u12 = C5998a.u(emptyStringToNullSerializer);
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, x0Var, u10, u11, u12};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride deserialize(jh.e r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r22.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r0.A(r1, r7)
            java.lang.String r6 = r0.A(r1, r6)
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r7 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r7, r8)
            java.lang.Object r3 = r0.i(r1, r3, r7, r8)
            java.lang.Object r4 = r0.i(r1, r4, r7, r8)
            r7 = 31
            r16 = r2
            r17 = r6
            r15 = r7
            goto L_0x008c
        L_0x003a:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x0040:
            if (r13 == 0) goto L_0x0084
            int r14 = r0.o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0082
            if (r14 == 0) goto L_0x007b
            if (r14 == r6) goto L_0x0074
            if (r14 == r5) goto L_0x006b
            if (r14 == r3) goto L_0x0062
            if (r14 != r4) goto L_0x005c
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r14 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x0040
        L_0x005c:
            gh.p r0 = new gh.p
            r0.<init>((int) r14)
            throw r0
        L_0x0062:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r14 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r11 = r0.i(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x0040
        L_0x006b:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r14 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x0040
        L_0x0074:
            java.lang.String r9 = r0.A(r1, r6)
            r2 = r2 | 2
            goto L_0x0040
        L_0x007b:
            java.lang.String r8 = r0.A(r1, r7)
            r2 = r2 | 1
            goto L_0x0040
        L_0x0082:
            r13 = r7
            goto L_0x0040
        L_0x0084:
            r15 = r2
            r16 = r8
            r17 = r9
            r5 = r10
            r3 = r11
            r4 = r12
        L_0x008c:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride r0 = new com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride
            r18 = r5
            java.lang.String r18 = (java.lang.String) r18
            r19 = r3
            java.lang.String r19 = (java.lang.String) r19
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            r21 = 0
            r14 = r0
            r14.<init>((int) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (kh.t0) r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$OfferOverride");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.LocalizedConfiguration.OfferOverride offerOverride) {
        C6496s.h(fVar, "encoder");
        C6496s.h(offerOverride, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.OfferOverride.write$Self(offerOverride, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
