package androidx.compose.ui.platform;

import J0.G;
import O0.j;
import O0.k;
import O0.n;
import O0.q;
import O0.u;
import c1.t;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.C6798l;

public abstract class A {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13458a = new a();

        a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r3.g(O0.q.f4613a.g()) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(J0.G r3) {
            /*
                r2 = this;
                O0.j r3 = r3.I()
                if (r3 == 0) goto L_0x001a
                boolean r0 = r3.z()
                r1 = 1
                if (r0 != r1) goto L_0x001a
                O0.q r0 = O0.q.f4613a
                O0.u r0 = r0.g()
                boolean r3 = r3.g(r0)
                if (r3 == 0) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.A.a.invoke(J0.G):java.lang.Boolean");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean g(O0.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof O0.a)) {
            return false;
        }
        O0.a aVar2 = (O0.a) obj;
        if (!C6496s.c(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() == null && aVar2.a() != null) {
            return false;
        }
        if (aVar.a() == null || aVar2.a() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(n nVar) {
        return !nVar.n().g(q.f4613a.f());
    }

    /* access modifiers changed from: private */
    public static final boolean i(n nVar) {
        boolean z10;
        j w10 = nVar.w();
        q qVar = q.f4613a;
        if (w10.g(qVar.g()) && !C6496s.c(k.a(nVar.w(), qVar.i()), Boolean.TRUE)) {
            return true;
        }
        G j10 = j(nVar.q(), a.f13458a);
        if (j10 != null) {
            j I10 = j10.I();
            if (I10 != null) {
                z10 = C6496s.c(k.a(I10, qVar.i()), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final G j(G g10, C6798l lVar) {
        for (G n02 = g10.n0(); n02 != null; n02 = n02.n0()) {
            if (((Boolean) lVar.invoke(n02)).booleanValue()) {
                return n02;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean k(n nVar) {
        if (nVar.p().getLayoutDirection() == t.Rtl) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean l(n nVar, j jVar) {
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            if (!nVar.n().g((u) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
