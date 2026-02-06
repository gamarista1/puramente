package ja;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ja.b  reason: case insensitive filesystem */
public abstract class C3646b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f44996a;

    public static IBinder a(Bundle bundle, String str) {
        if (M.f44981a >= 18) {
            return bundle.getBinder(str);
        }
        return b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f44996a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f44996a = method2;
                method2.setAccessible(true);
                method = f44996a;
            } catch (NoSuchMethodException e10) {
                s.g("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            s.g("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }
}
