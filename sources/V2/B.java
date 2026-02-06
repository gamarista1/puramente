package v2;

import com.google.common.collect.C4770v;
import f2.I;
import f2.L;
import java.util.Arrays;
import java.util.List;
import t2.j0;
import v2.z;

public abstract class B {
    public static L a(z.a aVar, List[] listArr) {
        boolean z10;
        boolean z11;
        z.a aVar2 = aVar;
        C4770v.a aVar3 = new C4770v.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            j0 f10 = aVar2.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < f10.f26271a; i11++) {
                I b10 = f10.b(i11);
                if (aVar2.a(i10, i11, false) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = b10.f19785a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f19785a; i13++) {
                    iArr[i13] = aVar2.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        C2750A a10 = (C2750A) list.get(i14);
                        if (a10.g().equals(b10) && a10.f(i13) != -1) {
                            z11 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z11;
                }
                aVar3.a(new L.a(b10, z10, iArr, zArr));
            }
        }
        j0 h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f26271a; i15++) {
            I b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f19785a];
            Arrays.fill(iArr2, 0);
            aVar3.a(new L.a(b11, false, iArr2, new boolean[b11.f19785a]));
        }
        return new L(aVar3.k());
    }

    public static L b(z.a aVar, C2750A[] aArr) {
        C4770v vVar;
        List[] listArr = new List[aArr.length];
        for (int i10 = 0; i10 < aArr.length; i10++) {
            C2750A a10 = aArr[i10];
            if (a10 != null) {
                vVar = C4770v.H(a10);
            } else {
                vVar = C4770v.E();
            }
            listArr[i10] = vVar;
        }
        return a(aVar, listArr);
    }
}
