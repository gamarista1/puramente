package com.android.billingclient.api;

import J4.t;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzao;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* renamed from: com.android.billingclient.api.z  reason: case insensitive filesystem */
final class C3218z extends zzao {

    /* renamed from: a  reason: collision with root package name */
    final WeakReference f38356a;

    /* renamed from: b  reason: collision with root package name */
    final ResultReceiver f38357b;

    /* synthetic */ C3218z(WeakReference weakReference, ResultReceiver resultReceiver, t tVar) {
        this.f38356a = weakReference;
        this.f38357b = resultReceiver;
    }

    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.f38357b;
        if (resultReceiver == null) {
            zze.zzl("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            resultReceiver.send(0, (Bundle) null);
        } else {
            Activity activity = (Activity) this.f38356a.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                this.f38357b.send(0, (Bundle) null);
                zze.zzl("BillingClient", "Unable to launch intent for in-app messaging");
                return;
            }
            try {
                Intent intent = new Intent(activity, ProxyBillingActivity.class);
                intent.putExtra("in_app_message_result_receiver", this.f38357b);
                intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                activity.startActivity(intent);
            } catch (CancellationException e10) {
                this.f38357b.send(0, (Bundle) null);
                zze.zzm("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
            }
        }
    }
}
