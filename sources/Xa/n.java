package xa;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class n implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f62176a;

    public /* synthetic */ n(CountDownLatch countDownLatch) {
        this.f62176a = countDownLatch;
    }

    public final void onComplete(Task task) {
        this.f62176a.countDown();
    }
}
