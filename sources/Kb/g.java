package kb;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

final class g extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f60904a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(h hVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f60904a = taskCompletionSource;
    }

    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f60904a.trySetResult(null);
    }
}
