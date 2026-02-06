package e7;

import com.facebook.imagepipeline.producers.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

public final class b implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f43349b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final List f43350a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Set set) {
        if (set == null) {
            this.f43350a = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f43350a = arrayList;
        C6565s.m0(set, arrayList);
    }

    public void a(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        for (d a10 : this.f43350a) {
            try {
                a10.a(e0Var);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onRequestStart", e10);
            }
        }
    }

    public void b(e0 e0Var, String str, boolean z10) {
        C6496s.h(e0Var, "producerContext");
        C6496s.h(str, "producerName");
        for (d b10 : this.f43350a) {
            try {
                b10.b(e0Var, str, z10);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onProducerFinishWithSuccess", e10);
            }
        }
    }

    public void c(e0 e0Var, String str, Map map) {
        for (d c10 : this.f43350a) {
            try {
                c10.c(e0Var, str, map);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onProducerFinishWithCancellation", e10);
            }
        }
    }

    public void d(e0 e0Var, String str) {
        C6496s.h(e0Var, "producerContext");
        C6496s.h(str, "producerName");
        for (d d10 : this.f43350a) {
            try {
                d10.d(e0Var, str);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onProducerStart", e10);
            }
        }
    }

    public void e(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        for (d e10 : this.f43350a) {
            try {
                e10.e(e0Var);
            } catch (Exception e11) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onRequestSuccess", e11);
            }
        }
    }

    public boolean f(e0 e0Var, String str) {
        C6496s.h(e0Var, "producerContext");
        C6496s.h(str, "producerName");
        Iterable<d> iterable = this.f43350a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (d f10 : iterable) {
            if (f10.f(e0Var, str)) {
                return true;
            }
        }
        return false;
    }

    public void g(e0 e0Var) {
        C6496s.h(e0Var, "producerContext");
        for (d g10 : this.f43350a) {
            try {
                g10.g(e0Var);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onRequestCancellation", e10);
            }
        }
    }

    public void h(e0 e0Var, String str, String str2) {
        C6496s.h(e0Var, "producerContext");
        C6496s.h(str, "producerName");
        C6496s.h(str2, "producerEventName");
        for (d h10 : this.f43350a) {
            try {
                h10.h(e0Var, str, str2);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onIntermediateChunkStart", e10);
            }
        }
    }

    public void i(e0 e0Var, Throwable th2) {
        C6496s.h(e0Var, "producerContext");
        C6496s.h(th2, "throwable");
        for (d i10 : this.f43350a) {
            try {
                i10.i(e0Var, th2);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onRequestFailure", e10);
            }
        }
    }

    public void j(e0 e0Var, String str, Map map) {
        for (d j10 : this.f43350a) {
            try {
                j10.j(e0Var, str, map);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onProducerFinishWithSuccess", e10);
            }
        }
    }

    public void k(e0 e0Var, String str, Throwable th2, Map map) {
        for (d k10 : this.f43350a) {
            try {
                k10.k(e0Var, str, th2, map);
            } catch (Exception e10) {
                U5.a.n("ForwardingRequestListener2", "InternalListener exception in " + "onProducerFinishWithFailure", e10);
            }
        }
    }
}
