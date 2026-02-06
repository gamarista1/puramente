package W0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

public final /* synthetic */ class W implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Choreographer f8541a;

    public /* synthetic */ W(Choreographer choreographer) {
        this.f8541a = choreographer;
    }

    public final void execute(Runnable runnable) {
        Y.e(this.f8541a, runnable);
    }
}
