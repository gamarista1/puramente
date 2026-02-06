package D;

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

public abstract class n {

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
        final /* synthetic */ A1 f1253a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1 a12) {
            super(0);
            this.f1253a = a12;
        }

        /* renamed from: a */
        public final j invoke() {
            return new j((C6798l) this.f1253a.getValue());
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f1254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A f1255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.a f1256c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1 a12, A a10, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f1254a = a12;
            this.f1255b = a10;
            this.f1256c = aVar;
        }

        /* renamed from: a */
        public final m invoke() {
            j jVar = (j) this.f1254a.getValue();
            return new m(this.f1255b, jVar, this.f1256c, new K(this.f1255b.z(), jVar));
        }
    }

    public static final C6787a a(A a10, C6798l lVar, C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:43)");
        }
        A1 o10 = p1.o(lVar, mVar, (i10 >> 3) & 14);
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(a10)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object A10 = mVar.A();
        if (z10 || A10 == C1500m.f10026a.a()) {
            androidx.compose.foundation.lazy.a aVar = new androidx.compose.foundation.lazy.a();
            A10 = new a(p1.d(p1.n(), new c(p1.d(p1.n(), new b(o10)), a10, aVar)));
            mVar.r(A10);
        }
        m mVar2 = (m) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return mVar2;
    }
}
