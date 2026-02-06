package f9;

import Y8.o;
import g9.C3546d;
import h9.C3585b;
import java.util.concurrent.Executor;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f43539a;

    /* renamed from: b  reason: collision with root package name */
    private final C3546d f43540b;

    /* renamed from: c  reason: collision with root package name */
    private final x f43541c;

    /* renamed from: d  reason: collision with root package name */
    private final C3585b f43542d;

    v(Executor executor, C3546d dVar, x xVar, C3585b bVar) {
        this.f43539a = executor;
        this.f43540b = dVar;
        this.f43541c = xVar;
        this.f43542d = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (o b10 : this.f43540b.J()) {
            this.f43541c.b(b10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f43542d.n(new u(this));
    }

    public void c() {
        this.f43539a.execute(new t(this));
    }
}
