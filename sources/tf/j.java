package Tf;

import Bg.C5336w;
import Of.C5484b;
import Of.C5487e;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class j implements C5336w {

    /* renamed from: b  reason: collision with root package name */
    public static final j f65161b = new j();

    private j() {
    }

    public void a(C5484b bVar) {
        C6496s.h(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    public void b(C5487e eVar, List list) {
        C6496s.h(eVar, "descriptor");
        C6496s.h(list, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + list);
    }
}
