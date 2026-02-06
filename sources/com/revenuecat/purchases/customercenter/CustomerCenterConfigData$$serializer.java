package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$$serializer implements D {
    public static final CustomerCenterConfigData$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$$serializer customerCenterConfigData$$serializer = new CustomerCenterConfigData$$serializer();
        INSTANCE = customerCenterConfigData$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData", customerCenterConfigData$$serializer, 5);
        j0Var.l("screens", false);
        j0Var.l("appearance", false);
        j0Var.l("localization", false);
        j0Var.l("support", false);
        j0Var.l("last_published_app_version", true);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ScreenMapSerializer.INSTANCE, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, CustomerCenterConfigData$Localization$$serializer.INSTANCE, CustomerCenterConfigData$Support$$serializer.INSTANCE, C5998a.u(EmptyStringToNullSerializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData deserialize(jh.e r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r17.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x003e
            com.revenuecat.purchases.customercenter.ScreenMapSerializer r2 = com.revenuecat.purchases.customercenter.ScreenMapSerializer.INSTANCE
            java.lang.Object r2 = r0.C(r1, r7, r2, r8)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer r7 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r7, r8)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer r7 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r7, r8)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer r7 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r3, r7, r8)
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r7 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r7, r8)
            r7 = 31
            r8 = r7
            goto L_0x0095
        L_0x003e:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x0044:
            if (r13 == 0) goto L_0x008c
            int r14 = r0.o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x008a
            if (r14 == 0) goto L_0x0081
            if (r14 == r6) goto L_0x0078
            if (r14 == r5) goto L_0x006f
            if (r14 == r3) goto L_0x0066
            if (r14 != r4) goto L_0x0060
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r14 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x0044
        L_0x0060:
            gh.p r0 = new gh.p
            r0.<init>((int) r14)
            throw r0
        L_0x0066:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer r14 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer.INSTANCE
            java.lang.Object r11 = r0.C(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x0044
        L_0x006f:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer r14 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer.INSTANCE
            java.lang.Object r10 = r0.C(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x0044
        L_0x0078:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer r14 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer.INSTANCE
            java.lang.Object r9 = r0.C(r1, r6, r14, r9)
            r2 = r2 | 2
            goto L_0x0044
        L_0x0081:
            com.revenuecat.purchases.customercenter.ScreenMapSerializer r14 = com.revenuecat.purchases.customercenter.ScreenMapSerializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r7, r14, r8)
            r2 = r2 | 1
            goto L_0x0044
        L_0x008a:
            r13 = r7
            goto L_0x0044
        L_0x008c:
            r6 = r9
            r5 = r10
            r3 = r11
            r4 = r12
            r16 = r8
            r8 = r2
            r2 = r16
        L_0x0095:
            r0.c(r1)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r0 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData
            r9 = r2
            java.util.Map r9 = (java.util.Map) r9
            r10 = r6
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance r10 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance) r10
            r11 = r5
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization r11 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization) r11
            r12 = r3
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support r12 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support) r12
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            r7 = r0
            r7.<init>((int) r8, (java.util.Map) r9, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance) r10, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization) r11, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support) r12, (java.lang.String) r13, (kh.t0) r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData customerCenterConfigData) {
        C6496s.h(fVar, "encoder");
        C6496s.h(customerCenterConfigData, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.write$Self(customerCenterConfigData, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
