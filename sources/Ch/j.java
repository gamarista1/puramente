package Ch;

import com.amazon.a.a.o.b;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62655d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Method f62656a;

    /* renamed from: b  reason: collision with root package name */
    private final Method f62657b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f62658c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(b.au, (Class[]) null);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", (Class[]) null);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new j(method3, method, method2);
        }

        private a() {
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f62656a = method;
        this.f62657b = method2;
        this.f62658c = method3;
    }

    public final Object a(String str) {
        C6496s.h(str, "closer");
        Method method = this.f62656a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, (Object[]) null);
                Method method2 = this.f62657b;
                C6496s.e(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f62658c;
                C6496s.e(method);
                method.invoke(obj, (Object[]) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
