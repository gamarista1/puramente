package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import o7.C3889e;
import t8.C4050a;

public final class b extends d {
    public b(Context context) {
        super(context, (AttributeSet) null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return C3889e.c.Message.b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C4050a.f48287a;
    }

    /* access modifiers changed from: protected */
    public e getDialog() {
        a aVar;
        if (getFragment() != null) {
            aVar = new a(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            aVar = new a(getNativeFragment(), getRequestCode());
        } else {
            aVar = new a(getActivity(), getRequestCode());
        }
        aVar.l(getCallbackManager());
        return aVar;
    }
}
