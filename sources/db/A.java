package Db;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

final class A implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50422a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f50423b;

    A(C4275x xVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f50422a = taskCompletionSource;
        this.f50423b = context;
    }

    public final void onFailure(Exception exc) {
        this.f50422a.setException(exc);
        C4275x.g(this.f50423b);
    }
}
