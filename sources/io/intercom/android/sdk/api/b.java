package io.intercom.android.sdk.api;

import com.adjust.sdk.network.ErrorCodes;
import io.intercom.android.sdk.IntercomError;
import io.intercom.android.sdk.IntercomStatusCallback;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomStatusCallback f68519a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ErrorObject f68520b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f68521c;

    public /* synthetic */ b(IntercomStatusCallback intercomStatusCallback, ErrorObject errorObject, String str) {
        this.f68519a = intercomStatusCallback;
        this.f68520b = errorObject;
        this.f68521c = str;
    }

    public final void run() {
        this.f68519a.onFailure(new IntercomError(ErrorCodes.SERVER_RETRY_IN, "ERROR - [HTTP " + this.f68520b.getStatusCode() + "] - " + this.f68521c));
    }
}
