package Q3;

import P3.u;
import P3.v;
import P3.x;
import R3.b;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.j;
import androidx.work.k;
import androidx.work.s;
import com.google.common.util.concurrent.g;
import java.util.UUID;

public class A implements k {

    /* renamed from: d  reason: collision with root package name */
    private static final String f5428d = s.i("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final b f5429a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.work.impl.foreground.a f5430b;

    /* renamed from: c  reason: collision with root package name */
    final v f5431c;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f5433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f5434c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f5435d;

        a(c cVar, UUID uuid, j jVar, Context context) {
            this.f5432a = cVar;
            this.f5433b = uuid;
            this.f5434c = jVar;
            this.f5435d = context;
        }

        public void run() {
            try {
                if (!this.f5432a.isCancelled()) {
                    String uuid = this.f5433b.toString();
                    u h10 = A.this.f5431c.h(uuid);
                    if (h10 == null || h10.f5092b.b()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    A.this.f5430b.a(uuid, this.f5434c);
                    this.f5435d.startService(androidx.work.impl.foreground.b.d(this.f5435d, x.a(h10), this.f5434c));
                }
                this.f5432a.p((Object) null);
            } catch (Throwable th2) {
                this.f5432a.q(th2);
            }
        }
    }

    public A(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, b bVar) {
        this.f5430b = aVar;
        this.f5429a = bVar;
        this.f5431c = workDatabase.H();
    }

    public g a(Context context, UUID uuid, j jVar) {
        c t10 = c.t();
        this.f5429a.d(new a(t10, uuid, jVar, context));
        return t10;
    }
}
