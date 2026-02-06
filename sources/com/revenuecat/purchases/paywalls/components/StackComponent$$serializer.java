package com.revenuecat.purchases.paywalls.components;

import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import io.intercom.android.sdk.metrics.MetricTracker;
import jh.d;
import kh.C;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/StackComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StackComponent$$serializer implements D {
    public static final StackComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        C6458j0 j0Var = new C6458j0("stack", stackComponent$$serializer, 14);
        j0Var.l("components", false);
        j0Var.l("dimension", true);
        j0Var.l("size", true);
        j0Var.l("spacing", true);
        j0Var.l("background_color", true);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("shape", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        j0Var.l(MetricTracker.Object.BADGE, true);
        j0Var.l("overflow", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private StackComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = StackComponent.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[0];
        C5978b bVar2 = access$get$childSerializers$cp[1];
        C5978b u10 = C5998a.u(C.f71587a);
        C5978b u11 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u12 = C5998a.u(access$get$childSerializers$cp[5]);
        C5978b u13 = C5998a.u(access$get$childSerializers$cp[8]);
        C5978b u14 = C5998a.u(Border$$serializer.INSTANCE);
        C5978b u15 = C5998a.u(Shadow$$serializer.INSTANCE);
        C5978b u16 = C5998a.u(Badge$$serializer.INSTANCE);
        C5978b u17 = C5998a.u(access$get$childSerializers$cp[12]);
        C5978b bVar3 = access$get$childSerializers$cp[13];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{bVar, bVar2, Size$$serializer.INSTANCE, u10, u11, u12, padding$$serializer, padding$$serializer, u13, u14, u15, u16, u17, bVar3};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00de, code lost:
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e0, code lost:
        r12 = r33;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.StackComponent deserialize(jh.e r36) {
        /*
            r35 = this;
            r0 = r36
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r35.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.StackComponent.$childSerializers
            boolean r3 = r0.p()
            r5 = 10
            r6 = 9
            r7 = 7
            r8 = 6
            r9 = 3
            r10 = 4
            r11 = 2
            r14 = 5
            r15 = 8
            r12 = 1
            r13 = 0
            r4 = 0
            if (r3 == 0) goto L_0x0091
            r3 = r2[r13]
            java.lang.Object r3 = r0.C(r1, r13, r3, r4)
            r13 = r2[r12]
            java.lang.Object r12 = r0.C(r1, r12, r13, r4)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r11 = r0.C(r1, r11, r13, r4)
            kh.C r13 = kh.C.f71587a
            java.lang.Object r9 = r0.i(r1, r9, r13, r4)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r10, r13, r4)
            r13 = r2[r14]
            java.lang.Object r13 = r0.i(r1, r14, r13, r4)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r8, r14, r4)
            java.lang.Object r7 = r0.C(r1, r7, r14, r4)
            r14 = r2[r15]
            java.lang.Object r14 = r0.i(r1, r15, r14, r4)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r15, r4)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r15, r4)
            com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer.INSTANCE
            r18 = r3
            r3 = 11
            java.lang.Object r3 = r0.i(r1, r3, r15, r4)
            r16 = r3
            r15 = 12
            r3 = r2[r15]
            java.lang.Object r3 = r0.i(r1, r15, r3, r4)
            r15 = 13
            r2 = r2[r15]
            java.lang.Object r2 = r0.C(r1, r15, r2, r4)
            r4 = 16383(0x3fff, float:2.2957E-41)
            r34 = r12
            r12 = r3
            r3 = r18
            r18 = r4
            r4 = r34
            goto L_0x020c
        L_0x0091:
            r3 = 13
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r14 = r11
            r15 = r14
            r19 = r15
            r29 = r19
            r30 = r29
            r31 = r12
            r12 = r30
            r4 = r13
            r13 = r12
        L_0x00a8:
            if (r31 == 0) goto L_0x01ee
            int r3 = r0.o(r1)
            switch(r3) {
                case -1: goto L_0x01d5;
                case 0: goto L_0x01ba;
                case 1: goto L_0x01a2;
                case 2: goto L_0x0187;
                case 3: goto L_0x0175;
                case 4: goto L_0x0163;
                case 5: goto L_0x0152;
                case 6: goto L_0x0141;
                case 7: goto L_0x012f;
                case 8: goto L_0x011e;
                case 9: goto L_0x010b;
                case 10: goto L_0x00f8;
                case 11: goto L_0x00e5;
                case 12: goto L_0x00cc;
                case 13: goto L_0x00b7;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            gh.p r0 = new gh.p
            r0.<init>((int) r3)
            throw r0
        L_0x00b7:
            r32 = r13
            r3 = 13
            r13 = r2[r3]
            r33 = r12
            r12 = r30
            java.lang.Object r30 = r0.C(r1, r3, r13, r12)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r13 = r32
            r12 = r33
            goto L_0x00a8
        L_0x00cc:
            r33 = r12
            r32 = r13
            r12 = r30
            r13 = 12
            r3 = r2[r13]
            r12 = r29
            java.lang.Object r29 = r0.i(r1, r13, r3, r12)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x00de:
            r13 = r32
        L_0x00e0:
            r12 = r33
        L_0x00e2:
            r3 = 13
            goto L_0x00a8
        L_0x00e5:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 12
            com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer.INSTANCE
            r13 = 11
            java.lang.Object r5 = r0.i(r1, r13, r3, r5)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            goto L_0x00de
        L_0x00f8:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 11
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r13 = 10
            java.lang.Object r6 = r0.i(r1, r13, r3, r6)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x00de
        L_0x010b:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 10
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r13 = 9
            java.lang.Object r15 = r0.i(r1, r13, r3, r15)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x00de
        L_0x011e:
            r33 = r12
            r32 = r13
            r12 = r29
            r3 = 8
            r13 = r2[r3]
            java.lang.Object r7 = r0.i(r1, r3, r13, r7)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x00de
        L_0x012f:
            r33 = r12
            r32 = r13
            r12 = r29
            r3 = 8
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r3 = 7
            java.lang.Object r8 = r0.C(r1, r3, r13, r8)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x00de
        L_0x0141:
            r33 = r12
            r32 = r13
            r12 = r29
            r3 = 7
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r13 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r3 = 6
            java.lang.Object r14 = r0.C(r1, r3, r13, r14)
            r4 = r4 | 64
            goto L_0x00de
        L_0x0152:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 5
            r3 = r2[r13]
            java.lang.Object r10 = r0.i(r1, r13, r3, r10)
            r4 = r4 | 32
            goto L_0x00de
        L_0x0163:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r13 = 4
            java.lang.Object r9 = r0.i(r1, r13, r3, r9)
            r4 = r4 | 16
            goto L_0x00de
        L_0x0175:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 4
            kh.C r3 = kh.C.f71587a
            r13 = 3
            java.lang.Object r11 = r0.i(r1, r13, r3, r11)
            r4 = r4 | 8
            goto L_0x00de
        L_0x0187:
            r33 = r12
            r32 = r13
            r12 = r29
            r13 = 3
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r20 = r5
            r5 = r33
            r13 = 2
            java.lang.Object r3 = r0.C(r1, r13, r3, r5)
            r4 = r4 | 4
            r5 = r20
            r13 = r32
            r12 = r3
            goto L_0x00e2
        L_0x01a2:
            r20 = r5
            r5 = r12
            r32 = r13
            r12 = r29
            r3 = 1
            r13 = r2[r3]
            r33 = r5
            r5 = r32
            java.lang.Object r13 = r0.C(r1, r3, r13, r5)
            r4 = r4 | 2
            r5 = r20
            goto L_0x00e0
        L_0x01ba:
            r20 = r5
            r33 = r12
            r5 = r13
            r12 = r29
            r13 = 0
            r3 = r2[r13]
            r32 = r2
            r2 = r19
            java.lang.Object r19 = r0.C(r1, r13, r3, r2)
            r4 = r4 | 1
            r13 = r5
            r5 = r20
            r2 = r32
            goto L_0x00e0
        L_0x01d5:
            r32 = r2
            r20 = r5
            r33 = r12
            r5 = r13
            r2 = r19
            r12 = r29
            r13 = 0
            r31 = r13
            r2 = r32
            r12 = r33
            r3 = 13
            r13 = r5
            r5 = r20
            goto L_0x00a8
        L_0x01ee:
            r20 = r5
            r33 = r12
            r5 = r13
            r2 = r19
            r12 = r29
            r3 = r2
            r18 = r4
            r4 = r5
            r5 = r6
            r13 = r10
            r6 = r15
            r16 = r20
            r2 = r30
            r10 = r9
            r9 = r11
            r11 = r33
            r34 = r14
            r14 = r7
            r7 = r8
            r8 = r34
        L_0x020c:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.StackComponent r0 = new com.revenuecat.purchases.paywalls.components.StackComponent
            r17 = r0
            r19 = r3
            java.util.List r19 = (java.util.List) r19
            r20 = r4
            com.revenuecat.purchases.paywalls.components.properties.Dimension r20 = (com.revenuecat.purchases.paywalls.components.properties.Dimension) r20
            r21 = r11
            com.revenuecat.purchases.paywalls.components.properties.Size r21 = (com.revenuecat.purchases.paywalls.components.properties.Size) r21
            r22 = r9
            java.lang.Float r22 = (java.lang.Float) r22
            r23 = r10
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r23 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r23
            r24 = r13
            com.revenuecat.purchases.paywalls.components.common.Background r24 = (com.revenuecat.purchases.paywalls.components.common.Background) r24
            r25 = r8
            com.revenuecat.purchases.paywalls.components.properties.Padding r25 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r25
            r26 = r7
            com.revenuecat.purchases.paywalls.components.properties.Padding r26 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r26
            r27 = r14
            com.revenuecat.purchases.paywalls.components.properties.Shape r27 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r27
            r28 = r6
            com.revenuecat.purchases.paywalls.components.properties.Border r28 = (com.revenuecat.purchases.paywalls.components.properties.Border) r28
            r29 = r5
            com.revenuecat.purchases.paywalls.components.properties.Shadow r29 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r29
            r30 = r16
            com.revenuecat.purchases.paywalls.components.properties.Badge r30 = (com.revenuecat.purchases.paywalls.components.properties.Badge) r30
            r31 = r12
            com.revenuecat.purchases.paywalls.components.StackComponent$Overflow r31 = (com.revenuecat.purchases.paywalls.components.StackComponent.Overflow) r31
            r32 = r2
            java.util.List r32 = (java.util.List) r32
            r33 = 0
            r17.<init>((int) r18, (java.util.List) r19, (com.revenuecat.purchases.paywalls.components.properties.Dimension) r20, (com.revenuecat.purchases.paywalls.components.properties.Size) r21, (java.lang.Float) r22, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r23, (com.revenuecat.purchases.paywalls.components.common.Background) r24, (com.revenuecat.purchases.paywalls.components.properties.Padding) r25, (com.revenuecat.purchases.paywalls.components.properties.Padding) r26, (com.revenuecat.purchases.paywalls.components.properties.Shape) r27, (com.revenuecat.purchases.paywalls.components.properties.Border) r28, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r29, (com.revenuecat.purchases.paywalls.components.properties.Badge) r30, (com.revenuecat.purchases.paywalls.components.StackComponent.Overflow) r31, (java.util.List) r32, (kh.t0) r33)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.StackComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.StackComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, StackComponent stackComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(stackComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        StackComponent.write$Self(stackComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
