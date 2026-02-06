package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabControlToggleComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TabControlToggleComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabControlToggleComponent$$serializer implements D {
    public static final TabControlToggleComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TabControlToggleComponent$$serializer tabControlToggleComponent$$serializer = new TabControlToggleComponent$$serializer();
        INSTANCE = tabControlToggleComponent$$serializer;
        C6458j0 j0Var = new C6458j0("tab_control_toggle", tabControlToggleComponent$$serializer, 5);
        j0Var.l("default_value", false);
        j0Var.l("thumb_color_on", false);
        j0Var.l("thumb_color_off", false);
        j0Var.l("track_color_on", false);
        j0Var.l("track_color_off", false);
        descriptor = j0Var;
    }

    private TabControlToggleComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        return new C5978b[]{C6455i.f71663a, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TabControlToggleComponent deserialize(jh.e r23) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r22.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x0038
            boolean r2 = r0.s(r1, r7)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r7, r8)
            java.lang.Object r5 = r0.C(r1, r5, r7, r8)
            java.lang.Object r3 = r0.C(r1, r3, r7, r8)
            java.lang.Object r4 = r0.C(r1, r4, r7, r8)
            r7 = 31
            r16 = r2
            r15 = r7
            goto L_0x008c
        L_0x0038:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r8 = r2
        L_0x003f:
            if (r13 == 0) goto L_0x0085
            int r14 = r0.o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0083
            if (r14 == 0) goto L_0x007c
            if (r14 == r6) goto L_0x0073
            if (r14 == r5) goto L_0x006a
            if (r14 == r3) goto L_0x0061
            if (r14 != r4) goto L_0x005b
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r12 = r0.C(r1, r4, r14, r12)
            r8 = r8 | 16
            goto L_0x003f
        L_0x005b:
            gh.p r0 = new gh.p
            r0.<init>((int) r14)
            throw r0
        L_0x0061:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r11 = r0.C(r1, r3, r14, r11)
            r8 = r8 | 8
            goto L_0x003f
        L_0x006a:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r10 = r0.C(r1, r5, r14, r10)
            r8 = r8 | 4
            goto L_0x003f
        L_0x0073:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r9 = r0.C(r1, r6, r14, r9)
            r8 = r8 | 2
            goto L_0x003f
        L_0x007c:
            boolean r2 = r0.s(r1, r7)
            r8 = r8 | 1
            goto L_0x003f
        L_0x0083:
            r13 = r7
            goto L_0x003f
        L_0x0085:
            r16 = r2
            r15 = r8
            r6 = r9
            r5 = r10
            r3 = r11
            r4 = r12
        L_0x008c:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TabControlToggleComponent r0 = new com.revenuecat.purchases.paywalls.components.TabControlToggleComponent
            r17 = r6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r17 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r17
            r18 = r5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r18 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r18
            r19 = r3
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r19
            r20 = r4
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r20 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r20
            r21 = 0
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TabControlToggleComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TabControlToggleComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TabControlToggleComponent tabControlToggleComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(tabControlToggleComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TabControlToggleComponent.write$Self(tabControlToggleComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
