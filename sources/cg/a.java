package Cg;

import Sg.p;
import kotlin.jvm.internal.C6496s;
import ng.c;

public final class a extends Ag.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f62633r = new a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a() {
        /*
            r18 = this;
            r0 = r18
            pg.g r2 = pg.C6645g.d()
            r1 = r2
            jg.C6430b.a(r2)
            java.lang.String r3 = "apply(...)"
            kotlin.jvm.internal.C6496s.g(r2, r3)
            pg.i$f r3 = jg.C6430b.f71507a
            r2 = r3
            java.lang.String r4 = "packageFqName"
            kotlin.jvm.internal.C6496s.g(r3, r4)
            pg.i$f r4 = jg.C6430b.f71509c
            r3 = r4
            java.lang.String r5 = "constructorAnnotation"
            kotlin.jvm.internal.C6496s.g(r4, r5)
            pg.i$f r5 = jg.C6430b.f71508b
            r4 = r5
            java.lang.String r6 = "classAnnotation"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            pg.i$f r6 = jg.C6430b.f71510d
            r5 = r6
            java.lang.String r7 = "functionAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r7)
            pg.i$f r6 = jg.C6430b.f71511e
            r7 = r6
            java.lang.String r8 = "propertyAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r8)
            pg.i$f r6 = jg.C6430b.f71512f
            r8 = r6
            java.lang.String r9 = "propertyGetterAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r9)
            pg.i$f r6 = jg.C6430b.f71513g
            r9 = r6
            java.lang.String r10 = "propertySetterAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            pg.i$f r6 = jg.C6430b.f71515i
            r13 = r6
            java.lang.String r10 = "enumEntryAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            pg.i$f r6 = jg.C6430b.f71514h
            r14 = r6
            java.lang.String r10 = "compileTimeValue"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            pg.i$f r6 = jg.C6430b.f71516j
            r15 = r6
            java.lang.String r10 = "parameterAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            pg.i$f r6 = jg.C6430b.f71517k
            r16 = r6
            java.lang.String r10 = "typeAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            pg.i$f r6 = jg.C6430b.f71518l
            r17 = r6
            java.lang.String r10 = "typeParameterAnnotation"
            kotlin.jvm.internal.C6496s.g(r6, r10)
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cg.a.<init>():void");
    }

    private final String s(c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String b10 = cVar.g().b();
        C6496s.g(b10, "asString(...)");
        return b10;
    }

    public final String q(c cVar) {
        C6496s.h(cVar, "fqName");
        return s(cVar) + ".kotlin_builtins";
    }

    public final String r(c cVar) {
        C6496s.h(cVar, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String b10 = cVar.b();
        C6496s.g(b10, "asString(...)");
        sb2.append(p.C(b10, '.', '/', false, 4, (Object) null));
        sb2.append('/');
        sb2.append(q(cVar));
        return sb2.toString();
    }
}
