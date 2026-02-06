package qe;

import Ff.p;
import Ff.r;
import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptFunction;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class N extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61394b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N(p pVar) {
        super(pVar.e());
        C6496s.h(pVar, "type");
        this.f61394b = pVar;
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.JS_FUNCTION);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: e */
    public JavaScriptFunction d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        JavaScriptFunction javaScriptFunction = (JavaScriptFunction) obj;
        p c10 = ((r) C6565s.o0(this.f61394b.c())).c();
        if (c10 != null) {
            javaScriptFunction.a(c10);
            return javaScriptFunction;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
