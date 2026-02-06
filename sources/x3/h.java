package X3;

import Ug.K;
import j4.C3622i;
import j4.C3623j;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class h {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f9700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3622i f9701c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C3622i iVar, C6658d dVar) {
            super(2, dVar);
            this.f9700b = gVar;
            this.f9701c = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f9700b, this.f9701c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f9699a;
            if (i10 == 0) {
                w.b(obj);
                g gVar = this.f9700b;
                C3622i iVar = this.f9701c;
                this.f9699a = 1;
                obj = gVar.a(iVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public static final C3623j a(g gVar, C3622i iVar) {
        return (C3623j) C5574j.b((g) null, new a(gVar, iVar, (C6658d) null), 1, (Object) null);
    }
}
