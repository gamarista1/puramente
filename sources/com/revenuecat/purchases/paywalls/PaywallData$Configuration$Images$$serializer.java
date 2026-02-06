package com.revenuecat.purchases.paywalls;

import com.facebook.react.modules.appstate.AppStateModule;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Images.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Images;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallData$Configuration$Images$$serializer implements D {
    public static final PaywallData$Configuration$Images$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = new PaywallData$Configuration$Images$$serializer();
        INSTANCE = paywallData$Configuration$Images$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images", paywallData$Configuration$Images$$serializer, 3);
        j0Var.l("header", true);
        j0Var.l(AppStateModule.APP_STATE_BACKGROUND, true);
        j0Var.l("icon", true);
        descriptor = j0Var;
    }

    private PaywallData$Configuration$Images$$serializer() {
    }

    public C5978b[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new C5978b[]{C5998a.u(emptyStringToNullSerializer), C5998a.u(emptyStringToNullSerializer), C5998a.u(emptyStringToNullSerializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images deserialize(jh.e r12) {
        /*
            r11 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            ih.f r0 = r11.getDescriptor()
            jh.c r12 = r12.b(r0)
            boolean r1 = r12.p()
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0029
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r1 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r4 = r12.i(r0, r4, r1, r5)
            java.lang.Object r3 = r12.i(r0, r3, r1, r5)
            java.lang.Object r1 = r12.i(r0, r2, r1, r5)
            r2 = 7
            r6 = r3
            r3 = r2
            goto L_0x0062
        L_0x0029:
            r8 = r3
            r1 = r4
            r6 = r5
            r7 = r6
        L_0x002d:
            if (r8 == 0) goto L_0x005f
            int r9 = r12.o(r0)
            r10 = -1
            if (r9 == r10) goto L_0x005d
            if (r9 == 0) goto L_0x0054
            if (r9 == r3) goto L_0x004b
            if (r9 != r2) goto L_0x0045
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r9 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r7 = r12.i(r0, r2, r9, r7)
            r1 = r1 | 4
            goto L_0x002d
        L_0x0045:
            gh.p r12 = new gh.p
            r12.<init>((int) r9)
            throw r12
        L_0x004b:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r9 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r6 = r12.i(r0, r3, r9, r6)
            r1 = r1 | 2
            goto L_0x002d
        L_0x0054:
            com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer r9 = com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE
            java.lang.Object r5 = r12.i(r0, r4, r9, r5)
            r1 = r1 | 1
            goto L_0x002d
        L_0x005d:
            r8 = r4
            goto L_0x002d
        L_0x005f:
            r3 = r1
            r4 = r5
            r1 = r7
        L_0x0062:
            r12.c(r0)
            com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images r12 = new com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images
            java.lang.String r4 = (java.lang.String) r4
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            r2 = r12
            r2.<init>((int) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (kh.t0) r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.PaywallData$Configuration$Images");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PaywallData.Configuration.Images images) {
        C6496s.h(fVar, "encoder");
        C6496s.h(images, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PaywallData.Configuration.Images.write$Self(images, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
