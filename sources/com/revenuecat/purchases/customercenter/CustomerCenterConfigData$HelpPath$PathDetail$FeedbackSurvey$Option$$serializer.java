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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer implements D {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option", customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer, 3);
        j0Var.l("id", false);
        j0Var.l(b.f37461S, false);
        j0Var.l("promotional_offer", true);
        descriptor = j0Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b u10 = C5998a.u(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE);
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, x0Var, u10};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option deserialize(jh.e r17) {
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
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r0.A(r1, r5)
            java.lang.String r4 = r0.A(r1, r4)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer r5 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE
            java.lang.Object r3 = r0.i(r1, r3, r5, r6)
            r5 = 7
            r12 = r2
            r13 = r4
            r11 = r5
            goto L_0x0062
        L_0x002c:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x0030:
            if (r9 == 0) goto L_0x005e
            int r10 = r0.o(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005c
            if (r10 == 0) goto L_0x0055
            if (r10 == r4) goto L_0x004e
            if (r10 != r3) goto L_0x0048
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer r10 = com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x0030
        L_0x0048:
            gh.p r0 = new gh.p
            r0.<init>((int) r10)
            throw r0
        L_0x004e:
            java.lang.String r7 = r0.A(r1, r4)
            r2 = r2 | 2
            goto L_0x0030
        L_0x0055:
            java.lang.String r6 = r0.A(r1, r5)
            r2 = r2 | 1
            goto L_0x0030
        L_0x005c:
            r9 = r5
            goto L_0x0030
        L_0x005e:
            r11 = r2
            r12 = r6
            r13 = r7
            r3 = r8
        L_0x0062:
            r0.c(r1)
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option r0 = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option
            r14 = r3
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer r14 = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) r14
            r15 = 0
            r10 = r0
            r10.<init>((int) r11, (java.lang.String) r12, (java.lang.String) r13, (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) r14, (kh.t0) r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer.deserialize(jh.e):com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        C6496s.h(fVar, "encoder");
        C6496s.h(option, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.write$Self(option, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
