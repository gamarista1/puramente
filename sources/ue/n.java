package Ue;

import io.invertase.firebase.common.a;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class n implements RejectedExecutionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f65209a;

    public /* synthetic */ n(a aVar) {
        this.f65209a = aVar;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f65209a.h(runnable, threadPoolExecutor);
    }
}
