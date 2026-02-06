package L3;

import P3.u;
import androidx.work.A;
import androidx.work.C1835b;
import androidx.work.impl.w;
import androidx.work.s;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: e  reason: collision with root package name */
    static final String f4151e = s.i("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    final w f4152a;

    /* renamed from: b  reason: collision with root package name */
    private final A f4153b;

    /* renamed from: c  reason: collision with root package name */
    private final C1835b f4154c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f4155d = new HashMap();

    /* renamed from: L3.a$a  reason: collision with other inner class name */
    class C0097a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f4156a;

        C0097a(u uVar) {
            this.f4156a = uVar;
        }

        public void run() {
            s e10 = s.e();
            String str = a.f4151e;
            e10.a(str, "Scheduling work " + this.f4156a.f5091a);
            a.this.f4152a.d(this.f4156a);
        }
    }

    public a(w wVar, A a10, C1835b bVar) {
        this.f4152a = wVar;
        this.f4153b = a10;
        this.f4154c = bVar;
    }

    public void a(u uVar, long j10) {
        Runnable runnable = (Runnable) this.f4155d.remove(uVar.f5091a);
        if (runnable != null) {
            this.f4153b.a(runnable);
        }
        C0097a aVar = new C0097a(uVar);
        this.f4155d.put(uVar.f5091a, aVar);
        this.f4153b.b(j10 - this.f4154c.currentTimeMillis(), aVar);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f4155d.remove(str);
        if (runnable != null) {
            this.f4153b.a(runnable);
        }
    }
}
