package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.collect.o  reason: case insensitive filesystem */
final class C4764o extends O implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    final Comparator[] f56738a;

    C4764o(Comparator comparator, Comparator comparator2) {
        this.f56738a = new Comparator[]{comparator, comparator2};
    }

    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f56738a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4764o) {
            return Arrays.equals(this.f56738a, ((C4764o) obj).f56738a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f56738a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f56738a) + ")";
    }
}
