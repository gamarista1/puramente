package oe;

import Ff.p;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedObject;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import qe.S;

public final class e extends S {

    /* renamed from: b  reason: collision with root package name */
    private final p f61211b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(p pVar) {
        super(pVar.e());
        C6496s.h(pVar, "type");
        this.f61211b = pVar;
    }

    public ExpectedType b() {
        return new ExpectedType(C5052a.SHARED_OBJECT_ID, C5052a.INT);
    }

    public boolean c() {
        return false;
    }

    /* renamed from: e */
    public SharedObject d(Object obj, C4464a aVar) {
        int i10;
        C6496s.h(obj, "value");
        if (obj instanceof Dynamic) {
            i10 = ((Dynamic) obj).asInt();
        } else {
            i10 = ((Integer) obj).intValue();
        }
        int b10 = c.b(i10);
        if (aVar != null) {
            SharedObject f10 = c.f(b10, aVar.o());
            C6496s.f(f10, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedObjectTypeConverter");
            return f10;
        }
        throw new expo.modules.kotlin.exception.e();
    }
}
