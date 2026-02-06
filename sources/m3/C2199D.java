package m3;

import Xg.C5694f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;

/* renamed from: m3.D  reason: case insensitive filesystem */
public final class C2199D {

    /* renamed from: a  reason: collision with root package name */
    private final C5694f f23765a;

    /* renamed from: m3.D$a */
    static final class a extends l implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        int f23766a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6787a f23767b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6787a aVar, C6658d dVar) {
            super(1, dVar);
            this.f23767b = aVar;
        }

        public final C6658d create(C6658d dVar) {
            return new a(this.f23767b, dVar);
        }

        /* renamed from: i */
        public final Object invoke(C6658d dVar) {
            return ((a) create(dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f23766a == 0) {
                w.b(obj);
                return this.f23767b.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C2199D(C2200E e10, Object obj, O o10, C6787a aVar) {
        C6496s.h(e10, "config");
        C6496s.h(aVar, "pagingSourceFactory");
        this.f23765a = new C2225y(new a(aVar, (C6658d) null), obj, e10, o10).i();
    }

    public final C5694f a() {
        return this.f23765a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2199D(C2200E e10, Object obj, C6787a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, (i10 & 2) != 0 ? null : obj, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2199D(C2200E e10, Object obj, C6787a aVar) {
        this(e10, obj, (O) null, aVar);
        C6496s.h(e10, "config");
        C6496s.h(aVar, "pagingSourceFactory");
    }
}
