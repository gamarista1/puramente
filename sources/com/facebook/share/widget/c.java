package com.facebook.share.widget;

import P5.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import j.C2115a;
import o7.C3889e;
import t8.C4050a;

public final class c extends d {
    public c(Context context) {
        super(context, (AttributeSet) null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    /* access modifiers changed from: protected */
    public void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setCompoundDrawablesWithIntrinsicBounds(C2115a.b(getContext(), b.f33465a), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return C3889e.c.Share.b();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C4050a.f48288b;
    }

    /* access modifiers changed from: protected */
    public e getDialog() {
        e eVar;
        if (getFragment() != null) {
            eVar = new e(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            eVar = new e(getNativeFragment(), getRequestCode());
        } else {
            eVar = new e(getActivity(), getRequestCode());
        }
        eVar.l(getCallbackManager());
        return eVar;
    }
}
