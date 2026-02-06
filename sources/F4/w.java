package F4;

import A4.d;
import A4.h;
import D4.e;
import G4.c;
import H4.f;
import H4.l;
import android.graphics.Rect;
import androidx.collection.C1607v;
import androidx.collection.Z;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u4.C4071k;
import u4.O;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30737a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static c.a f30738b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30739c = c.a.a(AttributeType.LIST);

    /* renamed from: d  reason: collision with root package name */
    private static final c.a f30740d = c.a.a("cm", "tm", "dr");

    public static C4071k a(c cVar) {
        HashMap hashMap;
        ArrayList arrayList;
        c cVar2 = cVar;
        float e10 = l.e();
        C1607v vVar = new C1607v();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        Z z10 = new Z();
        C4071k kVar = new C4071k();
        cVar.f();
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar.q()) {
            switch (cVar2.T(f30737a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i11 = cVar.y();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i10 = cVar.y();
                    continue;
                case 2:
                    HashMap hashMap7 = hashMap4;
                    ArrayList arrayList6 = arrayList3;
                    f10 = (float) cVar.v();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) cVar.v()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) cVar.v();
                    break;
                case 5:
                    String[] split = cVar.F().split("\\.");
                    if (l.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        kVar.a("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    e(cVar2, kVar, arrayList2, vVar);
                    continue;
                case 7:
                    b(cVar2, kVar, hashMap2, hashMap3);
                    continue;
                case 8:
                    d(cVar2, hashMap4);
                    continue;
                case 9:
                    c(cVar2, kVar, z10);
                    continue;
                case 10:
                    f(cVar2, arrayList3);
                    continue;
                default:
                    cVar.U();
                    cVar.V();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        C4071k kVar2 = kVar;
        kVar.s(new Rect(0, 0, (int) (((float) i11) * e10), (int) (((float) i10) * e10)), f10, f11, f12, arrayList2, vVar, hashMap2, hashMap3, l.e(), z10, hashMap4, arrayList3, i11, i10);
        return kVar2;
    }

    private static void b(c cVar, C4071k kVar, Map map, Map map2) {
        cVar.b();
        while (cVar.q()) {
            ArrayList arrayList = new ArrayList();
            C1607v vVar = new C1607v();
            cVar.f();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.q()) {
                int T10 = cVar.T(f30738b);
                if (T10 == 0) {
                    str = cVar.F();
                } else if (T10 == 1) {
                    cVar.b();
                    while (cVar.q()) {
                        e a10 = v.a(cVar, kVar);
                        vVar.j(a10.e(), a10);
                        arrayList.add(a10);
                    }
                    cVar.n();
                } else if (T10 == 2) {
                    i10 = cVar.y();
                } else if (T10 == 3) {
                    i11 = cVar.y();
                } else if (T10 == 4) {
                    str2 = cVar.F();
                } else if (T10 != 5) {
                    cVar.U();
                    cVar.V();
                } else {
                    str3 = cVar.F();
                }
            }
            cVar.o();
            if (str2 != null) {
                O o10 = new O(i10, i11, str, str2, str3);
                map2.put(o10.e(), o10);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.n();
    }

    private static void c(c cVar, C4071k kVar, Z z10) {
        cVar.b();
        while (cVar.q()) {
            d a10 = C3010m.a(cVar, kVar);
            z10.k(a10.hashCode(), a10);
        }
        cVar.n();
    }

    private static void d(c cVar, Map map) {
        cVar.f();
        while (cVar.q()) {
            if (cVar.T(f30739c) != 0) {
                cVar.U();
                cVar.V();
            } else {
                cVar.b();
                while (cVar.q()) {
                    A4.c a10 = C3011n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.n();
            }
        }
        cVar.o();
    }

    private static void e(c cVar, C4071k kVar, List list, C1607v vVar) {
        cVar.b();
        int i10 = 0;
        while (cVar.q()) {
            e a10 = v.a(cVar, kVar);
            if (a10.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(a10);
            vVar.j(a10.e(), a10);
            if (i10 > 4) {
                f.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.n();
    }

    private static void f(c cVar, List list) {
        cVar.b();
        while (cVar.q()) {
            cVar.f();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (cVar.q()) {
                int T10 = cVar.T(f30740d);
                if (T10 == 0) {
                    str = cVar.F();
                } else if (T10 == 1) {
                    f10 = (float) cVar.v();
                } else if (T10 != 2) {
                    cVar.U();
                    cVar.V();
                } else {
                    f11 = (float) cVar.v();
                }
            }
            cVar.o();
            list.add(new h(str, f10, f11));
        }
        cVar.n();
    }
}
