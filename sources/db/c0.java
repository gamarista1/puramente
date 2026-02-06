package Db;

import android.app.Activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

public final /* synthetic */ class c0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4255c f50492a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ TaskCompletionSource f50493b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ FirebaseAuth f50494c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ d0 f50495d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Activity f50496e;

    public /* synthetic */ c0(C4255c cVar, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, d0 d0Var, Activity activity) {
        this.f50492a = cVar;
        this.f50493b = taskCompletionSource;
        this.f50494c = firebaseAuth;
        this.f50495d = d0Var;
        this.f50496e = activity;
    }

    public final void onComplete(Task task) {
        this.f50492a.d(this.f50493b, this.f50494c, this.f50495d, this.f50496e, task);
    }
}
