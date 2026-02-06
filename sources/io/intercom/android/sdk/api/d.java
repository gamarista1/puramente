package io.intercom.android.sdk.api;

import com.adjust.sdk.network.ErrorCodes;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomStatusCallback f68523a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ErrorObject f68524b;

    public /* synthetic */ d(IntercomStatusCallback intercomStatusCallback, ErrorObject errorObject) {
        this.f68523a = intercomStatusCallback;
        this.f68524b = errorObject;
    }

    public final void run() {
        this.f68523a.onFailure(new IntercomError(ErrorCodes.SERVER_RETRY_IN, "ERROR - [HTTP " + this.f68524b.getStatusCode() + "] - " + ErrorStringExtractorKt.extractErrorString(this.f68524b)));
    }
}
