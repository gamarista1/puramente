package M;

import J.C1228y;
import J.a0;
import L.d;
import P.G;
import Q0.C1321d;
import Q0.E;
import Q0.I;
import Q0.K;
import Q0.Q;
import Q0.S;
import Sg.k;
import Sg.m;
import W0.C1433a;
import W0.C1439g;
import W0.P;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.v1;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.L;
import r0.Z1;
import yf.C6798l;

public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final i0 f4212a = new i0();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f4213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ L f4214b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(L l10, L l11) {
            super(1);
            this.f4213a = l10;
            this.f4214b = l11;
        }

        /* renamed from: a */
        public final CharSequence invoke(k kVar) {
            L l10 = this.f4213a;
            if (l10.f71757a == -1) {
                l10.f71757a = kVar.c().k();
            }
            this.f4214b.f71757a = kVar.c().n() + 1;
            return "";
        }
    }

    private i0() {
    }

    private final void A(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, Z1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), I.f5255a.h()), d.f4107a.a());
    }

    private final void B(C1228y yVar, DeleteRangeGesture deleteRangeGesture, G g10) {
        if (g10 != null) {
            g10.X(j0.x(yVar, Z1.f(deleteRangeGesture.getDeletionStartArea()), Z1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), I.f5255a.h()));
        }
    }

    private final void C(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, Z1.f(deleteRangeGesture.getDeletionStartArea()), Z1.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), I.f5255a.h()), d.f4107a.a());
    }

    /* access modifiers changed from: private */
    public static final void F(x0 x0Var) {
        x0.b(x0Var);
        x0.a(x0Var);
        N.a aVar = N.a.MergeIfPossible;
        throw null;
    }

    /* access modifiers changed from: private */
    public static final void G(G g10) {
        if (g10 != null) {
            g10.n();
        }
    }

    private final void H(C1228y yVar, SelectGesture selectGesture, G g10) {
        if (g10 != null) {
            g10.g0(j0.v(yVar, Z1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), I.f5255a.h()));
        }
    }

    private final void I(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, Z1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), I.f5255a.h()), d.f4107a.b());
    }

    private final void J(C1228y yVar, SelectRangeGesture selectRangeGesture, G g10) {
        if (g10 != null) {
            g10.g0(j0.x(yVar, Z1.f(selectRangeGesture.getSelectionStartArea()), Z1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), I.f5255a.h()));
        }
    }

    private final void K(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, Z1.f(selectRangeGesture.getSelectionStartArea()), Z1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), I.f5255a.h()), d.f4107a.b());
    }

    private final int L(int i10) {
        if (i10 == 1) {
            return E.f5252a.b();
        }
        if (i10 != 2) {
            return E.f5252a.a();
        }
        return E.f5252a.a();
    }

    private final int c(x0 x0Var, HandwritingGesture handwritingGesture) {
        x0.b(x0Var);
        x0.a(x0Var);
        N.a aVar = N.a.MergeIfPossible;
        throw null;
    }

    private final int d(HandwritingGesture handwritingGesture, C6798l lVar) {
        String a10 = handwritingGesture.getFallbackText();
        if (a10 == null) {
            return 3;
        }
        lVar.invoke(new C1433a(a10, 1));
        return 5;
    }

    private final void e(x0 x0Var, long j10, int i10) {
        if (Q.h(j10)) {
            x0.b(x0Var);
            x0.a(x0Var);
            N.a aVar = N.a.MergeIfPossible;
            throw null;
        }
        throw null;
    }

    private final int f(C1228y yVar, DeleteGesture deleteGesture, C1321d dVar, C6798l lVar) {
        int L10 = L(deleteGesture.getGranularity());
        long f10 = j0.v(yVar, Z1.f(deleteGesture.getDeletionArea()), L10, I.f5255a.h());
        if (Q.h(f10)) {
            return f4212a.d(d0.a(deleteGesture), lVar);
        }
        k(f10, dVar, E.d(L10, E.f5252a.b()), lVar);
        return 1;
    }

    private final int g(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        int L10 = L(deleteGesture.getGranularity());
        long g10 = j0.w(w0Var, Z1.f(deleteGesture.getDeletionArea()), L10, I.f5255a.h());
        if (Q.h(g10)) {
            return f4212a.c(x0Var, d0.a(deleteGesture));
        }
        j(x0Var, g10, E.d(L10, E.f5252a.b()));
        return 1;
    }

    private final int h(C1228y yVar, DeleteRangeGesture deleteRangeGesture, C1321d dVar, C6798l lVar) {
        int L10 = L(deleteRangeGesture.getGranularity());
        long h10 = j0.x(yVar, Z1.f(deleteRangeGesture.getDeletionStartArea()), Z1.f(deleteRangeGesture.getDeletionEndArea()), L10, I.f5255a.h());
        if (Q.h(h10)) {
            return f4212a.d(d0.a(deleteRangeGesture), lVar);
        }
        k(h10, dVar, E.d(L10, E.f5252a.b()), lVar);
        return 1;
    }

    private final int i(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        int L10 = L(deleteRangeGesture.getGranularity());
        long i10 = j0.y(w0Var, Z1.f(deleteRangeGesture.getDeletionStartArea()), Z1.f(deleteRangeGesture.getDeletionEndArea()), L10, I.f5255a.h());
        if (Q.h(i10)) {
            return f4212a.c(x0Var, d0.a(deleteRangeGesture));
        }
        j(x0Var, i10, E.d(L10, E.f5252a.b()));
        return 1;
    }

    private final void j(x0 x0Var, long j10, boolean z10) {
        if (!z10) {
            x0.c(x0Var, "", j10, (N.a) null, false, 12, (Object) null);
            return;
        }
        throw null;
    }

    private final void k(long j10, C1321d dVar, boolean z10, C6798l lVar) {
        if (z10) {
            j10 = j0.m(j10, dVar);
        }
        lVar.invoke(j0.n(new P(Q.i(j10), Q.i(j10)), new C1439g(Q.j(j10), 0)));
    }

    private final int n(C1228y yVar, InsertGesture insertGesture, v1 v1Var, C6798l lVar) {
        a0 j10;
        Q0.L f10;
        if (v1Var == null) {
            return d(d0.a(insertGesture), lVar);
        }
        int c10 = j0.q(yVar, j0.F(insertGesture.getInsertionPoint()), v1Var);
        if (c10 == -1 || ((j10 = yVar.j()) != null && (f10 = j10.f()) != null && j0.z(f10, c10))) {
            return d(d0.a(insertGesture), lVar);
        }
        p(c10, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final int o(x0 x0Var, InsertGesture insertGesture, w0 w0Var, v1 v1Var) {
        int d10 = j0.r(w0Var, j0.F(insertGesture.getInsertionPoint()), v1Var);
        if (d10 == -1) {
            return c(x0Var, d0.a(insertGesture));
        }
        x0.c(x0Var, insertGesture.getTextToInsert(), S.a(d10), (N.a) null, false, 12, (Object) null);
        return 1;
    }

    private final void p(int i10, String str, C6798l lVar) {
        lVar.invoke(j0.n(new P(i10, i10), new C1433a(str, 1)));
    }

    private final int q(C1228y yVar, JoinOrSplitGesture joinOrSplitGesture, C1321d dVar, v1 v1Var, C6798l lVar) {
        a0 j10;
        Q0.L f10;
        if (v1Var == null) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        int c10 = j0.q(yVar, j0.F(joinOrSplitGesture.getJoinOrSplitPoint()), v1Var);
        if (c10 == -1 || ((j10 = yVar.j()) != null && (f10 = j10.f()) != null && j0.z(f10, c10))) {
            return d(d0.a(joinOrSplitGesture), lVar);
        }
        long k10 = j0.E(dVar, c10);
        if (Q.h(k10)) {
            p(Q.n(k10), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, lVar);
        } else {
            k(k10, dVar, false, lVar);
        }
        return 1;
    }

    private final int r(x0 x0Var, JoinOrSplitGesture joinOrSplitGesture, w0 w0Var, v1 v1Var) {
        throw null;
    }

    private final int s(C1228y yVar, RemoveSpaceGesture removeSpaceGesture, C1321d dVar, v1 v1Var, C6798l lVar) {
        Q0.L l10;
        a0 j10 = yVar.j();
        if (j10 != null) {
            l10 = j10.f();
        } else {
            l10 = null;
        }
        long e10 = j0.t(l10, j0.F(removeSpaceGesture.getStartPoint()), j0.F(removeSpaceGesture.getEndPoint()), yVar.i(), v1Var);
        if (Q.h(e10)) {
            return f4212a.d(d0.a(removeSpaceGesture), lVar);
        }
        L l11 = new L();
        l11.f71757a = -1;
        L l12 = new L();
        l12.f71757a = -1;
        String f10 = new m("\\s+").f(S.e(dVar, e10), new a(l11, l12));
        if (l11.f71757a == -1 || l12.f71757a == -1) {
            return d(d0.a(removeSpaceGesture), lVar);
        }
        int n10 = Q.n(e10) + l11.f71757a;
        int n11 = Q.n(e10) + l12.f71757a;
        String substring = f10.substring(l11.f71757a, f10.length() - (Q.j(e10) - l12.f71757a));
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.invoke(j0.n(new P(n10, n11), new C1433a(substring, 1)));
        return 1;
    }

    private final int t(x0 x0Var, RemoveSpaceGesture removeSpaceGesture, w0 w0Var, v1 v1Var) {
        throw null;
    }

    private final int u(C1228y yVar, SelectGesture selectGesture, G g10, C6798l lVar) {
        long f10 = j0.v(yVar, Z1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), I.f5255a.h());
        if (Q.h(f10)) {
            return f4212a.d(d0.a(selectGesture), lVar);
        }
        y(f10, g10, lVar);
        return 1;
    }

    private final int v(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        if (Q.h(j0.w(w0Var, Z1.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), I.f5255a.h()))) {
            return f4212a.c(x0Var, d0.a(selectGesture));
        }
        throw null;
    }

    private final int w(C1228y yVar, SelectRangeGesture selectRangeGesture, G g10, C6798l lVar) {
        long h10 = j0.x(yVar, Z1.f(selectRangeGesture.getSelectionStartArea()), Z1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), I.f5255a.h());
        if (Q.h(h10)) {
            return f4212a.d(d0.a(selectRangeGesture), lVar);
        }
        y(h10, g10, lVar);
        return 1;
    }

    private final int x(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        if (Q.h(j0.y(w0Var, Z1.f(selectRangeGesture.getSelectionStartArea()), Z1.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), I.f5255a.h()))) {
            return f4212a.c(x0Var, d0.a(selectRangeGesture));
        }
        throw null;
    }

    private final void y(long j10, G g10, C6798l lVar) {
        lVar.invoke(new P(Q.n(j10), Q.i(j10)));
        if (g10 != null) {
            g10.v(true);
        }
    }

    private final void z(C1228y yVar, DeleteGesture deleteGesture, G g10) {
        if (g10 != null) {
            g10.X(j0.v(yVar, Z1.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), I.f5255a.h()));
        }
    }

    public final boolean D(C1228y yVar, PreviewableHandwritingGesture previewableHandwritingGesture, G g10, CancellationSignal cancellationSignal) {
        C1321d dVar;
        Q0.L f10;
        K l10;
        C1321d w10 = yVar.w();
        if (w10 == null) {
            return false;
        }
        a0 j10 = yVar.j();
        if (j10 == null || (f10 = j10.f()) == null || (l10 = f10.l()) == null) {
            dVar = null;
        } else {
            dVar = l10.j();
        }
        if (!C6496s.c(w10, dVar)) {
            return false;
        }
        if (e0.a(previewableHandwritingGesture)) {
            H(yVar, f0.a(previewableHandwritingGesture), g10);
        } else if (B.a(previewableHandwritingGesture)) {
            z(yVar, C.a(previewableHandwritingGesture), g10);
        } else if (D.a(previewableHandwritingGesture)) {
            J(yVar, E.a(previewableHandwritingGesture), g10);
        } else if (!F.a(previewableHandwritingGesture)) {
            return false;
        } else {
            B(yVar, G.a(previewableHandwritingGesture), g10);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new g0(g10));
        return true;
    }

    public final boolean E(x0 x0Var, PreviewableHandwritingGesture previewableHandwritingGesture, w0 w0Var, CancellationSignal cancellationSignal) {
        if (e0.a(previewableHandwritingGesture)) {
            I(x0Var, f0.a(previewableHandwritingGesture), w0Var);
        } else if (B.a(previewableHandwritingGesture)) {
            A(x0Var, C.a(previewableHandwritingGesture), w0Var);
        } else if (D.a(previewableHandwritingGesture)) {
            K(x0Var, E.a(previewableHandwritingGesture), w0Var);
        } else if (!F.a(previewableHandwritingGesture)) {
            return false;
        } else {
            C(x0Var, G.a(previewableHandwritingGesture), w0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new h0(x0Var));
        return true;
    }

    public final int l(C1228y yVar, HandwritingGesture handwritingGesture, G g10, v1 v1Var, C6798l lVar) {
        C1321d dVar;
        Q0.L f10;
        K l10;
        C1321d w10 = yVar.w();
        if (w10 == null) {
            return 3;
        }
        a0 j10 = yVar.j();
        if (j10 == null || (f10 = j10.f()) == null || (l10 = f10.l()) == null) {
            dVar = null;
        } else {
            dVar = l10.j();
        }
        if (!C6496s.c(w10, dVar)) {
            return 3;
        }
        if (e0.a(handwritingGesture)) {
            return u(yVar, f0.a(handwritingGesture), g10, lVar);
        }
        if (B.a(handwritingGesture)) {
            return f(yVar, C.a(handwritingGesture), w10, lVar);
        }
        if (D.a(handwritingGesture)) {
            return w(yVar, E.a(handwritingGesture), g10, lVar);
        }
        if (F.a(handwritingGesture)) {
            return h(yVar, G.a(handwritingGesture), w10, lVar);
        }
        if (O.a(handwritingGesture)) {
            return q(yVar, P.a(handwritingGesture), w10, v1Var, lVar);
        } else if (J.a(handwritingGesture)) {
            return n(yVar, K.a(handwritingGesture), v1Var, lVar);
        } else {
            if (!M.a(handwritingGesture)) {
                return 2;
            }
            return s(yVar, N.a(handwritingGesture), w10, v1Var, lVar);
        }
    }

    public final int m(x0 x0Var, HandwritingGesture handwritingGesture, w0 w0Var, v1 v1Var) {
        if (e0.a(handwritingGesture)) {
            return v(x0Var, f0.a(handwritingGesture), w0Var);
        }
        if (B.a(handwritingGesture)) {
            return g(x0Var, C.a(handwritingGesture), w0Var);
        }
        if (D.a(handwritingGesture)) {
            return x(x0Var, E.a(handwritingGesture), w0Var);
        }
        if (F.a(handwritingGesture)) {
            return i(x0Var, G.a(handwritingGesture), w0Var);
        }
        if (O.a(handwritingGesture)) {
            return r(x0Var, P.a(handwritingGesture), w0Var, v1Var);
        }
        if (J.a(handwritingGesture)) {
            return o(x0Var, K.a(handwritingGesture), w0Var, v1Var);
        }
        if (M.a(handwritingGesture)) {
            return t(x0Var, N.a(handwritingGesture), w0Var, v1Var);
        }
        return 2;
    }
}
