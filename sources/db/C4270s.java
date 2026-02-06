package Db;

import com.google.android.gms.tasks.OnFailureListener;
import ub.o;

/* renamed from: Db.s  reason: case insensitive filesystem */
final class C4270s implements OnFailureListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4271t f50555a;

    C4270s(C4271t tVar) {
        this.f50555a = tVar;
    }

    public final void onFailure(Exception exc) {
        if (exc instanceof o) {
            C4269q.f50541h.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f50555a.f50558b.d();
        }
    }
}
