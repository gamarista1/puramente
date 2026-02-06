package If;

import Tf.k;
import Uf.C5553f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.C6496s;

public abstract class Z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap f63643a = new ConcurrentHashMap();

    public static final k a(Class cls) {
        C6496s.h(cls, "<this>");
        ClassLoader j10 = C5553f.j(cls);
        k1 k1Var = new k1(j10);
        ConcurrentMap concurrentMap = f63643a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(k1Var);
        if (weakReference != null) {
            k kVar = (k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        k a10 = k.f65162c.a(j10);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f63643a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(k1Var, new WeakReference(a10));
                if (weakReference2 == null) {
                    k1Var.a((ClassLoader) null);
                    return a10;
                }
                k kVar2 = (k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, weakReference2);
            } finally {
                k1Var.a((ClassLoader) null);
            }
        }
    }
}
