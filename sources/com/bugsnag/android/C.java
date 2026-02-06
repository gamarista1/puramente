package com.bugsnag.android;

import K4.k;
import K4.r;
import L4.d;
import com.bugsnag.android.v1;

public final class C extends C3261o {
    public final void b() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.h hVar = v1.h.f38918a;
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(hVar);
            }
        }
    }

    public final void c(k kVar, String str, int i10) {
        String str2;
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            String a10 = kVar.a();
            boolean c10 = kVar.l().c();
            String d10 = kVar.d();
            d h10 = kVar.h();
            if (h10 == null) {
                str2 = null;
            } else {
                str2 = (String) h10.a();
            }
            v1.i iVar = new v1.i(a10, c10, d10, str2, kVar.C(), str, i10, kVar.E(), kVar.s());
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(iVar);
            }
        }
    }

    public final void d(String str) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.r rVar = new v1.r(str);
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(rVar);
            }
        }
    }
}
