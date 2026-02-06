package com.revenuecat.purchases.common.caching;

import Tg.a;
import Tg.c;
import Tg.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0017\u0010\u0001\u001a\u00020\u00008\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002XT¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LTg/a;", "PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD", "J", "", "SHARED_PREFERENCES_PREFIX", "Ljava/lang/String;", "", "CUSTOMER_INFO_SCHEMA_VERSION", "I", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    /* access modifiers changed from: private */
    public static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = c.s(25, d.HOURS);
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";

    static {
        a.C0955a aVar = a.f65168b;
    }
}
