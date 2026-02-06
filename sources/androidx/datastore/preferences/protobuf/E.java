package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1751y;
import java.util.Collections;
import java.util.List;

abstract class E {

    /* renamed from: a  reason: collision with root package name */
    private static final E f16265a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final E f16266b = new c();

    private static final class b extends E {

        /* renamed from: c  reason: collision with root package name */
        private static final Class f16267c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) p0.A(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.C} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.C} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.C} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.D
                if (r1 == 0) goto L_0x0014
                androidx.datastore.preferences.protobuf.C r0 = new androidx.datastore.preferences.protobuf.C
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.Y
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C1751y.b
                if (r1 == 0) goto L_0x0024
                androidx.datastore.preferences.protobuf.y$b r0 = (androidx.datastore.preferences.protobuf.C1751y.b) r0
                androidx.datastore.preferences.protobuf.y$b r6 = r0.c(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                androidx.datastore.preferences.protobuf.p0.O(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class r1 = f16267c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.p0.O(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.o0
                if (r1 == 0) goto L_0x0062
                androidx.datastore.preferences.protobuf.C r1 = new androidx.datastore.preferences.protobuf.C
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                androidx.datastore.preferences.protobuf.o0 r0 = (androidx.datastore.preferences.protobuf.o0) r0
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.p0.O(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.Y
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C1751y.b
                if (r1 == 0) goto L_0x007f
                r1 = r0
                androidx.datastore.preferences.protobuf.y$b r1 = (androidx.datastore.preferences.protobuf.C1751y.b) r1
                boolean r2 = r1.o()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                androidx.datastore.preferences.protobuf.y$b r0 = r1.c(r0)
                androidx.datastore.preferences.protobuf.p0.O(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.E.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) p0.A(obj, j10);
            if (list instanceof D) {
                obj2 = ((D) list).j();
            } else if (!f16267c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof Y) || !(list instanceof C1751y.b)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C1751y.b bVar = (C1751y.b) list;
                    if (bVar.o()) {
                        bVar.l();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            p0.O(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            p0.O(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends E {
        private c() {
            super();
        }

        static C1751y.b f(Object obj, long j10) {
            return (C1751y.b) p0.A(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).l();
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            C1751y.b f10 = f(obj, j10);
            C1751y.b f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.o()) {
                    f10 = f10.c(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            p0.O(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            int i10;
            C1751y.b f10 = f(obj, j10);
            if (f10.o()) {
                return f10;
            }
            int size = f10.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            C1751y.b c10 = f10.c(i10);
            p0.O(obj, j10, c10);
            return c10;
        }
    }

    static E a() {
        return f16265a;
    }

    static E b() {
        return f16266b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract List e(Object obj, long j10);

    private E() {
    }
}
