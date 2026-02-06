package com.revenuecat.purchases.customercenter;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer implements D {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer", customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer, 5);
        j0Var.l("android_offer_id", false);
        j0Var.l("eligible", false);
        j0Var.l(b.f37461S, false);
        j0Var.l("subtitle", false);
        j0Var.l("product_mapping", false);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b bVar = CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$childSerializers[4];
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, C6455i.f71663a, x0Var, x0Var, bVar};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.$childSerializers
            boolean r3 = r0.p()
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = r0.A(r1, r8)
            boolean r7 = r0.s(r1, r7)
            java.lang.String r5 = r0.A(r1, r5)
            java.lang.String r4 = r0.A(r1, r4)
            r2 = r2[r6]
            java.lang.Object r2 = r0.C(r1, r6, r2, r9)
            r6 = 31
            r8 = r4
            r4 = r6
            r6 = r7
            r7 = r5
            r5 = r3
            goto L_0x008e
        L_0x003e:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r9 = r3
        L_0x0045:
            if (r14 == 0) goto L_0x0088
            int r15 = r0.o(r1)
            r8 = -1
            if (r15 == r8) goto L_0x0085
            if (r15 == 0) goto L_0x007d
            if (r15 == r7) goto L_0x0076
            if (r15 == r5) goto L_0x006f
            if (r15 == r4) goto L_0x0068
            if (r15 != r6) goto L_0x0062
            r8 = r2[r6]
            java.lang.Object r13 = r0.C(r1, r6, r8, r13)
            r3 = r3 | 16
        L_0x0060:
            r8 = 0
            goto L_0x0045
        L_0x0062:
            gh.p r0 = new gh.p
            r0.<init>((int) r15)
            throw r0
        L_0x0068:
            java.lang.String r12 = r0.A(r1, r4)
            r3 = r3 | 8
            goto L_0x0060
        L_0x006f:
            java.lang.String r11 = r0.A(r1, r5)
            r3 = r3 | 4
            goto L_0x0060
        L_0x0076:
            boolean r9 = r0.s(r1, r7)
            r3 = r3 | 2
            goto L_0x0060
        L_0x007d:
            r8 = 0
            java.lang.String r10 = r0.A(r1, r8)
            r3 = r3 | 1
            goto L_0x0045
        L_0x0085:
            r8 = 0
            r14 = r8
            goto L_0x0045
        L_0x0088:
            r4 = r3
            r6 = r9
            r5 = r10
            r7 = r11
            r8 = r12
            r2 = r13
        L_0x008e:
            r0.c(r1)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer r0 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9
            r10 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer) {
        C6496s.h(fVar, "encoder");
        C6496s.h(promotionalOffer, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.write$Self(promotionalOffer, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
