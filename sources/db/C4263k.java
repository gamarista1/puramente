package Db;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C4791i;
import com.google.firebase.auth.C4817x;

/* renamed from: Db.k  reason: case insensitive filesystem */
final class C4263k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4264l f50520a;

    C4263k(C4264l lVar) {
        this.f50520a = lVar;
    }

    public final /* synthetic */ Object then(Task task) {
        if (this.f50520a.f50524d == null) {
            return task;
        }
        if (task.isSuccessful()) {
            C4791i iVar = (C4791i) task.getResult();
            return Tasks.forResult(new y0((C4258f) iVar.H(), (w0) iVar.a0(), this.f50520a.f50524d));
        }
        Exception exception = task.getException();
        if (exception instanceof C4817x) {
            ((C4817x) exception).c(this.f50520a.f50524d);
        }
        return Tasks.forException(exception);
    }
}
