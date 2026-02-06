package mh;

import gh.C5977a;
import kotlin.jvm.internal.C6496s;
import lh.C6538b;
import lh.v;

public abstract class b0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: mh.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: mh.I} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: mh.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: mh.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: mh.M} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: mh.M} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(lh.C6538b r8, lh.i r9, gh.C5977a r10) {
        /*
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            boolean r0 = r9 instanceof lh.v
            if (r0 == 0) goto L_0x0023
            mh.M r0 = new mh.M
            r3 = r9
            lh.v r3 = (lh.v) r3
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0044
        L_0x0023:
            boolean r0 = r9 instanceof lh.C6539c
            if (r0 == 0) goto L_0x002f
            mh.O r0 = new mh.O
            lh.c r9 = (lh.C6539c) r9
            r0.<init>(r8, r9)
            goto L_0x0044
        L_0x002f:
            boolean r0 = r9 instanceof lh.p
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x003b
        L_0x0035:
            lh.t r0 = lh.t.INSTANCE
            boolean r0 = kotlin.jvm.internal.C6496s.c(r9, r0)
        L_0x003b:
            if (r0 == 0) goto L_0x0049
            mh.I r0 = new mh.I
            lh.x r9 = (lh.x) r9
            r0.<init>(r8, r9)
        L_0x0044:
            java.lang.Object r8 = r0.n(r10)
            return r8
        L_0x0049:
            lf.s r8 = new lf.s
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.b0.a(lh.b, lh.i, gh.a):java.lang.Object");
    }

    public static final Object b(C6538b bVar, String str, v vVar, C5977a aVar) {
        C6496s.h(bVar, "<this>");
        C6496s.h(str, "discriminator");
        C6496s.h(vVar, "element");
        C6496s.h(aVar, "deserializer");
        return new M(bVar, vVar, str, aVar.getDescriptor()).n(aVar);
    }
}
