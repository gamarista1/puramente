package Fb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import ic.C5027b;
import java.util.concurrent.Executors;

public final /* synthetic */ class c implements C5027b {
    public final Object get() {
        return ExecutorsRegistrar.u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.t())));
    }
}
