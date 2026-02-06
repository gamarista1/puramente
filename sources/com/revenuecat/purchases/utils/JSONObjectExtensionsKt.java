package com.revenuecat.purchases.utils;

import Rg.k;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\b\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a4\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u000e\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010*\u0010\u0012\u0004\u0012\u0002H\u000f\u0012\u0006\u0012\u0004\u0018\u0001H\u00100\u000eH\u0000\u001a(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00120\u000e\"\u0004\b\u0000\u0010\u0012*\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0000¨\u0006\u0015"}, d2 = {"getDate", "Ljava/util/Date;", "Lorg/json/JSONObject;", "jsonKey", "", "getNullableInt", "", "name", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "getNullableString", "optDate", "optNullableInt", "optNullableString", "replaceJsonNullWithKotlinNull", "", "K", "V", "toMap", "T", "deep", "", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JSONObjectExtensionsKt {
    public static final Date getDate(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "jsonKey");
        Date parse = Iso8601Utils.parse(jSONObject.getString(str));
        C6496s.g(parse, "parse(getString(jsonKey))");
        return parse;
    }

    public static final Integer getNullableInt(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final String getNullableString(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "jsonKey");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, str);
        }
        return null;
    }

    public static final Integer optNullableInt(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, str);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, str);
        }
        return null;
    }

    public static final <K, V> Map<K, V> replaceJsonNullWithKotlinNull(Map<K, ? extends V> map) {
        C6496s.h(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C6496s.f(value, "null cannot be cast to non-null type kotlin.collections.Map<K of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5, V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = replaceJsonNullWithKotlinNull((Map) value);
            } else if (value instanceof List) {
                C6496s.f(value, "null cannot be cast to non-null type kotlin.collections.List<V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((List) value);
            } else if (C6496s.c(value, JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z10) {
        C6496s.h(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        C6496s.g(keys, "this.keys()");
        return O.u(k.x(k.c(keys), new JSONObjectExtensionsKt$toMap$1(z10, jSONObject)));
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toMap(jSONObject, z10);
    }
}
