package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.caching.DateExtensionsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.caching.InMemoryCachedObject;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", "Lcom/revenuecat/purchases/Offerings;", "offeringsCachedObject", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;)V", "Llf/M;", "clearCache", "()V", "offerings", "Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferings", "(Lcom/revenuecat/purchases/Offerings;Lorg/json/JSONObject;)V", "", "appInBackground", "isOfferingsCacheStale", "(Z)Z", "clearOfferingsCacheTimestamp", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", "getCachedOfferings", "()Lcom/revenuecat/purchases/Offerings;", "cachedOfferings", "getCachedOfferingsResponse", "()Lorg/json/JSONObject;", "cachedOfferingsResponse", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingsCache {
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final InMemoryCachedObject<Offerings> offeringsCachedObject;

    public OfferingsCache(DeviceCache deviceCache2, DateProvider dateProvider2, InMemoryCachedObject<Offerings> inMemoryCachedObject) {
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(dateProvider2, "dateProvider");
        C6496s.h(inMemoryCachedObject, "offeringsCachedObject");
        this.deviceCache = deviceCache2;
        this.dateProvider = dateProvider2;
        this.offeringsCachedObject = inMemoryCachedObject;
    }

    public final synchronized void cacheOfferings(Offerings offerings, JSONObject jSONObject) {
        C6496s.h(offerings, "offerings");
        C6496s.h(jSONObject, "offeringsResponse");
        this.offeringsCachedObject.cacheInstance(offerings);
        this.deviceCache.cacheOfferingsResponse(jSONObject);
        this.offeringsCachedObject.updateCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void clearCache() {
        this.offeringsCachedObject.clearCache();
        this.deviceCache.clearOfferingsResponseCache();
    }

    public final synchronized void clearOfferingsCacheTimestamp() {
        this.offeringsCachedObject.clearCacheTimestamp();
    }

    public final synchronized Offerings getCachedOfferings() {
        return this.offeringsCachedObject.getCachedInstance();
    }

    public final synchronized JSONObject getCachedOfferingsResponse() {
        return this.deviceCache.getOfferingsResponseCache();
    }

    public final synchronized boolean isOfferingsCacheStale(boolean z10) {
        return DateExtensionsKt.isCacheStale(this.offeringsCachedObject.getLastUpdatedAt$purchases_defaultsRelease(), z10, this.dateProvider);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferingsCache(com.revenuecat.purchases.common.caching.DeviceCache r1, com.revenuecat.purchases.common.DateProvider r2, com.revenuecat.purchases.common.caching.InMemoryCachedObject r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0009
            com.revenuecat.purchases.common.DefaultDateProvider r2 = new com.revenuecat.purchases.common.DefaultDateProvider
            r2.<init>()
        L_0x0009:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0014
            com.revenuecat.purchases.common.caching.InMemoryCachedObject r3 = new com.revenuecat.purchases.common.caching.InMemoryCachedObject
            r4 = 1
            r5 = 0
            r3.<init>(r5, r2, r4, r5)
        L_0x0014:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.offerings.OfferingsCache.<init>(com.revenuecat.purchases.common.caching.DeviceCache, com.revenuecat.purchases.common.DateProvider, com.revenuecat.purchases.common.caching.InMemoryCachedObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
