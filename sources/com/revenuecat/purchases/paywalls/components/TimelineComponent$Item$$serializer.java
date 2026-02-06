package com.revenuecat.purchases.paywalls.components;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.Item.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimelineComponent$Item$$serializer implements D {
    public static final TimelineComponent$Item$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TimelineComponent$Item$$serializer timelineComponent$Item$$serializer = new TimelineComponent$Item$$serializer();
        INSTANCE = timelineComponent$Item$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Item", timelineComponent$Item$$serializer, 5);
        j0Var.l(b.f37461S, false);
        j0Var.l(b.f37480c, true);
        j0Var.l("icon", false);
        j0Var.l("connector", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private TimelineComponent$Item$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = TimelineComponent.Item.$childSerializers;
        TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
        return new C5978b[]{textComponent$$serializer, C5998a.u(textComponent$$serializer), IconComponent$$serializer.INSTANCE, C5998a.u(TimelineComponent$Connector$$serializer.INSTANCE), access$get$childSerializers$cp[4]};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TimelineComponent.Item deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.TimelineComponent.Item.$childSerializers
            boolean r3 = r0.p()
            r4 = 3
            r5 = 2
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0040
            com.revenuecat.purchases.paywalls.components.TextComponent$$serializer r3 = com.revenuecat.purchases.paywalls.components.TextComponent$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r8, r3, r9)
            java.lang.Object r3 = r0.i(r1, r7, r3, r9)
            com.revenuecat.purchases.paywalls.components.IconComponent$$serializer r7 = com.revenuecat.purchases.paywalls.components.IconComponent$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r7, r9)
            com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector$$serializer r7 = com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r7, r9)
            r2 = r2[r6]
            java.lang.Object r2 = r0.C(r1, r6, r2, r9)
            r6 = 31
            r7 = r6
            goto L_0x0099
        L_0x0040:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0046:
            if (r14 == 0) goto L_0x0093
            int r15 = r0.o(r1)
            r8 = -1
            if (r15 == r8) goto L_0x008f
            if (r15 == 0) goto L_0x0084
            if (r15 == r7) goto L_0x007b
            if (r15 == r5) goto L_0x0072
            if (r15 == r4) goto L_0x0069
            if (r15 != r6) goto L_0x0063
            r8 = r2[r6]
            java.lang.Object r13 = r0.C(r1, r6, r8, r13)
            r3 = r3 | 16
        L_0x0061:
            r8 = 0
            goto L_0x0046
        L_0x0063:
            gh.p r0 = new gh.p
            r0.<init>((int) r15)
            throw r0
        L_0x0069:
            com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector$$serializer r8 = com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector$$serializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r4, r8, r12)
            r3 = r3 | 8
            goto L_0x0061
        L_0x0072:
            com.revenuecat.purchases.paywalls.components.IconComponent$$serializer r8 = com.revenuecat.purchases.paywalls.components.IconComponent$$serializer.INSTANCE
            java.lang.Object r11 = r0.C(r1, r5, r8, r11)
            r3 = r3 | 4
            goto L_0x0061
        L_0x007b:
            com.revenuecat.purchases.paywalls.components.TextComponent$$serializer r8 = com.revenuecat.purchases.paywalls.components.TextComponent$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r7, r8, r10)
            r3 = r3 | 2
            goto L_0x0061
        L_0x0084:
            com.revenuecat.purchases.paywalls.components.TextComponent$$serializer r8 = com.revenuecat.purchases.paywalls.components.TextComponent$$serializer.INSTANCE
            r15 = 0
            java.lang.Object r9 = r0.C(r1, r15, r8, r9)
            r3 = r3 | 1
            r8 = r15
            goto L_0x0046
        L_0x008f:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x0046
        L_0x0093:
            r7 = r3
            r8 = r9
            r3 = r10
            r5 = r11
            r4 = r12
            r2 = r13
        L_0x0099:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TimelineComponent$Item r0 = new com.revenuecat.purchases.paywalls.components.TimelineComponent$Item
            com.revenuecat.purchases.paywalls.components.TextComponent r8 = (com.revenuecat.purchases.paywalls.components.TextComponent) r8
            r9 = r3
            com.revenuecat.purchases.paywalls.components.TextComponent r9 = (com.revenuecat.purchases.paywalls.components.TextComponent) r9
            r10 = r5
            com.revenuecat.purchases.paywalls.components.IconComponent r10 = (com.revenuecat.purchases.paywalls.components.IconComponent) r10
            r11 = r4
            com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector r11 = (com.revenuecat.purchases.paywalls.components.TimelineComponent.Connector) r11
            r12 = r2
            java.util.List r12 = (java.util.List) r12
            r13 = 0
            r6 = r0
            r6.<init>((int) r7, (com.revenuecat.purchases.paywalls.components.TextComponent) r8, (com.revenuecat.purchases.paywalls.components.TextComponent) r9, (com.revenuecat.purchases.paywalls.components.IconComponent) r10, (com.revenuecat.purchases.paywalls.components.TimelineComponent.Connector) r11, (java.util.List) r12, (kh.t0) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TimelineComponent$Item$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TimelineComponent$Item");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TimelineComponent.Item item) {
        C6496s.h(fVar, "encoder");
        C6496s.h(item, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TimelineComponent.Item.write$Self(item, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
