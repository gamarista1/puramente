package Tb;

import Lb.l;
import Tb.n;
import java.util.Collections;
import java.util.Iterator;

public class g extends c implements n {

    /* renamed from: e  reason: collision with root package name */
    private static final g f52530e = new g();

    private g() {
    }

    public static g A() {
        return f52530e;
    }

    public b B(b bVar) {
        return null;
    }

    public Object K(boolean z10) {
        return null;
    }

    public String L(n.b bVar) {
        return "";
    }

    public String M() {
        return "";
    }

    public n Y(l lVar, n nVar) {
        if (lVar.isEmpty()) {
            return nVar;
        }
        b E10 = lVar.E();
        return b0(E10, k0(E10).Y(lVar.N(), nVar));
    }

    /* renamed from: b */
    public int compareTo(n nVar) {
        if (nVar.isEmpty()) {
            return 0;
        }
        return -1;
    }

    public n b0(b bVar, n nVar) {
        if (!nVar.isEmpty() && !bVar.p()) {
            return new c().b0(bVar, nVar);
        }
        return this;
    }

    public boolean e0() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (!nVar.isEmpty() || !q().equals(nVar.q())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int getChildCount() {
        return 0;
    }

    public Object getValue() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    public Iterator m0() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        return "<Empty Node>";
    }

    public boolean w(b bVar) {
        return false;
    }

    public n q() {
        return this;
    }

    /* renamed from: C */
    public g V(n nVar) {
        return this;
    }

    public n U(l lVar) {
        return this;
    }

    public n k0(b bVar) {
        return this;
    }
}
