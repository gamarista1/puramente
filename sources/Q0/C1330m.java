package Q0;

import Q0.C1321d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Q0.m  reason: case insensitive filesystem */
public abstract class C1330m {
    /* access modifiers changed from: private */
    public static final List b(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C1321d.c cVar = (C1321d.c) obj;
            if (C1322e.l(i10, i11, cVar.h(), cVar.f())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C1321d.c cVar2 = (C1321d.c) arrayList.get(i13);
            if (i10 > cVar2.h() || cVar2.f() > i11) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C1321d.c(cVar2.g(), cVar2.h() - i10, cVar2.f() - i10));
        }
        return arrayList2;
    }
}
