package io.intercom.android.sdk.blocks.messengercard;

import Ug.L;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import lf.C6514M;

public class CardWebView extends WebView {
    public CardWebView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6514M lambda$setUp$0(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            reload();
        }
        return C6514M.f71813a;
    }

    public void setUp() {
        Injector.get().getDataLayer().listenToEvents(L.b(), new a(this));
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
