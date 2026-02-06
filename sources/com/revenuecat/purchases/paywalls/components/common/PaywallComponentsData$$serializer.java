package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import gh.C5978b;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/PaywallComponentsData.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentsData$$serializer implements D {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 7);
        j0Var.l("template_name", false);
        j0Var.l("asset_base_url", false);
        j0Var.l("components_config", false);
        j0Var.l("components_localizations", false);
        j0Var.l("default_locale", false);
        j0Var.l("revision", true);
        j0Var.l("zero_decimal_place_countries", true);
        descriptor = j0Var;
    }

    private PaywallComponentsData$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{x0.f71726a, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, PaywallComponentsData.$childSerializers[3], LocaleId$$serializer.INSTANCE, I.f71604a, GoogleListSerializer.INSTANCE};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
        r9 = r4;
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData deserialize(jh.e r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r18.getDescriptor()
            jh.c r0 = r0.b(r1)
            gh.b[] r2 = com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData.$childSerializers
            boolean r3 = r0.p()
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 3
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = r0.A(r1, r10)
            com.revenuecat.purchases.utils.serializers.URLSerializer r10 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r9 = r0.C(r1, r9, r10, r11)
            com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer r10 = com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r7, r10, r11)
            r2 = r2[r8]
            java.lang.Object r2 = r0.C(r1, r8, r2, r11)
            com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer r8 = com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer.INSTANCE
            java.lang.Object r6 = r0.C(r1, r6, r8, r11)
            int r5 = r0.E(r1, r5)
            com.revenuecat.purchases.utils.serializers.GoogleListSerializer r8 = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.INSTANCE
            java.lang.Object r4 = r0.C(r1, r4, r8, r11)
            r8 = 127(0x7f, float:1.78E-43)
            r13 = r4
            r10 = r5
            r4 = r8
            r5 = r3
            goto L_0x00b5
        L_0x004f:
            r17 = r9
            r14 = r10
            r16 = r14
            r3 = r11
            r10 = r3
            r12 = r10
            r13 = r12
            r15 = r13
        L_0x0059:
            if (r17 == 0) goto L_0x00ad
            int r9 = r0.o(r1)
            switch(r9) {
                case -1: goto L_0x00a9;
                case 0: goto L_0x00a0;
                case 1: goto L_0x0094;
                case 2: goto L_0x008b;
                case 3: goto L_0x0082;
                case 4: goto L_0x0079;
                case 5: goto L_0x0072;
                case 6: goto L_0x0068;
                default: goto L_0x0062;
            }
        L_0x0062:
            gh.p r0 = new gh.p
            r0.<init>((int) r9)
            throw r0
        L_0x0068:
            com.revenuecat.purchases.utils.serializers.GoogleListSerializer r9 = com.revenuecat.purchases.utils.serializers.GoogleListSerializer.INSTANCE
            java.lang.Object r13 = r0.C(r1, r4, r9, r13)
            r16 = r16 | 64
        L_0x0070:
            r9 = 1
            goto L_0x0059
        L_0x0072:
            int r14 = r0.E(r1, r5)
            r16 = r16 | 32
            goto L_0x0070
        L_0x0079:
            com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer r9 = com.revenuecat.purchases.paywalls.components.common.LocaleId$$serializer.INSTANCE
            java.lang.Object r15 = r0.C(r1, r6, r9, r15)
            r16 = r16 | 16
            goto L_0x0070
        L_0x0082:
            r9 = r2[r8]
            java.lang.Object r3 = r0.C(r1, r8, r9, r3)
            r16 = r16 | 8
            goto L_0x0070
        L_0x008b:
            com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer r9 = com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer.INSTANCE
            java.lang.Object r11 = r0.C(r1, r7, r9, r11)
            r16 = r16 | 4
            goto L_0x0070
        L_0x0094:
            com.revenuecat.purchases.utils.serializers.URLSerializer r9 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            r4 = 1
            java.lang.Object r10 = r0.C(r1, r4, r9, r10)
            r16 = r16 | 2
        L_0x009d:
            r9 = r4
            r4 = 6
            goto L_0x0059
        L_0x00a0:
            r4 = 1
            r9 = 0
            java.lang.String r12 = r0.A(r1, r9)
            r16 = r16 | 1
            goto L_0x009d
        L_0x00a9:
            r9 = 0
            r17 = r9
            goto L_0x0070
        L_0x00ad:
            r2 = r3
            r9 = r10
            r7 = r11
            r5 = r12
            r10 = r14
            r6 = r15
            r4 = r16
        L_0x00b5:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData r0 = new com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData
            r1 = r9
            java.net.URL r1 = (java.net.URL) r1
            com.revenuecat.purchases.paywalls.components.common.ComponentsConfig r7 = (com.revenuecat.purchases.paywalls.components.common.ComponentsConfig) r7
            r8 = r2
            java.util.Map r8 = (java.util.Map) r8
            com.revenuecat.purchases.paywalls.components.common.LocaleId r6 = (com.revenuecat.purchases.paywalls.components.common.LocaleId) r6
            if (r6 == 0) goto L_0x00cc
            java.lang.String r11 = r6.m91unboximpl()
            r9 = r11
            goto L_0x00cd
        L_0x00cc:
            r9 = 0
        L_0x00cd:
            r11 = r13
            java.util.List r11 = (java.util.List) r11
            r12 = 0
            r13 = 0
            r3 = r0
            r6 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallComponentsData paywallComponentsData) {
        C6496s.h(fVar, "encoder");
        C6496s.h(paywallComponentsData, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallComponentsData.write$Self(paywallComponentsData, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
