package io.intercom.android.sdk.m5.helpcenter.ui;

import H0.F;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.EmptyStateKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "HelpCenterEmptyScreen", "(Lk0/i;LY/m;II)V", "InboxEmptyScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterEmptyScreenKt {
    public static final void HelpCenterEmptyScreen(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(-123597347);
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
            c e10 = c.f23044a.e();
            i.a aVar = i.f23074a;
            F h11 = d.h(e10, false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e11 = h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
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
            F1.b(a12, h11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e11, aVar2.d());
            f fVar = f.f12848a;
            i f10 = q.f(iVar, 0.0f, 1, (Object) null);
            String string = ((Context) h10.m(AndroidCompositionLocals_androidKt.g())).getString(R.string.intercom_no_articles_to_display);
            C6496s.g(string, "getString(...)");
            EmptyStateKt.EmptyState(string, f10, (String) null, Integer.valueOf(R.drawable.intercom_help_centre_icon), (p) null, h10, 0, 20);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterEmptyScreen$lambda$1(i iVar, int i10, int i11, C1500m mVar, int i12) {
        HelpCenterEmptyScreen(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void InboxEmptyScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1897399468);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HelpCenterEmptyScreenKt.INSTANCE.m337getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InboxEmptyScreenPreview$lambda$2(int i10, C1500m mVar, int i11) {
        InboxEmptyScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
