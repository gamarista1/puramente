package io.intercom.android.sdk.ui.preview.ui;

import A.j;
import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.N;
import C0.a;
import G.C;
import G.m;
import H0.F;
import J0.C1241g;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.n;
import androidx.compose.ui.platform.C1644k0;
import androidx.core.content.c;
import c1.t;
import e.C1935h;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.ArrayList;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;
import z.C2939C;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class PreviewRootScreenKt$PreviewRootScreen$2 implements q {
    final /* synthetic */ Context $context;
    final /* synthetic */ C6787a $onBackCLick;
    final /* synthetic */ C6798l $onDeleteClick;
    final /* synthetic */ C6798l $onSendClick;
    final /* synthetic */ C $pagerState;
    final /* synthetic */ C1935h $permissionLauncher;
    final /* synthetic */ K $scope;
    final /* synthetic */ PreviewUiState $state;
    final /* synthetic */ PreviewViewModel $viewModel;

    PreviewRootScreenKt$PreviewRootScreen$2(PreviewUiState previewUiState, C6787a aVar, C c10, C6798l lVar, C6798l lVar2, Context context, C1935h hVar, PreviewViewModel previewViewModel, K k10) {
        this.$state = previewUiState;
        this.$onBackCLick = aVar;
        this.$pagerState = c10;
        this.$onDeleteClick = lVar;
        this.$onSendClick = lVar2;
        this.$context = context;
        this.$permissionLauncher = hVar;
        this.$viewModel = previewViewModel;
        this.$scope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$0(C6798l lVar, PreviewUiState previewUiState) {
        C6496s.h(lVar, "$onDeleteClick");
        C6496s.h(previewUiState, "$state");
        lVar.invoke(previewUiState.getFiles().get(previewUiState.getCurrentPage()));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$2(C6798l lVar, PreviewUiState previewUiState) {
        C6496s.h(lVar, "$onSendClick");
        C6496s.h(previewUiState, "$state");
        Iterable<IntercomPreviewFile> files = previewUiState.getFiles();
        ArrayList arrayList = new ArrayList(C6565s.y(files, 10));
        for (IntercomPreviewFile uri : files) {
            arrayList.add(uri.getUri());
        }
        lVar.invoke(arrayList);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$3(Context context, C1935h hVar, PreviewViewModel previewViewModel, PreviewUiState previewUiState) {
        C6496s.h(context, "$context");
        C6496s.h(hVar, "$permissionLauncher");
        C6496s.h(previewUiState, "$state");
        if (Build.VERSION.SDK_INT >= 29) {
            PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, previewUiState, context);
        } else if (c.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            PreviewRootScreenKt.PreviewRootScreen$saveFile(previewViewModel, previewUiState, context);
        } else {
            hVar.b("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$4(K k10, C c10, int i10) {
        C6496s.h(k10, "$scope");
        C6496s.h(c10, "$pagerState");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new PreviewRootScreenKt$PreviewRootScreen$2$1$5$1(c10, i10, (C6658d<? super PreviewRootScreenKt$PreviewRootScreen$2$1$5$1>) null), 3, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$7$lambda$6(C6798l lVar, PreviewUiState previewUiState) {
        C6496s.h(lVar, "$onSendClick");
        C6496s.h(previewUiState, "$state");
        Iterable<IntercomPreviewFile> files = previewUiState.getFiles();
        ArrayList arrayList = new ArrayList(C6565s.y(files, 10));
        for (IntercomPreviewFile uri : files) {
            arrayList.add(uri.getUri());
        }
        lVar.invoke(arrayList);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((N) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(N n10, C1500m mVar, int i10) {
        int i11;
        String confirmationText;
        N n11 = n10;
        C1500m mVar2 = mVar;
        C6496s.h(n11, "it");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(n11) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            i.a aVar = i.f23074a;
            i f10 = androidx.compose.foundation.layout.q.f(n.l(aVar, n.g(n11, (t) mVar2.m(C1644k0.k())), n10.d(), n.f(n11, (t) mVar2.m(C1644k0.k())), n10.a()), 0.0f, 1, (Object) null);
            PreviewUiState previewUiState = this.$state;
            C6787a aVar2 = this.$onBackCLick;
            C c10 = this.$pagerState;
            C6798l lVar = this.$onDeleteClick;
            C6798l lVar2 = this.$onSendClick;
            Context context = this.$context;
            C1935h hVar = this.$permissionLauncher;
            PreviewViewModel previewViewModel = this.$viewModel;
            K k10 = this.$scope;
            F a10 = C1090h.a(C1085c.f882a.g(), k0.c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, f10);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            K k11 = k10;
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            C6798l lVar3 = lVar2;
            C c11 = c10;
            PreviewTopBarKt.PreviewTopBar((i) null, previewUiState.getShowDeleteAction(), previewUiState.getShowSendAction(), previewUiState.getShowDownloadAction(), aVar2, new s(lVar, previewUiState), new t(lVar2, previewUiState), new u(context, hVar, previewViewModel, previewUiState), mVar, 0, 1);
            K k12 = k11;
            i.a aVar4 = aVar;
            PreviewUiState previewUiState2 = previewUiState;
            m.a(c11, C1092j.c(kVar, aVar, 1.0f, false, 2, (Object) null), (N) null, (G.g) null, 0, 0.0f, (c.C0368c) null, (C2939C) null, false, false, (C6798l) null, (a) null, (j) null, g0.c.e(-1530179002, true, new PreviewRootScreenKt$PreviewRootScreen$2$1$4(previewUiState), mVar2, 54), mVar, 0, 3072, 8188);
            mVar2.T(1884493226);
            if (previewUiState2.getFiles().size() > 1 || ((confirmationText = previewUiState2.getConfirmationText()) != null && !Sg.p.d0(confirmationText))) {
                PreviewUiState previewUiState3 = previewUiState2;
                PreviewBottomBarKt.PreviewBottomBar(aVar4, previewUiState3, new v(k12, c11), new w(lVar3, previewUiState3), mVar, 70, 0);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
