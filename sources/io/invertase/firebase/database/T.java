package io.invertase.firebase.database;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.invertase.firebase.common.b;

public class T extends b {
    T(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: package-private */
    public Task i(String str, String str2) {
        return Tasks.call(new S(str, str2));
    }

    /* access modifiers changed from: package-private */
    public Task j(String str, String str2) {
        return Tasks.call(new Q(str, str2));
    }
}
