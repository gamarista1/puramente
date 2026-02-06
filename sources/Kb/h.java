package kb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final m f60905a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f60906b = new Handler(Looper.getMainLooper());

    h(m mVar) {
        this.f60905a = mVar;
    }

    public final Task a() {
        return this.f60905a.a();
    }

    public final Task b(Activity activity, C5062b bVar) {
        if (bVar.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new g(this, this.f60906b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }
}
