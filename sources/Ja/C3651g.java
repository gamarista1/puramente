package ja;

/* renamed from: ja.g  reason: case insensitive filesystem */
public class C3651g {

    /* renamed from: a  reason: collision with root package name */
    private final C3648d f45004a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45005b;

    public C3651g() {
        this(C3648d.f44997a);
    }

    public synchronized void a() {
        while (!this.f45005b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f45005b) {
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
        z10 = this.f45005b;
        this.f45005b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f45005b;
    }

    public synchronized boolean e() {
        if (this.f45005b) {
            return false;
        }
        this.f45005b = true;
        notifyAll();
        return true;
    }

    public C3651g(C3648d dVar) {
        this.f45004a = dVar;
    }
}
