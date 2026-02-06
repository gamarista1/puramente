package com.google.firebase.storage;

import ic.C5027b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import ub.C5230g;

/* renamed from: com.google.firebase.storage.f  reason: case insensitive filesystem */
class C4850f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f58068a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C5230g f58069b;

    /* renamed from: c  reason: collision with root package name */
    private final C5027b f58070c;

    /* renamed from: d  reason: collision with root package name */
    private final C5027b f58071d;

    C4850f(C5230g gVar, C5027b bVar, C5027b bVar2, Executor executor, Executor executor2) {
        this.f58069b = gVar;
        this.f58070c = bVar;
        this.f58071d = bVar2;
        F.d(executor, executor2);
    }

    /* access modifiers changed from: package-private */
    public synchronized C4849e a(String str) {
        C4849e eVar;
        eVar = (C4849e) this.f58068a.get(str);
        if (eVar == null) {
            eVar = new C4849e(str, this.f58069b, this.f58070c, this.f58071d);
            this.f58068a.put(str, eVar);
        }
        return eVar;
    }
}
