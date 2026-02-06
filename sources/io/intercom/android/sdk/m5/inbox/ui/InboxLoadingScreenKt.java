package io.intercom.android.sdk.m5.inbox.ui;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Llf/M;", "InboxLoadingScreen", "(LY/m;I)V", "HomeLoadingContentPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InboxLoadingScreenKt {
    @IntercomPreviews
    public static final void HomeLoadingContentPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1591477138);
        if (i10 != 0 || !h10.i()) {
            InboxLoadingScreen(h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeLoadingContentPreview$lambda$1(int i10, C1500m mVar, int i11) {
        HomeLoadingContentPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void InboxLoadingScreen(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1280547936);
        if (i10 != 0 || !h10.i()) {
            LoadingScreenKt.LoadingScreen((i) null, R.drawable.intercom_inbox_loading_state, h10, 0, 1);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxLoadingScreen$lambda$0(int i10, C1500m mVar, int i11) {
        InboxLoadingScreen(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
