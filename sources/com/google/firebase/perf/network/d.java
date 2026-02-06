package com.google.firebase.perf.network;

import Ac.l;
import java.io.IOException;
import rh.C;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.v;
import vc.h;
import zc.C5313k;

public class d implements C6709f {

    /* renamed from: a  reason: collision with root package name */
    private final C6709f f57731a;

    /* renamed from: b  reason: collision with root package name */
    private final h f57732b;

    /* renamed from: c  reason: collision with root package name */
    private final l f57733c;

    /* renamed from: d  reason: collision with root package name */
    private final long f57734d;

    public d(C6709f fVar, C5313k kVar, l lVar, long j10) {
        this.f57731a = fVar;
        this.f57732b = h.c(kVar);
        this.f57734d = j10;
        this.f57733c = lVar;
    }

    public void onFailure(C6708e eVar, IOException iOException) {
        C request = eVar.request();
        if (request != null) {
            v l10 = request.l();
            if (l10 != null) {
                this.f57732b.F(l10.u().toString());
            }
            if (request.h() != null) {
                this.f57732b.l(request.h());
            }
        }
        this.f57732b.s(this.f57734d);
        this.f57732b.y(this.f57733c.c());
        xc.d.d(this.f57732b);
        this.f57731a.onFailure(eVar, iOException);
    }

    public void onResponse(C6708e eVar, E e10) {
        E e11 = e10;
        FirebasePerfOkHttpClient.a(e11, this.f57732b, this.f57734d, this.f57733c.c());
        this.f57731a.onResponse(eVar, e10);
    }
}
