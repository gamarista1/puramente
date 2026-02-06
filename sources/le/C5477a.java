package Le;

import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Map;

/* renamed from: Le.a  reason: case insensitive filesystem */
public final /* synthetic */ class C5477a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HelpCenterWebViewInterface f63860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f63861b;

    public /* synthetic */ C5477a(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        this.f63860a = helpCenterWebViewInterface;
        this.f63861b = map;
    }

    public final void run() {
        this.f63860a.lambda$handleAction$0(this.f63861b);
    }
}
