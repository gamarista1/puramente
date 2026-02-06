package Y;

import Ug.K;
import Y.C1500m;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

abstract /* synthetic */ class r1 {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10111a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f10112b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f10113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f10114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C1510r0 r0Var, C6658d dVar) {
            super(2, dVar);
            this.f10113c = pVar;
            this.f10114d = r0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f10113c, this.f10114d, dVar);
            aVar.f10112b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f10111a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f10113c;
                H0 h02 = new H0(this.f10114d, ((K) this.f10112b).getCoroutineContext());
                this.f10111a = 1;
                if (pVar.invoke(h02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10115a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f10116b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f10117c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f10118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar, C1510r0 r0Var, C6658d dVar) {
            super(2, dVar);
            this.f10117c = pVar;
            this.f10118d = r0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f10117c, this.f10118d, dVar);
            bVar.f10116b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f10115a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f10117c;
                H0 h02 = new H0(this.f10118d, ((K) this.f10116b).getCoroutineContext());
                this.f10115a = 1;
                if (pVar.invoke(h02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f10119a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f10120b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f10121c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1510r0 f10122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, C1510r0 r0Var, C6658d dVar) {
            super(2, dVar);
            this.f10121c = pVar;
            this.f10122d = r0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f10121c, this.f10122d, dVar);
            cVar.f10120b = obj;
            return cVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f10119a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f10121c;
                H0 h02 = new H0(this.f10122d, ((K) this.f10120b).getCoroutineContext());
                this.f10119a = 1;
                if (pVar.invoke(h02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public static final A1 a(Object obj, Object obj2, Object obj3, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d(obj, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        boolean C10 = mVar.C(pVar);
        Object A11 = mVar.A();
        if (C10 || A11 == aVar.a()) {
            A11 = new c(pVar, r0Var, (C6658d) null);
            mVar.r(A11);
        }
        P.f(obj2, obj3, (p) A11, mVar, (i10 >> 3) & 126);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }

    public static final A1 b(Object obj, Object obj2, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-1928268701, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:112)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d(obj, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        boolean C10 = mVar.C(pVar);
        Object A11 = mVar.A();
        if (C10 || A11 == aVar.a()) {
            A11 = new b(pVar, r0Var, (C6658d) null);
            mVar.r(A11);
        }
        P.g(obj2, (p) A11, mVar, (i10 >> 3) & 14);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }

    public static final A1 c(Object obj, p pVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d(obj, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        C6514M m10 = C6514M.f71813a;
        boolean C10 = mVar.C(pVar);
        Object A11 = mVar.A();
        if (C10 || A11 == aVar.a()) {
            A11 = new a(pVar, r0Var, (C6658d) null);
            mVar.r(A11);
        }
        P.g(m10, (p) A11, mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }
}
