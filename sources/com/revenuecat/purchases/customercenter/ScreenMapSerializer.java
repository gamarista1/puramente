package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import gh.C5978b;
import hh.C5998a;
import ih.f;
import java.util.LinkedHashMap;
import java.util.Map;
import jh.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lh.h;
import lh.i;
import lh.j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/customercenter/ScreenMapSerializer;", "Lgh/b;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen$ScreenType;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "Ljh/e;", "decoder", "deserialize", "(Ljh/e;)Ljava/util/Map;", "Ljh/f;", "encoder", "value", "Llf/M;", "serialize", "(Ljh/f;Ljava/util/Map;)V", "Lih/f;", "descriptor", "Lih/f;", "getDescriptor", "()Lih/f;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScreenMapSerializer implements C5978b {
    public static final ScreenMapSerializer INSTANCE = new ScreenMapSerializer();
    private static final f descriptor = C5998a.k(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).getDescriptor();

    private ScreenMapSerializer() {
    }

    public f getDescriptor() {
        return descriptor;
    }

    public Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> deserialize(e eVar) {
        C6496s.h(eVar, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            for (Map.Entry entry : j.n(hVar.g()).entrySet()) {
                String str = (String) entry.getKey();
                try {
                    linkedHashMap.put(CustomerCenterConfigData.Screen.ScreenType.valueOf(str), hVar.d().d(CustomerCenterConfigData.Screen.Companion.serializer(), (i) entry.getValue()));
                } catch (IllegalArgumentException unused) {
                    LogUtilsKt.debugLog("Unknown CustomerCenter ScreenType: " + str + ". Ignoring.");
                }
            }
            return linkedHashMap;
        }
        throw new IllegalStateException("Can be deserialized only by JSON");
    }

    public void serialize(jh.f fVar, Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> map) {
        C6496s.h(fVar, "encoder");
        C6496s.h(map, "value");
        C5998a.k(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).serialize(fVar, map);
    }
}
