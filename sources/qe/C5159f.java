package qe;

import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JavaScriptTypedArray;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import pe.j;

/* renamed from: qe.f  reason: case insensitive filesystem */
public abstract class C5159f extends S {
    public C5159f(boolean z10) {
        super(z10);
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.TYPED_ARRAY);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: e */
    public j d(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        return f((JavaScriptTypedArray) obj);
    }

    public abstract j f(JavaScriptTypedArray javaScriptTypedArray);
}
