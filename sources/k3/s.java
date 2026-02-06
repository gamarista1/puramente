package K3;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

public abstract class s {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final w f4102a = new w(s.d().getWebkitToCompatConverter());
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        static final u f4103a = s.a();
    }

    static u a() {
        try {
            return new v((WebViewProviderFactoryBoundaryInterface) Th.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        } catch (ClassNotFoundException unused) {
            return new i();
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static w c() {
        return a.f4102a;
    }

    public static u d() {
        return b.f4103a;
    }

    public static ClassLoader e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a();
        }
        return f().getClass().getClassLoader();
    }

    private static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
