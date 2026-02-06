package Fb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import ic.C5027b;
import java.util.concurrent.Executors;

public final /* synthetic */ class b implements C5027b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
    }
}
