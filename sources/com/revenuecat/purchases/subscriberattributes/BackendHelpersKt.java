package com.revenuecat.purchases.subscriberattributes;

import Ef.i;
import Ef.m;
import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.L;
import mf.O;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C6565s.n();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (optJSONArray != null) {
            i u10 = m.u(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((L) it).a()));
            }
            ArrayList<JSONObject> arrayList2 = new ArrayList<>();
            for (Object next : arrayList) {
                JSONObject jSONObject2 = (JSONObject) next;
                if (jSONObject2.has("key_name") && jSONObject2.has(MetricTracker.Object.MESSAGE)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C6565s.y(arrayList2, 10));
            for (JSONObject jSONObject3 : arrayList2) {
                String string = jSONObject3.getString("key_name");
                C6496s.g(string, "it.getString(\"key_name\")");
                String string2 = jSONObject3.getString(MetricTracker.Object.MESSAGE);
                C6496s.g(string2, "it.getString(\"message\")");
                arrayList3.add(new SubscriberAttributeError(string, string2));
            }
            List<SubscriberAttributeError> e12 = C6565s.e1(arrayList3);
            if (e12 != null) {
                return e12;
            }
        }
        return C6565s.n();
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        C6496s.h(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C6502A.a((String) next.getKey(), ((SubscriberAttribute) next.getValue()).toBackendMap()));
        }
        return O.w(arrayList);
    }
}
