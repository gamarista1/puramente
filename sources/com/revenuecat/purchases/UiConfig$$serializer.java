package com.revenuecat.purchases;

import com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/UiConfig;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/UiConfig;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/UiConfig;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UiConfig$$serializer implements D {
    public static final UiConfig$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        UiConfig$$serializer uiConfig$$serializer = new UiConfig$$serializer();
        INSTANCE = uiConfig$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.UiConfig", uiConfig$$serializer, 3);
        j0Var.l("app", true);
        j0Var.l("localizations", true);
        j0Var.l("variable_config", true);
        descriptor = j0Var;
    }

    private UiConfig$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{UiConfig$AppConfig$$serializer.INSTANCE, LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, UiConfig$VariableConfig$$serializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.UiConfig deserialize(jh.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            ih.f r0 = r12.getDescriptor()
            jh.c r13 = r13.b(r0)
            boolean r1 = r13.p()
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x002c
            com.revenuecat.purchases.UiConfig$AppConfig$$serializer r1 = com.revenuecat.purchases.UiConfig$AppConfig$$serializer.INSTANCE
            java.lang.Object r1 = r13.C(r0, r4, r1, r5)
            com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer r4 = com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer.INSTANCE
            java.lang.Object r3 = r13.C(r0, r3, r4, r5)
            com.revenuecat.purchases.UiConfig$VariableConfig$$serializer r4 = com.revenuecat.purchases.UiConfig$VariableConfig$$serializer.INSTANCE
            java.lang.Object r2 = r13.C(r0, r2, r4, r5)
            r4 = 7
            r5 = r4
            goto L_0x0067
        L_0x002c:
            r8 = r3
            r1 = r4
            r6 = r5
            r7 = r6
        L_0x0030:
            if (r8 == 0) goto L_0x0062
            int r9 = r13.o(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0060
            if (r9 == 0) goto L_0x0057
            if (r9 == r3) goto L_0x004e
            if (r9 != r2) goto L_0x0048
            com.revenuecat.purchases.UiConfig$VariableConfig$$serializer r9 = com.revenuecat.purchases.UiConfig$VariableConfig$$serializer.INSTANCE
            java.lang.Object r7 = r13.C(r0, r2, r9, r7)
            r1 = r1 | 4
            goto L_0x0030
        L_0x0048:
            gh.p r13 = new gh.p
            r13.<init>((int) r9)
            throw r13
        L_0x004e:
            com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer r9 = com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer.INSTANCE
            java.lang.Object r6 = r13.C(r0, r3, r9, r6)
            r1 = r1 | 2
            goto L_0x0030
        L_0x0057:
            com.revenuecat.purchases.UiConfig$AppConfig$$serializer r9 = com.revenuecat.purchases.UiConfig$AppConfig$$serializer.INSTANCE
            java.lang.Object r5 = r13.C(r0, r4, r9, r5)
            r1 = r1 | 1
            goto L_0x0030
        L_0x0060:
            r8 = r4
            goto L_0x0030
        L_0x0062:
            r3 = r6
            r2 = r7
            r11 = r5
            r5 = r1
            r1 = r11
        L_0x0067:
            r13.c(r0)
            com.revenuecat.purchases.UiConfig r13 = new com.revenuecat.purchases.UiConfig
            r6 = r1
            com.revenuecat.purchases.UiConfig$AppConfig r6 = (com.revenuecat.purchases.UiConfig.AppConfig) r6
            r7 = r3
            java.util.Map r7 = (java.util.Map) r7
            r8 = r2
            com.revenuecat.purchases.UiConfig$VariableConfig r8 = (com.revenuecat.purchases.UiConfig.VariableConfig) r8
            r9 = 0
            r4 = r13
            r4.<init>((int) r5, (com.revenuecat.purchases.UiConfig.AppConfig) r6, (java.util.Map) r7, (com.revenuecat.purchases.UiConfig.VariableConfig) r8, (kh.t0) r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.UiConfig$$serializer.deserialize(jh.e):com.revenuecat.purchases.UiConfig");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, UiConfig uiConfig) {
        C6496s.h(fVar, "encoder");
        C6496s.h(uiConfig, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        UiConfig.write$Self(uiConfig, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
