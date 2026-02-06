package com.revenuecat.purchases.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001H\u0000\u001a\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"replaceJsonNullWithKotlinNull", "", "T", "toList", "Lorg/json/JSONArray;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        C6496s.h(list, "<this>");
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Object next : iterable) {
            if (next instanceof Map) {
                C6496s.f(next, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                next = JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) next);
            } else if (next instanceof List) {
                C6496s.f(next, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                next = replaceJsonNullWithKotlinNull((List) next);
            } else if (C6496s.c(next, JSONObject.NULL)) {
                next = null;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        C6496s.h(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                obj = JSONObjectExtensionsKt.toMap((JSONObject) obj, true);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
