package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Appearance.ColorInformation.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$Appearance$ColorInformation$$serializer implements D {
    public static final CustomerCenterConfigData$Appearance$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = new CustomerCenterConfigData$Appearance$ColorInformation$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$ColorInformation$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation", customerCenterConfigData$Appearance$ColorInformation$$serializer, 5);
        j0Var.l("accent_color", true);
        j0Var.l("text_color", true);
        j0Var.l("background_color", true);
        j0Var.l("button_text_color", true);
        j0Var.l("button_background_color", true);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$Appearance$ColorInformation$$serializer() {
    }

    public C5978b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new C5978b[]{C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x0037
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r2 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r2, r8)
            java.lang.Object r6 = r0.i(r1, r6, r2, r8)
            java.lang.Object r5 = r0.i(r1, r5, r2, r8)
            java.lang.Object r3 = r0.i(r1, r3, r2, r8)
            java.lang.Object r2 = r0.i(r1, r4, r2, r8)
            r4 = 31
            r10 = r5
            r5 = r4
            goto L_0x008a
        L_0x0037:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x003d:
            if (r13 == 0) goto L_0x0085
            int r14 = r0.o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0083
            if (r14 == 0) goto L_0x007a
            if (r14 == r6) goto L_0x0071
            if (r14 == r5) goto L_0x0068
            if (r14 == r3) goto L_0x005f
            if (r14 != r4) goto L_0x0059
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r14 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x003d
        L_0x0059:
            gh.p r0 = new gh.p
            r0.<init>((int) r14)
            throw r0
        L_0x005f:
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r14 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r11 = r0.i(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x003d
        L_0x0068:
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r14 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x003d
        L_0x0071:
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r14 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r6, r14, r9)
            r2 = r2 | 2
            goto L_0x003d
        L_0x007a:
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r14 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r7, r14, r8)
            r2 = r2 | 1
            goto L_0x003d
        L_0x0083:
            r13 = r7
            goto L_0x003d
        L_0x0085:
            r5 = r2
            r7 = r8
            r6 = r9
            r3 = r11
            r2 = r12
        L_0x008a:
            r0.c(r1)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$ColorInformation r0 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$ColorInformation
            r1 = r7
            com.revenuecat.purchases.paywalls.PaywallColor r1 = (com.revenuecat.purchases.paywalls.PaywallColor) r1
            r7 = r6
            com.revenuecat.purchases.paywalls.PaywallColor r7 = (com.revenuecat.purchases.paywalls.PaywallColor) r7
            r8 = r10
            com.revenuecat.purchases.paywalls.PaywallColor r8 = (com.revenuecat.purchases.paywalls.PaywallColor) r8
            r9 = r3
            com.revenuecat.purchases.paywalls.PaywallColor r9 = (com.revenuecat.purchases.paywalls.PaywallColor) r9
            r10 = r2
            com.revenuecat.purchases.paywalls.PaywallColor r10 = (com.revenuecat.purchases.paywalls.PaywallColor) r10
            r11 = 0
            r4 = r0
            r6 = r1
            r4.<init>((int) r5, (com.revenuecat.purchases.paywalls.PaywallColor) r6, (com.revenuecat.purchases.paywalls.PaywallColor) r7, (com.revenuecat.purchases.paywalls.PaywallColor) r8, (com.revenuecat.purchases.paywalls.PaywallColor) r9, (com.revenuecat.purchases.paywalls.PaywallColor) r10, (kh.t0) r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$ColorInformation$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$ColorInformation");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData.Appearance.ColorInformation colorInformation) {
        C6496s.h(fVar, "encoder");
        C6496s.h(colorInformation, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.Appearance.ColorInformation.write$Self(colorInformation, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
