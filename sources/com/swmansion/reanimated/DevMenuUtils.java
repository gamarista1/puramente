package com.swmansion.reanimated;

import I7.d;
import I7.e;
import com.facebook.react.C3446x;
import com.facebook.react.bridge.ReactApplicationContext;

public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, d dVar) {
        e eVar;
        if (reactApplicationContext.getApplicationContext() instanceof C3446x) {
            if (reactApplicationContext.isBridgeless()) {
                eVar = ((C3446x) reactApplicationContext.getApplicationContext()).b().f();
            } else {
                eVar = ((C3446x) reactApplicationContext.getApplicationContext()).a().c().E();
            }
            if (eVar != null) {
                eVar.t("Toggle slow animations (Reanimated)", dVar);
                return;
            }
            throw new RuntimeException("[Reanimated] DevSupportManager is not available");
        }
    }
}
