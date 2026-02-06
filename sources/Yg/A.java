package Yg;

import Xg.C5695g;
import Zg.K;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

final class A implements C5695g {

    /* renamed from: a  reason: collision with root package name */
    private final g f66771a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f66772b;

    /* renamed from: c  reason: collision with root package name */
    private final p f66773c;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66774a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66775b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5695g f66776c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5695g gVar, C6658d dVar) {
            super(2, dVar);
            this.f66776c = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66776c, dVar);
            aVar.f66775b = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(Object obj, C6658d dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66774a;
            if (i10 == 0) {
                w.b(obj);
                Object obj2 = this.f66775b;
                C5695g gVar = this.f66776c;
                this.f66774a = 1;
                if (gVar.emit(obj2, this) == f10) {
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

    public A(C5695g gVar, g gVar2) {
        this.f66771a = gVar2;
        this.f66772b = K.b(gVar2);
        this.f66773c = new a(gVar, (C6658d) null);
    }

    public Object emit(Object obj, C6658d dVar) {
        Object b10 = f.b(this.f66771a, obj, this.f66772b, this.f66773c, dVar);
        if (b10 == C6680b.f()) {
            return b10;
        }
        return C6514M.f71813a;
    }
}
