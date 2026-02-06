package le;

import ae.C4464a;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import ie.r;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import qe.L;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f61061a;

    /* renamed from: b  reason: collision with root package name */
    private final r f61062b;

    /* renamed from: c  reason: collision with root package name */
    private final r f61063c;

    public h(String str, r rVar, r rVar2) {
        C6496s.h(str, "name");
        this.f61061a = str;
        this.f61062b = rVar;
        this.f61063c = rVar2;
    }

    /* access modifiers changed from: private */
    public static final Object d(h hVar, C4464a aVar, Object[] objArr) {
        C6496s.h(objArr, "args");
        return L.b(L.f61392a, hVar.f61062b.m(objArr, aVar), (L.a) null, false, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final Object e(h hVar, C4464a aVar, Object[] objArr) {
        C6496s.h(objArr, "args");
        hVar.f61063c.m(objArr, aVar);
        return null;
    }

    public final void c(C4464a aVar, JSDecoratorsBridgingObject jSDecoratorsBridgingObject) {
        f fVar;
        boolean z10;
        ExpectedType[] expectedTypeArr;
        boolean z11;
        ExpectedType[] expectedTypeArr2;
        List d10;
        List d11;
        C6496s.h(aVar, "appContext");
        C6496s.h(jSDecoratorsBridgingObject, "jsObject");
        g gVar = null;
        if (this.f61062b != null) {
            fVar = new f(this, aVar);
        } else {
            fVar = null;
        }
        if (this.f61063c != null) {
            gVar = new g(this, aVar);
        }
        g gVar2 = gVar;
        String str = this.f61061a;
        r rVar = this.f61062b;
        if (rVar == null || !rVar.h()) {
            z10 = false;
        } else {
            z10 = true;
        }
        r rVar2 = this.f61062b;
        if (rVar2 == null || (d11 = rVar2.d()) == null || (expectedTypeArr = (ExpectedType[]) d11.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr = new ExpectedType[0];
        }
        ExpectedType[] expectedTypeArr3 = expectedTypeArr;
        r rVar3 = this.f61063c;
        if (rVar3 == null || !rVar3.h()) {
            z11 = false;
        } else {
            z11 = true;
        }
        r rVar4 = this.f61063c;
        if (rVar4 == null || (d10 = rVar4.d()) == null || (expectedTypeArr2 = (ExpectedType[]) d10.toArray(new ExpectedType[0])) == null) {
            expectedTypeArr2 = new ExpectedType[0];
        }
        jSDecoratorsBridgingObject.registerProperty(str, z10, expectedTypeArr3, fVar, z11, expectedTypeArr2, gVar2);
    }
}
