package K3;

import J3.b;
import J3.e;
import Th.a;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

public class n implements WebMessageListenerBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f4025a;

    public n(e.a aVar) {
        this.f4025a = aVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        b b10 = m.b((WebMessageBoundaryInterface) a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b10 != null) {
            this.f4025a.a(webView, b10, uri, z10, k.b(invocationHandler2));
        }
    }
}
