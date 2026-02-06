package com.adjust.sdk;

import android.content.Context;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f36974a;

    public /* synthetic */ c(Context context) {
        this.f36974a = context;
    }

    public final void run() {
        SharedPreferencesManager.getDefaultInstance(this.f36974a).setSendingReferrersAsNotSent();
    }
}
