package androidx.work;

import android.content.Context;

public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18659a = s.i("WorkerFactory");

    class a extends G {
        a() {
        }

        public r a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static G c() {
        return new a();
    }

    public abstract r a(Context context, String str, WorkerParameters workerParameters);

    public final r b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        r a10 = a(context, str, workerParameters);
        if (a10 == null) {
            try {
                cls = Class.forName(str).asSubclass(r.class);
            } catch (Throwable th2) {
                s e10 = s.e();
                String str2 = f18659a;
                e10.d(str2, "Invalid class: " + str, th2);
                cls = null;
            }
            if (cls != null) {
                try {
                    a10 = (r) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th3) {
                    s e11 = s.e();
                    String str3 = f18659a;
                    e11.d(str3, "Could not instantiate " + str, th3);
                }
            }
        }
        if (a10 == null || !a10.isUsed()) {
            return a10;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
