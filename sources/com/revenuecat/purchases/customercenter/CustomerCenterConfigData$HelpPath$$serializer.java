package com.revenuecat.purchases.customercenter;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$HelpPath$$serializer implements D {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 7);
        j0Var.l("id", false);
        j0Var.l(b.f37461S, false);
        j0Var.l("type", false);
        j0Var.l("promotional_offer", true);
        j0Var.l("feedback_survey", true);
        j0Var.l("url", true);
        j0Var.l("open_method", true);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = CustomerCenterConfigData.HelpPath.$childSerializers;
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, x0Var, access$get$childSerializers$cp[2], C5998a.u(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), C5998a.u(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE), C5998a.u(x0Var), C5998a.u(access$get$childSerializers$cp[6])};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0097, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath deserialize(jh.e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r18.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.$childSerializers
            boolean r3 = r0.p()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 6
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0051
            java.lang.String r3 = r0.A(r1, r10)
            java.lang.String r9 = r0.A(r1, r9)
            r10 = r2[r8]
            java.lang.Object r8 = r0.C(r1, r8, r10, r11)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer r10 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r10, r11)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer r10 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r10, r11)
            kh.x0 r10 = kh.x0.f71726a
            java.lang.Object r4 = r0.i(r1, r4, r10, r11)
            r2 = r2[r7]
            java.lang.Object r2 = r0.i(r1, r7, r2, r11)
            r7 = 127(0x7f, float:1.78E-43)
            r10 = r4
            r14 = r5
            r15 = r6
            r4 = r7
            r6 = r9
            r5 = r3
            goto L_0x00ba
        L_0x0051:
            r17 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x005a:
            if (r17 == 0) goto L_0x00b5
            int r8 = r0.o(r1)
            switch(r8) {
                case -1: goto L_0x00ae;
                case 0: goto L_0x00a2;
                case 1: goto L_0x0099;
                case 2: goto L_0x008e;
                case 3: goto L_0x0085;
                case 4: goto L_0x007c;
                case 5: goto L_0x0073;
                case 6: goto L_0x0069;
                default: goto L_0x0063;
            }
        L_0x0063:
            gh.p r0 = new gh.p
            r0.<init>((int) r8)
            throw r0
        L_0x0069:
            r8 = r2[r7]
            java.lang.Object r9 = r0.i(r1, r7, r8, r9)
            r3 = r3 | 64
        L_0x0071:
            r8 = 2
            goto L_0x005a
        L_0x0073:
            kh.x0 r8 = kh.x0.f71726a
            java.lang.Object r10 = r0.i(r1, r4, r8, r10)
            r3 = r3 | 32
            goto L_0x0071
        L_0x007c:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer r8 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE
            java.lang.Object r15 = r0.i(r1, r6, r8, r15)
            r3 = r3 | 16
            goto L_0x0071
        L_0x0085:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer r8 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE
            java.lang.Object r14 = r0.i(r1, r5, r8, r14)
            r3 = r3 | 8
            goto L_0x0071
        L_0x008e:
            r8 = 2
            r4 = r2[r8]
            java.lang.Object r13 = r0.C(r1, r8, r4, r13)
            r3 = r3 | 4
        L_0x0097:
            r4 = 5
            goto L_0x005a
        L_0x0099:
            r4 = 1
            r8 = 2
            java.lang.String r12 = r0.A(r1, r4)
            r3 = r3 | 2
            goto L_0x0097
        L_0x00a2:
            r4 = 1
            r8 = 2
            r11 = 0
            java.lang.String r16 = r0.A(r1, r11)
            r3 = r3 | 1
            r11 = r16
            goto L_0x0097
        L_0x00ae:
            r4 = 1
            r8 = 2
            r16 = 0
            r17 = r16
            goto L_0x0097
        L_0x00b5:
            r4 = r3
            r2 = r9
            r5 = r11
            r6 = r12
            r8 = r13
        L_0x00ba:
            r0.c(r1)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath r0 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath
            r7 = r8
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathType r7 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType) r7
            r8 = r14
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer r8 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) r8
            r9 = r15
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey r9 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = r2
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$OpenMethod r11 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.OpenMethod) r11
            r12 = 0
            r3 = r0
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathType) r7, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) r8, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) r9, (java.lang.String) r10, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.OpenMethod) r11, (kh.t0) r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData.HelpPath helpPath) {
        C6496s.h(fVar, "encoder");
        C6496s.h(helpPath, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self(helpPath, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
