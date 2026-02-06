package Fb;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import ic.C5027b;
import java.util.concurrent.Executors;

public final /* synthetic */ class e implements C5027b {
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
    }
}
