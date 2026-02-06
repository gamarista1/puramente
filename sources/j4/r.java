package J4;

import com.google.android.gms.internal.play_billing.zze;
import java.util.concurrent.Future;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Future f32160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f32161b;

    public /* synthetic */ r(Future future, Runnable runnable) {
        this.f32160a = future;
        this.f32161b = runnable;
    }

    public final void run() {
        Future future = this.f32160a;
        if (!future.isDone() && !future.isCancelled()) {
            Runnable runnable = this.f32161b;
            future.cancel(true);
            zze.zzl("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
