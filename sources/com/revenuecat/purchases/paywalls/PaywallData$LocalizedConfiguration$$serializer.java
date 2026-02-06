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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$LocalizedConfiguration$$serializer implements D {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        j0Var.l(b.f37461S, false);
        j0Var.l("subtitle", true);
        j0Var.l("call_to_action", false);
        j0Var.l("call_to_action_with_intro_offer", true);
        j0Var.l("call_to_action_with_multiple_intro_offers", true);
        j0Var.l("offer_details", true);
        j0Var.l("offer_details_with_intro_offer", true);
        j0Var.l("offer_details_with_multiple_intro_offers", true);
        j0Var.l("offer_name", true);
        j0Var.l("features", true);
        j0Var.l("tier_name", true);
        j0Var.l("offer_overrides", true);
        descriptor = j0Var;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PaywallData.LocalizedConfiguration.$childSerializers;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        C5978b u10 = C5998a.u(emptyStringToNullSerializer);
        C5978b u11 = C5998a.u(emptyStringToNullSerializer);
        C5978b u12 = C5998a.u(emptyStringToNullSerializer);
        C5978b u13 = C5998a.u(emptyStringToNullSerializer);
        C5978b u14 = C5998a.u(emptyStringToNullSerializer);
        C5978b u15 = C5998a.u(emptyStringToNullSerializer);
        C5978b u16 = C5998a.u(emptyStringToNullSerializer);
        C5978b bVar = access$get$childSerializers$cp[9];
        C5978b u17 = C5998a.u(emptyStringToNullSerializer);
        C5978b bVar2 = access$get$childSerializers$cp[11];
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, u10, x0Var, u11, u12, u13, u14, u15, u16, bVar, u17, bVar2};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration deserialize(jh.e r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r23.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.$childSerializers
            boolean r3 = r0.p()
            r4 = 10
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r13 = 9
            r14 = 1
            r15 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0072
            java.lang.String r3 = r0.A(r1, r15)
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r15 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r14 = r0.i(r1, r14, r15, r12)
            java.lang.String r11 = r0.A(r1, r11)
            java.lang.Object r8 = r0.i(r1, r8, r15, r12)
            java.lang.Object r10 = r0.i(r1, r10, r15, r12)
            java.lang.Object r7 = r0.i(r1, r7, r15, r12)
            java.lang.Object r6 = r0.i(r1, r6, r15, r12)
            java.lang.Object r5 = r0.i(r1, r5, r15, r12)
            java.lang.Object r9 = r0.i(r1, r9, r15, r12)
            r16 = r3
            r3 = r2[r13]
            java.lang.Object r3 = r0.C(r1, r13, r3, r12)
            java.lang.Object r4 = r0.i(r1, r4, r15, r12)
            r13 = 11
            r2 = r2[r13]
            java.lang.Object r2 = r0.C(r1, r13, r2, r12)
            r12 = 4095(0xfff, float:5.738E-42)
            r17 = r11
            r15 = r14
            r14 = r8
            r11 = r10
            r8 = r7
            r10 = r9
            r9 = r4
            r7 = r5
            r4 = r12
            r5 = r16
            goto L_0x012b
        L_0x0072:
            r3 = 11
            r5 = r12
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r16 = r13
            r17 = r16
            r21 = r14
            r14 = r17
            r12 = r15
            r15 = r14
        L_0x0086:
            if (r21 == 0) goto L_0x0121
            int r4 = r0.o(r1)
            switch(r4) {
                case -1: goto L_0x011d;
                case 0: goto L_0x0114;
                case 1: goto L_0x0109;
                case 2: goto L_0x0100;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00df;
                case 6: goto L_0x00d4;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00bb;
                case 9: goto L_0x00ae;
                case 10: goto L_0x00a0;
                case 11: goto L_0x0095;
                default: goto L_0x008f;
            }
        L_0x008f:
            gh.p r0 = new gh.p
            r0.<init>((int) r4)
            throw r0
        L_0x0095:
            r4 = r2[r3]
            java.lang.Object r13 = r0.C(r1, r3, r4, r13)
            r12 = r12 | 2048(0x800, float:2.87E-42)
        L_0x009d:
            r4 = 10
            goto L_0x0086
        L_0x00a0:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r4 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r3 = 10
            java.lang.Object r9 = r0.i(r1, r3, r4, r9)
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r4 = r3
            r3 = 11
            goto L_0x0086
        L_0x00ae:
            r4 = 9
            r3 = r2[r4]
            java.lang.Object r5 = r0.C(r1, r4, r3, r5)
            r12 = r12 | 512(0x200, float:7.175E-43)
        L_0x00b8:
            r3 = 11
            goto L_0x009d
        L_0x00bb:
            r4 = 9
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 8
            java.lang.Object r6 = r0.i(r1, r4, r3, r6)
            r12 = r12 | 256(0x100, float:3.59E-43)
            goto L_0x00b8
        L_0x00c8:
            r4 = 8
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 7
            java.lang.Object r7 = r0.i(r1, r4, r3, r7)
            r12 = r12 | 128(0x80, float:1.794E-43)
            goto L_0x00b8
        L_0x00d4:
            r4 = 7
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 6
            java.lang.Object r10 = r0.i(r1, r4, r3, r10)
            r12 = r12 | 64
            goto L_0x00b8
        L_0x00df:
            r4 = 6
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 5
            java.lang.Object r8 = r0.i(r1, r4, r3, r8)
            r12 = r12 | 32
            goto L_0x00b8
        L_0x00ea:
            r4 = 5
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 4
            java.lang.Object r11 = r0.i(r1, r4, r3, r11)
            r12 = r12 | 16
            goto L_0x00b8
        L_0x00f5:
            r4 = 4
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 3
            java.lang.Object r14 = r0.i(r1, r4, r3, r14)
            r12 = r12 | 8
            goto L_0x00b8
        L_0x0100:
            r3 = 2
            r4 = 3
            java.lang.String r17 = r0.A(r1, r3)
            r12 = r12 | 4
            goto L_0x00b8
        L_0x0109:
            r4 = 3
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r3 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            r4 = 1
            java.lang.Object r15 = r0.i(r1, r4, r3, r15)
            r12 = r12 | 2
            goto L_0x00b8
        L_0x0114:
            r3 = 0
            r4 = 1
            java.lang.String r16 = r0.A(r1, r3)
            r12 = r12 | 1
            goto L_0x00b8
        L_0x011d:
            r3 = 0
            r21 = r3
            goto L_0x00b8
        L_0x0121:
            r3 = r5
            r4 = r12
            r2 = r13
            r5 = r16
            r22 = r10
            r10 = r6
            r6 = r22
        L_0x012b:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration r0 = new com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1
            r12 = r14
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r11 = (java.lang.String) r11
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r16 = r10
            java.lang.String r16 = (java.lang.String) r16
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            r19 = r9
            java.lang.String r19 = (java.lang.String) r19
            java.util.Map r2 = (java.util.Map) r2
            r20 = 0
            r3 = r0
            r6 = r1
            r7 = r17
            r8 = r12
            r9 = r11
            r10 = r13
            r11 = r14
            r12 = r15
            r13 = r16
            r14 = r18
            r15 = r19
            r16 = r2
            r17 = r20
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.util.List) r14, (java.lang.String) r15, (java.util.Map) r16, (kh.t0) r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$LocalizedConfiguration");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.LocalizedConfiguration localizedConfiguration) {
        C6496s.h(fVar, "encoder");
        C6496s.h(localizedConfiguration, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(localizedConfiguration, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
