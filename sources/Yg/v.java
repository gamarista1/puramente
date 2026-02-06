package Yg;

import Xg.C5695g;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import qf.C6658d;
import yf.q;

public abstract class v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q f66859a;

    /* synthetic */ class a extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66860a = new a();

        a() {
            super(3, C5695g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: i */
        public final Object invoke(C5695g gVar, Object obj, C6658d dVar) {
            return gVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f66860a;
        C6496s.f(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f66859a = (q) V.f(aVar, 3);
    }
}
