package com.google.firebase.functions;

import java.util.HashMap;
import java.util.Map;

class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map f57261a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f57262b;

    interface a {
        n a(String str);
    }

    s(a aVar) {
        this.f57262b = aVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized n a(String str) {
        n nVar;
        nVar = (n) this.f57261a.get(str);
        if (nVar == null) {
            nVar = this.f57262b.a(str);
            this.f57261a.put(str, nVar);
        }
        return nVar;
    }
}
