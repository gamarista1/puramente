package com.margelo.nitro.core;

import com.margelo.nitro.core.Promise;
import kotlin.jvm.internal.C6491m;
import kotlin.jvm.internal.C6496s;
import lf.C6525i;
import yf.C6798l;

final /* synthetic */ class d implements Promise.OnRejectedCallback, C6491m {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C6798l f59151a;

    d(C6798l lVar) {
        C6496s.h(lVar, "function");
        this.f59151a = lVar;
    }

    public final C6525i d() {
        return this.f59151a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Promise.OnRejectedCallback) || !(obj instanceof C6491m)) {
            return false;
        }
        return C6496s.c(d(), ((C6491m) obj).d());
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final /* synthetic */ void onRejected(Throwable th2) {
        this.f59151a.invoke(th2);
    }
}
