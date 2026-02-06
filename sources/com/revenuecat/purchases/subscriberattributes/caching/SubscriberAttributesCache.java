package com.revenuecat.purchases.subscriberattributes.caching;

import android.content.SharedPreferences;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6531o;
import mf.C6565s;
import mf.O;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000e\u001a\u00020\r*\u00020\u00022*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n*\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001b\u0010\u001dJ1\u0010\u001e\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b¢\u0006\u0004\b\u001e\u0010\u001cJ%\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020\u00078@X\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "updatedSubscriberAttributesForAll", "Llf/M;", "putAttributes", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "currentAppUserID", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "(Ljava/lang/String;)V", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Lkotlin/Lazy;", "getSubscriberAttributesCacheKey$purchases_defaultsRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final Lazy subscriberAttributesCacheKey$delegate = C6531o.b(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));

    public SubscriberAttributesCache(DeviceCache deviceCache2) {
        C6496s.h(deviceCache2, "deviceCache");
        this.deviceCache = deviceCache2;
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str, SharedPreferences.Editor editor) {
        Pair pair;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String format = String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format, "format(this, *args)");
            LogWrapperKt.log(logIntent, format);
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry next : allStoredSubscriberAttributes.entrySet()) {
                String str2 = (String) next.getKey();
                Map map = (Map) next.getValue();
                if (!C6496s.c(str, str2)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!((SubscriberAttribute) entry.getValue()).isSynced()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    pair = C6502A.a(str2, linkedHashMap);
                } else {
                    pair = C6502A.a(str2, map);
                }
                arrayList.add(pair);
            }
            Map w10 = O.w(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : w10.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            editor.putString(getSubscriberAttributesCacheKey$purchases_defaultsRelease(), CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
        } finally {
            while (true) {
            }
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!((SubscriberAttribute) next.getValue()).isSynced()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        String format = String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2));
        C6496s.g(format, "format(this, *args)");
        sb2.append(format);
        if (!linkedHashMap.isEmpty()) {
            str2 = C6565s.x0(linkedHashMap.values(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        LogWrapperKt.log(logIntent, sb2.toString());
        return linkedHashMap;
    }

    private final void putAttributes(DeviceCache deviceCache2, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        DeviceCache deviceCache3 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String jSONObject = CachingHelpersKt.toJSONObject(map).toString();
        C6496s.g(jSONObject, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache3.putString(subscriberAttributesCacheKey$purchases_defaultsRelease, jSONObject);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str, SharedPreferences.Editor editor) {
        C6496s.h(str, "currentAppUserID");
        C6496s.h(editor, "cacheEditor");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, editor);
        deleteSyncedSubscriberAttributesForOtherUsers(str, editor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String str) {
        C6496s.h(str, "appUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        Map B10 = O.B(getAllStoredSubscriberAttributes());
        B10.remove(str);
        putAttributes(this.deviceCache, O.y(B10));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String str) {
        C6496s.h(str, "appUserID");
        if (getUnsyncedSubscriberAttributes(str).isEmpty()) {
            clearAllSubscriberAttributesFromUser(str);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> map;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
            if (jSONObjectOrNull == null || (map = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
                map = O.i();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return map;
    }

    public final DeviceCache getDeviceCache$purchases_defaultsRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(allStoredSubscriberAttributes.size()));
            for (Object next : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) next).getKey();
                Map.Entry entry = (Map.Entry) next;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return linkedHashMap;
    }

    public final synchronized void setAttributes(String str, Map<String, SubscriberAttribute> map) {
        try {
            C6496s.h(str, "appUserID");
            C6496s.h(map, "attributesToBeSet");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            Map map2 = allStoredSubscriberAttributes.get(str);
            if (map2 == null) {
                map2 = O.i();
            }
            putAttributes(this.deviceCache, O.p(allStoredSubscriberAttributes, O.f(C6502A.a(str, O.p(map2, map)))));
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String str) {
        Map<String, SubscriberAttribute> map;
        C6496s.h(str, "appUserID");
        map = getAllStoredSubscriberAttributes().get(str);
        if (map == null) {
            map = O.i();
        }
        return map;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String str) {
        C6496s.h(str, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(str), str);
    }
}
