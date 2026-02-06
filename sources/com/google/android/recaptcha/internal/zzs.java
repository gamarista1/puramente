package com.google.android.recaptcha.internal;

import Ug.K;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzs extends l implements p {
    zzs(C6658d dVar) {
        super(2, dVar);
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzs(dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        K k10 = (K) obj;
        return new zzs((C6658d) obj2).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        Thread.currentThread().setPriority(8);
        return C6514M.f71813a;
    }
}
