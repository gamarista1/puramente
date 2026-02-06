package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimelineComponent$$serializer implements D {
    public static final TimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        TimelineComponent$$serializer timelineComponent$$serializer = new TimelineComponent$$serializer();
        INSTANCE = timelineComponent$$serializer;
        C6458j0 j0Var = new C6458j0("timeline", timelineComponent$$serializer, 9);
        j0Var.l("item_spacing", false);
        j0Var.l("text_spacing", false);
        j0Var.l("column_gutter", false);
        j0Var.l("icon_alignment", false);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("items", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private TimelineComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = TimelineComponent.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[3];
        C5978b bVar2 = access$get$childSerializers$cp[7];
        C5978b bVar3 = access$get$childSerializers$cp[8];
        I i10 = I.f71604a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{i10, i10, i10, bVar, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar2, bVar3};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0099, code lost:
        r8 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
        r9 = r9;
        r12 = r12;
        r11 = r11;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        r12 = r12;
        r11 = r11;
        r9 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.TimelineComponent deserialize(jh.e r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r20.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.TimelineComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 7
            r9 = 3
            r10 = 8
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0061
            int r3 = r0.E(r1, r12)
            int r11 = r0.E(r1, r11)
            int r7 = r0.E(r1, r7)
            r12 = r2[r9]
            java.lang.Object r9 = r0.C(r1, r9, r12, r13)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r12, r13)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r12, r13)
            java.lang.Object r4 = r0.C(r1, r4, r12, r13)
            r12 = r2[r8]
            java.lang.Object r8 = r0.C(r1, r8, r12, r13)
            r2 = r2[r10]
            java.lang.Object r2 = r0.C(r1, r10, r2, r13)
            r10 = 511(0x1ff, float:7.16E-43)
            r13 = r7
            r12 = r9
            r9 = r4
            r7 = r5
            r4 = r10
            r5 = r3
            r19 = r11
            r11 = r6
            r6 = r19
            goto L_0x00ec
        L_0x0061:
            r18 = r11
            r3 = r12
            r14 = r3
            r15 = r14
            r5 = r13
            r6 = r5
            r7 = r6
            r9 = r7
            r11 = r9
            r12 = r11
            r13 = r15
        L_0x006d:
            if (r18 == 0) goto L_0x00e7
            int r4 = r0.o(r1)
            switch(r4) {
                case -1: goto L_0x00df;
                case 0: goto L_0x00d1;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bc;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00a7;
                case 5: goto L_0x009b;
                case 6: goto L_0x008f;
                case 7: goto L_0x0086;
                case 8: goto L_0x007c;
                default: goto L_0x0076;
            }
        L_0x0076:
            gh.p r0 = new gh.p
            r0.<init>((int) r4)
            throw r0
        L_0x007c:
            r4 = r2[r10]
            java.lang.Object r5 = r0.C(r1, r10, r4, r5)
            r14 = r14 | 256(0x100, float:3.59E-43)
        L_0x0084:
            r4 = 6
            goto L_0x006d
        L_0x0086:
            r4 = r2[r8]
            java.lang.Object r6 = r0.C(r1, r8, r4, r6)
            r14 = r14 | 128(0x80, float:1.794E-43)
            goto L_0x0084
        L_0x008f:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 6
            java.lang.Object r9 = r0.C(r1, r8, r4, r9)
            r14 = r14 | 64
            r4 = r8
        L_0x0099:
            r8 = 7
            goto L_0x006d
        L_0x009b:
            r8 = 6
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r8 = 5
            java.lang.Object r7 = r0.C(r1, r8, r4, r7)
            r14 = r14 | 32
        L_0x00a5:
            r4 = 6
            goto L_0x0099
        L_0x00a7:
            r8 = 5
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r8 = 4
            java.lang.Object r11 = r0.C(r1, r8, r4, r11)
            r14 = r14 | 16
            goto L_0x00a5
        L_0x00b2:
            r4 = 3
            r8 = r2[r4]
            java.lang.Object r12 = r0.C(r1, r4, r8, r12)
            r14 = r14 | 8
            goto L_0x00a5
        L_0x00bc:
            r4 = 3
            r8 = 2
            int r13 = r0.E(r1, r8)
            r14 = r14 | 4
            goto L_0x00a5
        L_0x00c5:
            r4 = 3
            r8 = 2
            r15 = 1
            int r16 = r0.E(r1, r15)
            r14 = r14 | 2
            r15 = r16
            goto L_0x00a5
        L_0x00d1:
            r3 = 0
            r4 = 3
            r8 = 2
            r16 = 1
            int r17 = r0.E(r1, r3)
            r14 = r14 | 1
            r3 = r17
            goto L_0x00a5
        L_0x00df:
            r8 = 2
            r16 = 1
            r17 = 0
            r18 = r17
            goto L_0x00a5
        L_0x00e7:
            r2 = r5
            r8 = r6
            r4 = r14
            r6 = r15
            r5 = r3
        L_0x00ec:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.TimelineComponent r0 = new com.revenuecat.purchases.paywalls.components.TimelineComponent
            r1 = r12
            com.revenuecat.purchases.paywalls.components.TimelineComponent$IconAlignment r1 = (com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment) r1
            r10 = r11
            com.revenuecat.purchases.paywalls.components.properties.Size r10 = (com.revenuecat.purchases.paywalls.components.properties.Size) r10
            r11 = r7
            com.revenuecat.purchases.paywalls.components.properties.Padding r11 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r11
            r12 = r9
            com.revenuecat.purchases.paywalls.components.properties.Padding r12 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r12
            r14 = r8
            java.util.List r14 = (java.util.List) r14
            java.util.List r2 = (java.util.List) r2
            r15 = 0
            r3 = r0
            r7 = r13
            r8 = r1
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r13 = r2
            r14 = r15
            r3.<init>((int) r4, (int) r5, (int) r6, (int) r7, (com.revenuecat.purchases.paywalls.components.TimelineComponent.IconAlignment) r8, (com.revenuecat.purchases.paywalls.components.properties.Size) r9, (com.revenuecat.purchases.paywalls.components.properties.Padding) r10, (com.revenuecat.purchases.paywalls.components.properties.Padding) r11, (java.util.List) r12, (java.util.List) r13, (kh.t0) r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.TimelineComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.TimelineComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, TimelineComponent timelineComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(timelineComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        TimelineComponent.write$Self(timelineComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
