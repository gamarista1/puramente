package com.revenuecat.purchases.hybridcommon.mappers;

import Rg.h;
import Rg.k;
import com.revenuecat.purchases.utils.Iso8601Utils;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6559l;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u001a\u000e\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\n\u001a\u0018\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007*\u00020\u0006\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\rH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0004*\u00020\rH\u0000¨\u0006\u000f"}, d2 = {"formatUsingDeviceLocale", "", "priceCurrencyCode", "number", "", "convertToJson", "Lorg/json/JSONObject;", "", "convertToJsonArray", "Lorg/json/JSONArray;", "", "convertToMap", "toIso8601", "Ljava/util/Date;", "toMillis", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MappersHelpersKt {
    public static final JSONObject convertToJson(Map<String, ?> map) {
        C6496s.h(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else if (value instanceof Map) {
                C6496s.f(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONObject.put(str, convertToJson((Map) value));
            } else if (value instanceof List) {
                jSONObject.put(str, convertToJsonArray((List) value));
            } else if (value instanceof Object[]) {
                jSONObject.put(str, convertToJsonArray(C6559l.n1((Object[]) value)));
            } else {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List<?> list) {
        C6496s.h(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next == null) {
                jSONArray.put(JSONObject.NULL);
            } else if (next instanceof Map) {
                C6496s.f(next, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONArray.put(convertToJson((Map) next));
            } else if (next instanceof Object[]) {
                jSONArray.put(convertToJsonArray(C6559l.e((Object[]) next)));
            } else if (next instanceof List) {
                jSONArray.put(convertToJsonArray((List) next));
            } else {
                jSONArray.put(next);
            }
        }
        return jSONArray;
    }

    public static final Map<String, String> convertToMap(JSONObject jSONObject) {
        Pair pair;
        C6496s.h(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        C6496s.g(keys, "this.keys()");
        h<String> c10 = k.c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : c10) {
            if (jSONObject.isNull(str)) {
                pair = C6502A.a(str, (Object) null);
            } else {
                pair = C6502A.a(str, jSONObject.getString(str));
            }
            linkedHashMap.put(pair.c(), pair.d());
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String str, long j10) {
        C6496s.h(str, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(str));
        String format = currencyInstance.format(j10);
        C6496s.g(format, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return format;
    }

    public static final String toIso8601(Date date) {
        C6496s.h(date, "<this>");
        String format = Iso8601Utils.format(date);
        C6496s.g(format, "format(this)");
        return format;
    }

    public static final long toMillis(Date date) {
        C6496s.h(date, "<this>");
        return date.getTime();
    }
}
