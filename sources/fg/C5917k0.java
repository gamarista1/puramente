package fg;

import Fg.S;
import Gg.s;
import Nf.d;
import Of.C5487e;
import Of.C5490h;
import Pf.h;
import Pf.o;
import Xf.I;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;

/* renamed from: fg.k0  reason: case insensitive filesystem */
public abstract class C5917k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final h f67676a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5906f f67677b;

    /* renamed from: fg.k0$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67678a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                fg.k[] r0 = fg.C5916k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fg.k r1 = fg.C5916k.NULLABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fg.k r1 = fg.C5916k.NOT_NULL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f67678a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fg.C5917k0.a.<clinit>():void");
        }
    }

    static {
        c cVar = I.f66283v;
        C6496s.g(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f67676a = new C5906f(cVar);
        c cVar2 = I.f66284w;
        C6496s.g(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f67677b = new C5906f(cVar2);
    }

    /* access modifiers changed from: private */
    public static final h e(List list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        } else if (size != 1) {
            return new o(C6565s.e1(list));
        } else {
            return (h) C6565s.P0(list);
        }
    }

    /* access modifiers changed from: private */
    public static final C5490h f(C5490h hVar, C5910h hVar2, C5911h0 h0Var) {
        d dVar = d.f64275a;
        if (!C5913i0.a(h0Var) || !(hVar instanceof C5487e)) {
            return null;
        }
        if (hVar2.e() == C5912i.READ_ONLY && h0Var == C5911h0.FLEXIBLE_LOWER) {
            C5487e eVar = (C5487e) hVar;
            if (dVar.c(eVar)) {
                return dVar.a(eVar);
            }
        }
        if (hVar2.e() != C5912i.MUTABLE || h0Var != C5911h0.FLEXIBLE_UPPER) {
            return null;
        }
        C5487e eVar2 = (C5487e) hVar;
        if (dVar.d(eVar2)) {
            return dVar.b(eVar2);
        }
        return null;
    }

    public static final h g() {
        return f67676a;
    }

    /* access modifiers changed from: private */
    public static final Boolean h(C5910h hVar, C5911h0 h0Var) {
        int i10;
        if (!C5913i0.a(h0Var)) {
            return null;
        }
        C5916k f10 = hVar.f();
        if (f10 == null) {
            i10 = -1;
        } else {
            i10 = a.f67678a[f10.ordinal()];
        }
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(S s10) {
        C6496s.h(s10, "<this>");
        return C5919l0.c(s.f63205a, s10);
    }
}
