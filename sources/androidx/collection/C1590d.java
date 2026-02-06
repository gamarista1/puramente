package androidx.collection;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.C6496s;
import u.C2664a;

/* renamed from: androidx.collection.d  reason: case insensitive filesystem */
public abstract class C1590d {
    public static final void a(C1588b bVar, int i10) {
        C6496s.h(bVar, "<this>");
        bVar.v(new int[i10]);
        bVar.t(new Object[i10]);
    }

    public static final int b(C1588b bVar, int i10) {
        C6496s.h(bVar, "<this>");
        try {
            return C2664a.a(bVar.g(), bVar.n(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C1588b bVar, Object obj, int i10) {
        C6496s.h(bVar, "<this>");
        int n10 = bVar.n();
        if (n10 == 0) {
            return -1;
        }
        int b10 = b(bVar, i10);
        if (b10 < 0 || C6496s.c(obj, bVar.b()[b10])) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < n10 && bVar.g()[i11] == i10) {
            if (C6496s.c(obj, bVar.b()[i11])) {
                return i11;
            }
            i11++;
        }
        int i12 = b10 - 1;
        while (i12 >= 0 && bVar.g()[i12] == i10) {
            if (C6496s.c(obj, bVar.b()[i12])) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public static final int d(C1588b bVar) {
        C6496s.h(bVar, "<this>");
        return c(bVar, (Object) null, 0);
    }
}
