package retrofit2;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class z {

    static final class a extends z {
        a() {
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return q.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    static class b extends z {
        b() {
        }

        /* access modifiers changed from: package-private */
        public String a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return z.super.a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        /* access modifiers changed from: package-private */
        public Object b(Method method, Class cls, Object obj, Object[] objArr) {
            return q.a(method, cls, obj, objArr);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Method method) {
            return method.isDefault();
        }
    }

    z() {
    }

    /* access modifiers changed from: package-private */
    public String a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* access modifiers changed from: package-private */
    public Object b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Method method) {
        return false;
    }
}
