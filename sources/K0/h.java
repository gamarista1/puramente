package k0;

import Y.C1500m;
import androidx.compose.ui.platform.C1676z0;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.V;
import yf.C6798l;
import yf.p;
import yf.q;

public abstract class h {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23072a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(i.b bVar) {
            return Boolean.valueOf(!(bVar instanceof g));
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1500m f23073a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1500m mVar) {
            super(2);
            this.f23073a = mVar;
        }

        /* renamed from: a */
        public final i invoke(i iVar, i.b bVar) {
            boolean z10 = bVar instanceof g;
            i iVar2 = bVar;
            if (z10) {
                q a10 = ((g) bVar).a();
                C6496s.f(a10, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                iVar2 = h.d(this.f23073a, (i) ((q) V.f(a10, 3)).invoke(i.f23074a, this.f23073a, 0));
            }
            return iVar.h(iVar2);
        }
    }

    public static final i b(i iVar, C6798l lVar, q qVar) {
        return iVar.h(new g(lVar, qVar));
    }

    public static /* synthetic */ i c(i iVar, C6798l lVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C1676z0.a();
        }
        return b(iVar, lVar, qVar);
    }

    /* access modifiers changed from: private */
    public static final i d(C1500m mVar, i iVar) {
        if (iVar.c(a.f23072a)) {
            return iVar;
        }
        mVar.z(1219399079);
        i iVar2 = (i) iVar.f(i.f23074a, new b(mVar));
        mVar.R();
        return iVar2;
    }

    public static final i e(C1500m mVar, i iVar) {
        mVar.T(439770924);
        i d10 = d(mVar, iVar);
        mVar.M();
        return d10;
    }
}
