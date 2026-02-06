package Db;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Db.w  reason: case insensitive filesystem */
final class C4274w implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f50564a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f50565b;

    C4274w(C4275x xVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.f50564a = taskCompletionSource;
        this.f50565b = context;
    }

    public final void onFailure(Exception exc) {
        this.f50564a.setException(exc);
        C4275x.g(this.f50565b);
    }
}
