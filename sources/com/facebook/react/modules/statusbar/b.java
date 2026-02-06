package com.facebook.react.modules.statusbar;

import android.app.Activity;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f41121a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f41122b;

    public /* synthetic */ b(Activity activity, String str) {
        this.f41121a = activity;
        this.f41122b = str;
    }

    public final void run() {
        StatusBarModule.setStyle$lambda$2(this.f41121a, this.f41122b);
    }
}
