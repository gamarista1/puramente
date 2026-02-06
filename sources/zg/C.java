package Zg;

import Ug.C5556a;
import Ug.E;
import kotlin.coroutines.jvm.internal.e;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

public class C extends C5556a implements e {

    /* renamed from: d  reason: collision with root package name */
    public final C6658d f66946d;

    public C(g gVar, C6658d dVar) {
        super(gVar, true, true);
        this.f66946d = dVar;
    }

    /* access modifiers changed from: protected */
    public void A(Object obj) {
        C5723l.c(C6680b.c(this.f66946d), E.a(obj, this.f66946d), (C6798l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void c1(Object obj) {
        C6658d dVar = this.f66946d;
        dVar.resumeWith(E.a(obj, dVar));
    }

    public final e getCallerFrame() {
        C6658d dVar = this.f66946d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean u0() {
        return true;
    }
}
