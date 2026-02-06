package xa;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* renamed from: xa.e  reason: case insensitive filesystem */
public final /* synthetic */ class C5272e implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C5272e f62167a = new C5272e();

    private /* synthetic */ C5272e() {
    }

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
