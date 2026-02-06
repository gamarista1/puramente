package com.revenuecat.purchases.customercenter;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Screen.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$Screen$$serializer implements D {
    public static final CustomerCenterConfigData$Screen$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$Screen$$serializer customerCenterConfigData$Screen$$serializer = new CustomerCenterConfigData$Screen$$serializer();
        INSTANCE = customerCenterConfigData$Screen$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen", customerCenterConfigData$Screen$$serializer, 4);
        j0Var.l("type", false);
        j0Var.l(b.f37461S, false);
        j0Var.l("subtitle", true);
        j0Var.l("paths", false);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$Screen$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{CustomerCenterConfigData.Screen.$childSerializers[0], x0.f71726a, C5998a.u(EmptyStringToNullSerializer.INSTANCE), HelpPathsSerializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen deserialize(jh.e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            ih.f r0 = r14.getDescriptor()
            jh.c r15 = r15.b(r0)
            gh.b[] r1 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.$childSerializers
            boolean r2 = r15.p()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0038
            r1 = r1[r6]
            java.lang.Object r1 = r15.C(r0, r6, r1, r7)
            java.lang.String r2 = r15.A(r0, r5)
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r5 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r4 = r15.i(r0, r4, r5, r7)
            com.revenuecat.purchases.customercenter.HelpPathsSerializer r5 = com.revenuecat.purchases.customercenter.HelpPathsSerializer.INSTANCE
            java.lang.Object r3 = r15.C(r0, r3, r5, r7)
            r5 = 15
            r10 = r3
            r3 = r5
            r5 = r2
            goto L_0x007c
        L_0x0038:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x003d:
            if (r11 == 0) goto L_0x0078
            int r12 = r15.o(r0)
            r13 = -1
            if (r12 == r13) goto L_0x0076
            if (r12 == 0) goto L_0x006d
            if (r12 == r5) goto L_0x0066
            if (r12 == r4) goto L_0x005d
            if (r12 != r3) goto L_0x0057
            com.revenuecat.purchases.customercenter.HelpPathsSerializer r12 = com.revenuecat.purchases.customercenter.HelpPathsSerializer.INSTANCE
            java.lang.Object r10 = r15.C(r0, r3, r12, r10)
            r2 = r2 | 8
            goto L_0x003d
        L_0x0057:
            gh.p r15 = new gh.p
            r15.<init>((int) r12)
            throw r15
        L_0x005d:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r12 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r9 = r15.i(r0, r4, r12, r9)
            r2 = r2 | 4
            goto L_0x003d
        L_0x0066:
            java.lang.String r8 = r15.A(r0, r5)
            r2 = r2 | 2
            goto L_0x003d
        L_0x006d:
            r12 = r1[r6]
            java.lang.Object r7 = r15.C(r0, r6, r12, r7)
            r2 = r2 | 1
            goto L_0x003d
        L_0x0076:
            r11 = r6
            goto L_0x003d
        L_0x0078:
            r3 = r2
            r1 = r7
            r5 = r8
            r4 = r9
        L_0x007c:
            r15.c(r0)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen r15 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen
            r0 = r1
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen$ScreenType r0 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType) r0
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r7 = r10
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r2 = r15
            r4 = r0
            r2.<init>((int) r3, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen.ScreenType) r4, (java.lang.String) r5, (java.lang.String) r6, (java.util.List) r7, (kh.t0) r8)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData.Screen screen) {
        C6496s.h(fVar, "encoder");
        C6496s.h(screen, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.Screen.write$Self(screen, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
