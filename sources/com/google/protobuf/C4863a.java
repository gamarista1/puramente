package com.google.protobuf;

import com.google.protobuf.K;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.protobuf.a  reason: case insensitive filesystem */
public abstract class C4863a implements K {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C0867a implements K.a {
        protected static void m(Iterable iterable, List list) {
            C4881t.a(iterable);
            if (iterable instanceof C4887z) {
                List e10 = ((C4887z) iterable).e();
                C4887z zVar = (C4887z) list;
                int size = list.size();
                for (Object next : e10) {
                    if (next == null) {
                        String str = "Element at index " + (zVar.size() - size) + " is null.";
                        for (int size2 = zVar.size() - 1; size2 >= size; size2--) {
                            zVar.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C4868f) {
                        zVar.u((C4868f) next);
                    } else {
                        zVar.add((String) next);
                    }
                }
            } else if (iterable instanceof U) {
                list.addAll((Collection) iterable);
            } else {
                o(iterable, list);
            }
        }

        private static void o(Iterable iterable, List list) {
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

        protected static f0 p(K k10) {
            return new f0(k10);
        }
    }

    protected static void b(Iterable iterable, List list) {
        C0867a.m(iterable, list);
    }

    private String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public abstract int f(Z z10);

    public byte[] o() {
        try {
            byte[] bArr = new byte[a()];
            C4870h X10 = C4870h.X(bArr);
            i(X10);
            X10.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(m("byte array"), e10);
        }
    }
}
