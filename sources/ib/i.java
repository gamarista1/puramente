package Ib;

import Ib.h;

public class i extends j {
    i(Object obj, Object obj2) {
        super(obj, obj2, g.a(), g.a());
    }

    /* access modifiers changed from: protected */
    public j d(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (hVar == null) {
            hVar = b();
        }
        if (hVar2 == null) {
            hVar2 = o();
        }
        return new i(obj, obj2, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    public h.a f() {
        return h.a.RED;
    }

    public boolean q() {
        return true;
    }

    public int size() {
        return b().size() + 1 + o().size();
    }

    i(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
    }
}
