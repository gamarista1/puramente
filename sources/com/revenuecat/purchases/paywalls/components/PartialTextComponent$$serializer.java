package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.FontAlias$$serializer;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
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
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTextComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialTextComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialTextComponent$$serializer implements D {
    public static final PartialTextComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialTextComponent$$serializer partialTextComponent$$serializer = new PartialTextComponent$$serializer();
        INSTANCE = partialTextComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialTextComponent", partialTextComponent$$serializer, 11);
        j0Var.l("visible", true);
        j0Var.l("text_lid", true);
        j0Var.l("color", true);
        j0Var.l("background_color", true);
        j0Var.l("font_name", true);
        j0Var.l("font_weight", true);
        j0Var.l("font_size", true);
        j0Var.l("horizontal_alignment", true);
        j0Var.l("size", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        descriptor = j0Var;
    }

    private PartialTextComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PartialTextComponent.$childSerializers;
        C5978b u10 = C5998a.u(C6455i.f71663a);
        C5978b u11 = C5998a.u(LocalizationKey$$serializer.INSTANCE);
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        C5978b u12 = C5998a.u(colorScheme$$serializer);
        C5978b u13 = C5998a.u(colorScheme$$serializer);
        C5978b u14 = C5998a.u(FontAlias$$serializer.INSTANCE);
        C5978b u15 = C5998a.u(access$get$childSerializers$cp[5]);
        C5978b u16 = C5998a.u(FontSizeSerializer.INSTANCE);
        C5978b u17 = C5998a.u(access$get$childSerializers$cp[7]);
        C5978b u18 = C5998a.u(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, u12, u13, u14, u15, u16, u17, u18, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0116, code lost:
        r4 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0118, code lost:
        r5 = 9;
        r6 = 6;
        r8 = 8;
        r11 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0136, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialTextComponent deserialize(jh.e r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r29.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.PartialTextComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 10
            r5 = 9
            r6 = 6
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 7
            r12 = 5
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x006f
            kh.i r3 = kh.C6455i.f71663a
            java.lang.Object r3 = r0.i(r1, r14, r3, r15)
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r14 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r13 = r0.i(r1, r13, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r10, r14, r15)
            java.lang.Object r7 = r0.i(r1, r7, r14, r15)
            com.revenuecat.purchases.FontAlias$$serializer r14 = com.revenuecat.purchases.FontAlias$$serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r9, r14, r15)
            r14 = r2[r12]
            java.lang.Object r12 = r0.i(r1, r12, r14, r15)
            com.revenuecat.purchases.paywalls.components.FontSizeSerializer r14 = com.revenuecat.purchases.paywalls.components.FontSizeSerializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r14, r15)
            r2 = r2[r11]
            java.lang.Object r2 = r0.i(r1, r11, r2, r15)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r8, r11, r15)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r11, r15)
            java.lang.Object r4 = r0.i(r1, r4, r11, r15)
            r11 = 2047(0x7ff, float:2.868E-42)
            r27 = r12
            r12 = r11
            r11 = r27
            goto L_0x017e
        L_0x006f:
            r26 = r13
            r9 = r14
            r3 = r15
            r7 = r3
            r10 = r7
            r13 = r10
            r14 = r13
            r19 = r14
            r21 = r19
            r22 = r21
            r24 = r22
            r25 = r24
        L_0x0081:
            if (r26 == 0) goto L_0x0162
            int r12 = r0.o(r1)
            switch(r12) {
                case -1: goto L_0x0150;
                case 0: goto L_0x0139;
                case 1: goto L_0x0120;
                case 2: goto L_0x0103;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ac;
                case 8: goto L_0x00a3;
                case 9: goto L_0x009a;
                case 10: goto L_0x0090;
                default: goto L_0x008a;
            }
        L_0x008a:
            gh.p r0 = new gh.p
            r0.<init>((int) r12)
            throw r0
        L_0x0090:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r14 = r0.i(r1, r4, r12, r14)
            r9 = r9 | 1024(0x400, float:1.435E-42)
        L_0x0098:
            r12 = 5
            goto L_0x0081
        L_0x009a:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r13 = r0.i(r1, r5, r12, r13)
            r9 = r9 | 512(0x200, float:7.175E-43)
            goto L_0x0098
        L_0x00a3:
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r12 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r8, r12, r7)
            r9 = r9 | 256(0x100, float:3.59E-43)
            goto L_0x0098
        L_0x00ac:
            r12 = r2[r11]
            java.lang.Object r3 = r0.i(r1, r11, r12, r3)
            r9 = r9 | 128(0x80, float:1.794E-43)
            goto L_0x0098
        L_0x00b5:
            com.revenuecat.purchases.paywalls.components.FontSizeSerializer r12 = com.revenuecat.purchases.paywalls.components.FontSizeSerializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r6, r12, r10)
            r9 = r9 | 64
            goto L_0x0098
        L_0x00be:
            r12 = 5
            r4 = r2[r12]
            r5 = r24
            java.lang.Object r24 = r0.i(r1, r12, r4, r5)
            r9 = r9 | 32
            r4 = 10
            r5 = 9
            goto L_0x0081
        L_0x00ce:
            r5 = r24
            r12 = 5
            com.revenuecat.purchases.FontAlias$$serializer r4 = com.revenuecat.purchases.FontAlias$$serializer.INSTANCE
            r6 = r21
            r8 = 4
            java.lang.Object r4 = r0.i(r1, r8, r4, r6)
            r9 = r9 | 16
            r21 = r4
            r4 = 10
            r5 = 9
            r6 = 6
            r8 = 8
            goto L_0x0081
        L_0x00e6:
            r6 = r21
            r5 = r24
            r8 = 4
            r12 = 5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r8 = r19
            r11 = 3
            java.lang.Object r4 = r0.i(r1, r11, r4, r8)
            r9 = r9 | 8
            r19 = r4
            r4 = 10
            r5 = 9
            r6 = 6
            r8 = 8
            r11 = 7
            goto L_0x0081
        L_0x0103:
            r8 = r19
            r6 = r21
            r5 = r24
            r11 = 3
            r12 = 5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r11 = r22
            r12 = 2
            java.lang.Object r22 = r0.i(r1, r12, r4, r11)
            r9 = r9 | 4
        L_0x0116:
            r4 = 10
        L_0x0118:
            r5 = 9
            r6 = 6
            r8 = 8
            r11 = 7
            goto L_0x0098
        L_0x0120:
            r8 = r19
            r6 = r21
            r11 = r22
            r5 = r24
            r12 = 2
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r4 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            r17 = r2
            r12 = r25
            r2 = 1
            java.lang.Object r25 = r0.i(r1, r2, r4, r12)
            r9 = r9 | 2
        L_0x0136:
            r2 = r17
            goto L_0x0116
        L_0x0139:
            r17 = r2
            r8 = r19
            r6 = r21
            r11 = r22
            r5 = r24
            r12 = r25
            r2 = 1
            kh.i r4 = kh.C6455i.f71663a
            r2 = 0
            java.lang.Object r15 = r0.i(r1, r2, r4, r15)
            r9 = r9 | 1
            goto L_0x0136
        L_0x0150:
            r17 = r2
            r8 = r19
            r6 = r21
            r11 = r22
            r5 = r24
            r12 = r25
            r2 = 0
            r26 = r2
            r2 = r17
            goto L_0x0118
        L_0x0162:
            r8 = r19
            r6 = r21
            r11 = r22
            r5 = r24
            r12 = r25
            r2 = r3
            r4 = r14
            r3 = r15
            r27 = r11
            r11 = r5
            r5 = r13
            r13 = r12
            r12 = r9
            r9 = r6
            r6 = r10
            r10 = r27
            r28 = r8
            r8 = r7
            r7 = r28
        L_0x017e:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialTextComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialTextComponent
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey r13 = (com.revenuecat.purchases.paywalls.components.common.LocalizationKey) r13
            if (r13 == 0) goto L_0x0190
            java.lang.String r3 = r13.m118unboximpl()
            r14 = r3
            goto L_0x0191
        L_0x0190:
            r14 = 0
        L_0x0191:
            r15 = r10
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r15 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r15
            r16 = r7
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r16 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r16
            com.revenuecat.purchases.FontAlias r9 = (com.revenuecat.purchases.FontAlias) r9
            if (r9 == 0) goto L_0x01a3
            java.lang.String r3 = r9.m42unboximpl()
            r17 = r3
            goto L_0x01a5
        L_0x01a3:
            r17 = 0
        L_0x01a5:
            r18 = r11
            com.revenuecat.purchases.paywalls.components.properties.FontWeight r18 = (com.revenuecat.purchases.paywalls.components.properties.FontWeight) r18
            r19 = r6
            java.lang.Integer r19 = (java.lang.Integer) r19
            r20 = r2
            com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment r20 = (com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment) r20
            r21 = r8
            com.revenuecat.purchases.paywalls.components.properties.Size r21 = (com.revenuecat.purchases.paywalls.components.properties.Size) r21
            r22 = r5
            com.revenuecat.purchases.paywalls.components.properties.Padding r22 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r22
            r23 = r4
            com.revenuecat.purchases.paywalls.components.properties.Padding r23 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r23
            r24 = 0
            r25 = 0
            r11 = r0
            r13 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialTextComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialTextComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialTextComponent partialTextComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialTextComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialTextComponent.write$Self(partialTextComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
