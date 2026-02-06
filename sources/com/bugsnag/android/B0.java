package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class B0 extends C3261o {

    /* renamed from: a  reason: collision with root package name */
    private final C0 f38408a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B0(C0 c02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C0() : c02);
    }

    public void b(String str, String str2) {
        this.f38408a.a(str, str2);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.b bVar = new v1.b(str, str2);
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(bVar);
            }
        }
    }

    public void c(String str) {
        this.f38408a.b(str);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.d dVar = new v1.d(str);
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(dVar);
            }
        }
    }

    public void d() {
        this.f38408a.c();
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.e eVar = v1.e.f38914a;
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(eVar);
            }
        }
    }

    public final B0 e() {
        return new B0(this.f38408a.d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B0) && C6496s.c(this.f38408a, ((B0) obj).f38408a);
    }

    public final void f() {
        for (A0 a02 : h()) {
            String str = (String) a02.getKey();
            String str2 = (String) a02.getValue();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                v1.b bVar = new v1.b(str, str2);
                for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(bVar);
                }
            }
        }
    }

    public final C0 g() {
        return this.f38408a;
    }

    public final List h() {
        return this.f38408a.e();
    }

    public int hashCode() {
        return this.f38408a.hashCode();
    }

    public String toString() {
        return "FeatureFlagState(featureFlags=" + this.f38408a + ')';
    }

    public B0(C0 c02) {
        this.f38408a = c02;
    }
}
