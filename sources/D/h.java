package D;

import java.util.List;
import mf.C6565s;

public abstract class h {
    public static final s a(List list, t tVar, List list2, int i10, int i11, int i12) {
        int i13;
        int i14;
        List list3 = list;
        List list4 = list2;
        int i15 = i10;
        int index = ((s) C6565s.o0(list)).getIndex();
        int size = list2.size();
        int i16 = -1;
        int i17 = -1;
        int i18 = 0;
        while (i18 < size && ((Number) list4.get(i18)).intValue() <= index) {
            i17 = ((Number) list4.get(i18)).intValue();
            i18++;
            if (i18 < 0 || i18 > C6565s.p(list2)) {
                i14 = -1;
            } else {
                i14 = list4.get(i18);
            }
            i16 = ((Number) i14).intValue();
        }
        int size2 = list.size();
        int i19 = Integer.MIN_VALUE;
        int i20 = Integer.MIN_VALUE;
        int i21 = -1;
        for (int i22 = 0; i22 < size2; i22++) {
            s sVar = (s) list3.get(i22);
            if (sVar.getIndex() == i17) {
                i19 = sVar.a();
                i21 = i22;
            } else if (sVar.getIndex() == i16) {
                i20 = sVar.a();
            }
        }
        if (i17 == -1) {
            return null;
        }
        s e10 = t.e(tVar, i17, 0, 2, (Object) null);
        e10.e(true);
        if (i19 != Integer.MIN_VALUE) {
            i13 = Math.max(-i15, i19);
        } else {
            i13 = -i15;
        }
        if (i20 != Integer.MIN_VALUE) {
            i13 = Math.min(i13, i20 - e10.getSize());
        }
        e10.r(i13, i11, i12);
        if (i21 != -1) {
            list3.set(i21, e10);
        } else {
            list3.add(0, e10);
        }
        return e10;
    }
}
