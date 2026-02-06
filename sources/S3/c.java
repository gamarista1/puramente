package S3;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.g;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f5904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f5905b;

    public /* synthetic */ c(ConstraintTrackingWorker constraintTrackingWorker, g gVar) {
        this.f5904a = constraintTrackingWorker;
        this.f5905b = gVar;
    }

    public final void run() {
        ConstraintTrackingWorker.g(this.f5904a, this.f5905b);
    }
}
