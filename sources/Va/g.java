package va;

import android.content.Context;
import android.util.Log;
import c2.C1893a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4506s;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class g extends C1893a implements C4506s {

    /* renamed from: o  reason: collision with root package name */
    private final Semaphore f61729o = new Semaphore(0);

    /* renamed from: p  reason: collision with root package name */
    private final Set f61730p;

    public g(Context context, Set set) {
        super(context);
        this.f61730p = set;
    }

    public final /* bridge */ /* synthetic */ Object G() {
        int i10 = 0;
        for (f g10 : this.f61730p) {
            if (g10.g(this)) {
                i10++;
            }
        }
        try {
            this.f61729o.tryAcquire(i10, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void r() {
        this.f61729o.drainPermits();
        h();
    }
}
