package com.revenuecat.purchases.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\u001a9\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001ac\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0006*\u00020\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"K", "V", "", "filterNotNullValues", "(Ljava/util/Map;)Ljava/util/Map;", "", "R", "Lkotlin/Function1;", "", "transform", "mapNotNullKeys", "(Ljava/util/Map;Lyf/l;)Ljava/util/Map;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        C6496s.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final <K, V, R> Map<R, V> mapNotNullKeys(Map<K, ? extends V> map, C6798l lVar) {
        C6496s.h(map, "<this>");
        C6496s.h(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            Object invoke = lVar.invoke(next);
            if (invoke != null) {
                linkedHashMap.put(invoke, next.getValue());
            }
        }
        return linkedHashMap;
    }
}
