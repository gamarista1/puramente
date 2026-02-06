package androidx.lifecycle;

import Ug.K;
import b2.C1877a;
import b2.C1878b;
import b2.C1881e;
import kotlin.jvm.internal.C6496s;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final C1881e f17191a = new C1881e();

    public static final K a(a0 a0Var) {
        C1877a aVar;
        C6496s.h(a0Var, "<this>");
        synchronized (f17191a) {
            aVar = (C1877a) a0Var.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                aVar = C1878b.a();
                a0Var.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar);
            }
        }
        return aVar;
    }
}
