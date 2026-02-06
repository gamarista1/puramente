package com.facebook.react.modules.statusbar;

import android.app.Activity;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f41119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f41120b;

    public /* synthetic */ a(Activity activity, boolean z10) {
        this.f41119a = activity;
        this.f41120b = z10;
    }

    public final void run() {
        StatusBarModule.setHidden$lambda$1(this.f41119a, this.f41120b);
    }
}
