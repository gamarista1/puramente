package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;

public class W {

    /* renamed from: a  reason: collision with root package name */
    final ReadableMap f41560a;

    public W(ReadableMap readableMap) {
        this.f41560a = readableMap;
    }

    public boolean a(String str, boolean z10) {
        if (this.f41560a.isNull(str)) {
            return z10;
        }
        return this.f41560a.getBoolean(str);
    }

    public String b(String str) {
        return this.f41560a.getString(str);
    }

    public boolean c(String str) {
        return this.f41560a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f41560a.toString() + " }";
    }
}
