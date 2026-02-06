package xa;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f62177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C5268a f62178b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f62179c;

    public /* synthetic */ o(Context context, C5268a aVar, CountDownLatch countDownLatch) {
        this.f62177a = context;
        this.f62178b = aVar;
        this.f62179c = countDownLatch;
    }

    public final void run() {
        Task task;
        C5268a aVar = this.f62178b;
        if (TextUtils.isEmpty(aVar.p0())) {
            task = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", aVar.p0());
            Integer q02 = aVar.q0();
            if (q02 != null) {
                bundle.putInt("google.product_id", q02.intValue());
            }
            Context context = this.f62177a;
            bundle.putBoolean("supports_message_handled", true);
            task = D.b(context).c(2, bundle);
        }
        task.addOnCompleteListener((Executor) m.f62175a, new n(this.f62179c));
    }
}
