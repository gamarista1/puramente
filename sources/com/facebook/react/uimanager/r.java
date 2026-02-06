package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import kotlin.jvm.internal.C6496s;

public class r extends JSApplicationCausedNativeException {

    /* renamed from: a  reason: collision with root package name */
    private View f41709a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(str);
        C6496s.h(str, "msg");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, View view, Throwable th2) {
        super(str, th2);
        C6496s.h(str, "msg");
        C6496s.h(th2, "cause");
        this.f41709a = view;
    }
}
