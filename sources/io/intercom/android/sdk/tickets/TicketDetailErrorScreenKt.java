package io.intercom.android.sdk.tickets;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/components/ErrorState;", "state", "Lk0/i;", "modifier", "Llf/M;", "TicketDetailErrorScreen", "(Lio/intercom/android/sdk/m5/components/ErrorState;Lk0/i;LY/m;II)V", "TicketDetailErrorScreenWithCTAPreview", "(LY/m;I)V", "TicketDetailErrorScreenWithoutCTAPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailErrorScreenKt {
    public static final void TicketDetailErrorScreen(ErrorState errorState, i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C6496s.h(errorState, "state");
        C1500m h10 = mVar.h(-2061608265);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(errorState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (h10.S(iVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            if (i15 != 0) {
                iVar = i.f23074a;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(errorState, iVar, h10, i12 & 126, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new x(errorState, iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailErrorScreen$lambda$0(ErrorState errorState, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(errorState, "$state");
        TicketDetailErrorScreen(errorState, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void TicketDetailErrorScreenWithCTAPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1196795215);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketDetailErrorScreenKt.INSTANCE.m525getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new w(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailErrorScreenWithCTAPreview$lambda$1(int i10, C1500m mVar, int i11) {
        TicketDetailErrorScreenWithCTAPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TicketDetailErrorScreenWithoutCTAPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(989031425);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketDetailErrorScreenKt.INSTANCE.m526getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailErrorScreenWithoutCTAPreview$lambda$2(int i10, C1500m mVar, int i11) {
        TicketDetailErrorScreenWithoutCTAPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
