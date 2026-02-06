package com.google.protobuf;

import com.google.protobuf.C4881t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class E extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    private static final E f58384b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f58385a = true;

    static {
        E e10 = new E();
        f58384b = e10;
        e10.o();
    }

    private E() {
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
            return C4881t.d((byte[]) obj);
        }
        if (!(obj instanceof C4881t.a)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void e(Map map) {
        for (Object next : map.keySet()) {
            C4881t.a(next);
            C4881t.a(map.get(next));
        }
    }

    public static E g() {
        return f58384b;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.E.k(java.util.Map, java.util.Map):boolean");
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
        return this.f58385a;
    }

    public void o() {
        this.f58385a = false;
    }

    public void p(E e10) {
        i();
        if (!e10.isEmpty()) {
            putAll(e10);
        }
    }

    public Object put(Object obj, Object obj2) {
        i();
        C4881t.a(obj);
        C4881t.a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        i();
        e(map);
        super.putAll(map);
    }

    public E q() {
        if (isEmpty()) {
            return new E();
        }
        return new E(this);
    }

    public Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private E(Map map) {
        super(map);
    }
}
