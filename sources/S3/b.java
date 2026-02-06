package S3;

import Ug.C5600w0;
import androidx.work.impl.workers.ConstraintTrackingWorker;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5600w0 f5903a;

    public /* synthetic */ b(C5600w0 w0Var) {
        this.f5903a = w0Var;
    }

    public final void run() {
        ConstraintTrackingWorker.f(this.f5903a);
    }
}
