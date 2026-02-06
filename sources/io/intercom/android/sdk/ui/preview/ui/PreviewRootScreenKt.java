package io.intercom.android.sdk.ui.preview.ui;

import C.f0;
import G.C;
import G.D;
import Ug.K;
import V.C1415x0;
import Y.B;
import Y.C1500m;
import Y.M0;
import Y.P;
import Y.Y0;
import Y.p1;
import Z1.a;
import a2.C1542a;
import a2.c;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1788k;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import e.C1930c;
import e.C1935h;
import h.C2014c;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.preview.data.DeleteType;
import io.intercom.android.sdk.ui.preview.data.DownloadState;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.preview.viewmodel.PreviewViewModel;
import java.util.List;
import java.util.UUID;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import qf.h;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001ag\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;", "previewArgs", "Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;", "viewModel", "Lkotlin/Function0;", "Llf/M;", "onBackCLick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "onDeleteClick", "", "Landroid/net/Uri;", "onSendClick", "PreviewRootScreen", "(Lk0/i;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewArgs;Lio/intercom/android/sdk/ui/preview/viewmodel/PreviewViewModel;Lyf/a;Lyf/l;Lyf/l;LY/m;II)V", "PreviewRootScreenPreview", "(LY/m;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PreviewRootScreenKt {
    public static final void PreviewRootScreen(i iVar, IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, C6787a aVar, C6798l lVar, C6798l lVar2, C1500m mVar, int i10, int i11) {
        i iVar2;
        int i12;
        PreviewViewModel previewViewModel2;
        a aVar2;
        IntercomPreviewArgs intercomPreviewArgs2 = intercomPreviewArgs;
        C6496s.h(intercomPreviewArgs2, "previewArgs");
        C6496s.h(aVar, "onBackCLick");
        C6496s.h(lVar, "onDeleteClick");
        C6496s.h(lVar2, "onSendClick");
        C1500m h10 = mVar.h(1944224733);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 4) != 0) {
            String uuid = UUID.randomUUID().toString();
            c0.c factory$intercom_sdk_ui_release = PreviewViewModel.Companion.factory$intercom_sdk_ui_release(intercomPreviewArgs2);
            h10.z(1729797275);
            e0 a10 = C1542a.f10582a.a(h10, 6);
            if (a10 != null) {
                if (a10 instanceof C1788k) {
                    aVar2 = ((C1788k) a10).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0192a.f10387b;
                }
                a0 b10 = c.b(O.b(PreviewViewModel.class), a10, uuid, factory$intercom_sdk_ui_release, aVar2, h10, 4096, 0);
                h10.R();
                previewViewModel2 = (PreviewViewModel) b10;
                i12 = i10 & -897;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            previewViewModel2 = previewViewModel;
            i12 = i10;
        }
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        PreviewUiState previewUiState = (PreviewUiState) p1.b(previewViewModel2.getState$intercom_sdk_ui_release(), (g) null, h10, 8, 1).getValue();
        Object A10 = h10.A();
        if (A10 == C1500m.f10026a.a()) {
            B b11 = new B(P.j(h.f72645a, h10));
            h10.r(b11);
            A10 = b11;
        }
        K a11 = ((B) A10).a();
        PreviewUiState previewUiState2 = previewUiState;
        C k10 = D.k(previewUiState.getCurrentPage(), 0.0f, new k(previewUiState), h10, 48, 0);
        C1935h a12 = C1930c.a(new C2014c(), new l(context, intercomPreviewArgs2, previewViewModel2, previewUiState2), h10, 8);
        P.g("Page Navigation", new PreviewRootScreenKt$PreviewRootScreen$1(k10, previewViewModel2, (C6658d<? super PreviewRootScreenKt$PreviewRootScreen$1>) null), h10, 70);
        C2544x0.a aVar3 = C2544x0.f25560b;
        long a13 = aVar3.a();
        long i13 = aVar3.i();
        PreviewRootScreenKt$PreviewRootScreen$2 previewRootScreenKt$PreviewRootScreen$2 = r3;
        PreviewViewModel previewViewModel3 = previewViewModel2;
        PreviewRootScreenKt$PreviewRootScreen$2 previewRootScreenKt$PreviewRootScreen$22 = new PreviewRootScreenKt$PreviewRootScreen$2(previewUiState2, aVar, k10, lVar, lVar2, context, a12, previewViewModel2, a11);
        C1415x0.a(iVar2, (p) null, (p) null, (p) null, (p) null, 0, a13, i13, (f0) null, g0.c.e(-1427415762, true, previewRootScreenKt$PreviewRootScreen$2, h10, 54), h10, (i12 & 14) | 819462144, 318);
        Y0 k11 = h10.k();
        if (k11 != null) {
            k11.a(new m(iVar2, intercomPreviewArgs, previewViewModel3, aVar, lVar, lVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final int PreviewRootScreen$lambda$0(PreviewUiState previewUiState) {
        C6496s.h(previewUiState, "$state");
        return previewUiState.getFiles().size();
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreen$lambda$1(Context context, IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, PreviewUiState previewUiState, boolean z10) {
        C6496s.h(context, "$context");
        C6496s.h(intercomPreviewArgs, "$previewArgs");
        C6496s.h(previewUiState, "$state");
        if (z10) {
            PreviewRootScreen$saveFile(previewViewModel, previewUiState, context);
        } else {
            Toast.makeText(context, intercomPreviewArgs.getDownloadState().getPermissionDeniedText(), 1).show();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreen$lambda$2(i iVar, IntercomPreviewArgs intercomPreviewArgs, PreviewViewModel previewViewModel, C6787a aVar, C6798l lVar, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(intercomPreviewArgs, "$previewArgs");
        C6496s.h(aVar, "$onBackCLick");
        C6496s.h(lVar, "$onDeleteClick");
        C6496s.h(lVar2, "$onSendClick");
        PreviewRootScreen(iVar, intercomPreviewArgs, previewViewModel, aVar, lVar, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void PreviewRootScreen$saveFile(PreviewViewModel previewViewModel, PreviewUiState previewUiState, Context context) {
        previewViewModel.saveFile$intercom_sdk_ui_release(previewUiState.getFiles().get(previewUiState.getCurrentPage()), context);
    }

    @IntercomPreviews
    private static final void PreviewRootScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2020659128);
        if (i10 != 0 || !h10.i()) {
            PreviewRootScreen((i) null, new IntercomPreviewArgs(C6565s.n(), (DeleteType) null, (String) null, false, (DownloadState) null, 30, (DefaultConstructorMarker) null), new PreviewViewModel(new IntercomPreviewArgs(C6565s.n(), (DeleteType) null, (String) null, false, (DownloadState) null, 30, (DefaultConstructorMarker) null)), new n(), new o(), new p(), h10, 224832, 1);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreenPreview$lambda$3() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreenPreview$lambda$4(IntercomPreviewFile intercomPreviewFile) {
        C6496s.h(intercomPreviewFile, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreenPreview$lambda$5(List list) {
        C6496s.h(list, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewRootScreenPreview$lambda$6(int i10, C1500m mVar, int i11) {
        PreviewRootScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
