package Fg;

import Gg.g;
import Jg.h;
import Lf.i;
import Of.C5490h;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import pf.C6632a;
import yf.C6798l;
import yg.C6812k;
import yg.C6825x;

public final class Q implements v0, h {

    /* renamed from: a  reason: collision with root package name */
    private S f62967a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashSet f62968b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62969c;

    public static final class a implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f62970a;

        public a(C6798l lVar) {
            this.f62970a = lVar;
        }

        public final int compare(Object obj, Object obj2) {
            S s10 = (S) obj;
            C6798l lVar = this.f62970a;
            C6496s.e(s10);
            String obj3 = lVar.invoke(s10).toString();
            S s11 = (S) obj2;
            C6798l lVar2 = this.f62970a;
            C6496s.e(s11);
            return C6632a.d(obj3, lVar2.invoke(s11).toString());
        }
    }

    public Q(Collection collection) {
        C6496s.h(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.f62968b = linkedHashSet;
        this.f62969c = linkedHashSet.hashCode();
    }

    /* access modifiers changed from: private */
    public static final C5366d0 g(Q q10, g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return q10.n(gVar).f();
    }

    public static /* synthetic */ String j(Q q10, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = O.f62965a;
        }
        return q10.i(lVar);
    }

    /* access modifiers changed from: private */
    public static final String k(S s10) {
        C6496s.h(s10, "it");
        return s10.toString();
    }

    /* access modifiers changed from: private */
    public static final CharSequence q(C6798l lVar, S s10) {
        C6496s.e(s10);
        return lVar.invoke(s10).toString();
    }

    public final C6812k e() {
        return C6825x.f73967d.a("member scope for intersection type", this.f62968b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        return C6496s.c(this.f62968b, ((Q) obj).f62968b);
    }

    public final C5366d0 f() {
        return V.n(r0.f63046b.j(), this, C6565s.n(), false, e(), new P(this));
    }

    public List getParameters() {
        return C6565s.n();
    }

    public final S h() {
        return this.f62967a;
    }

    public int hashCode() {
        return this.f62969c;
    }

    public final String i(C6798l lVar) {
        C6496s.h(lVar, "getProperTypeRelatedToStringify");
        return C6565s.x0(C6565s.U0(this.f62968b, new a(lVar)), " & ", "{", "}", 0, (CharSequence) null, new N(lVar), 24, (Object) null);
    }

    public Collection l() {
        return this.f62968b;
    }

    public i m() {
        i m10 = ((S) this.f62968b.iterator().next()).N0().m();
        C6496s.g(m10, "getBuiltIns(...)");
        return m10;
    }

    public C5490h o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: Fg.Q} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7, types: [Fg.S] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Fg.Q n(Gg.g r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.util.Collection r0 = r4.l()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = mf.C6565s.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x001b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r2 = r0.next()
            Fg.S r2 = (Fg.S) r2
            Fg.S r2 = r2.P0(r5)
            r1.add(r2)
            r2 = 1
            goto L_0x001b
        L_0x0030:
            r0 = 0
            if (r2 != 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            Fg.S r2 = r4.h()
            if (r2 == 0) goto L_0x003e
            Fg.S r0 = r2.P0(r5)
        L_0x003e:
            Fg.Q r5 = new Fg.Q
            r5.<init>(r1)
            Fg.Q r0 = r5.s(r0)
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            r0 = r4
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.Q.n(Gg.g):Fg.Q");
    }

    public final Q s(S s10) {
        return new Q(this.f62968b, s10);
    }

    public String toString() {
        return j(this, (C6798l) null, 1, (Object) null);
    }

    private Q(Collection collection, S s10) {
        this(collection);
        this.f62967a = s10;
    }
}
