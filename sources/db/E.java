package Db;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C4791i;

final class E implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50447a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f50448b;

    E(C4275x xVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f50447a = taskCompletionSource;
        this.f50448b = context;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f50447a.setResult((C4791i) obj);
        C4275x.g(this.f50448b);
    }
}
