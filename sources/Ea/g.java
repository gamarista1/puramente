package Ea;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f50651a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            C4536s.l(context);
            C4536s.l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
