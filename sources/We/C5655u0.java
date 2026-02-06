package We;

import af.C5728a;
import ff.C5849c;
import ff.C5868v;
import java.util.Map;
import p003if.b;

/* renamed from: We.u0  reason: case insensitive filesystem */
public abstract class C5655u0 {

    /* renamed from: a  reason: collision with root package name */
    private C5868v f65936a;

    /* renamed from: b  reason: collision with root package name */
    private final C5849c f65937b = new C5849c();

    /* renamed from: c  reason: collision with root package name */
    private Map f65938c;

    /* renamed from: d  reason: collision with root package name */
    protected transient Throwable f65939d;

    protected C5655u0(C5868v vVar) {
        this.f65936a = vVar;
    }

    public C5849c a() {
        return this.f65937b;
    }

    public C5868v b() {
        return this.f65936a;
    }

    public Throwable c() {
        Throwable th2 = this.f65939d;
        if (th2 instanceof C5728a) {
            return ((C5728a) th2).a();
        }
        return th2;
    }

    public void d(Map map) {
        this.f65938c = b.c(map);
    }

    public void e(Throwable th2) {
        this.f65939d = th2;
    }
}
