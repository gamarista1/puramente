package Gf;

import Ff.e;
import Ff.p;
import Ff.r;
import Ff.s;
import Fg.C5366d0;
import Fg.C5380k0;
import Fg.D0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Gg.g;
import If.U0;
import If.Y;
import If.Y0;
import Of.C5490h;
import Of.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import yf.C6787a;

public abstract class f {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63175a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ff.s[] r0 = Ff.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ff.s r1 = Ff.s.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ff.s r1 = Ff.s.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ff.s r1 = Ff.s.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63175a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gf.f.a.<clinit>():void");
        }
    }

    private static final C5366d0 a(r0 r0Var, v0 v0Var, List list, boolean z10) {
        S s10;
        int i10;
        Object obj;
        List parameters = v0Var.getParameters();
        C6496s.g(parameters, "getParameters(...)");
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i11 = 0;
        for (Object next : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            r rVar = (r) next;
            U0 u02 = (U0) rVar.c();
            if (u02 != null) {
                s10 = u02.A();
            } else {
                s10 = null;
            }
            s d10 = rVar.d();
            if (d10 == null) {
                i10 = -1;
            } else {
                i10 = a.f63175a[d10.ordinal()];
            }
            if (i10 == -1) {
                Object obj2 = parameters.get(i11);
                C6496s.g(obj2, "get(...)");
                obj = new C5380k0((m0) obj2);
            } else if (i10 == 1) {
                N0 n02 = N0.INVARIANT;
                C6496s.e(s10);
                obj = new D0(n02, s10);
            } else if (i10 == 2) {
                N0 n03 = N0.IN_VARIANCE;
                C6496s.e(s10);
                obj = new D0(n03, s10);
            } else if (i10 == 3) {
                N0 n04 = N0.OUT_VARIANCE;
                C6496s.e(s10);
                obj = new D0(n04, s10);
            } else {
                throw new C6535s();
            }
            arrayList.add(obj);
            i11 = i12;
        }
        return V.k(r0Var, v0Var, arrayList, z10, (g) null, 16, (Object) null);
    }

    public static final p b(e eVar, List list, boolean z10, List list2) {
        Y y10;
        C5490h descriptor;
        r0 r0Var;
        C6496s.h(eVar, "<this>");
        C6496s.h(list, "arguments");
        C6496s.h(list2, "annotations");
        if (eVar instanceof Y) {
            y10 = (Y) eVar;
        } else {
            y10 = null;
        }
        if (y10 == null || (descriptor = y10.getDescriptor()) == null) {
            throw new Y0("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        v0 l10 = descriptor.l();
        C6496s.g(l10, "getTypeConstructor(...)");
        List parameters = l10.getParameters();
        C6496s.g(parameters, "getParameters(...)");
        if (parameters.size() == list.size()) {
            if (list2.isEmpty()) {
                r0Var = r0.f63046b.j();
            } else {
                r0Var = r0.f63046b.j();
            }
            return new U0(a(r0Var, l10, list, z10), (C6787a) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
    }

    public static /* synthetic */ p c(e eVar, List list, boolean z10, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = C6565s.n();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list2 = C6565s.n();
        }
        return b(eVar, list, z10, list2);
    }
}
