package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import java.util.Map;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J:\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R5\u0010\u0012\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00020\u00020\u00018\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizedVariableLocalizationKeyMapSerializer;", "Lgh/b;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/Map;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/Map;", "delegate", "Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class LocalizedVariableLocalizationKeyMapSerializer implements C5978b {
    public static final LocalizedVariableLocalizationKeyMapSerializer INSTANCE = new LocalizedVariableLocalizationKeyMapSerializer();
    private static final C5978b delegate;
    private static final f descriptor;

    static {
        C5978b k10 = C5998a.k(LocaleId.Companion.serializer(), VariableLocalizationKeyMapSerializer.INSTANCE);
        delegate = k10;
        descriptor = k10.getDescriptor();
    }

    private LocalizedVariableLocalizationKeyMapSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, Map<LocaleId, ? extends Map<VariableLocalizationKey, String>> map) {
        C6496s.h(fVar, "encoder");
        C6496s.h(map, "value");
    }

    public Map<LocaleId, Map<VariableLocalizationKey, String>> deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return (Map) delegate.deserialize(eVar);
    }
}
