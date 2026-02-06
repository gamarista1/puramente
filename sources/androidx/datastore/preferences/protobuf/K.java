package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import java.util.Map;

class K implements J {
    K() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        I i11 = (I) obj;
        H h10 = (H) obj2;
        int i12 = 0;
        if (i11.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : i11.entrySet()) {
            i12 += h10.a(i10, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    private static I j(Object obj, Object obj2) {
        I i10 = (I) obj;
        I i11 = (I) obj2;
        if (!i11.isEmpty()) {
            if (!i10.l()) {
                i10 = i10.q();
            }
            i10.p(i11);
        }
        return i10;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public H.a b(Object obj) {
        return ((H) obj).c();
    }

    public Map c(Object obj) {
        return (I) obj;
    }

    public Object d(Object obj) {
        ((I) obj).o();
        return obj;
    }

    public int e(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public Map f(Object obj) {
        return (I) obj;
    }

    public Object g(Object obj) {
        return I.g().q();
    }

    public boolean h(Object obj) {
        return !((I) obj).l();
    }
}
