package u1;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.v;
import lf.w;
import qf.C6658d;

final class f extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final C6658d f26544a;

    public f(C6658d dVar) {
        super(false);
        this.f26544a = dVar;
    }

    public void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            C6658d dVar = this.f26544a;
            v.a aVar = v.f71841b;
            dVar.resumeWith(v.b(w.a(th2)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f26544a.resumeWith(v.b(obj));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
