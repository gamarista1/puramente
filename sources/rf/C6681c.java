package rf;

import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import lf.w;
import qf.C6658d;
import qf.g;
import yf.p;
import yf.q;

/* renamed from: rf.c  reason: case insensitive filesystem */
abstract class C6681c {

    /* renamed from: rf.c$a */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        private int f73004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f73005b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f73006c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C6658d dVar, p pVar, Object obj) {
            super(dVar);
            this.f73005b = pVar;
            this.f73006c = obj;
            C6496s.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f73004a;
            if (i10 == 0) {
                this.f73004a = 1;
                w.b(obj);
                C6496s.f(this.f73005b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) V.f(this.f73005b, 2)).invoke(this.f73006c, this);
            } else if (i10 == 1) {
                this.f73004a = 2;
                w.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    /* renamed from: rf.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        private int f73007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f73008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f73009c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6658d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f73008b = pVar;
            this.f73009c = obj;
            C6496s.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f73007a;
            if (i10 == 0) {
                this.f73007a = 1;
                w.b(obj);
                C6496s.f(this.f73008b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) V.f(this.f73008b, 2)).invoke(this.f73009c, this);
            } else if (i10 == 1) {
                this.f73007a = 2;
                w.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    /* renamed from: rf.c$c  reason: collision with other inner class name */
    public static final class C1058c extends j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1058c(C6658d dVar) {
            super(dVar);
            C6496s.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            w.b(obj);
            return obj;
        }
    }

    /* renamed from: rf.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6658d dVar, g gVar) {
            super(dVar, gVar);
            C6496s.f(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            w.b(obj);
            return obj;
        }
    }

    public static C6658d a(p pVar, Object obj, C6658d dVar) {
        C6496s.h(pVar, "<this>");
        C6496s.h(dVar, "completion");
        C6658d a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, a10);
        }
        g context = a10.getContext();
        if (context == qf.h.f72645a) {
            return new a(a10, pVar, obj);
        }
        return new b(a10, context, pVar, obj);
    }

    private static final C6658d b(C6658d dVar) {
        g context = dVar.getContext();
        if (context == qf.h.f72645a) {
            return new C1058c(dVar);
        }
        return new d(dVar, context);
    }

    public static C6658d c(C6658d dVar) {
        kotlin.coroutines.jvm.internal.d dVar2;
        C6658d<Object> intercepted;
        C6496s.h(dVar, "<this>");
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            dVar2 = (kotlin.coroutines.jvm.internal.d) dVar;
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || (intercepted = dVar2.intercepted()) == null) {
            return dVar;
        }
        return intercepted;
    }

    public static Object d(p pVar, Object obj, C6658d dVar) {
        C6496s.h(pVar, "<this>");
        C6496s.h(dVar, "completion");
        return ((p) V.f(pVar, 2)).invoke(obj, b(h.a(dVar)));
    }

    public static Object e(q qVar, Object obj, Object obj2, C6658d dVar) {
        C6496s.h(qVar, "<this>");
        C6496s.h(dVar, "completion");
        return ((q) V.f(qVar, 3)).invoke(obj, obj2, b(h.a(dVar)));
    }
}
