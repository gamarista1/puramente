package If;

import Fg.S;
import Of.C5483a;
import Of.C5507z;
import Of.Z;
import Of.c0;
import Of.t0;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;
import ng.f;
import qg.n;

public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f63668a = new e1();

    /* renamed from: b  reason: collision with root package name */
    private static final n f63669b = n.f72699h;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63670a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ff.k$a[] r0 = Ff.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ff.k$a r1 = Ff.k.a.EXTENSION_RECEIVER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ff.k$a r1 = Ff.k.a.INSTANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ff.k$a r1 = Ff.k.a.VALUE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63670a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: If.e1.a.<clinit>():void");
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, c0 c0Var) {
        if (c0Var != null) {
            S type = c0Var.getType();
            C6496s.g(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, C5483a aVar) {
        boolean z10;
        c0 i10 = j1.i(aVar);
        c0 P10 = aVar.P();
        c(sb2, i10);
        if (i10 == null || P10 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            sb2.append("(");
        }
        c(sb2, P10);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(C5483a aVar) {
        if (aVar instanceof Z) {
            return k((Z) aVar);
        }
        if (aVar instanceof C5507z) {
            return f((C5507z) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* access modifiers changed from: private */
    public static final CharSequence g(t0 t0Var) {
        e1 e1Var = f63668a;
        S type = t0Var.getType();
        C6496s.g(type, "getType(...)");
        return e1Var.l(type);
    }

    /* access modifiers changed from: private */
    public static final CharSequence i(t0 t0Var) {
        e1 e1Var = f63668a;
        S type = t0Var.getType();
        C6496s.g(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(C5507z zVar) {
        C6496s.h(zVar, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f63668a;
        e1Var.d(sb2, zVar);
        n nVar = f63669b;
        f name = zVar.getName();
        C6496s.g(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        C6565s.v0(k10, sb2, ", ", "(", ")", 0, (CharSequence) null, c1.f63651a, 48, (Object) null);
        sb2.append(": ");
        S returnType = zVar.getReturnType();
        C6496s.e(returnType);
        sb2.append(e1Var.l(returnType));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final String h(C5507z zVar) {
        C6496s.h(zVar, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f63668a;
        e1Var.d(sb2, zVar);
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        C6565s.v0(k10, sb2, ", ", "(", ")", 0, (CharSequence) null, d1.f63665a, 48, (Object) null);
        sb2.append(" -> ");
        S returnType = zVar.getReturnType();
        C6496s.e(returnType);
        sb2.append(e1Var.l(returnType));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final String j(C5473y0 y0Var) {
        C6496s.h(y0Var, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f63670a[y0Var.h().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + y0Var.getIndex() + ' ' + y0Var.getName());
        } else {
            throw new C6535s();
        }
        sb2.append(" of ");
        sb2.append(f63668a.e(y0Var.r().V()));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final String k(Z z10) {
        String str;
        C6496s.h(z10, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (z10.O()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        e1 e1Var = f63668a;
        e1Var.d(sb2, z10);
        n nVar = f63669b;
        f name = z10.getName();
        C6496s.g(name, "getName(...)");
        sb2.append(nVar.T(name, true));
        sb2.append(": ");
        S type = z10.getType();
        C6496s.g(type, "getType(...)");
        sb2.append(e1Var.l(type));
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public final String l(S s10) {
        C6496s.h(s10, "type");
        return f63669b.U(s10);
    }
}
