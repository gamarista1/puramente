package Tb;

import Lb.l;
import java.util.Iterator;

public interface n extends Comparable, Iterable {

    /* renamed from: M  reason: collision with root package name */
    public static final c f52549M = new a();

    public enum b {
        V1,
        V2
    }

    b B(b bVar);

    Object K(boolean z10);

    String L(b bVar);

    String M();

    n U(l lVar);

    n V(n nVar);

    n Y(l lVar, n nVar);

    n b0(b bVar, n nVar);

    boolean e0();

    int getChildCount();

    Object getValue();

    boolean isEmpty();

    n k0(b bVar);

    Iterator m0();

    n q();

    boolean w(b bVar);

    class a extends c {
        a() {
        }

        /* renamed from: b */
        public int compareTo(n nVar) {
            if (nVar == this) {
                return 0;
            }
            return 1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public boolean isEmpty() {
            return false;
        }

        public n k0(b bVar) {
            if (bVar.p()) {
                return q();
            }
            return g.A();
        }

        public String toString() {
            return "<Max Node>";
        }

        public boolean w(b bVar) {
            return false;
        }

        public n q() {
            return this;
        }
    }
}
