package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;
import kotlin.jvm.internal.C6496s;

public final class W0 extends C3261o {

    /* renamed from: a  reason: collision with root package name */
    private boolean f38627a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f38628b;

    private final String b(Integer num) {
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }

    public final void c() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.q qVar = new v1.q(f(), d(), e());
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(qVar);
            }
        }
    }

    public final Integer d() {
        return this.f38628b;
    }

    public final String e() {
        return b(this.f38628b);
    }

    public final boolean f() {
        return this.f38627a;
    }

    public final void g(boolean z10) {
        this.f38627a = z10;
    }

    public final boolean h(Integer num) {
        if (C6496s.c(this.f38628b, num)) {
            return false;
        }
        this.f38628b = num;
        return true;
    }
}
