package K3;

import Th.a;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class v implements u {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f4105a;

    public v(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f4105a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f4105a.getSupportedFeatures();
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) a.a(WebViewProviderBoundaryInterface.class, this.f4105a.createWebView(webView));
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) a.a(StaticsBoundaryInterface.class, this.f4105a.getStatics());
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) a.a(WebkitToCompatConverterBoundaryInterface.class, this.f4105a.getWebkitToCompatConverter());
    }
}
