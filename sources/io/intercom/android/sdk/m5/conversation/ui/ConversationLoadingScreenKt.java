package io.intercom.android.sdk.m5.conversation.ui;

import H0.F;
import J0.C1241g;
import V.B0;
import V.C1400p0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk0/i;", "modifier", "Llf/M;", "ConversationLoadingScreen", "(Lk0/i;LY/m;II)V", "ConversationLoadingScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationLoadingScreenKt {
    public static final void ConversationLoadingScreen(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        C1500m h10 = mVar.h(1301092108);
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
            i f10 = q.f(iVar, 0.0f, 1, (Object) null);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i15 = IntercomTheme.$stable;
            i d10 = b.d(f10, intercomTheme.getColors(h10, i15).m678getBackground0d7_KjU(), (g2) null, 2, (Object) null);
            F h11 = d.h(e10, false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e11 = h.e(h10, d10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
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
            F1.b(a12, h11, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e11, aVar.d());
            f fVar = f.f12848a;
            C1400p0.a((i) null, intercomTheme.getColors(h10, i15).m673getActionContrastWhite0d7_KjU(), 0.0f, 0, 0, h10, 0, 29);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6167d(iVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationLoadingScreen$lambda$1(i iVar, int i10, int i11, C1500m mVar, int i12) {
        ConversationLoadingScreen(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void ConversationLoadingScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(389316475);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ConversationLoadingScreenKt.INSTANCE.m225getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6169e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationLoadingScreenPreview$lambda$2(int i10, C1500m mVar, int i11) {
        ConversationLoadingScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
