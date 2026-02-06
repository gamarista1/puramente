package com.revenuecat.purchases.paywalls.components;

import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.PageControl.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponent$PageControl$$serializer implements D {
    public static final CarouselComponent$PageControl$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CarouselComponent$PageControl$$serializer carouselComponent$PageControl$$serializer = new CarouselComponent$PageControl$$serializer();
        INSTANCE = carouselComponent$PageControl$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl", carouselComponent$PageControl$$serializer, 10);
        j0Var.l("position", false);
        j0Var.l("spacing", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("background_color", true);
        j0Var.l("shape", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        j0Var.l(AppStateModule.APP_STATE_ACTIVE, false);
        j0Var.l("default", false);
        descriptor = j0Var;
    }

    private CarouselComponent$PageControl$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = CarouselComponent.PageControl.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[0];
        C5978b u10 = C5998a.u(I.f71604a);
        C5978b u11 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u12 = C5998a.u(access$get$childSerializers$cp[5]);
        C5978b u13 = C5998a.u(Border$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(Shadow$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
        return new C5978b[]{bVar, u10, padding$$serializer, padding$$serializer, u11, u12, u13, u14, carouselComponent$PageControl$Indicator$$serializer, carouselComponent$PageControl$Indicator$$serializer};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl deserialize(jh.e r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r24.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.$childSerializers
            boolean r3 = r0.p()
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 5
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0064
            r3 = r2[r13]
            java.lang.Object r3 = r0.C(r1, r13, r3, r14)
            kh.I r13 = kh.I.f71604a
            java.lang.Object r12 = r0.i(r1, r12, r13, r14)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r10 = r0.C(r1, r10, r13, r14)
            java.lang.Object r7 = r0.C(r1, r7, r13, r14)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r9, r13, r14)
            r2 = r2[r11]
            java.lang.Object r2 = r0.i(r1, r11, r2, r14)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r11, r14)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r11, r14)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer r11 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r8, r11, r14)
            java.lang.Object r4 = r0.C(r1, r4, r11, r14)
            r11 = 1023(0x3ff, float:1.434E-42)
            r15 = r12
            r12 = r11
            goto L_0x00ff
        L_0x0064:
            r23 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
        L_0x0070:
            if (r23 == 0) goto L_0x00f5
            int r8 = r0.o(r1)
            switch(r8) {
                case -1: goto L_0x00f1;
                case 0: goto L_0x00e7;
                case 1: goto L_0x00dc;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00bb;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00a6;
                case 7: goto L_0x0098;
                case 8: goto L_0x008a;
                case 9: goto L_0x007f;
                default: goto L_0x0079;
            }
        L_0x0079:
            gh.p r0 = new gh.p
            r0.<init>((int) r8)
            throw r0
        L_0x007f:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer r8 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r4, r8, r5)
            r3 = r3 | 512(0x200, float:7.175E-43)
        L_0x0087:
            r8 = 8
            goto L_0x0070
        L_0x008a:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer r8 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator$$serializer.INSTANCE
            r4 = 8
            java.lang.Object r6 = r0.C(r1, r4, r8, r6)
            r3 = r3 | 256(0x100, float:3.59E-43)
            r8 = r4
            r4 = 9
            goto L_0x0070
        L_0x0098:
            r4 = 8
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r8 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r4 = 7
            java.lang.Object r11 = r0.i(r1, r4, r8, r11)
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x00a3:
            r4 = 9
            goto L_0x0087
        L_0x00a6:
            r4 = 7
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r8 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r4 = 6
            java.lang.Object r9 = r0.i(r1, r4, r8, r9)
            r3 = r3 | 64
            goto L_0x00a3
        L_0x00b1:
            r8 = 5
            r4 = r2[r8]
            java.lang.Object r7 = r0.i(r1, r8, r4, r7)
            r3 = r3 | 32
            goto L_0x00a3
        L_0x00bb:
            r8 = 5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r8 = 4
            java.lang.Object r10 = r0.i(r1, r8, r4, r10)
            r3 = r3 | 16
            goto L_0x00a3
        L_0x00c6:
            r8 = 4
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 3
            java.lang.Object r12 = r0.C(r1, r8, r4, r12)
            r3 = r3 | 8
            goto L_0x00a3
        L_0x00d1:
            r8 = 3
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 2
            java.lang.Object r13 = r0.C(r1, r8, r4, r13)
            r3 = r3 | 4
            goto L_0x00a3
        L_0x00dc:
            r8 = 2
            kh.I r4 = kh.I.f71604a
            r8 = 1
            java.lang.Object r15 = r0.i(r1, r8, r4, r15)
            r3 = r3 | 2
            goto L_0x00a3
        L_0x00e7:
            r4 = 0
            r8 = r2[r4]
            java.lang.Object r14 = r0.C(r1, r4, r8, r14)
            r3 = r3 | 1
            goto L_0x00a3
        L_0x00f1:
            r4 = 0
            r23 = r4
            goto L_0x00a3
        L_0x00f5:
            r4 = r5
            r8 = r6
            r2 = r7
            r6 = r9
            r9 = r10
            r5 = r11
            r7 = r12
            r10 = r13
            r12 = r3
            r3 = r14
        L_0x00ff:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl r0 = new com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl
            r13 = r3
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Position r13 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Position) r13
            r14 = r15
            java.lang.Integer r14 = (java.lang.Integer) r14
            r15 = r10
            com.revenuecat.purchases.paywalls.components.properties.Padding r15 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r15
            r16 = r7
            com.revenuecat.purchases.paywalls.components.properties.Padding r16 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r16
            r17 = r9
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r17 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r17
            r18 = r2
            com.revenuecat.purchases.paywalls.components.properties.Shape r18 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r18
            r19 = r6
            com.revenuecat.purchases.paywalls.components.properties.Border r19 = (com.revenuecat.purchases.paywalls.components.properties.Border) r19
            r20 = r5
            com.revenuecat.purchases.paywalls.components.properties.Shadow r20 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r20
            r21 = r8
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator r21 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator) r21
            r22 = r4
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$Indicator r22 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator) r22
            r23 = 0
            r11 = r0
            r11.<init>((int) r12, (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Position) r13, (java.lang.Integer) r14, (com.revenuecat.purchases.paywalls.components.properties.Padding) r15, (com.revenuecat.purchases.paywalls.components.properties.Padding) r16, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r17, (com.revenuecat.purchases.paywalls.components.properties.Shape) r18, (com.revenuecat.purchases.paywalls.components.properties.Border) r19, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r20, (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator) r21, (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator) r22, (kh.t0) r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CarouselComponent.PageControl pageControl) {
        C6496s.h(fVar, "encoder");
        C6496s.h(pageControl, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CarouselComponent.PageControl.write$Self(pageControl, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
