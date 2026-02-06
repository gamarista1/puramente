package com.facebook.reactnative.androidsdk;

import android.app.Activity;
import android.content.Intent;
import com.facebook.C3324n;
import com.facebook.react.bridge.BaseActivityEventListener;

public class a extends BaseActivityEventListener {

    /* renamed from: a  reason: collision with root package name */
    private C3324n f42378a = C3324n.b.a();

    public C3324n a() {
        return this.f42378a;
    }

    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        this.f42378a.a(i10, i11, intent);
    }
}
