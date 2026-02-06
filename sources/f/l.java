package F;

import E.K;
import Ff.m;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.p1;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.D;
import yf.C6787a;
import yf.C6798l;

public abstract class l {

    /* synthetic */ class a extends D {
        a(Object obj) {
            super(obj, A1.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((A1) this.receiver).getValue();
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f2005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1 a12) {
            super(0);
            this.f2005a = a12;
        }

        /* renamed from: a */
        public final C1173h invoke() {
            return new C1173h((C6798l) this.f2005a.getValue());
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f2006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E f2007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1 a12, E e10) {
            super(0);
            this.f2006a = a12;
            this.f2007b = e10;
        }

        /* renamed from: a */
        public final k invoke() {
            C1173h hVar = (C1173h) this.f2006a.getValue();
            return new k(this.f2007b, hVar, new K(this.f2007b.z(), hVar));
        }
    }

    public static final C6787a a(E e10, C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(690901732, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridItemProviderLambda (LazyStaggeredGridItemProvider.kt:40)");
        }
        A1 o10 = p1.o(lVar, mVar, (i10 >> 3) & 14);
        boolean S10 = mVar.S(e10);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new a(p1.d(p1.n(), new c(p1.d(p1.n(), new b(o10)), e10)));
            mVar.r(A10);
        }
        m mVar2 = (m) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return mVar2;
    }
}
