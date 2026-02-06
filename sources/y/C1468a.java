package Y;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Y.a  reason: case insensitive filesystem */
public abstract class C1468a implements C1483f {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9923a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9924b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private Object f9925c;

    public C1468a(Object obj) {
        this.f9923a = obj;
        this.f9925c = obj;
    }

    public Object b() {
        return this.f9925c;
    }

    public final void clear() {
        this.f9924b.clear();
        l(this.f9923a);
        k();
    }

    public void g(Object obj) {
        this.f9924b.add(b());
        l(obj);
    }

    public void i() {
        if (this.f9924b.isEmpty()) {
            C0.b("empty stack");
        }
        List list = this.f9924b;
        l(list.remove(list.size() - 1));
    }

    public final Object j() {
        return this.f9923a;
    }

    /* access modifiers changed from: protected */
    public abstract void k();

    /* access modifiers changed from: protected */
    public void l(Object obj) {
        this.f9925c = obj;
    }
}
