package Mg;

import Fg.S;
import Kg.d;
import Lf.i;
import Mg.A;
import Mg.k;
import Mg.v;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.C5506y;
import Of.C5507z;
import Of.c0;
import Of.l0;
import Of.t0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.b;
import ng.f;
import vg.C6755e;
import yf.C6798l;
import zg.C6838e;
import zg.C6840g;

public final class s extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final s f64173a = new s();

    /* renamed from: b  reason: collision with root package name */
    private static final List f64174b;

    static {
        h hVar = r1;
        f fVar = t.f64221k;
        k.b bVar = k.b.f64162b;
        h hVar2 = new h(fVar, new f[]{bVar, new A.a(1)}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar3 = r1;
        h hVar4 = new h(t.f64222l, new f[]{bVar, new A.a(2)}, (C6798l) p.f64170a);
        h hVar5 = r16;
        f fVar2 = t.f64203b;
        m mVar = m.f64164a;
        A.a aVar = new A.a(2);
        j jVar = j.f64158a;
        h hVar6 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar7 = r27;
        h hVar8 = new h(t.f64205c, new f[]{bVar, mVar, new A.a(3), jVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar9 = r16;
        h hVar10 = new h(t.f64207d, new f[]{bVar, mVar, new A.b(2), jVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar11 = r27;
        h hVar12 = new h(t.f64217i, new f[]{bVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar13 = r16;
        f fVar3 = t.f64215h;
        A.d dVar = A.d.f64137b;
        v.a aVar2 = v.a.f64241d;
        h hVar14 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar15 = r27;
        f fVar4 = t.f64219j;
        A.c cVar = A.c.f64136b;
        h hVar16 = new h(fVar4, new f[]{bVar, cVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar17 = r16;
        h hVar18 = new h(t.f64223m, new f[]{bVar, cVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar19 = r34;
        h hVar20 = new h(t.f64224n, new f[]{bVar, cVar, aVar2}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar21 = r18;
        h hVar22 = new h(t.f64183I, new f[]{bVar, dVar, mVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar23 = r34;
        h hVar24 = new h(t.f64184J, new f[]{bVar, dVar, mVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar25 = r2;
        h hVar26 = new h(t.f64209e, new f[]{k.a.f64161b}, (C6798l) q.f64171a);
        h hVar27 = r34;
        h hVar28 = new h(t.f64213g, new f[]{bVar, v.b.f64242d, dVar, mVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar29 = r40;
        h hVar30 = new h((Collection) t.f64200Z, new f[]{bVar, dVar, mVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar31 = r34;
        h hVar32 = new h((Collection) t.f64199Y, new f[]{bVar, cVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar33 = r2;
        h hVar34 = new h((Collection) C6565s.q(t.f64234x, t.f64235y), new f[]{bVar}, (C6798l) r.f64172a);
        h hVar35 = r34;
        h hVar36 = new h((Collection) t.f64210e0, new f[]{bVar, v.c.f64243d, dVar, mVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        h hVar37 = r40;
        h hVar38 = new h(t.f64226p, new f[]{bVar, cVar}, (C6798l) null, 4, (DefaultConstructorMarker) null);
        f64174b = C6565s.q(hVar, hVar3, hVar5, hVar7, hVar9, hVar11, hVar13, hVar15, hVar17, hVar19, hVar21, hVar23, hVar25, hVar27, hVar29, hVar31, hVar33, hVar35, hVar37);
    }

    private s() {
    }

    /* access modifiers changed from: private */
    public static final String f(C5507z zVar) {
        C6496s.h(zVar, "$this$Checks");
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        t0 t0Var = (t0) C6565s.B0(k10);
        boolean z10 = false;
        if (t0Var != null && !C6755e.f(t0Var) && t0Var.v0() == null) {
            z10 = true;
        }
        if (!z10) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String g(Of.C5507z r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            Of.m r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L_0x0050
            java.util.Collection r0 = r3.e()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.C6496s.g(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r0.next()
            Of.z r2 = (Of.C5507z) r2
            Of.m r2 = r2.b()
            kotlin.jvm.internal.C6496s.g(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L_0x002d
            goto L_0x0050
        L_0x0047:
            boolean r0 = Of.C5500s.c(r3)
            if (r0 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r0 = 0
            goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 != 0) goto L_0x00ab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            Of.m r2 = r3.b()
            kotlin.jvm.internal.C6496s.g(r2, r1)
            boolean r1 = rg.C6693k.g(r2)
            if (r1 == 0) goto L_0x00a1
            qg.n r1 = qg.n.f72701j
            Of.m r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C6496s.f(r3, r2)
            Of.e r3 = (Of.C5487e) r3
            Fg.d0 r3 = r3.p()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.C6496s.g(r3, r2)
            Fg.S r3 = Kg.d.D(r3)
            java.lang.String r3 = r1.U(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        L_0x00a1:
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            goto L_0x00ac
        L_0x00ab:
            r3 = 0
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Mg.s.g(Of.z):java.lang.String");
    }

    private static final boolean h(C5495m mVar) {
        if (!(mVar instanceof C5487e) || !i.a0((C5487e) mVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final String i(C5507z zVar) {
        boolean z10;
        C6496s.h(zVar, "$this$Checks");
        c0 M10 = zVar.M();
        if (M10 == null) {
            M10 = zVar.P();
        }
        s sVar = f64173a;
        boolean z11 = false;
        if (M10 != null) {
            S returnType = zVar.getReturnType();
            if (returnType != null) {
                S type = M10.getType();
                C6496s.g(type, "getType(...)");
                z10 = d.w(returnType, type);
            } else {
                z10 = false;
            }
            if (z10 || sVar.j(zVar, M10)) {
                z11 = true;
            }
        }
        if (!z11) {
            return "receiver must be a supertype of the return type";
        }
        return null;
    }

    private final boolean j(C5507z zVar, c0 c0Var) {
        b n10;
        l0 l0Var;
        S returnType;
        C6840g value = c0Var.getValue();
        C6496s.g(value, "getValue(...)");
        if (!(value instanceof C6838e)) {
            return false;
        }
        C5487e u10 = ((C6838e) value).u();
        if (!u10.k0() || (n10 = C6755e.n(u10)) == null) {
            return false;
        }
        C5490h c10 = C5506y.c(C6755e.s(u10), n10);
        if (c10 instanceof l0) {
            l0Var = (l0) c10;
        } else {
            l0Var = null;
        }
        if (l0Var == null || (returnType = zVar.getReturnType()) == null) {
            return false;
        }
        return d.w(returnType, l0Var.H());
    }

    public List b() {
        return f64174b;
    }
}
