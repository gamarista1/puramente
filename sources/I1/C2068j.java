package i1;

import j1.i;
import j1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: i1.j  reason: case insensitive filesystem */
public class C2068j extends C2063e implements C2067i {

    /* renamed from: V0  reason: collision with root package name */
    public C2063e[] f22032V0 = new C2063e[4];

    /* renamed from: W0  reason: collision with root package name */
    public int f22033W0 = 0;

    public void a(C2063e eVar) {
        if (eVar != this && eVar != null) {
            int i10 = this.f22033W0 + 1;
            C2063e[] eVarArr = this.f22032V0;
            if (i10 > eVarArr.length) {
                this.f22032V0 = (C2063e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            }
            C2063e[] eVarArr2 = this.f22032V0;
            int i11 = this.f22033W0;
            eVarArr2[i11] = eVar;
            this.f22033W0 = i11 + 1;
        }
    }

    public void c() {
        this.f22033W0 = 0;
        Arrays.fill(this.f22032V0, (Object) null);
    }

    public void n(C2063e eVar, HashMap hashMap) {
        super.n(eVar, hashMap);
        C2068j jVar = (C2068j) eVar;
        this.f22033W0 = 0;
        int i10 = jVar.f22033W0;
        for (int i11 = 0; i11 < i10; i11++) {
            a((C2063e) hashMap.get(jVar.f22032V0[i11]));
        }
    }

    public void w1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f22033W0; i11++) {
            oVar.a(this.f22032V0[i11]);
        }
        for (int i12 = 0; i12 < this.f22033W0; i12++) {
            i.a(this.f22032V0[i12], i10, arrayList, oVar);
        }
    }

    public int x1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f22033W0; i13++) {
            C2063e eVar = this.f22032V0[i13];
            if (i10 == 0 && (i12 = eVar.f21901S0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f21903T0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    public void b(C2064f fVar) {
    }
}
