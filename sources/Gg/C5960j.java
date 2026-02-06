package gg;

import Fg.J0;
import Fg.S;
import Lf.i;
import Of.C5483a;
import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.N;
import Of.a0;
import Pg.j;
import Sg.p;
import kotlin.jvm.internal.C6496s;
import ng.c;
import ng.h;
import yf.q;

/* renamed from: gg.j  reason: case insensitive filesystem */
public abstract class C5960j {
    public static final String a(C5487e eVar, C5947G g10) {
        C5487e eVar2;
        C6496s.h(eVar, "klass");
        C6496s.h(g10, "typeMappingConfiguration");
        String f10 = g10.f(eVar);
        if (f10 != null) {
            return f10;
        }
        C5495m b10 = eVar.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        String e10 = h.b(eVar.getName()).e();
        C6496s.g(e10, "getIdentifier(...)");
        if (b10 instanceof N) {
            c f11 = ((N) b10).f();
            if (f11.d()) {
                return e10;
            }
            StringBuilder sb2 = new StringBuilder();
            String b11 = f11.b();
            C6496s.g(b11, "asString(...)");
            sb2.append(p.C(b11, '.', '/', false, 4, (Object) null));
            sb2.append('/');
            sb2.append(e10);
            return sb2.toString();
        }
        if (b10 instanceof C5487e) {
            eVar2 = (C5487e) b10;
        } else {
            eVar2 = null;
        }
        if (eVar2 != null) {
            String b12 = g10.b(eVar2);
            if (b12 == null) {
                b12 = a(eVar2, g10);
            }
            return b12 + '$' + e10;
        }
        throw new IllegalArgumentException("Unexpected container: " + b10 + " for " + eVar);
    }

