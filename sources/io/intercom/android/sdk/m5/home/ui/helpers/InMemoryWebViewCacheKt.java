package io.intercom.android.sdk.m5.home.ui.helpers;

import Sg.p;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "url", "Lio/intercom/android/sdk/blocks/messengercard/CardWebView;", "getCachedWebView", "(Ljava/lang/String;)Lio/intercom/android/sdk/blocks/messengercard/CardWebView;", "webView", "Llf/M;", "cacheWebView", "(Ljava/lang/String;Lio/intercom/android/sdk/blocks/messengercard/CardWebView;)V", "getIdFromURL", "(Ljava/lang/String;)Ljava/lang/String;", "clearWebViewCache", "()V", "", "webViewCache", "Ljava/util/Map;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InMemoryWebViewCacheKt {
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(String str, CardWebView cardWebView) {
        C6496s.h(str, "url");
        C6496s.h(cardWebView, "webView");
        webViewCache.put(getIdFromURL(str), cardWebView);
    }

    public static final void clearWebViewCache() {
        webViewCache.clear();
    }

    public static final CardWebView getCachedWebView(String str) {
        C6496s.h(str, "url");
        return webViewCache.get(getIdFromURL(str));
    }

    private static final String getIdFromURL(String str) {
        return p.a1(p.S0(str, "card_id=", (String) null, 2, (Object) null), "&token", (String) null, 2, (Object) null);
    }
}
