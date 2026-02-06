package com.google.firebase.perf.network;

import Ac.l;
import androidx.annotation.Keep;
import java.io.IOException;
import rh.C;
import rh.C6708e;
import rh.C6709f;
import rh.E;
import rh.F;
import rh.v;
import rh.y;
import vc.h;
import xc.d;
import zc.C5313k;

public class FirebasePerfOkHttpClient {
    static void a(E e10, h hVar, long j10, long j11) {
        C g02 = e10.g0();
        if (g02 != null) {
            hVar.F(g02.l().u().toString());
            hVar.l(g02.h());
            if (g02.a() != null) {
                long contentLength = g02.a().contentLength();
                if (contentLength != -1) {
                    hVar.q(contentLength);
                }
            }
            F a10 = e10.a();
            if (a10 != null) {
                long o10 = a10.o();
                if (o10 != -1) {
                    hVar.v(o10);
                }
                y q10 = a10.q();
                if (q10 != null) {
                    hVar.u(q10.toString());
                }
            }
            hVar.n(e10.o());
            hVar.s(j10);
            hVar.y(j11);
            hVar.b();
        }
    }

    @Keep
    public static void enqueue(C6708e eVar, C6709f fVar) {
        l lVar = new l();
        C6709f fVar2 = fVar;
        eVar.f0(new d(fVar2, C5313k.k(), lVar, lVar.e()));
    }

    @Keep
    public static E execute(C6708e eVar) {
        h c10 = h.c(C5313k.k());
        l lVar = new l();
        long e10 = lVar.e();
        try {
            E b10 = eVar.b();
            a(b10, c10, e10, lVar.c());
            return b10;
        } catch (IOException e11) {
            C request = eVar.request();
            if (request != null) {
                v l10 = request.l();
                if (l10 != null) {
                    c10.F(l10.u().toString());
                }
                if (request.h() != null) {
                    c10.l(request.h());
                }
            }
            c10.s(e10);
            c10.y(lVar.c());
            d.d(c10);
            throw e11;
        }
    }
}
