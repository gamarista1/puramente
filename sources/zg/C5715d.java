package Zg;

import yf.p;

/* renamed from: Zg.d  reason: case insensitive filesystem */
public abstract class C5715d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final G f66970a = new G("CLOSED");

    public static final C5716e b(C5716e eVar) {
        while (true) {
            Object a10 = eVar.g();
            if (a10 == f66970a) {
                return eVar;
            }
            C5716e eVar2 = (C5716e) a10;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.m()) {
                return eVar;
            }
        }
    }

    public static final Object c(D d10, long j10, p pVar) {
        while (true) {
            if (d10.f66948c >= j10 && !d10.k()) {
                return E.a(d10);
            }
            Object a10 = d10.g();
            if (a10 == f66970a) {
                return E.a(f66970a);
            }
            D d11 = (D) ((C5716e) a10);
            if (d11 == null) {
                d11 = (D) pVar.invoke(Long.valueOf(d10.f66948c + 1), d10);
                if (d10.o(d11)) {
                    if (d10.k()) {
                        d10.n();
                    }
                }
            }
            d10 = d11;
        }
    }
}
