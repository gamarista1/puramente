package N5;

import M5.b;
import M5.c;
import M5.d;
import java.io.IOException;

public class l implements b {

    /* renamed from: i  reason: collision with root package name */
    private static final Object f33012i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private static l f33013j;

    /* renamed from: k  reason: collision with root package name */
    private static int f33014k;

    /* renamed from: a  reason: collision with root package name */
    private d f33015a;

    /* renamed from: b  reason: collision with root package name */
    private String f33016b;

    /* renamed from: c  reason: collision with root package name */
    private long f33017c;

    /* renamed from: d  reason: collision with root package name */
    private long f33018d;

    /* renamed from: e  reason: collision with root package name */
    private long f33019e;

    /* renamed from: f  reason: collision with root package name */
    private IOException f33020f;

    /* renamed from: g  reason: collision with root package name */
    private c.a f33021g;

    /* renamed from: h  reason: collision with root package name */
    private l f33022h;

    private l() {
    }

    public static l a() {
        synchronized (f33012i) {
            try {
                l lVar = f33013j;
                if (lVar == null) {
                    return new l();
                }
                f33013j = lVar.f33022h;
                lVar.f33022h = null;
                f33014k--;
                return lVar;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private void c() {
        this.f33015a = null;
        this.f33016b = null;
        this.f33017c = 0;
        this.f33018d = 0;
        this.f33019e = 0;
        this.f33020f = null;
        this.f33021g = null;
    }

    public void b() {
        synchronized (f33012i) {
            try {
                if (f33014k < 5) {
                    c();
                    f33014k++;
                    l lVar = f33013j;
                    if (lVar != null) {
                        this.f33022h = lVar;
                    }
                    f33013j = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l d(d dVar) {
        this.f33015a = dVar;
        return this;
    }

    public l e(long j10) {
        this.f33018d = j10;
        return this;
    }

    public l f(long j10) {
        this.f33019e = j10;
        return this;
    }

    public l g(c.a aVar) {
        this.f33021g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f33020f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f33017c = j10;
        return this;
    }

    public l j(String str) {
        this.f33016b = str;
        return this;
    }
}
