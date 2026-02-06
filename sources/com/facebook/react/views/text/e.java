package com.facebook.react.views.text;

import com.facebook.react.uimanager.V;
import e8.C3500a;

public class e extends V {

    /* renamed from: a  reason: collision with root package name */
    private String f42128a = null;

    public String f() {
        return this.f42128a;
    }

    public boolean isVirtual() {
        return true;
    }

    @C3500a(name = "text")
    public void setText(String str) {
        this.f42128a = str;
        markUpdated();
    }

    public String toString() {
        return getViewClass() + " [text: " + this.f42128a + "]";
    }
}
