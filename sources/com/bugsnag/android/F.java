package com.bugsnag.android;

import K4.k;
import L4.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class F {
    F() {
    }

    private Collection b(k kVar) {
        Set<BreadcrumbType> k10 = kVar.k();
        if (k10 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (BreadcrumbType breadcrumbType : k10) {
            hashSet.add(breadcrumbType.toString());
        }
        return hashSet;
    }

    private Map c(k kVar) {
        HashMap hashMap = new HashMap();
        C3247j0 n10 = kVar.n();
        hashMap.put("notify", n10.a());
        hashMap.put("sessions", n10.b());
        return hashMap;
    }

    private Map d(k kVar) {
        HashMap hashMap = new HashMap();
        C3259n0 l10 = kVar.l();
        hashMap.put("anrs", Boolean.valueOf(l10.b()));
        hashMap.put("ndkCrashes", Boolean.valueOf(l10.c()));
        hashMap.put("unhandledExceptions", Boolean.valueOf(l10.d()));
        hashMap.put("unhandledRejections", Boolean.valueOf(l10.e()));
        return hashMap;
    }

    public void a(Map map, k kVar) {
        map.put("apiKey", kVar.a());
        map.put("autoDetectErrors", Boolean.valueOf(kVar.f()));
        map.put("autoTrackSessions", Boolean.valueOf(kVar.g()));
        map.put("sendThreads", kVar.E().toString());
        map.put("projectPackages", kVar.A());
        map.put("enabledReleaseStages", kVar.m());
        map.put("releaseStage", kVar.C());
        d h10 = kVar.h();
        if (h10 != null) {
            map.put("buildUuid", h10.a());
        }
        if (kVar.d() != null) {
            map.put("appVersion", kVar.d());
        }
        map.put("versionCode", kVar.I());
        map.put("type", kVar.c());
        map.put("persistUser", Boolean.valueOf(kVar.y()));
        map.put("generateAnonymousId", Boolean.valueOf(kVar.p()));
        map.put("launchCrashThresholdMs", Integer.valueOf((int) kVar.q()));
        map.put("maxBreadcrumbs", Integer.valueOf(kVar.s()));
        map.put("enabledBreadcrumbTypes", b(kVar));
        map.put("enabledErrorTypes", d(kVar));
        map.put("endpoints", c(kVar));
    }
}
