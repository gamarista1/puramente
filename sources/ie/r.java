package ie;

import Od.a;
import ae.C4464a;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.l;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.jvm.internal.C6496s;
import qe.C5155b;
import qe.V;
import yf.C6798l;

public final class r extends C5031a {

    /* renamed from: g  reason: collision with root package name */
    private final V f60844g;

    /* renamed from: h  reason: collision with root package name */
    private final C6798l f60845h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, C5155b[] bVarArr, V v10, C6798l lVar) {
        super(str, bVarArr);
        C6496s.h(str, "name");
        C6496s.h(bVarArr, "argTypes");
        C6496s.h(v10, "returnType");
        C6496s.h(lVar, "body");
        this.f60844g = v10;
        this.f60845h = lVar;
    }

    /* access modifiers changed from: private */
    public static final Object o(r rVar, String str, C4464a aVar, Object[] objArr) {
        CodedException codedException;
        C6496s.h(objArr, "args");
        try {
            return rVar.f60844g.b(rVar.m(objArr, aVar));
        } catch (Throwable th2) {
            if (th2 instanceof CodedException) {
                codedException = (CodedException) th2;
            } else if (th2 instanceof a) {
                a aVar2 = th2;
                String a10 = aVar2.a();
                C6496s.g(a10, "getCode(...)");
                codedException = new CodedException(a10, aVar2.getMessage(), aVar2.getCause());
            } else {
                codedException = new UnexpectedException((Throwable) th2);
            }
            throw new l(rVar.f(), str, codedException);
        }
    }

    public void a(C4464a aVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, String str) {
        C6496s.h(aVar, "appContext");
        C6496s.h(jSDecoratorsBridgingObject, "jsObject");
        C6496s.h(str, "moduleName");
        jSDecoratorsBridgingObject.registerSyncFunction(f(), h(), i(), (ExpectedType[]) d().toArray(new ExpectedType[0]), n(str, aVar));
    }

    public final Object m(Object[] objArr, C4464a aVar) {
        C6496s.h(objArr, "args");
        return this.f60845h.invoke(b(objArr, aVar));
    }

    public final JNIFunctionBody n(String str, C4464a aVar) {
        C6496s.h(str, "moduleName");
        return new q(this, str, aVar);
    }
}
