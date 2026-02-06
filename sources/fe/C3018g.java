package Fe;

import android.os.AsyncTask;

/* renamed from: Fe.g  reason: case insensitive filesystem */
public abstract class C3018g extends AsyncTask {
    public final AsyncTask a(Object... objArr) {
        try {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
        } catch (Exception e10) {
            C3023l.m("Caught Exception in AsyncTask: " + e10.getMessage());
            return execute(objArr);
        }
    }
}
