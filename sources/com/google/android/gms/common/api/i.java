package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C4503o;
import com.google.android.gms.common.api.internal.C4509v;
import com.google.android.gms.common.internal.C4536s;

public abstract class i {
    public static h a(k kVar, f fVar) {
        C4536s.m(kVar, "Result must not be null");
        C4536s.b(!kVar.getStatus().s0(), "Status code must not be SUCCESS");
        r rVar = new r(fVar, kVar);
        rVar.setResult(kVar);
        return rVar;
    }

    public static g b(k kVar, f fVar) {
        C4536s.m(kVar, "Result must not be null");
        s sVar = new s(fVar);
        sVar.setResult(kVar);
        return new C4503o(sVar);
    }

    public static h c(Status status, f fVar) {
        C4536s.m(status, "Result must not be null");
        C4509v vVar = new C4509v(fVar);
        vVar.setResult(status);
        return vVar;
    }
}
