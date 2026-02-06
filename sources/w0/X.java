package W0;

import android.view.Choreographer;

public final /* synthetic */ class X implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f8542a;

    public /* synthetic */ X(Runnable runnable) {
        this.f8542a = runnable;
    }

    public final void doFrame(long j10) {
        Y.f(this.f8542a, j10);
    }
}
