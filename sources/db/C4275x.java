package Db;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.FirebaseAuth;
import d2.C1926a;
import za.e;

/* renamed from: Db.x  reason: case insensitive filesystem */
public final class C4275x {

    /* renamed from: c  reason: collision with root package name */
    private static C4275x f50570c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f50571a = false;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f50572b;

    private C4275x() {
    }

    public static C4275x a() {
        if (f50570c == null) {
            f50570c = new C4275x();
        }
        return f50570c;
    }

    private static C4789h b(Intent intent) {
        C4536s.l(intent);
        return C0.v0(((zzags) e.b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", zzags.CREATOR)).zzc(true));
    }

    static /* synthetic */ void c(C4275x xVar, Intent intent, TaskCompletionSource taskCompletionSource, Context context) {
        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
        g(context);
    }

    private final void f(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f50572b = broadcastReceiver;
        C1926a.b(activity).c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    static void g(Context context) {
        C4275x xVar = f50570c;
        xVar.f50571a = false;
        if (xVar.f50572b != null) {
            C1926a.b(context).e(f50570c.f50572b);
        }
        f50570c.f50572b = null;
    }

    public final boolean h(Activity activity, TaskCompletionSource taskCompletionSource) {
        if (this.f50571a) {
            return false;
        }
        f(activity, new F(this, activity, taskCompletionSource));
        this.f50571a = true;
        return true;
    }

    public final boolean i(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return j(activity, taskCompletionSource, firebaseAuth, (A) null);
    }

    public final boolean j(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, A a10) {
        if (this.f50571a) {
            return false;
        }
        f(activity, new C(this, activity, taskCompletionSource, firebaseAuth, a10));
        this.f50571a = true;
        return true;
    }
}
