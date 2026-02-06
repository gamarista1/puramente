package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import jh.d;
import kh.C6458j0;
import kh.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/Background.Image.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/common/Background$Image;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Background$Image$$serializer implements D {
    public static final Background$Image$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        Background$Image$$serializer background$Image$$serializer = new Background$Image$$serializer();
        INSTANCE = background$Image$$serializer;
        C6458j0 j0Var = new C6458j0(AppearanceType.IMAGE, background$Image$$serializer, 3);
        j0Var.l("value", false);
        j0Var.l("fit_mode", true);
        j0Var.l("color_overlay", true);
        descriptor = j0Var;
    }

    private Background$Image$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ThemeImageUrls$$serializer.INSTANCE, Background.Image.$childSerializers[1], C5998a.u(ColorScheme$$serializer.INSTANCE)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.common.Background.Image deserialize(jh.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            ih.f r0 = r12.getDescriptor()
            jh.c r13 = r13.b(r0)
            gh.b[] r1 = com.revenuecat.purchases.paywalls.components.common.Background.Image.$childSerializers
            boolean r2 = r13.p()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0030
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r2 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            java.lang.Object r2 = r13.C(r0, r5, r2, r6)
            r1 = r1[r4]
            java.lang.Object r1 = r13.C(r0, r4, r1, r6)
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r4 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r3 = r13.i(r0, r3, r4, r6)
            r4 = 7
            r5 = r4
            goto L_0x006a
        L_0x0030:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x0034:
            if (r9 == 0) goto L_0x0066
            int r10 = r13.o(r0)
            r11 = -1
            if (r10 == r11) goto L_0x0064
            if (r10 == 0) goto L_0x005b
            if (r10 == r4) goto L_0x0052
            if (r10 != r3) goto L_0x004c
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer r10 = com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE
            java.lang.Object r8 = r13.i(r0, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x0034
        L_0x004c:
            gh.p r13 = new gh.p
            r13.<init>((int) r10)
            throw r13
        L_0x0052:
            r10 = r1[r4]
            java.lang.Object r7 = r13.C(r0, r4, r10, r7)
            r2 = r2 | 2
            goto L_0x0034
        L_0x005b:
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer r10 = com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE
            java.lang.Object r6 = r13.C(r0, r5, r10, r6)
            r2 = r2 | 1
            goto L_0x0034
        L_0x0064:
            r9 = r5
            goto L_0x0034
        L_0x0066:
            r5 = r2
            r2 = r6
            r1 = r7
            r3 = r8
        L_0x006a:
            r13.c(r0)
            com.revenuecat.purchases.paywalls.components.common.Background$Image r13 = new com.revenuecat.purchases.paywalls.components.common.Background$Image
            r6 = r2
            com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls r6 = (com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls) r6
            r7 = r1
            com.revenuecat.purchases.paywalls.components.properties.FitMode r7 = (com.revenuecat.purchases.paywalls.components.properties.FitMode) r7
            r8 = r3
            com.revenuecat.purchases.paywalls.components.properties.ColorScheme r8 = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r8
            r9 = 0
            r4 = r13
            r4.<init>((int) r5, (com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls) r6, (com.revenuecat.purchases.paywalls.components.properties.FitMode) r7, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) r8, (kh.t0) r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.common.Background$Image$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.common.Background$Image");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, Background.Image image) {
        C6496s.h(fVar, "encoder");
        C6496s.h(image, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        Background.Image.write$Self(image, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
