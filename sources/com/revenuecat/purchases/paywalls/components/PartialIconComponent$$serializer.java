package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialIconComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialIconComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialIconComponent$$serializer implements D {
    public static final PartialIconComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialIconComponent$$serializer partialIconComponent$$serializer = new PartialIconComponent$$serializer();
        INSTANCE = partialIconComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialIconComponent", partialIconComponent$$serializer, 9);
        j0Var.l("visible", true);
        j0Var.l("base_url", true);
        j0Var.l("icon_name", true);
        j0Var.l("formats", true);
        j0Var.l("size", true);
        j0Var.l("color", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("icon_background", true);
        descriptor = j0Var;
    }

    private PartialIconComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b u10 = C5998a.u(C6455i.f71663a);
        x0 x0Var = x0.f71726a;
        C5978b u11 = C5998a.u(x0Var);
        C5978b u12 = C5998a.u(x0Var);
        C5978b u13 = C5998a.u(IconComponent$Formats$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(Size$$serializer.INSTANCE);
        C5978b u15 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, u12, u13, u14, u15, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer), C5998a.u(IconComponent$IconBackground$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialIconComponent deserialize(jh.e r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r24.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0057
            kh.i r2 = kh.C6455i.f71663a
            java.lang.Object r2 = r0.i(r1, r11, r2, r12)
            kh.x0 r11 = kh.x0.f71726a
            java.lang.Object r10 = r0.i(r1, r10, r11, r12)
            java.lang.Object r9 = r0.i(r1, r9, r11, r12)
            com.revenuecat.purchases.paywalls.components.IconComponent$Formats$$serializer r11 = com.revenuecat.purchases.paywalls.components.IconComponent$Formats$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r11, r12)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r8, r11, r12)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r11, r12)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r11, r12)
            java.lang.Object r3 = r0.i(r1, r3, r11, r12)
            com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground$$serializer r11 = com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r11, r12)
            r11 = 511(0x1ff, float:7.16E-43)
            r12 = r11
            goto L_0x00e2
        L_0x0057:
            r20 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0062:
            if (r20 == 0) goto L_0x00d5
            int r5 = r0.o(r1)
            switch(r5) {
                case -1: goto L_0x00d1;
                case 0: goto L_0x00c6;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a5;
                case 4: goto L_0x0099;
                case 5: goto L_0x008d;
                case 6: goto L_0x0084;
                case 7: goto L_0x007b;
                case 8: goto L_0x0071;
                default: goto L_0x006b;
            }
        L_0x006b:
            gh.p r0 = new gh.p
            r0.<init>((int) r5)
            throw r0
        L_0x0071:
            com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground$$serializer r5 = com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r7, r5, r8)
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x0079:
            r5 = 5
            goto L_0x0062
        L_0x007b:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r3, r5, r6)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0079
        L_0x0084:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r4, r5, r9)
            r2 = r2 | 64
            goto L_0x0079
        L_0x008d:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r3 = 5
            java.lang.Object r10 = r0.i(r1, r3, r5, r10)
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x0062
        L_0x0099:
            r3 = 5
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r3 = 4
            java.lang.Object r11 = r0.i(r1, r3, r5, r11)
            r2 = r2 | 16
        L_0x00a3:
            r3 = 7
            goto L_0x0079
        L_0x00a5:
            r3 = 4
            com.revenuecat.purchases.paywalls.components.IconComponent$Formats$$serializer r5 = com.revenuecat.purchases.paywalls.components.IconComponent$Formats$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r15 = r0.i(r1, r3, r5, r15)
            r2 = r2 | 8
            goto L_0x00a3
        L_0x00b0:
            r3 = 3
            kh.x0 r5 = kh.x0.f71726a
            r3 = 2
            java.lang.Object r14 = r0.i(r1, r3, r5, r14)
            r2 = r2 | 4
            goto L_0x00a3
        L_0x00bb:
            r3 = 2
            kh.x0 r5 = kh.x0.f71726a
            r3 = 1
            java.lang.Object r13 = r0.i(r1, r3, r5, r13)
            r2 = r2 | 2
            goto L_0x00a3
        L_0x00c6:
            r3 = 1
            kh.i r5 = kh.C6455i.f71663a
            r3 = 0
            java.lang.Object r12 = r0.i(r1, r3, r5, r12)
            r2 = r2 | 1
            goto L_0x00a3
        L_0x00d1:
            r3 = 0
            r20 = r3
            goto L_0x00a3
        L_0x00d5:
            r3 = r6
            r7 = r8
            r4 = r9
            r5 = r10
            r8 = r11
            r10 = r13
            r9 = r14
            r6 = r15
            r23 = r12
            r12 = r2
            r2 = r23
        L_0x00e2:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialIconComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialIconComponent
            r13 = r2
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r14 = r10
            java.lang.String r14 = (java.lang.String) r14
            r15 = r9
            java.lang.String r15 = (java.lang.String) r15
            r16 = r6
            com.revenuecat.purchases.paywalls.components.IconComponent$Formats r16 = (com.revenuecat.purchases.paywalls.components.IconComponent.Formats) r16
            r17 = r8
            com.revenuecat.purchases.paywalls.components.properties.Size r17 = (com.revenuecat.purchases.paywalls.components.properties.Size) r17
            r18 = r5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r18 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r18
            r19 = r4
            com.revenuecat.purchases.paywalls.components.properties.Padding r19 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r19
            r20 = r3
            com.revenuecat.purchases.paywalls.components.properties.Padding r20 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r20
            r21 = r7
            com.revenuecat.purchases.paywalls.components.IconComponent$IconBackground r21 = (com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground) r21
            r22 = 0
            r11 = r0
            r11.<init>((int) r12, (java.lang.Boolean) r13, (java.lang.String) r14, (java.lang.String) r15, (com.revenuecat.purchases.paywalls.components.IconComponent.Formats) r16, (com.revenuecat.purchases.paywalls.components.properties.Size) r17, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r18, (com.revenuecat.purchases.paywalls.components.properties.Padding) r19, (com.revenuecat.purchases.paywalls.components.properties.Padding) r20, (com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground) r21, (kh.t0) r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialIconComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialIconComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialIconComponent partialIconComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialIconComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialIconComponent.write$Self(partialIconComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
