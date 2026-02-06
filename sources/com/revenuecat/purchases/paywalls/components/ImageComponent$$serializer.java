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
import io.intercom.android.sdk.models.carousel.AppearanceType;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ImageComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/ImageComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/ImageComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageComponent$$serializer implements D {
    public static final ImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        ImageComponent$$serializer imageComponent$$serializer = new ImageComponent$$serializer();
        INSTANCE = imageComponent$$serializer;
        C6458j0 j0Var = new C6458j0(AppearanceType.IMAGE, imageComponent$$serializer, 11);
        j0Var.l("source", false);
        j0Var.l("size", true);
        j0Var.l("override_source_lid", true);
        j0Var.l("mask_shape", true);
        j0Var.l("color_overlay", true);
        j0Var.l("fit_mode", true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private ImageComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = ImageComponent.$childSerializers;
        C5978b u10 = C5998a.u(LocalizationKey$$serializer.INSTANCE);
        C5978b u11 = C5998a.u(access$get$childSerializers$cp[3]);
        C5978b u12 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b bVar = access$get$childSerializers$cp[5];
        C5978b u13 = C5998a.u(Border$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(Shadow$$serializer.INSTANCE);
        C5978b bVar2 = access$get$childSerializers$cp[10];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{ThemeImageUrls$$serializer.INSTANCE, Size$$serializer.INSTANCE, u10, u11, u12, bVar, padding$$serializer, padding$$serializer, u13, u14, bVar2};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0112, code lost:
        r4 = 9;
        r5 = 7;
        r6 = 6;
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0118, code lost:
        r10 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0132, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.ImageComponent deserialize(jh.e r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r28.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.ImageComponent.$childSerializers
            boolean r3 = r0.p()
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 10
            r11 = 5
            r12 = 3
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0071
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r14, r3, r15)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r13, r14, r15)
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r14 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r9, r14, r15)
            r14 = r2[r12]
            java.lang.Object r12 = r0.i(r1, r12, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r8 = r0.i(r1, r8, r14, r15)
            r14 = r2[r11]
            java.lang.Object r11 = r0.C(r1, r11, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r14, r15)
            java.lang.Object r5 = r0.C(r1, r5, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r7 = r0.i(r1, r7, r14, r15)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r4 = r0.i(r1, r4, r14, r15)
            r2 = r2[r10]
            java.lang.Object r2 = r0.C(r1, r10, r2, r15)
            r10 = 2047(0x7ff, float:2.868E-42)
            r27 = r11
            r11 = r10
            r10 = r27
            goto L_0x0178
        L_0x0071:
            r26 = r13
            r8 = r14
            r3 = r15
            r9 = r3
            r12 = r9
            r13 = r12
            r14 = r13
            r20 = r14
            r21 = r20
            r23 = r21
            r24 = r23
            r25 = r24
        L_0x0083:
            if (r26 == 0) goto L_0x0162
            int r11 = r0.o(r1)
            switch(r11) {
                case -1: goto L_0x014c;
                case 0: goto L_0x0135;
                case 1: goto L_0x011c;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00cf;
                case 5: goto L_0x00c0;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00a5;
                case 9: goto L_0x009c;
                case 10: goto L_0x0092;
                default: goto L_0x008c;
            }
        L_0x008c:
            gh.p r0 = new gh.p
            r0.<init>((int) r11)
            throw r0
        L_0x0092:
            r11 = r2[r10]
            java.lang.Object r3 = r0.C(r1, r10, r11, r3)
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x009a:
            r11 = 5
            goto L_0x0083
        L_0x009c:
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            java.lang.Object r14 = r0.i(r1, r4, r11, r14)
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x009a
        L_0x00a5:
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            java.lang.Object r12 = r0.i(r1, r7, r11, r12)
            r8 = r8 | 256(0x100, float:3.59E-43)
            goto L_0x009a
        L_0x00ae:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r5, r11, r13)
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x009a
        L_0x00b7:
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r11 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r9 = r0.C(r1, r6, r11, r9)
            r8 = r8 | 64
            goto L_0x009a
        L_0x00c0:
            r11 = 5
            r4 = r2[r11]
            r5 = r23
            java.lang.Object r23 = r0.C(r1, r11, r4, r5)
            r8 = r8 | 32
            r4 = 9
            r5 = 7
            goto L_0x0083
        L_0x00cf:
            r5 = r23
            r11 = 5
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r6 = r20
            r7 = 4
            java.lang.Object r4 = r0.i(r1, r7, r4, r6)
            r8 = r8 | 16
            r20 = r4
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 8
            goto L_0x0083
        L_0x00e6:
            r6 = r20
            r5 = r23
            r4 = 3
            r11 = 5
            r7 = r2[r4]
            r10 = r24
            java.lang.Object r24 = r0.i(r1, r4, r7, r10)
            r8 = r8 | 8
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 8
            r10 = 10
            goto L_0x0083
        L_0x00ff:
            r6 = r20
            r5 = r23
            r10 = r24
            r4 = 3
            r11 = 5
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r7 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            r4 = r21
            r11 = 2
            java.lang.Object r21 = r0.i(r1, r11, r7, r4)
            r8 = r8 | 4
        L_0x0112:
            r4 = 9
            r5 = 7
            r6 = 6
            r7 = 8
        L_0x0118:
            r10 = 10
            goto L_0x009a
        L_0x011c:
            r6 = r20
            r4 = r21
            r5 = r23
            r10 = r24
            r11 = 2
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r17 = r2
            r11 = r25
            r2 = 1
            java.lang.Object r25 = r0.C(r1, r2, r7, r11)
            r8 = r8 | 2
        L_0x0132:
            r2 = r17
            goto L_0x0112
        L_0x0135:
            r17 = r2
            r6 = r20
            r4 = r21
            r5 = r23
            r10 = r24
            r11 = r25
            r2 = 1
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            r2 = 0
            java.lang.Object r15 = r0.C(r1, r2, r7, r15)
            r8 = r8 | 1
            goto L_0x0132
        L_0x014c:
            r17 = r2
            r6 = r20
            r4 = r21
            r5 = r23
            r10 = r24
            r11 = r25
            r2 = 0
            r26 = r2
            r2 = r17
            r4 = 9
            r5 = 7
            r6 = 6
            goto L_0x0118
        L_0x0162:
            r6 = r20
            r4 = r21
            r5 = r23
            r10 = r24
            r11 = r25
            r2 = r3
            r7 = r12
            r3 = r15
            r12 = r10
            r10 = r5
            r5 = r13
            r13 = r11
            r11 = r8
            r8 = r6
            r6 = r9
            r9 = r4
            r4 = r14
        L_0x0178:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.ImageComponent r0 = new com.revenuecat.purchases.paywalls.components.ImageComponent
            r1 = r3
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r1 = (com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls) r1
            com.revenuecat.purchases.paywalls.components.properties.Size r13 = (com.revenuecat.purchases.paywalls.components.properties.Size) r13
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey r9 = (com.revenuecat.purchases.paywalls.components.common.LocalizationKey) r9
            if (r9 == 0) goto L_0x018c
            java.lang.String r15 = r9.m118unboximpl()
            r14 = r15
            goto L_0x018d
        L_0x018c:
            r14 = 0
        L_0x018d:
            r15 = r12
            com.revenuecat.purchases.paywalls.components.properties.MaskShape r15 = (com.revenuecat.purchases.paywalls.components.properties.MaskShape) r15
            r16 = r8
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r16 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r16
            r17 = r10
            com.revenuecat.purchases.paywalls.components.properties.FitMode r17 = (com.revenuecat.purchases.paywalls.components.properties.FitMode) r17
            r18 = r6
            com.revenuecat.purchases.paywalls.components.properties.Padding r18 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r18
            r19 = r5
            com.revenuecat.purchases.paywalls.components.properties.Padding r19 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r19
            r20 = r7
            com.revenuecat.purchases.paywalls.components.properties.Border r20 = (com.revenuecat.purchases.paywalls.components.properties.Border) r20
            r21 = r4
            com.revenuecat.purchases.paywalls.components.properties.Shadow r21 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r21
            r22 = r2
            java.util.List r22 = (java.util.List) r22
            r23 = 0
            r24 = 0
            r10 = r0
            r12 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ImageComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.ImageComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, ImageComponent imageComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(imageComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        ImageComponent.write$Self(imageComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
