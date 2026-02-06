package kb;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import lb.C5076i;

final class l extends k {

    /* renamed from: d  reason: collision with root package name */
    final String f60913d;

    l(m mVar, TaskCompletionSource taskCompletionSource, String str) {
        super(mVar, new C5076i("OnRequestInstallCallback"), taskCompletionSource);
        this.f60913d = str;
    }

    public final void Y0(Bundle bundle) {
        super.Y0(bundle);
        this.f60911b.trySetResult(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
