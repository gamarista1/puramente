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
import kh.C;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialCarouselComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialCarouselComponent$$serializer implements D {
    public static final PartialCarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PartialCarouselComponent$$serializer partialCarouselComponent$$serializer = new PartialCarouselComponent$$serializer();
        INSTANCE = partialCarouselComponent$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.PartialCarouselComponent", partialCarouselComponent$$serializer, 16);
        j0Var.l("visible", true);
        j0Var.l("initial_page_index", true);
        j0Var.l("page_alignment", true);
        j0Var.l("size", true);
        j0Var.l("page_peek", true);
        j0Var.l("page_spacing", true);
        j0Var.l("background_color", true);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, true);
        j0Var.l("padding", true);
        j0Var.l("margin", true);
        j0Var.l("shape", true);
        j0Var.l("border", true);
        j0Var.l("shadow", true);
        j0Var.l("page_control", true);
        j0Var.l("loop", true);
        j0Var.l("auto_advance", true);
        descriptor = j0Var;
    }

    private PartialCarouselComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PartialCarouselComponent.$childSerializers;
        C6455i iVar = C6455i.f71663a;
        C5978b u10 = C5998a.u(iVar);
        I i10 = I.f71604a;
        C5978b u11 = C5998a.u(i10);
        C5978b u12 = C5998a.u(access$get$childSerializers$cp[2]);
        C5978b u13 = C5998a.u(Size$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(i10);
        C5978b u15 = C5998a.u(C.f71587a);
        C5978b u16 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u17 = C5998a.u(access$get$childSerializers$cp[7]);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{u10, u11, u12, u13, u14, u15, u16, u17, C5998a.u(padding$$serializer), C5998a.u(padding$$serializer), C5998a.u(access$get$childSerializers$cp[10]), C5998a.u(Border$$serializer.INSTANCE), C5998a.u(Shadow$$serializer.INSTANCE), C5998a.u(CarouselComponent$PageControl$$serializer.INSTANCE), C5998a.u(iVar), C5998a.u(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00f5, code lost:
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00f7, code lost:
        r15 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x026d, code lost:
        r34 = r2;
        r2 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PartialCarouselComponent deserialize(jh.e r41) {
        /*
            r40 = this;
            r0 = r41
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r40.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.PartialCarouselComponent.$childSerializers
            boolean r3 = r0.p()
            r10 = 6
            r11 = 5
            r12 = 3
            r13 = 8
            r14 = 4
            r4 = 7
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00a6
            kh.i r3 = kh.C6455i.f71663a
            java.lang.Object r7 = r0.i(r1, r7, r3, r8)
            kh.I r15 = kh.I.f71604a
            java.lang.Object r6 = r0.i(r1, r6, r15, r8)
            r9 = r2[r5]
            java.lang.Object r5 = r0.i(r1, r5, r9, r8)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r9 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r9 = r0.i(r1, r12, r9, r8)
            java.lang.Object r12 = r0.i(r1, r14, r15, r8)
            kh.C r14 = kh.C.f71587a
            java.lang.Object r11 = r0.i(r1, r11, r14, r8)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r10, r14, r8)
            r14 = r2[r4]
            java.lang.Object r4 = r0.i(r1, r4, r14, r8)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r13 = r0.i(r1, r13, r14, r8)
            r15 = 9
            java.lang.Object r14 = r0.i(r1, r15, r14, r8)
            r15 = 10
            r2 = r2[r15]
            java.lang.Object r2 = r0.i(r1, r15, r2, r8)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r20 = r2
            r2 = 11
            java.lang.Object r2 = r0.i(r1, r2, r15, r8)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r19 = r2
            r2 = 12
            java.lang.Object r2 = r0.i(r1, r2, r15, r8)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer r15 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.INSTANCE
            r18 = r2
            r2 = 13
            java.lang.Object r2 = r0.i(r1, r2, r15, r8)
            r15 = 14
            java.lang.Object r3 = r0.i(r1, r15, r3, r8)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer r15 = com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer.INSTANCE
            r16 = r7
            r7 = 15
            java.lang.Object r7 = r0.i(r1, r7, r15, r8)
            r8 = 65535(0xffff, float:9.1834E-41)
            r17 = r3
            r21 = r8
            r3 = r2
            r2 = r20
            r39 = r16
            r16 = r7
            r7 = r39
            goto L_0x02ad
        L_0x00a6:
            r3 = r7
            r7 = 15
            r35 = r6
            r4 = r8
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r30 = r15
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r8 = r3
            r3 = r34
        L_0x00c2:
            if (r35 == 0) goto L_0x028b
            int r7 = r0.o(r1)
            switch(r7) {
                case -1: goto L_0x0275;
                case 0: goto L_0x024c;
                case 1: goto L_0x022c;
                case 2: goto L_0x0215;
                case 3: goto L_0x01fd;
                case 4: goto L_0x01e5;
                case 5: goto L_0x01cd;
                case 6: goto L_0x01b5;
                case 7: goto L_0x019e;
                case 8: goto L_0x0184;
                case 9: goto L_0x016a;
                case 10: goto L_0x0153;
                case 11: goto L_0x0134;
                case 12: goto L_0x0117;
                case 13: goto L_0x00fc;
                case 14: goto L_0x00e3;
                case 15: goto L_0x00d1;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            gh.p r0 = new gh.p
            r0.<init>((int) r7)
            throw r0
        L_0x00d1:
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer r7 = com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer.INSTANCE
            r37 = r15
            r15 = 15
            java.lang.Object r9 = r0.i(r1, r15, r7, r9)
            r7 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r7
            r7 = r15
            r15 = r37
            goto L_0x00c2
        L_0x00e3:
            r37 = r15
            r15 = 15
            kh.i r7 = kh.C6455i.f71663a
            r16 = r9
            r15 = r33
            r9 = 14
            java.lang.Object r33 = r0.i(r1, r9, r7, r15)
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x00f5:
            r9 = r16
        L_0x00f7:
            r15 = r37
        L_0x00f9:
            r7 = 15
            goto L_0x00c2
        L_0x00fc:
            r16 = r9
            r37 = r15
            r15 = r33
            r9 = 14
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer r7 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.INSTANCE
            r17 = r15
            r9 = r32
            r15 = 13
            java.lang.Object r32 = r0.i(r1, r15, r7, r9)
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r9 = r16
            r33 = r17
            goto L_0x00f7
        L_0x0117:
            r16 = r9
            r37 = r15
            r9 = r32
            r17 = r33
            r15 = 13
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r18 = r9
            r15 = r31
            r9 = 12
            java.lang.Object r31 = r0.i(r1, r9, r7, r15)
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r9 = r16
            r32 = r18
            goto L_0x00f7
        L_0x0134:
            r16 = r9
            r37 = r15
            r15 = r31
            r18 = r32
            r17 = r33
            r9 = 12
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r19 = r15
            r9 = r30
            r15 = 11
            java.lang.Object r30 = r0.i(r1, r15, r7, r9)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r9 = r16
            r31 = r19
            goto L_0x00f7
        L_0x0153:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 10
            r15 = r2[r7]
            java.lang.Object r13 = r0.i(r1, r7, r15, r13)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x00f5
        L_0x016a:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 10
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r7 = 9
            java.lang.Object r4 = r0.i(r1, r7, r15, r4)
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x00f5
        L_0x0184:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 9
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r7 = 8
            java.lang.Object r10 = r0.i(r1, r7, r15, r10)
            r8 = r8 | 256(0x100, float:3.59E-43)
            goto L_0x00f5
        L_0x019e:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r15 = 7
            r7 = r2[r15]
            java.lang.Object r11 = r0.i(r1, r15, r7, r11)
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x00f5
        L_0x01b5:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r15 = 7
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r15 = 6
            java.lang.Object r14 = r0.i(r1, r15, r7, r14)
            r8 = r8 | 64
            goto L_0x00f5
        L_0x01cd:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r15 = 6
            kh.C r7 = kh.C.f71587a
            r15 = 5
            java.lang.Object r12 = r0.i(r1, r15, r7, r12)
            r8 = r8 | 32
            goto L_0x00f5
        L_0x01e5:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r15 = 5
            kh.I r7 = kh.I.f71604a
            r15 = 4
            java.lang.Object r5 = r0.i(r1, r15, r7, r5)
            r8 = r8 | 16
            goto L_0x00f5
        L_0x01fd:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r15 = 4
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r15 = 3
            java.lang.Object r6 = r0.i(r1, r15, r7, r6)
            r8 = r8 | 8
            goto L_0x00f5
        L_0x0215:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 2
            r15 = r2[r7]
            java.lang.Object r3 = r0.i(r1, r7, r15, r3)
            r8 = r8 | 4
            goto L_0x00f5
        L_0x022c:
            r16 = r9
            r37 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 2
            kh.I r15 = kh.I.f71604a
            r22 = r2
            r2 = r37
            r7 = 1
            java.lang.Object r15 = r0.i(r1, r7, r15, r2)
            r8 = r8 | 2
            r9 = r16
            r2 = r22
            goto L_0x00f9
        L_0x024c:
            r22 = r2
            r16 = r9
            r2 = r15
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r7 = 1
            kh.i r15 = kh.C6455i.f71663a
            r7 = 0
            r39 = r34
            r34 = r2
            r2 = r39
            java.lang.Object r2 = r0.i(r1, r7, r15, r2)
            r8 = r8 | 1
            r9 = r16
            r15 = r34
        L_0x026d:
            r7 = 15
            r34 = r2
            r2 = r22
            goto L_0x00c2
        L_0x0275:
            r22 = r2
            r16 = r9
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r2 = r34
            r7 = 0
            r34 = r15
            r35 = r7
            r9 = r16
            goto L_0x026d
        L_0x028b:
            r16 = r9
            r9 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r2 = r34
            r34 = r15
            r7 = r2
            r21 = r8
            r2 = r13
            r13 = r10
            r10 = r14
            r14 = r4
            r4 = r11
            r11 = r12
            r12 = r5
            r5 = r3
            r3 = r18
            r18 = r19
            r19 = r9
            r9 = r6
            r6 = r34
        L_0x02ad:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PartialCarouselComponent r0 = new com.revenuecat.purchases.paywalls.components.PartialCarouselComponent
            r20 = r0
            r22 = r7
            java.lang.Boolean r22 = (java.lang.Boolean) r22
            r23 = r6
            java.lang.Integer r23 = (java.lang.Integer) r23
            r24 = r5
            com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment r24 = (com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment) r24
            r25 = r9
            com.revenuecat.purchases.paywalls.components.properties.Size r25 = (com.revenuecat.purchases.paywalls.components.properties.Size) r25
            r26 = r12
            java.lang.Integer r26 = (java.lang.Integer) r26
            r27 = r11
            java.lang.Float r27 = (java.lang.Float) r27
            r28 = r10
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r28 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r28
            r29 = r4
            com.revenuecat.purchases.paywalls.components.common.Background r29 = (com.revenuecat.purchases.paywalls.components.common.Background) r29
            r30 = r13
            com.revenuecat.purchases.paywalls.components.properties.Padding r30 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r30
            r31 = r14
            com.revenuecat.purchases.paywalls.components.properties.Padding r31 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r31
            r32 = r2
            com.revenuecat.purchases.paywalls.components.properties.Shape r32 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r32
            r33 = r19
            com.revenuecat.purchases.paywalls.components.properties.Border r33 = (com.revenuecat.purchases.paywalls.components.properties.Border) r33
            r34 = r18
            com.revenuecat.purchases.paywalls.components.properties.Shadow r34 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r34
            r35 = r3
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl r35 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl) r35
            r36 = r17
            java.lang.Boolean r36 = (java.lang.Boolean) r36
            r37 = r16
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r37 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages) r37
            r38 = 0
            r20.<init>((int) r21, (java.lang.Boolean) r22, (java.lang.Integer) r23, (com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment) r24, (com.revenuecat.purchases.paywalls.components.properties.Size) r25, (java.lang.Integer) r26, (java.lang.Float) r27, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r28, (com.revenuecat.purchases.paywalls.components.common.Background) r29, (com.revenuecat.purchases.paywalls.components.properties.Padding) r30, (com.revenuecat.purchases.paywalls.components.properties.Padding) r31, (com.revenuecat.purchases.paywalls.components.properties.Shape) r32, (com.revenuecat.purchases.paywalls.components.properties.Border) r33, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r34, (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl) r35, (java.lang.Boolean) r36, (com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages) r37, (kh.t0) r38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PartialCarouselComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PartialCarouselComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PartialCarouselComponent partialCarouselComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(partialCarouselComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PartialCarouselComponent.write$Self(partialCarouselComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
