package ga;

import N9.T;
import N9.V;
import android.os.SystemClock;
import com.google.common.collect.C4770v;
import ga.t;
import ia.A;
import java.util.Arrays;
import java.util.List;
import k9.s1;

public abstract class z {
    public static s1 a(t.a aVar, u[] uVarArr) {
        C4770v vVar;
        List[] listArr = new List[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null) {
                vVar = C4770v.H(uVar);
            } else {
                vVar = C4770v.E();
            }
            listArr[i10] = vVar;
        }
        return b(aVar, listArr);
    }

    public static s1 b(t.a aVar, List[] listArr) {
        boolean z10;
        boolean z11;
        t.a aVar2 = aVar;
        C4770v.a aVar3 = new C4770v.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            V f10 = aVar2.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < f10.f33196a; i11++) {
                T b10 = f10.b(i11);
                if (aVar2.a(i10, i11, false) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i12 = b10.f33189a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < b10.f33189a; i13++) {
                    iArr[i13] = aVar2.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        u uVar = (u) list.get(i14);
                        if (uVar.g().equals(b10) && uVar.f(i13) != -1) {
                            z11 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z11;
                }
                aVar3.a(new s1.a(b10, z10, iArr, zArr));
            }
        }
        V h10 = aVar.h();
        for (int i15 = 0; i15 < h10.f33196a; i15++) {
            T b11 = h10.b(i15);
            int[] iArr2 = new int[b11.f33189a];
            Arrays.fill(iArr2, 0);
            aVar3.a(new s1.a(b11, false, iArr2, new boolean[b11.f33189a]));
        }
        return new s1(aVar3.k());
    }

    public static A.a c(r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.p(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new A.a(1, 0, length, i10);
    }
}
