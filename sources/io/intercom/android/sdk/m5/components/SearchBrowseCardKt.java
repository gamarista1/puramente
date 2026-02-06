package io.intercom.android.sdk.m5.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.c;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u000f\u0010\u0011\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;", "helpCenterData", "", "isSearchFirstEnabled", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "avatars", "accessToTeammateEnabled", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Llf/M;", "SearchBrowseCard", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeHelpCenterData;ZLjava/util/List;ZLio/intercom/android/sdk/metrics/MetricTracker;LY/m;I)V", "PreviewSearchBrowse", "(LY/m;I)V", "PreviewSearchBrowseNoSuggestions", "PreviewSearchBrowseNoSearchFirst", "PreviewSearchBrowseNoSuggestionsNoSearchFirst", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SearchBrowseCardKt {
    @IntercomPreviews
    private static final void PreviewSearchBrowse(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1546858090);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m187getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new R0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewSearchBrowse$lambda$1(int i10, C1500m mVar, int i11) {
        PreviewSearchBrowse(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSearchFirst(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-678171621);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m189getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new V0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewSearchBrowseNoSearchFirst$lambda$3(int i10, C1500m mVar, int i11) {
        PreviewSearchBrowseNoSearchFirst(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestions(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1745562356);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m188getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new S0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewSearchBrowseNoSuggestions$lambda$2(int i10, C1500m mVar, int i11) {
        PreviewSearchBrowseNoSuggestions(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PreviewSearchBrowseNoSuggestionsNoSearchFirst(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(354688977);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SearchBrowseCardKt.INSTANCE.m190getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new U0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(int i10, C1500m mVar, int i11) {
        PreviewSearchBrowseNoSuggestionsNoSearchFirst(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SearchBrowseCard(HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z10, List<AvatarWrapper> list, boolean z11, MetricTracker metricTracker, C1500m mVar, int i10) {
        HomeCards.HomeHelpCenterData homeHelpCenterData2 = homeHelpCenterData;
        C6496s.h(homeHelpCenterData, "helpCenterData");
        C6496s.h(list, "avatars");
        C6496s.h(metricTracker, "metricTracker");
        C1500m h10 = mVar.h(382156573);
        IntercomCardKt.IntercomCard(q.h(i.f23074a, 0.0f, 1, (Object) null), (IntercomCardStyle.Style) null, c.e(-1020132823, true, new SearchBrowseCardKt$SearchBrowseCard$1(z10, homeHelpCenterData, z11, list, metricTracker, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, 54), h10, 390, 2);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new T0(homeHelpCenterData, z10, list, z11, metricTracker, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SearchBrowseCard$lambda$0(HomeCards.HomeHelpCenterData homeHelpCenterData, boolean z10, List list, boolean z11, MetricTracker metricTracker, int i10, C1500m mVar, int i11) {
        C6496s.h(homeHelpCenterData, "$helpCenterData");
        C6496s.h(list, "$avatars");
        C6496s.h(metricTracker, "$metricTracker");
        SearchBrowseCard(homeHelpCenterData, z10, list, z11, metricTracker, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
