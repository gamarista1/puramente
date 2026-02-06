package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a  reason: case insensitive filesystem */
public abstract class C1728a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0289a implements O.a {
        protected static void e(Iterable iterable, List list) {
            C1751y.a(iterable);
            if (iterable instanceof D) {
                List e10 = ((D) iterable).e();
                D d10 = (D) list;
                int size = list.size();
                for (Object next : e10) {
                    if (next == null) {
                        String str = "Element at index " + (d10.size() - size) + " is null.";
                        for (int size2 = d10.size() - 1; size2 >= size; size2--) {
                            d10.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C1734g) {
                        d10.X((C1734g) next);
                    } else {
                        d10.add((String) next);
                    }
                }
            } else if (iterable instanceof Y) {
                list.addAll((Collection) iterable);
            } else {
                i(iterable, list);
            }
        }

        private static void i(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        protected static k0 l(O o10) {
            return new k0(o10);
        }

        /* access modifiers changed from: protected */
        public abstract C0289a j(C1728a aVar);

        /* renamed from: k */
        public C0289a v(O o10) {
            if (d().getClass().isInstance(o10)) {
                return j((C1728a) o10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static void b(Iterable iterable, List list) {
        C0289a.e(iterable, list);
    }

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public int f(e0 e0Var) {
        int e10 = e();
        if (e10 != -1) {
            return e10;
        }
        int g10 = e0Var.g(this);
        j(g10);
        return g10;
    }

    /* access modifiers changed from: package-private */
    public k0 i() {
        return new k0(this);
    }

    /* access modifiers changed from: package-private */
    public abstract void j(int i10);

    public void k(OutputStream outputStream) {
        C1737j Z10 = C1737j.Z(outputStream, C1737j.C(a()));
        h(Z10);
        Z10.W();
    }
}
