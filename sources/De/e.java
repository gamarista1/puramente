package de;

import Ff.d;
import Ff.g;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.C6496s;
import mf.O;
import xf.C6781a;

public final class e {
    private final C4947a e(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new c(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final Object f(Constructor constructor) {
        return constructor.newInstance((Object[]) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: Ff.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: Ff.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r1 == false) goto L_0x0047;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final de.C4947a g(Ff.d r7) {
        /*
            r6 = this;
            java.util.Collection r7 = r7.j()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L_0x000d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x004c
            java.lang.Object r3 = r7.next()
            r4 = r3
            Ff.g r4 = (Ff.g) r4
            java.util.List r4 = r4.getParameters()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x002e
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0032:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r4.next()
            Ff.k r5 = (Ff.k) r5
            boolean r5 = r5.o()
            if (r5 != 0) goto L_0x0032
            goto L_0x000d
        L_0x0045:
            if (r1 == 0) goto L_0x0049
        L_0x0047:
            r2 = r0
            goto L_0x004f
        L_0x0049:
            r1 = 1
            r2 = r3
            goto L_0x000d
        L_0x004c:
            if (r1 != 0) goto L_0x004f
            goto L_0x0047
        L_0x004f:
            Ff.g r2 = (Ff.g) r2
            if (r2 != 0) goto L_0x0054
            return r0
        L_0x0054:
            de.d r7 = new de.d
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: de.e.g(Ff.d):de.a");
    }

    /* access modifiers changed from: private */
    public static final Object h(g gVar) {
        return gVar.callBy(O.i());
    }

    private final C4947a i(Class cls) {
        return new b(i.f60063a.d(cls));
    }

    /* access modifiers changed from: private */
    public static final Object j(i iVar) {
        return iVar.b();
    }

    public final C4947a d(d dVar) {
        C6496s.h(dVar, "clazz");
        C4947a e10 = e(C6781a.b(dVar));
        if (e10 != null) {
            return e10;
        }
        C4947a g10 = g(dVar);
        if (g10 == null) {
            return i(C6781a.b(dVar));
        }
        return g10;
    }
}
