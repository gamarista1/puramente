package rc;

import com.google.firebase.perf.application.a;
import uc.C5233a;

public final class f implements a.C0859a {

    /* renamed from: a  reason: collision with root package name */
    private static final C5233a f61576a = C5233a.e();

    public void a() {
        try {
            e.c();
        } catch (IllegalStateException e10) {
            f61576a.k("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e10);
        }
    }
}
