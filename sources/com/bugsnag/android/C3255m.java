package com.bugsnag.android;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;

/* renamed from: com.bugsnag.android.m  reason: case insensitive filesystem */
public final class C3255m {
    public void a(Map map, C3258n nVar) {
        map.put("type", nVar.f());
        map.put("binaryArch", nVar.a());
        map.put("buildUuid", nVar.b());
        map.put("codeBundleId", nVar.c());
        map.put("duration", nVar.j());
        map.put("durationInForeground", nVar.k());
        map.put("id", nVar.d());
        map.put("inForeground", nVar.l());
        map.put("isLaunching", nVar.m());
        map.put("releaseStage", nVar.e());
        map.put(DiagnosticsEntry.VERSION_KEY, nVar.g());
        map.put("versionCode", nVar.h());
    }
}