    public static /* synthetic */ String b(C5487e eVar, C5947G g10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = C5948H.f67717a;
        }
        return a(eVar, g10);
    }

    public static final boolean c(C5483a aVar) {
        C6496s.h(aVar, "descriptor");
        if (aVar instanceof C5494l) {
            return true;
        }
        S returnType = aVar.getReturnType();
        C6496s.e(returnType);
        if (i.C0(returnType)) {
            S returnType2 = aVar.getReturnType();
            C6496s.e(returnType2);
            if (J0.l(returnType2) || (aVar instanceof a0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [Of.m, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(Fg.S r8, gg.C5970t r9, gg.C5949I r10, gg.C5947G r11, gg.C5967q r12, yf.q r13) {
        /*
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "writeGenericType"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            Fg.S r1 = r11.c(r8)
            if (r1 == 0) goto L_0x0029
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x0029:
            boolean r0 = Lf.h.r(r8)
            if (r0 == 0) goto L_0x003d
            Fg.d0 r1 = Lf.p.a(r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x003d:
            Gg.s r0 = Gg.s.f63205a
            java.lang.Object r1 = gg.C5950J.b(r0, r8, r9, r10)
            if (r1 == 0) goto L_0x0051
            boolean r11 = r10.d()
            java.lang.Object r9 = gg.C5950J.a(r9, r1, r11)
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0051:
            Fg.v0 r1 = r8.N0()
            boolean r2 = r1 instanceof Fg.Q
            if (r2 == 0) goto L_0x0077
            Fg.Q r1 = (Fg.Q) r1
            Fg.S r8 = r1.h()
            if (r8 != 0) goto L_0x0069
            java.util.Collection r8 = r1.l()
            Fg.S r8 = r11.d(r8)
        L_0x0069:
            Fg.S r0 = Kg.d.D(r8)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r8 = d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0077:
            Of.h r1 = r1.o()
            if (r1 == 0) goto L_0x01c3
            boolean r2 = Hg.l.m(r1)
            if (r2 == 0) goto L_0x008f
            java.lang.String r10 = "error/NonExistentClass"
            java.lang.Object r9 = r9.e(r10)
            Of.e r1 = (Of.C5487e) r1
            r11.e(r8, r1)
            return r9
        L_0x008f:
            boolean r2 = r1 instanceof Of.C5487e
            if (r2 == 0) goto L_0x00fe
            boolean r3 = Lf.i.c0(r8)
            if (r3 == 0) goto L_0x00fe
            java.util.List r0 = r8.L0()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x00f6
            java.util.List r8 = r8.L0()
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            Fg.B0 r8 = (Fg.B0) r8
            Fg.S r2 = r8.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.C6496s.g(r2, r0)
            Fg.N0 r0 = r8.b()
            Fg.N0 r3 = Fg.N0.IN_VARIANCE
            if (r0 != r3) goto L_0x00c7
            java.lang.String r8 = "java/lang/Object"
            java.lang.Object r8 = r9.e(r8)
            goto L_0x00dc
        L_0x00c7:
            Fg.N0 r8 = r8.b()
            java.lang.String r0 = "getProjectionKind(...)"
            kotlin.jvm.internal.C6496s.g(r8, r0)
            gg.I r4 = r10.f(r8, r1)
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 91
            r10.append(r11)
            java.lang.String r8 = r9.d(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object r8 = r9.a(r8)
            return r8
        L_0x00f6:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "arrays must have one type argument"
            r8.<init>(r9)
            throw r8
        L_0x00fe:
            if (r2 == 0) goto L_0x0170
            boolean r2 = rg.C6693k.b(r1)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r10.c()
            if (r2 != 0) goto L_0x0122
            Jg.i r0 = Fg.H.a(r0, r8)
            r2 = r0
            Fg.S r2 = (Fg.S) r2
            if (r2 == 0) goto L_0x0122
            gg.I r4 = r10.g()
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0122:
            boolean r12 = r10.e()
            if (r12 == 0) goto L_0x0136
            r12 = r1
            Of.e r12 = (Of.C5487e) r12
            boolean r12 = Lf.i.l0(r12)
            if (r12 == 0) goto L_0x0136
            java.lang.Object r9 = r9.f()
            goto L_0x016c
        L_0x0136:
            Of.e r1 = (Of.C5487e) r1
            Of.e r12 = r1.a()
            java.lang.String r0 = "getOriginal(...)"
            kotlin.jvm.internal.C6496s.g(r12, r0)
            java.lang.Object r12 = r11.a(r12)
            if (r12 != 0) goto L_0x016b
            Of.f r12 = r1.h()
            Of.f r2 = Of.C5488f.ENUM_ENTRY
            if (r12 != r2) goto L_0x015b
            Of.m r12 = r1.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C6496s.f(r12, r1)
            r1 = r12
            Of.e r1 = (Of.C5487e) r1
        L_0x015b:
            Of.e r12 = r1.a()
            kotlin.jvm.internal.C6496s.g(r12, r0)
            java.lang.String r11 = a(r12, r11)
            java.lang.Object r9 = r9.e(r11)
            goto L_0x016c
        L_0x016b:
            r9 = r12
        L_0x016c:
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0170:
            boolean r0 = r1 instanceof Of.m0
            if (r0 == 0) goto L_0x0192
            Of.m0 r1 = (Of.m0) r1
            Fg.S r12 = Kg.d.o(r1)
            boolean r8 = r8.O0()
            if (r8 == 0) goto L_0x0184
            Fg.S r12 = Kg.d.B(r12)
        L_0x0184:
            r0 = r12
            yf.q r5 = Pg.j.l()
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r8 = d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0192:
            boolean r0 = r1 instanceof Of.l0
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x01ac
            Of.l0 r1 = (Of.l0) r1
            Fg.d0 r2 = r1.H()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x01ac:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown type "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01c3:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "no descriptor for type constructor of "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.C5960j.d(Fg.S, gg.t, gg.I, gg.G, gg.q, yf.q):java.lang.Object");
    }

    public static /* synthetic */ Object e(S s10, C5970t tVar, C5949I i10, C5947G g10, C5967q qVar, q qVar2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            qVar2 = j.l();
        }
        return d(s10, tVar, i10, g10, qVar, qVar2);
    }
}
