package X4;

import O4.b;
import T4.f;
import X4.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f35001a;

    /* renamed from: b  reason: collision with root package name */
    private final File f35002b;

    /* renamed from: c  reason: collision with root package name */
    private final long f35003c;

    /* renamed from: d  reason: collision with root package name */
    private final c f35004d = new c();

    /* renamed from: e  reason: collision with root package name */
    private b f35005e;

    protected e(File file, long j10) {
        this.f35002b = file;
        this.f35003c = j10;
        this.f35001a = new j();
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized b d() {
        try {
            if (this.f35005e == null) {
                this.f35005e = b.g0(this.f35002b, 1, 1, this.f35003c);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f35005e;
    }

    private synchronized void e() {
        this.f35005e = null;
    }

    public void a(f fVar, a.b bVar) {
        b.c Q10;
        String b10 = this.f35001a.b(fVar);
        this.f35004d.a(b10);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + fVar);
            }
            try {
                b d10 = d();
                if (d10.V(b10) == null) {
                    Q10 = d10.Q(b10);
                    if (Q10 != null) {
                        if (bVar.a(Q10.f(0))) {
                            Q10.e();
                        }
                        Q10.b();
                        this.f35004d.b(b10);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b10);
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            } catch (Throwable th2) {
                Q10.b();
                throw th2;
            }
        } finally {
            this.f35004d.b(b10);
        }
    }

    public File b(f fVar) {
        String b10 = this.f35001a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + fVar);
        }
        try {
            b.e V10 = d().V(b10);
            if (V10 != null) {
                return V10.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public synchronized void clear() {
        try {
            d().I();
        } catch (IOException e10) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
        e();
    }
}
