package lf;

import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import lf.v;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.q;

/* renamed from: lf.d  reason: case insensitive filesystem */
final class C6520d extends C6519c implements C6658d {

    /* renamed from: a  reason: collision with root package name */
    private q f71818a;

    /* renamed from: b  reason: collision with root package name */
    private Object f71819b;

    /* renamed from: c  reason: collision with root package name */
    private C6658d f71820c = this;

    /* renamed from: d  reason: collision with root package name */
    private Object f71821d = C6518b.f71817a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6520d(q qVar, Object obj) {
        super((DefaultConstructorMarker) null);
        C6496s.h(qVar, "block");
        this.f71818a = qVar;
        this.f71819b = obj;
        C6496s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public Object b(Object obj, C6658d dVar) {
        C6496s.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f71820c = dVar;
        this.f71819b = obj;
        Object f10 = C6680b.f();
        if (f10 == C6680b.f()) {
            h.c(dVar);
        }
        return f10;
    }

    public final Object c() {
        Object obj;
        while (true) {
            Object obj2 = this.f71821d;
            C6658d dVar = this.f71820c;
            if (dVar == null) {
                w.b(obj2);
                return obj2;
            } else if (v.d(C6518b.f71817a, obj2)) {
                try {
                    q qVar = this.f71818a;
                    Object obj3 = this.f71819b;
                    if (!(qVar instanceof a)) {
                        obj = C6680b.e(qVar, this, obj3, dVar);
                    } else {
                        obj = ((q) V.f(qVar, 3)).invoke(this, obj3, dVar);
                    }
                    if (obj != C6680b.f()) {
                        dVar.resumeWith(v.b(obj));
                    }
                } catch (Throwable th2) {
                    v.a aVar = v.f71841b;
                    dVar.resumeWith(v.b(w.a(th2)));
                }
            } else {
                this.f71821d = C6518b.f71817a;
                dVar.resumeWith(obj2);
            }
        }
    }

    public g getContext() {
        return qf.h.f72645a;
    }

    public void resumeWith(Object obj) {
        this.f71820c = null;
        this.f71821d = obj;
    }
}
