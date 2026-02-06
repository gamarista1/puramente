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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarouselComponent$$serializer implements D {
    public static final CarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        CarouselComponent$$serializer carouselComponent$$serializer = new CarouselComponent$$serializer();
        INSTANCE = carouselComponent$$serializer;
        C6458j0 j0Var = new C6458j0("carousel", carouselComponent$$serializer, 17);
        j0Var.l("pages", false);
        j0Var.l("initial_page_index", true);
        j0Var.l("page_alignment", false);
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
        j0Var.l("overrides", true);
        descriptor = j0Var;
    }

    private CarouselComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = CarouselComponent.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[0];
        I i10 = I.f71604a;
        C5978b u10 = C5998a.u(i10);
        C5978b bVar2 = access$get$childSerializers$cp[2];
        C5978b u11 = C5998a.u(i10);
        C5978b u12 = C5998a.u(C.f71587a);
        C5978b u13 = C5998a.u(ColorScheme$$serializer.INSTANCE);
        C5978b u14 = C5998a.u(access$get$childSerializers$cp[7]);
        C5978b u15 = C5998a.u(access$get$childSerializers$cp[10]);
        C5978b u16 = C5998a.u(Border$$serializer.INSTANCE);
        C5978b u17 = C5998a.u(Shadow$$serializer.INSTANCE);
        C5978b u18 = C5998a.u(CarouselComponent$PageControl$$serializer.INSTANCE);
        C5978b u19 = C5998a.u(C6455i.f71663a);
        C5978b u20 = C5998a.u(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE);
        C5978b bVar3 = access$get$childSerializers$cp[16];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new C5978b[]{bVar, u10, bVar2, Size$$serializer.INSTANCE, u11, u12, u13, u14, padding$$serializer, padding$$serializer, u15, u16, u17, u18, u19, u20, bVar3};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.CarouselComponent deserialize(jh.e r41) {
        /*
            r40 = this;
            r0 = r41
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r40.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.CarouselComponent.$childSerializers
            boolean r3 = r0.p()
            r9 = 9
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
            if (r3 == 0) goto L_0x00b3
            r3 = r2[r7]
            java.lang.Object r3 = r0.C(r1, r7, r3, r8)
            kh.I r7 = kh.I.f71604a
            java.lang.Object r6 = r0.i(r1, r6, r7, r8)
            r15 = r2[r5]
            java.lang.Object r5 = r0.C(r1, r5, r15, r8)
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            java.lang.Object r12 = r0.C(r1, r12, r15, r8)
            java.lang.Object r7 = r0.i(r1, r14, r7, r8)
            kh.C r14 = kh.C.f71587a
            java.lang.Object r11 = r0.i(r1, r11, r14, r8)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r10 = r0.i(r1, r10, r14, r8)
            r14 = r2[r4]
            java.lang.Object r4 = r0.i(r1, r4, r14, r8)
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r14 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r13, r14, r8)
            java.lang.Object r9 = r0.C(r1, r9, r14, r8)
            r14 = 10
            r15 = r2[r14]
            java.lang.Object r14 = r0.i(r1, r14, r15, r8)
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r20 = r3
            r3 = 11
            java.lang.Object r3 = r0.i(r1, r3, r15, r8)
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r15 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r19 = r3
            r3 = 12
            java.lang.Object r3 = r0.i(r1, r3, r15, r8)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer r15 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.INSTANCE
            r18 = r3
            r3 = 13
            java.lang.Object r3 = r0.i(r1, r3, r15, r8)
            kh.i r15 = kh.C6455i.f71663a
            r17 = r3
            r3 = 14
            java.lang.Object r3 = r0.i(r1, r3, r15, r8)
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer r15 = com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer.INSTANCE
            r16 = r3
            r3 = 15
            java.lang.Object r3 = r0.i(r1, r3, r15, r8)
            r15 = 16
            r2 = r2[r15]
            java.lang.Object r2 = r0.C(r1, r15, r2, r8)
            r8 = 131071(0x1ffff, float:1.8367E-40)
            r15 = r19
            r39 = r4
            r4 = r3
            r3 = r20
            r20 = r8
            r8 = r14
            r14 = r11
            r11 = r10
            r10 = r39
            goto L_0x0321
        L_0x00b3:
            r15 = 16
            r36 = r6
            r3 = r8
            r4 = r3
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r30 = r14
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r8 = r7
            r7 = r35
        L_0x00d0:
            if (r36 == 0) goto L_0x02fd
            int r15 = r0.o(r1)
            switch(r15) {
                case -1: goto L_0x02dd;
                case 0: goto L_0x02b8;
                case 1: goto L_0x0294;
                case 2: goto L_0x0279;
                case 3: goto L_0x025d;
                case 4: goto L_0x0241;
                case 5: goto L_0x0225;
                case 6: goto L_0x0209;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01d0;
                case 9: goto L_0x01b2;
                case 10: goto L_0x0196;
                case 11: goto L_0x0175;
                case 12: goto L_0x0156;
                case 13: goto L_0x0139;
                case 14: goto L_0x0118;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00df;
                default: goto L_0x00d9;
            }
        L_0x00d9:
            gh.p r0 = new gh.p
            r0.<init>((int) r15)
            throw r0
        L_0x00df:
            r37 = r3
            r15 = 16
            r3 = r2[r15]
            r38 = r7
            r7 = r35
            java.lang.Object r35 = r0.C(r1, r15, r3, r7)
            r3 = 65536(0x10000, float:9.18355E-41)
            r8 = r8 | r3
            r3 = r37
            r7 = r38
            goto L_0x00d0
        L_0x00f5:
            r37 = r3
            r38 = r7
            r7 = r35
            r15 = 16
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer r3 = com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages$$serializer.INSTANCE
            r15 = r34
            r34 = r7
            r7 = 15
            java.lang.Object r3 = r0.i(r1, r7, r3, r15)
            r15 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r15
            r35 = r34
            r7 = r38
            r15 = 16
            r34 = r3
            r3 = r37
            goto L_0x00d0
        L_0x0118:
            r37 = r3
            r38 = r7
            r15 = r34
            r34 = r35
            r7 = 15
            kh.i r3 = kh.C6455i.f71663a
            r16 = r15
            r7 = r33
            r15 = 14
            java.lang.Object r33 = r0.i(r1, r15, r3, r7)
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0130:
            r3 = r37
            r7 = r38
        L_0x0134:
            r15 = 16
            r34 = r16
            goto L_0x00d0
        L_0x0139:
            r37 = r3
            r38 = r7
            r7 = r33
            r16 = r34
            r34 = r35
            r15 = 14
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer r3 = com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl$$serializer.INSTANCE
            r17 = r7
            r15 = r32
            r7 = 13
            java.lang.Object r32 = r0.i(r1, r7, r3, r15)
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r33 = r17
            goto L_0x0130
        L_0x0156:
            r37 = r3
            r38 = r7
            r15 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 13
            com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE
            r18 = r15
            r7 = r31
            r15 = 12
            java.lang.Object r31 = r0.i(r1, r15, r3, r7)
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r32 = r18
            goto L_0x0130
        L_0x0175:
            r37 = r3
            r38 = r7
            r7 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r15 = 12
            com.revenuecat.purchases.paywalls.components.properties.Border$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE
            r19 = r7
            r15 = r30
            r7 = 11
            java.lang.Object r30 = r0.i(r1, r7, r3, r15)
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r31 = r19
            goto L_0x0130
        L_0x0196:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r3 = 10
            r7 = r2[r3]
            java.lang.Object r9 = r0.i(r1, r3, r7, r9)
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x0130
        L_0x01b2:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r3 = 10
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r3 = 9
            java.lang.Object r13 = r0.C(r1, r3, r7, r13)
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x0130
        L_0x01d0:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r3 = 9
            com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer r7 = com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE
            r3 = 8
            java.lang.Object r4 = r0.C(r1, r3, r7, r4)
            r8 = r8 | 256(0x100, float:3.59E-43)
            goto L_0x0130
        L_0x01ee:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 7
            r3 = r2[r7]
            java.lang.Object r10 = r0.i(r1, r7, r3, r10)
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x0130
        L_0x0209:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 7
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            r7 = 6
            java.lang.Object r11 = r0.i(r1, r7, r3, r11)
            r8 = r8 | 64
            goto L_0x0130
        L_0x0225:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 6
            kh.C r3 = kh.C.f71587a
            r7 = 5
            java.lang.Object r14 = r0.i(r1, r7, r3, r14)
            r8 = r8 | 32
            goto L_0x0130
        L_0x0241:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 5
            kh.I r3 = kh.I.f71604a
            r7 = 4
            java.lang.Object r12 = r0.i(r1, r7, r3, r12)
            r8 = r8 | 16
            goto L_0x0130
        L_0x025d:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 4
            com.revenuecat.purchases.paywalls.components.properties.Size$$serializer r3 = com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE
            r7 = 3
            java.lang.Object r5 = r0.C(r1, r7, r3, r5)
            r8 = r8 | 8
            goto L_0x0130
        L_0x0279:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r3 = 2
            r7 = r2[r3]
            java.lang.Object r6 = r0.C(r1, r3, r7, r6)
            r8 = r8 | 4
            goto L_0x0130
        L_0x0294:
            r37 = r3
            r38 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r3 = 2
            kh.I r7 = kh.I.f71604a
            r21 = r4
            r4 = r38
            r3 = 1
            java.lang.Object r7 = r0.i(r1, r3, r7, r4)
            r8 = r8 | 2
            r4 = r21
            r3 = r37
            goto L_0x0134
        L_0x02b8:
            r37 = r3
            r21 = r4
            r4 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 0
            r3 = r2[r7]
            r38 = r2
            r2 = r37
            java.lang.Object r3 = r0.C(r1, r7, r3, r2)
            r8 = r8 | 1
            r7 = r4
            r4 = r21
            r2 = r38
            goto L_0x0134
        L_0x02dd:
            r38 = r2
            r2 = r3
            r21 = r4
            r4 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r7 = 0
            r36 = r7
            r2 = r38
            r15 = 16
            r7 = r4
            r34 = r16
            r4 = r21
            goto L_0x00d0
        L_0x02fd:
            r2 = r3
            r21 = r4
            r4 = r7
            r15 = r30
            r19 = r31
            r18 = r32
            r17 = r33
            r16 = r34
            r34 = r35
            r20 = r8
            r8 = r9
            r7 = r12
            r9 = r13
            r13 = r21
            r2 = r34
            r12 = r5
            r5 = r6
            r6 = r4
            r4 = r16
            r16 = r17
            r17 = r18
            r18 = r19
        L_0x0321:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.CarouselComponent r0 = new com.revenuecat.purchases.paywalls.components.CarouselComponent
            r19 = r0
            r21 = r3
            java.util.List r21 = (java.util.List) r21
            r22 = r6
            java.lang.Integer r22 = (java.lang.Integer) r22
            r23 = r5
            com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment r23 = (com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment) r23
            r24 = r12
            com.revenuecat.purchases.paywalls.components.properties.Size r24 = (com.revenuecat.purchases.paywalls.components.properties.Size) r24
            r25 = r7
            java.lang.Integer r25 = (java.lang.Integer) r25
            r26 = r14
            java.lang.Float r26 = (java.lang.Float) r26
            r27 = r11
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r27 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r27
            r28 = r10
            com.revenuecat.purchases.paywalls.components.common.Background r28 = (com.revenuecat.purchases.paywalls.components.common.Background) r28
            r29 = r13
            com.revenuecat.purchases.paywalls.components.properties.Padding r29 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r29
            r30 = r9
            com.revenuecat.purchases.paywalls.components.properties.Padding r30 = (com.revenuecat.purchases.paywalls.components.properties.Padding) r30
            r31 = r8
            com.revenuecat.purchases.paywalls.components.properties.Shape r31 = (com.revenuecat.purchases.paywalls.components.properties.Shape) r31
            r32 = r15
            com.revenuecat.purchases.paywalls.components.properties.Border r32 = (com.revenuecat.purchases.paywalls.components.properties.Border) r32
            r33 = r18
            com.revenuecat.purchases.paywalls.components.properties.Shadow r33 = (com.revenuecat.purchases.paywalls.components.properties.Shadow) r33
            r34 = r17
            com.revenuecat.purchases.paywalls.components.CarouselComponent$PageControl r34 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl) r34
            r35 = r16
            java.lang.Boolean r35 = (java.lang.Boolean) r35
            r36 = r4
            com.revenuecat.purchases.paywalls.components.CarouselComponent$AutoAdvancePages r36 = (com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages) r36
            r37 = r2
            java.util.List r37 = (java.util.List) r37
            r38 = 0
            r19.<init>((int) r20, (java.util.List) r21, (java.lang.Integer) r22, (com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment) r23, (com.revenuecat.purchases.paywalls.components.properties.Size) r24, (java.lang.Integer) r25, (java.lang.Float) r26, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r27, (com.revenuecat.purchases.paywalls.components.common.Background) r28, (com.revenuecat.purchases.paywalls.components.properties.Padding) r29, (com.revenuecat.purchases.paywalls.components.properties.Padding) r30, (com.revenuecat.purchases.paywalls.components.properties.Shape) r31, (com.revenuecat.purchases.paywalls.components.properties.Border) r32, (com.revenuecat.purchases.paywalls.components.properties.Shadow) r33, (com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl) r34, (java.lang.Boolean) r35, (com.revenuecat.purchases.paywalls.components.CarouselComponent.AutoAdvancePages) r36, (java.util.List) r37, (kh.t0) r38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.CarouselComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, CarouselComponent carouselComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(carouselComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        CarouselComponent.write$Self(carouselComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
