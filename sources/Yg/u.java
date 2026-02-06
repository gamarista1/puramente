package Yg;

import Ug.A0;
import Xg.C5695g;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.p;
import yf.q;

public final class u extends d implements C5695g, e {

    /* renamed from: a  reason: collision with root package name */
    public final C5695g f66853a;

    /* renamed from: b  reason: collision with root package name */
    public final g f66854b;

    /* renamed from: c  reason: collision with root package name */
    public final int f66855c;

    /* renamed from: d  reason: collision with root package name */
    private g f66856d;

    /* renamed from: e  reason: collision with root package name */
    private C6658d f66857e;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66858a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public u(C5695g gVar, g gVar2) {
        super(r.f66847a, h.f72645a);
        this.f66853a = gVar;
        this.f66854b = gVar2;
        this.f66855c = ((Number) gVar2.f0(0, a.f66858a)).intValue();
    }

    private final void i(g gVar, g gVar2, Object obj) {
        if (gVar2 instanceof m) {
            l((m) gVar2, obj);
        }
        w.a(this, gVar);
    }

    private final Object j(C6658d dVar, Object obj) {
        g context = dVar.getContext();
        A0.m(context);
        g gVar = this.f66856d;
        if (gVar != context) {
            i(context, gVar, obj);
            this.f66856d = context;
        }
        this.f66857e = dVar;
        q a10 = v.f66859a;
        C5695g gVar2 = this.f66853a;
        C6496s.f(gVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C6496s.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(gVar2, obj, this);
        if (!C6496s.c(invoke, C6680b.f())) {
            this.f66857e = null;
        }
        return invoke;
    }

    private final void l(m mVar, Object obj) {
        throw new IllegalStateException(Sg.p.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f66840a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(Object obj, C6658d dVar) {
        try {
            Object j10 = j(dVar, obj);
            if (j10 == C6680b.f()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (j10 == C6680b.f()) {
                return j10;
            }
            return C6514M.f71813a;
        } catch (Throwable th2) {
            this.f66856d = new m(th2, dVar.getContext());
            throw th2;
        }
    }

    public e getCallerFrame() {
        C6658d dVar = this.f66857e;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        g gVar = this.f66856d;
        if (gVar == null) {
            return h.f72645a;
        }
        return gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable e10 = v.e(obj);
        if (e10 != null) {
            this.f66856d = new m(e10, getContext());
        }
        C6658d dVar = this.f66857e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C6680b.f();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
