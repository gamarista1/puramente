package com.revenuecat.purchases.paywalls;

import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Colors.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$Configuration$Colors$$serializer implements D {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 15);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, false);
        j0Var.l("text_1", false);
        j0Var.l("text_2", true);
        j0Var.l("text_3", true);
        j0Var.l("call_to_action_background", false);
        j0Var.l("call_to_action_foreground", false);
        j0Var.l("call_to_action_secondary_background", true);
        j0Var.l("accent_1", true);
        j0Var.l("accent_2", true);
        j0Var.l("accent_3", true);
        j0Var.l("close_button", true);
        j0Var.l("tier_control_background", true);
        j0Var.l("tier_control_foreground", true);
        j0Var.l("tier_control_selected_background", true);
        j0Var.l("tier_control_selected_foreground", true);
        descriptor = j0Var;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    public C5978b[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new C5978b[]{serializer, serializer, C5998a.u(serializer), C5998a.u(serializer), serializer, serializer, C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer), C5998a.u(serializer)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c6, code lost:
        r2 = r16;
        r3 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01d8, code lost:
        r2 = r16;
        r3 = r31;
        r31 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors deserialize(jh.e r41) {
        /*
            r40 = this;
            r0 = r41
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r40.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r6 = 11
            r7 = 10
            r8 = 9
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 3
            r13 = 8
            r14 = 4
            r15 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x007c
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r2 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            java.lang.Object r4 = r0.C(r1, r4, r2, r5)
            java.lang.Object r3 = r0.C(r1, r3, r2, r5)
            java.lang.Object r15 = r0.i(r1, r15, r2, r5)
            java.lang.Object r12 = r0.i(r1, r12, r2, r5)
            java.lang.Object r14 = r0.C(r1, r14, r2, r5)
            java.lang.Object r11 = r0.C(r1, r11, r2, r5)
            java.lang.Object r10 = r0.i(r1, r10, r2, r5)
            java.lang.Object r9 = r0.i(r1, r9, r2, r5)
            java.lang.Object r13 = r0.i(r1, r13, r2, r5)
            java.lang.Object r8 = r0.i(r1, r8, r2, r5)
            java.lang.Object r7 = r0.i(r1, r7, r2, r5)
            java.lang.Object r6 = r0.i(r1, r6, r2, r5)
            r18 = r3
            r3 = 12
            java.lang.Object r3 = r0.i(r1, r3, r2, r5)
            r17 = r3
            r3 = 13
            java.lang.Object r3 = r0.i(r1, r3, r2, r5)
            r16 = r4
            r4 = 14
            java.lang.Object r2 = r0.i(r1, r4, r2, r5)
            r4 = 32767(0x7fff, float:4.5916E-41)
            r20 = r3
            r22 = r4
            r4 = r16
            r3 = r18
            goto L_0x020e
        L_0x007c:
            r2 = r4
            r4 = 14
            r32 = r3
            r3 = r5
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r19 = r15
            r30 = r19
            r31 = r30
            r5 = r2
            r2 = r31
        L_0x0095:
            if (r32 == 0) goto L_0x01f0
            int r4 = r0.o(r1)
            switch(r4) {
                case -1: goto L_0x01e2;
                case 0: goto L_0x01c0;
                case 1: goto L_0x01a0;
                case 2: goto L_0x0186;
                case 3: goto L_0x0174;
                case 4: goto L_0x0162;
                case 5: goto L_0x0150;
                case 6: goto L_0x013e;
                case 7: goto L_0x012c;
                case 8: goto L_0x0119;
                case 9: goto L_0x0106;
                case 10: goto L_0x00f3;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00cd;
                case 13: goto L_0x00b4;
                case 14: goto L_0x00a4;
                default: goto L_0x009e;
            }
        L_0x009e:
            gh.p r0 = new gh.p
            r0.<init>((int) r4)
            throw r0
        L_0x00a4:
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r34 = r3
            r3 = 14
            java.lang.Object r2 = r0.i(r1, r3, r4, r2)
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r4 = r3
            r3 = r34
            goto L_0x0095
        L_0x00b4:
            r34 = r3
            r3 = 14
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r16 = r2
            r3 = r30
            r2 = 13
            java.lang.Object r30 = r0.i(r1, r2, r4, r3)
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
        L_0x00c6:
            r2 = r16
            r3 = r34
        L_0x00ca:
            r4 = 14
            goto L_0x0095
        L_0x00cd:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 13
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 12
            java.lang.Object r6 = r0.i(r1, r2, r4, r6)
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x00c6
        L_0x00e0:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 12
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 11
            java.lang.Object r7 = r0.i(r1, r2, r4, r7)
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x00c6
        L_0x00f3:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 11
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 10
            java.lang.Object r8 = r0.i(r1, r2, r4, r8)
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x00c6
        L_0x0106:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 10
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 9
            java.lang.Object r13 = r0.i(r1, r2, r4, r13)
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x00c6
        L_0x0119:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 9
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 8
            java.lang.Object r9 = r0.i(r1, r2, r4, r9)
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x00c6
        L_0x012c:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 8
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 7
            java.lang.Object r10 = r0.i(r1, r2, r4, r10)
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x00c6
        L_0x013e:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 7
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 6
            java.lang.Object r11 = r0.i(r1, r2, r4, r11)
            r5 = r5 | 64
            goto L_0x00c6
        L_0x0150:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 6
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 5
            java.lang.Object r14 = r0.C(r1, r2, r4, r14)
            r5 = r5 | 32
            goto L_0x00c6
        L_0x0162:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 5
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 4
            java.lang.Object r12 = r0.C(r1, r2, r4, r12)
            r5 = r5 | 16
            goto L_0x00c6
        L_0x0174:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 4
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 3
            java.lang.Object r15 = r0.i(r1, r2, r4, r15)
            r5 = r5 | 8
            goto L_0x00c6
        L_0x0186:
            r16 = r2
            r34 = r3
            r3 = r30
            r2 = 3
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r20 = r3
            r3 = r34
            r2 = 2
            java.lang.Object r3 = r0.i(r1, r2, r4, r3)
            r5 = r5 | 4
            r2 = r16
            r30 = r20
            goto L_0x00ca
        L_0x01a0:
            r16 = r2
            r20 = r30
            r2 = 2
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r2 = 1
            r39 = r31
            r31 = r3
            r3 = r39
            java.lang.Object r3 = r0.C(r1, r2, r4, r3)
            r5 = r5 | 2
            r2 = r16
            r4 = 14
            r39 = r31
            r31 = r3
            r3 = r39
            goto L_0x0095
        L_0x01c0:
            r16 = r2
            r20 = r30
            r2 = 1
            r39 = r31
            r31 = r3
            r3 = r39
            com.revenuecat.purchases.paywalls.PaywallColor$Serializer r4 = com.revenuecat.purchases.paywalls.PaywallColor.Serializer.INSTANCE
            r18 = r3
            r2 = r19
            r3 = 0
            java.lang.Object r19 = r0.C(r1, r3, r4, r2)
            r5 = r5 | 1
        L_0x01d8:
            r2 = r16
            r3 = r31
            r4 = 14
            r31 = r18
            goto L_0x0095
        L_0x01e2:
            r16 = r2
            r2 = r19
            r20 = r30
            r18 = r31
            r31 = r3
            r3 = 0
            r32 = r3
            goto L_0x01d8
        L_0x01f0:
            r16 = r2
            r2 = r19
            r20 = r30
            r18 = r31
            r31 = r3
            r4 = r2
            r22 = r5
            r17 = r6
            r6 = r7
            r7 = r8
            r8 = r13
            r2 = r16
            r3 = r18
            r13 = r9
            r9 = r10
            r10 = r11
            r11 = r14
            r14 = r12
            r12 = r15
            r15 = r31
        L_0x020e:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors r0 = new com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors
            r21 = r0
            r23 = r4
            com.revenuecat.purchases.paywalls.PaywallColor r23 = (com.revenuecat.purchases.paywalls.PaywallColor) r23
            r24 = r3
            com.revenuecat.purchases.paywalls.PaywallColor r24 = (com.revenuecat.purchases.paywalls.PaywallColor) r24
            r25 = r15
            com.revenuecat.purchases.paywalls.PaywallColor r25 = (com.revenuecat.purchases.paywalls.PaywallColor) r25
            r26 = r12
            com.revenuecat.purchases.paywalls.PaywallColor r26 = (com.revenuecat.purchases.paywalls.PaywallColor) r26
            r27 = r14
            com.revenuecat.purchases.paywalls.PaywallColor r27 = (com.revenuecat.purchases.paywalls.PaywallColor) r27
            r28 = r11
            com.revenuecat.purchases.paywalls.PaywallColor r28 = (com.revenuecat.purchases.paywalls.PaywallColor) r28
            r29 = r10
            com.revenuecat.purchases.paywalls.PaywallColor r29 = (com.revenuecat.purchases.paywalls.PaywallColor) r29
            r30 = r9
            com.revenuecat.purchases.paywalls.PaywallColor r30 = (com.revenuecat.purchases.paywalls.PaywallColor) r30
            r31 = r13
            com.revenuecat.purchases.paywalls.PaywallColor r31 = (com.revenuecat.purchases.paywalls.PaywallColor) r31
            r32 = r8
            com.revenuecat.purchases.paywalls.PaywallColor r32 = (com.revenuecat.purchases.paywalls.PaywallColor) r32
            r33 = r7
            com.revenuecat.purchases.paywalls.PaywallColor r33 = (com.revenuecat.purchases.paywalls.PaywallColor) r33
            r34 = r6
            com.revenuecat.purchases.paywalls.PaywallColor r34 = (com.revenuecat.purchases.paywalls.PaywallColor) r34
            r35 = r17
            com.revenuecat.purchases.paywalls.PaywallColor r35 = (com.revenuecat.purchases.paywalls.PaywallColor) r35
            r36 = r20
            com.revenuecat.purchases.paywalls.PaywallColor r36 = (com.revenuecat.purchases.paywalls.PaywallColor) r36
            r37 = r2
            com.revenuecat.purchases.paywalls.PaywallColor r37 = (com.revenuecat.purchases.paywalls.PaywallColor) r37
            r38 = 0
            r21.<init>((int) r22, (com.revenuecat.purchases.paywalls.PaywallColor) r23, (com.revenuecat.purchases.paywalls.PaywallColor) r24, (com.revenuecat.purchases.paywalls.PaywallColor) r25, (com.revenuecat.purchases.paywalls.PaywallColor) r26, (com.revenuecat.purchases.paywalls.PaywallColor) r27, (com.revenuecat.purchases.paywalls.PaywallColor) r28, (com.revenuecat.purchases.paywalls.PaywallColor) r29, (com.revenuecat.purchases.paywalls.PaywallColor) r30, (com.revenuecat.purchases.paywalls.PaywallColor) r31, (com.revenuecat.purchases.paywalls.PaywallColor) r32, (com.revenuecat.purchases.paywalls.PaywallColor) r33, (com.revenuecat.purchases.paywalls.PaywallColor) r34, (com.revenuecat.purchases.paywalls.PaywallColor) r35, (com.revenuecat.purchases.paywalls.PaywallColor) r36, (com.revenuecat.purchases.paywalls.PaywallColor) r37, (kh.t0) r38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$Configuration$Colors");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.Configuration.Colors colors) {
        C6496s.h(fVar, "encoder");
        C6496s.h(colors, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.Configuration.Colors.write$Self(colors, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
