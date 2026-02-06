package com.revenuecat.purchases.common.networking;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import org.json.JSONArray;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0004\u0018\u0001*\u0004\u0018\u00010\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\b¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/networking/MapConverter;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "ifSuccess", "tryCast", "(Ljava/lang/Object;Lyf/l;)Ljava/lang/Object;", "", "", "inputMap", "Lorg/json/JSONObject;", "convertToJSON$purchases_defaultsRelease", "(Ljava/util/Map;)Lorg/json/JSONObject;", "convertToJSON", "createJSONObject$purchases_defaultsRelease", "createJSONObject", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MapConverter {
    private final /* synthetic */ <T> Object tryCast(Object obj, C6798l lVar) {
        C6496s.l(3, "T");
        if (obj != null) {
            return lVar.invoke(obj);
        }
        return obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsRelease(Map<String, ? extends Object> map) {
        C6496s.h(map, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(it.next() instanceof String)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                value = new JSONObject(O.f(C6502A.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsRelease(Map<String, ? extends Object> map) {
        C6496s.h(map, "inputMap");
        return new JSONObject(map);
    }
}
