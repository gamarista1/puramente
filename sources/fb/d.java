package Fb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import ic.C5027b;
import java.util.concurrent.Executors;

public final /* synthetic */ class d implements C5027b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
    }
}
