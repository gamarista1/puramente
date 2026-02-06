package com.google.android.gms.location;

import com.google.android.gms.common.internal.C4536s;
import java.util.Comparator;

final class W implements Comparator {
    W() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4546c cVar = (C4546c) obj;
        C4546c cVar2 = (C4546c) obj2;
        C4536s.l(cVar);
        C4536s.l(cVar2);
        int o02 = cVar.o0();
        int o03 = cVar2.o0();
        if (o02 == o03) {
            int p02 = cVar.p0();
            int p03 = cVar2.p0();
            if (p02 == p03) {
                return 0;
            }
            if (p02 < p03) {
                return -1;
            }
            return 1;
        } else if (o02 >= o03) {
            return 1;
        } else {
            return -1;
        }
    }
}
