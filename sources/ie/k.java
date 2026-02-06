package ie;

import ae.C4464a;
import ae.p;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.jvm.internal.C6496s;
import qe.C5155b;
import yf.C6798l;

public final class k extends C5036f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, C5155b[] bVarArr, C6798l lVar) {
        super(str, bVarArr, lVar);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
        C6496s.h(lVar, "body");
    }

    public void r(Object[] objArr, p pVar, C4464a aVar) {
        C6496s.h(objArr, "args");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        C6496s.h(aVar, "appContext");
        pVar.e(((Number) t().invoke(b(objArr, aVar))).floatValue());
    }
}
