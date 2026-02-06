package lc;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* renamed from: lc.e  reason: case insensitive filesystem */
class C5095e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f61023d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f61024e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final i f61025a = i.c();

    /* renamed from: b  reason: collision with root package name */
    private long f61026b;

    /* renamed from: c  reason: collision with root package name */
    private int f61027c;

    C5095e() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f61023d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f61027c) + ((double) this.f61025a.e()), (double) f61024e);
    }

    private static boolean c(int i10) {
        if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
            return true;
        }
        return false;
    }

    private static boolean d(int i10) {
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            return true;
        }
        return false;
    }

    private synchronized void e() {
        this.f61027c = 0;
    }

    public synchronized boolean b() {
        boolean z10;
        if (this.f61027c == 0 || this.f61025a.a() > this.f61026b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f61027c++;
        this.f61026b = this.f61025a.a() + a(i10);
    }
}
