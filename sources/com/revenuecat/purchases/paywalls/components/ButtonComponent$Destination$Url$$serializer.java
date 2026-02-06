package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ButtonComponent.Destination.Url.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$Url;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonComponent$Destination$Url$$serializer implements D {
    public static final ButtonComponent$Destination$Url$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        ButtonComponent$Destination$Url$$serializer buttonComponent$Destination$Url$$serializer = new ButtonComponent$Destination$Url$$serializer();
        INSTANCE = buttonComponent$Destination$Url$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url", buttonComponent$Destination$Url$$serializer, 2);
        j0Var.l("urlLid", false);
        j0Var.l("method", false);
        descriptor = j0Var;
    }

    private ButtonComponent$Destination$Url$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{LocalizationKey$$serializer.INSTANCE, ButtonComponent.Destination.Url.$childSerializers[1]};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url deserialize(jh.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            ih.f r0 = r12.getDescriptor()
            jh.c r13 = r13.b(r0)
            gh.b[] r1 = com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Url.$childSerializers
            boolean r2 = r13.p()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x0029
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r2 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r2 = r13.C(r0, r4, r2, r5)
            r1 = r1[r3]
            java.lang.Object r1 = r13.C(r0, r3, r1, r5)
            r3 = 3
            r7 = r3
            goto L_0x0056
        L_0x0029:
            r8 = r3
            r7 = r4
            r2 = r5
            r6 = r2
        L_0x002d:
            if (r8 == 0) goto L_0x0054
            int r9 = r13.o(r0)
            r10 = -1
            if (r9 == r10) goto L_0x0052
            if (r9 == 0) goto L_0x0049
            if (r9 != r3) goto L_0x0043
            r9 = r1[r3]
            java.lang.Object r2 = r13.C(r0, r3, r9, r2)
            r7 = r7 | 2
            goto L_0x002d
        L_0x0043:
            gh.p r13 = new gh.p
            r13.<init>((int) r9)
            throw r13
        L_0x0049:
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer r9 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE
            java.lang.Object r6 = r13.C(r0, r4, r9, r6)
            r7 = r7 | 1
            goto L_0x002d
        L_0x0052:
            r8 = r4
            goto L_0x002d
        L_0x0054:
            r1 = r2
            r2 = r6
        L_0x0056:
            r13.c(r0)
            com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url r13 = new com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey r2 = (com.revenuecat.purchases.paywalls.components.common.LocalizationKey) r2
            if (r2 == 0) goto L_0x0063
            java.lang.String r5 = r2.m118unboximpl()
        L_0x0063:
            r8 = r5
            r9 = r1
            com.revenuecat.purchases.paywalls.components.ButtonComponent$UrlMethod r9 = (com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod) r9
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.ButtonComponent$Destination$Url");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, ButtonComponent.Destination.Url url) {
        C6496s.h(fVar, "encoder");
        C6496s.h(url, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        ButtonComponent.Destination.Url.write$Self(url, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
