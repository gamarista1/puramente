package o2;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class U implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f24929a;

    public /* synthetic */ U(Handler handler) {
        this.f24929a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f24929a.post(runnable);
    }
}
