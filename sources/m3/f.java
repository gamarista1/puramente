package M3;

import P3.u;
import Ug.C5600w0;
import Ug.C5605z;
import Ug.G;
import Ug.K;
import Ug.L;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import androidx.work.s;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f4326a;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f4328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f4329c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f4330d;

        /* renamed from: M3.f$a$a  reason: collision with other inner class name */
        static final class C0108a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f4331a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ u f4332b;

            C0108a(d dVar, u uVar) {
                this.f4331a = dVar;
                this.f4332b = uVar;
            }

            /* renamed from: a */
            public final Object emit(b bVar, C6658d dVar) {
                this.f4331a.e(this.f4332b, bVar);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, u uVar, d dVar, C6658d dVar2) {
            super(2, dVar2);
            this.f4328b = eVar;
            this.f4329c = uVar;
            this.f4330d = dVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f4328b, this.f4329c, this.f4330d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4327a;
            if (i10 == 0) {
                w.b(obj);
                C5694f b10 = this.f4328b.b(this.f4329c);
                C0108a aVar = new C0108a(this.f4330d, this.f4329c);
                this.f4327a = 1;
                if (b10.collect(aVar, this) == f10) {
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

    static {
        String i10 = s.i("WorkConstraintsTracker");
        C6496s.g(i10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f4326a = i10;
    }

    public static final C5600w0 b(e eVar, u uVar, G g10, d dVar) {
        C6496s.h(eVar, "<this>");
        C6496s.h(uVar, "spec");
        C6496s.h(g10, "dispatcher");
        C6496s.h(dVar, "listener");
        C5605z b10 = C0.b((C5600w0) null, 1, (Object) null);
        C5600w0 unused = C5576k.d(L.a(g10.n1(b10)), (g) null, (M) null, new a(eVar, uVar, dVar, (C6658d) null), 3, (Object) null);
        return b10;
    }
}
