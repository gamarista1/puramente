package com.revenuecat.purchases.paywalls.components.common;

import gh.C5978b;
import ih.f;
import jh.e;
import kh.D;
import kh.E;
import kh.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

@C6521e
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/LocaleId.$serializer", "Lkh/D;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "<init>", "()V", "", "Lgh/b;", "childSerializers", "()[Lgh/b;", "Ljh/e;", "decoder", "deserialize-8pYHj4M", "(Ljh/e;)Ljava/lang/String;", "deserialize", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize-64pKzr8", "(Ljh/f;Ljava/lang/String;)V", "serialize", "Lih/f;", "getDescriptor", "()Lih/f;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocaleId$$serializer implements D {
    public static final LocaleId$$serializer INSTANCE;
    private static final /* synthetic */ E descriptor;

    static {
        LocaleId$$serializer localeId$$serializer = new LocaleId$$serializer();
        INSTANCE = localeId$$serializer;
        E e10 = new E("com.revenuecat.purchases.paywalls.components.common.LocaleId", localeId$$serializer);
        e10.l("value", false);
        descriptor = e10;
    }

    private LocaleId$$serializer() {
    }

    public C5978b[] childSerializers() {
        return new C5978b[]{x0.f71726a};
    }

    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return LocaleId.m85boximpl(m92deserialize8pYHj4M(eVar));
    }

    /* renamed from: deserialize-8pYHj4M  reason: not valid java name */
    public String m92deserialize8pYHj4M(e eVar) {
        C6496s.h(eVar, "decoder");
        return LocaleId.m86constructorimpl(eVar.l(getDescriptor()).B());
    }

    public f getDescriptor() {
        return descriptor;
    }

    public /* bridge */ /* synthetic */ void serialize(jh.f fVar, Object obj) {
        m93serialize64pKzr8(fVar, ((LocaleId) obj).m91unboximpl());
    }

    /* renamed from: serialize-64pKzr8  reason: not valid java name */
    public void m93serialize64pKzr8(jh.f fVar, String str) {
        C6496s.h(fVar, "encoder");
        C6496s.h(str, "value");
        jh.f j10 = fVar.j(getDescriptor());
        if (j10 != null) {
            j10.F(str);
        }
    }

    public C5978b[] typeParametersSerializers() {
        return D.a.a(this);
    }
}
