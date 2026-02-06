package Db;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.Recaptcha;

final class U implements Q {
    U() {
    }

    public final Task a(Application application, String str) {
        return Recaptcha.getTasksClient(application, str);
    }
}
