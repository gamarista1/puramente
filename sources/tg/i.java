package tg;

import Fg.C5366d0;
import Fg.S;
import Lf.l;
import Of.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f73558a = new i();

    private i() {
    }

    private final C6736b c(List list, H h10, l lVar) {
        ArrayList arrayList = new ArrayList();
        for (Object f10 : C6565s.e1(list)) {
            g f11 = f(this, f10, (H) null, 2, (Object) null);
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        if (h10 == null) {
            return new C6736b(arrayList, new h(lVar));
        }
        C5366d0 O10 = h10.m().O(lVar);
        C6496s.g(O10, "getPrimitiveArrayKotlinType(...)");
        return new z(arrayList, O10);
    }

    /* access modifiers changed from: private */
    public static final S d(l lVar, H h10) {
        C6496s.h(h10, "it");
        C5366d0 O10 = h10.m().O(lVar);
        C6496s.g(O10, "getPrimitiveArrayKotlinType(...)");
        return O10;
    }

    public static /* synthetic */ g f(i iVar, Object obj, H h10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h10 = null;
        }
        return iVar.e(obj, h10);
    }

    public final C6736b b(List list, S s10) {
        C6496s.h(list, "value");
        C6496s.h(s10, "type");
        return new z(list, s10);
    }

    public final g e(Object obj, H h10) {
        if (obj instanceof Byte) {
            return new C6738d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C6739e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C6737c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(C6559l.h1((byte[]) obj), h10, l.BYTE);
        }
        if (obj instanceof short[]) {
            return c(C6559l.o1((short[]) obj), h10, l.SHORT);
        }
        if (obj instanceof int[]) {
            return c(C6559l.l1((int[]) obj), h10, l.INT);
        }
        if (obj instanceof long[]) {
            return c(C6559l.m1((long[]) obj), h10, l.LONG);
        }
        if (obj instanceof char[]) {
            return c(C6559l.i1((char[]) obj), h10, l.CHAR);
        }
        if (obj instanceof float[]) {
            return c(C6559l.k1((float[]) obj), h10, l.FLOAT);
        }
        if (obj instanceof double[]) {
            return c(C6559l.j1((double[]) obj), h10, l.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return c(C6559l.p1((boolean[]) obj), h10, l.BOOLEAN);
        }
        if (obj == null) {
            return new u();
        }
        return null;
    }
}
