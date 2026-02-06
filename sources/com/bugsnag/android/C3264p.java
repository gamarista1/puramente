package com.bugsnag.android;

import K4.g;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bugsnag.android.p  reason: case insensitive filesystem */
class C3264p {

    /* renamed from: a  reason: collision with root package name */
    private final S0 f38798a;

    C3264p(S0 s02) {
        this.f38798a = s02;
    }

    public Breadcrumb a(Map map) {
        return new Breadcrumb((String) U0.d(map, MetricTracker.Object.MESSAGE), BreadcrumbType.valueOf(((String) U0.d(map, "type")).toUpperCase(Locale.US)), (Map) U0.c(map, "metadata"), g.a((String) U0.d(map, DiagnosticsEntry.TIMESTAMP_KEY)), this.f38798a);
    }
}
