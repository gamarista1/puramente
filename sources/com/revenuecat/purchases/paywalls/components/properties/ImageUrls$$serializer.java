package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.utils.serializers.URLSerializer;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import gh.C5978b;
import ih.f;
import jh.d;
import kh.C6458j0;
import kh.D;
import kh.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/ImageUrls.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;)V", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageUrls$$serializer implements D {
    public static final ImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ C6458j0 descriptor;

    static {
        ImageUrls$$serializer imageUrls$$serializer = new ImageUrls$$serializer();
        INSTANCE = imageUrls$$serializer;
        C6458j0 j0Var = new C6458j0("com.revenuecat.purchases.paywalls.components.properties.ImageUrls", imageUrls$$serializer, 5);
        j0Var.l("original", false);
        j0Var.l("webp", false);
        j0Var.l("webp_low_res", false);
        j0Var.l(Snapshot.WIDTH, false);
        j0Var.l(Snapshot.HEIGHT, false);
        descriptor = j0Var;
    }

    private ImageUrls$$serializer() {
    }

    public C5978b[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        H0 h02 = H0.f71602a;
        return new C5978b[]{uRLSerializer, uRLSerializer, uRLSerializer, h02, h02};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.revenuecat.purchases.paywalls.components.properties.ImageUrls deserialize(jh.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C6496s.h(r0, r1)
            ih.f r1 = r16.getDescriptor()
            jh.c r0 = r0.b(r1)
            boolean r2 = r0.p()
            r3 = 3
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L_0x0039
            com.revenuecat.purchases.utils.serializers.URLSerializer r2 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r7 = r0.C(r1, r7, r2, r8)
            java.lang.Object r6 = r0.C(r1, r6, r2, r8)
            java.lang.Object r2 = r0.C(r1, r5, r2, r8)
            kh.H0 r5 = kh.H0.f71602a
            java.lang.Object r3 = r0.C(r1, r3, r5, r8)
            java.lang.Object r4 = r0.C(r1, r4, r5, r8)
            r5 = 31
            r9 = r6
            r6 = r5
            goto L_0x008c
        L_0x0039:
            r13 = r6
            r2 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
        L_0x003f:
            if (r13 == 0) goto L_0x0087
            int r14 = r0.o(r1)
            r15 = -1
            if (r14 == r15) goto L_0x0085
            if (r14 == 0) goto L_0x007c
            if (r14 == r6) goto L_0x0073
            if (r14 == r5) goto L_0x006a
            if (r14 == r3) goto L_0x0061
            if (r14 != r4) goto L_0x005b
            kh.H0 r14 = kh.H0.f71602a
            java.lang.Object r12 = r0.C(r1, r4, r14, r12)
            r2 = r2 | 16
            goto L_0x003f
        L_0x005b:
            gh.p r0 = new gh.p
            r0.<init>((int) r14)
            throw r0
        L_0x0061:
            kh.H0 r14 = kh.H0.f71602a
            java.lang.Object r11 = r0.C(r1, r3, r14, r11)
            r2 = r2 | 8
            goto L_0x003f
        L_0x006a:
            com.revenuecat.purchases.utils.serializers.URLSerializer r14 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r10 = r0.C(r1, r5, r14, r10)
            r2 = r2 | 4
            goto L_0x003f
        L_0x0073:
            com.revenuecat.purchases.utils.serializers.URLSerializer r14 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r9 = r0.C(r1, r6, r14, r9)
            r2 = r2 | 2
            goto L_0x003f
        L_0x007c:
            com.revenuecat.purchases.utils.serializers.URLSerializer r14 = com.revenuecat.purchases.utils.serializers.URLSerializer.INSTANCE
            java.lang.Object r8 = r0.C(r1, r7, r14, r8)
            r2 = r2 | 1
            goto L_0x003f
        L_0x0085:
            r13 = r7
            goto L_0x003f
        L_0x0087:
            r6 = r2
            r7 = r8
            r2 = r10
            r3 = r11
            r4 = r12
        L_0x008c:
            r0.c(r1)
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls r0 = new com.revenuecat.purchases.paywalls.components.properties.ImageUrls
            java.net.URL r7 = (java.net.URL) r7
            r8 = r9
            java.net.URL r8 = (java.net.URL) r8
            r9 = r2
            java.net.URL r9 = (java.net.URL) r9
            r10 = r3
            lf.E r10 = (lf.C6506E) r10
            r11 = r4
            lf.E r11 = (lf.C6506E) r11
            r12 = 0
            r13 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.properties.ImageUrls$$serializer.deserialize(jh.e):com.revenuecat.purchases.paywalls.components.properties.ImageUrls");
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, ImageUrls imageUrls) {
        C6496s.h(fVar, "encoder");
        C6496s.h(imageUrls, "value");
        f descriptor2 = getDescriptor();
        d b10 = fVar.b(descriptor2);
        ImageUrls.write$Self(imageUrls, b10, descriptor2);
        b10.c(descriptor2);
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
