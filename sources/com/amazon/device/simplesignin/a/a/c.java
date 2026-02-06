package com.amazon.device.simplesignin.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.d.a;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import lombok.NonNull;

public abstract class c extends h {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f38041b = "c";

    public c(d dVar, String str, String str2) {
        super(dVar, str, str2, dVar.e().toString(), SimpleSignInService.SDK_VERSION);
        super.b(false);
    }

    /* access modifiers changed from: protected */
    public abstract void a(RequestStatus requestStatus);

    /* access modifiers changed from: protected */
    public void a(@NonNull final Object obj) {
        if (obj != null) {
            String str = f38041b;
            a.a(str, "Response type received: " + obj.getClass().getSimpleName());
            Context c10 = com.amazon.device.simplesignin.a.c.a().c();
            final ISimpleSignInResponseHandler d10 = com.amazon.device.simplesignin.a.c.a().d();
            if (c10 == null || d10 == null) {
                a.a(str, "Dropping the response as context of response handler is null.");
                return;
            }
            new Handler(c10.getMainLooper()).post(new Runnable() {
                public void run() {
                    try {
                        Object obj = obj;
                        if (obj instanceof GetUserAndLinksResponse) {
                            d10.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj);
                        } else if (obj instanceof LinkUserAccountResponse) {
                            d10.onLinkUserAccountResponse((LinkUserAccountResponse) obj);
                        } else if (obj instanceof ShowLoginSelectionResponse) {
                            d10.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj);
                        } else if (obj instanceof RecordMetricsEventResponse) {
                            d10.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj);
                        } else {
                            String o10 = c.f38041b;
                            a.b(o10, "Unknown response type:" + obj.getClass().getName());
                        }
                    } catch (Exception e10) {
                        String o11 = c.f38041b;
                        a.b(o11, "Error in sending response to callback: " + e10);
                    }
                }
            });
            return;
        }
        throw new NullPointerException("response is marked non-null but is null");
    }

    public void b(com.amazon.d.a.h hVar) {
        try {
            String g10 = hVar.g();
            if (a.f37995F.equals(g10)) {
                a(RequestStatus.NOT_SUPPORTED);
            } else if (a.f37998I.equals(g10)) {
                a(RequestStatus.NOT_AVAILABLE);
            } else if (a.f37996G.equals(g10)) {
                a(RequestStatus.DUPLICATE_REQUEST);
            } else if (a.f37997H.equals(g10)) {
                a(RequestStatus.FEATURE_TURNED_OFF);
            } else if (a.f37999J.equals(g10)) {
                a(RequestStatus.RETRYABLE_FAILURE);
            } else if (a.f38000K.equals(g10)) {
                a(RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION);
            } else {
                if (a.f38001L.equals(g10)) {
                    a(RequestStatus.INVALID_LINK_SIGNING_KEY);
                    return;
                }
                a(RequestStatus.FAILURE);
            }
        } catch (RemoteException unused) {
            a.b(f38041b, "Exception while fetching reason for failure");
        }
    }
}
