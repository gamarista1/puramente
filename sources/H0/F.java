package H0;

import c1.c;
import java.util.ArrayList;
import java.util.List;

public interface F {
    int a(C1194o oVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1189j((C1193n) list.get(i11), C1195p.Min, C1196q.Height));
        }
        return j(new r(oVar, oVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    int b(C1194o oVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1189j((C1193n) list.get(i11), C1195p.Max, C1196q.Width));
        }
        return j(new r(oVar, oVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).e();
    }

    int g(C1194o oVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1189j((C1193n) list.get(i11), C1195p.Max, C1196q.Height));
        }
        return j(new r(oVar, oVar.getLayoutDirection()), arrayList, c.b(0, i10, 0, 0, 13, (Object) null)).d();
    }

    int h(C1194o oVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1189j((C1193n) list.get(i11), C1195p.Min, C1196q.Width));
        }
        return j(new r(oVar, oVar.getLayoutDirection()), arrayList, c.b(0, 0, 0, i10, 7, (Object) null)).e();
    }

    G j(H h10, List list, long j10);
}
