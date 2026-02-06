package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class L extends C3261o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38515c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f38516a;

    /* renamed from: b  reason: collision with root package name */
    private String f38517b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final void b() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            v1.n nVar = new v1.n(c());
            for (r onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(nVar);
            }
        }
    }

    public final String c() {
        String str = this.f38517b;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        if (str == null) {
            return this.f38516a;
        }
        return str;
    }

    public final void d(String str) {
        if (this.f38517b != "__BUGSNAG_MANUAL_CONTEXT__") {
            this.f38517b = str;
            b();
        }
    }

    public final void e(String str) {
        this.f38516a = str;
        this.f38517b = "__BUGSNAG_MANUAL_CONTEXT__";
        b();
    }
}
