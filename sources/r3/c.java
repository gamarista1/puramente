package R3;

import Q3.s;
import Ug.C5583n0;
import Ug.G;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final s f5812a;

    /* renamed from: b  reason: collision with root package name */
    private final G f5813b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f5814c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final Executor f5815d = new a();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            c.this.f5814c.post(runnable);
        }
    }

    public c(Executor executor) {
        s sVar = new s(executor);
        this.f5812a = sVar;
        this.f5813b = C5583n0.a(sVar);
    }

    public Executor a() {
        return this.f5815d;
    }

    public G b() {
        return this.f5813b;
    }

    /* renamed from: e */
    public s c() {
        return this.f5812a;
    }
}
