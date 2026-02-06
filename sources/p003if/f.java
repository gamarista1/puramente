package p003if;

import We.C5664z;

/* renamed from: if.f  reason: invalid package */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f67891a = null;

    /* renamed from: b  reason: collision with root package name */
    private final a f67892b;

    /* renamed from: c  reason: collision with root package name */
    private final a f67893c = new a();

    /* renamed from: if.f$a */
    public interface a {
        Object a();
    }

    public f(a aVar) {
        this.f67892b = aVar;
    }

    public Object a() {
        if (this.f67891a == null) {
            C5664z a10 = this.f67893c.a();
            try {
                if (this.f67891a == null) {
                    this.f67891a = this.f67892b.a();
                }
                if (a10 != null) {
                    a10.close();
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this.f67891a;
        throw th;
    }

    public void b() {
        C5664z a10 = this.f67893c.a();
        try {
            this.f67891a = null;
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
