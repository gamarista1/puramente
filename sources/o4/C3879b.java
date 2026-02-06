package o4;

import Ug.C5584o;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import rf.C6680b;
import rh.C6708e;

/* renamed from: o4.b  reason: case insensitive filesystem */
public abstract class C3879b {
    public static final Object a(C6708e eVar, C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        s sVar = new s(eVar, oVar);
        FirebasePerfOkHttpClient.enqueue(eVar, sVar);
        oVar.s(sVar);
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        return v10;
    }
}
