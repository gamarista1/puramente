package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/IconComponent.IconBackground.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/IconComponent$IconBackground;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IconComponent$IconBackground$$serializer implements D {
    public static final IconComponent$IconBackground$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        IconComponent$IconBackground$$serializer iconComponent$IconBackground$$serializer = new IconComponent$IconBackground$$serializer();
        INSTANCE = iconComponent$IconBackground$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground", iconComponent$IconBackground$$serializer, 4);
        j0Var.l("color", false);
        j0Var.l("shape", false);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        descriptor = j0Var;
    }

    private IconComponent$IconBackground$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ColorScheme$$serializer.INSTANCE, IconComponent.IconBackground.$childSerializers[1], C5998a.u(Border$$serializer.INSTANCE), C5998a.u(Shadow$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground deserialize(jh.e r15) {
        /*
            r14 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            ih.f r0 = r14.getDescriptor()
            jh.c r15 = r15.b(r0)
            gh.b[] r1 = com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground.$childSerializers
            boolean r2 = r15.p()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0038
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r2 = r15.C(r0, r6, r2, r7)
            r1 = r1[r5]
            java.lang.Object r1 = r15.C(r0, r5, r1, r7)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r4 = r15.i(r0, r4, r5, r7)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r3 = r15.i(r0, r3, r5, r7)
            r5 = 15
            r6 = r5
            goto L_0x007f
        L_0x0038:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x003d:
            if (r11 == 0) goto L_0x007a
            int r12 = r15.o(r0)
            r13 = -1
            if (r12 == r13) goto L_0x0078
            if (r12 == 0) goto L_0x006f
            if (r12 == r5) goto L_0x0066
            if (r12 == r4) goto L_0x005d
            if (r12 != r3) goto L_0x0057
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r10 = r15.i(r0, r3, r12, r10)
            r2 = r2 | 8
            goto L_0x003d
        L_0x0057:
            gh.p r15 = new gh.p
            r15.<init>((int) r12)
            throw r15
        L_0x005d:
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r9 = r15.i(r0, r4, r12, r9)
            r2 = r2 | 4
            goto L_0x003d
        L_0x0066:
            r12 = r1[r5]
            java.lang.Object r8 = r15.C(r0, r5, r12, r8)
            r2 = r2 | 2
            goto L_0x003d
        L_0x006f:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r7 = r15.C(r0, r6, r12, r7)
            r2 = r2 | 1
            goto L_0x003d
        L_0x0078:
            r11 = r6
            goto L_0x003d
        L_0x007a:
            r6 = r2
            r2 = r7
            r1 = r8
            r4 = r9
            r3 = r10
        L_0x007f:
            r15.c(r0)
            com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground r15 = new com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground
            r7 = r2
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r7 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r7
            r8 = r1
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r8 = (com.revenuecat.purchases.paywalls.components.properties.MaskShape) r8
            r9 = r4
            com.revenuecat.purchases.paywalls.components.properties.Border r9 = (com.revenuecat.purchases.paywalls.components.properties.Border) r9
            r10 = r3
            com.revenuecat.purchases.paywalls.components.properties.Shadow r10 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r10
            r11 = 0
            r5 = r15
            r5.<init>((int) r6, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r7, (com.revenuecat.purchases.paywalls.components.properties.MaskShape) r8, (com.revenuecat.purchases.paywalls.components.properties.Border) r9, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r10, (kh.t0) r11)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, IconComponent.IconBackground iconBackground) {
        C6496s.h(fVar, "encoder");
        C6496s.h(iconBackground, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        IconComponent.IconBackground.write$Self(iconBackground, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
