package Db;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Db.y  reason: case insensitive filesystem */
final class C4276y implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50573a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f50574b;

    C4276y(C4275x xVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f50573a = taskCompletionSource;
        this.f50574b = context;
    }

    public final void onFailure(Exception exc) {
        this.f50573a.setException(exc);
        C4275x.g(this.f50574b);
    }
}
