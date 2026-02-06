package Db;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.C;

/* renamed from: Db.i  reason: case insensitive filesystem */
final class C4261i implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4262j f50518a;

    C4261i(C4262j jVar) {
        this.f50518a = jVar;
    }

    public final /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(task.getException());
        }
        return Tasks.forResult(C4265m.o0(((C) task.getResult()).f(), this.f50518a.f50519a));
    }
}
