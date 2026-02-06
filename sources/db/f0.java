package Db;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

final class f0 implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50514a;

    f0(C4255c cVar, TaskCompletionSource taskCompletionSource) {
        this.f50514a = taskCompletionSource;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f50514a.setResult(new l0().c((String) obj).b());
    }
}
