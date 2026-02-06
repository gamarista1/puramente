package kh;

import gh.C5979c;
import ih.f;
import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.i0  reason: case insensitive filesystem */
public abstract class C6456i0 {
    public static final void a(int i10, int i11, f fVar) {
        C6496s.h(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(fVar.e(i13));
            }
            i12 >>>= 1;
        }
        throw new C5979c(arrayList, fVar.i());
    }
}
