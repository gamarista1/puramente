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
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTabsComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTabsComponent$$serializer implements D {
    public static final PartialTabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialTabsComponent$$serializer partialTabsComponent$$serializer = new PartialTabsComponent$$serializer();
        INSTANCE = partialTabsComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialTabsComponent", partialTabsComponent$$serializer, 9);
        j0Var.l("visible", true);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("background_color", true);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, true);
        j0Var.l("shape", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        descriptor = j0Var;
    }

    private PartialTabsComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PartialTabsComponent.$childSerializers;
        C5978b u10 = C5998a.u(C6455i.f71663a);
        C5978b u11 = C5998a.u(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer), C5998a.u(ColorScheme$$serializer.INSTANCE), C5998a.u(access$get$childSerializers$cp[5]), C5998a.u(access$get$childSerializers$cp[6]), C5998a.u(Border$$serializer.INSTANCE), C5998a.u(Shadow$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        r4 = 7;
        r6 = 8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialTabsComponent deserialize(jh.e r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r23.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.PartialTabsComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 7
            r5 = 3
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 6
            r10 = 5
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0061
            kh.i r3 = kh.C6455i.f71663a
            java.lang.Object r3 = r0.i(r1, r12, r3, r13)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r11 = r0.i(r1, r11, r12, r13)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r8, r12, r13)
            java.lang.Object r5 = r0.i(r1, r5, r12, r13)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r12, r13)
            r12 = r2[r10]
            java.lang.Object r10 = r0.i(r1, r10, r12, r13)
            r2 = r2[r9]
            java.lang.Object r2 = r0.i(r1, r9, r2, r13)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r9, r13)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r9, r13)
            r9 = 511(0x1ff, float:7.16E-43)
            r22 = r10
            r10 = r9
            r9 = r22
            goto L_0x00f2
        L_0x0061:
            r21 = r11
            r3 = r12
            r5 = r13
            r7 = r5
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x006c:
            if (r21 == 0) goto L_0x00e8
            int r9 = r0.o(r1)
            switch(r9) {
                case -1: goto L_0x00e3;
                case 0: goto L_0x00d7;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00a7;
                case 5: goto L_0x0099;
                case 6: goto L_0x008e;
                case 7: goto L_0x0085;
                case 8: goto L_0x007b;
                default: goto L_0x0075;
            }
        L_0x0075:
            gh.p r0 = new gh.p
            r0.<init>((int) r9)
            throw r0
        L_0x007b:
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r6, r9, r10)
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x0083:
            r9 = 6
            goto L_0x006c
        L_0x0085:
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r4, r9, r7)
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x0083
        L_0x008e:
            r9 = 6
            r4 = r2[r9]
            java.lang.Object r5 = r0.i(r1, r9, r4, r5)
            r3 = r3 | 64
        L_0x0097:
            r4 = 7
            goto L_0x006c
        L_0x0099:
            r4 = 5
            r9 = 6
            r6 = r2[r4]
            java.lang.Object r8 = r0.i(r1, r4, r6, r8)
            r3 = r3 | 32
        L_0x00a3:
            r4 = 7
            r6 = 8
            goto L_0x006c
        L_0x00a7:
            r4 = 5
            r9 = 6
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r6 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r11 = r0.i(r1, r4, r6, r11)
            r3 = r3 | 16
            goto L_0x00a3
        L_0x00b3:
            r4 = 4
            r9 = 6
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r6 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r4 = 3
            java.lang.Object r12 = r0.i(r1, r4, r6, r12)
            r3 = r3 | 8
            goto L_0x00a3
        L_0x00bf:
            r4 = 3
            r9 = 6
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r6 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r15 = r0.i(r1, r4, r6, r15)
            r3 = r3 | 4
            goto L_0x00a3
        L_0x00cb:
            r4 = 2
            r9 = 6
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r6 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r14 = r0.i(r1, r4, r6, r14)
            r3 = r3 | 2
            goto L_0x00a3
        L_0x00d7:
            r4 = 1
            r9 = 6
            kh.i r6 = kh.C6455i.f71663a
            r4 = 0
            java.lang.Object r13 = r0.i(r1, r4, r6, r13)
            r3 = r3 | 1
            goto L_0x00a3
        L_0x00e3:
            r4 = 0
            r9 = 6
            r21 = r4
            goto L_0x0097
        L_0x00e8:
            r2 = r5
            r4 = r7
            r9 = r8
            r6 = r10
            r7 = r11
            r5 = r12
            r11 = r14
            r8 = r15
            r10 = r3
            r3 = r13
        L_0x00f2:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialTabsComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialTabsComponent
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r12 = r11
            com.revenuecat.purchases.paywalls.components.properties.Size r12 = (com.revenuecat.purchases.paywalls.components.properties.Size) r12
            r13 = r8
            com.revenuecat.purchases.paywalls.components.properties.Padding r13 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r13
            r14 = r5
            com.revenuecat.purchases.paywalls.components.properties.Padding r14 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r14
            r15 = r7
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r15 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r15
            r16 = r9
            com.revenuecat.purchases.paywalls.components.common.Background r16 = (com.revenuecat.purchases.paywalls.components.common.Background) r16
            r17 = r2
            com.revenuecat.purchases.paywalls.components.properties.Shape r17 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r17
            r18 = r4
            com.revenuecat.purchases.paywalls.components.properties.Border r18 = (com.revenuecat.purchases.paywalls.components.properties.Border) r18
            r19 = r6
            com.revenuecat.purchases.paywalls.components.properties.Shadow r19 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r19
            r20 = 0
            r9 = r0
            r11 = r1
            r9.<init>((int) r10, (java.lang.Boolean) r11, (com.revenuecat.purchases.paywalls.components.properties.Size) r12, (com.revenuecat.purchases.paywalls.components.properties.Padding) r13, (com.revenuecat.purchases.paywalls.components.properties.Padding) r14, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r15, (com.revenuecat.purchases.paywalls.components.common.Background) r16, (com.revenuecat.purchases.paywalls.components.properties.Shape) r17, (com.revenuecat.purchases.paywalls.components.properties.Border) r18, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r19, (kh.t0) r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTabsComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialTabsComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialTabsComponent partialTabsComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialTabsComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialTabsComponent.write$Self(partialTabsComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
