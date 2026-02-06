package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class G extends I {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f54115a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f54116b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f54117c;

    G(Intent intent, Activity activity, int i10) {
        this.f54115a = intent;
        this.f54116b = activity;
        this.f54117c = i10;
    }

    public final void a() {
        Intent intent = this.f54115a;
        if (intent != null) {
            this.f54116b.startActivityForResult(intent, this.f54117c);
        }
    }
}
