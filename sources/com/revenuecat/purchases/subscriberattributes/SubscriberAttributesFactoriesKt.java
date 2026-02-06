package com.revenuecat.purchases.subscriberattributes;

import Rg.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006*\u00020\u0004H\u0000\u001a0\u0010\u0007\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00060\u0001j\u0002`\t*\u00020\u0004H\u0000¨\u0006\n"}, d2 = {"buildLegacySubscriberAttributes", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lorg/json/JSONObject;", "buildSubscriberAttributesMap", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "buildSubscriberAttributesMapPerUser", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesFactoriesKt {
    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) {
        C6496s.h(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        C6496s.g(jSONObject2, "attributesJSONObject");
        return buildSubscriberAttributesMap(jSONObject2);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        C6496s.h(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        C6496s.g(keys, "this.keys()");
        return O.u(k.x(k.c(keys), new SubscriberAttributesFactoriesKt$buildSubscriberAttributesMap$1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) {
        C6496s.h(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> keys = jSONObject2.keys();
        C6496s.g(keys, "attributesJSONObject.keys()");
        return O.u(k.x(k.c(keys), new SubscriberAttributesFactoriesKt$buildSubscriberAttributesMapPerUser$1(jSONObject2)));
    }
}
