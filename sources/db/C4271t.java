package Db;

import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import ub.C5230g;

/* renamed from: Db.t  reason: case insensitive filesystem */
final class C4271t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f50557a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C4269q f50558b;

    C4271t(C4269q qVar, String str) {
        this.f50558b = qVar;
        this.f50557a = C4536s.f(str);
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(C5230g.p(this.f50557a));
        if (instance.k() != null) {
            Task b10 = instance.b(true);
            C4269q.f50541h.g("Token refreshing started", new Object[0]);
            b10.addOnFailureListener(new C4270s(this));
        }
    }
}
