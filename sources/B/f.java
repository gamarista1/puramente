package B;

import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.C1510r0;
import Y.P;
import Y.o1;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class f {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f465a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f466b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1510r0 f467c;

        /* renamed from: B.f$a$a  reason: collision with other inner class name */
        static final class C0003a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List f468a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C1510r0 f469b;

            C0003a(List list, C1510r0 r0Var) {
                this.f468a = list;
                this.f469b = r0Var;
            }

            /* renamed from: a */
            public final Object emit(i iVar, C6658d dVar) {
                if (iVar instanceof d) {
                    this.f468a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f468a.remove(((e) iVar).a());
                }
                this.f469b.setValue(b.a(!this.f468a.isEmpty()));
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C1510r0 r0Var, C6658d dVar) {
            super(2, dVar);
            this.f466b = jVar;
            this.f467c = r0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f466b, this.f467c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f465a;
            if (i10 == 0) {
                w.b(obj);
                ArrayList arrayList = new ArrayList();
                C5694f c10 = this.f466b.c();
                C0003a aVar = new C0003a(arrayList, this.f467c);
                this.f465a = 1;
                if (c10.collect(aVar, this) == f10) {
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

    public static final A1 a(j jVar, C1500m mVar, int i10) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(-1805515472, i10, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        Object A10 = mVar.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.r(A10);
        }
        C1510r0 r0Var = (C1510r0) A10;
        int i11 = i10 & 14;
        if (((i11 ^ 6) <= 4 || !mVar.S(jVar)) && (i10 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        Object A11 = mVar.A();
        if (z10 || A11 == aVar.a()) {
            A11 = new a(jVar, r0Var, (C6658d) null);
            mVar.r(A11);
        }
        P.g(jVar, (p) A11, mVar, i11);
        if (C1506p.H()) {
            C1506p.P();
        }
        return r0Var;
    }
}
