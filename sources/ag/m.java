package ag;

import Eg.h;
import Of.C5495m;
import Of.m0;
import Pg.a;
import bg.c0;
import eg.y;
import eg.z;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public final class m implements p {

    /* renamed from: a  reason: collision with root package name */
    private final k f67083a;

    /* renamed from: b  reason: collision with root package name */
    private final C5495m f67084b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67085c;

    /* renamed from: d  reason: collision with root package name */
    private final Map f67086d;

    /* renamed from: e  reason: collision with root package name */
    private final h f67087e;

    public m(k kVar, C5495m mVar, z zVar, int i10) {
        C6496s.h(kVar, "c");
        C6496s.h(mVar, "containingDeclaration");
        C6496s.h(zVar, "typeParameterOwner");
        this.f67083a = kVar;
        this.f67084b = mVar;
        this.f67085c = i10;
        this.f67086d = a.d(zVar.getTypeParameters());
        this.f67087e = kVar.e().c(new l(this));
    }

    /* access modifiers changed from: private */
    public static final c0 c(m mVar, y yVar) {
        C6496s.h(yVar, "typeParameter");
        Integer num = (Integer) mVar.f67086d.get(yVar);
        if (num == null) {
            return null;
        }
        return new c0(c.k(c.d(mVar.f67083a, mVar), mVar.f67084b.getAnnotations()), yVar, mVar.f67085c + num.intValue(), mVar.f67084b);
    }

    public m0 a(y yVar) {
        C6496s.h(yVar, "javaTypeParameter");
        c0 c0Var = (c0) this.f67087e.invoke(yVar);
        if (c0Var != null) {
            return c0Var;
        }
        return this.f67083a.f().a(yVar);
    }
}
