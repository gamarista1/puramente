package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.metrics.MetricTracker;

public abstract class b {
    static WritableMap a(String str) {
        return b(str, "Database Error");
    }

    static WritableMap b(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(MetricTracker.Object.MESSAGE, str2);
        if (str != null) {
            createMap.putString(SubscriberAttributeKt.JSON_NAME_KEY, str);
        }
        return createMap;
    }

    static WritableMap c(String str) {
        return b(str, "Invalid key");
    }

    static WritableMap d(String str) {
        return b(str, "Invalid Value");
    }
}
