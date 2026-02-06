package com.revenuecat.purchases.subscriberattributes.caching;

import Ef.m;
import Sg.p;
import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\r\u001a\u00020\u0003*\u00020\u00002*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "Llf/M;", "migrateSubscriberAttributesIfNeeded", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Landroid/content/SharedPreferences$Editor;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "legacySubscriberAttributesForAppUserID", "migrateSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/util/Map;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "legacySubscriberAttributesCacheKey", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/lang/String;)Ljava/lang/String;", "getAllLegacyStoredSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;)Ljava/util/Map;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        LinkedHashMap linkedHashMap;
        Map<String, SubscriberAttribute> map;
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                C6496s.h(subscriberAttributesCache, "<this>");
                String legacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
                Iterable<String> findKeysThatStartWith = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().findKeysThatStartWith(legacySubscriberAttributesCacheKey);
                linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(findKeysThatStartWith, 10)), 16));
                for (String str : findKeysThatStartWith) {
                    String str2 = (String) p.F0(str, new String[]{legacySubscriberAttributesCacheKey}, false, 0, 6, (Object) null).get(1);
                    JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().getJSONObjectOrNull(str);
                    if (jSONObjectOrNull == null || (map = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                        map = O.i();
                    }
                    Pair a10 = C6502A.a(str2, map);
                    linkedHashMap.put(a10.c(), a10.d());
                }
            } finally {
                while (true) {
                }
            }
        }
        return linkedHashMap;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String str) {
        C6496s.h(subscriberAttributesCache, "<this>");
        C6496s.h(str, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease() + '.' + str;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> map, SharedPreferences.Editor editor) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            try {
                C6496s.h(subscriberAttributesCache, "<this>");
                C6496s.h(map, "legacySubscriberAttributesForAppUserID");
                C6496s.h(editor, "cacheEditor");
                Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
                Map B10 = O.B(allStoredSubscriberAttributes);
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    Map map2 = (Map) next.getValue();
                    Map map3 = allStoredSubscriberAttributes.get(str);
                    if (map3 == null) {
                        map3 = O.i();
                    }
                    B10.put(str, O.p(map2, map3));
                    editor.remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, str));
                }
                editor.putString(subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease(), CachingHelpersKt.toJSONObject(B10).toString());
            } finally {
                while (true) {
                }
            }
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache, SharedPreferences.Editor editor) {
        synchronized (SubscriberAttributesMigrationExtensionsKt.class) {
            C6496s.h(subscriberAttributesCache, "<this>");
            C6496s.h(editor, "cacheEditor");
            Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
            if (allLegacyStoredSubscriberAttributes.isEmpty()) {
                allLegacyStoredSubscriberAttributes = null;
            }
            if (allLegacyStoredSubscriberAttributes != null) {
                migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes, editor);
            }
        }
    }
}
