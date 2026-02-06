package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;

public abstract class a implements C6658d, e, Serializable {
    private final C6658d<Object> completion;

    public a(C6658d dVar) {
        this.completion = dVar;
    }

    public C6658d<C6514M> create(C6658d<?> dVar) {
        C6496s.h(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        C6658d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final C6658d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C6658d dVar = this;
        while (true) {
            h.b(dVar);
            a aVar = (a) dVar;
            C6658d dVar2 = aVar.completion;
            C6496s.e(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C6680b.f()) {
                    obj = v.b(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                v.a aVar2 = v.f71841b;
                obj = v.b(w.a(th2));
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        C6496s.h(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
