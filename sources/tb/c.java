package Tb;

import Ib.c;
import Ib.h;
import Ob.l;
import Tb.n;
import com.amazon.a.a.o.b.f;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class c implements n {

    /* renamed from: d  reason: collision with root package name */
    public static Comparator f52508d = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Ib.c f52509a;

    /* renamed from: b  reason: collision with root package name */
    private final n f52510b;

    /* renamed from: c  reason: collision with root package name */
    private String f52511c;

    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.compareTo(bVar2);
        }
    }

    class b extends h.b {

        /* renamed from: a  reason: collision with root package name */
        boolean f52512a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C0806c f52513b;

        b(C0806c cVar) {
            this.f52513b = cVar;
        }

        /* renamed from: b */
        public void a(b bVar, n nVar) {
            if (!this.f52512a && bVar.compareTo(b.l()) > 0) {
                this.f52512a = true;
                this.f52513b.b(b.l(), c.this.q());
            }
            this.f52513b.b(bVar, nVar);
        }
    }

    /* renamed from: Tb.c$c  reason: collision with other inner class name */
    public static abstract class C0806c extends h.b {
        public abstract void b(b bVar, n nVar);

        /* renamed from: c */
        public void a(b bVar, n nVar) {
            b(bVar, nVar);
        }
    }

    private static class d implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator f52515a;

        public d(Iterator it) {
            this.f52515a = it;
        }

        /* renamed from: a */
        public m next() {
            Map.Entry entry = (Map.Entry) this.f52515a.next();
            return new m((b) entry.getKey(), (n) entry.getValue());
        }

        public boolean hasNext() {
            return this.f52515a.hasNext();
        }

        public void remove() {
            this.f52515a.remove();
        }
    }

    protected c() {
        this.f52511c = null;
        this.f52509a = c.a.c(f52508d);
        this.f52510b = r.a();
    }

    private static void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
    }

    private void z(StringBuilder sb2, int i10) {
        if (!this.f52509a.isEmpty() || !this.f52510b.isEmpty()) {
            sb2.append("{\n");
            Iterator it = this.f52509a.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int i11 = i10 + 2;
                a(sb2, i11);
                sb2.append(((b) entry.getKey()).b());
                sb2.append(f.f37530b);
                if (entry.getValue() instanceof c) {
                    ((c) entry.getValue()).z(sb2, i11);
                } else {
                    sb2.append(((n) entry.getValue()).toString());
                }
                sb2.append("\n");
            }
            if (!this.f52510b.isEmpty()) {
                a(sb2, i10 + 2);
                sb2.append(".priority=");
                sb2.append(this.f52510b.toString());
                sb2.append("\n");
            }
            a(sb2, i10);
            sb2.append("}");
            return;
        }
        sb2.append("{ }");
    }

    public b B(b bVar) {
        return (b) this.f52509a.k(bVar);
    }

    public Object K(boolean z10) {
        Integer k10;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = this.f52509a.iterator();
        boolean z11 = true;
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String b10 = ((b) entry.getKey()).b();
            hashMap.put(b10, ((n) entry.getValue()).K(z10));
            i10++;
            if (z11) {
                if ((b10.length() > 1 && b10.charAt(0) == '0') || (k10 = l.k(b10)) == null || k10.intValue() < 0) {
                    z11 = false;
                } else if (k10.intValue() > i11) {
                    i11 = k10.intValue();
                }
            }
        }
        if (z10 || !z11 || i11 >= i10 * 2) {
            if (z10 && !this.f52510b.isEmpty()) {
                hashMap.put(".priority", this.f52510b.getValue());
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i11 + 1);
        for (int i12 = 0; i12 <= i11; i12++) {
            arrayList.add(hashMap.get("" + i12));
        }
        return arrayList;
    }

    public String L(n.b bVar) {
        boolean z10;
        n.b bVar2 = n.b.V1;
        if (bVar == bVar2) {
            StringBuilder sb2 = new StringBuilder();
            if (!this.f52510b.isEmpty()) {
                sb2.append("priority:");
                sb2.append(this.f52510b.L(bVar2));
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            }
            ArrayList<m> arrayList = new ArrayList<>();
            Iterator it = iterator();
            loop0:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    m mVar = (m) it.next();
                    arrayList.add(mVar);
                    if (z10 || !mVar.d().q().isEmpty()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Collections.sort(arrayList, q.j());
            }
            for (m mVar2 : arrayList) {
                String M10 = mVar2.d().M();
                if (!M10.equals("")) {
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb2.append(mVar2.c().b());
                    sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                    sb2.append(M10);
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }

    public String M() {
        String str;
        if (this.f52511c == null) {
            String L10 = L(n.b.V1);
            if (L10.isEmpty()) {
                str = "";
            } else {
                str = l.i(L10);
            }
            this.f52511c = str;
        }
        return this.f52511c;
    }

    public n U(Lb.l lVar) {
        b E10 = lVar.E();
        if (E10 == null) {
            return this;
        }
        return k0(E10).U(lVar.N());
    }

    public n V(n nVar) {
        if (this.f52509a.isEmpty()) {
            return g.A();
        }
        return new c(this.f52509a, nVar);
    }

    public n Y(Lb.l lVar, n nVar) {
        b E10 = lVar.E();
        if (E10 == null) {
            return nVar;
        }
        if (!E10.p()) {
            return b0(E10, k0(E10).Y(lVar.N(), nVar));
        }
        l.f(r.b(nVar));
        return V(nVar);
    }

    /* renamed from: b */
    public int compareTo(n nVar) {
        if (isEmpty()) {
            if (nVar.isEmpty()) {
                return 0;
            }
            return -1;
        } else if (nVar.e0() || nVar.isEmpty()) {
            return 1;
        } else {
            if (nVar == n.f52549M) {
                return -1;
            }
            return 0;
        }
    }

    public n b0(b bVar, n nVar) {
        if (bVar.p()) {
            return V(nVar);
        }
        Ib.c cVar = this.f52509a;
        if (cVar.a(bVar)) {
            cVar = cVar.r(bVar);
        }
        if (!nVar.isEmpty()) {
            cVar = cVar.n(bVar, nVar);
        }
        if (cVar.isEmpty()) {
            return g.A();
        }
        return new c(cVar, this.f52510b);
    }

    public boolean e0() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r8 != r7) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r8 instanceof Tb.c
            if (r2 != 0) goto L_0x000d
            return r0
        L_0x000d:
            Tb.c r8 = (Tb.c) r8
            Tb.n r2 = r7.q()
            Tb.n r3 = r8.q()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            return r0
        L_0x001e:
            Ib.c r2 = r7.f52509a
            int r2 = r2.size()
            Ib.c r3 = r8.f52509a
            int r3 = r3.size()
            if (r2 == r3) goto L_0x002d
            return r0
        L_0x002d:
            Ib.c r2 = r7.f52509a
            java.util.Iterator r2 = r2.iterator()
            Ib.c r8 = r8.f52509a
            java.util.Iterator r8 = r8.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0072
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r3.getKey()
            Tb.b r5 = (Tb.b) r5
            java.lang.Object r6 = r4.getKey()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0071
            java.lang.Object r3 = r3.getValue()
            Tb.n r3 = (Tb.n) r3
            java.lang.Object r4 = r4.getValue()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0039
        L_0x0071:
            return r0
        L_0x0072:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x007f
            boolean r8 = r8.hasNext()
            if (r8 != 0) goto L_0x007f
            return r1
        L_0x007f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Something went wrong internally."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.c.equals(java.lang.Object):boolean");
    }

    public int getChildCount() {
        return this.f52509a.size();
    }

    public Object getValue() {
        return K(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            i10 = (((i10 * 31) + mVar.c().hashCode()) * 17) + mVar.d().hashCode();
        }
        return i10;
    }

    public boolean isEmpty() {
        return this.f52509a.isEmpty();
    }

    public Iterator iterator() {
        return new d(this.f52509a.iterator());
    }

    public n k0(b bVar) {
        if (bVar.p() && !this.f52510b.isEmpty()) {
            return this.f52510b;
        }
        if (this.f52509a.a(bVar)) {
            return (n) this.f52509a.b(bVar);
        }
        return g.A();
    }

    public void m(C0806c cVar) {
        r(cVar, false);
    }

    public Iterator m0() {
        return new d(this.f52509a.m0());
    }

    public n q() {
        return this.f52510b;
    }

    public void r(C0806c cVar, boolean z10) {
        if (!z10 || q().isEmpty()) {
            this.f52509a.m(cVar);
        } else {
            this.f52509a.m(new b(cVar));
        }
    }

    public b t() {
        return (b) this.f52509a.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        z(sb2, 0);
        return sb2.toString();
    }

    public boolean w(b bVar) {
        return !k0(bVar).isEmpty();
    }

    public b x() {
        return (b) this.f52509a.g();
    }

    protected c(Ib.c cVar, n nVar) {
        this.f52511c = null;
        if (!cVar.isEmpty() || nVar.isEmpty()) {
            this.f52510b = nVar;
            this.f52509a = cVar;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }
}
