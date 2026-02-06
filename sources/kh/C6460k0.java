package kh;

import ih.f;
import ih.h;
import ih.j;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.k0  reason: case insensitive filesystem */
public abstract class C6460k0 {
    public static final int a(f fVar, f[] fVarArr) {
        int i10;
        C6496s.h(fVar, "<this>");
        C6496s.h(fVarArr, "typeParams");
        int hashCode = (fVar.i().hashCode() * 31) + Arrays.hashCode(fVarArr);
        Iterable<f> a10 = h.a(fVar);
        Iterator it = a10.iterator();
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i14 = i12 * 31;
            String i15 = ((f) it.next()).i();
            if (i15 != null) {
                i13 = i15.hashCode();
            }
            i12 = i14 + i13;
        }
        for (f h10 : a10) {
            int i16 = i11 * 31;
            j h11 = h10.h();
            if (h11 != null) {
                i10 = h11.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i16 + i10;
        }
        return (((hashCode * 31) + i12) * 31) + i11;
    }
}
