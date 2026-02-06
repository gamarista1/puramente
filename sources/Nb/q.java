package nb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public abstract class q {

    private static class b implements p, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final List f61099a;

        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f61099a.size(); i10++) {
                if (!((p) this.f61099a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f61099a.equals(((b) obj).f61099a);
            }
            return false;
        }

        public int hashCode() {
            return this.f61099a.hashCode() + 306654252;
        }

        public String toString() {
            return q.d("and", this.f61099a);
        }

        private b(List list) {
            this.f61099a = list;
        }
    }

    public static p b(p pVar, p pVar2) {
        return new b(c((p) o.j(pVar), (p) o.j(pVar2)));
    }

    private static List c(p pVar, p pVar2) {
        return Arrays.asList(new p[]{pVar, pVar2});
    }

    /* access modifiers changed from: private */
    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object next : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(next);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
