package Q3;

import P3.m;
import androidx.work.A;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;

public class C {

    /* renamed from: e  reason: collision with root package name */
    private static final String f5444e = s.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    final A f5445a;

    /* renamed from: b  reason: collision with root package name */
    final Map f5446b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map f5447c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f5448d = new Object();

    public interface a {
        void a(m mVar);
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C f5449a;

        /* renamed from: b  reason: collision with root package name */
        private final m f5450b;

        b(C c10, m mVar) {
            this.f5449a = c10;
            this.f5450b = mVar;
        }

        public void run() {
            synchronized (this.f5449a.f5448d) {
                try {
                    if (((b) this.f5449a.f5446b.remove(this.f5450b)) != null) {
                        a aVar = (a) this.f5449a.f5447c.remove(this.f5450b);
                        if (aVar != null) {
                            aVar.a(this.f5450b);
                        }
                    } else {
                        s.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f5450b}));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C(A a10) {
        this.f5445a = a10;
    }

    public void a(m mVar, long j10, a aVar) {
        synchronized (this.f5448d) {
            s e10 = s.e();
            String str = f5444e;
            e10.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f5446b.put(mVar, bVar);
            this.f5447c.put(mVar, aVar);
            this.f5445a.b(j10, bVar);
        }
    }

    public void b(m mVar) {
        synchronized (this.f5448d) {
            try {
                if (((b) this.f5446b.remove(mVar)) != null) {
                    s e10 = s.e();
                    String str = f5444e;
                    e10.a(str, "Stopping timer for " + mVar);
                    this.f5447c.remove(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
