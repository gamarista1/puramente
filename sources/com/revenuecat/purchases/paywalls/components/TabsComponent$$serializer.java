package com.revenuecat.purchases.paywalls.components;

import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabsComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TabsComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabsComponent$$serializer implements D {
    public static final TabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TabsComponent$$serializer tabsComponent$$serializer = new TabsComponent$$serializer();
        INSTANCE = tabsComponent$$serializer;
        C6458j0 j0Var = new C6458j0("tabs", tabsComponent$$serializer, 11);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("background_color", true);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, true);
        j0Var.l("shape", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        j0Var.l("control", false);
        j0Var.l("tabs", false);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private TabsComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = TabsComponent.$childSerializers;
        C5978b u10 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u11 = C5998a.u(access$get$childSerializers$cp[4]);
        C5978b u12 = C5998a.u(access$get$childSerializers$cp[5]);
        C5978b u13 = C5998a.u(Border$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(Shadow$$serializer.INSTANCE);
        C5978b bVar = access$get$childSerializers$cp[8];
        C5978b bVar2 = access$get$childSerializers$cp[9];
        C5978b bVar3 = access$get$childSerializers$cp[10];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, u10, u11, u12, u13, u14, bVar, bVar2, bVar3};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TabsComponent deserialize(jh.e r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r25.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.TabsComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 7
            r5 = 6
            r6 = 3
            r7 = 2
            r8 = 10
            r9 = 9
            r10 = 5
            r11 = 8
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0072
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r14, r3, r15)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r13, r14, r15)
            java.lang.Object r7 = r0.C(r1, r7, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r14, r15)
            r14 = r2[r12]
            java.lang.Object r12 = r0.i(r1, r12, r14, r15)
            r14 = r2[r10]
            java.lang.Object r10 = r0.i(r1, r10, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r14, r15)
            r14 = r2[r11]
            java.lang.Object r11 = r0.C(r1, r11, r14, r15)
            r14 = r2[r9]
            java.lang.Object r9 = r0.C(r1, r9, r14, r15)
            r2 = r2[r8]
            java.lang.Object r2 = r0.C(r1, r8, r2, r15)
            r8 = 2047(0x7ff, float:2.868E-42)
            r24 = r9
            r9 = r8
            r8 = r11
            r11 = r24
            goto L_0x0143
        L_0x0072:
            r22 = r13
            r3 = r14
            r4 = r15
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x007f:
            if (r22 == 0) goto L_0x0134
            int r8 = r0.o(r1)
            switch(r8) {
                case -1: goto L_0x0128;
                case 0: goto L_0x0115;
                case 1: goto L_0x0108;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00ee;
                case 4: goto L_0x00e2;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00c9;
                case 7: goto L_0x00bb;
                case 8: goto L_0x00ae;
                case 9: goto L_0x009d;
                case 10: goto L_0x008e;
                default: goto L_0x0088;
            }
        L_0x0088:
            gh.p r0 = new gh.p
            r0.<init>((int) r8)
            throw r0
        L_0x008e:
            r23 = r15
            r8 = 10
            r15 = r2[r8]
            java.lang.Object r9 = r0.C(r1, r8, r15, r9)
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r15 = r23
            goto L_0x007f
        L_0x009d:
            r23 = r15
            r15 = 9
            r8 = r2[r15]
            java.lang.Object r11 = r0.C(r1, r15, r8, r11)
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x00a9:
            r15 = r23
        L_0x00ab:
            r8 = 10
            goto L_0x007f
        L_0x00ae:
            r23 = r15
            r8 = 8
            r15 = r2[r8]
            java.lang.Object r4 = r0.C(r1, r8, r15, r4)
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x00a9
        L_0x00bb:
            r23 = r15
            r8 = 8
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r8 = 7
            java.lang.Object r5 = r0.i(r1, r8, r15, r5)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00a9
        L_0x00c9:
            r23 = r15
            r8 = 7
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r8 = 6
            java.lang.Object r10 = r0.i(r1, r8, r15, r10)
            r3 = r3 | 64
            goto L_0x00a9
        L_0x00d6:
            r23 = r15
            r15 = 5
            r8 = r2[r15]
            java.lang.Object r12 = r0.i(r1, r15, r8, r12)
            r3 = r3 | 32
            goto L_0x00a9
        L_0x00e2:
            r23 = r15
            r8 = 4
            r15 = r2[r8]
            java.lang.Object r6 = r0.i(r1, r8, r15, r6)
            r3 = r3 | 16
            goto L_0x00a9
        L_0x00ee:
            r23 = r15
            r8 = 4
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r8 = 3
            java.lang.Object r7 = r0.i(r1, r8, r15, r7)
            r3 = r3 | 8
            goto L_0x00a9
        L_0x00fb:
            r23 = r15
            r8 = 3
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 2
            java.lang.Object r13 = r0.C(r1, r8, r15, r13)
            r3 = r3 | 4
            goto L_0x00a9
        L_0x0108:
            r23 = r15
            r8 = 2
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 1
            java.lang.Object r14 = r0.C(r1, r8, r15, r14)
            r3 = r3 | 2
            goto L_0x00a9
        L_0x0115:
            r23 = r15
            r8 = 1
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r26 = r2
            r2 = r23
            r8 = 0
            java.lang.Object r15 = r0.C(r1, r8, r15, r2)
            r3 = r3 | 1
            r2 = r26
            goto L_0x00ab
        L_0x0128:
            r26 = r2
            r2 = r15
            r8 = 0
            r22 = r8
            r8 = 10
            r2 = r26
            goto L_0x007f
        L_0x0134:
            r2 = r15
            r8 = r4
            r4 = r5
            r5 = r10
            r10 = r12
            r12 = r6
            r6 = r7
            r7 = r13
            r13 = r14
            r24 = r3
            r3 = r2
            r2 = r9
            r9 = r24
        L_0x0143:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TabsComponent r0 = new com.revenuecat.purchases.paywalls.components.TabsComponent
            r1 = r3
            com.revenuecat.purchases.paywalls.components.properties.Size r1 = (com.revenuecat.purchases.paywalls.components.properties.Size) r1
            r3 = r13
            com.revenuecat.purchases.paywalls.components.properties.Padding r3 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r3
            com.revenuecat.purchases.paywalls.components.properties.Padding r7 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r7
            r13 = r6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r13 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r13
            r14 = r12
            com.revenuecat.purchases.paywalls.components.common.Background r14 = (com.revenuecat.purchases.paywalls.components.common.Background) r14
            r15 = r10
            com.revenuecat.purchases.paywalls.components.properties.Shape r15 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r15
            r16 = r5
            com.revenuecat.purchases.paywalls.components.properties.Border r16 = (com.revenuecat.purchases.paywalls.components.properties.Border) r16
            r17 = r4
            com.revenuecat.purchases.paywalls.components.properties.Shadow r17 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r17
            r18 = r8
            com.revenuecat.purchases.paywalls.components.TabsComponent$TabControl r18 = (com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl) r18
            r19 = r11
            java.util.List r19 = (java.util.List) r19
            r20 = r2
            java.util.List r20 = (java.util.List) r20
            r21 = 0
            r8 = r0
            r10 = r1
            r11 = r3
            r12 = r7
            r8.<init>((int) r9, (com.revenuecat.purchases.paywalls.components.properties.Size) r10, (com.revenuecat.purchases.paywalls.components.properties.Padding) r11, (com.revenuecat.purchases.paywalls.components.properties.Padding) r12, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r13, (com.revenuecat.purchases.paywalls.components.common.Background) r14, (com.revenuecat.purchases.paywalls.components.properties.Shape) r15, (com.revenuecat.purchases.paywalls.components.properties.Border) r16, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r17, (com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl) r18, (java.util.List) r19, (java.util.List) r20, (kh.t0) r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TabsComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TabsComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TabsComponent tabsComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(tabsComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TabsComponent.write$Self(tabsComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
