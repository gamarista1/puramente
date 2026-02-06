package androidx.compose.foundation;

import D0.J;
import O0.g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import x.C2845I;
import yf.C6787a;
import yf.C6798l;
import yf.q;
import z.C2938B;
import z.r;

public class e extends a {

    static final class a extends l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f12546a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f12547b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ long f12548c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f12549d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C6658d dVar) {
            super(3, dVar);
            this.f12549d = eVar;
        }

        public final Object i(r rVar, long j10, C6658d dVar) {
            a aVar = new a(this.f12549d, dVar);
            aVar.f12547b = rVar;
            aVar.f12548c = j10;
            return aVar.invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((r) obj, ((C2421g) obj2).v(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f12546a;
            if (i10 == 0) {
                w.b(obj);
                r rVar = (r) this.f12547b;
                long j10 = this.f12548c;
                if (this.f12549d.D2()) {
                    e eVar = this.f12549d;
                    this.f12546a = 1;
                    if (eVar.F2(rVar, j10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12550a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.f12550a = eVar;
        }

        public final void a(long j10) {
            if (this.f12550a.D2()) {
                this.f12550a.E2().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2421g) obj).v());
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ e(B.l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, i10, z10, str, gVar, aVar);
    }

    static /* synthetic */ Object K2(e eVar, J j10, C6658d dVar) {
        Object h10 = C2938B.h(j10, new a(eVar, (C6658d) null), new b(eVar), dVar);
        if (h10 == C6680b.f()) {
            return h10;
        }
        return C6514M.f71813a;
    }

    public final void L2(B.l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar) {
        J2(lVar, i10, z10, str, gVar, aVar);
    }

    public Object y2(J j10, C6658d dVar) {
        return K2(this, j10, dVar);
    }

    private e(B.l lVar, C2845I i10, boolean z10, String str, g gVar, C6787a aVar) {
        super(lVar, i10, z10, str, gVar, aVar, (DefaultConstructorMarker) null);
    }
}
