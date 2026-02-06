package xa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

/* renamed from: xa.g  reason: case insensitive filesystem */
public final /* synthetic */ class C5274g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f62169a;

    public /* synthetic */ C5274g(TaskCompletionSource taskCompletionSource) {
        this.f62169a = taskCompletionSource;
    }

    public final void run() {
        if (this.f62169a.trySetException(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
