package Db;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;

final class F extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f50449a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f50450b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4275x f50451c;

    F(C4275x xVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f50451c = xVar;
        this.f50449a = new WeakReference(activity);
        this.f50450b = taskCompletionSource;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f50449a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f50450b.setException(zzach.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C4275x.g(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                C4275x.c(this.f50451c, intent, this.f50450b, context);
                return;
            }
            TaskCompletionSource taskCompletionSource = this.f50450b;
            taskCompletionSource.setException(zzach.zza(C4267o.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        } else if (e0.d(intent)) {
            this.f50450b.setException(zzach.zza(e0.a(intent)));
            C4275x.g(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f50450b.setException(zzach.zza(C4267o.a("WEB_CONTEXT_CANCELED")));
            C4275x.g(context);
        }
    }
}
