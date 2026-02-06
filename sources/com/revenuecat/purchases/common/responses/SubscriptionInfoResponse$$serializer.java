package com.revenuecat.purchases.common.responses;

import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import gh.C5978b;
import hh.C5998a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/responses/SubscriptionInfoResponse.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionInfoResponse$$serializer implements D {
    public static final SubscriptionInfoResponse$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        SubscriptionInfoResponse$$serializer subscriptionInfoResponse$$serializer = new SubscriptionInfoResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse", subscriptionInfoResponse$$serializer, 12);
        j0Var.l("purchase_date", false);
        j0Var.l("original_purchase_date", false);
        j0Var.l("expires_date", false);
        j0Var.l(ProductResponseJsonKeys.STORE, false);
        j0Var.l(ProductResponseJsonKeys.IS_SANDBOX, false);
        j0Var.l(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, false);
        j0Var.l(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, false);
        j0Var.l("grace_period_expires_date", false);
        j0Var.l(ProductResponseJsonKeys.OWNERSHIP_TYPE, true);
        j0Var.l(ProductResponseJsonKeys.PERIOD_TYPE, false);
        j0Var.l("refunded_at", false);
        j0Var.l("store_transaction_id", false);
        descriptor = j0Var;
    }

    private SubscriptionInfoResponse$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = SubscriptionInfoResponse.$childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        return new C5978b[]{iSO8601DateSerializer, C5998a.u(iSO8601DateSerializer), C5998a.u(iSO8601DateSerializer), access$get$childSerializers$cp[3], C6455i.f71663a, C5998a.u(iSO8601DateSerializer), C5998a.u(iSO8601DateSerializer), C5998a.u(iSO8601DateSerializer), access$get$childSerializers$cp[8], access$get$childSerializers$cp[9], C5998a.u(iSO8601DateSerializer), C5998a.u(x0.f71726a)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.common.responses.SubscriptionInfoResponse deserialize(jh.e r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r29.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.$childSerializers
            boolean r3 = r0.p()
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 4
            r10 = 2
            r11 = 9
            r12 = 3
            r13 = 8
            r14 = 1
            r15 = 0
            r4 = 0
            if (r3 == 0) goto L_0x006f
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r3 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            java.lang.Object r15 = r0.C(r1, r15, r3, r4)
            java.lang.Object r14 = r0.i(r1, r14, r3, r4)
            java.lang.Object r10 = r0.i(r1, r10, r3, r4)
            r5 = r2[r12]
            java.lang.Object r5 = r0.C(r1, r12, r5, r4)
            boolean r9 = r0.s(r1, r9)
            java.lang.Object r8 = r0.i(r1, r8, r3, r4)
            java.lang.Object r7 = r0.i(r1, r7, r3, r4)
            java.lang.Object r6 = r0.i(r1, r6, r3, r4)
            r12 = r2[r13]
            java.lang.Object r12 = r0.C(r1, r13, r12, r4)
            r2 = r2[r11]
            java.lang.Object r2 = r0.C(r1, r11, r2, r4)
            r11 = 10
            java.lang.Object r3 = r0.i(r1, r11, r3, r4)
            kh.x0 r11 = kh.x0.f71726a
            r13 = 11
            java.lang.Object r4 = r0.i(r1, r13, r11, r4)
            r11 = 4095(0xfff, float:5.738E-42)
            r27 = r15
            r15 = r9
            r9 = r10
            r10 = r11
            r11 = r27
            goto L_0x015a
        L_0x006f:
            r3 = 11
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r25 = r14
            r11 = r15
            r24 = r11
            r14 = r13
            r15 = r14
        L_0x0080:
            if (r25 == 0) goto L_0x0145
            int r3 = r0.o(r1)
            switch(r3) {
                case -1: goto L_0x0139;
                case 0: goto L_0x0125;
                case 1: goto L_0x0118;
                case 2: goto L_0x010b;
                case 3: goto L_0x00ff;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00e7;
                case 6: goto L_0x00da;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00bf;
                case 9: goto L_0x00b2;
                case 10: goto L_0x009f;
                case 11: goto L_0x008f;
                default: goto L_0x0089;
            }
        L_0x0089:
            gh.p r0 = new gh.p
            r0.<init>((int) r3)
            throw r0
        L_0x008f:
            kh.x0 r3 = kh.x0.f71726a
            r26 = r4
            r4 = 11
            java.lang.Object r13 = r0.i(r1, r4, r3, r13)
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r3 = r4
            r4 = r26
            goto L_0x0080
        L_0x009f:
            r26 = r4
            r4 = 11
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r3 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r4 = 10
            java.lang.Object r6 = r0.i(r1, r4, r3, r6)
            r11 = r11 | 1024(0x400, float:1.435E-42)
        L_0x00ad:
            r4 = r26
        L_0x00af:
            r3 = 11
            goto L_0x0080
        L_0x00b2:
            r26 = r4
            r3 = 9
            r4 = r2[r3]
            java.lang.Object r7 = r0.C(r1, r3, r4, r7)
            r11 = r11 | 512(0x200, float:7.175E-43)
            goto L_0x00ad
        L_0x00bf:
            r26 = r4
            r4 = 8
            r3 = r2[r4]
            java.lang.Object r8 = r0.C(r1, r4, r3, r8)
            r11 = r11 | 256(0x100, float:3.59E-43)
            goto L_0x00ad
        L_0x00cc:
            r26 = r4
            r4 = 8
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r3 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r4 = 7
            java.lang.Object r9 = r0.i(r1, r4, r3, r9)
            r11 = r11 | 128(0x80, float:1.794E-43)
            goto L_0x00ad
        L_0x00da:
            r26 = r4
            r4 = 7
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r3 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r4 = 6
            java.lang.Object r12 = r0.i(r1, r4, r3, r12)
            r11 = r11 | 64
            goto L_0x00ad
        L_0x00e7:
            r26 = r4
            r4 = 6
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r3 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r4 = 5
            java.lang.Object r10 = r0.i(r1, r4, r3, r10)
            r11 = r11 | 32
            goto L_0x00ad
        L_0x00f4:
            r26 = r4
            r3 = 4
            r4 = 5
            boolean r24 = r0.s(r1, r3)
            r11 = r11 | 16
            goto L_0x00ad
        L_0x00ff:
            r26 = r4
            r3 = 3
            r4 = r2[r3]
            java.lang.Object r14 = r0.C(r1, r3, r4, r14)
            r11 = r11 | 8
            goto L_0x00ad
        L_0x010b:
            r26 = r4
            r3 = 3
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r4 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r3 = 2
            java.lang.Object r15 = r0.i(r1, r3, r4, r15)
            r11 = r11 | 4
            goto L_0x00ad
        L_0x0118:
            r26 = r4
            r3 = 2
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r4 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r3 = 1
            java.lang.Object r5 = r0.i(r1, r3, r4, r5)
            r11 = r11 | 2
            goto L_0x00ad
        L_0x0125:
            r26 = r4
            r3 = 1
            com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer r4 = com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer.INSTANCE
            r30 = r2
            r2 = r26
            r3 = 0
            java.lang.Object r4 = r0.C(r1, r3, r4, r2)
            r11 = r11 | 1
            r2 = r30
            goto L_0x00af
        L_0x0139:
            r30 = r2
            r2 = r4
            r3 = 0
            r25 = r3
            r3 = 11
            r2 = r30
            goto L_0x0080
        L_0x0145:
            r2 = r4
            r3 = r6
            r6 = r9
            r4 = r13
            r9 = r15
            r15 = r24
            r27 = r11
            r11 = r2
            r2 = r7
            r7 = r12
            r12 = r8
            r8 = r10
            r10 = r27
            r28 = r14
            r14 = r5
            r5 = r28
        L_0x015a:
            r0.c(r1)
            com.revenuecat.purchases.common.responses.SubscriptionInfoResponse r0 = new com.revenuecat.purchases.common.responses.SubscriptionInfoResponse
            java.util.Date r11 = (java.util.Date) r11
            r1 = r14
            java.util.Date r1 = (java.util.Date) r1
            r13 = r9
            java.util.Date r13 = (java.util.Date) r13
            r14 = r5
            com.revenuecat.purchases.Store r14 = (com.revenuecat.purchases.Store) r14
            r16 = r8
            java.util.Date r16 = (java.util.Date) r16
            r17 = r7
            java.util.Date r17 = (java.util.Date) r17
            r18 = r6
            java.util.Date r18 = (java.util.Date) r18
            r19 = r12
            com.revenuecat.purchases.OwnershipType r19 = (com.revenuecat.purchases.OwnershipType) r19
            r20 = r2
            com.revenuecat.purchases.PeriodType r20 = (com.revenuecat.purchases.PeriodType) r20
            r21 = r3
            java.util.Date r21 = (java.util.Date) r21
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22
            r23 = 0
            r9 = r0
            r12 = r1
            r9.<init>((int) r10, (java.util.Date) r11, (java.util.Date) r12, (java.util.Date) r13, (com.revenuecat.purchases.Store) r14, (boolean) r15, (java.util.Date) r16, (java.util.Date) r17, (java.util.Date) r18, (com.revenuecat.purchases.OwnershipType) r19, (com.revenuecat.purchases.PeriodType) r20, (java.util.Date) r21, (java.lang.String) r22, (kh.t0) r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.responses.SubscriptionInfoResponse$$serializer.deserialize(jh.e):com.revenuecat.purchases.common.responses.SubscriptionInfoResponse");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, SubscriptionInfoResponse subscriptionInfoResponse) {
        C6496s.h(fVar, "encoder");
        C6496s.h(subscriptionInfoResponse, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        SubscriptionInfoResponse.write$Self(subscriptionInfoResponse, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
