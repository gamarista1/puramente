package io.intercom.android.sdk.m5.home.ui.components;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "url", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "style", "", "isHomeScreen", "Llf/M;", "LegacyMessengerAppCard", "(Ljava/lang/String;Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;ZLY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LegacyMessengerAppCardKt {
    public static final void LegacyMessengerAppCard(String str, IntercomCardStyle.Style style, boolean z10, C1500m mVar, int i10) {
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        String str2 = str;
        IntercomCardStyle.Style style2 = style;
        boolean z12 = z10;
        int i16 = i10;
        C6496s.h(str2, "url");
        C6496s.h(style2, "style");
        C1500m h10 = mVar.h(-1087658045);
        if ((i16 & 14) == 0) {
            if (h10.S(str2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i16;
        } else {
            i11 = i16;
        }
        if ((i16 & 112) == 0) {
            if (h10.S(style2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i16 & 896) == 0) {
            if (h10.b(z12)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        int i17 = i11;
        if ((i17 & 731) != 146 || !h10.i()) {
            Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
            CardWebView cachedWebView = InMemoryWebViewCacheKt.getCachedWebView(str);
            h10.T(363576463);
            if (cachedWebView != null) {
                z11 = true;
                i12 = i17;
            } else {
                h10.T(363579072);
                Object A10 = h10.A();
                if (A10 == C1500m.f10026a.a()) {
                    CardWebView cardWebView = new CardWebView(context);
                    cardWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
                    cardWebView.getSettings().setJavaScriptEnabled(true);
                    cardWebView.getSettings().setUseWideViewPort(true);
                    cardWebView.getSettings().setCacheMode(-1);
                    cardWebView.getSettings().setMixedContentMode(0);
                    cardWebView.setVerticalScrollBarEnabled(false);
                    cardWebView.setHorizontalScrollBarEnabled(false);
                    cardWebView.setWebViewClient(new MessengerCardWebViewClient(str2));
                    ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                    composeView.setContent(ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m374getLambda2$intercom_sdk_base_release());
                    CardWebView cardWebView2 = cardWebView;
                    z11 = true;
                    i12 = i17;
                    new MessengerCardWebViewPresenter(cardWebView, composeView, str, Injector.get().getAppConfigProvider().get().getPrimaryColor(), Injector.get().getGson(), Injector.get().getMetricTracker(), cardWebView.getContext().getCacheDir(), "", z10, context).setUpWebView();
                    cardWebView2.loadUrl(str2);
                    h10.r(cardWebView2);
                    A10 = cardWebView2;
                } else {
                    z11 = true;
                    i12 = i17;
                }
                cachedWebView = (CardWebView) A10;
                h10.M();
                InMemoryWebViewCacheKt.cacheWebView(str2, cachedWebView);
            }
            h10.M();
            IntercomCardKt.IntercomCard((i) null, style, c.e(231006519, z11, new LegacyMessengerAppCardKt$LegacyMessengerAppCard$1(cachedWebView), h10, 54), h10, (IntercomCardStyle.Style.$stable << 3) | 384 | (i12 & 112), 1);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new i(str2, style, z10, i16));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LegacyMessengerAppCard$lambda$3(String str, IntercomCardStyle.Style style, boolean z10, int i10, C1500m mVar, int i11) {
        C6496s.h(str, "$url");
        C6496s.h(style, "$style");
        LegacyMessengerAppCard(str, style, z10, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
