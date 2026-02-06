package ie;

import ae.C4464a;
import ae.p;
import com.facebook.react.bridge.BaseJavaModule;
import kotlin.jvm.internal.C6496s;
import qe.C5155b;
import yf.C6798l;

/* renamed from: ie.f  reason: case insensitive filesystem */
public class C5036f extends C5034d {

    /* renamed from: h  reason: collision with root package name */
    private final C6798l f60818h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5036f(String str, C5155b[] bVarArr, C6798l lVar) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "desiredArgsTypes");
        C6496s.h(lVar, "body");
        this.f60818h = lVar;
    }

    public void r(Object[] objArr, p pVar, C4464a aVar) {
        C6496s.h(objArr, "args");
        C6496s.h(pVar, BaseJavaModule.METHOD_TYPE_PROMISE);
        C6496s.h(aVar, "appContext");
        pVar.resolve(this.f60818h.invoke(b(objArr, aVar)));
    }

    /* access modifiers changed from: protected */
    public final C6798l t() {
        return this.f60818h;
    }
}
