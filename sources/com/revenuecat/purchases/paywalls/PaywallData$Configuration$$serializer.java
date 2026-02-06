package com.revenuecat.purchases.paywalls;

import com.BV.LinearGradient.LinearGradientManager;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6455i;
import kh.C6458j0;
import kh.D;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$Configuration$$serializer implements D {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        j0Var.l("packages", true);
        j0Var.l("default_package", true);
        j0Var.l("images_webp", true);
        j0Var.l("images", true);
        j0Var.l("images_by_tier", true);
        j0Var.l("blurred_background_image", true);
        j0Var.l("display_restore_purchases", true);
        j0Var.l("tos_url", true);
        j0Var.l("privacy_url", true);
        j0Var.l(LinearGradientManager.PROP_COLORS, false);
        j0Var.l("colors_by_tier", true);
        j0Var.l("tiers", true);
        j0Var.l("default_tier", true);
        descriptor = j0Var;
    }

    private PaywallData$Configuration$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PaywallData.Configuration.$childSerializers;
        C5978b bVar = access$get$childSerializers$cp[0];
        x0 x0Var = x0.f71726a;
        C5978b u10 = C5998a.u(x0Var);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        C5978b u11 = C5998a.u(paywallData$Configuration$Images$$serializer);
        C5978b u12 = C5998a.u(paywallData$Configuration$Images$$serializer);
        C5978b u13 = C5998a.u(access$get$childSerializers$cp[4]);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        C5978b u14 = C5998a.u(optionalURLSerializer);
        C5978b u15 = C5998a.u(optionalURLSerializer);
        C5978b u16 = C5998a.u(access$get$childSerializers$cp[10]);
        C5978b u17 = C5998a.u(access$get$childSerializers$cp[11]);
        C5978b u18 = C5998a.u(x0Var);
        C6455i iVar = C6455i.f71663a;
        return new C5978b[]{bVar, u10, u11, u12, u13, iVar, iVar, u14, u15, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, u16, u17, u18};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00bf, code lost:
        r12 = r31;
        r14 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0155, code lost:
        r5 = r19;
        r12 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0159, code lost:
        r19 = r3;
        r14 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r14 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r14 = r14;
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.Configuration deserialize(jh.e r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r32.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.PaywallData.Configuration.$childSerializers
            boolean r3 = r0.p()
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 2
            r14 = 4
            r15 = 1
            r4 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0080
            r3 = r2[r4]
            java.lang.Object r3 = r0.C(r1, r4, r3, r12)
            kh.x0 r4 = kh.x0.f71726a
            java.lang.Object r15 = r0.i(r1, r15, r4, r12)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer r13 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE
            java.lang.Object r11 = r0.i(r1, r11, r13, r12)
            java.lang.Object r9 = r0.i(r1, r9, r13, r12)
            r13 = r2[r14]
            java.lang.Object r13 = r0.i(r1, r14, r13, r12)
            boolean r8 = r0.s(r1, r8)
            boolean r7 = r0.s(r1, r7)
            com.revenuecat.purchases.utils.serializers.OptionalURLSerializer r14 = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.INSTANCE
            java.lang.Object r6 = r0.i(r1, r6, r14, r12)
            java.lang.Object r10 = r0.i(r1, r10, r14, r12)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer r14 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r14, r12)
            r17 = r3
            r14 = 10
            r3 = r2[r14]
            java.lang.Object r3 = r0.i(r1, r14, r3, r12)
            r14 = 11
            r2 = r2[r14]
            java.lang.Object r2 = r0.i(r1, r14, r2, r12)
            r14 = 12
            java.lang.Object r4 = r0.i(r1, r14, r4, r12)
            r12 = 8191(0x1fff, float:1.1478E-41)
            r14 = r6
            r23 = r7
            r22 = r8
            r16 = r12
            r6 = r3
            r3 = r17
            goto L_0x01a1
        L_0x0080:
            r3 = 12
            r13 = r4
            r5 = r12
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r14 = r11
            r18 = r14
            r19 = r18
            r29 = r15
            r15 = r19
            r12 = r13
        L_0x0094:
            if (r29 == 0) goto L_0x0189
            int r3 = r0.o(r1)
            switch(r3) {
                case -1: goto L_0x0175;
                case 0: goto L_0x015d;
                case 1: goto L_0x0143;
                case 2: goto L_0x0133;
                case 3: goto L_0x0124;
                case 4: goto L_0x0116;
                case 5: goto L_0x0108;
                case 6: goto L_0x00fd;
                case 7: goto L_0x00ef;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00d1;
                case 10: goto L_0x00c4;
                case 11: goto L_0x00b3;
                case 12: goto L_0x00a3;
                default: goto L_0x009d;
            }
        L_0x009d:
            gh.p r0 = new gh.p
            r0.<init>((int) r3)
            throw r0
        L_0x00a3:
            kh.x0 r3 = kh.x0.f71726a
            r31 = r12
            r12 = 12
            java.lang.Object r5 = r0.i(r1, r12, r3, r5)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r3 = r12
            r12 = r31
            goto L_0x0094
        L_0x00b3:
            r31 = r12
            r3 = 11
            r12 = r2[r3]
            java.lang.Object r10 = r0.i(r1, r3, r12, r10)
            r4 = r4 | 2048(0x800, float:2.87E-42)
        L_0x00bf:
            r12 = r31
        L_0x00c1:
            r3 = 12
            goto L_0x0094
        L_0x00c4:
            r31 = r12
            r12 = 10
            r3 = r2[r12]
            java.lang.Object r6 = r0.i(r1, r12, r3, r6)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            goto L_0x00bf
        L_0x00d1:
            r31 = r12
            r12 = 10
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer r3 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation$$serializer.INSTANCE
            r12 = 9
            java.lang.Object r7 = r0.C(r1, r12, r3, r7)
            r4 = r4 | 512(0x200, float:7.175E-43)
            goto L_0x00bf
        L_0x00e0:
            r31 = r12
            r12 = 9
            com.revenuecat.purchases.utils.serializers.OptionalURLSerializer r3 = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.INSTANCE
            r12 = 8
            java.lang.Object r8 = r0.i(r1, r12, r3, r8)
            r4 = r4 | 256(0x100, float:3.59E-43)
            goto L_0x00bf
        L_0x00ef:
            r31 = r12
            r12 = 8
            com.revenuecat.purchases.utils.serializers.OptionalURLSerializer r3 = com.revenuecat.purchases.utils.serializers.OptionalURLSerializer.INSTANCE
            r12 = 7
            java.lang.Object r14 = r0.i(r1, r12, r3, r14)
            r4 = r4 | 128(0x80, float:1.794E-43)
            goto L_0x00bf
        L_0x00fd:
            r3 = 6
            r12 = 7
            boolean r25 = r0.s(r1, r3)
            r4 = r4 | 64
            r12 = r25
            goto L_0x00c1
        L_0x0108:
            r31 = r12
            r3 = 6
            r12 = 7
            r13 = 5
            boolean r24 = r0.s(r1, r13)
            r4 = r4 | 32
            r13 = r24
            goto L_0x00bf
        L_0x0116:
            r31 = r12
            r3 = 4
            r23 = 5
            r12 = r2[r3]
            java.lang.Object r9 = r0.i(r1, r3, r12, r9)
            r4 = r4 | 16
            goto L_0x00bf
        L_0x0124:
            r31 = r12
            r3 = 4
            r23 = 5
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer r12 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r11 = r0.i(r1, r3, r12, r11)
            r4 = r4 | 8
            goto L_0x00bf
        L_0x0133:
            r31 = r12
            r3 = 3
            r23 = 5
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer r12 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r15 = r0.i(r1, r3, r12, r15)
            r4 = r4 | 4
            goto L_0x00bf
        L_0x0143:
            r31 = r12
            r3 = 2
            r23 = 5
            kh.x0 r12 = kh.x0.f71726a
            r3 = r19
            r19 = r5
            r5 = 1
            java.lang.Object r3 = r0.i(r1, r5, r12, r3)
            r4 = r4 | 2
        L_0x0155:
            r5 = r19
            r12 = r31
        L_0x0159:
            r19 = r3
            goto L_0x00c1
        L_0x015d:
            r31 = r12
            r3 = r19
            r12 = 0
            r23 = 5
            r19 = r5
            r5 = r2[r12]
            r33 = r2
            r2 = r18
            java.lang.Object r18 = r0.C(r1, r12, r5, r2)
            r4 = r4 | 1
            r2 = r33
            goto L_0x0155
        L_0x0175:
            r33 = r2
            r31 = r12
            r2 = r18
            r3 = r19
            r12 = 0
            r23 = 5
            r19 = r5
            r29 = r12
            r12 = r31
            r2 = r33
            goto L_0x0159
        L_0x0189:
            r31 = r12
            r2 = r18
            r3 = r19
            r19 = r5
            r16 = r4
            r5 = r7
            r22 = r13
            r4 = r19
            r23 = r31
            r13 = r9
            r9 = r11
            r11 = r15
            r15 = r3
            r3 = r2
            r2 = r10
            r10 = r8
        L_0x01a1:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration r0 = new com.revenuecat.purchases.paywalls.PaywallData$Configuration
            r17 = r3
            java.util.List r17 = (java.util.List) r17
            r18 = r15
            java.lang.String r18 = (java.lang.String) r18
            r19 = r11
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images r19 = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r19
            r20 = r9
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images r20 = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r20
            r21 = r13
            java.util.Map r21 = (java.util.Map) r21
            r24 = r14
            java.net.URL r24 = (java.net.URL) r24
            r25 = r10
            java.net.URL r25 = (java.net.URL) r25
            r26 = r5
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$ColorInformation r26 = (com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation) r26
            r27 = r6
            java.util.Map r27 = (java.util.Map) r27
            r28 = r2
            java.util.List r28 = (java.util.List) r28
            r29 = r4
            java.lang.String r29 = (java.lang.String) r29
            r30 = 0
            r15 = r0
            r15.<init>((int) r16, (java.util.List) r17, (java.lang.String) r18, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r19, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images) r20, (java.util.Map) r21, (boolean) r22, (boolean) r23, (java.net.URL) r24, (java.net.URL) r25, (com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation) r26, (java.util.Map) r27, (java.util.List) r28, (java.lang.String) r29, (kh.t0) r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$Configuration");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.Configuration configuration) {
        C6496s.h(fVar, "encoder");
        C6496s.h(configuration, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.Configuration.write$Self(configuration, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
