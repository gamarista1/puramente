package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTimelineComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTimelineComponent$$serializer implements D {
    public static final PartialTimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialTimelineComponent$$serializer partialTimelineComponent$$serializer = new PartialTimelineComponent$$serializer();
        INSTANCE = partialTimelineComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponent", partialTimelineComponent$$serializer, 8);
        j0Var.l("visible", true);
        j0Var.l("item_spacing", true);
        j0Var.l("text_spacing", true);
        j0Var.l("column_gutter", true);
        j0Var.l("icon_alignment", true);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        descriptor = j0Var;
    }

    private PartialTimelineComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PartialTimelineComponent.$childSerializers;
        C5978b u10 = C5998a.u(C6455i.f71663a);
        I i10 = I.f71604a;
        C5978b u11 = C5998a.u(i10);
        C5978b u12 = C5998a.u(i10);
        C5978b u13 = C5998a.u(i10);
        C5978b u14 = C5998a.u(access$get$childSerializers$cp[4]);
        C5978b u15 = C5998a.u(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, u12, u13, u14, u15, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        r4 = 7;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialTimelineComponent deserialize(jh.e r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r20.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.PartialTimelineComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 2
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0052
            kh.i r3 = kh.C6455i.f71663a
            java.lang.Object r3 = r0.i(r1, r11, r3, r12)
            kh.I r11 = kh.I.f71604a
            java.lang.Object r10 = r0.i(r1, r10, r11, r12)
            java.lang.Object r8 = r0.i(r1, r8, r11, r12)
            java.lang.Object r7 = r0.i(r1, r7, r11, r12)
            r2 = r2[r9]
            java.lang.Object r2 = r0.i(r1, r9, r2, r12)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r9, r12)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r9, r12)
            java.lang.Object r4 = r0.i(r1, r4, r9, r12)
            r9 = 255(0xff, float:3.57E-43)
            r13 = r10
            r10 = r9
            goto L_0x00d0
        L_0x0052:
            r19 = r10
            r3 = r11
            r7 = r12
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x005c:
            if (r19 == 0) goto L_0x00c8
            int r9 = r0.o(r1)
            switch(r9) {
                case -1: goto L_0x00c3;
                case 0: goto L_0x00b7;
                case 1: goto L_0x00ab;
                case 2: goto L_0x009f;
                case 3: goto L_0x0092;
                case 4: goto L_0x0087;
                case 5: goto L_0x007e;
                case 6: goto L_0x0075;
                case 7: goto L_0x006b;
                default: goto L_0x0065;
            }
        L_0x0065:
            gh.p r0 = new gh.p
            r0.<init>((int) r9)
            throw r0
        L_0x006b:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r4, r9, r7)
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0073:
            r9 = 4
            goto L_0x005c
        L_0x0075:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r5, r9, r8)
            r3 = r3 | 64
            goto L_0x0073
        L_0x007e:
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r6, r9, r10)
            r3 = r3 | 32
            goto L_0x0073
        L_0x0087:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r11 = r0.i(r1, r9, r4, r11)
            r3 = r3 | 16
            r4 = 7
            goto L_0x005c
        L_0x0092:
            r9 = 4
            kh.I r4 = kh.I.f71604a
            r5 = 3
            java.lang.Object r15 = r0.i(r1, r5, r4, r15)
            r3 = r3 | 8
        L_0x009c:
            r4 = 7
        L_0x009d:
            r5 = 6
            goto L_0x005c
        L_0x009f:
            r5 = 3
            r9 = 4
            kh.I r4 = kh.I.f71604a
            r5 = 2
            java.lang.Object r14 = r0.i(r1, r5, r4, r14)
            r3 = r3 | 4
            goto L_0x009c
        L_0x00ab:
            r5 = 2
            r9 = 4
            kh.I r4 = kh.I.f71604a
            r5 = 1
            java.lang.Object r13 = r0.i(r1, r5, r4, r13)
            r3 = r3 | 2
            goto L_0x009c
        L_0x00b7:
            r5 = 1
            r9 = 4
            kh.i r4 = kh.C6455i.f71663a
            r5 = 0
            java.lang.Object r12 = r0.i(r1, r5, r4, r12)
            r3 = r3 | 1
            goto L_0x009c
        L_0x00c3:
            r5 = 0
            r9 = 4
            r19 = r5
            goto L_0x009d
        L_0x00c8:
            r4 = r7
            r5 = r8
            r6 = r10
            r2 = r11
            r8 = r14
            r7 = r15
            r10 = r3
            r3 = r12
        L_0x00d0:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialTimelineComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialTimelineComponent
            r11 = r3
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r12 = r13
            java.lang.Integer r12 = (java.lang.Integer) r12
            r13 = r8
            java.lang.Integer r13 = (java.lang.Integer) r13
            r14 = r7
            java.lang.Integer r14 = (java.lang.Integer) r14
            r15 = r2
            com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment r15 = (com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment) r15
            r16 = r6
            com.revenuecat.purchases.paywalls.components.properties.Size r16 = (com.revenuecat.purchases.paywalls.components.properties.Size) r16
            r17 = r5
            com.revenuecat.purchases.paywalls.components.properties.Padding r17 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r17
            r18 = r4
            com.revenuecat.purchases.paywalls.components.properties.Padding r18 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r18
            r19 = 0
            r9 = r0
            r9.<init>((int) r10, (java.lang.Boolean) r11, (java.lang.Integer) r12, (java.lang.Integer) r13, (java.lang.Integer) r14, (com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment) r15, (com.revenuecat.purchases.paywalls.components.properties.Size) r16, (com.revenuecat.purchases.paywalls.components.properties.Padding) r17, (com.revenuecat.purchases.paywalls.components.properties.Padding) r18, (kh.t0) r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTimelineComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialTimelineComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialTimelineComponent partialTimelineComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialTimelineComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialTimelineComponent.write$Self(partialTimelineComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
