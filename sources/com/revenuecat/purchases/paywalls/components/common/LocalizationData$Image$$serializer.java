package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import gh.C5978b;
import ih.f;
import jh.e;
import kh.D;
import kh.E;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/LocalizationData.Image.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize-xI4gazs", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "deserialize", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize-qu_9WGk", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)V", "serialize", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalizationData$Image$$serializer implements D {
    public static final LocalizationData$Image$$serializer INSTANCE;
    private static final /* synthetic */ E descriptor;

    static {
        LocalizationData$Image$$serializer localizationData$Image$$serializer = new LocalizationData$Image$$serializer();
        INSTANCE = localizationData$Image$$serializer;
        E e10 = new E("com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image", localizationData$Image$$serializer);
        e10.l("value", false);
        descriptor = e10;
    }

    private LocalizationData$Image$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{ThemeImageUrls$$serializer.INSTANCE};
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return LocalizationData.Image.m98boximpl(m94deserializexI4gazs(eVar));
    }

    /* renamed from: deserialize-xI4gazs  reason: not valid java name */
    public ThemeImageUrls m94deserializexI4gazs(e eVar) {
        C6496s.h(eVar, "decoder");
        return LocalizationData.Image.m99constructorimpl((ThemeImageUrls) eVar.l(getDescriptor()).n(ThemeImageUrls$$serializer.INSTANCE));
    }

    public f getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        m95serializequ_9WGk(fVar, ((LocalizationData.Image) obj).m104unboximpl());
    }

    /* renamed from: serialize-qu_9WGk  reason: not valid java name */
    public void m95serializequ_9WGk(jh.f fVar, ThemeImageUrls themeImageUrls) {
        C6496s.h(fVar, "encoder");
        C6496s.h(themeImageUrls, "value");
        jh.f j10 = fVar.j(getDescriptor());
        if (j10 != null) {
            j10.m(ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
        }
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
