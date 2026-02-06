package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.Connector.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Connector;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimelineComponent$Connector$$serializer implements D {
    public static final TimelineComponent$Connector$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TimelineComponent$Connector$$serializer timelineComponent$Connector$$serializer = new TimelineComponent$Connector$$serializer();
        INSTANCE = timelineComponent$Connector$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Connector", timelineComponent$Connector$$serializer, 3);
        j0Var.l(Snapshot.WIDTH, false);
        j0Var.l("margin", false);
        j0Var.l("color", false);
        descriptor = j0Var;
    }

    private TimelineComponent$Connector$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{I.f71604a, Padding$$serializer.INSTANCE, ColorScheme$$serializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TimelineComponent.Connector deserialize(jh.e r17) {
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
            if (r2 == 0) goto L_0x002d
            int r2 = r0.E(r1, r5)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r4 = r0.C(r1, r4, r5, r6)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r3, r5, r6)
            r5 = 7
            r12 = r2
            r11 = r5
            goto L_0x0066
        L_0x002d:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
            r6 = r2
        L_0x0032:
            if (r9 == 0) goto L_0x0062
            int r10 = r0.o(r1)
            r11 = -1
            if (r10 == r11) goto L_0x0060
            if (r10 == 0) goto L_0x0059
            if (r10 == r4) goto L_0x0050
            if (r10 != r3) goto L_0x004a
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r10 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r3, r10, r8)
            r6 = r6 | 4
            goto L_0x0032
        L_0x004a:
            gh.p r0 = new gh.p
            r0.<init>((int) r10)
            throw r0
        L_0x0050:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r10 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r4, r10, r7)
            r6 = r6 | 2
            goto L_0x0032
        L_0x0059:
            int r2 = r0.E(r1, r5)
            r6 = r6 | 1
            goto L_0x0032
        L_0x0060:
            r9 = r5
            goto L_0x0032
        L_0x0062:
            r12 = r2
            r11 = r6
            r4 = r7
            r3 = r8
        L_0x0066:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector r0 = new com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector
            r13 = r4
            com.revenuecat.purchases.paywalls.components.properties.Padding r13 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r13
            r14 = r3
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r14 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r14
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TimelineComponent$Connector");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TimelineComponent.Connector connector) {
        C6496s.h(fVar, "encoder");
        C6496s.h(connector, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TimelineComponent.Connector.write$Self(connector, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
