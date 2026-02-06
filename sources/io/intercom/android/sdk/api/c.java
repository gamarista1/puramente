package io.intercom.android.sdk.api;

import com.adjust.sdk.network.ErrorCodes;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomStatusCallback f68522a;

    public /* synthetic */ c(IntercomStatusCallback intercomStatusCallback) {
        this.f68522a = intercomStatusCallback;
    }

    public final void run() {
        this.f68522a.onFailure(new IntercomError(ErrorCodes.SERVER_RETRY_IN, "ERROR"));
    }
}
