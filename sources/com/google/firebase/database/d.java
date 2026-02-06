package com.google.firebase.database;

import Hb.g;
import Hb.n;
import Lb.B;
import Lb.C4374h;
import Lb.q;
import ic.C5026a;
import java.util.HashMap;
import java.util.Map;
import ub.C5230g;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map f57138a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C5230g f57139b;

    /* renamed from: c  reason: collision with root package name */
    private final B f57140c;

    /* renamed from: d  reason: collision with root package name */
    private final B f57141d;

    d(C5230g gVar, C5026a aVar, C5026a aVar2) {
        this.f57139b = gVar;
        this.f57140c = new n(aVar);
        this.f57141d = new g(aVar2);
    }

    /* access modifiers changed from: package-private */
    public synchronized c a(q qVar) {
        c cVar;
        try {
            cVar = (c) this.f57138a.get(qVar);
            if (cVar == null) {
                C4374h hVar = new C4374h();
                if (!this.f57139b.y()) {
                    hVar.O(this.f57139b.q());
                }
                hVar.K(this.f57139b);
                hVar.J(this.f57140c);
                hVar.I(this.f57141d);
                c cVar2 = new c(this.f57139b, qVar, hVar);
                this.f57138a.put(qVar, cVar2);
                cVar = cVar2;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return cVar;
    }
}
