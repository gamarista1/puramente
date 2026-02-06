package mf;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zf.C6828a;

/* renamed from: mf.i  reason: case insensitive filesystem */
public abstract class C6556i extends C6548a implements Set, C6828a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72072a = new a((DefaultConstructorMarker) null);

    /* renamed from: mf.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set set, Set set2) {
            C6496s.h(set, "c");
            C6496s.h(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection collection) {
            int i10;
            C6496s.h(collection, "c");
            int i11 = 0;
            for (Object next : collection) {
                if (next != null) {
                    i10 = next.hashCode();
                } else {
                    i10 = 0;
                }
                i11 += i10;
            }
            return i11;
        }

        private a() {
        }
    }

    protected C6556i() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f72072a.a(this, (Set) obj);
    }

    public int hashCode() {
        return f72072a.b(this);
    }
}
