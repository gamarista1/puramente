package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C4536s;
import ta.C5203a;
import ta.C5204b;

public final class zzbt implements C5203a {
    public final h getSpatulaHeader(f fVar) {
        C4536s.l(fVar);
        return fVar.b(new zzbs(this, fVar));
    }

    public final h performProxyRequest(f fVar, C5204b bVar) {
        C4536s.l(fVar);
        C4536s.l(bVar);
        return fVar.b(new zzbq(this, fVar, bVar));
    }
}
