package xa;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: xa.f  reason: case insensitive filesystem */
public final /* synthetic */ class C5273f implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C5273f f62168a = new C5273f();

    private /* synthetic */ C5273f() {
    }

    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new C5268a(intent);
        }
        return null;
    }
}
