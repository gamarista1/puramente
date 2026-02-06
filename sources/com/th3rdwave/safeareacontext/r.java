package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.n0;
import kotlin.jvm.internal.C6496s;

public abstract class r {
    public static final ReactContext a(View view) {
        C6496s.h(view, "view");
        ReactContext d10 = n0.d(view);
        C6496s.g(d10, "getReactContext(...)");
        return d10;
    }

    public static final int b(Context context) {
        C6496s.h(context, "context");
        return n0.e(context);
    }
}
