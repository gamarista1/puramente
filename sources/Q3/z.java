package Q3;

import P3.u;
import R3.b;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.utils.futures.c;
import androidx.work.j;
import androidx.work.k;
import androidx.work.r;
import androidx.work.s;
import com.google.common.util.concurrent.g;

public class z implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    static final String f5487g = s.i("WorkForegroundRunnable");

    /* renamed from: a  reason: collision with root package name */
    final c f5488a = c.t();

    /* renamed from: b  reason: collision with root package name */
    final Context f5489b;

    /* renamed from: c  reason: collision with root package name */
    final u f5490c;

    /* renamed from: d  reason: collision with root package name */
    final r f5491d;

    /* renamed from: e  reason: collision with root package name */
    final k f5492e;

    /* renamed from: f  reason: collision with root package name */
    final b f5493f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f5494a;

        a(c cVar) {
            this.f5494a = cVar;
        }

        public void run() {
            if (!z.this.f5488a.isCancelled()) {
                try {
                    j jVar = (j) this.f5494a.get();
                    if (jVar != null) {
                        s e10 = s.e();
                        String str = z.f5487g;
                        e10.a(str, "Updating notification for " + z.this.f5490c.f5093c);
                        z zVar = z.this;
                        zVar.f5488a.r(zVar.f5492e.a(zVar.f5489b, zVar.f5491d.getId(), jVar));
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + z.this.f5490c.f5093c + ") but did not provide ForegroundInfo");
                } catch (Throwable th2) {
                    z.this.f5488a.q(th2);
                }
            }
        }
    }

    public z(Context context, u uVar, r rVar, k kVar, b bVar) {
        this.f5489b = context;
        this.f5490c = uVar;
        this.f5491d = rVar;
        this.f5492e = kVar;
        this.f5493f = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(c cVar) {
        if (!this.f5488a.isCancelled()) {
            cVar.r(this.f5491d.getForegroundInfoAsync());
        } else {
            cVar.cancel(true);
        }
    }

    public g b() {
        return this.f5488a;
    }

    public void run() {
        if (!this.f5490c.f5107q || Build.VERSION.SDK_INT >= 31) {
            this.f5488a.p((Object) null);
            return;
        }
        c t10 = c.t();
        this.f5493f.a().execute(new y(this, t10));
        t10.e(new a(t10), this.f5493f.a());
    }
}
