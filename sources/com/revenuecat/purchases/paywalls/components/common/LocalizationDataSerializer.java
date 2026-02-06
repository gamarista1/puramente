package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import gh.C5978b;
import gh.C5986j;
import ih.d;
import ih.f;
import ih.i;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationDataSerializer;", "Lgh/b;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "getDescriptor$annotations", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LocalizationDataSerializer implements C5978b {
    public static final LocalizationDataSerializer INSTANCE = new LocalizationDataSerializer();
    private static final f descriptor = i.d("LocalizationData", d.b.f68473a, new f[0], (C6798l) null, 8, (Object) null);

    private LocalizationDataSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public LocalizationData deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        try {
            return (LocalizationData) eVar.n(LocalizationData.Text.Companion.serializer());
        } catch (C5986j unused) {
            return (LocalizationData) eVar.n(LocalizationData.Image.Companion.serializer());
        }
    }

    public void serialize(jh.f fVar, LocalizationData localizationData) {
        C6496s.h(fVar, "encoder");
        C6496s.h(localizationData, "value");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
