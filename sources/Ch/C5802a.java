package ch;

import Ug.V;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.g;
import yf.q;

/* renamed from: ch.a  reason: case insensitive filesystem */
final class C5802a {

    /* renamed from: a  reason: collision with root package name */
    private final long f67358a;

    /* renamed from: ch.a$a  reason: collision with other inner class name */
    public static final class C0987a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5811j f67359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5802a f67360b;

        public C0987a(C5811j jVar, C5802a aVar) {
            this.f67359a = jVar;
            this.f67360b = aVar;
        }

        public final void run() {
            this.f67359a.g(this.f67360b, C6514M.f71813a);
        }
    }

    /* renamed from: ch.a$b */
    /* synthetic */ class b extends C6494p implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67361a = new b();

        b() {
            super(3, C5802a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void i(C5802a aVar, C5811j jVar, Object obj) {
            aVar.c(jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((C5802a) obj, (C5811j) obj2, obj3);
            return C6514M.f71813a;
        }
    }

    public C5802a(long j10) {
        this.f67358a = j10;
    }

    /* access modifiers changed from: private */
    public final void c(C5811j jVar, Object obj) {
        if (this.f67358a <= 0) {
            jVar.e(C6514M.f71813a);
            return;
        }
        C0987a aVar = new C0987a(jVar, this);
        C6496s.f(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C5810i iVar = (C5810i) jVar;
        g context = jVar.getContext();
        jVar.f(V.b(context).I0(this.f67358a, aVar, context));
    }

    public final C5805d b() {
        b bVar = b.f67361a;
        C6496s.f(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C5806e(this, (q) kotlin.jvm.internal.V.f(bVar, 3), (q) null, 4, (DefaultConstructorMarker) null);
    }
}
