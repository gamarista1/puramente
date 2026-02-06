package Db;

import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

public abstract class N {
    private static Task a(W w10, RecaptchaAction recaptchaAction, String str, Continuation continuation) {
        Task b10 = w10.b(str, Boolean.FALSE, recaptchaAction);
        return b10.continueWithTask(continuation).continueWithTask(new S(str, w10, recaptchaAction, continuation));
    }

    static /* synthetic */ Task b(RecaptchaAction recaptchaAction, FirebaseAuth firebaseAuth, String str, Continuation continuation, Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) C4536s.l(task.getException());
        if (zzach.zzc(exc)) {
            if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                String valueOf = String.valueOf(recaptchaAction);
                Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action " + valueOf);
            }
            if (firebaseAuth.k0() == null) {
                firebaseAuth.c0(new W(firebaseAuth.j(), firebaseAuth));
            }
            return a(firebaseAuth.k0(), recaptchaAction, str, continuation);
        }
        String valueOf2 = String.valueOf(recaptchaAction);
        String message = exc.getMessage();
        Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf2 + "with exception - " + message);
        return Tasks.forException(exc);
    }

    public final Task c(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction, String str2) {
        O o10 = new O(this);
        W k02 = firebaseAuth.k0();
        if (k02 == null || !k02.d(str2)) {
            return d((String) null).continueWithTask(new P(recaptchaAction, firebaseAuth, str, o10));
        }
        return a(k02, recaptchaAction, str, o10);
    }

    public abstract Task d(String str);
}
