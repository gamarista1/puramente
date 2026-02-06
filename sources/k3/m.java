package K3;

import J3.b;
import J3.c;
import Th.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

public abstract class m implements WebMessageBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f4024a = {"WEB_MESSAGE_ARRAY_BUFFER"};

    private static c[] a(InvocationHandler[] invocationHandlerArr) {
        c[] cVarArr = new c[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            cVarArr[i10] = new o(invocationHandlerArr[i10]);
        }
        return cVarArr;
    }

    public static b b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        c[] a10 = a(webMessageBoundaryInterface.getPorts());
        if (!r.f4030C.d()) {
            return new b(webMessageBoundaryInterface.getData(), a10);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) a.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new b(webMessagePayloadBoundaryInterface.getAsString(), a10);
        }
        if (type != 1) {
            return null;
        }
        return new b(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a10);
    }
}
