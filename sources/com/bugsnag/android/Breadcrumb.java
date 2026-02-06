package com.bugsnag.android;

import K4.g;
import com.bugsnag.android.K0;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Date;
import java.util.Map;

public class Breadcrumb implements K0.a {
    final C3267q impl;
    private final S0 logger;

    Breadcrumb(C3267q qVar, S0 s02) {
        this.impl = qVar;
        this.logger = s02;
    }

    private void logNull(String str) {
        S0 s02 = this.logger;
        s02.f("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public String getMessage() {
        return this.impl.f38822a;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.f38824c;
    }

    /* access modifiers changed from: package-private */
    public String getStringTimestamp() {
        return g.c(this.impl.f38825d);
    }

    public Date getTimestamp() {
        return this.impl.f38825d;
    }

    public BreadcrumbType getType() {
        return this.impl.f38823b;
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.f38822a = str;
        } else {
            logNull(MetricTracker.Object.MESSAGE);
        }
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.f38824c = map;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.f38823b = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    public void toStream(K0 k02) {
        this.impl.toStream(k02);
    }

    Breadcrumb(String str, S0 s02) {
        this.impl = new C3267q(str);
        this.logger = s02;
    }

    Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, S0 s02) {
        this.impl = new C3267q(str, breadcrumbType, map, date);
        this.logger = s02;
    }
}
