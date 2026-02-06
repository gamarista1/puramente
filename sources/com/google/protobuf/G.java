package com.google.protobuf;

import com.google.protobuf.D;
import java.util.Map;

class G implements F {
    G() {
    }

    private static int f(int i10, Object obj, Object obj2) {
        E e10 = (E) obj;
        D d10 = (D) obj2;
        int i11 = 0;
        if (e10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : e10.entrySet()) {
            i11 += d10.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static E g(Object obj, Object obj2) {
        E e10 = (E) obj;
        E e11 = (E) obj2;
        if (!e11.isEmpty()) {
            if (!e10.l()) {
                e10 = e10.q();
            }
            e10.p(e11);
        }
        return e10;
    }

    public Object a(Object obj, Object obj2) {
        return g(obj, obj2);
    }

    public D.a b(Object obj) {
        return ((D) obj).c();
    }

    public Map c(Object obj) {
        return (E) obj;
    }

    public Object d(Object obj) {
        ((E) obj).o();
        return obj;
    }

    public int e(int i10, Object obj, Object obj2) {
        return f(i10, obj, obj2);
    }
}
