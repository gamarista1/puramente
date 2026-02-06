package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialImageComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialImageComponent$$serializer implements D {
    public static final PartialImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialImageComponent$$serializer partialImageComponent$$serializer = new PartialImageComponent$$serializer();
        INSTANCE = partialImageComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialImageComponent", partialImageComponent$$serializer, 11);
        j0Var.l("visible", true);
        j0Var.l("source", true);
        j0Var.l("size", true);
        j0Var.l("override_source_lid", true);
        j0Var.l("fit_mode", true);
        j0Var.l("mask_shape", true);
        j0Var.l("color_overlay", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        descriptor = j0Var;
    }

    private PartialImageComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PartialImageComponent.$childSerializers;
        C5978b u10 = C5998a.u(C6455i.f71663a);
        C5978b u11 = C5998a.u(ThemeImageUrls$$serializer.INSTANCE);
        C5978b u12 = C5998a.u(Size$$serializer.INSTANCE);
        C5978b u13 = C5998a.u(LocalizationKey$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(access$get$childSerializers$cp[4]);
        C5978b u15 = C5998a.u(access$get$childSerializers$cp[5]);
        C5978b u16 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, u12, u13, u14, u15, u16, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer), C5998a.u(Border$$serializer.INSTANCE), C5998a.u(Shadow$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00db, code lost:
        r4 = 10;
        r5 = 9;
        r6 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0101, code lost:
        r4 = 10;
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0105, code lost:
        r6 = 7;
        r9 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x011f, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialImageComponent deserialize(jh.e r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r28.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.PartialImageComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 3
            r9 = 8
            r10 = 2
            r11 = 5
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0071
            kh.i r3 = kh.C6455i.f71663a
            java.lang.Object r3 = r0.i(r1, r14, r3, r15)
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            java.lang.Object r13 = r0.i(r1, r13, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r10, r14, r15)
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r14 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r8, r14, r15)
            r14 = r2[r12]
            java.lang.Object r12 = r0.i(r1, r12, r14, r15)
            r2 = r2[r11]
            java.lang.Object r2 = r0.i(r1, r11, r2, r15)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r11, r15)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r11, r15)
            java.lang.Object r9 = r0.i(r1, r9, r11, r15)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r5 = r0.i(r1, r5, r11, r15)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r11, r15)
            r11 = 2047(0x7ff, float:2.868E-42)
            r27 = r12
            r12 = r11
            r11 = r27
            goto L_0x015d
        L_0x0071:
            r26 = r13
            r11 = r14
            r3 = r15
            r8 = r3
            r10 = r8
            r12 = r10
            r13 = r12
            r14 = r13
            r20 = r14
            r22 = r20
            r24 = r22
            r25 = r24
        L_0x0082:
            if (r26 == 0) goto L_0x0149
            int r7 = r0.o(r1)
            switch(r7) {
                case -1: goto L_0x0137;
                case 0: goto L_0x0122;
                case 1: goto L_0x010b;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00a4;
                case 9: goto L_0x009b;
                case 10: goto L_0x0091;
                default: goto L_0x008b;
            }
        L_0x008b:
            gh.p r0 = new gh.p
            r0.<init>((int) r7)
            throw r0
        L_0x0091:
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r14 = r0.i(r1, r4, r7, r14)
            r11 = r11 | 1024(0x400, float:1.435E-42)
        L_0x0099:
            r7 = 6
            goto L_0x0082
        L_0x009b:
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r13 = r0.i(r1, r5, r7, r13)
            r11 = r11 | 512(0x200, float:7.175E-43)
            goto L_0x0099
        L_0x00a4:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r9, r7, r12)
            r11 = r11 | 256(0x100, float:3.59E-43)
            goto L_0x0099
        L_0x00ad:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r6, r7, r10)
            r11 = r11 | 128(0x80, float:1.794E-43)
            goto L_0x0099
        L_0x00b6:
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r4 = 6
            java.lang.Object r8 = r0.i(r1, r4, r7, r8)
            r11 = r11 | 64
            r7 = r4
            r4 = 10
            goto L_0x0082
        L_0x00c3:
            r7 = 5
            r4 = r2[r7]
            java.lang.Object r3 = r0.i(r1, r7, r4, r3)
            r11 = r11 | 32
            r4 = 10
            goto L_0x0099
        L_0x00cf:
            r4 = 4
            r7 = 5
            r5 = r2[r4]
            r6 = r24
            java.lang.Object r24 = r0.i(r1, r4, r5, r6)
            r11 = r11 | 16
        L_0x00db:
            r4 = 10
            r5 = 9
            r6 = 7
            goto L_0x0099
        L_0x00e1:
            r6 = r24
            r4 = 4
            r7 = 5
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r5 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            r4 = r20
            r7 = 3
            java.lang.Object r20 = r0.i(r1, r7, r5, r4)
            r11 = r11 | 8
            goto L_0x00db
        L_0x00f1:
            r4 = r20
            r6 = r24
            r7 = 3
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r7 = r22
            r9 = 2
            java.lang.Object r22 = r0.i(r1, r9, r5, r7)
            r11 = r11 | 4
        L_0x0101:
            r4 = 10
            r5 = 9
        L_0x0105:
            r6 = 7
            r7 = 6
            r9 = 8
            goto L_0x0082
        L_0x010b:
            r4 = r20
            r7 = r22
            r6 = r24
            r9 = 2
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r5 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            r17 = r2
            r9 = r25
            r2 = 1
            java.lang.Object r25 = r0.i(r1, r2, r5, r9)
            r11 = r11 | 2
        L_0x011f:
            r2 = r17
            goto L_0x0101
        L_0x0122:
            r17 = r2
            r4 = r20
            r7 = r22
            r6 = r24
            r9 = r25
            r2 = 1
            kh.i r5 = kh.C6455i.f71663a
            r2 = 0
            java.lang.Object r15 = r0.i(r1, r2, r5, r15)
            r11 = r11 | 1
            goto L_0x011f
        L_0x0137:
            r17 = r2
            r4 = r20
            r7 = r22
            r6 = r24
            r9 = r25
            r2 = 0
            r26 = r2
            r2 = r17
            r4 = 10
            goto L_0x0105
        L_0x0149:
            r4 = r20
            r7 = r22
            r6 = r24
            r9 = r25
            r2 = r3
            r5 = r13
            r3 = r15
            r13 = r9
            r9 = r12
            r12 = r11
            r11 = r6
            r6 = r10
            r10 = r7
            r7 = r8
            r8 = r4
            r4 = r14
        L_0x015d:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialImageComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialImageComponent
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r14 = r13
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r14 = (com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls) r14
            r15 = r10
            com.revenuecat.purchases.paywalls.components.properties.Size r15 = (com.revenuecat.purchases.paywalls.components.properties.Size) r15
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey r8 = (com.revenuecat.purchases.paywalls.components.common.LocalizationKey) r8
            if (r8 == 0) goto L_0x0176
            java.lang.String r3 = r8.m118unboximpl()
            r16 = r3
            goto L_0x0178
        L_0x0176:
            r16 = 0
        L_0x0178:
            r17 = r11
            com.revenuecat.purchases.paywalls.components.properties.FitMode r17 = (com.revenuecat.purchases.paywalls.components.properties.FitMode) r17
            r18 = r2
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r18 = (com.revenuecat.purchases.paywalls.components.properties.MaskShape) r18
            r19 = r7
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r19 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r19
            r20 = r6
            com.revenuecat.purchases.paywalls.components.properties.Padding r20 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r20
            r21 = r9
            com.revenuecat.purchases.paywalls.components.properties.Padding r21 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r21
            r22 = r5
            com.revenuecat.purchases.paywalls.components.properties.Border r22 = (com.revenuecat.purchases.paywalls.components.properties.Border) r22
            r23 = r4
            com.revenuecat.purchases.paywalls.components.properties.Shadow r23 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r23
            r24 = 0
            r25 = 0
            r11 = r0
            r13 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialImageComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialImageComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialImageComponent partialImageComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialImageComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialImageComponent.write$Self(partialImageComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
