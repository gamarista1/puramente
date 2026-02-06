package Kc;

import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.storage.F;
import java.util.concurrent.Executor;

public class g {

    /* renamed from: b  reason: collision with root package name */
    static boolean f51477b = false;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f51478a;

    public g(Executor executor) {
        if (executor != null) {
            this.f51478a = executor;
        } else if (!f51477b) {
            this.f51478a = F.b().c();
        } else {
            this.f51478a = null;
        }
    }

    public void a(Runnable runnable) {
        C4536s.l(runnable);
        Executor executor = this.f51478a;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            F.b().e(runnable);
        }
    }
}
