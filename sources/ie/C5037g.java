package ie;

import ae.C4464a;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.jvm.internal.C6496s;
import qe.C5155b;
import yf.p;

/* renamed from: ie.g  reason: case insensitive filesystem */
public final class C5037g extends C5034d {

    /* renamed from: h  reason: collision with root package name */
    private final p f60819h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5037g(String str, C5155b[] bVarArr, p pVar) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
        C6496s.h(pVar, "body");
        this.f60819h = pVar;
    }

    public void r(Object[] objArr, ae.p pVar, C4464a aVar) {
        C6496s.h(objArr, "args");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        C6496s.h(aVar, "appContext");
        this.f60819h.invoke(b(objArr, aVar), pVar);
    }
}
