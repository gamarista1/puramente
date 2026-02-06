package io.invertase.firebase.storage;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f71471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Promise f71472b;

    public /* synthetic */ b(f fVar, Promise promise) {
        this.f71471a = fVar;
        this.f71472b = promise;
    }

    public final void onComplete(Task task) {
        this.f71471a.y(this.f71472b, task);
    }
}
