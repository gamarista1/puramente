package io.intercom.android.sdk.survey.ui.components;

import Y.C1500m;
import Y.M0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c1.h;
import com.facebook.shimmer.d;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import q1.C2429a;
import r0.C2550z0;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Loading;", "state", "Lk0/i;", "modifier", "Llf/M;", "SurveyLoading", "(Lio/intercom/android/sdk/survey/SurveyState$Loading;Lk0/i;LY/m;II)V", "Landroid/content/Context;", "context", "Lcom/facebook/shimmer/d;", "buildLoadingContainer", "(Landroid/content/Context;)Lcom/facebook/shimmer/d;", "Lr0/x0;", "tintColor", "", "resId", "Landroid/view/View;", "buildLoadingContent-bw27NRU", "(Landroid/content/Context;JI)Landroid/view/View;", "buildLoadingContent", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LoadingComponentKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: yf.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SurveyLoading(io.intercom.android.sdk.survey.SurveyState.Loading r7, k0.i r8, Y.C1500m r9, int r10, int r11) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            r0 = 913588806(0x36744246, float:3.639741E-6)
            Y.m r9 = r9.h(r0)
            r0 = r11 & 1
            r1 = 4
            if (r0 == 0) goto L_0x0014
            r0 = r10 | 6
            goto L_0x0024
        L_0x0014:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0023
            boolean r0 = r9.S(r7)
            if (r0 == 0) goto L_0x0020
            r0 = r1
            goto L_0x0021
        L_0x0020:
            r0 = 2
        L_0x0021:
            r0 = r0 | r10
            goto L_0x0024
        L_0x0023:
            r0 = r10
        L_0x0024:
            r2 = r11 & 2
            if (r2 == 0) goto L_0x002b
            r0 = r0 | 48
            goto L_0x003b
        L_0x002b:
            r3 = r10 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003b
            boolean r3 = r9.S(r8)
            if (r3 == 0) goto L_0x0038
            r3 = 32
            goto L_0x003a
        L_0x0038:
            r3 = 16
        L_0x003a:
            r0 = r0 | r3
        L_0x003b:
            r3 = r0 & 91
            r4 = 18
            if (r3 != r4) goto L_0x004c
            boolean r3 = r9.i()
            if (r3 != 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r9.I()
            goto L_0x0086
        L_0x004c:
            if (r2 == 0) goto L_0x0050
            k0.i$a r8 = k0.i.f23074a
        L_0x0050:
            r2 = 0
            r3 = 0
            r4 = 1
            k0.i r2 = androidx.compose.foundation.layout.q.f(r8, r2, r4, r3)
            r3 = 1496338436(0x59305004, float:3.10172338E15)
            r9.T(r3)
            r0 = r0 & 14
            if (r0 != r1) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            java.lang.Object r0 = r9.A()
            if (r4 != 0) goto L_0x0071
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r0 != r1) goto L_0x0079
        L_0x0071:
            io.intercom.android.sdk.survey.ui.components.i r0 = new io.intercom.android.sdk.survey.ui.components.i
            r0.<init>(r7)
            r9.r(r0)
        L_0x0079:
            r1 = r0
            yf.l r1 = (yf.C6798l) r1
            r9.M()
            r5 = 0
            r6 = 4
            r3 = 0
            r4 = r9
            androidx.compose.ui.viewinterop.e.a(r1, r2, r3, r4, r5, r6)
        L_0x0086:
            Y.Y0 r9 = r9.k()
            if (r9 == 0) goto L_0x0094
            io.intercom.android.sdk.survey.ui.components.j r0 = new io.intercom.android.sdk.survey.ui.components.j
            r0.<init>(r7, r8, r10, r11)
            r9.a(r0)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.components.LoadingComponentKt.SurveyLoading(io.intercom.android.sdk.survey.SurveyState$Loading, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final d SurveyLoading$lambda$2$lambda$1(SurveyState.Loading loading, Context context) {
        C6496s.h(loading, "$state");
        C6496s.h(context, "context");
        d buildLoadingContainer = buildLoadingContainer(context);
        buildLoadingContainer.addView(m466buildLoadingContentbw27NRU(context, loading.getSurveyUiColors().m426getOnBackground0d7_KjU(), R.drawable.intercom_survey_loading_state));
        return buildLoadingContainer;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyLoading$lambda$3(SurveyState.Loading loading, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(loading, "$state");
        SurveyLoading(loading, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final d buildLoadingContainer(Context context) {
        C6496s.h(context, "context");
        IntercomShimmerLayout intercomShimmerLayout = new IntercomShimmerLayout(context);
        intercomShimmerLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        intercomShimmerLayout.setClickable(true);
        intercomShimmerLayout.setFocusable(true);
        return intercomShimmerLayout;
    }

    /* renamed from: buildLoadingContent-bw27NRU  reason: not valid java name */
    public static final View m466buildLoadingContentbw27NRU(Context context, long j10, int i10) {
        C6496s.h(context, "context");
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int j11 = (int) h.j(h.j((float) 20) * context.getResources().getDisplayMetrics().density);
        layoutParams.setMarginStart(j11);
        layoutParams.setMarginEnd(j11);
        layoutParams.topMargin = j11;
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        Drawable f10 = o1.h.f(context.getResources(), i10, (Resources.Theme) null);
        if (f10 != null) {
            C2429a.h(f10, C2550z0.k(j10));
            C2429a.d(f10, true);
            imageView.setImageDrawable(f10);
        }
        return imageView;
    }
}
