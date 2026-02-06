package x4;

import I4.a;
import I4.c;
import java.util.Collections;

public class q extends C4155a {

    /* renamed from: i  reason: collision with root package name */
    private final Object f49428i;

    public q(c cVar) {
        this(cVar, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return 1.0f;
    }

    public Object h() {
        c cVar = this.f49361e;
        Object obj = this.f49428i;
        return cVar.b(0.0f, 0.0f, obj, obj, f(), f(), f());
    }

    /* access modifiers changed from: package-private */
    public Object i(a aVar, float f10) {
        return h();
    }

    public void l() {
        if (this.f49361e != null) {
            super.l();
        }
    }

    public void n(float f10) {
        this.f49360d = f10;
    }

    public q(c cVar, Object obj) {
        super(Collections.emptyList());
        o(cVar);
        this.f49428i = obj;
    }
}
