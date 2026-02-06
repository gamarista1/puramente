package i2;

/* renamed from: i2.f  reason: case insensitive filesystem */
public class C2081f {

    /* renamed from: a  reason: collision with root package name */
    private final C2078c f22096a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f22097b;

    public C2081f() {
        this(C2078c.f22089a);
    }

    public synchronized void a() {
        while (!this.f22097b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f22097b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f22097b;
        this.f22097b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f22097b;
    }

    public synchronized boolean e() {
        if (this.f22097b) {
            return false;
        }
        this.f22097b = true;
        notifyAll();
        return true;
    }

    public C2081f(C2078c cVar) {
        this.f22096a = cVar;
    }
}
