package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import java.util.Map;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKeyMapSerializer;", "Lgh/b;", "", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "<init>", "()V", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/Map;)V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/Map;", "delegate", "Lgh/b;", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InternalRevenueCatAPI
public final class VariableLocalizationKeyMapSerializer implements C5978b {
    public static final VariableLocalizationKeyMapSerializer INSTANCE = new VariableLocalizationKeyMapSerializer();
    private static final C5978b delegate;
    private static final f descriptor;

    static {
        U u10 = U.f71764a;
        C5978b k10 = C5998a.k(C5998a.E(u10), C5998a.E(u10));
        delegate = k10;
        descriptor = k10.getDescriptor();
    }

    private VariableLocalizationKeyMapSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(jh.f fVar, Map<VariableLocalizationKey, String> map) {
        C6496s.h(fVar, "encoder");
        C6496s.h(map, "value");
    }

    public Map<VariableLocalizationKey, String> deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        return MapExtensionsKt.mapNotNullKeys((Map) eVar.n(delegate), VariableLocalizationKeyMapSerializer$deserialize$1.INSTANCE);
    }
}
