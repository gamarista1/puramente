package Db;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.A;
import com.google.firebase.auth.FirebaseAuth;

public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f50497c = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final L f50498a;

    /* renamed from: b  reason: collision with root package name */
    private final C4275x f50499b;

    private d0() {
        this(L.k(), C4275x.a());
    }

    public static d0 g() {
        return f50497c;
    }

    public final Task a() {
        return this.f50498a.a();
    }

    public final void b(Context context) {
        this.f50498a.b(context);
    }

    public final void c(FirebaseAuth firebaseAuth) {
        this.f50498a.i(firebaseAuth);
    }

    public final boolean d(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth) {
        return this.f50499b.i(activity, taskCompletionSource, firebaseAuth);
    }

    public final boolean e(Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, A a10) {
        return this.f50499b.j(activity, taskCompletionSource, firebaseAuth, a10);
    }

    public final Task f() {
        return this.f50498a.j();
    }

    private d0(L l10, C4275x xVar) {
        this.f50498a = l10;
        this.f50499b = xVar;
    }
}
