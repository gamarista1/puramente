package S3;

import androidx.work.impl.workers.ConstraintTrackingWorker;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f5902a;

    public /* synthetic */ a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f5902a = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker.h(this.f5902a);
    }
}
