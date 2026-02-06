package io.intercom.android.sdk.ui.preview.ui;

import V.B0;
import Y.C1500m;
import Y.p1;
import g0.c;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.model.PreviewUiState;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import qf.g;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomPreviewActivity$onCreate$1 implements p {
    final /* synthetic */ IntercomPreviewActivity this$0;

    IntercomPreviewActivity$onCreate$1(IntercomPreviewActivity intercomPreviewActivity) {
        this.this$0 = intercomPreviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            if (((PreviewUiState) p1.b(this.this$0.getViewModel().getState$intercom_sdk_ui_release(), (g) null, mVar, 8, 1).getValue()).getFiles().isEmpty()) {
                this.this$0.finishWithResult(0, C6565s.n());
            }
            final IntercomPreviewActivity intercomPreviewActivity = this.this$0;
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(1935728022, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(IntercomPreviewActivity intercomPreviewActivity) {
                    C6496s.h(intercomPreviewActivity, "this$0");
                    intercomPreviewActivity.finishWithResult(0, C6565s.n());
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(IntercomPreviewActivity intercomPreviewActivity, IntercomPreviewFile intercomPreviewFile) {
                    C6496s.h(intercomPreviewActivity, "this$0");
                    C6496s.h(intercomPreviewFile, "it");
                    intercomPreviewActivity.getViewModel().onDeleteClicked$intercom_sdk_ui_release(intercomPreviewFile);
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$2(IntercomPreviewActivity intercomPreviewActivity, List list) {
                    C6496s.h(intercomPreviewActivity, "this$0");
                    C6496s.h(list, "it");
                    intercomPreviewActivity.finishWithResult(-1, list);
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        PreviewRootScreenKt.PreviewRootScreen((i) null, intercomPreviewActivity.getPreviewData(), intercomPreviewActivity.getViewModel(), new C6351d(intercomPreviewActivity), new C6352e(intercomPreviewActivity), new C6353f(intercomPreviewActivity), mVar, 576, 1);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar, 54), mVar, 3072, 7);
            return;
        }
        mVar.I();
    }
}
