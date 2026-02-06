package j3;

import Rg.h;
import Rg.k;
import Sg.p;
import androidx.collection.Z;
import androidx.collection.b0;
import gh.C5978b;
import gh.C5988l;
import j3.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l3.C2173c;
import mf.C6565s;
import mf.O;
import yf.C6798l;
import zf.C6828a;

public class u extends s implements Iterable, C6828a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f22987q = new a((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private final Z f22988m = new Z(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private int f22989n;

    /* renamed from: o  reason: collision with root package name */
    private String f22990o;

    /* renamed from: p  reason: collision with root package name */
    private String f22991p;

    public static final class a {

        /* renamed from: j3.u$a$a  reason: collision with other inner class name */
        static final class C0367a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final C0367a f22992a = new C0367a();

            C0367a() {
                super(1);
            }

            /* renamed from: a */
            public final s invoke(s sVar) {
                C6496s.h(sVar, "it");
                if (!(sVar instanceof u)) {
                    return null;
                }
                u uVar = (u) sVar;
                return uVar.c0(uVar.o0());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(u uVar) {
            C6496s.h(uVar, "<this>");
            return k.h(uVar, C0367a.f22992a);
        }

        public final s b(u uVar) {
            C6496s.h(uVar, "<this>");
            return (s) k.w(a(uVar));
        }

        private a() {
        }
    }

    public static final class b implements Iterator, C6828a {

        /* renamed from: a  reason: collision with root package name */
        private int f22993a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f22994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ u f22995c;

        b(u uVar) {
            this.f22995c = uVar;
        }

        /* renamed from: a */
        public s next() {
            if (hasNext()) {
                this.f22994b = true;
                Z j02 = this.f22995c.j0();
                int i10 = this.f22993a + 1;
                this.f22993a = i10;
                return (s) j02.p(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f22993a + 1 < this.f22995c.j0().o()) {
                return true;
            }
            return false;
        }

        public void remove() {
            if (this.f22994b) {
                Z j02 = this.f22995c.j0();
                ((s) j02.p(this.f22993a)).R((u) null);
                j02.l(this.f22993a);
                this.f22993a--;
                this.f22994b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f22996a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f22996a = obj;
        }

        /* renamed from: a */
        public final String invoke(s sVar) {
            C6496s.h(sVar, "startDestination");
            Map t10 = sVar.t();
            LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(t10.size()));
            for (Map.Entry entry : t10.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((C2137h) entry.getValue()).a());
            }
            return C2173c.c(this.f22996a, linkedHashMap);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(C2128E e10) {
        super(e10);
        C6496s.h(e10, "navGraphNavigator");
    }

    public static /* synthetic */ s i0(u uVar, int i10, s sVar, boolean z10, s sVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 8) != 0) {
                sVar2 = null;
            }
            return uVar.h0(i10, sVar, z10, sVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
    }

    private final void w0(int i10) {
        if (i10 != x()) {
            if (this.f22991p != null) {
                x0((String) null);
            }
            this.f22989n = i10;
            this.f22990o = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void x0(String str) {
        int i10;
        if (str == null) {
            i10 = 0;
        } else if (C6496s.c(str, C())) {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        } else if (!p.d0(str)) {
            i10 = s.f22957k.a(str).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route");
        }
        this.f22989n = i10;
        this.f22991p = str;
    }

    public s.b H(r rVar) {
        C6496s.h(rVar, "navDeepLinkRequest");
        return q0(rVar, true, false, this);
    }

    public final void Z(s sVar) {
        C6496s.h(sVar, "node");
        int x10 = sVar.x();
        String C10 = sVar.C();
        if (x10 == 0 && C10 == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        } else if (C() != null && C6496s.c(C10, C())) {
            throw new IllegalArgumentException(("Destination " + sVar + " cannot have the same route as graph " + this).toString());
        } else if (x10 != x()) {
            s sVar2 = (s) this.f22988m.g(x10);
            if (sVar2 != sVar) {
                if (sVar.A() == null) {
                    if (sVar2 != null) {
                        sVar2.R((u) null);
                    }
                    sVar.R(this);
                    this.f22988m.k(sVar.x(), sVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
        } else {
            throw new IllegalArgumentException(("Destination " + sVar + " cannot have the same id as graph " + this).toString());
        }
    }

    public final void a0(Collection collection) {
        C6496s.h(collection, "nodes");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar != null) {
                Z(sVar);
            }
        }
    }

    public final s c0(int i10) {
        return i0(this, i10, this, false, (s) null, 8, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u)) {
            return false;
        }
        if (super.equals(obj)) {
            u uVar = (u) obj;
            if (this.f22988m.o() == uVar.f22988m.o() && o0() == uVar.o0()) {
                for (s sVar : k.c(b0.b(this.f22988m))) {
                    if (!C6496s.c(sVar, uVar.f22988m.g(sVar.x()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final s f0(String str) {
        if (str == null || p.d0(str)) {
            return null;
        }
        return g0(str, true);
    }

    public final s g0(String str, boolean z10) {
        Object obj;
        C6496s.h(str, "route");
        Iterator it = k.c(b0.b(this.f22988m)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            s sVar = (s) obj;
            if (!p.w(sVar.C(), str, false, 2, (Object) null)) {
                if (sVar.I(str) != null) {
                    break;
                }
            } else {
                break;
            }
        }
        s sVar2 = (s) obj;
        if (sVar2 != null) {
            return sVar2;
        }
        if (!z10 || A() == null) {
            return null;
        }
        u A10 = A();
        C6496s.e(A10);
        return A10.f0(str);
    }

    public final s h0(int i10, s sVar, boolean z10, s sVar2) {
        s sVar3;
        s sVar4 = (s) this.f22988m.g(i10);
        if (sVar2 != null) {
            if (C6496s.c(sVar4, sVar2) && C6496s.c(sVar4.A(), sVar2.A())) {
                return sVar4;
            }
            sVar4 = null;
        } else if (sVar4 != null) {
            return sVar4;
        }
        if (z10) {
            Iterator it = k.c(b0.b(this.f22988m)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    sVar4 = null;
                    break;
                }
                s sVar5 = (s) it.next();
                if (!(sVar5 instanceof u) || C6496s.c(sVar5, sVar)) {
                    sVar3 = null;
                    continue;
                } else {
                    sVar3 = ((u) sVar5).h0(i10, this, true, sVar2);
                    continue;
                }
                if (sVar3 != null) {
                    sVar4 = sVar3;
                    break;
                }
            }
        }
        if (sVar4 != null) {
            return sVar4;
        }
        if (A() == null || C6496s.c(A(), sVar)) {
            return null;
        }
        u A10 = A();
        C6496s.e(A10);
        return A10.h0(i10, this, z10, sVar2);
    }

    public int hashCode() {
        int o02 = o0();
        Z z10 = this.f22988m;
        int o10 = z10.o();
        for (int i10 = 0; i10 < o10; i10++) {
            o02 = (((o02 * 31) + z10.j(i10)) * 31) + ((s) z10.p(i10)).hashCode();
        }
        return o02;
    }

    public final Iterator iterator() {
        return new b(this);
    }

    public final Z j0() {
        return this.f22988m;
    }

    public final String l0() {
        if (this.f22990o == null) {
            String str = this.f22991p;
            if (str == null) {
                str = String.valueOf(this.f22989n);
            }
            this.f22990o = str;
        }
        String str2 = this.f22990o;
        C6496s.e(str2);
        return str2;
    }

    public final int o0() {
        return this.f22989n;
    }

    public final String p0() {
        return this.f22991p;
    }

    public final s.b q0(r rVar, boolean z10, boolean z11, s sVar) {
        s.b bVar;
        s.b bVar2;
        C6496s.h(rVar, "navDeepLinkRequest");
        C6496s.h(sVar, "lastVisited");
        s.b H10 = super.H(rVar);
        s.b bVar3 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                s sVar2 = (s) it.next();
                if (!C6496s.c(sVar2, sVar)) {
                    bVar2 = sVar2.H(rVar);
                } else {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
            bVar = (s.b) C6565s.D0(arrayList);
        } else {
            bVar = null;
        }
        u A10 = A();
        if (A10 != null && z11 && !C6496s.c(A10, sVar)) {
            bVar3 = A10.q0(rVar, z10, true, this);
        }
        return (s.b) C6565s.D0(C6565s.s(H10, bVar, bVar3));
    }

    public final s.b r0(String str, boolean z10, boolean z11, s sVar) {
        s.b bVar;
        s.b bVar2;
        C6496s.h(str, "route");
        C6496s.h(sVar, "lastVisited");
        s.b I10 = I(str);
        s.b bVar3 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                s sVar2 = (s) it.next();
                if (C6496s.c(sVar2, sVar)) {
                    bVar2 = null;
                } else if (sVar2 instanceof u) {
                    bVar2 = ((u) sVar2).r0(str, true, false, this);
                } else {
                    bVar2 = sVar2.I(str);
                }
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
            bVar = (s.b) C6565s.D0(arrayList);
        } else {
            bVar = null;
        }
        u A10 = A();
        if (A10 != null && z11 && !C6496s.c(A10, sVar)) {
            bVar3 = A10.r0(str, z10, true, this);
        }
        return (s.b) C6565s.D0(C6565s.s(I10, bVar, bVar3));
    }

    public final void s0(int i10) {
        w0(i10);
    }

    public final void t0(C5978b bVar, C6798l lVar) {
        C6496s.h(bVar, "serializer");
        C6496s.h(lVar, "parseRoute");
        int b10 = C2173c.b(bVar);
        s c02 = c0(b10);
        if (c02 != null) {
            x0((String) lVar.invoke(c02));
            this.f22989n = b10;
            return;
        }
        throw new IllegalStateException(("Cannot find startDestination " + bVar.getDescriptor().i() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        s f02 = f0(this.f22991p);
        if (f02 == null) {
            f02 = c0(o0());
        }
        sb2.append(" startDestination=");
        if (f02 == null) {
            String str = this.f22991p;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f22990o;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f22989n));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(f02.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }

    public final void u0(Object obj) {
        C6496s.h(obj, "startDestRoute");
        t0(C5988l.a(kotlin.jvm.internal.O.b(obj.getClass())), new c(obj));
    }

    public String v() {
        if (x() != 0) {
            return super.v();
        }
        return "the root navigation";
    }

    public final void v0(String str) {
        C6496s.h(str, "startDestRoute");
        x0(str);
    }
}
