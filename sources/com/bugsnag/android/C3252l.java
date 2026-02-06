package com.bugsnag.android;

import L4.g;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;

/* renamed from: com.bugsnag.android.l  reason: case insensitive filesystem */
class C3252l {
    C3252l() {
    }

    public C3258n a(Map map) {
        return new C3258n((String) U0.c(map, "binaryArch"), (String) U0.c(map, "id"), (String) U0.c(map, "releaseStage"), (String) U0.c(map, DiagnosticsEntry.VERSION_KEY), (String) U0.c(map, "codeBundleId"), new g((String) U0.c(map, "buildUuid")), (String) U0.c(map, "type"), (Number) U0.c(map, "versionCode"), (Number) U0.c(map, "duration"), (Number) U0.c(map, "durationInForeground"), (Boolean) U0.c(map, "inForeground"), (Boolean) U0.c(map, "isLaunching"));
    }
}
