package u3;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final u f26659a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f26660b;

    public m(u uVar) {
        C6496s.h(uVar, "database");
        this.f26659a = uVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        C6496s.g(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f26660b = newSetFromMap;
    }
}
