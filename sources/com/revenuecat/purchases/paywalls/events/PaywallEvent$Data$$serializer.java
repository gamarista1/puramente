package com.revenuecat.purchases.paywalls.events;

import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallEvent.Data.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallEvent$Data$$serializer implements D {
    public static final PaywallEvent$Data$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallEvent$Data$$serializer paywallEvent$Data$$serializer = new PaywallEvent$Data$$serializer();
        INSTANCE = paywallEvent$Data$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.events.PaywallEvent.Data", paywallEvent$Data$$serializer, 6);
        j0Var.l("offeringIdentifier", false);
        j0Var.l("paywallRevision", false);
        j0Var.l("sessionIdentifier", false);
        j0Var.l("displayMode", false);
        j0Var.l("localeIdentifier", false);
        j0Var.l("darkMode", false);
        descriptor = j0Var;
    }

    private PaywallEvent$Data$$serializer() {
    }

    public C5978b[] childSerializers() {
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, I.f71604a, UUIDSerializer.INSTANCE, x0Var, x0Var, C6455i.f71663a};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.events.PaywallEvent.Data deserialize(jh.e r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r25.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r0.A(r1, r8)
            int r7 = r0.E(r1, r7)
            com.revenuecat.purchases.utils.serializers.UUIDSerializer r8 = com.revenuecat.purchases.utils.serializers.UUIDSerializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r8, r9)
            java.lang.String r4 = r0.A(r1, r4)
            java.lang.String r5 = r0.A(r1, r5)
            boolean r3 = r0.s(r1, r3)
            r8 = 63
            r18 = r2
            r23 = r3
            r21 = r4
            r22 = r5
            r19 = r7
            r17 = r8
            goto L_0x009b
        L_0x0046:
            r15 = r7
            r2 = r8
            r10 = r2
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r9 = r10
        L_0x004e:
            if (r15 == 0) goto L_0x008e
            int r8 = r0.o(r1)
            switch(r8) {
                case -1: goto L_0x008b;
                case 0: goto L_0x0083;
                case 1: goto L_0x007c;
                case 2: goto L_0x0073;
                case 3: goto L_0x006c;
                case 4: goto L_0x0065;
                case 5: goto L_0x005d;
                default: goto L_0x0057;
            }
        L_0x0057:
            gh.p r0 = new gh.p
            r0.<init>((int) r8)
            throw r0
        L_0x005d:
            boolean r2 = r0.s(r1, r3)
            r10 = r10 | 32
        L_0x0063:
            r8 = 0
            goto L_0x004e
        L_0x0065:
            java.lang.String r14 = r0.A(r1, r5)
            r10 = r10 | 16
            goto L_0x0063
        L_0x006c:
            java.lang.String r13 = r0.A(r1, r4)
            r10 = r10 | 8
            goto L_0x0063
        L_0x0073:
            com.revenuecat.purchases.utils.serializers.UUIDSerializer r8 = com.revenuecat.purchases.utils.serializers.UUIDSerializer.INSTANCE
            java.lang.Object r12 = r0.C(r1, r6, r8, r12)
            r10 = r10 | 4
            goto L_0x0063
        L_0x007c:
            int r9 = r0.E(r1, r7)
            r10 = r10 | 2
            goto L_0x0063
        L_0x0083:
            r8 = 0
            java.lang.String r11 = r0.A(r1, r8)
            r10 = r10 | 1
            goto L_0x004e
        L_0x008b:
            r8 = 0
            r15 = r8
            goto L_0x004e
        L_0x008e:
            r23 = r2
            r19 = r9
            r17 = r10
            r18 = r11
            r6 = r12
            r21 = r13
            r22 = r14
        L_0x009b:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.events.PaywallEvent$Data r0 = new com.revenuecat.purchases.paywalls.events.PaywallEvent$Data
            r20 = r6
            java.util.UUID r20 = (java.util.UUID) r20
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.events.PaywallEvent$Data$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.events.PaywallEvent$Data");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallEvent.Data data) {
        C6496s.h(fVar, "encoder");
        C6496s.h(data, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallEvent.Data.write$Self(data, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
