package Db;

import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

final class S implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50469a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ W f50470b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ RecaptchaAction f50471c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Continuation f50472d;

    S(String str, W w10, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.f50469a = str;
        this.f50470b = w10;
        this.f50471c = recaptchaAction;
        this.f50472d = continuation;
    }

    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzach.zzb((Exception) C4536s.l(task.getException()))) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            String str = this.f50469a;
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return this.f50470b.b(this.f50469a, Boolean.TRUE, this.f50471c).continueWithTask(this.f50472d);
    }
}
