package io.intercom.android.sdk.m5.home.ui.components;

import C.C1092j;
import Y.C1500m;
import android.content.Context;
import androidx.compose.ui.viewinterop.e;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class LegacyMessengerAppCardKt$LegacyMessengerAppCard$1 implements q {
    final /* synthetic */ CardWebView $webView;

    LegacyMessengerAppCardKt$LegacyMessengerAppCard$1(CardWebView cardWebView) {
        this.$webView = cardWebView;
    }

    /* access modifiers changed from: private */
    public static final CardWebView invoke$lambda$0(CardWebView cardWebView, Context context) {
        C6496s.h(cardWebView, "$webView");
        C6496s.h(context, "it");
        return cardWebView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            e.a(new j(this.$webView), (i) null, (C6798l) null, mVar, 0, 6);
        } else {
            mVar.I();
        }
    }
}
