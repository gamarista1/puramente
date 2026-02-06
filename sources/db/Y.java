package Db;

import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;

final class Y implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f50484a;

    Y(W w10, RecaptchaAction recaptchaAction) {
        this.f50484a = recaptchaAction;
    }

    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f50484a);
        }
        Exception exc = (Exception) C4536s.l(task.getException());
        if (!(exc instanceof T)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            String message = exc.getMessage();
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message);
        }
        return Tasks.forResult("");
    }
}
