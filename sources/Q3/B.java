package Q3;

import P3.q;
import P3.u;
import R3.b;
import android.content.Context;
import androidx.work.C1840g;
import androidx.work.D;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.c;
import androidx.work.s;
import androidx.work.y;
import com.google.common.util.concurrent.g;
import java.util.UUID;

public class B implements y {

    /* renamed from: c  reason: collision with root package name */
    static final String f5437c = s.i("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f5438a;

    /* renamed from: b  reason: collision with root package name */
    final b f5439b;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UUID f5440a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1840g f5441b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f5442c;

        a(UUID uuid, C1840g gVar, c cVar) {
            this.f5440a = uuid;
            this.f5441b = gVar;
            this.f5442c = cVar;
        }

        public void run() {
            String uuid = this.f5440a.toString();
            s e10 = s.e();
            String str = B.f5437c;
            e10.a(str, "Updating progress for " + this.f5440a + " (" + this.f5441b + ")");
            B.this.f5438a.e();
            try {
                u h10 = B.this.f5438a.H().h(uuid);
                if (h10 != null) {
                    if (h10.f5092b == D.RUNNING) {
                        B.this.f5438a.G().b(new q(uuid, this.f5441b));
                    } else {
                        s e11 = s.e();
                        e11.k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                    }
                    this.f5442c.p((Object) null);
                    B.this.f5438a.A();
                    B.this.f5438a.i();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th2) {
                B.this.f5438a.i();
                throw th2;
            }
        }
    }

    public B(WorkDatabase workDatabase, b bVar) {
        this.f5438a = workDatabase;
        this.f5439b = bVar;
    }

    public g a(Context context, UUID uuid, C1840g gVar) {
        c t10 = c.t();
        this.f5439b.d(new a(uuid, gVar, t10));
        return t10;
    }
}
