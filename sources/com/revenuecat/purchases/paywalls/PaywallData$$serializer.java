package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.I;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$$serializer implements D {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 8);
        j0Var.l("template_name", false);
        j0Var.l("config", false);
        j0Var.l("asset_base_url", false);
        j0Var.l("revision", true);
        j0Var.l("localized_strings", false);
        j0Var.l("localized_strings_by_tier", true);
        j0Var.l("zero_decimal_place_countries", true);
        j0Var.l("default_locale", true);
        descriptor = j0Var;
    }

    private PaywallData$$serializer() {
    }

    public C5978b[] childSerializers() {
        C5978b[] access$get$childSerializers$cp = PaywallData.$childSerializers;
        x0 x0Var = x0.f71726a;
        return new C5978b[]{x0Var, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, I.f71604a, access$get$childSerializers$cp[4], access$get$childSerializers$cp[5], GoogleListSerializer.INSTANCE, C5998a.u(x0Var)};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r4 = 7;
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r15 = r15;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r15 = r15;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r15 = r15;
        r7 = r7;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r7 = r7;
        r6 = r6;
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData deserialize(jh.e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r18.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.PaywallData.$childSerializers
            boolean r3 = r0.p()
            r4 = 7
            r5 = 6
            r6 = 3
            r7 = 2
            r8 = 5
            r9 = 4
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x005b
            java.lang.String r3 = r0.A(r1, r11)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer r11 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.INSTANCE
            java.lang.Object r10 = r0.C(r1, r10, r11, r12)
            com.revenuecat.purchases.utils.serializers.URLSerializer r11 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r7, r11, r12)
            int r6 = r0.E(r1, r6)
            r11 = r2[r9]
            java.lang.Object r9 = r0.C(r1, r9, r11, r12)
            r2 = r2[r8]
            java.lang.Object r2 = r0.C(r1, r8, r2, r12)
            com.revenuecat.purchases.utils.serializers.GoogleListSerializer r8 = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.INSTANCE
            java.lang.Object r5 = r0.C(r1, r5, r8, r12)
            kh.x0 r8 = kh.x0.f71726a
            java.lang.Object r4 = r0.i(r1, r4, r8, r12)
            r8 = 255(0xff, float:3.57E-43)
            r15 = r7
            r7 = r5
            r5 = r3
            r17 = r6
            r6 = r4
            r4 = r8
            r8 = r17
            goto L_0x00d3
        L_0x005b:
            r16 = r10
            r3 = r11
            r6 = r12
            r7 = r6
            r10 = r7
            r13 = r10
            r14 = r13
            r15 = r14
            r11 = r15
            r12 = r3
        L_0x0066:
            if (r16 == 0) goto L_0x00cd
            int r9 = r0.o(r1)
            switch(r9) {
                case -1: goto L_0x00c8;
                case 0: goto L_0x00be;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00a5;
                case 3: goto L_0x009c;
                case 4: goto L_0x0091;
                case 5: goto L_0x0088;
                case 6: goto L_0x007f;
                case 7: goto L_0x0075;
                default: goto L_0x006f;
            }
        L_0x006f:
            gh.p r0 = new gh.p
            r0.<init>((int) r9)
            throw r0
        L_0x0075:
            kh.x0 r9 = kh.x0.f71726a
            java.lang.Object r6 = r0.i(r1, r4, r9, r6)
            r12 = r12 | 128(0x80, float:1.794E-43)
        L_0x007d:
            r9 = 4
            goto L_0x0066
        L_0x007f:
            com.revenuecat.purchases.utils.serializers.GoogleListSerializer r9 = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r5, r9, r7)
            r12 = r12 | 64
            goto L_0x007d
        L_0x0088:
            r9 = r2[r8]
            java.lang.Object r10 = r0.C(r1, r8, r9, r10)
            r12 = r12 | 32
            goto L_0x007d
        L_0x0091:
            r9 = 4
            r4 = r2[r9]
            java.lang.Object r11 = r0.C(r1, r9, r4, r11)
            r12 = r12 | 16
        L_0x009a:
            r4 = 7
            goto L_0x0066
        L_0x009c:
            r4 = 3
            r9 = 4
            int r3 = r0.E(r1, r4)
            r12 = r12 | 8
            goto L_0x009a
        L_0x00a5:
            r9 = 4
            com.revenuecat.purchases.utils.serializers.URLSerializer r4 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            r5 = 2
            java.lang.Object r15 = r0.C(r1, r5, r4, r15)
            r12 = r12 | 4
        L_0x00af:
            r4 = 7
            r5 = 6
            goto L_0x0066
        L_0x00b2:
            r5 = 2
            r9 = 4
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer r4 = com.revenuecat.purchases.paywalls.PaywallData$Configuration$$serializer.INSTANCE
            r5 = 1
            java.lang.Object r14 = r0.C(r1, r5, r4, r14)
            r12 = r12 | 2
            goto L_0x00af
        L_0x00be:
            r4 = 0
            r5 = 1
            r9 = 4
            java.lang.String r13 = r0.A(r1, r4)
            r12 = r12 | 1
            goto L_0x00af
        L_0x00c8:
            r4 = 0
            r9 = 4
            r16 = r4
            goto L_0x009a
        L_0x00cd:
            r8 = r3
            r2 = r10
            r9 = r11
            r4 = r12
            r5 = r13
            r10 = r14
        L_0x00d3:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.PaywallData r0 = new com.revenuecat.purchases.paywalls.PaywallData
            r1 = r10
            com.revenuecat.purchases.paywalls.PaywallData$Configuration r1 = (com.revenuecat.purchases.paywalls.PaywallData.Configuration) r1
            r10 = r15
            java.net.URL r10 = (java.net.URL) r10
            java.util.Map r9 = (java.util.Map) r9
            java.util.Map r2 = (java.util.Map) r2
            r11 = r7
            java.util.List r11 = (java.util.List) r11
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            r3 = r0
            r6 = r1
            r7 = r10
            r10 = r2
            r3.<init>((int) r4, (java.lang.String) r5, (com.revenuecat.purchases.paywalls.PaywallData.Configuration) r6, (java.net.URL) r7, (int) r8, (java.util.Map) r9, (java.util.Map) r10, (java.util.List) r11, (java.lang.String) r12, (kh.t0) r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData paywallData) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywallData, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.write$Self(paywallData, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
