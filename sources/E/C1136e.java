package E;

import E.C1135d;
import a0.C1538b;

/* renamed from: E.e  reason: case insensitive filesystem */
public abstract class C1136e {
    /* access modifiers changed from: private */
    public static final int b(C1538b bVar, int i10) {
        int q10 = bVar.q() - 1;
        int i11 = 0;
        while (i11 < q10) {
            int i12 = ((q10 - i11) / 2) + i11;
            int b10 = ((C1135d.a) bVar.p()[i12]).b();
            if (b10 == i10) {
                return i12;
            }
            if (b10 < i10) {
                i11 = i12 + 1;
                if (i10 < ((C1135d.a) bVar.p()[i11]).b()) {
                    return i12;
                }
            } else {
                q10 = i12 - 1;
            }
        }
        return i11;
    }
}
