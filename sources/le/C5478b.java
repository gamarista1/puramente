package Le;

import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Map;

/* renamed from: Le.b  reason: case insensitive filesystem */
public final /* synthetic */ class C5478b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HelpCenterWebViewInterface f63862a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f63863b;

    public /* synthetic */ C5478b(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        this.f63862a = helpCenterWebViewInterface;
        this.f63863b = map;
    }

    public final void run() {
        this.f63862a.lambda$handleAction$1(this.f63863b);
    }
}
