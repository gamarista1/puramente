package H;

import H0.C1197s;
import J0.C1244j;
import J0.C1245k;
import androidx.compose.foundation.relocation.b;
import c1.s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import q0.C2423i;
import q0.C2428n;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;

abstract /* synthetic */ class f {

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2423i f2479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1197s f2480b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2423i iVar, C1197s sVar) {
            super(0);
            this.f2479a = iVar;
            this.f2480b = sVar;
        }

        /* renamed from: a */
        public final C2423i invoke() {
            C2423i iVar = this.f2479a;
            if (iVar != null) {
                return iVar;
            }
            C1197s sVar = this.f2480b;
            if (!sVar.G()) {
                sVar = null;
            }
            if (sVar != null) {
                return C2428n.c(s.d(sVar.b()));
            }
            return null;
        }
    }

    public static final Object a(C1244j jVar, C2423i iVar, C6658d dVar) {
        if (!jVar.v0().S1()) {
            return C6514M.f71813a;
        }
        C1197s k10 = C1245k.k(jVar);
        a c10 = b.c(jVar);
        if (c10 == null) {
            return C6514M.f71813a;
        }
        Object v12 = c10.v1(k10, new a(iVar, k10), dVar);
        if (v12 == C6680b.f()) {
            return v12;
        }
        return C6514M.f71813a;
    }

    public static /* synthetic */ Object b(C1244j jVar, C2423i iVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = null;
        }
        return e.a(jVar, iVar, dVar);
    }
}
