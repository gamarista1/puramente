package If;

import If.C5451n;
import Lf.l;
import Lf.o;
import Nf.a;
import Of.C5484b;
import Of.C5507z;
import Of.a0;
import Of.b0;
import Uf.C5553f;
import Xf.H;
import Xf.T;
import gg.C5943C;
import kotlin.jvm.internal.C6496s;
import mg.C6576d;
import ng.b;
import ng.c;
import rg.C6690h;
import vg.C6755e;
import wg.C6769e;

public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final f1 f63674a = new f1();

    /* renamed from: b  reason: collision with root package name */
    private static final b f63675b = b.f72283d.c(new c("java.lang.Void"));

    private f1() {
    }

    private final l a(Class cls) {
        if (cls.isPrimitive()) {
            return C6769e.c(cls.getSimpleName()).i();
        }
        return null;
    }

    private final boolean b(C5507z zVar) {
        if (C6690h.p(zVar) || C6690h.q(zVar)) {
            return true;
        }
        if (!C6496s.c(zVar.getName(), a.f64251e.a()) || !zVar.k().isEmpty()) {
            return false;
        }
        return true;
    }

    private final C5451n.e d(C5507z zVar) {
        return new C5451n.e(new C6576d.b(e(zVar), C5943C.c(zVar, false, false, 1, (Object) null)));
    }

    private final String e(C5484b bVar) {
        String e10 = T.e(bVar);
        if (e10 != null) {
            return e10;
        }
        if (bVar instanceof a0) {
            String b10 = C6755e.w(bVar).getName().b();
            C6496s.g(b10, "asString(...)");
            return H.b(b10);
        } else if (bVar instanceof b0) {
            String b11 = C6755e.w(bVar).getName().b();
            C6496s.g(b11, "asString(...)");
            return H.e(b11);
        } else {
            String b12 = bVar.getName().b();
            C6496s.g(b12, "asString(...)");
            return b12;
        }
    }

    public final b c(Class cls) {
        b m10;
        C6496s.h(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C6496s.g(componentType, "getComponentType(...)");
            l a10 = a(componentType);
            if (a10 != null) {
                return new b(o.f63920A, a10.i());
            }
            b.a aVar = b.f72283d;
            c l10 = o.a.f64011i.l();
            C6496s.g(l10, "toSafe(...)");
            return aVar.c(l10);
        } else if (C6496s.c(cls, Void.TYPE)) {
            return f63675b;
        } else {
            l a11 = a(cls);
            if (a11 != null) {
                return new b(o.f63920A, a11.l());
            }
            b e10 = C5553f.e(cls);
            if (e10.i() || (m10 = Nf.c.f64255a.m(e10.a())) == null) {
                return e10;
            }
            return m10;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: If.n$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final If.C5455p f(Of.Z r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            Of.b r8 = rg.C6691i.L(r8)
            Of.Z r8 = (Of.Z) r8
            Of.Z r1 = r8.a()
            java.lang.String r8 = "getOriginal(...)"
            kotlin.jvm.internal.C6496s.g(r1, r8)
            boolean r8 = r1 instanceof Dg.N
            r0 = 0
            if (r8 == 0) goto L_0x003e
            r8 = r1
            Dg.N r8 = (Dg.N) r8
            ig.n r2 = r8.g0()
            pg.i$f r3 = lg.C6536a.f71858d
            java.lang.String r4 = "propertySignature"
            kotlin.jvm.internal.C6496s.g(r3, r4)
            java.lang.Object r3 = kg.e.a(r2, r3)
            lg.a$d r3 = (lg.C6536a.d) r3
            if (r3 == 0) goto L_0x00c8
            If.p$c r6 = new If.p$c
            kg.c r4 = r8.K()
            kg.g r5 = r8.F()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003e:
            boolean r8 = r1 instanceof Zf.f
            if (r8 == 0) goto L_0x00c8
            r8 = r1
            Zf.f r8 = (Zf.f) r8
            Of.h0 r2 = r8.i()
            boolean r3 = r2 instanceof dg.C5815a
            if (r3 == 0) goto L_0x0050
            dg.a r2 = (dg.C5815a) r2
            goto L_0x0051
        L_0x0050:
            r2 = r0
        L_0x0051:
            if (r2 == 0) goto L_0x0058
            eg.l r2 = r2.c()
            goto L_0x0059
        L_0x0058:
            r2 = r0
        L_0x0059:
            boolean r3 = r2 instanceof Uf.w
            if (r3 == 0) goto L_0x0069
            If.p$a r8 = new If.p$a
            Uf.w r2 = (Uf.w) r2
            java.lang.reflect.Field r0 = r2.S()
            r8.<init>(r0)
            goto L_0x00a3
        L_0x0069:
            boolean r3 = r2 instanceof Uf.z
            if (r3 == 0) goto L_0x00a4
            If.p$b r1 = new If.p$b
            Uf.z r2 = (Uf.z) r2
            java.lang.reflect.Method r2 = r2.S()
            Of.b0 r8 = r8.g()
            if (r8 == 0) goto L_0x0080
            Of.h0 r8 = r8.i()
            goto L_0x0081
        L_0x0080:
            r8 = r0
        L_0x0081:
            boolean r3 = r8 instanceof dg.C5815a
            if (r3 == 0) goto L_0x0088
            dg.a r8 = (dg.C5815a) r8
            goto L_0x0089
        L_0x0088:
            r8 = r0
        L_0x0089:
            if (r8 == 0) goto L_0x0090
            eg.l r8 = r8.c()
            goto L_0x0091
        L_0x0090:
            r8 = r0
        L_0x0091:
            boolean r3 = r8 instanceof Uf.z
            if (r3 == 0) goto L_0x0098
            Uf.z r8 = (Uf.z) r8
            goto L_0x0099
        L_0x0098:
            r8 = r0
        L_0x0099:
            if (r8 == 0) goto L_0x009f
            java.lang.reflect.Method r0 = r8.S()
        L_0x009f:
            r1.<init>(r2, r0)
            r8 = r1
        L_0x00a3:
            return r8
        L_0x00a4:
            If.Y0 r8 = new If.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " (source = "
            r0.append(r1)
            r0.append(r2)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00c8:
            Of.a0 r8 = r1.d()
            kotlin.jvm.internal.C6496s.e(r8)
            If.n$e r8 = r7.d(r8)
            Of.b0 r1 = r1.g()
            if (r1 == 0) goto L_0x00dd
            If.n$e r0 = r7.d(r1)
        L_0x00dd:
            If.p$d r1 = new If.p$d
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: If.f1.f(Of.Z):If.p");
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [eg.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final If.C5451n g(Of.C5507z r9) {
        /*
            r8 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            Of.b r0 = rg.C6691i.L(r9)
            Of.z r0 = (Of.C5507z) r0
            Of.z r0 = r0.a()
            java.lang.String r1 = "getOriginal(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            boolean r1 = r0 instanceof Dg.C5341b
            r2 = 0
            if (r1 == 0) goto L_0x0141
            r1 = r0
            Dg.t r1 = (Dg.C5358t) r1
            pg.p r3 = r1.g0()
            boolean r4 = r3 instanceof ig.i
            if (r4 == 0) goto L_0x003d
            mg.i r4 = mg.C6581i.f72110a
            r5 = r3
            ig.i r5 = (ig.i) r5
            kg.c r6 = r1.K()
            kg.g r7 = r1.F()
            mg.d$b r4 = r4.e(r5, r6, r7)
            if (r4 == 0) goto L_0x003d
            If.n$e r9 = new If.n$e
            r9.<init>(r4)
            return r9
        L_0x003d:
            boolean r4 = r3 instanceof ig.d
            if (r4 == 0) goto L_0x013c
            mg.i r4 = mg.C6581i.f72110a
            ig.d r3 = (ig.d) r3
            kg.c r5 = r1.K()
            kg.g r1 = r1.F()
            mg.d$b r1 = r4.b(r3, r5, r1)
            if (r1 == 0) goto L_0x013c
            Of.m r0 = r9.b()
            java.lang.String r3 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C6496s.g(r0, r3)
            boolean r0 = rg.C6693k.b(r0)
            if (r0 == 0) goto L_0x0069
            If.n$e r9 = new If.n$e
            r9.<init>(r1)
            goto L_0x013b
        L_0x0069:
            Of.m r0 = r9.b()
            kotlin.jvm.internal.C6496s.g(r0, r3)
            boolean r0 = rg.C6693k.d(r0)
            if (r0 == 0) goto L_0x0136
            Of.l r9 = (Of.C5494l) r9
            boolean r0 = r9.d0()
            java.lang.String r3 = ")V"
            java.lang.String r4 = "constructor-impl"
            java.lang.String r5 = "Invalid signature: "
            r6 = 2
            r7 = 0
            if (r0 == 0) goto L_0x00b4
            java.lang.String r9 = r1.e()
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r4)
            if (r9 == 0) goto L_0x009b
            java.lang.String r9 = r1.d()
            boolean r9 = Sg.p.u(r9, r3, r7, r6, r2)
            if (r9 == 0) goto L_0x009b
            goto L_0x00fe
        L_0x009b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x00b4:
            java.lang.String r0 = r1.e()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r4)
            if (r0 == 0) goto L_0x011d
            Of.e r9 = r9.e0()
            java.lang.String r0 = "getConstructedClass(...)"
            kotlin.jvm.internal.C6496s.g(r9, r0)
            java.lang.String r9 = Jf.o.u(r9)
            java.lang.String r0 = r1.d()
            boolean r0 = Sg.p.u(r0, r3, r7, r6, r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r1.d()
            java.lang.String r4 = "V"
            java.lang.String r3 = Sg.p.w0(r3, r4)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r0 = 1
            mg.d$b r1 = mg.C6576d.b.c(r1, r2, r9, r0, r2)
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r0 = r1.d()
            boolean r9 = Sg.p.u(r0, r9, r7, r6, r2)
            if (r9 == 0) goto L_0x0104
        L_0x00fe:
            If.n$e r9 = new If.n$e
            r9.<init>(r1)
            goto L_0x013b
        L_0x0104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x011d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x0136:
            If.n$d r9 = new If.n$d
            r9.<init>(r1)
        L_0x013b:
            return r9
        L_0x013c:
            If.n$e r9 = r8.d(r0)
            return r9
        L_0x0141:
            boolean r9 = r0 instanceof Zf.e
            if (r9 == 0) goto L_0x0188
            r9 = r0
            Zf.e r9 = (Zf.e) r9
            Of.h0 r9 = r9.i()
            boolean r1 = r9 instanceof dg.C5815a
            if (r1 == 0) goto L_0x0153
            dg.a r9 = (dg.C5815a) r9
            goto L_0x0154
        L_0x0153:
            r9 = r2
        L_0x0154:
            if (r9 == 0) goto L_0x015b
            eg.l r9 = r9.c()
            goto L_0x015c
        L_0x015b:
            r9 = r2
        L_0x015c:
            boolean r1 = r9 instanceof Uf.z
            if (r1 == 0) goto L_0x0163
            r2 = r9
            Uf.z r2 = (Uf.z) r2
        L_0x0163:
            if (r2 == 0) goto L_0x0171
            java.lang.reflect.Method r9 = r2.S()
            if (r9 == 0) goto L_0x0171
            If.n$c r0 = new If.n$c
            r0.<init>(r9)
            return r0
        L_0x0171:
            If.Y0 r9 = new If.Y0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0188:
            boolean r9 = r0 instanceof Zf.b
            r1 = 41
            java.lang.String r3 = " ("
            if (r9 == 0) goto L_0x01ed
            r9 = r0
            Zf.b r9 = (Zf.b) r9
            Of.h0 r9 = r9.i()
            boolean r4 = r9 instanceof dg.C5815a
            if (r4 == 0) goto L_0x019e
            dg.a r9 = (dg.C5815a) r9
            goto L_0x019f
        L_0x019e:
            r9 = r2
        L_0x019f:
            if (r9 == 0) goto L_0x01a5
            eg.l r2 = r9.c()
        L_0x01a5:
            boolean r9 = r2 instanceof Uf.t
            if (r9 == 0) goto L_0x01b5
            If.n$b r9 = new If.n$b
            Uf.t r2 = (Uf.t) r2
            java.lang.reflect.Constructor r0 = r2.S()
            r9.<init>(r0)
            goto L_0x01cc
        L_0x01b5:
            boolean r9 = r2 instanceof Uf.q
            if (r9 == 0) goto L_0x01cd
            r9 = r2
            Uf.q r9 = (Uf.q) r9
            boolean r4 = r9.p()
            if (r4 == 0) goto L_0x01cd
            If.n$a r0 = new If.n$a
            java.lang.Class r9 = r9.t()
            r0.<init>(r9)
            r9 = r0
        L_0x01cc:
            return r9
        L_0x01cd:
            If.Y0 r9 = new If.Y0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r9.<init>(r0)
            throw r9
        L_0x01ed:
            boolean r9 = r8.b(r0)
            if (r9 == 0) goto L_0x01f8
            If.n$e r9 = r8.d(r0)
            return r9
        L_0x01f8:
            If.Y0 r9 = new If.Y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown origin of "
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: If.f1.g(Of.z):If.n");
    }
}
