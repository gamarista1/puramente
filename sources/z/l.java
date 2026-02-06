package z;

import Ug.K;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.p1;
import androidx.compose.foundation.gestures.DraggableElement;
import c1.y;
import c1.z;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import q0.C2421g;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.q;

public abstract class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q f29016a = new a((C6658d) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final q f29017b = new b((C6658d) null);

    static final class a extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f29018a;

        a(C6658d dVar) {
            super(3, dVar);
        }

        public final Object i(K k10, long j10, C6658d dVar) {
            return new a(dVar).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((K) obj, ((C2421g) obj2).v(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f29018a == 0) {
                w.b(obj);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a  reason: collision with root package name */
        int f29019a;

        b(C6658d dVar) {
            super(3, dVar);
        }

        public final Object i(K k10, float f10, C6658d dVar) {
            return new b(dVar).invokeSuspend(C6514M.f71813a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((K) obj, ((Number) obj2).floatValue(), (C6658d) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f29019a == 0) {
                w.b(obj);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A1 f29020a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1 a12) {
            super(1);
            this.f29020a = a12;
        }

        public final void a(float f10) {
            ((C6798l) this.f29020a.getValue()).invoke(Float.valueOf(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C6514M.f71813a;
        }
    }

    public static final m a(C6798l lVar) {
        return new C2949g(lVar);
    }

    public static final i g(i iVar, m mVar, q qVar, boolean z10, B.l lVar, boolean z11, q qVar2, q qVar3, boolean z12) {
        i iVar2 = iVar;
        return iVar.h(new DraggableElement(mVar, qVar, z10, lVar, z11, qVar2, qVar3, z12));
    }

    public static /* synthetic */ i h(i iVar, m mVar, q qVar, boolean z10, B.l lVar, boolean z11, q qVar2, q qVar3, boolean z12, int i10, Object obj) {
        boolean z13;
        B.l lVar2;
        boolean z14;
        q qVar4;
        q qVar5;
        boolean z15;
        int i11 = i10;
        if ((i11 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i11 & 8) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if ((i11 & 16) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i11 & 32) != 0) {
            qVar4 = f29016a;
        } else {
            qVar4 = qVar2;
        }
        if ((i11 & 64) != 0) {
            qVar5 = f29017b;
        } else {
            qVar5 = qVar3;
        }
        if ((i11 & 128) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        return g(iVar, mVar, qVar, z13, lVar2, z14, qVar4, qVar5, z15);
    }

    public static final m i(C6798l lVar, C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        A1 o10 = p1.o(lVar, mVar, i10 & 14);
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = a(new c(o10));
            mVar.r(A10);
        }
        m mVar2 = (m) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return mVar2;
    }

    /* access modifiers changed from: private */
    public static final float j(long j10, q qVar) {
        if (qVar == q.Vertical) {
            return C2421g.n(j10);
        }
        return C2421g.m(j10);
    }

    /* access modifiers changed from: private */
    public static final float k(long j10, q qVar) {
        if (qVar == q.Vertical) {
            return y.i(j10);
        }
        return y.h(j10);
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        float f10;
        float f11 = 0.0f;
        if (Float.isNaN(y.h(j10))) {
            f10 = 0.0f;
        } else {
            f10 = y.h(j10);
        }
        if (!Float.isNaN(y.i(j10))) {
            f11 = y.i(j10);
        }
        return z.a(f10, f11);
    }
}
