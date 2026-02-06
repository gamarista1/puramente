package com.google.protobuf;

import com.google.protobuf.C4881t;
import java.util.Collections;
import java.util.List;

abstract class A {

    /* renamed from: a  reason: collision with root package name */
    private static final A f58371a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final A f58372b = new c();

    private static final class b extends A {

        /* renamed from: c  reason: collision with root package name */
        private static final Class f58373c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List e(Object obj, long j10) {
            return (List) k0.C(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List f(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = e(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.C4887z
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.y r0 = new com.google.protobuf.y
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.U
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.C4881t.e
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.t$e r0 = (com.google.protobuf.C4881t.e) r0
                com.google.protobuf.t$e r6 = r0.c(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.k0.R(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class r1 = f58373c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.k0.R(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.j0
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.y r1 = new com.google.protobuf.y
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.j0 r0 = (com.google.protobuf.j0) r0
                r1.addAll(r0)
                com.google.protobuf.k0.R(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.U
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.C4881t.e
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.t$e r1 = (com.google.protobuf.C4881t.e) r1
                boolean r2 = r1.o()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.t$e r0 = r1.c(r0)
                com.google.protobuf.k0.R(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A.b.f(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) k0.C(obj, j10);
            if (list instanceof C4887z) {
                obj2 = ((C4887z) list).j();
            } else if (!f58373c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof U) || !(list instanceof C4881t.e)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C4881t.e eVar = (C4881t.e) list;
                    if (eVar.o()) {
                        eVar.l();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            k0.R(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            List e10 = e(obj2, j10);
            List f10 = f(obj, j10, e10.size());
            int size = f10.size();
            int size2 = e10.size();
            if (size > 0 && size2 > 0) {
                f10.addAll(e10);
            }
            if (size > 0) {
                e10 = f10;
            }
            k0.R(obj, j10, e10);
        }
    }

    private static final class c extends A {
        private c() {
            super();
        }

        static C4881t.e e(Object obj, long j10) {
            return (C4881t.e) k0.C(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            e(obj, j10).l();
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            C4881t.e e10 = e(obj, j10);
            C4881t.e e11 = e(obj2, j10);
            int size = e10.size();
            int size2 = e11.size();
            if (size > 0 && size2 > 0) {
                if (!e10.o()) {
                    e10 = e10.c(size2 + size);
                }
                e10.addAll(e11);
            }
            if (size > 0) {
                e11 = e10;
            }
            k0.R(obj, j10, e11);
        }
    }

    static A a() {
        return f58371a;
    }

    static A b() {
        return f58372b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, Object obj2, long j10);

    private A() {
    }
}
