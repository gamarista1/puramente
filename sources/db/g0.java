package Db;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4807q;

final class g0 implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50515a;

    g0(C4255c cVar, TaskCompletionSource taskCompletionSource) {
        this.f50515a = taskCompletionSource;
    }

    public final void onFailure(Exception exc) {
        Log.e(C4255c.f50489b, String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[]{exc.getMessage()}));
        if (!(exc instanceof C4807q) || !((C4807q) exc).a().endsWith("UNAUTHORIZED_DOMAIN")) {
            this.f50515a.setResult(new l0().b());
        } else {
            this.f50515a.setException(exc);
        }
    }
}
