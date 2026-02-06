package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.viewinterop.e;
import com.facebook.shimmer.d;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk0/i;", "modifier", "", "shimmerDrawable", "Llf/M;", "LoadingScreen", "(Lk0/i;ILY/m;II)V", "LoadingScreenPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoadingScreenKt {
    public static final void LoadingScreen(i iVar, int i10, C1500m mVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        C1500m h10 = mVar.h(-1767045234);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h10.S(iVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h10.d(i10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) != 18 || !h10.i()) {
            if (i16 != 0) {
                iVar = i.f23074a;
            }
            long r42 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m700getPrimaryText0d7_KjU();
            boolean z10 = true;
            i f10 = q.f(iVar, 0.0f, 1, (Object) null);
            h10.T(1035114321);
            boolean e10 = h10.e(r42);
            if ((i13 & 112) != 32) {
                z10 = false;
            }
            boolean z11 = e10 | z10;
            Object A10 = h10.A();
            if (z11 || A10 == C1500m.f10026a.a()) {
                A10 = new M0(r42, i10);
                h10.r(A10);
            }
            h10.M();
            e.a((C6798l) A10, f10, (C6798l) null, h10, 0, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new N0(iVar, i10, i11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final d LoadingScreen$lambda$2$lambda$1(long j10, int i10, Context context) {
        C6496s.h(context, "context");
        d buildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        buildLoadingContainer.addView(LoadingComponentKt.m466buildLoadingContentbw27NRU(context, j10, i10));
        return buildLoadingContainer;
    }

    /* access modifiers changed from: private */
    public static final C6514M LoadingScreen$lambda$3(i iVar, int i10, int i11, int i12, C1500m mVar, int i13) {
        LoadingScreen(iVar, i10, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void LoadingScreenPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1596356708);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$LoadingScreenKt.INSTANCE.m182getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LoadingScreenPreview$lambda$4(int i10, C1500m mVar, int i11) {
        LoadingScreenPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
