package If;

import Dg.N;
import Fg.J0;
import If.K0;
import Jf.i;
import Of.C5495m;
import Of.Z;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.C6496s;
import mg.C6581i;
import rg.C6691i;

public abstract class P0 {
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Jf.h b(If.K0.a r6, boolean r7) {
        /*
            If.d0$a r0 = If.C5432d0.f63653a
            Sg.m r0 = r0.a()
            If.K0 r1 = r6.b0()
            java.lang.String r1 = r1.k0()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x0017
            Jf.l r6 = Jf.l.f63820a
            return r6
        L_0x0017:
            If.f1 r0 = If.f1.f63674a
            If.K0 r1 = r6.b0()
            Of.Z r1 = r1.V()
            If.p r0 = r0.f(r1)
            boolean r1 = r0 instanceof If.C5455p.c
            r2 = 0
            if (r1 == 0) goto L_0x0168
            If.p$c r0 = (If.C5455p.c) r0
            lg.a$d r1 = r0.f()
            if (r7 == 0) goto L_0x003f
            boolean r3 = r1.G()
            if (r3 == 0) goto L_0x003d
            lg.a$c r1 = r1.B()
            goto L_0x0049
        L_0x003d:
            r1 = r2
            goto L_0x0049
        L_0x003f:
            boolean r3 = r1.H()
            if (r3 == 0) goto L_0x003d
            lg.a$c r1 = r1.C()
        L_0x0049:
            if (r1 == 0) goto L_0x0070
            If.K0 r3 = r6.b0()
            If.d0 r3 = r3.T()
            kg.c r4 = r0.d()
            int r5 = r1.x()
            java.lang.String r4 = r4.getString(r5)
            kg.c r0 = r0.d()
            int r1 = r1.w()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r0 = r3.D(r4, r0)
            goto L_0x0071
        L_0x0070:
            r0 = r2
        L_0x0071:
            if (r0 != 0) goto L_0x0118
            If.K0 r0 = r6.b0()
            Of.Z r0 = r0.V()
            boolean r0 = rg.C6693k.e(r0)
            if (r0 == 0) goto L_0x00ed
            If.K0 r0 = r6.b0()
            Of.Z r0 = r0.V()
            Of.u r0 = r0.getVisibility()
            Of.u r1 = Of.C5501t.f64508d
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r0 == 0) goto L_0x00ed
            If.K0 r7 = r6.b0()
            Of.Z r7 = r7.V()
            Of.m r7 = r7.b()
            java.lang.Class r7 = Jf.o.t(r7)
            if (r7 == 0) goto L_0x00cd
            If.K0 r0 = r6.b0()
            Of.Z r0 = r0.V()
            java.lang.reflect.Method r7 = Jf.o.m(r7, r0)
            if (r7 == 0) goto L_0x00cd
            boolean r0 = r6.Y()
            if (r0 == 0) goto L_0x00c6
            Jf.k$a r0 = new Jf.k$a
            java.lang.Object r1 = f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x00c6:
            Jf.k$b r0 = new Jf.k$b
            r0.<init>(r7)
            goto L_0x01a1
        L_0x00cd:
            If.Y0 r7 = new If.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            If.K0 r6 = r6.b0()
            r0.append(r6)
            java.lang.String r6 = " should have a field"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x00ed:
            If.K0 r0 = r6.b0()
            java.lang.reflect.Field r0 = r0.j0()
            if (r0 == 0) goto L_0x00fd
            Jf.i r0 = c(r6, r7, r0)
            goto L_0x01a1
        L_0x00fd:
            If.Y0 r7 = new If.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            If.K0 r6 = r6.b0()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0118:
            int r7 = r0.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L_0x013a
            boolean r7 = r6.Y()
            if (r7 == 0) goto L_0x0134
            Jf.i$h$a r7 = new Jf.i$h$a
            java.lang.Object r1 = f(r6)
            r7.<init>(r0, r1)
        L_0x0131:
            r0 = r7
            goto L_0x01a1
        L_0x0134:
            Jf.i$h$e r7 = new Jf.i$h$e
            r7.<init>(r0)
            goto L_0x0131
        L_0x013a:
            boolean r7 = d(r6)
            if (r7 == 0) goto L_0x0152
            boolean r7 = r6.Y()
            if (r7 == 0) goto L_0x014c
            Jf.i$h$b r7 = new Jf.i$h$b
            r7.<init>(r0)
            goto L_0x0131
        L_0x014c:
            Jf.i$h$f r7 = new Jf.i$h$f
            r7.<init>(r0)
            goto L_0x0131
        L_0x0152:
            boolean r7 = r6.Y()
            if (r7 == 0) goto L_0x0162
            Jf.i$h$c r7 = new Jf.i$h$c
            java.lang.Object r1 = f(r6)
            r7.<init>(r0, r1)
            goto L_0x0131
        L_0x0162:
            Jf.i$h$g r7 = new Jf.i$h$g
            r7.<init>(r0)
            goto L_0x0131
        L_0x0168:
            boolean r1 = r0 instanceof If.C5455p.a
            if (r1 == 0) goto L_0x0177
            If.p$a r0 = (If.C5455p.a) r0
            java.lang.reflect.Field r0 = r0.b()
            Jf.i r0 = c(r6, r7, r0)
            goto L_0x01a1
        L_0x0177:
            boolean r1 = r0 instanceof If.C5455p.b
            if (r1 == 0) goto L_0x01c7
            if (r7 == 0) goto L_0x0184
            If.p$b r0 = (If.C5455p.b) r0
            java.lang.reflect.Method r7 = r0.b()
            goto L_0x018c
        L_0x0184:
            If.p$b r0 = (If.C5455p.b) r0
            java.lang.reflect.Method r7 = r0.c()
            if (r7 == 0) goto L_0x01ac
        L_0x018c:
            boolean r0 = r6.Y()
            if (r0 == 0) goto L_0x019c
            Jf.i$h$a r0 = new Jf.i$h$a
            java.lang.Object r1 = f(r6)
            r0.<init>(r7, r1)
            goto L_0x01a1
        L_0x019c:
            Jf.i$h$e r0 = new Jf.i$h$e
            r0.<init>(r7)
        L_0x01a1:
            Of.Y r6 = r6.a0()
            r7 = 0
            r1 = 2
            Jf.h r6 = Jf.o.j(r0, r6, r7, r1, r2)
            return r6
        L_0x01ac:
            If.Y0 r6 = new If.Y0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r7.append(r1)
            java.lang.reflect.Method r0 = r0.b()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x01c7:
            boolean r1 = r0 instanceof If.C5455p.d
            if (r1 == 0) goto L_0x0245
            if (r7 == 0) goto L_0x01d4
            If.p$d r0 = (If.C5455p.d) r0
            If.n$e r7 = r0.b()
            goto L_0x01dc
        L_0x01d4:
            If.p$d r0 = (If.C5455p.d) r0
            If.n$e r7 = r0.c()
            if (r7 == 0) goto L_0x022a
        L_0x01dc:
            If.K0 r0 = r6.b0()
            If.d0 r0 = r0.T()
            java.lang.String r1 = r7.c()
            java.lang.String r7 = r7.b()
            java.lang.reflect.Method r7 = r0.D(r1, r7)
            if (r7 == 0) goto L_0x020f
            int r0 = r7.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r6.Y()
            if (r0 == 0) goto L_0x0209
            Jf.i$h$a r0 = new Jf.i$h$a
            java.lang.Object r6 = f(r6)
            r0.<init>(r7, r6)
            goto L_0x020e
        L_0x0209:
            Jf.i$h$e r0 = new Jf.i$h$e
            r0.<init>(r7)
        L_0x020e:
            return r0
        L_0x020f:
            If.Y0 r7 = new If.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            If.K0 r6 = r6.b0()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x022a:
            If.Y0 r7 = new If.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            If.K0 r6 = r6.b0()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L_0x0245:
            lf.s r6 = new lf.s
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: If.P0.b(If.K0$a, boolean):Jf.h");
    }

    private static final i c(K0.a aVar, boolean z10, Field field) {
        i cVar;
        if (g(aVar.b0().V()) || !Modifier.isStatic(field.getModifiers())) {
            if (z10) {
                if (!aVar.Y()) {
                    return new i.f.c(field);
                }
                cVar = new i.f.a(field, f(aVar));
            } else if (aVar.Y()) {
                cVar = new i.g.a(field, e(aVar), f(aVar));
            } else {
                cVar = new i.g.c(field, e(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                if (aVar.Y()) {
                    return new i.f.b(field);
                }
                return new i.f.d(field);
            } else if (aVar.Y()) {
                cVar = new i.g.b(field, e(aVar));
            } else {
                cVar = new i.g.d(field, e(aVar));
            }
        } else if (z10) {
            return new i.f.e(field);
        } else {
            cVar = new i.g.e(field, e(aVar));
        }
        return cVar;
    }

    private static final boolean d(K0.a aVar) {
        return aVar.b0().V().getAnnotations().n0(j1.j());
    }

    private static final boolean e(K0.a aVar) {
        return !J0.l(aVar.b0().V().getType());
    }

    public static final Object f(K0.a aVar) {
        C6496s.h(aVar, "<this>");
        return aVar.b0().f0();
    }

    private static final boolean g(Z z10) {
        C5495m b10 = z10.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        if (!C6691i.x(b10)) {
            return false;
        }
        C5495m b11 = b10.b();
        if ((C6691i.C(b11) || C6691i.t(b11)) && (!(z10 instanceof N) || !C6581i.f(((N) z10).g0()))) {
            return false;
        }
        return true;
    }
}
