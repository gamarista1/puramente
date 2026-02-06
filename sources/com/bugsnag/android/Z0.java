package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Z0 extends C3261o {

    /* renamed from: a  reason: collision with root package name */
    private final Y0 f38645a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z0(Y0 y02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Y0((Map) null, 1, (DefaultConstructorMarker) null) : y02);
    }

    private final void i(String str, String str2) {
        if (str2 == null) {
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                v1.f fVar = new v1.f(str);
                for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(fVar);
                }
            }
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.g gVar = new v1.g(str, str2);
            for (r onStateChange2 : getObservers$bugsnag_android_core_release()) {
                onStateChange2.onStateChange(gVar);
            }
        }
    }

    private final void j(String str, String str2, Object obj) {
        if (obj == null) {
            i(str, str2);
        } else if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.c cVar = new v1.c(str, str2, h().h(str, str2));
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(cVar);
            }
        }
    }

    private final void k(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                v1.c cVar = new v1.c(str, (String) entry.getKey(), h().h(str, (String) entry.getKey()));
                for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(cVar);
                }
            }
        }
    }

    public void b(String str, String str2, Object obj) {
        this.f38645a.a(str, str2, obj);
        j(str, str2, obj);
    }

    public void c(String str, Map map) {
        this.f38645a.b(str, map);
        k(str, map);
    }

    public void d(String str) {
        this.f38645a.c(str);
        i(str, (String) null);
    }

    public void e(String str, String str2) {
        this.f38645a.d(str, str2);
        i(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z0) && C6496s.c(this.f38645a, ((Z0) obj).f38645a);
    }

    public final Z0 f(Y0 y02) {
        return new Z0(y02);
    }

    public final void g() {
        Set<Map.Entry> entrySet;
        for (String str : this.f38645a.k().keySet()) {
            Map i10 = this.f38645a.i(str);
            if (!(i10 == null || (entrySet = i10.entrySet()) == null)) {
                for (Map.Entry entry : entrySet) {
                    j(str, (String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final Y0 h() {
        return this.f38645a;
    }

    public int hashCode() {
        return this.f38645a.hashCode();
    }

    public String toString() {
        return "MetadataState(metadata=" + this.f38645a + ')';
    }

    public Z0(Y0 y02) {
        this.f38645a = y02;
    }
}
