package K3;

import J3.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

public class k extends a {

    /* renamed from: a  reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f4020a;

    public k(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f4020a = jsReplyProxyBoundaryInterface;
    }

    public static k b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) Th.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (k) jsReplyProxyBoundaryInterface.getOrCreatePeer(new j(jsReplyProxyBoundaryInterface));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object c(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new k(jsReplyProxyBoundaryInterface);
    }
}
