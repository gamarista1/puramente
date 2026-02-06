package io.intercom.android.sdk.m5.components;

import M0.e;
import V.V;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.ui.platform.C1644k0;
import c1.t;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import o0.C2347j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "IntercomChevron", "(Lk0/i;LY/m;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomChevronKt {
    public static final void IntercomChevron(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        float f10;
        int i13;
        C1500m h10 = mVar.h(467059601);
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
            if (h10.m(C1644k0.k()) == t.Rtl) {
                f10 = 180.0f;
            } else {
                f10 = 0.0f;
            }
            V.a(e.c(R.drawable.intercom_chevron, h10, 0), (String) null, C2347j.a(iVar, f10), IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU(), h10, 56, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new A0(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomChevron$lambda$0(i iVar, int i10, int i11, C1500m mVar, int i12) {
        IntercomChevron(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
