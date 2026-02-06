package Y6;

import T5.k;
import com.facebook.imagepipeline.producers.C3297c;
import com.facebook.imagepipeline.producers.C3308n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import d6.C3475a;
import e7.d;
import j7.b;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class a extends C3475a {

    /* renamed from: h  reason: collision with root package name */
    private final l0 f35679h;

    /* renamed from: i  reason: collision with root package name */
    private final d f35680i;

    /* renamed from: Y6.a$a  reason: collision with other inner class name */
    public static final class C0579a extends C3297c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f35681b;

        C0579a(a aVar) {
            this.f35681b = aVar;
        }

        /* access modifiers changed from: protected */
        public void g() {
            this.f35681b.D();
        }

        /* access modifiers changed from: protected */
        public void h(Throwable th2) {
            C6496s.h(th2, "throwable");
            this.f35681b.E(th2);
        }

        /* access modifiers changed from: protected */
        public void i(Object obj, int i10) {
            a aVar = this.f35681b;
            aVar.F(obj, i10, aVar.C());
        }

        /* access modifiers changed from: protected */
        public void j(float f10) {
            boolean unused = this.f35681b.s(f10);
        }
    }

    protected a(d0 d0Var, l0 l0Var, d dVar) {
        C6496s.h(d0Var, "producer");
        C6496s.h(l0Var, "settableProducerContext");
        C6496s.h(dVar, "requestListener");
        this.f35679h = l0Var;
        this.f35680i = dVar;
        if (!b.d()) {
            o(l0Var.getExtras());
            if (!b.d()) {
                dVar.a(l0Var);
            } else {
                b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    dVar.a(l0Var);
                    C6514M m10 = C6514M.f71813a;
                } finally {
                    b.b();
                }
            }
            if (!b.d()) {
                d0Var.b(A(), l0Var);
                return;
            }
            b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                d0Var.b(A(), l0Var);
                C6514M m11 = C6514M.f71813a;
            } finally {
                b.b();
            }
        } else {
            b.a("AbstractProducerToDataSourceAdapter()");
            try {
                o(l0Var.getExtras());
                if (!b.d()) {
                    dVar.a(l0Var);
                } else {
                    b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                    dVar.a(l0Var);
                    C6514M m12 = C6514M.f71813a;
                }
                if (!b.d()) {
                    d0Var.b(A(), l0Var);
                } else {
                    b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                    d0Var.b(A(), l0Var);
                    C6514M m13 = C6514M.f71813a;
                }
                C6514M m14 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            } finally {
                b.b();
            }
        }
    }

    private final C3308n A() {
        return new C0579a(this);
    }

    /* access modifiers changed from: private */
    public final synchronized void D() {
        k.i(k());
    }

    /* access modifiers changed from: private */
    public final void E(Throwable th2) {
        if (super.q(th2, B(this.f35679h))) {
            this.f35680i.i(this.f35679h, th2);
        }
    }

    /* access modifiers changed from: protected */
    public final Map B(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        return e0Var.getExtras();
    }

    public final l0 C() {
        return this.f35679h;
    }

    /* access modifiers changed from: protected */
    public void F(Object obj, int i10, e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        boolean e10 = C3297c.e(i10);
        if (super.u(obj, e10, B(e0Var)) && e10) {
            this.f35680i.e(this.f35679h);
        }
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.c()) {
            return true;
        }
        this.f35680i.g(this.f35679h);
        this.f35679h.j();
        return true;
    }
}
