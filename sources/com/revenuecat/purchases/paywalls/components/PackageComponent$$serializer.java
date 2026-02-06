package com.revenuecat.purchases.paywalls.components;

import gh.C5978b;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PackageComponent.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/PackageComponent;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageComponent$$serializer implements D {
    public static final PackageComponent$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        PackageComponent$$serializer packageComponent$$serializer = new PackageComponent$$serializer();
        INSTANCE = packageComponent$$serializer;
        C6458j0 j0Var = new C6458j0("package", packageComponent$$serializer, 3);
        j0Var.l("package_id", false);
        j0Var.l("is_selected_by_default", false);
        j0Var.l("stack", false);
        descriptor = j0Var;
    }

    private PackageComponent$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{x0.f71726a, C6455i.f71663a, StackComponent$$serializer.INSTANCE};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.PackageComponent deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r0.A(r1, r5)
            boolean r4 = r0.s(r1, r4)
            com.revenuecat.purchases.paywalls.components.StackComponent$$serializer r5 = com.revenuecat.purchases.paywalls.components.StackComponent$$serializer.INSTANCE
            java.lang.Object r3 = r0.C(r1, r3, r5, r6)
            r5 = 7
            r12 = r2
            r13 = r4
            r11 = r5
            goto L_0x0063
        L_0x002c:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
            r6 = r2
        L_0x0031:
            if (r9 == 0) goto L_0x005f
            int r10 = r0.o(r1)
            r11 = -1
            if (r10 == r11) goto L_0x005d
            if (r10 == 0) goto L_0x0056
            if (r10 == r4) goto L_0x004f
            if (r10 != r3) goto L_0x0049
            com.revenuecat.purchases.paywalls.components.StackComponent$$serializer r10 = com.revenuecat.purchases.paywalls.components.StackComponent$$serializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r3, r10, r8)
            r6 = r6 | 4
            goto L_0x0031
        L_0x0049:
            gh.p r0 = new gh.p
            r0.<init>((int) r10)
            throw r0
        L_0x004f:
            boolean r2 = r0.s(r1, r4)
            r6 = r6 | 2
            goto L_0x0031
        L_0x0056:
            java.lang.String r7 = r0.A(r1, r5)
            r6 = r6 | 1
            goto L_0x0031
        L_0x005d:
            r9 = r5
            goto L_0x0031
        L_0x005f:
            r13 = r2
            r11 = r6
            r12 = r7
            r3 = r8
        L_0x0063:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.PackageComponent r0 = new com.revenuecat.purchases.paywalls.components.PackageComponent
            r14 = r3
            com.revenuecat.purchases.paywalls.components.StackComponent r14 = (com.revenuecat.purchases.paywalls.components.StackComponent) r14
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.PackageComponent$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.PackageComponent");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, PackageComponent packageComponent) {
        C6496s.h(fVar, "encoder");
        C6496s.h(packageComponent, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        PackageComponent.write$Self(packageComponent, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
