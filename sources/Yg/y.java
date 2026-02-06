package Yg;

import kotlin.coroutines.jvm.internal.e;
import qf.C6658d;
import qf.g;

final class y implements C6658d, e {

    /* renamed from: a  reason: collision with root package name */
    private final C6658d f66863a;

    /* renamed from: b  reason: collision with root package name */
    private final g f66864b;

    public y(C6658d dVar, g gVar) {
        this.f66863a = dVar;
        this.f66864b = gVar;
    }

    public e getCallerFrame() {
        C6658d dVar = this.f66863a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f66864b;
    }

    public void resumeWith(Object obj) {
        this.f66863a.resumeWith(obj);
    }
}
