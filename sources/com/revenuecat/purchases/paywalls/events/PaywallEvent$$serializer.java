package com.revenuecat.purchases.paywalls.events;

import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/events/PaywallEvent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallEvent$$serializer implements D {
    public static final PaywallEvent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        j0Var.l("creationData", false);
        j0Var.l("data", false);
        j0Var.l("type", false);
        descriptor = j0Var;
    }

    private PaywallEvent$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEvent$Data$$serializer.INSTANCE, PaywallEvent.$childSerializers[2]};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.events.PaywallEvent deserialize(jh.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            ih.f r0 = r12.getDescriptor()
            jh.c r13 = r13.b(r0)
            gh.b[] r1 = com.revenuecat.purchases.paywalls.events.PaywallEvent.$childSerializers
            boolean r2 = r13.p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0031
            com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer r2 = com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer.INSTANCE
            java.lang.Object r2 = r13.C(r0, r5, r2, r6)
            com.revenuecat.purchases.paywalls.events.PaywallEvent$Data$$serializer r5 = com.revenuecat.purchases.paywalls.events.PaywallEvent$Data$$serializer.INSTANCE
            java.lang.Object r4 = r13.C(r0, r4, r5, r6)
            r1 = r1[r3]
            java.lang.Object r1 = r13.C(r0, r3, r1, r6)
            r3 = 7
            r7 = r4
            r4 = r3
            goto L_0x006a
        L_0x0031:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x0035:
            if (r9 == 0) goto L_0x0067
            int r10 = r13.o(r0)
            r11 = -1
            if (r10 == r11) goto L_0x0065
            if (r10 == 0) goto L_0x005c
            if (r10 == r4) goto L_0x0053
            if (r10 != r3) goto L_0x004d
            r10 = r1[r3]
            java.lang.Object r8 = r13.C(r0, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x0035
        L_0x004d:
            gh.p r13 = new gh.p
            r13.<init>((int) r10)
            throw r13
        L_0x0053:
            com.revenuecat.purchases.paywalls.events.PaywallEvent$Data$$serializer r10 = com.revenuecat.purchases.paywalls.events.PaywallEvent$Data$$serializer.INSTANCE
            java.lang.Object r7 = r13.C(r0, r4, r10, r7)
            r2 = r2 | 2
            goto L_0x0035
        L_0x005c:
            com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer r10 = com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData$$serializer.INSTANCE
            java.lang.Object r6 = r13.C(r0, r5, r10, r6)
            r2 = r2 | 1
            goto L_0x0035
        L_0x0065:
            r9 = r5
            goto L_0x0035
        L_0x0067:
            r4 = r2
            r2 = r6
            r1 = r8
        L_0x006a:
            r13.c(r0)
            com.revenuecat.purchases.paywalls.events.PaywallEvent r13 = new com.revenuecat.purchases.paywalls.events.PaywallEvent
            r5 = r2
            com.revenuecat.purchases.paywalls.events.PaywallEvent$CreationData r5 = (com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData) r5
            r6 = r7
            com.revenuecat.purchases.paywalls.events.PaywallEvent$Data r6 = (com.revenuecat.purchases.paywalls.events.PaywallEvent.Data) r6
            r7 = r1
            com.revenuecat.purchases.paywalls.events.PaywallEventType r7 = (com.revenuecat.purchases.paywalls.events.PaywallEventType) r7
            r8 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.events.PaywallEvent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.events.PaywallEvent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallEvent paywallEvent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywallEvent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallEvent.write$Self(paywallEvent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
