package K3;

import J3.e;
import Th.a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public class t {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderBoundaryInterface f4104a;

    public t(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f4104a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, e.a aVar) {
        this.f4104a.addWebMessageListener(str, strArr, a.c(new n(aVar)));
    }
}
