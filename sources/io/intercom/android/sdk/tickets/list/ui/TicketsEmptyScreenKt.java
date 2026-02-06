package io.intercom.android.sdk.tickets.list.ui;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/models/EmptyState;", "emptyState", "Lk0/i;", "modifier", "Llf/M;", "TicketsEmptyScreen", "(Lio/intercom/android/sdk/models/EmptyState;Lk0/i;LY/m;II)V", "EmptyScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketsEmptyScreenKt {
    private static final void EmptyScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1850741992);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m552getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyScreenPreview$lambda$1(int i10, C1500m mVar, int i11) {
        EmptyScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TicketsEmptyScreen(EmptyState emptyState, i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C6496s.h(emptyState, "emptyState");
        C1500m h10 = mVar.h(1360358580);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(emptyState)) {
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
            EmptyStateKt.EmptyState(emptyState.getTitle(), iVar, emptyState.getText(), Integer.valueOf(R.drawable.intercom_ticket_detail_icon), (p) null, h10, i12 & 112, 16);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(emptyState, iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketsEmptyScreen$lambda$0(EmptyState emptyState, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(emptyState, "$emptyState");
        TicketsEmptyScreen(emptyState, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
