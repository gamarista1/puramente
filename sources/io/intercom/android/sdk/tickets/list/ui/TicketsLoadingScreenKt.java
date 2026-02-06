package io.intercom.android.sdk.tickets.list.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "TicketsLoadingScreen", "(Lk0/i;LY/m;II)V", "TicketsLoadingScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketsLoadingScreenKt {
    public static final void TicketsLoadingScreen(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(2079268510);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i14 != 0) {
                iVar = i.f23074a;
            }
            LoadingScreenKt.LoadingScreen(iVar, R.drawable.intercom_inbox_loading_state, h10, i12 & 14, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new i(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsLoadingScreen$lambda$0(i iVar, int i10, int i11, C1500m mVar, int i12) {
        TicketsLoadingScreen(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void TicketsLoadingScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-880557955);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketsLoadingScreenKt.INSTANCE.m556getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsLoadingScreenPreview$lambda$1(int i10, C1500m mVar, int i11) {
        TicketsLoadingScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
