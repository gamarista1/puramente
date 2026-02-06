package If;

import Uf.C5553f;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public abstract class h1 {
    /* access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        C6496s.e(cls);
        return C5553f.f(cls);
    }

    /* access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C6496s.g(parameterTypes, "getParameterTypes(...)");
        sb2.append(C6559l.M0(parameterTypes, "", "(", ")", 0, (CharSequence) null, g1.f63678a, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        C6496s.g(returnType, "getReturnType(...)");
        sb2.append(C5553f.f(returnType));
        return sb2.toString();
    }
}
