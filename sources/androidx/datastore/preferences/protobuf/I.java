package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class I extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    private static final I f16278b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f16279a = true;

    static {
        I i10 = new I();
        f16278b = i10;
        i10.o();
    }

    private I() {
    }

    static int a(Map map) {
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i10 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i10;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return C1751y.d((byte[]) obj);
        }
        return obj.hashCode();
    }

    private static void e(Map map) {
        for (Object next : map.keySet()) {
            C1751y.a(next);
            C1751y.a(map.get(next));
        }
    }

    public static I g() {
        return f16278b;
    }

    private void i() {
        if (!l()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean j(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean k(java.util.Map r4, java.util.Map r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = j(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I.k(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        i();
        super.clear();
    }

    public Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map) || !k(this, (Map) obj)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return a(this);
    }

    public boolean l() {
        return this.f16279a;
    }

    public void o() {
        this.f16279a = false;
    }

    public void p(I i10) {
        i();
        if (!i10.isEmpty()) {
            putAll(i10);
        }
    }

    public Object put(Object obj, Object obj2) {
        i();
        C1751y.a(obj);
        C1751y.a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        i();
        e(map);
        super.putAll(map);
    }

    public I q() {
        if (isEmpty()) {
            return new I();
        }
        return new I(this);
    }

    public Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private I(Map map) {
        super(map);
    }
}
