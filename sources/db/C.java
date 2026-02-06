package Db;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;

final class C extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f50439a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource f50440b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseAuth f50441c;

    /* renamed from: d  reason: collision with root package name */
    private final A f50442d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4275x f50443e;

    C(C4275x xVar, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, A a10) {
        this.f50443e = xVar;
        this.f50439a = new WeakReference(activity);
        this.f50440b = taskCompletionSource;
        this.f50441c = firebaseAuth;
        this.f50442d = a10;
    }

    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f50439a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f50440b.setException(zzach.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            C4275x.g(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f50441c.A(C4275x.b(intent)).addOnSuccessListener(new C4277z(this.f50443e, this.f50440b, context)).addOnFailureListener(new C4274w(this.f50443e, this.f50440b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                this.f50442d.v0(C4275x.b(intent)).addOnSuccessListener(new B(this.f50443e, this.f50440b, context)).addOnFailureListener(new C4276y(this.f50443e, this.f50440b, context));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                this.f50442d.w0(C4275x.b(intent)).addOnSuccessListener(new E(this.f50443e, this.f50440b, context)).addOnFailureListener(new A(this.f50443e, this.f50440b, context));
            } else {
                TaskCompletionSource taskCompletionSource = this.f50440b;
                taskCompletionSource.setException(zzach.zza(C4267o.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
        } else if (e0.d(intent)) {
            this.f50440b.setException(zzach.zza(e0.a(intent)));
            C4275x.g(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            this.f50440b.setException(zzach.zza(C4267o.a("WEB_CONTEXT_CANCELED")));
            C4275x.g(context);
        }
    }
}
