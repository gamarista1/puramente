package com.amazon.a.a.c;

import com.amazon.a.a.o.a.a;
import com.amazon.a.a.o.c;
import java.util.HashMap;
import java.util.Map;

public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37152a = new c("EventManagerImpl");

    /* renamed from: b  reason: collision with root package name */
    private final Map<b, e<?>> f37153b = new HashMap();

    public <T extends a> void a(c<T> cVar) {
        a.a((Object) cVar, "listener");
        a.a();
        b a10 = cVar.a();
        c cVar2 = f37152a;
        cVar2.a("Registering listener for event: " + a10 + ", " + cVar);
        e eVar = this.f37153b.get(a10);
        if (eVar == null) {
            eVar = new e();
            this.f37153b.put(a10, eVar);
        }
        eVar.a(cVar);
    }

    public void a(a aVar) {
        b a10 = aVar.a();
        if (c.f37534a) {
            c cVar = f37152a;
            cVar.a("Posting event: " + a10);
        }
        if (this.f37153b.containsKey(a10)) {
            this.f37153b.get(a10).a(aVar);
        } else if (c.f37534a) {
            f37152a.a("No registered listeners, returning");
        }
    }
}
