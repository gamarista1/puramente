package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomStatusCallback f68518a;

    public /* synthetic */ a(IntercomStatusCallback intercomStatusCallback) {
        this.f68518a = intercomStatusCallback;
    }

    public final void run() {
        this.f68518a.onSuccess();
    }
}
