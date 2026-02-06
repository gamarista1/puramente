package io.intercom.android.sdk.ui.preview.ui;

import B.l;
import C.C1085c;
import C.N;
import C.W;
import C.Y;
import C.Z;
import D.A;
import D.B;
import D.C1109b;
import D.x;
import H0.F;
import I.a;
import J0.C1241g;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.C1389k;
import V.C1391l;
import V.C1393m;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import c1.h;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import r0.C2544x0;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;", "uiState", "Lkotlin/Function1;", "", "Llf/M;", "onThumbnailClick", "Lkotlin/Function0;", "onCtaClick", "PreviewBottomBar", "(Lk0/i;Lio/intercom/android/sdk/ui/preview/model/PreviewUiState;Lyf/l;Lyf/a;LY/m;II)V", "", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "files", "currentPage", "ThumbnailList", "(Ljava/util/List;ILyf/l;LY/m;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PreviewBottomBarKt {
    public static final void PreviewBottomBar(i iVar, PreviewUiState previewUiState, C6798l lVar, C6787a aVar, C1500m mVar, int i10, int i11) {
        i.a aVar2;
        i iVar2;
        PreviewUiState previewUiState2 = previewUiState;
        C6798l lVar2 = lVar;
        int i12 = i10;
        C6496s.h(previewUiState2, "uiState");
        C6496s.h(lVar2, "onThumbnailClick");
        C6496s.h(aVar, "onCtaClick");
        C1500m h10 = mVar.h(1411281377);
        if ((i11 & 1) != 0) {
            aVar2 = i.f23074a;
        } else {
            aVar2 = iVar;
        }
        float f10 = (float) 16;
        i i13 = n.i(b.d(q.i(q.h(aVar2, 0.0f, 1, (Object) null), h.j((float) 100)), C2544x0.o(C2544x0.f25560b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (g2) null, 2, (Object) null), h.j(f10));
        c.a aVar3 = c.f23044a;
        F b10 = W.b(C1085c.f882a.n(h.j((float) 8)), aVar3.i(), h10, 54);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, i13);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a11 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a11);
        } else {
            h10.q();
        }
        C1500m a12 = F1.a(h10);
        F1.b(a12, b10, aVar4.c());
        F1.b(a12, p10, aVar4.e());
        p b11 = aVar4.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b11);
        }
        F1.b(a12, e10, aVar4.d());
        Z z10 = Z.f873a;
        h10.T(-2090574877);
        i.a aVar5 = i.f23074a;
        i b12 = Y.b(z10, aVar5, 1.0f, false, 2, (Object) null);
        F h11 = d.h(aVar3.o(), false);
        int a13 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, b12);
        C6787a a14 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a14);
        } else {
            h10.q();
        }
        C1500m a15 = F1.a(h10);
        F1.b(a15, h11, aVar4.c());
        F1.b(a15, p11, aVar4.e());
        p b13 = aVar4.b();
        if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
            a15.r(Integer.valueOf(a13));
            a15.V(Integer.valueOf(a13), b13);
        }
        F1.b(a15, e11, aVar4.d());
        f fVar = f.f12848a;
        h10.T(654440355);
        if (previewUiState.getFiles().size() > 1) {
            ThumbnailList(previewUiState.getFiles(), previewUiState.getCurrentPage(), lVar2, h10, (i12 & 896) | 8);
        }
        h10.M();
        h10.u();
        String confirmationText = previewUiState.getConfirmationText();
        if (confirmationText == null || Sg.p.d0(confirmationText)) {
            iVar2 = aVar2;
            h10.M();
        } else {
            i m10 = n.m(aVar5, 0.0f, 0.0f, h.j(f10), 0.0f, 11, (Object) null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            a e12 = intercomTheme.getShapes(h10, 6).e();
            iVar2 = aVar2;
            C6787a aVar6 = aVar;
            i iVar3 = m10;
            a aVar7 = e12;
            C1500m mVar2 = h10;
            C1393m.a(aVar6, iVar3, false, aVar7, C1389k.f7680a.b(intercomTheme.getColors(h10, 6).m672getAction0d7_KjU(), 0, 0, 0, h10, C1389k.f7694o << 12, 14), (C1391l) null, (C2868g) null, (N) null, (l) null, g0.c.e(-950541555, true, new PreviewBottomBarKt$PreviewBottomBar$1$2(previewUiState2), h10, 54), mVar2, ((i12 >> 9) & 14) | 805306416, 484);
            h10.M();
        }
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6356i(iVar2, previewUiState, lVar, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewBottomBar$lambda$2(i iVar, PreviewUiState previewUiState, C6798l lVar, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(previewUiState, "$uiState");
        C6496s.h(lVar, "$onThumbnailClick");
        C6496s.h(aVar, "$onCtaClick");
        PreviewBottomBar(iVar, previewUiState, lVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void ThumbnailList(List<? extends IntercomPreviewFile> list, int i10, C6798l lVar, C1500m mVar, int i11) {
        C1500m h10 = mVar.h(-1185141070);
        A c10 = B.c(0, 0, h10, 0, 3);
        Object A10 = h10.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            Y.B b10 = new Y.B(P.j(qf.h.f72645a, h10));
            h10.r(b10);
            A10 = b10;
        }
        K a10 = ((Y.B) A10).a();
        h10.T(1591198182);
        Object A11 = h10.A();
        if (A11 == aVar.a()) {
            A11 = u1.d(C6565s.n(), (o1) null, 2, (Object) null);
            h10.r(A11);
        }
        C1510r0 r0Var = (C1510r0) A11;
        h10.M();
        h10.T(1591201463);
        boolean S10 = h10.S(c10);
        Object A12 = h10.A();
        if (S10 || A12 == aVar.a()) {
            A12 = new PreviewBottomBarKt$ThumbnailList$1$1(c10, r0Var, (C6658d<? super PreviewBottomBarKt$ThumbnailList$1$1>) null);
            h10.r(A12);
        }
        h10.M();
        P.g("", (p) A12, h10, 70);
        i.a aVar2 = i.f23074a;
        C1085c.e f10 = C1085c.f882a.f();
        c.C0368c i12 = c.f23044a.i();
        C1109b.b(aVar2, c10, n.b(h.j((float) 8), h.j((float) 4)), false, f10, i12, (z.n) null, false, new C6354g(list, r0Var, i10, a10, lVar, c10), h10, 221574, 200);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6355h(list, i10, lVar, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ThumbnailList$lambda$8(List list, C1510r0 r0Var, int i10, K k10, C6798l lVar, A a10, x xVar) {
        C6496s.h(list, "$files");
        C6496s.h(r0Var, "$visibleItems");
        C6496s.h(k10, "$scope");
        C6496s.h(lVar, "$onThumbnailClick");
        C6496s.h(a10, "$listState");
        C6496s.h(xVar, "$this$LazyRow");
        xVar.a(list.size(), (C6798l) null, new PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$2(list), g0.c.c(-1091073711, true, new PreviewBottomBarKt$ThumbnailList$lambda$8$$inlined$itemsIndexed$default$3(list, i10, lVar)));
        if (!((List) r0Var.getValue()).contains(Integer.valueOf(i10))) {
            C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new PreviewBottomBarKt$ThumbnailList$2$2(a10, i10, (C6658d<? super PreviewBottomBarKt$ThumbnailList$2$2>) null), 3, (Object) null);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ThumbnailList$lambda$9(List list, int i10, C6798l lVar, int i11, C1500m mVar, int i12) {
        C6496s.h(list, "$files");
        C6496s.h(lVar, "$onThumbnailClick");
        ThumbnailList(list, i10, lVar, mVar, M0.a(i11 | 1));
        return C6514M.f71813a;
    }
}
