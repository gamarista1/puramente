package Y5;

import T5.p;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f35667h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f35668i = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a  reason: collision with root package name */
    private volatile StatFs f35669a = null;

    /* renamed from: b  reason: collision with root package name */
    private volatile File f35670b;

    /* renamed from: c  reason: collision with root package name */
    private volatile StatFs f35671c = null;

    /* renamed from: d  reason: collision with root package name */
    private volatile File f35672d;

    /* renamed from: e  reason: collision with root package name */
    private long f35673e;

    /* renamed from: f  reason: collision with root package name */
    private final Lock f35674f = new ReentrantLock();

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f35675g = false;

    /* renamed from: Y5.a$a  reason: collision with other inner class name */
    public enum C0578a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (!this.f35675g) {
            this.f35674f.lock();
            try {
                if (!this.f35675g) {
                    this.f35670b = Environment.getDataDirectory();
                    this.f35672d = Environment.getExternalStorageDirectory();
                    g();
                    this.f35675g = true;
                }
            } finally {
                this.f35674f.unlock();
            }
        }
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f35667h == null) {
                    f35667h = new a();
                }
                aVar = f35667h;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    private void e() {
        if (this.f35674f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f35673e > f35668i) {
                    g();
                }
            } finally {
                this.f35674f.unlock();
            }
        }
    }

    private void g() {
        this.f35669a = h(this.f35669a, this.f35670b);
        this.f35671c = h(this.f35671c, this.f35672d);
        this.f35673e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = a(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th2) {
                throw p.a(th2);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    public long c(C0578a aVar) {
        StatFs statFs;
        b();
        e();
        if (aVar == C0578a.INTERNAL) {
            statFs = this.f35669a;
        } else {
            statFs = this.f35671c;
        }
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0;
    }

    public boolean f(C0578a aVar, long j10) {
        b();
        long c10 = c(aVar);
        if (c10 <= 0 || c10 < j10) {
            return true;
        }
        return false;
    }
}
