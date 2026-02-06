package Db;

import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class O implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ N f50464a;

    public /* synthetic */ O(N n10) {
        this.f50464a = n10;
    }

    public final Object then(Task task) {
        N n10 = this.f50464a;
        if (task.isSuccessful()) {
            return n10.d((String) task.getResult());
        }
        String message = ((Exception) C4536s.l(task.getException())).getMessage();
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message + "\n\n Failing open with a fake token.");
        return n10.d("NO_RECAPTCHA");
    }
}
