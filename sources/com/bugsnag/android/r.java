package com.bugsnag.android;

import K4.g;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class r {
    public void a(Map map, Breadcrumb breadcrumb) {
        map.put(DiagnosticsEntry.TIMESTAMP_KEY, g.c(breadcrumb.getTimestamp()));
        map.put(MetricTracker.Object.MESSAGE, breadcrumb.getMessage());
        String lowerCase = breadcrumb.getType().toString().toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        map.put("type", lowerCase);
        map.put("metadata", breadcrumb.getMetadata());
    }
}
